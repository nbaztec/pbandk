import com.tschuchort.compiletesting.KotlinCompilation
import com.tschuchort.compiletesting.KotlinCompilation.ExitCode
import com.tschuchort.compiletesting.SourceFile
import pbandk.decodeFromByteArray
import pbandk.gen.pb.CodeGeneratorRequest
import pbandk.gen.runGenerator
import pbandk.wkt.FileDescriptorProto
import pbandk.wkt.FileDescriptorSet
import java.io.File
import java.lang.ProcessBuilder.Redirect
import java.net.URL
import java.util.concurrent.TimeUnit
import kotlin.test.Test
import kotlin.test.assertEquals


class CodeGeneratorTest {
    @Test
    fun testSimple() {
        val result = compileProto("simple.proto")

        assertEquals(result.exitCode, ExitCode.OK)
        val message1Clazz = result.classLoader.loadClass("foobar.Message1")
        val message2Clazz = result.classLoader.loadClass("foobar.Message2")
        message1Clazz.getDeclaredField("intVal")
        message2Clazz.getDeclaredField("strVal")
    }

    @Test
    fun testOneOf_SameNameField() {
        val result = compileProto("oneof_same_name.proto")

        assertEquals(result.exitCode, ExitCode.OK)
        val valueClazz = result.classLoader.loadClass("foobar.Value")
        valueClazz.classLoader.loadClass("foobar.Value\$Value")
    }

    companion object {
        const val PROTOC_PLUGIN_PATH = "../jvm/build/install/protoc-gen-kotlin/bin/protoc-gen-kotlin"
        const val PROTO_PATH = "src/jvmTest/resources/protos"
        const val DESCRIPTOR_SET_OUT = "build/tmp/fileDescriptor.protoset"
        private const val DOWNLOAD_PROTOC_VERSION = "3.10.1"

        val protoc: String = (System.getProperty("protoc.path")?.let { "$it/bin/protoc" } ?: "protoc")
            .let { protoc ->
                try {
                    // try executing the protoc binary, this code throws an exception if it cannot be found
                    ProcessBuilder(protoc).start()
                    protoc
                } catch (e: Exception) {
                    downloadedProtoc()
                }
            }

        private fun downloadedProtoc() = try {
            val filename = "protoc-$DOWNLOAD_PROTOC_VERSION-${getOS()}-${getArch()}.exe"
            val protocTemp = File.createTempFile("protoc", "tmp")
            val protoUrl =
                URL("https://repo1.maven.org/maven2/com/google/protobuf/protoc/$DOWNLOAD_PROTOC_VERSION/$filename")
            protocTemp.writeBytes(protoUrl.readBytes())
            protocTemp.setExecutable(true)
            protocTemp.absolutePath
        } catch (e: Exception) {
            throw Exception("failed to download protoc version $DOWNLOAD_PROTOC_VERSION", e)
        }

        private fun getOS() = System.getProperty("os.name").toLowerCase().let {
            when {
                it.contains("windows") -> "windows"
                it.contains("mac os x") || it.contains("darwin") || it.contains("osx") -> "osx"
                else -> "linux"
            }
        }

        private fun getArch() = System.getProperty("os.arch").toLowerCase().let {
            when {
                it.contains("amd64") || it.contains("x86_64") -> "x86_64"
                else -> "x86_32"
            }
        }
    }

    private fun getFileDescriptorProto(protoFile: String): List<FileDescriptorProto> {
        val plugin = File(PROTOC_PLUGIN_PATH + ".bat".takeIf {
            getOS() == "windows"
        }.orEmpty())

        val proc = ProcessBuilder(
            protoc,
            "--proto_path=$PROTO_PATH",
            "--plugin=protoc-gen-kotlin=${plugin.absoluteFile}",
            "--descriptor_set_out=$DESCRIPTOR_SET_OUT",
            protoFile
        )
            .redirectOutput(Redirect.PIPE)
            .redirectError(Redirect.PIPE)
            .start()
            .also { it.waitFor(10, TimeUnit.SECONDS) }

        if (proc.exitValue() != 0) {
            throw IllegalArgumentException("failed generating proto descriptor set for '$protoFile'")
        }

        return FileDescriptorSet.decodeFromByteArray(File(DESCRIPTOR_SET_OUT).inputStream().readAllBytes()).file
    }

    private fun compileProto(inputProto: String): KotlinCompilation.Result {
        val gen = runGenerator(
            CodeGeneratorRequest(
                fileToGenerate = listOf(inputProto),
                protoFile = getFileDescriptorProto(inputProto)
            )
        )

        val kotlinSource = SourceFile.kotlin("test.kt", gen.file.first().content!!)
        return KotlinCompilation().apply {
            this.kaptSourceDir
            sources = listOf(kotlinSource)
            inheritClassPath = true
            messageOutputStream = System.out
        }.compile()
    }
}