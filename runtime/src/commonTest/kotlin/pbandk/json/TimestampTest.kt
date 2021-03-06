package pbandk.json

import kotlinx.serialization.json.json
import pbandk.testpb.TestAllTypesProto3
import pbandk.wkt.Timestamp
import kotlin.test.Test
import kotlin.test.assertEquals

class TimestampTest {
    @Test
    fun testTimestampField() {
        val json = json { "optionalTimestamp" to "0001-01-01T00:00:00Z" }.toString()
        val expectedTimestamp = Timestamp(seconds = -62135596800, nanos = 0)

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedTimestamp, testAllTypesProto3.optionalTimestamp)
    }

    @Test
    fun testTimestampField_withNanos() {
        val json = json { "optionalTimestamp" to "1993-02-10T00:00:00.000Z" }.toString()
        val expectedTimestamp = Timestamp(seconds = 729302400, nanos = 0)

        val testAllTypesProto3 = TestAllTypesProto3.decodeFromJsonString(json)
        assertEquals(expectedTimestamp, testAllTypesProto3.optionalTimestamp)
    }

}