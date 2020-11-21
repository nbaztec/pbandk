@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

sealed class HugeEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is HugeEnum && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "HugeEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

    object HE0 : HugeEnum(0, "HUGE_ENUM_HE0")
    object HE1000 : HugeEnum(1000, "HUGE_ENUM_HE1000")
    object HE1001 : HugeEnum(1001, "HUGE_ENUM_HE1001")
    object HE1002 : HugeEnum(1002, "HUGE_ENUM_HE1002")
    object HE1003 : HugeEnum(1003, "HUGE_ENUM_HE1003")
    object HE1004 : HugeEnum(1004, "HUGE_ENUM_HE1004")
    object HE1005 : HugeEnum(1005, "HUGE_ENUM_HE1005")
    object HE1006 : HugeEnum(1006, "HUGE_ENUM_HE1006")
    object HE1007 : HugeEnum(1007, "HUGE_ENUM_HE1007")
    object HE1008 : HugeEnum(1008, "HUGE_ENUM_HE1008")
    object HE1009 : HugeEnum(1009, "HUGE_ENUM_HE1009")
    object HE1010 : HugeEnum(1010, "HUGE_ENUM_HE1010")
    object HE1011 : HugeEnum(1011, "HUGE_ENUM_HE1011")
    object HE1012 : HugeEnum(1012, "HUGE_ENUM_HE1012")
    object HE1013 : HugeEnum(1013, "HUGE_ENUM_HE1013")
    object HE1014 : HugeEnum(1014, "HUGE_ENUM_HE1014")
    object HE1015 : HugeEnum(1015, "HUGE_ENUM_HE1015")
    object HE1016 : HugeEnum(1016, "HUGE_ENUM_HE1016")
    object HE1017 : HugeEnum(1017, "HUGE_ENUM_HE1017")
    object HE1018 : HugeEnum(1018, "HUGE_ENUM_HE1018")
    object HE1019 : HugeEnum(1019, "HUGE_ENUM_HE1019")
    object HE1020 : HugeEnum(1020, "HUGE_ENUM_HE1020")
    object HE1021 : HugeEnum(1021, "HUGE_ENUM_HE1021")
    object HE1022 : HugeEnum(1022, "HUGE_ENUM_HE1022")
    object HE1023 : HugeEnum(1023, "HUGE_ENUM_HE1023")
    object HE1024 : HugeEnum(1024, "HUGE_ENUM_HE1024")
    object HE1025 : HugeEnum(1025, "HUGE_ENUM_HE1025")
    object HE1026 : HugeEnum(1026, "HUGE_ENUM_HE1026")
    object HE1027 : HugeEnum(1027, "HUGE_ENUM_HE1027")
    object HE1028 : HugeEnum(1028, "HUGE_ENUM_HE1028")
    object HE1029 : HugeEnum(1029, "HUGE_ENUM_HE1029")
    object HE1030 : HugeEnum(1030, "HUGE_ENUM_HE1030")
    object HE1031 : HugeEnum(1031, "HUGE_ENUM_HE1031")
    object HE1032 : HugeEnum(1032, "HUGE_ENUM_HE1032")
    object HE1033 : HugeEnum(1033, "HUGE_ENUM_HE1033")
    object HE1034 : HugeEnum(1034, "HUGE_ENUM_HE1034")
    object HE1035 : HugeEnum(1035, "HUGE_ENUM_HE1035")
    object HE1036 : HugeEnum(1036, "HUGE_ENUM_HE1036")
    object HE1037 : HugeEnum(1037, "HUGE_ENUM_HE1037")
    object HE1038 : HugeEnum(1038, "HUGE_ENUM_HE1038")
    object HE1039 : HugeEnum(1039, "HUGE_ENUM_HE1039")
    object HE1040 : HugeEnum(1040, "HUGE_ENUM_HE1040")
    object HE1041 : HugeEnum(1041, "HUGE_ENUM_HE1041")
    object HE1042 : HugeEnum(1042, "HUGE_ENUM_HE1042")
    object HE1043 : HugeEnum(1043, "HUGE_ENUM_HE1043")
    object HE1044 : HugeEnum(1044, "HUGE_ENUM_HE1044")
    object HE1045 : HugeEnum(1045, "HUGE_ENUM_HE1045")
    object HE1046 : HugeEnum(1046, "HUGE_ENUM_HE1046")
    object HE1047 : HugeEnum(1047, "HUGE_ENUM_HE1047")
    object HE1048 : HugeEnum(1048, "HUGE_ENUM_HE1048")
    object HE1049 : HugeEnum(1049, "HUGE_ENUM_HE1049")
    object HE1050 : HugeEnum(1050, "HUGE_ENUM_HE1050")
    object HE1051 : HugeEnum(1051, "HUGE_ENUM_HE1051")
    object HE1052 : HugeEnum(1052, "HUGE_ENUM_HE1052")
    object HE1053 : HugeEnum(1053, "HUGE_ENUM_HE1053")
    object HE1054 : HugeEnum(1054, "HUGE_ENUM_HE1054")
    object HE1055 : HugeEnum(1055, "HUGE_ENUM_HE1055")
    object HE1056 : HugeEnum(1056, "HUGE_ENUM_HE1056")
    object HE1057 : HugeEnum(1057, "HUGE_ENUM_HE1057")
    object HE1058 : HugeEnum(1058, "HUGE_ENUM_HE1058")
    object HE1059 : HugeEnum(1059, "HUGE_ENUM_HE1059")
    object HE1060 : HugeEnum(1060, "HUGE_ENUM_HE1060")
    object HE1061 : HugeEnum(1061, "HUGE_ENUM_HE1061")
    object HE1062 : HugeEnum(1062, "HUGE_ENUM_HE1062")
    object HE1063 : HugeEnum(1063, "HUGE_ENUM_HE1063")
    object HE1064 : HugeEnum(1064, "HUGE_ENUM_HE1064")
    object HE1065 : HugeEnum(1065, "HUGE_ENUM_HE1065")
    object HE1066 : HugeEnum(1066, "HUGE_ENUM_HE1066")
    object HE1067 : HugeEnum(1067, "HUGE_ENUM_HE1067")
    object HE1068 : HugeEnum(1068, "HUGE_ENUM_HE1068")
    object HE1069 : HugeEnum(1069, "HUGE_ENUM_HE1069")
    object HE1070 : HugeEnum(1070, "HUGE_ENUM_HE1070")
    object HE1071 : HugeEnum(1071, "HUGE_ENUM_HE1071")
    object HE1072 : HugeEnum(1072, "HUGE_ENUM_HE1072")
    object HE1073 : HugeEnum(1073, "HUGE_ENUM_HE1073")
    object HE1074 : HugeEnum(1074, "HUGE_ENUM_HE1074")
    object HE1075 : HugeEnum(1075, "HUGE_ENUM_HE1075")
    object HE1076 : HugeEnum(1076, "HUGE_ENUM_HE1076")
    object HE1077 : HugeEnum(1077, "HUGE_ENUM_HE1077")
    object HE1078 : HugeEnum(1078, "HUGE_ENUM_HE1078")
    object HE1079 : HugeEnum(1079, "HUGE_ENUM_HE1079")
    object HE1080 : HugeEnum(1080, "HUGE_ENUM_HE1080")
    object HE1081 : HugeEnum(1081, "HUGE_ENUM_HE1081")
    object HE1082 : HugeEnum(1082, "HUGE_ENUM_HE1082")
    object HE1083 : HugeEnum(1083, "HUGE_ENUM_HE1083")
    object HE1084 : HugeEnum(1084, "HUGE_ENUM_HE1084")
    object HE1085 : HugeEnum(1085, "HUGE_ENUM_HE1085")
    object HE1086 : HugeEnum(1086, "HUGE_ENUM_HE1086")
    object HE1087 : HugeEnum(1087, "HUGE_ENUM_HE1087")
    object HE1088 : HugeEnum(1088, "HUGE_ENUM_HE1088")
    object HE1089 : HugeEnum(1089, "HUGE_ENUM_HE1089")
    object HE1090 : HugeEnum(1090, "HUGE_ENUM_HE1090")
    object HE1091 : HugeEnum(1091, "HUGE_ENUM_HE1091")
    object HE1092 : HugeEnum(1092, "HUGE_ENUM_HE1092")
    object HE1093 : HugeEnum(1093, "HUGE_ENUM_HE1093")
    object HE1094 : HugeEnum(1094, "HUGE_ENUM_HE1094")
    object HE1095 : HugeEnum(1095, "HUGE_ENUM_HE1095")
    object HE1096 : HugeEnum(1096, "HUGE_ENUM_HE1096")
    object HE1097 : HugeEnum(1097, "HUGE_ENUM_HE1097")
    object HE1098 : HugeEnum(1098, "HUGE_ENUM_HE1098")
    object HE1099 : HugeEnum(1099, "HUGE_ENUM_HE1099")
    object HE1100 : HugeEnum(1100, "HUGE_ENUM_HE1100")
    object HE1101 : HugeEnum(1101, "HUGE_ENUM_HE1101")
    object HE1102 : HugeEnum(1102, "HUGE_ENUM_HE1102")
    object HE1103 : HugeEnum(1103, "HUGE_ENUM_HE1103")
    object HE1104 : HugeEnum(1104, "HUGE_ENUM_HE1104")
    object HE1105 : HugeEnum(1105, "HUGE_ENUM_HE1105")
    object HE1106 : HugeEnum(1106, "HUGE_ENUM_HE1106")
    object HE1107 : HugeEnum(1107, "HUGE_ENUM_HE1107")
    object HE1108 : HugeEnum(1108, "HUGE_ENUM_HE1108")
    object HE1109 : HugeEnum(1109, "HUGE_ENUM_HE1109")
    object HE1110 : HugeEnum(1110, "HUGE_ENUM_HE1110")
    object HE1111 : HugeEnum(1111, "HUGE_ENUM_HE1111")
    object HE1112 : HugeEnum(1112, "HUGE_ENUM_HE1112")
    object HE1113 : HugeEnum(1113, "HUGE_ENUM_HE1113")
    object HE1114 : HugeEnum(1114, "HUGE_ENUM_HE1114")
    object HE1115 : HugeEnum(1115, "HUGE_ENUM_HE1115")
    object HE1116 : HugeEnum(1116, "HUGE_ENUM_HE1116")
    object HE1117 : HugeEnum(1117, "HUGE_ENUM_HE1117")
    object HE1118 : HugeEnum(1118, "HUGE_ENUM_HE1118")
    object HE1119 : HugeEnum(1119, "HUGE_ENUM_HE1119")
    object HE1120 : HugeEnum(1120, "HUGE_ENUM_HE1120")
    object HE1121 : HugeEnum(1121, "HUGE_ENUM_HE1121")
    object HE1122 : HugeEnum(1122, "HUGE_ENUM_HE1122")
    object HE1123 : HugeEnum(1123, "HUGE_ENUM_HE1123")
    object HE1124 : HugeEnum(1124, "HUGE_ENUM_HE1124")
    object HE1125 : HugeEnum(1125, "HUGE_ENUM_HE1125")
    object HE1126 : HugeEnum(1126, "HUGE_ENUM_HE1126")
    object HE1127 : HugeEnum(1127, "HUGE_ENUM_HE1127")
    object HE1128 : HugeEnum(1128, "HUGE_ENUM_HE1128")
    object HE1129 : HugeEnum(1129, "HUGE_ENUM_HE1129")
    object HE1130 : HugeEnum(1130, "HUGE_ENUM_HE1130")
    object HE1131 : HugeEnum(1131, "HUGE_ENUM_HE1131")
    object HE1132 : HugeEnum(1132, "HUGE_ENUM_HE1132")
    object HE1133 : HugeEnum(1133, "HUGE_ENUM_HE1133")
    object HE1134 : HugeEnum(1134, "HUGE_ENUM_HE1134")
    object HE1135 : HugeEnum(1135, "HUGE_ENUM_HE1135")
    object HE1136 : HugeEnum(1136, "HUGE_ENUM_HE1136")
    object HE1137 : HugeEnum(1137, "HUGE_ENUM_HE1137")
    object HE1138 : HugeEnum(1138, "HUGE_ENUM_HE1138")
    object HE1139 : HugeEnum(1139, "HUGE_ENUM_HE1139")
    object HE1140 : HugeEnum(1140, "HUGE_ENUM_HE1140")
    object HE1141 : HugeEnum(1141, "HUGE_ENUM_HE1141")
    object HE1142 : HugeEnum(1142, "HUGE_ENUM_HE1142")
    object HE1143 : HugeEnum(1143, "HUGE_ENUM_HE1143")
    object HE1144 : HugeEnum(1144, "HUGE_ENUM_HE1144")
    object HE1145 : HugeEnum(1145, "HUGE_ENUM_HE1145")
    object HE1146 : HugeEnum(1146, "HUGE_ENUM_HE1146")
    object HE1147 : HugeEnum(1147, "HUGE_ENUM_HE1147")
    object HE1148 : HugeEnum(1148, "HUGE_ENUM_HE1148")
    object HE1149 : HugeEnum(1149, "HUGE_ENUM_HE1149")
    object HE1150 : HugeEnum(1150, "HUGE_ENUM_HE1150")
    object HE1151 : HugeEnum(1151, "HUGE_ENUM_HE1151")
    object HE1152 : HugeEnum(1152, "HUGE_ENUM_HE1152")
    object HE1153 : HugeEnum(1153, "HUGE_ENUM_HE1153")
    object HE1154 : HugeEnum(1154, "HUGE_ENUM_HE1154")
    object HE1155 : HugeEnum(1155, "HUGE_ENUM_HE1155")
    object HE1156 : HugeEnum(1156, "HUGE_ENUM_HE1156")
    object HE1157 : HugeEnum(1157, "HUGE_ENUM_HE1157")
    object HE1158 : HugeEnum(1158, "HUGE_ENUM_HE1158")
    object HE1159 : HugeEnum(1159, "HUGE_ENUM_HE1159")
    object HE1160 : HugeEnum(1160, "HUGE_ENUM_HE1160")
    object HE1161 : HugeEnum(1161, "HUGE_ENUM_HE1161")
    object HE1162 : HugeEnum(1162, "HUGE_ENUM_HE1162")
    object HE1163 : HugeEnum(1163, "HUGE_ENUM_HE1163")
    object HE1164 : HugeEnum(1164, "HUGE_ENUM_HE1164")
    object HE1165 : HugeEnum(1165, "HUGE_ENUM_HE1165")
    object HE1166 : HugeEnum(1166, "HUGE_ENUM_HE1166")
    object HE1167 : HugeEnum(1167, "HUGE_ENUM_HE1167")
    object HE1168 : HugeEnum(1168, "HUGE_ENUM_HE1168")
    object HE1169 : HugeEnum(1169, "HUGE_ENUM_HE1169")
    object HE1170 : HugeEnum(1170, "HUGE_ENUM_HE1170")
    object HE1171 : HugeEnum(1171, "HUGE_ENUM_HE1171")
    object HE1172 : HugeEnum(1172, "HUGE_ENUM_HE1172")
    object HE1173 : HugeEnum(1173, "HUGE_ENUM_HE1173")
    object HE1174 : HugeEnum(1174, "HUGE_ENUM_HE1174")
    object HE1175 : HugeEnum(1175, "HUGE_ENUM_HE1175")
    object HE1176 : HugeEnum(1176, "HUGE_ENUM_HE1176")
    object HE1177 : HugeEnum(1177, "HUGE_ENUM_HE1177")
    object HE1178 : HugeEnum(1178, "HUGE_ENUM_HE1178")
    object HE1179 : HugeEnum(1179, "HUGE_ENUM_HE1179")
    object HE1180 : HugeEnum(1180, "HUGE_ENUM_HE1180")
    object HE1181 : HugeEnum(1181, "HUGE_ENUM_HE1181")
    object HE1182 : HugeEnum(1182, "HUGE_ENUM_HE1182")
    object HE1183 : HugeEnum(1183, "HUGE_ENUM_HE1183")
    object HE1184 : HugeEnum(1184, "HUGE_ENUM_HE1184")
    object HE1185 : HugeEnum(1185, "HUGE_ENUM_HE1185")
    object HE1186 : HugeEnum(1186, "HUGE_ENUM_HE1186")
    object HE1187 : HugeEnum(1187, "HUGE_ENUM_HE1187")
    object HE1188 : HugeEnum(1188, "HUGE_ENUM_HE1188")
    object HE1189 : HugeEnum(1189, "HUGE_ENUM_HE1189")
    object HE1190 : HugeEnum(1190, "HUGE_ENUM_HE1190")
    object HE1191 : HugeEnum(1191, "HUGE_ENUM_HE1191")
    object HE1192 : HugeEnum(1192, "HUGE_ENUM_HE1192")
    object HE1193 : HugeEnum(1193, "HUGE_ENUM_HE1193")
    object HE1194 : HugeEnum(1194, "HUGE_ENUM_HE1194")
    object HE1195 : HugeEnum(1195, "HUGE_ENUM_HE1195")
    object HE1196 : HugeEnum(1196, "HUGE_ENUM_HE1196")
    object HE1197 : HugeEnum(1197, "HUGE_ENUM_HE1197")
    object HE1198 : HugeEnum(1198, "HUGE_ENUM_HE1198")
    object HE1199 : HugeEnum(1199, "HUGE_ENUM_HE1199")
    object HE1200 : HugeEnum(1200, "HUGE_ENUM_HE1200")
    object HE1201 : HugeEnum(1201, "HUGE_ENUM_HE1201")
    object HE1202 : HugeEnum(1202, "HUGE_ENUM_HE1202")
    object HE1203 : HugeEnum(1203, "HUGE_ENUM_HE1203")
    object HE1204 : HugeEnum(1204, "HUGE_ENUM_HE1204")
    object HE1205 : HugeEnum(1205, "HUGE_ENUM_HE1205")
    object HE1206 : HugeEnum(1206, "HUGE_ENUM_HE1206")
    object HE1207 : HugeEnum(1207, "HUGE_ENUM_HE1207")
    object HE1208 : HugeEnum(1208, "HUGE_ENUM_HE1208")
    object HE1209 : HugeEnum(1209, "HUGE_ENUM_HE1209")
    object HE1210 : HugeEnum(1210, "HUGE_ENUM_HE1210")
    object HE1211 : HugeEnum(1211, "HUGE_ENUM_HE1211")
    object HE1212 : HugeEnum(1212, "HUGE_ENUM_HE1212")
    object HE1213 : HugeEnum(1213, "HUGE_ENUM_HE1213")
    object HE1214 : HugeEnum(1214, "HUGE_ENUM_HE1214")
    object HE1215 : HugeEnum(1215, "HUGE_ENUM_HE1215")
    object HE1216 : HugeEnum(1216, "HUGE_ENUM_HE1216")
    object HE1217 : HugeEnum(1217, "HUGE_ENUM_HE1217")
    object HE1218 : HugeEnum(1218, "HUGE_ENUM_HE1218")
    object HE1219 : HugeEnum(1219, "HUGE_ENUM_HE1219")
    object HE1220 : HugeEnum(1220, "HUGE_ENUM_HE1220")
    object HE1221 : HugeEnum(1221, "HUGE_ENUM_HE1221")
    object HE1222 : HugeEnum(1222, "HUGE_ENUM_HE1222")
    object HE1223 : HugeEnum(1223, "HUGE_ENUM_HE1223")
    object HE1224 : HugeEnum(1224, "HUGE_ENUM_HE1224")
    object HE1225 : HugeEnum(1225, "HUGE_ENUM_HE1225")
    object HE1226 : HugeEnum(1226, "HUGE_ENUM_HE1226")
    object HE1227 : HugeEnum(1227, "HUGE_ENUM_HE1227")
    object HE1228 : HugeEnum(1228, "HUGE_ENUM_HE1228")
    object HE1229 : HugeEnum(1229, "HUGE_ENUM_HE1229")
    object HE1230 : HugeEnum(1230, "HUGE_ENUM_HE1230")
    object HE1231 : HugeEnum(1231, "HUGE_ENUM_HE1231")
    object HE1232 : HugeEnum(1232, "HUGE_ENUM_HE1232")
    object HE1233 : HugeEnum(1233, "HUGE_ENUM_HE1233")
    object HE1234 : HugeEnum(1234, "HUGE_ENUM_HE1234")
    object HE1235 : HugeEnum(1235, "HUGE_ENUM_HE1235")
    object HE1236 : HugeEnum(1236, "HUGE_ENUM_HE1236")
    object HE1237 : HugeEnum(1237, "HUGE_ENUM_HE1237")
    object HE1238 : HugeEnum(1238, "HUGE_ENUM_HE1238")
    object HE1239 : HugeEnum(1239, "HUGE_ENUM_HE1239")
    object HE1240 : HugeEnum(1240, "HUGE_ENUM_HE1240")
    object HE1241 : HugeEnum(1241, "HUGE_ENUM_HE1241")
    object HE1242 : HugeEnum(1242, "HUGE_ENUM_HE1242")
    object HE1243 : HugeEnum(1243, "HUGE_ENUM_HE1243")
    object HE1244 : HugeEnum(1244, "HUGE_ENUM_HE1244")
    object HE1245 : HugeEnum(1245, "HUGE_ENUM_HE1245")
    object HE1246 : HugeEnum(1246, "HUGE_ENUM_HE1246")
    object HE1247 : HugeEnum(1247, "HUGE_ENUM_HE1247")
    object HE1248 : HugeEnum(1248, "HUGE_ENUM_HE1248")
    object HE1249 : HugeEnum(1249, "HUGE_ENUM_HE1249")
    object HE1250 : HugeEnum(1250, "HUGE_ENUM_HE1250")
    object HE1251 : HugeEnum(1251, "HUGE_ENUM_HE1251")
    object HE1252 : HugeEnum(1252, "HUGE_ENUM_HE1252")
    object HE1253 : HugeEnum(1253, "HUGE_ENUM_HE1253")
    object HE1254 : HugeEnum(1254, "HUGE_ENUM_HE1254")
    object HE1255 : HugeEnum(1255, "HUGE_ENUM_HE1255")
    object HE1256 : HugeEnum(1256, "HUGE_ENUM_HE1256")
    object HE1257 : HugeEnum(1257, "HUGE_ENUM_HE1257")
    object HE1258 : HugeEnum(1258, "HUGE_ENUM_HE1258")
    object HE1259 : HugeEnum(1259, "HUGE_ENUM_HE1259")
    object HE1260 : HugeEnum(1260, "HUGE_ENUM_HE1260")
    object HE1261 : HugeEnum(1261, "HUGE_ENUM_HE1261")
    object HE1262 : HugeEnum(1262, "HUGE_ENUM_HE1262")
    object HE1263 : HugeEnum(1263, "HUGE_ENUM_HE1263")
    object HE1264 : HugeEnum(1264, "HUGE_ENUM_HE1264")
    object HE1265 : HugeEnum(1265, "HUGE_ENUM_HE1265")
    object HE1266 : HugeEnum(1266, "HUGE_ENUM_HE1266")
    object HE1267 : HugeEnum(1267, "HUGE_ENUM_HE1267")
    object HE1268 : HugeEnum(1268, "HUGE_ENUM_HE1268")
    object HE1269 : HugeEnum(1269, "HUGE_ENUM_HE1269")
    object HE1270 : HugeEnum(1270, "HUGE_ENUM_HE1270")
    object HE1271 : HugeEnum(1271, "HUGE_ENUM_HE1271")
    object HE1272 : HugeEnum(1272, "HUGE_ENUM_HE1272")
    object HE1273 : HugeEnum(1273, "HUGE_ENUM_HE1273")
    object HE1274 : HugeEnum(1274, "HUGE_ENUM_HE1274")
    object HE1275 : HugeEnum(1275, "HUGE_ENUM_HE1275")
    object HE1276 : HugeEnum(1276, "HUGE_ENUM_HE1276")
    object HE1277 : HugeEnum(1277, "HUGE_ENUM_HE1277")
    object HE1278 : HugeEnum(1278, "HUGE_ENUM_HE1278")
    object HE1279 : HugeEnum(1279, "HUGE_ENUM_HE1279")
    object HE1280 : HugeEnum(1280, "HUGE_ENUM_HE1280")
    object HE1281 : HugeEnum(1281, "HUGE_ENUM_HE1281")
    object HE1282 : HugeEnum(1282, "HUGE_ENUM_HE1282")
    object HE1283 : HugeEnum(1283, "HUGE_ENUM_HE1283")
    object HE1284 : HugeEnum(1284, "HUGE_ENUM_HE1284")
    object HE1285 : HugeEnum(1285, "HUGE_ENUM_HE1285")
    object HE1286 : HugeEnum(1286, "HUGE_ENUM_HE1286")
    object HE1287 : HugeEnum(1287, "HUGE_ENUM_HE1287")
    object HE1288 : HugeEnum(1288, "HUGE_ENUM_HE1288")
    object HE1289 : HugeEnum(1289, "HUGE_ENUM_HE1289")
    object HE1290 : HugeEnum(1290, "HUGE_ENUM_HE1290")
    object HE1291 : HugeEnum(1291, "HUGE_ENUM_HE1291")
    object HE1292 : HugeEnum(1292, "HUGE_ENUM_HE1292")
    object HE1293 : HugeEnum(1293, "HUGE_ENUM_HE1293")
    object HE1294 : HugeEnum(1294, "HUGE_ENUM_HE1294")
    object HE1295 : HugeEnum(1295, "HUGE_ENUM_HE1295")
    object HE1296 : HugeEnum(1296, "HUGE_ENUM_HE1296")
    object HE1297 : HugeEnum(1297, "HUGE_ENUM_HE1297")
    object HE1298 : HugeEnum(1298, "HUGE_ENUM_HE1298")
    object HE1299 : HugeEnum(1299, "HUGE_ENUM_HE1299")
    object HE1300 : HugeEnum(1300, "HUGE_ENUM_HE1300")
    object HE1301 : HugeEnum(1301, "HUGE_ENUM_HE1301")
    object HE1302 : HugeEnum(1302, "HUGE_ENUM_HE1302")
    object HE1303 : HugeEnum(1303, "HUGE_ENUM_HE1303")
    object HE1304 : HugeEnum(1304, "HUGE_ENUM_HE1304")
    object HE1305 : HugeEnum(1305, "HUGE_ENUM_HE1305")
    object HE1306 : HugeEnum(1306, "HUGE_ENUM_HE1306")
    object HE1307 : HugeEnum(1307, "HUGE_ENUM_HE1307")
    object HE1308 : HugeEnum(1308, "HUGE_ENUM_HE1308")
    object HE1309 : HugeEnum(1309, "HUGE_ENUM_HE1309")
    object HE1310 : HugeEnum(1310, "HUGE_ENUM_HE1310")
    object HE1311 : HugeEnum(1311, "HUGE_ENUM_HE1311")
    object HE1312 : HugeEnum(1312, "HUGE_ENUM_HE1312")
    object HE1313 : HugeEnum(1313, "HUGE_ENUM_HE1313")
    object HE1314 : HugeEnum(1314, "HUGE_ENUM_HE1314")
    object HE1315 : HugeEnum(1315, "HUGE_ENUM_HE1315")
    object HE1316 : HugeEnum(1316, "HUGE_ENUM_HE1316")
    object HE1317 : HugeEnum(1317, "HUGE_ENUM_HE1317")
    object HE1318 : HugeEnum(1318, "HUGE_ENUM_HE1318")
    object HE1319 : HugeEnum(1319, "HUGE_ENUM_HE1319")
    object HE1320 : HugeEnum(1320, "HUGE_ENUM_HE1320")
    object HE1321 : HugeEnum(1321, "HUGE_ENUM_HE1321")
    object HE1322 : HugeEnum(1322, "HUGE_ENUM_HE1322")
    object HE1323 : HugeEnum(1323, "HUGE_ENUM_HE1323")
    object HE1324 : HugeEnum(1324, "HUGE_ENUM_HE1324")
    object HE1325 : HugeEnum(1325, "HUGE_ENUM_HE1325")
    object HE1326 : HugeEnum(1326, "HUGE_ENUM_HE1326")
    object HE1327 : HugeEnum(1327, "HUGE_ENUM_HE1327")
    object HE1328 : HugeEnum(1328, "HUGE_ENUM_HE1328")
    object HE1329 : HugeEnum(1329, "HUGE_ENUM_HE1329")
    object HE1330 : HugeEnum(1330, "HUGE_ENUM_HE1330")
    object HE1331 : HugeEnum(1331, "HUGE_ENUM_HE1331")
    object HE1332 : HugeEnum(1332, "HUGE_ENUM_HE1332")
    object HE1333 : HugeEnum(1333, "HUGE_ENUM_HE1333")
    object HE1334 : HugeEnum(1334, "HUGE_ENUM_HE1334")
    object HE1335 : HugeEnum(1335, "HUGE_ENUM_HE1335")
    object HE1336 : HugeEnum(1336, "HUGE_ENUM_HE1336")
    object HE1337 : HugeEnum(1337, "HUGE_ENUM_HE1337")
    object HE1338 : HugeEnum(1338, "HUGE_ENUM_HE1338")
    object HE1339 : HugeEnum(1339, "HUGE_ENUM_HE1339")
    object HE1340 : HugeEnum(1340, "HUGE_ENUM_HE1340")
    object HE1341 : HugeEnum(1341, "HUGE_ENUM_HE1341")
    object HE1342 : HugeEnum(1342, "HUGE_ENUM_HE1342")
    object HE1343 : HugeEnum(1343, "HUGE_ENUM_HE1343")
    object HE1344 : HugeEnum(1344, "HUGE_ENUM_HE1344")
    object HE1345 : HugeEnum(1345, "HUGE_ENUM_HE1345")
    object HE1346 : HugeEnum(1346, "HUGE_ENUM_HE1346")
    object HE1347 : HugeEnum(1347, "HUGE_ENUM_HE1347")
    object HE1348 : HugeEnum(1348, "HUGE_ENUM_HE1348")
    object HE1349 : HugeEnum(1349, "HUGE_ENUM_HE1349")
    object HE1350 : HugeEnum(1350, "HUGE_ENUM_HE1350")
    object HE1351 : HugeEnum(1351, "HUGE_ENUM_HE1351")
    object HE1352 : HugeEnum(1352, "HUGE_ENUM_HE1352")
    object HE1353 : HugeEnum(1353, "HUGE_ENUM_HE1353")
    object HE1354 : HugeEnum(1354, "HUGE_ENUM_HE1354")
    object HE1355 : HugeEnum(1355, "HUGE_ENUM_HE1355")
    object HE1356 : HugeEnum(1356, "HUGE_ENUM_HE1356")
    object HE1357 : HugeEnum(1357, "HUGE_ENUM_HE1357")
    object HE1358 : HugeEnum(1358, "HUGE_ENUM_HE1358")
    object HE1359 : HugeEnum(1359, "HUGE_ENUM_HE1359")
    object HE1360 : HugeEnum(1360, "HUGE_ENUM_HE1360")
    object HE1361 : HugeEnum(1361, "HUGE_ENUM_HE1361")
    object HE1362 : HugeEnum(1362, "HUGE_ENUM_HE1362")
    object HE1363 : HugeEnum(1363, "HUGE_ENUM_HE1363")
    object HE1364 : HugeEnum(1364, "HUGE_ENUM_HE1364")
    object HE1365 : HugeEnum(1365, "HUGE_ENUM_HE1365")
    object HE1366 : HugeEnum(1366, "HUGE_ENUM_HE1366")
    object HE1367 : HugeEnum(1367, "HUGE_ENUM_HE1367")
    object HE1368 : HugeEnum(1368, "HUGE_ENUM_HE1368")
    object HE1369 : HugeEnum(1369, "HUGE_ENUM_HE1369")
    object HE1370 : HugeEnum(1370, "HUGE_ENUM_HE1370")
    object HE1371 : HugeEnum(1371, "HUGE_ENUM_HE1371")
    object HE1372 : HugeEnum(1372, "HUGE_ENUM_HE1372")
    object HE1373 : HugeEnum(1373, "HUGE_ENUM_HE1373")
    object HE1374 : HugeEnum(1374, "HUGE_ENUM_HE1374")
    object HE1375 : HugeEnum(1375, "HUGE_ENUM_HE1375")
    object HE1376 : HugeEnum(1376, "HUGE_ENUM_HE1376")
    object HE1377 : HugeEnum(1377, "HUGE_ENUM_HE1377")
    object HE1378 : HugeEnum(1378, "HUGE_ENUM_HE1378")
    object HE1379 : HugeEnum(1379, "HUGE_ENUM_HE1379")
    object HE1380 : HugeEnum(1380, "HUGE_ENUM_HE1380")
    object HE1381 : HugeEnum(1381, "HUGE_ENUM_HE1381")
    object HE1382 : HugeEnum(1382, "HUGE_ENUM_HE1382")
    object HE1383 : HugeEnum(1383, "HUGE_ENUM_HE1383")
    object HE1384 : HugeEnum(1384, "HUGE_ENUM_HE1384")
    object HE1385 : HugeEnum(1385, "HUGE_ENUM_HE1385")
    object HE1386 : HugeEnum(1386, "HUGE_ENUM_HE1386")
    object HE1387 : HugeEnum(1387, "HUGE_ENUM_HE1387")
    object HE1388 : HugeEnum(1388, "HUGE_ENUM_HE1388")
    object HE1389 : HugeEnum(1389, "HUGE_ENUM_HE1389")
    object HE1390 : HugeEnum(1390, "HUGE_ENUM_HE1390")
    object HE1391 : HugeEnum(1391, "HUGE_ENUM_HE1391")
    object HE1392 : HugeEnum(1392, "HUGE_ENUM_HE1392")
    object HE1393 : HugeEnum(1393, "HUGE_ENUM_HE1393")
    object HE1394 : HugeEnum(1394, "HUGE_ENUM_HE1394")
    object HE1395 : HugeEnum(1395, "HUGE_ENUM_HE1395")
    object HE1396 : HugeEnum(1396, "HUGE_ENUM_HE1396")
    object HE1397 : HugeEnum(1397, "HUGE_ENUM_HE1397")
    object HE1398 : HugeEnum(1398, "HUGE_ENUM_HE1398")
    object HE1399 : HugeEnum(1399, "HUGE_ENUM_HE1399")
    object HE1400 : HugeEnum(1400, "HUGE_ENUM_HE1400")
    object HE1401 : HugeEnum(1401, "HUGE_ENUM_HE1401")
    object HE1402 : HugeEnum(1402, "HUGE_ENUM_HE1402")
    object HE1403 : HugeEnum(1403, "HUGE_ENUM_HE1403")
    object HE1404 : HugeEnum(1404, "HUGE_ENUM_HE1404")
    object HE1405 : HugeEnum(1405, "HUGE_ENUM_HE1405")
    object HE1406 : HugeEnum(1406, "HUGE_ENUM_HE1406")
    object HE1407 : HugeEnum(1407, "HUGE_ENUM_HE1407")
    object HE1408 : HugeEnum(1408, "HUGE_ENUM_HE1408")
    object HE1409 : HugeEnum(1409, "HUGE_ENUM_HE1409")
    object HE1410 : HugeEnum(1410, "HUGE_ENUM_HE1410")
    object HE1411 : HugeEnum(1411, "HUGE_ENUM_HE1411")
    object HE1412 : HugeEnum(1412, "HUGE_ENUM_HE1412")
    object HE1413 : HugeEnum(1413, "HUGE_ENUM_HE1413")
    object HE1414 : HugeEnum(1414, "HUGE_ENUM_HE1414")
    object HE1415 : HugeEnum(1415, "HUGE_ENUM_HE1415")
    object HE1416 : HugeEnum(1416, "HUGE_ENUM_HE1416")
    object HE1417 : HugeEnum(1417, "HUGE_ENUM_HE1417")
    object HE1418 : HugeEnum(1418, "HUGE_ENUM_HE1418")
    object HE1419 : HugeEnum(1419, "HUGE_ENUM_HE1419")
    object HE1420 : HugeEnum(1420, "HUGE_ENUM_HE1420")
    object HE1421 : HugeEnum(1421, "HUGE_ENUM_HE1421")
    object HE1422 : HugeEnum(1422, "HUGE_ENUM_HE1422")
    object HE1423 : HugeEnum(1423, "HUGE_ENUM_HE1423")
    object HE1424 : HugeEnum(1424, "HUGE_ENUM_HE1424")
    object HE1425 : HugeEnum(1425, "HUGE_ENUM_HE1425")
    object HE1426 : HugeEnum(1426, "HUGE_ENUM_HE1426")
    object HE1427 : HugeEnum(1427, "HUGE_ENUM_HE1427")
    object HE1428 : HugeEnum(1428, "HUGE_ENUM_HE1428")
    object HE1429 : HugeEnum(1429, "HUGE_ENUM_HE1429")
    object HE1430 : HugeEnum(1430, "HUGE_ENUM_HE1430")
    object HE1431 : HugeEnum(1431, "HUGE_ENUM_HE1431")
    object HE1432 : HugeEnum(1432, "HUGE_ENUM_HE1432")
    object HE1433 : HugeEnum(1433, "HUGE_ENUM_HE1433")
    object HE1434 : HugeEnum(1434, "HUGE_ENUM_HE1434")
    object HE1435 : HugeEnum(1435, "HUGE_ENUM_HE1435")
    object HE1436 : HugeEnum(1436, "HUGE_ENUM_HE1436")
    object HE1437 : HugeEnum(1437, "HUGE_ENUM_HE1437")
    object HE1438 : HugeEnum(1438, "HUGE_ENUM_HE1438")
    object HE1439 : HugeEnum(1439, "HUGE_ENUM_HE1439")
    object HE1440 : HugeEnum(1440, "HUGE_ENUM_HE1440")
    object HE1441 : HugeEnum(1441, "HUGE_ENUM_HE1441")
    object HE1442 : HugeEnum(1442, "HUGE_ENUM_HE1442")
    object HE1443 : HugeEnum(1443, "HUGE_ENUM_HE1443")
    object HE1444 : HugeEnum(1444, "HUGE_ENUM_HE1444")
    object HE1445 : HugeEnum(1445, "HUGE_ENUM_HE1445")
    object HE1446 : HugeEnum(1446, "HUGE_ENUM_HE1446")
    object HE1447 : HugeEnum(1447, "HUGE_ENUM_HE1447")
    object HE1448 : HugeEnum(1448, "HUGE_ENUM_HE1448")
    object HE1449 : HugeEnum(1449, "HUGE_ENUM_HE1449")
    object HE1450 : HugeEnum(1450, "HUGE_ENUM_HE1450")
    object HE1451 : HugeEnum(1451, "HUGE_ENUM_HE1451")
    object HE1452 : HugeEnum(1452, "HUGE_ENUM_HE1452")
    object HE1453 : HugeEnum(1453, "HUGE_ENUM_HE1453")
    object HE1454 : HugeEnum(1454, "HUGE_ENUM_HE1454")
    object HE1455 : HugeEnum(1455, "HUGE_ENUM_HE1455")
    object HE1456 : HugeEnum(1456, "HUGE_ENUM_HE1456")
    object HE1457 : HugeEnum(1457, "HUGE_ENUM_HE1457")
    object HE1458 : HugeEnum(1458, "HUGE_ENUM_HE1458")
    object HE1459 : HugeEnum(1459, "HUGE_ENUM_HE1459")
    object HE1460 : HugeEnum(1460, "HUGE_ENUM_HE1460")
    object HE1461 : HugeEnum(1461, "HUGE_ENUM_HE1461")
    object HE1462 : HugeEnum(1462, "HUGE_ENUM_HE1462")
    object HE1463 : HugeEnum(1463, "HUGE_ENUM_HE1463")
    object HE1464 : HugeEnum(1464, "HUGE_ENUM_HE1464")
    object HE1465 : HugeEnum(1465, "HUGE_ENUM_HE1465")
    object HE1466 : HugeEnum(1466, "HUGE_ENUM_HE1466")
    object HE1467 : HugeEnum(1467, "HUGE_ENUM_HE1467")
    object HE1468 : HugeEnum(1468, "HUGE_ENUM_HE1468")
    object HE1469 : HugeEnum(1469, "HUGE_ENUM_HE1469")
    object HE1470 : HugeEnum(1470, "HUGE_ENUM_HE1470")
    object HE1471 : HugeEnum(1471, "HUGE_ENUM_HE1471")
    object HE1472 : HugeEnum(1472, "HUGE_ENUM_HE1472")
    object HE1473 : HugeEnum(1473, "HUGE_ENUM_HE1473")
    object HE1474 : HugeEnum(1474, "HUGE_ENUM_HE1474")
    object HE1475 : HugeEnum(1475, "HUGE_ENUM_HE1475")
    object HE1476 : HugeEnum(1476, "HUGE_ENUM_HE1476")
    object HE1477 : HugeEnum(1477, "HUGE_ENUM_HE1477")
    object HE1478 : HugeEnum(1478, "HUGE_ENUM_HE1478")
    object HE1479 : HugeEnum(1479, "HUGE_ENUM_HE1479")
    object HE1480 : HugeEnum(1480, "HUGE_ENUM_HE1480")
    object HE1481 : HugeEnum(1481, "HUGE_ENUM_HE1481")
    object HE1482 : HugeEnum(1482, "HUGE_ENUM_HE1482")
    object HE1483 : HugeEnum(1483, "HUGE_ENUM_HE1483")
    object HE1484 : HugeEnum(1484, "HUGE_ENUM_HE1484")
    object HE1485 : HugeEnum(1485, "HUGE_ENUM_HE1485")
    object HE1486 : HugeEnum(1486, "HUGE_ENUM_HE1486")
    object HE1487 : HugeEnum(1487, "HUGE_ENUM_HE1487")
    object HE1488 : HugeEnum(1488, "HUGE_ENUM_HE1488")
    object HE1489 : HugeEnum(1489, "HUGE_ENUM_HE1489")
    object HE1490 : HugeEnum(1490, "HUGE_ENUM_HE1490")
    object HE1491 : HugeEnum(1491, "HUGE_ENUM_HE1491")
    object HE1492 : HugeEnum(1492, "HUGE_ENUM_HE1492")
    object HE1493 : HugeEnum(1493, "HUGE_ENUM_HE1493")
    object HE1494 : HugeEnum(1494, "HUGE_ENUM_HE1494")
    object HE1495 : HugeEnum(1495, "HUGE_ENUM_HE1495")
    object HE1496 : HugeEnum(1496, "HUGE_ENUM_HE1496")
    object HE1497 : HugeEnum(1497, "HUGE_ENUM_HE1497")
    object HE1498 : HugeEnum(1498, "HUGE_ENUM_HE1498")
    object HE1499 : HugeEnum(1499, "HUGE_ENUM_HE1499")
    object HE1500 : HugeEnum(1500, "HUGE_ENUM_HE1500")
    object HE1501 : HugeEnum(1501, "HUGE_ENUM_HE1501")
    object HE1502 : HugeEnum(1502, "HUGE_ENUM_HE1502")
    object HE1503 : HugeEnum(1503, "HUGE_ENUM_HE1503")
    object HE1504 : HugeEnum(1504, "HUGE_ENUM_HE1504")
    object HE1505 : HugeEnum(1505, "HUGE_ENUM_HE1505")
    object HE1506 : HugeEnum(1506, "HUGE_ENUM_HE1506")
    object HE1507 : HugeEnum(1507, "HUGE_ENUM_HE1507")
    object HE1508 : HugeEnum(1508, "HUGE_ENUM_HE1508")
    object HE1509 : HugeEnum(1509, "HUGE_ENUM_HE1509")
    object HE1510 : HugeEnum(1510, "HUGE_ENUM_HE1510")
    object HE1511 : HugeEnum(1511, "HUGE_ENUM_HE1511")
    object HE1512 : HugeEnum(1512, "HUGE_ENUM_HE1512")
    object HE1513 : HugeEnum(1513, "HUGE_ENUM_HE1513")
    object HE1514 : HugeEnum(1514, "HUGE_ENUM_HE1514")
    object HE1515 : HugeEnum(1515, "HUGE_ENUM_HE1515")
    object HE1516 : HugeEnum(1516, "HUGE_ENUM_HE1516")
    object HE1517 : HugeEnum(1517, "HUGE_ENUM_HE1517")
    object HE1518 : HugeEnum(1518, "HUGE_ENUM_HE1518")
    object HE1519 : HugeEnum(1519, "HUGE_ENUM_HE1519")
    object HE1520 : HugeEnum(1520, "HUGE_ENUM_HE1520")
    object HE1521 : HugeEnum(1521, "HUGE_ENUM_HE1521")
    object HE1522 : HugeEnum(1522, "HUGE_ENUM_HE1522")
    object HE1523 : HugeEnum(1523, "HUGE_ENUM_HE1523")
    object HE1524 : HugeEnum(1524, "HUGE_ENUM_HE1524")
    object HE1525 : HugeEnum(1525, "HUGE_ENUM_HE1525")
    object HE1526 : HugeEnum(1526, "HUGE_ENUM_HE1526")
    object HE1527 : HugeEnum(1527, "HUGE_ENUM_HE1527")
    object HE1528 : HugeEnum(1528, "HUGE_ENUM_HE1528")
    object HE1529 : HugeEnum(1529, "HUGE_ENUM_HE1529")
    object HE1530 : HugeEnum(1530, "HUGE_ENUM_HE1530")
    object HE1531 : HugeEnum(1531, "HUGE_ENUM_HE1531")
    object HE1532 : HugeEnum(1532, "HUGE_ENUM_HE1532")
    object HE1533 : HugeEnum(1533, "HUGE_ENUM_HE1533")
    object HE1534 : HugeEnum(1534, "HUGE_ENUM_HE1534")
    object HE1535 : HugeEnum(1535, "HUGE_ENUM_HE1535")
    object HE1536 : HugeEnum(1536, "HUGE_ENUM_HE1536")
    object HE1537 : HugeEnum(1537, "HUGE_ENUM_HE1537")
    object HE1538 : HugeEnum(1538, "HUGE_ENUM_HE1538")
    object HE1539 : HugeEnum(1539, "HUGE_ENUM_HE1539")
    object HE1540 : HugeEnum(1540, "HUGE_ENUM_HE1540")
    object HE1541 : HugeEnum(1541, "HUGE_ENUM_HE1541")
    object HE1542 : HugeEnum(1542, "HUGE_ENUM_HE1542")
    object HE1543 : HugeEnum(1543, "HUGE_ENUM_HE1543")
    object HE1544 : HugeEnum(1544, "HUGE_ENUM_HE1544")
    object HE1545 : HugeEnum(1545, "HUGE_ENUM_HE1545")
    object HE1546 : HugeEnum(1546, "HUGE_ENUM_HE1546")
    object HE1547 : HugeEnum(1547, "HUGE_ENUM_HE1547")
    object HE1548 : HugeEnum(1548, "HUGE_ENUM_HE1548")
    object HE1549 : HugeEnum(1549, "HUGE_ENUM_HE1549")
    object HE1550 : HugeEnum(1550, "HUGE_ENUM_HE1550")
    object HE1551 : HugeEnum(1551, "HUGE_ENUM_HE1551")
    object HE1552 : HugeEnum(1552, "HUGE_ENUM_HE1552")
    object HE1553 : HugeEnum(1553, "HUGE_ENUM_HE1553")
    object HE1554 : HugeEnum(1554, "HUGE_ENUM_HE1554")
    object HE1555 : HugeEnum(1555, "HUGE_ENUM_HE1555")
    object HE1556 : HugeEnum(1556, "HUGE_ENUM_HE1556")
    object HE1557 : HugeEnum(1557, "HUGE_ENUM_HE1557")
    object HE1558 : HugeEnum(1558, "HUGE_ENUM_HE1558")
    object HE1559 : HugeEnum(1559, "HUGE_ENUM_HE1559")
    object HE1560 : HugeEnum(1560, "HUGE_ENUM_HE1560")
    object HE1561 : HugeEnum(1561, "HUGE_ENUM_HE1561")
    object HE1562 : HugeEnum(1562, "HUGE_ENUM_HE1562")
    object HE1563 : HugeEnum(1563, "HUGE_ENUM_HE1563")
    object HE1564 : HugeEnum(1564, "HUGE_ENUM_HE1564")
    object HE1565 : HugeEnum(1565, "HUGE_ENUM_HE1565")
    object HE1566 : HugeEnum(1566, "HUGE_ENUM_HE1566")
    object HE1567 : HugeEnum(1567, "HUGE_ENUM_HE1567")
    object HE1568 : HugeEnum(1568, "HUGE_ENUM_HE1568")
    object HE1569 : HugeEnum(1569, "HUGE_ENUM_HE1569")
    object HE1570 : HugeEnum(1570, "HUGE_ENUM_HE1570")
    object HE1571 : HugeEnum(1571, "HUGE_ENUM_HE1571")
    object HE1572 : HugeEnum(1572, "HUGE_ENUM_HE1572")
    object HE1573 : HugeEnum(1573, "HUGE_ENUM_HE1573")
    object HE1574 : HugeEnum(1574, "HUGE_ENUM_HE1574")
    object HE1575 : HugeEnum(1575, "HUGE_ENUM_HE1575")
    object HE1576 : HugeEnum(1576, "HUGE_ENUM_HE1576")
    object HE1577 : HugeEnum(1577, "HUGE_ENUM_HE1577")
    object HE1578 : HugeEnum(1578, "HUGE_ENUM_HE1578")
    object HE1579 : HugeEnum(1579, "HUGE_ENUM_HE1579")
    object HE1580 : HugeEnum(1580, "HUGE_ENUM_HE1580")
    object HE1581 : HugeEnum(1581, "HUGE_ENUM_HE1581")
    object HE1582 : HugeEnum(1582, "HUGE_ENUM_HE1582")
    object HE1583 : HugeEnum(1583, "HUGE_ENUM_HE1583")
    object HE1584 : HugeEnum(1584, "HUGE_ENUM_HE1584")
    object HE1585 : HugeEnum(1585, "HUGE_ENUM_HE1585")
    object HE1586 : HugeEnum(1586, "HUGE_ENUM_HE1586")
    object HE1587 : HugeEnum(1587, "HUGE_ENUM_HE1587")
    object HE1588 : HugeEnum(1588, "HUGE_ENUM_HE1588")
    object HE1589 : HugeEnum(1589, "HUGE_ENUM_HE1589")
    object HE1590 : HugeEnum(1590, "HUGE_ENUM_HE1590")
    object HE1591 : HugeEnum(1591, "HUGE_ENUM_HE1591")
    object HE1592 : HugeEnum(1592, "HUGE_ENUM_HE1592")
    object HE1593 : HugeEnum(1593, "HUGE_ENUM_HE1593")
    object HE1594 : HugeEnum(1594, "HUGE_ENUM_HE1594")
    object HE1595 : HugeEnum(1595, "HUGE_ENUM_HE1595")
    object HE1596 : HugeEnum(1596, "HUGE_ENUM_HE1596")
    object HE1597 : HugeEnum(1597, "HUGE_ENUM_HE1597")
    object HE1598 : HugeEnum(1598, "HUGE_ENUM_HE1598")
    object HE1599 : HugeEnum(1599, "HUGE_ENUM_HE1599")
    object HE1600 : HugeEnum(1600, "HUGE_ENUM_HE1600")
    object HE1601 : HugeEnum(1601, "HUGE_ENUM_HE1601")
    object HE1602 : HugeEnum(1602, "HUGE_ENUM_HE1602")
    object HE1603 : HugeEnum(1603, "HUGE_ENUM_HE1603")
    object HE1604 : HugeEnum(1604, "HUGE_ENUM_HE1604")
    object HE1605 : HugeEnum(1605, "HUGE_ENUM_HE1605")
    object HE1606 : HugeEnum(1606, "HUGE_ENUM_HE1606")
    object HE1607 : HugeEnum(1607, "HUGE_ENUM_HE1607")
    object HE1608 : HugeEnum(1608, "HUGE_ENUM_HE1608")
    object HE1609 : HugeEnum(1609, "HUGE_ENUM_HE1609")
    object HE1610 : HugeEnum(1610, "HUGE_ENUM_HE1610")
    object HE1611 : HugeEnum(1611, "HUGE_ENUM_HE1611")
    object HE1612 : HugeEnum(1612, "HUGE_ENUM_HE1612")
    object HE1613 : HugeEnum(1613, "HUGE_ENUM_HE1613")
    object HE1614 : HugeEnum(1614, "HUGE_ENUM_HE1614")
    object HE1615 : HugeEnum(1615, "HUGE_ENUM_HE1615")
    object HE1616 : HugeEnum(1616, "HUGE_ENUM_HE1616")
    object HE1617 : HugeEnum(1617, "HUGE_ENUM_HE1617")
    object HE1618 : HugeEnum(1618, "HUGE_ENUM_HE1618")
    object HE1619 : HugeEnum(1619, "HUGE_ENUM_HE1619")
    object HE1620 : HugeEnum(1620, "HUGE_ENUM_HE1620")
    object HE1621 : HugeEnum(1621, "HUGE_ENUM_HE1621")
    object HE1622 : HugeEnum(1622, "HUGE_ENUM_HE1622")
    object HE1623 : HugeEnum(1623, "HUGE_ENUM_HE1623")
    object HE1624 : HugeEnum(1624, "HUGE_ENUM_HE1624")
    object HE1625 : HugeEnum(1625, "HUGE_ENUM_HE1625")
    object HE1626 : HugeEnum(1626, "HUGE_ENUM_HE1626")
    object HE1627 : HugeEnum(1627, "HUGE_ENUM_HE1627")
    object HE1628 : HugeEnum(1628, "HUGE_ENUM_HE1628")
    object HE1629 : HugeEnum(1629, "HUGE_ENUM_HE1629")
    object HE1630 : HugeEnum(1630, "HUGE_ENUM_HE1630")
    object HE1631 : HugeEnum(1631, "HUGE_ENUM_HE1631")
    object HE1632 : HugeEnum(1632, "HUGE_ENUM_HE1632")
    object HE1633 : HugeEnum(1633, "HUGE_ENUM_HE1633")
    object HE1634 : HugeEnum(1634, "HUGE_ENUM_HE1634")
    object HE1635 : HugeEnum(1635, "HUGE_ENUM_HE1635")
    object HE1636 : HugeEnum(1636, "HUGE_ENUM_HE1636")
    object HE1637 : HugeEnum(1637, "HUGE_ENUM_HE1637")
    object HE1638 : HugeEnum(1638, "HUGE_ENUM_HE1638")
    object HE1639 : HugeEnum(1639, "HUGE_ENUM_HE1639")
    object HE1640 : HugeEnum(1640, "HUGE_ENUM_HE1640")
    object HE1641 : HugeEnum(1641, "HUGE_ENUM_HE1641")
    object HE1642 : HugeEnum(1642, "HUGE_ENUM_HE1642")
    object HE1643 : HugeEnum(1643, "HUGE_ENUM_HE1643")
    object HE1644 : HugeEnum(1644, "HUGE_ENUM_HE1644")
    object HE1645 : HugeEnum(1645, "HUGE_ENUM_HE1645")
    object HE1646 : HugeEnum(1646, "HUGE_ENUM_HE1646")
    object HE1647 : HugeEnum(1647, "HUGE_ENUM_HE1647")
    object HE1648 : HugeEnum(1648, "HUGE_ENUM_HE1648")
    object HE1649 : HugeEnum(1649, "HUGE_ENUM_HE1649")
    object HE1650 : HugeEnum(1650, "HUGE_ENUM_HE1650")
    object HE1651 : HugeEnum(1651, "HUGE_ENUM_HE1651")
    object HE1652 : HugeEnum(1652, "HUGE_ENUM_HE1652")
    object HE1653 : HugeEnum(1653, "HUGE_ENUM_HE1653")
    object HE1654 : HugeEnum(1654, "HUGE_ENUM_HE1654")
    object HE1655 : HugeEnum(1655, "HUGE_ENUM_HE1655")
    object HE1656 : HugeEnum(1656, "HUGE_ENUM_HE1656")
    object HE1657 : HugeEnum(1657, "HUGE_ENUM_HE1657")
    object HE1658 : HugeEnum(1658, "HUGE_ENUM_HE1658")
    object HE1659 : HugeEnum(1659, "HUGE_ENUM_HE1659")
    object HE1660 : HugeEnum(1660, "HUGE_ENUM_HE1660")
    object HE1661 : HugeEnum(1661, "HUGE_ENUM_HE1661")
    object HE1662 : HugeEnum(1662, "HUGE_ENUM_HE1662")
    object HE1663 : HugeEnum(1663, "HUGE_ENUM_HE1663")
    object HE1664 : HugeEnum(1664, "HUGE_ENUM_HE1664")
    object HE1665 : HugeEnum(1665, "HUGE_ENUM_HE1665")
    object HE1666 : HugeEnum(1666, "HUGE_ENUM_HE1666")
    object HE1667 : HugeEnum(1667, "HUGE_ENUM_HE1667")
    object HE1668 : HugeEnum(1668, "HUGE_ENUM_HE1668")
    object HE1669 : HugeEnum(1669, "HUGE_ENUM_HE1669")
    object HE1670 : HugeEnum(1670, "HUGE_ENUM_HE1670")
    object HE1671 : HugeEnum(1671, "HUGE_ENUM_HE1671")
    object HE1672 : HugeEnum(1672, "HUGE_ENUM_HE1672")
    object HE1673 : HugeEnum(1673, "HUGE_ENUM_HE1673")
    object HE1674 : HugeEnum(1674, "HUGE_ENUM_HE1674")
    object HE1675 : HugeEnum(1675, "HUGE_ENUM_HE1675")
    object HE1676 : HugeEnum(1676, "HUGE_ENUM_HE1676")
    object HE1677 : HugeEnum(1677, "HUGE_ENUM_HE1677")
    object HE1678 : HugeEnum(1678, "HUGE_ENUM_HE1678")
    object HE1679 : HugeEnum(1679, "HUGE_ENUM_HE1679")
    object HE1680 : HugeEnum(1680, "HUGE_ENUM_HE1680")
    object HE1681 : HugeEnum(1681, "HUGE_ENUM_HE1681")
    object HE1682 : HugeEnum(1682, "HUGE_ENUM_HE1682")
    object HE1683 : HugeEnum(1683, "HUGE_ENUM_HE1683")
    object HE1684 : HugeEnum(1684, "HUGE_ENUM_HE1684")
    object HE1685 : HugeEnum(1685, "HUGE_ENUM_HE1685")
    object HE1686 : HugeEnum(1686, "HUGE_ENUM_HE1686")
    object HE1687 : HugeEnum(1687, "HUGE_ENUM_HE1687")
    object HE1688 : HugeEnum(1688, "HUGE_ENUM_HE1688")
    object HE1689 : HugeEnum(1689, "HUGE_ENUM_HE1689")
    object HE1690 : HugeEnum(1690, "HUGE_ENUM_HE1690")
    object HE1691 : HugeEnum(1691, "HUGE_ENUM_HE1691")
    object HE1692 : HugeEnum(1692, "HUGE_ENUM_HE1692")
    object HE1693 : HugeEnum(1693, "HUGE_ENUM_HE1693")
    object HE1694 : HugeEnum(1694, "HUGE_ENUM_HE1694")
    object HE1695 : HugeEnum(1695, "HUGE_ENUM_HE1695")
    object HE1696 : HugeEnum(1696, "HUGE_ENUM_HE1696")
    object HE1697 : HugeEnum(1697, "HUGE_ENUM_HE1697")
    object HE1698 : HugeEnum(1698, "HUGE_ENUM_HE1698")
    object HE1699 : HugeEnum(1699, "HUGE_ENUM_HE1699")
    object HE1700 : HugeEnum(1700, "HUGE_ENUM_HE1700")
    object HE1701 : HugeEnum(1701, "HUGE_ENUM_HE1701")
    object HE1702 : HugeEnum(1702, "HUGE_ENUM_HE1702")
    object HE1703 : HugeEnum(1703, "HUGE_ENUM_HE1703")
    object HE1704 : HugeEnum(1704, "HUGE_ENUM_HE1704")
    object HE1705 : HugeEnum(1705, "HUGE_ENUM_HE1705")
    object HE1706 : HugeEnum(1706, "HUGE_ENUM_HE1706")
    object HE1707 : HugeEnum(1707, "HUGE_ENUM_HE1707")
    object HE1708 : HugeEnum(1708, "HUGE_ENUM_HE1708")
    object HE1709 : HugeEnum(1709, "HUGE_ENUM_HE1709")
    object HE1710 : HugeEnum(1710, "HUGE_ENUM_HE1710")
    object HE1711 : HugeEnum(1711, "HUGE_ENUM_HE1711")
    object HE1712 : HugeEnum(1712, "HUGE_ENUM_HE1712")
    object HE1713 : HugeEnum(1713, "HUGE_ENUM_HE1713")
    object HE1714 : HugeEnum(1714, "HUGE_ENUM_HE1714")
    object HE1715 : HugeEnum(1715, "HUGE_ENUM_HE1715")
    object HE1716 : HugeEnum(1716, "HUGE_ENUM_HE1716")
    object HE1717 : HugeEnum(1717, "HUGE_ENUM_HE1717")
    object HE1718 : HugeEnum(1718, "HUGE_ENUM_HE1718")
    object HE1719 : HugeEnum(1719, "HUGE_ENUM_HE1719")
    object HE1720 : HugeEnum(1720, "HUGE_ENUM_HE1720")
    object HE1721 : HugeEnum(1721, "HUGE_ENUM_HE1721")
    object HE1722 : HugeEnum(1722, "HUGE_ENUM_HE1722")
    object HE1723 : HugeEnum(1723, "HUGE_ENUM_HE1723")
    object HE1724 : HugeEnum(1724, "HUGE_ENUM_HE1724")
    object HE1725 : HugeEnum(1725, "HUGE_ENUM_HE1725")
    object HE1726 : HugeEnum(1726, "HUGE_ENUM_HE1726")
    object HE1727 : HugeEnum(1727, "HUGE_ENUM_HE1727")
    object HE1728 : HugeEnum(1728, "HUGE_ENUM_HE1728")
    object HE1729 : HugeEnum(1729, "HUGE_ENUM_HE1729")
    object HE1730 : HugeEnum(1730, "HUGE_ENUM_HE1730")
    object HE1731 : HugeEnum(1731, "HUGE_ENUM_HE1731")
    object HE1732 : HugeEnum(1732, "HUGE_ENUM_HE1732")
    object HE1733 : HugeEnum(1733, "HUGE_ENUM_HE1733")
    object HE1734 : HugeEnum(1734, "HUGE_ENUM_HE1734")
    object HE1735 : HugeEnum(1735, "HUGE_ENUM_HE1735")
    object HE1736 : HugeEnum(1736, "HUGE_ENUM_HE1736")
    object HE1737 : HugeEnum(1737, "HUGE_ENUM_HE1737")
    object HE1738 : HugeEnum(1738, "HUGE_ENUM_HE1738")
    object HE1739 : HugeEnum(1739, "HUGE_ENUM_HE1739")
    object HE1740 : HugeEnum(1740, "HUGE_ENUM_HE1740")
    object HE1741 : HugeEnum(1741, "HUGE_ENUM_HE1741")
    object HE1742 : HugeEnum(1742, "HUGE_ENUM_HE1742")
    object HE1743 : HugeEnum(1743, "HUGE_ENUM_HE1743")
    object HE1744 : HugeEnum(1744, "HUGE_ENUM_HE1744")
    object HE1745 : HugeEnum(1745, "HUGE_ENUM_HE1745")
    object HE1746 : HugeEnum(1746, "HUGE_ENUM_HE1746")
    object HE1747 : HugeEnum(1747, "HUGE_ENUM_HE1747")
    object HE1748 : HugeEnum(1748, "HUGE_ENUM_HE1748")
    object HE1749 : HugeEnum(1749, "HUGE_ENUM_HE1749")
    object HE1750 : HugeEnum(1750, "HUGE_ENUM_HE1750")
    object HE1751 : HugeEnum(1751, "HUGE_ENUM_HE1751")
    object HE1752 : HugeEnum(1752, "HUGE_ENUM_HE1752")
    object HE1753 : HugeEnum(1753, "HUGE_ENUM_HE1753")
    object HE1754 : HugeEnum(1754, "HUGE_ENUM_HE1754")
    object HE1755 : HugeEnum(1755, "HUGE_ENUM_HE1755")
    object HE1756 : HugeEnum(1756, "HUGE_ENUM_HE1756")
    object HE1757 : HugeEnum(1757, "HUGE_ENUM_HE1757")
    object HE1758 : HugeEnum(1758, "HUGE_ENUM_HE1758")
    object HE1759 : HugeEnum(1759, "HUGE_ENUM_HE1759")
    object HE1760 : HugeEnum(1760, "HUGE_ENUM_HE1760")
    object HE1761 : HugeEnum(1761, "HUGE_ENUM_HE1761")
    object HE1762 : HugeEnum(1762, "HUGE_ENUM_HE1762")
    object HE1763 : HugeEnum(1763, "HUGE_ENUM_HE1763")
    object HE1764 : HugeEnum(1764, "HUGE_ENUM_HE1764")
    object HE1765 : HugeEnum(1765, "HUGE_ENUM_HE1765")
    object HE1766 : HugeEnum(1766, "HUGE_ENUM_HE1766")
    object HE1767 : HugeEnum(1767, "HUGE_ENUM_HE1767")
    object HE1768 : HugeEnum(1768, "HUGE_ENUM_HE1768")
    object HE1769 : HugeEnum(1769, "HUGE_ENUM_HE1769")
    object HE1770 : HugeEnum(1770, "HUGE_ENUM_HE1770")
    object HE1771 : HugeEnum(1771, "HUGE_ENUM_HE1771")
    object HE1772 : HugeEnum(1772, "HUGE_ENUM_HE1772")
    object HE1773 : HugeEnum(1773, "HUGE_ENUM_HE1773")
    object HE1774 : HugeEnum(1774, "HUGE_ENUM_HE1774")
    object HE1775 : HugeEnum(1775, "HUGE_ENUM_HE1775")
    object HE1776 : HugeEnum(1776, "HUGE_ENUM_HE1776")
    object HE1777 : HugeEnum(1777, "HUGE_ENUM_HE1777")
    object HE1778 : HugeEnum(1778, "HUGE_ENUM_HE1778")
    object HE1779 : HugeEnum(1779, "HUGE_ENUM_HE1779")
    object HE1780 : HugeEnum(1780, "HUGE_ENUM_HE1780")
    object HE1781 : HugeEnum(1781, "HUGE_ENUM_HE1781")
    object HE1782 : HugeEnum(1782, "HUGE_ENUM_HE1782")
    object HE1783 : HugeEnum(1783, "HUGE_ENUM_HE1783")
    object HE1784 : HugeEnum(1784, "HUGE_ENUM_HE1784")
    object HE1785 : HugeEnum(1785, "HUGE_ENUM_HE1785")
    object HE1786 : HugeEnum(1786, "HUGE_ENUM_HE1786")
    object HE1787 : HugeEnum(1787, "HUGE_ENUM_HE1787")
    object HE1788 : HugeEnum(1788, "HUGE_ENUM_HE1788")
    object HE1789 : HugeEnum(1789, "HUGE_ENUM_HE1789")
    object HE1790 : HugeEnum(1790, "HUGE_ENUM_HE1790")
    object HE1791 : HugeEnum(1791, "HUGE_ENUM_HE1791")
    object HE1792 : HugeEnum(1792, "HUGE_ENUM_HE1792")
    object HE1793 : HugeEnum(1793, "HUGE_ENUM_HE1793")
    object HE1794 : HugeEnum(1794, "HUGE_ENUM_HE1794")
    object HE1795 : HugeEnum(1795, "HUGE_ENUM_HE1795")
    object HE1796 : HugeEnum(1796, "HUGE_ENUM_HE1796")
    object HE1797 : HugeEnum(1797, "HUGE_ENUM_HE1797")
    object HE1798 : HugeEnum(1798, "HUGE_ENUM_HE1798")
    object HE1799 : HugeEnum(1799, "HUGE_ENUM_HE1799")
    object HE1800 : HugeEnum(1800, "HUGE_ENUM_HE1800")
    object HE1801 : HugeEnum(1801, "HUGE_ENUM_HE1801")
    object HE1802 : HugeEnum(1802, "HUGE_ENUM_HE1802")
    object HE1803 : HugeEnum(1803, "HUGE_ENUM_HE1803")
    object HE1804 : HugeEnum(1804, "HUGE_ENUM_HE1804")
    object HE1805 : HugeEnum(1805, "HUGE_ENUM_HE1805")
    object HE1806 : HugeEnum(1806, "HUGE_ENUM_HE1806")
    object HE1807 : HugeEnum(1807, "HUGE_ENUM_HE1807")
    object HE1808 : HugeEnum(1808, "HUGE_ENUM_HE1808")
    object HE1809 : HugeEnum(1809, "HUGE_ENUM_HE1809")
    object HE1810 : HugeEnum(1810, "HUGE_ENUM_HE1810")
    object HE1811 : HugeEnum(1811, "HUGE_ENUM_HE1811")
    object HE1812 : HugeEnum(1812, "HUGE_ENUM_HE1812")
    object HE1813 : HugeEnum(1813, "HUGE_ENUM_HE1813")
    object HE1814 : HugeEnum(1814, "HUGE_ENUM_HE1814")
    object HE1815 : HugeEnum(1815, "HUGE_ENUM_HE1815")
    object HE1816 : HugeEnum(1816, "HUGE_ENUM_HE1816")
    object HE1817 : HugeEnum(1817, "HUGE_ENUM_HE1817")
    object HE1818 : HugeEnum(1818, "HUGE_ENUM_HE1818")
    object HE1819 : HugeEnum(1819, "HUGE_ENUM_HE1819")
    object HE1820 : HugeEnum(1820, "HUGE_ENUM_HE1820")
    object HE1821 : HugeEnum(1821, "HUGE_ENUM_HE1821")
    object HE1822 : HugeEnum(1822, "HUGE_ENUM_HE1822")
    object HE1823 : HugeEnum(1823, "HUGE_ENUM_HE1823")
    object HE1824 : HugeEnum(1824, "HUGE_ENUM_HE1824")
    object HE1825 : HugeEnum(1825, "HUGE_ENUM_HE1825")
    object HE1826 : HugeEnum(1826, "HUGE_ENUM_HE1826")
    object HE1827 : HugeEnum(1827, "HUGE_ENUM_HE1827")
    object HE1828 : HugeEnum(1828, "HUGE_ENUM_HE1828")
    object HE1829 : HugeEnum(1829, "HUGE_ENUM_HE1829")
    object HE1830 : HugeEnum(1830, "HUGE_ENUM_HE1830")
    object HE1831 : HugeEnum(1831, "HUGE_ENUM_HE1831")
    object HE1832 : HugeEnum(1832, "HUGE_ENUM_HE1832")
    object HE1833 : HugeEnum(1833, "HUGE_ENUM_HE1833")
    object HE1834 : HugeEnum(1834, "HUGE_ENUM_HE1834")
    object HE1835 : HugeEnum(1835, "HUGE_ENUM_HE1835")
    object HE1836 : HugeEnum(1836, "HUGE_ENUM_HE1836")
    object HE1837 : HugeEnum(1837, "HUGE_ENUM_HE1837")
    object HE1838 : HugeEnum(1838, "HUGE_ENUM_HE1838")
    object HE1839 : HugeEnum(1839, "HUGE_ENUM_HE1839")
    object HE1840 : HugeEnum(1840, "HUGE_ENUM_HE1840")
    object HE1841 : HugeEnum(1841, "HUGE_ENUM_HE1841")
    object HE1842 : HugeEnum(1842, "HUGE_ENUM_HE1842")
    object HE1843 : HugeEnum(1843, "HUGE_ENUM_HE1843")
    object HE1844 : HugeEnum(1844, "HUGE_ENUM_HE1844")
    object HE1845 : HugeEnum(1845, "HUGE_ENUM_HE1845")
    object HE1846 : HugeEnum(1846, "HUGE_ENUM_HE1846")
    object HE1847 : HugeEnum(1847, "HUGE_ENUM_HE1847")
    object HE1848 : HugeEnum(1848, "HUGE_ENUM_HE1848")
    object HE1849 : HugeEnum(1849, "HUGE_ENUM_HE1849")
    object HE1850 : HugeEnum(1850, "HUGE_ENUM_HE1850")
    object HE1851 : HugeEnum(1851, "HUGE_ENUM_HE1851")
    object HE1852 : HugeEnum(1852, "HUGE_ENUM_HE1852")
    object HE1853 : HugeEnum(1853, "HUGE_ENUM_HE1853")
    object HE1854 : HugeEnum(1854, "HUGE_ENUM_HE1854")
    object HE1855 : HugeEnum(1855, "HUGE_ENUM_HE1855")
    object HE1856 : HugeEnum(1856, "HUGE_ENUM_HE1856")
    object HE1857 : HugeEnum(1857, "HUGE_ENUM_HE1857")
    object HE1858 : HugeEnum(1858, "HUGE_ENUM_HE1858")
    object HE1859 : HugeEnum(1859, "HUGE_ENUM_HE1859")
    object HE1860 : HugeEnum(1860, "HUGE_ENUM_HE1860")
    object HE1861 : HugeEnum(1861, "HUGE_ENUM_HE1861")
    object HE1862 : HugeEnum(1862, "HUGE_ENUM_HE1862")
    object HE1863 : HugeEnum(1863, "HUGE_ENUM_HE1863")
    object HE1864 : HugeEnum(1864, "HUGE_ENUM_HE1864")
    object HE1865 : HugeEnum(1865, "HUGE_ENUM_HE1865")
    object HE1866 : HugeEnum(1866, "HUGE_ENUM_HE1866")
    object HE1867 : HugeEnum(1867, "HUGE_ENUM_HE1867")
    object HE1868 : HugeEnum(1868, "HUGE_ENUM_HE1868")
    object HE1869 : HugeEnum(1869, "HUGE_ENUM_HE1869")
    object HE1870 : HugeEnum(1870, "HUGE_ENUM_HE1870")
    object HE1871 : HugeEnum(1871, "HUGE_ENUM_HE1871")
    object HE1872 : HugeEnum(1872, "HUGE_ENUM_HE1872")
    object HE1873 : HugeEnum(1873, "HUGE_ENUM_HE1873")
    object HE1874 : HugeEnum(1874, "HUGE_ENUM_HE1874")
    object HE1875 : HugeEnum(1875, "HUGE_ENUM_HE1875")
    object HE1876 : HugeEnum(1876, "HUGE_ENUM_HE1876")
    object HE1877 : HugeEnum(1877, "HUGE_ENUM_HE1877")
    object HE1878 : HugeEnum(1878, "HUGE_ENUM_HE1878")
    object HE1879 : HugeEnum(1879, "HUGE_ENUM_HE1879")
    object HE1880 : HugeEnum(1880, "HUGE_ENUM_HE1880")
    object HE1881 : HugeEnum(1881, "HUGE_ENUM_HE1881")
    object HE1882 : HugeEnum(1882, "HUGE_ENUM_HE1882")
    object HE1883 : HugeEnum(1883, "HUGE_ENUM_HE1883")
    object HE1884 : HugeEnum(1884, "HUGE_ENUM_HE1884")
    object HE1885 : HugeEnum(1885, "HUGE_ENUM_HE1885")
    object HE1886 : HugeEnum(1886, "HUGE_ENUM_HE1886")
    object HE1887 : HugeEnum(1887, "HUGE_ENUM_HE1887")
    object HE1888 : HugeEnum(1888, "HUGE_ENUM_HE1888")
    object HE1889 : HugeEnum(1889, "HUGE_ENUM_HE1889")
    object HE1890 : HugeEnum(1890, "HUGE_ENUM_HE1890")
    object HE1891 : HugeEnum(1891, "HUGE_ENUM_HE1891")
    object HE1892 : HugeEnum(1892, "HUGE_ENUM_HE1892")
    object HE1893 : HugeEnum(1893, "HUGE_ENUM_HE1893")
    object HE1894 : HugeEnum(1894, "HUGE_ENUM_HE1894")
    object HE1895 : HugeEnum(1895, "HUGE_ENUM_HE1895")
    object HE1896 : HugeEnum(1896, "HUGE_ENUM_HE1896")
    object HE1897 : HugeEnum(1897, "HUGE_ENUM_HE1897")
    object HE1898 : HugeEnum(1898, "HUGE_ENUM_HE1898")
    object HE1899 : HugeEnum(1899, "HUGE_ENUM_HE1899")
    object HE1900 : HugeEnum(1900, "HUGE_ENUM_HE1900")
    object HE1901 : HugeEnum(1901, "HUGE_ENUM_HE1901")
    object HE1902 : HugeEnum(1902, "HUGE_ENUM_HE1902")
    object HE1903 : HugeEnum(1903, "HUGE_ENUM_HE1903")
    object HE1904 : HugeEnum(1904, "HUGE_ENUM_HE1904")
    object HE1905 : HugeEnum(1905, "HUGE_ENUM_HE1905")
    object HE1906 : HugeEnum(1906, "HUGE_ENUM_HE1906")
    object HE1907 : HugeEnum(1907, "HUGE_ENUM_HE1907")
    object HE1908 : HugeEnum(1908, "HUGE_ENUM_HE1908")
    object HE1909 : HugeEnum(1909, "HUGE_ENUM_HE1909")
    object HE1910 : HugeEnum(1910, "HUGE_ENUM_HE1910")
    object HE1911 : HugeEnum(1911, "HUGE_ENUM_HE1911")
    object HE1912 : HugeEnum(1912, "HUGE_ENUM_HE1912")
    object HE1913 : HugeEnum(1913, "HUGE_ENUM_HE1913")
    object HE1914 : HugeEnum(1914, "HUGE_ENUM_HE1914")
    object HE1915 : HugeEnum(1915, "HUGE_ENUM_HE1915")
    object HE1916 : HugeEnum(1916, "HUGE_ENUM_HE1916")
    object HE1917 : HugeEnum(1917, "HUGE_ENUM_HE1917")
    object HE1918 : HugeEnum(1918, "HUGE_ENUM_HE1918")
    object HE1919 : HugeEnum(1919, "HUGE_ENUM_HE1919")
    object HE1920 : HugeEnum(1920, "HUGE_ENUM_HE1920")
    object HE1921 : HugeEnum(1921, "HUGE_ENUM_HE1921")
    object HE1922 : HugeEnum(1922, "HUGE_ENUM_HE1922")
    object HE1923 : HugeEnum(1923, "HUGE_ENUM_HE1923")
    object HE1924 : HugeEnum(1924, "HUGE_ENUM_HE1924")
    object HE1925 : HugeEnum(1925, "HUGE_ENUM_HE1925")
    object HE1926 : HugeEnum(1926, "HUGE_ENUM_HE1926")
    object HE1927 : HugeEnum(1927, "HUGE_ENUM_HE1927")
    object HE1928 : HugeEnum(1928, "HUGE_ENUM_HE1928")
    object HE1929 : HugeEnum(1929, "HUGE_ENUM_HE1929")
    object HE1930 : HugeEnum(1930, "HUGE_ENUM_HE1930")
    object HE1931 : HugeEnum(1931, "HUGE_ENUM_HE1931")
    object HE1932 : HugeEnum(1932, "HUGE_ENUM_HE1932")
    object HE1933 : HugeEnum(1933, "HUGE_ENUM_HE1933")
    object HE1934 : HugeEnum(1934, "HUGE_ENUM_HE1934")
    object HE1935 : HugeEnum(1935, "HUGE_ENUM_HE1935")
    object HE1936 : HugeEnum(1936, "HUGE_ENUM_HE1936")
    object HE1937 : HugeEnum(1937, "HUGE_ENUM_HE1937")
    object HE1938 : HugeEnum(1938, "HUGE_ENUM_HE1938")
    object HE1939 : HugeEnum(1939, "HUGE_ENUM_HE1939")
    object HE1940 : HugeEnum(1940, "HUGE_ENUM_HE1940")
    object HE1941 : HugeEnum(1941, "HUGE_ENUM_HE1941")
    object HE1942 : HugeEnum(1942, "HUGE_ENUM_HE1942")
    object HE1943 : HugeEnum(1943, "HUGE_ENUM_HE1943")
    object HE1944 : HugeEnum(1944, "HUGE_ENUM_HE1944")
    object HE1945 : HugeEnum(1945, "HUGE_ENUM_HE1945")
    object HE1946 : HugeEnum(1946, "HUGE_ENUM_HE1946")
    object HE1947 : HugeEnum(1947, "HUGE_ENUM_HE1947")
    object HE1948 : HugeEnum(1948, "HUGE_ENUM_HE1948")
    object HE1949 : HugeEnum(1949, "HUGE_ENUM_HE1949")
    object HE1950 : HugeEnum(1950, "HUGE_ENUM_HE1950")
    object HE1951 : HugeEnum(1951, "HUGE_ENUM_HE1951")
    object HE1952 : HugeEnum(1952, "HUGE_ENUM_HE1952")
    object HE1953 : HugeEnum(1953, "HUGE_ENUM_HE1953")
    object HE1954 : HugeEnum(1954, "HUGE_ENUM_HE1954")
    object HE1955 : HugeEnum(1955, "HUGE_ENUM_HE1955")
    object HE1956 : HugeEnum(1956, "HUGE_ENUM_HE1956")
    object HE1957 : HugeEnum(1957, "HUGE_ENUM_HE1957")
    object HE1958 : HugeEnum(1958, "HUGE_ENUM_HE1958")
    object HE1959 : HugeEnum(1959, "HUGE_ENUM_HE1959")
    object HE1960 : HugeEnum(1960, "HUGE_ENUM_HE1960")
    object HE1961 : HugeEnum(1961, "HUGE_ENUM_HE1961")
    object HE1962 : HugeEnum(1962, "HUGE_ENUM_HE1962")
    object HE1963 : HugeEnum(1963, "HUGE_ENUM_HE1963")
    object HE1964 : HugeEnum(1964, "HUGE_ENUM_HE1964")
    object HE1965 : HugeEnum(1965, "HUGE_ENUM_HE1965")
    object HE1966 : HugeEnum(1966, "HUGE_ENUM_HE1966")
    object HE1967 : HugeEnum(1967, "HUGE_ENUM_HE1967")
    object HE1968 : HugeEnum(1968, "HUGE_ENUM_HE1968")
    object HE1969 : HugeEnum(1969, "HUGE_ENUM_HE1969")
    object HE1970 : HugeEnum(1970, "HUGE_ENUM_HE1970")
    object HE1971 : HugeEnum(1971, "HUGE_ENUM_HE1971")
    object HE1972 : HugeEnum(1972, "HUGE_ENUM_HE1972")
    object HE1973 : HugeEnum(1973, "HUGE_ENUM_HE1973")
    object HE1974 : HugeEnum(1974, "HUGE_ENUM_HE1974")
    object HE1975 : HugeEnum(1975, "HUGE_ENUM_HE1975")
    object HE1976 : HugeEnum(1976, "HUGE_ENUM_HE1976")
    object HE1977 : HugeEnum(1977, "HUGE_ENUM_HE1977")
    object HE1978 : HugeEnum(1978, "HUGE_ENUM_HE1978")
    object HE1979 : HugeEnum(1979, "HUGE_ENUM_HE1979")
    object HE1980 : HugeEnum(1980, "HUGE_ENUM_HE1980")
    object HE1981 : HugeEnum(1981, "HUGE_ENUM_HE1981")
    object HE1982 : HugeEnum(1982, "HUGE_ENUM_HE1982")
    object HE1983 : HugeEnum(1983, "HUGE_ENUM_HE1983")
    object HE1984 : HugeEnum(1984, "HUGE_ENUM_HE1984")
    object HE1985 : HugeEnum(1985, "HUGE_ENUM_HE1985")
    object HE1986 : HugeEnum(1986, "HUGE_ENUM_HE1986")
    object HE1987 : HugeEnum(1987, "HUGE_ENUM_HE1987")
    object HE1988 : HugeEnum(1988, "HUGE_ENUM_HE1988")
    object HE1989 : HugeEnum(1989, "HUGE_ENUM_HE1989")
    object HE1990 : HugeEnum(1990, "HUGE_ENUM_HE1990")
    object HE1991 : HugeEnum(1991, "HUGE_ENUM_HE1991")
    object HE1992 : HugeEnum(1992, "HUGE_ENUM_HE1992")
    object HE1993 : HugeEnum(1993, "HUGE_ENUM_HE1993")
    object HE1994 : HugeEnum(1994, "HUGE_ENUM_HE1994")
    object HE1995 : HugeEnum(1995, "HUGE_ENUM_HE1995")
    object HE1996 : HugeEnum(1996, "HUGE_ENUM_HE1996")
    object HE1997 : HugeEnum(1997, "HUGE_ENUM_HE1997")
    object HE1998 : HugeEnum(1998, "HUGE_ENUM_HE1998")
    object HE1999 : HugeEnum(1999, "HUGE_ENUM_HE1999")
    class UNRECOGNIZED(value: Int) : HugeEnum(value)

    companion object : pbandk.Message.Enum.Companion<HugeEnum> {
        val values: List<HugeEnum> by lazy { listOf(HE0, HE1000, HE1001, HE1002, HE1003, HE1004, HE1005, HE1006, HE1007, HE1008, HE1009, HE1010, HE1011, HE1012, HE1013, HE1014, HE1015, HE1016, HE1017, HE1018, HE1019, HE1020, HE1021, HE1022, HE1023, HE1024, HE1025, HE1026, HE1027, HE1028, HE1029, HE1030, HE1031, HE1032, HE1033, HE1034, HE1035, HE1036, HE1037, HE1038, HE1039, HE1040, HE1041, HE1042, HE1043, HE1044, HE1045, HE1046, HE1047, HE1048, HE1049, HE1050, HE1051, HE1052, HE1053, HE1054, HE1055, HE1056, HE1057, HE1058, HE1059, HE1060, HE1061, HE1062, HE1063, HE1064, HE1065, HE1066, HE1067, HE1068, HE1069, HE1070, HE1071, HE1072, HE1073, HE1074, HE1075, HE1076, HE1077, HE1078, HE1079, HE1080, HE1081, HE1082, HE1083, HE1084, HE1085, HE1086, HE1087, HE1088, HE1089, HE1090, HE1091, HE1092, HE1093, HE1094, HE1095, HE1096, HE1097, HE1098, HE1099, HE1100, HE1101, HE1102, HE1103, HE1104, HE1105, HE1106, HE1107, HE1108, HE1109, HE1110, HE1111, HE1112, HE1113, HE1114, HE1115, HE1116, HE1117, HE1118, HE1119, HE1120, HE1121, HE1122, HE1123, HE1124, HE1125, HE1126, HE1127, HE1128, HE1129, HE1130, HE1131, HE1132, HE1133, HE1134, HE1135, HE1136, HE1137, HE1138, HE1139, HE1140, HE1141, HE1142, HE1143, HE1144, HE1145, HE1146, HE1147, HE1148, HE1149, HE1150, HE1151, HE1152, HE1153, HE1154, HE1155, HE1156, HE1157, HE1158, HE1159, HE1160, HE1161, HE1162, HE1163, HE1164, HE1165, HE1166, HE1167, HE1168, HE1169, HE1170, HE1171, HE1172, HE1173, HE1174, HE1175, HE1176, HE1177, HE1178, HE1179, HE1180, HE1181, HE1182, HE1183, HE1184, HE1185, HE1186, HE1187, HE1188, HE1189, HE1190, HE1191, HE1192, HE1193, HE1194, HE1195, HE1196, HE1197, HE1198, HE1199, HE1200, HE1201, HE1202, HE1203, HE1204, HE1205, HE1206, HE1207, HE1208, HE1209, HE1210, HE1211, HE1212, HE1213, HE1214, HE1215, HE1216, HE1217, HE1218, HE1219, HE1220, HE1221, HE1222, HE1223, HE1224, HE1225, HE1226, HE1227, HE1228, HE1229, HE1230, HE1231, HE1232, HE1233, HE1234, HE1235, HE1236, HE1237, HE1238, HE1239, HE1240, HE1241, HE1242, HE1243, HE1244, HE1245, HE1246, HE1247, HE1248, HE1249, HE1250, HE1251, HE1252, HE1253, HE1254, HE1255, HE1256, HE1257, HE1258, HE1259, HE1260, HE1261, HE1262, HE1263, HE1264, HE1265, HE1266, HE1267, HE1268, HE1269, HE1270, HE1271, HE1272, HE1273, HE1274, HE1275, HE1276, HE1277, HE1278, HE1279, HE1280, HE1281, HE1282, HE1283, HE1284, HE1285, HE1286, HE1287, HE1288, HE1289, HE1290, HE1291, HE1292, HE1293, HE1294, HE1295, HE1296, HE1297, HE1298, HE1299, HE1300, HE1301, HE1302, HE1303, HE1304, HE1305, HE1306, HE1307, HE1308, HE1309, HE1310, HE1311, HE1312, HE1313, HE1314, HE1315, HE1316, HE1317, HE1318, HE1319, HE1320, HE1321, HE1322, HE1323, HE1324, HE1325, HE1326, HE1327, HE1328, HE1329, HE1330, HE1331, HE1332, HE1333, HE1334, HE1335, HE1336, HE1337, HE1338, HE1339, HE1340, HE1341, HE1342, HE1343, HE1344, HE1345, HE1346, HE1347, HE1348, HE1349, HE1350, HE1351, HE1352, HE1353, HE1354, HE1355, HE1356, HE1357, HE1358, HE1359, HE1360, HE1361, HE1362, HE1363, HE1364, HE1365, HE1366, HE1367, HE1368, HE1369, HE1370, HE1371, HE1372, HE1373, HE1374, HE1375, HE1376, HE1377, HE1378, HE1379, HE1380, HE1381, HE1382, HE1383, HE1384, HE1385, HE1386, HE1387, HE1388, HE1389, HE1390, HE1391, HE1392, HE1393, HE1394, HE1395, HE1396, HE1397, HE1398, HE1399, HE1400, HE1401, HE1402, HE1403, HE1404, HE1405, HE1406, HE1407, HE1408, HE1409, HE1410, HE1411, HE1412, HE1413, HE1414, HE1415, HE1416, HE1417, HE1418, HE1419, HE1420, HE1421, HE1422, HE1423, HE1424, HE1425, HE1426, HE1427, HE1428, HE1429, HE1430, HE1431, HE1432, HE1433, HE1434, HE1435, HE1436, HE1437, HE1438, HE1439, HE1440, HE1441, HE1442, HE1443, HE1444, HE1445, HE1446, HE1447, HE1448, HE1449, HE1450, HE1451, HE1452, HE1453, HE1454, HE1455, HE1456, HE1457, HE1458, HE1459, HE1460, HE1461, HE1462, HE1463, HE1464, HE1465, HE1466, HE1467, HE1468, HE1469, HE1470, HE1471, HE1472, HE1473, HE1474, HE1475, HE1476, HE1477, HE1478, HE1479, HE1480, HE1481, HE1482, HE1483, HE1484, HE1485, HE1486, HE1487, HE1488, HE1489, HE1490, HE1491, HE1492, HE1493, HE1494, HE1495, HE1496, HE1497, HE1498, HE1499, HE1500, HE1501, HE1502, HE1503, HE1504, HE1505, HE1506, HE1507, HE1508, HE1509, HE1510, HE1511, HE1512, HE1513, HE1514, HE1515, HE1516, HE1517, HE1518, HE1519, HE1520, HE1521, HE1522, HE1523, HE1524, HE1525, HE1526, HE1527, HE1528, HE1529, HE1530, HE1531, HE1532, HE1533, HE1534, HE1535, HE1536, HE1537, HE1538, HE1539, HE1540, HE1541, HE1542, HE1543, HE1544, HE1545, HE1546, HE1547, HE1548, HE1549, HE1550, HE1551, HE1552, HE1553, HE1554, HE1555, HE1556, HE1557, HE1558, HE1559, HE1560, HE1561, HE1562, HE1563, HE1564, HE1565, HE1566, HE1567, HE1568, HE1569, HE1570, HE1571, HE1572, HE1573, HE1574, HE1575, HE1576, HE1577, HE1578, HE1579, HE1580, HE1581, HE1582, HE1583, HE1584, HE1585, HE1586, HE1587, HE1588, HE1589, HE1590, HE1591, HE1592, HE1593, HE1594, HE1595, HE1596, HE1597, HE1598, HE1599, HE1600, HE1601, HE1602, HE1603, HE1604, HE1605, HE1606, HE1607, HE1608, HE1609, HE1610, HE1611, HE1612, HE1613, HE1614, HE1615, HE1616, HE1617, HE1618, HE1619, HE1620, HE1621, HE1622, HE1623, HE1624, HE1625, HE1626, HE1627, HE1628, HE1629, HE1630, HE1631, HE1632, HE1633, HE1634, HE1635, HE1636, HE1637, HE1638, HE1639, HE1640, HE1641, HE1642, HE1643, HE1644, HE1645, HE1646, HE1647, HE1648, HE1649, HE1650, HE1651, HE1652, HE1653, HE1654, HE1655, HE1656, HE1657, HE1658, HE1659, HE1660, HE1661, HE1662, HE1663, HE1664, HE1665, HE1666, HE1667, HE1668, HE1669, HE1670, HE1671, HE1672, HE1673, HE1674, HE1675, HE1676, HE1677, HE1678, HE1679, HE1680, HE1681, HE1682, HE1683, HE1684, HE1685, HE1686, HE1687, HE1688, HE1689, HE1690, HE1691, HE1692, HE1693, HE1694, HE1695, HE1696, HE1697, HE1698, HE1699, HE1700, HE1701, HE1702, HE1703, HE1704, HE1705, HE1706, HE1707, HE1708, HE1709, HE1710, HE1711, HE1712, HE1713, HE1714, HE1715, HE1716, HE1717, HE1718, HE1719, HE1720, HE1721, HE1722, HE1723, HE1724, HE1725, HE1726, HE1727, HE1728, HE1729, HE1730, HE1731, HE1732, HE1733, HE1734, HE1735, HE1736, HE1737, HE1738, HE1739, HE1740, HE1741, HE1742, HE1743, HE1744, HE1745, HE1746, HE1747, HE1748, HE1749, HE1750, HE1751, HE1752, HE1753, HE1754, HE1755, HE1756, HE1757, HE1758, HE1759, HE1760, HE1761, HE1762, HE1763, HE1764, HE1765, HE1766, HE1767, HE1768, HE1769, HE1770, HE1771, HE1772, HE1773, HE1774, HE1775, HE1776, HE1777, HE1778, HE1779, HE1780, HE1781, HE1782, HE1783, HE1784, HE1785, HE1786, HE1787, HE1788, HE1789, HE1790, HE1791, HE1792, HE1793, HE1794, HE1795, HE1796, HE1797, HE1798, HE1799, HE1800, HE1801, HE1802, HE1803, HE1804, HE1805, HE1806, HE1807, HE1808, HE1809, HE1810, HE1811, HE1812, HE1813, HE1814, HE1815, HE1816, HE1817, HE1818, HE1819, HE1820, HE1821, HE1822, HE1823, HE1824, HE1825, HE1826, HE1827, HE1828, HE1829, HE1830, HE1831, HE1832, HE1833, HE1834, HE1835, HE1836, HE1837, HE1838, HE1839, HE1840, HE1841, HE1842, HE1843, HE1844, HE1845, HE1846, HE1847, HE1848, HE1849, HE1850, HE1851, HE1852, HE1853, HE1854, HE1855, HE1856, HE1857, HE1858, HE1859, HE1860, HE1861, HE1862, HE1863, HE1864, HE1865, HE1866, HE1867, HE1868, HE1869, HE1870, HE1871, HE1872, HE1873, HE1874, HE1875, HE1876, HE1877, HE1878, HE1879, HE1880, HE1881, HE1882, HE1883, HE1884, HE1885, HE1886, HE1887, HE1888, HE1889, HE1890, HE1891, HE1892, HE1893, HE1894, HE1895, HE1896, HE1897, HE1898, HE1899, HE1900, HE1901, HE1902, HE1903, HE1904, HE1905, HE1906, HE1907, HE1908, HE1909, HE1910, HE1911, HE1912, HE1913, HE1914, HE1915, HE1916, HE1917, HE1918, HE1919, HE1920, HE1921, HE1922, HE1923, HE1924, HE1925, HE1926, HE1927, HE1928, HE1929, HE1930, HE1931, HE1932, HE1933, HE1934, HE1935, HE1936, HE1937, HE1938, HE1939, HE1940, HE1941, HE1942, HE1943, HE1944, HE1945, HE1946, HE1947, HE1948, HE1949, HE1950, HE1951, HE1952, HE1953, HE1954, HE1955, HE1956, HE1957, HE1958, HE1959, HE1960, HE1961, HE1962, HE1963, HE1964, HE1965, HE1966, HE1967, HE1968, HE1969, HE1970, HE1971, HE1972, HE1973, HE1974, HE1975, HE1976, HE1977, HE1978, HE1979, HE1980, HE1981, HE1982, HE1983, HE1984, HE1985, HE1986, HE1987, HE1988, HE1989, HE1990, HE1991, HE1992, HE1993, HE1994, HE1995, HE1996, HE1997, HE1998, HE1999) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No HugeEnum with name: $name")
    }
}

data class MessageWithHugeOneof(
    val hugeOneof: HugeOneof<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    sealed class HugeOneof<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class Oneof1000(oneof1000: Int = 0) : HugeOneof<Int>(oneof1000)
        class Oneof1001(oneof1001: Int = 0) : HugeOneof<Int>(oneof1001)
        class Oneof1002(oneof1002: Int = 0) : HugeOneof<Int>(oneof1002)
        class Oneof1003(oneof1003: Int = 0) : HugeOneof<Int>(oneof1003)
        class Oneof1004(oneof1004: Int = 0) : HugeOneof<Int>(oneof1004)
        class Oneof1005(oneof1005: Int = 0) : HugeOneof<Int>(oneof1005)
        class Oneof1006(oneof1006: Int = 0) : HugeOneof<Int>(oneof1006)
        class Oneof1007(oneof1007: Int = 0) : HugeOneof<Int>(oneof1007)
        class Oneof1008(oneof1008: Int = 0) : HugeOneof<Int>(oneof1008)
        class Oneof1009(oneof1009: Int = 0) : HugeOneof<Int>(oneof1009)
        class Oneof1010(oneof1010: Int = 0) : HugeOneof<Int>(oneof1010)
        class Oneof1011(oneof1011: Int = 0) : HugeOneof<Int>(oneof1011)
        class Oneof1012(oneof1012: Int = 0) : HugeOneof<Int>(oneof1012)
        class Oneof1013(oneof1013: Int = 0) : HugeOneof<Int>(oneof1013)
        class Oneof1014(oneof1014: Int = 0) : HugeOneof<Int>(oneof1014)
        class Oneof1015(oneof1015: Int = 0) : HugeOneof<Int>(oneof1015)
        class Oneof1016(oneof1016: Int = 0) : HugeOneof<Int>(oneof1016)
        class Oneof1017(oneof1017: Int = 0) : HugeOneof<Int>(oneof1017)
        class Oneof1018(oneof1018: Int = 0) : HugeOneof<Int>(oneof1018)
        class Oneof1019(oneof1019: Int = 0) : HugeOneof<Int>(oneof1019)
        class Oneof1020(oneof1020: Int = 0) : HugeOneof<Int>(oneof1020)
        class Oneof1021(oneof1021: Int = 0) : HugeOneof<Int>(oneof1021)
        class Oneof1022(oneof1022: Int = 0) : HugeOneof<Int>(oneof1022)
        class Oneof1023(oneof1023: Int = 0) : HugeOneof<Int>(oneof1023)
        class Oneof1024(oneof1024: Int = 0) : HugeOneof<Int>(oneof1024)
        class Oneof1025(oneof1025: Int = 0) : HugeOneof<Int>(oneof1025)
        class Oneof1026(oneof1026: Int = 0) : HugeOneof<Int>(oneof1026)
        class Oneof1027(oneof1027: Int = 0) : HugeOneof<Int>(oneof1027)
        class Oneof1028(oneof1028: Int = 0) : HugeOneof<Int>(oneof1028)
        class Oneof1029(oneof1029: Int = 0) : HugeOneof<Int>(oneof1029)
        class Oneof1030(oneof1030: Int = 0) : HugeOneof<Int>(oneof1030)
        class Oneof1031(oneof1031: Int = 0) : HugeOneof<Int>(oneof1031)
        class Oneof1032(oneof1032: Int = 0) : HugeOneof<Int>(oneof1032)
        class Oneof1033(oneof1033: Int = 0) : HugeOneof<Int>(oneof1033)
        class Oneof1034(oneof1034: Int = 0) : HugeOneof<Int>(oneof1034)
        class Oneof1035(oneof1035: Int = 0) : HugeOneof<Int>(oneof1035)
        class Oneof1036(oneof1036: Int = 0) : HugeOneof<Int>(oneof1036)
        class Oneof1037(oneof1037: Int = 0) : HugeOneof<Int>(oneof1037)
        class Oneof1038(oneof1038: Int = 0) : HugeOneof<Int>(oneof1038)
        class Oneof1039(oneof1039: Int = 0) : HugeOneof<Int>(oneof1039)
        class Oneof1040(oneof1040: Int = 0) : HugeOneof<Int>(oneof1040)
        class Oneof1041(oneof1041: Int = 0) : HugeOneof<Int>(oneof1041)
        class Oneof1042(oneof1042: Int = 0) : HugeOneof<Int>(oneof1042)
        class Oneof1043(oneof1043: Int = 0) : HugeOneof<Int>(oneof1043)
        class Oneof1044(oneof1044: Int = 0) : HugeOneof<Int>(oneof1044)
        class Oneof1045(oneof1045: Int = 0) : HugeOneof<Int>(oneof1045)
        class Oneof1046(oneof1046: Int = 0) : HugeOneof<Int>(oneof1046)
        class Oneof1047(oneof1047: Int = 0) : HugeOneof<Int>(oneof1047)
        class Oneof1048(oneof1048: Int = 0) : HugeOneof<Int>(oneof1048)
        class Oneof1049(oneof1049: Int = 0) : HugeOneof<Int>(oneof1049)
        class Oneof1050(oneof1050: Int = 0) : HugeOneof<Int>(oneof1050)
        class Oneof1051(oneof1051: Int = 0) : HugeOneof<Int>(oneof1051)
        class Oneof1052(oneof1052: Int = 0) : HugeOneof<Int>(oneof1052)
        class Oneof1053(oneof1053: Int = 0) : HugeOneof<Int>(oneof1053)
        class Oneof1054(oneof1054: Int = 0) : HugeOneof<Int>(oneof1054)
        class Oneof1055(oneof1055: Int = 0) : HugeOneof<Int>(oneof1055)
        class Oneof1056(oneof1056: Int = 0) : HugeOneof<Int>(oneof1056)
        class Oneof1057(oneof1057: Int = 0) : HugeOneof<Int>(oneof1057)
        class Oneof1058(oneof1058: Int = 0) : HugeOneof<Int>(oneof1058)
        class Oneof1059(oneof1059: Int = 0) : HugeOneof<Int>(oneof1059)
        class Oneof1060(oneof1060: Int = 0) : HugeOneof<Int>(oneof1060)
        class Oneof1061(oneof1061: Int = 0) : HugeOneof<Int>(oneof1061)
        class Oneof1062(oneof1062: Int = 0) : HugeOneof<Int>(oneof1062)
        class Oneof1063(oneof1063: Int = 0) : HugeOneof<Int>(oneof1063)
        class Oneof1064(oneof1064: Int = 0) : HugeOneof<Int>(oneof1064)
        class Oneof1065(oneof1065: Int = 0) : HugeOneof<Int>(oneof1065)
        class Oneof1066(oneof1066: Int = 0) : HugeOneof<Int>(oneof1066)
        class Oneof1067(oneof1067: Int = 0) : HugeOneof<Int>(oneof1067)
        class Oneof1068(oneof1068: Int = 0) : HugeOneof<Int>(oneof1068)
        class Oneof1069(oneof1069: Int = 0) : HugeOneof<Int>(oneof1069)
        class Oneof1070(oneof1070: Int = 0) : HugeOneof<Int>(oneof1070)
        class Oneof1071(oneof1071: Int = 0) : HugeOneof<Int>(oneof1071)
        class Oneof1072(oneof1072: Int = 0) : HugeOneof<Int>(oneof1072)
        class Oneof1073(oneof1073: Int = 0) : HugeOneof<Int>(oneof1073)
        class Oneof1074(oneof1074: Int = 0) : HugeOneof<Int>(oneof1074)
        class Oneof1075(oneof1075: Int = 0) : HugeOneof<Int>(oneof1075)
        class Oneof1076(oneof1076: Int = 0) : HugeOneof<Int>(oneof1076)
        class Oneof1077(oneof1077: Int = 0) : HugeOneof<Int>(oneof1077)
        class Oneof1078(oneof1078: Int = 0) : HugeOneof<Int>(oneof1078)
        class Oneof1079(oneof1079: Int = 0) : HugeOneof<Int>(oneof1079)
        class Oneof1080(oneof1080: Int = 0) : HugeOneof<Int>(oneof1080)
        class Oneof1081(oneof1081: Int = 0) : HugeOneof<Int>(oneof1081)
        class Oneof1082(oneof1082: Int = 0) : HugeOneof<Int>(oneof1082)
        class Oneof1083(oneof1083: Int = 0) : HugeOneof<Int>(oneof1083)
        class Oneof1084(oneof1084: Int = 0) : HugeOneof<Int>(oneof1084)
        class Oneof1085(oneof1085: Int = 0) : HugeOneof<Int>(oneof1085)
        class Oneof1086(oneof1086: Int = 0) : HugeOneof<Int>(oneof1086)
        class Oneof1087(oneof1087: Int = 0) : HugeOneof<Int>(oneof1087)
        class Oneof1088(oneof1088: Int = 0) : HugeOneof<Int>(oneof1088)
        class Oneof1089(oneof1089: Int = 0) : HugeOneof<Int>(oneof1089)
        class Oneof1090(oneof1090: Int = 0) : HugeOneof<Int>(oneof1090)
        class Oneof1091(oneof1091: Int = 0) : HugeOneof<Int>(oneof1091)
        class Oneof1092(oneof1092: Int = 0) : HugeOneof<Int>(oneof1092)
        class Oneof1093(oneof1093: Int = 0) : HugeOneof<Int>(oneof1093)
        class Oneof1094(oneof1094: Int = 0) : HugeOneof<Int>(oneof1094)
        class Oneof1095(oneof1095: Int = 0) : HugeOneof<Int>(oneof1095)
        class Oneof1096(oneof1096: Int = 0) : HugeOneof<Int>(oneof1096)
        class Oneof1097(oneof1097: Int = 0) : HugeOneof<Int>(oneof1097)
        class Oneof1098(oneof1098: Int = 0) : HugeOneof<Int>(oneof1098)
        class Oneof1099(oneof1099: Int = 0) : HugeOneof<Int>(oneof1099)
        class Oneof1100(oneof1100: Int = 0) : HugeOneof<Int>(oneof1100)
        class Oneof1101(oneof1101: Int = 0) : HugeOneof<Int>(oneof1101)
        class Oneof1102(oneof1102: Int = 0) : HugeOneof<Int>(oneof1102)
        class Oneof1103(oneof1103: Int = 0) : HugeOneof<Int>(oneof1103)
        class Oneof1104(oneof1104: Int = 0) : HugeOneof<Int>(oneof1104)
        class Oneof1105(oneof1105: Int = 0) : HugeOneof<Int>(oneof1105)
        class Oneof1106(oneof1106: Int = 0) : HugeOneof<Int>(oneof1106)
        class Oneof1107(oneof1107: Int = 0) : HugeOneof<Int>(oneof1107)
        class Oneof1108(oneof1108: Int = 0) : HugeOneof<Int>(oneof1108)
        class Oneof1109(oneof1109: Int = 0) : HugeOneof<Int>(oneof1109)
        class Oneof1110(oneof1110: Int = 0) : HugeOneof<Int>(oneof1110)
        class Oneof1111(oneof1111: Int = 0) : HugeOneof<Int>(oneof1111)
        class Oneof1112(oneof1112: Int = 0) : HugeOneof<Int>(oneof1112)
        class Oneof1113(oneof1113: Int = 0) : HugeOneof<Int>(oneof1113)
        class Oneof1114(oneof1114: Int = 0) : HugeOneof<Int>(oneof1114)
        class Oneof1115(oneof1115: Int = 0) : HugeOneof<Int>(oneof1115)
        class Oneof1116(oneof1116: Int = 0) : HugeOneof<Int>(oneof1116)
        class Oneof1117(oneof1117: Int = 0) : HugeOneof<Int>(oneof1117)
        class Oneof1118(oneof1118: Int = 0) : HugeOneof<Int>(oneof1118)
        class Oneof1119(oneof1119: Int = 0) : HugeOneof<Int>(oneof1119)
        class Oneof1120(oneof1120: Int = 0) : HugeOneof<Int>(oneof1120)
        class Oneof1121(oneof1121: Int = 0) : HugeOneof<Int>(oneof1121)
        class Oneof1122(oneof1122: Int = 0) : HugeOneof<Int>(oneof1122)
        class Oneof1123(oneof1123: Int = 0) : HugeOneof<Int>(oneof1123)
        class Oneof1124(oneof1124: Int = 0) : HugeOneof<Int>(oneof1124)
        class Oneof1125(oneof1125: Int = 0) : HugeOneof<Int>(oneof1125)
        class Oneof1126(oneof1126: Int = 0) : HugeOneof<Int>(oneof1126)
        class Oneof1127(oneof1127: Int = 0) : HugeOneof<Int>(oneof1127)
        class Oneof1128(oneof1128: Int = 0) : HugeOneof<Int>(oneof1128)
        class Oneof1129(oneof1129: Int = 0) : HugeOneof<Int>(oneof1129)
        class Oneof1130(oneof1130: Int = 0) : HugeOneof<Int>(oneof1130)
        class Oneof1131(oneof1131: Int = 0) : HugeOneof<Int>(oneof1131)
        class Oneof1132(oneof1132: Int = 0) : HugeOneof<Int>(oneof1132)
        class Oneof1133(oneof1133: Int = 0) : HugeOneof<Int>(oneof1133)
        class Oneof1134(oneof1134: Int = 0) : HugeOneof<Int>(oneof1134)
        class Oneof1135(oneof1135: Int = 0) : HugeOneof<Int>(oneof1135)
        class Oneof1136(oneof1136: Int = 0) : HugeOneof<Int>(oneof1136)
        class Oneof1137(oneof1137: Int = 0) : HugeOneof<Int>(oneof1137)
        class Oneof1138(oneof1138: Int = 0) : HugeOneof<Int>(oneof1138)
        class Oneof1139(oneof1139: Int = 0) : HugeOneof<Int>(oneof1139)
        class Oneof1140(oneof1140: Int = 0) : HugeOneof<Int>(oneof1140)
        class Oneof1141(oneof1141: Int = 0) : HugeOneof<Int>(oneof1141)
        class Oneof1142(oneof1142: Int = 0) : HugeOneof<Int>(oneof1142)
        class Oneof1143(oneof1143: Int = 0) : HugeOneof<Int>(oneof1143)
        class Oneof1144(oneof1144: Int = 0) : HugeOneof<Int>(oneof1144)
        class Oneof1145(oneof1145: Int = 0) : HugeOneof<Int>(oneof1145)
        class Oneof1146(oneof1146: Int = 0) : HugeOneof<Int>(oneof1146)
        class Oneof1147(oneof1147: Int = 0) : HugeOneof<Int>(oneof1147)
        class Oneof1148(oneof1148: Int = 0) : HugeOneof<Int>(oneof1148)
        class Oneof1149(oneof1149: Int = 0) : HugeOneof<Int>(oneof1149)
        class Oneof1150(oneof1150: Int = 0) : HugeOneof<Int>(oneof1150)
        class Oneof1151(oneof1151: Int = 0) : HugeOneof<Int>(oneof1151)
        class Oneof1152(oneof1152: Int = 0) : HugeOneof<Int>(oneof1152)
        class Oneof1153(oneof1153: Int = 0) : HugeOneof<Int>(oneof1153)
        class Oneof1154(oneof1154: Int = 0) : HugeOneof<Int>(oneof1154)
        class Oneof1155(oneof1155: Int = 0) : HugeOneof<Int>(oneof1155)
        class Oneof1156(oneof1156: Int = 0) : HugeOneof<Int>(oneof1156)
        class Oneof1157(oneof1157: Int = 0) : HugeOneof<Int>(oneof1157)
        class Oneof1158(oneof1158: Int = 0) : HugeOneof<Int>(oneof1158)
        class Oneof1159(oneof1159: Int = 0) : HugeOneof<Int>(oneof1159)
        class Oneof1160(oneof1160: Int = 0) : HugeOneof<Int>(oneof1160)
        class Oneof1161(oneof1161: Int = 0) : HugeOneof<Int>(oneof1161)
        class Oneof1162(oneof1162: Int = 0) : HugeOneof<Int>(oneof1162)
        class Oneof1163(oneof1163: Int = 0) : HugeOneof<Int>(oneof1163)
        class Oneof1164(oneof1164: Int = 0) : HugeOneof<Int>(oneof1164)
        class Oneof1165(oneof1165: Int = 0) : HugeOneof<Int>(oneof1165)
        class Oneof1166(oneof1166: Int = 0) : HugeOneof<Int>(oneof1166)
        class Oneof1167(oneof1167: Int = 0) : HugeOneof<Int>(oneof1167)
        class Oneof1168(oneof1168: Int = 0) : HugeOneof<Int>(oneof1168)
        class Oneof1169(oneof1169: Int = 0) : HugeOneof<Int>(oneof1169)
        class Oneof1170(oneof1170: Int = 0) : HugeOneof<Int>(oneof1170)
        class Oneof1171(oneof1171: Int = 0) : HugeOneof<Int>(oneof1171)
        class Oneof1172(oneof1172: Int = 0) : HugeOneof<Int>(oneof1172)
        class Oneof1173(oneof1173: Int = 0) : HugeOneof<Int>(oneof1173)
        class Oneof1174(oneof1174: Int = 0) : HugeOneof<Int>(oneof1174)
        class Oneof1175(oneof1175: Int = 0) : HugeOneof<Int>(oneof1175)
        class Oneof1176(oneof1176: Int = 0) : HugeOneof<Int>(oneof1176)
        class Oneof1177(oneof1177: Int = 0) : HugeOneof<Int>(oneof1177)
        class Oneof1178(oneof1178: Int = 0) : HugeOneof<Int>(oneof1178)
        class Oneof1179(oneof1179: Int = 0) : HugeOneof<Int>(oneof1179)
        class Oneof1180(oneof1180: Int = 0) : HugeOneof<Int>(oneof1180)
        class Oneof1181(oneof1181: Int = 0) : HugeOneof<Int>(oneof1181)
        class Oneof1182(oneof1182: Int = 0) : HugeOneof<Int>(oneof1182)
        class Oneof1183(oneof1183: Int = 0) : HugeOneof<Int>(oneof1183)
        class Oneof1184(oneof1184: Int = 0) : HugeOneof<Int>(oneof1184)
        class Oneof1185(oneof1185: Int = 0) : HugeOneof<Int>(oneof1185)
        class Oneof1186(oneof1186: Int = 0) : HugeOneof<Int>(oneof1186)
        class Oneof1187(oneof1187: Int = 0) : HugeOneof<Int>(oneof1187)
        class Oneof1188(oneof1188: Int = 0) : HugeOneof<Int>(oneof1188)
        class Oneof1189(oneof1189: Int = 0) : HugeOneof<Int>(oneof1189)
        class Oneof1190(oneof1190: Int = 0) : HugeOneof<Int>(oneof1190)
        class Oneof1191(oneof1191: Int = 0) : HugeOneof<Int>(oneof1191)
        class Oneof1192(oneof1192: Int = 0) : HugeOneof<Int>(oneof1192)
        class Oneof1193(oneof1193: Int = 0) : HugeOneof<Int>(oneof1193)
        class Oneof1194(oneof1194: Int = 0) : HugeOneof<Int>(oneof1194)
        class Oneof1195(oneof1195: Int = 0) : HugeOneof<Int>(oneof1195)
        class Oneof1196(oneof1196: Int = 0) : HugeOneof<Int>(oneof1196)
        class Oneof1197(oneof1197: Int = 0) : HugeOneof<Int>(oneof1197)
        class Oneof1198(oneof1198: Int = 0) : HugeOneof<Int>(oneof1198)
        class Oneof1199(oneof1199: Int = 0) : HugeOneof<Int>(oneof1199)
        class Oneof1200(oneof1200: Int = 0) : HugeOneof<Int>(oneof1200)
        class Oneof1201(oneof1201: Int = 0) : HugeOneof<Int>(oneof1201)
        class Oneof1202(oneof1202: Int = 0) : HugeOneof<Int>(oneof1202)
        class Oneof1203(oneof1203: Int = 0) : HugeOneof<Int>(oneof1203)
        class Oneof1204(oneof1204: Int = 0) : HugeOneof<Int>(oneof1204)
        class Oneof1205(oneof1205: Int = 0) : HugeOneof<Int>(oneof1205)
        class Oneof1206(oneof1206: Int = 0) : HugeOneof<Int>(oneof1206)
        class Oneof1207(oneof1207: Int = 0) : HugeOneof<Int>(oneof1207)
        class Oneof1208(oneof1208: Int = 0) : HugeOneof<Int>(oneof1208)
        class Oneof1209(oneof1209: Int = 0) : HugeOneof<Int>(oneof1209)
        class Oneof1210(oneof1210: Int = 0) : HugeOneof<Int>(oneof1210)
        class Oneof1211(oneof1211: Int = 0) : HugeOneof<Int>(oneof1211)
        class Oneof1212(oneof1212: Int = 0) : HugeOneof<Int>(oneof1212)
        class Oneof1213(oneof1213: Int = 0) : HugeOneof<Int>(oneof1213)
        class Oneof1214(oneof1214: Int = 0) : HugeOneof<Int>(oneof1214)
        class Oneof1215(oneof1215: Int = 0) : HugeOneof<Int>(oneof1215)
        class Oneof1216(oneof1216: Int = 0) : HugeOneof<Int>(oneof1216)
        class Oneof1217(oneof1217: Int = 0) : HugeOneof<Int>(oneof1217)
        class Oneof1218(oneof1218: Int = 0) : HugeOneof<Int>(oneof1218)
        class Oneof1219(oneof1219: Int = 0) : HugeOneof<Int>(oneof1219)
        class Oneof1220(oneof1220: Int = 0) : HugeOneof<Int>(oneof1220)
        class Oneof1221(oneof1221: Int = 0) : HugeOneof<Int>(oneof1221)
        class Oneof1222(oneof1222: Int = 0) : HugeOneof<Int>(oneof1222)
        class Oneof1223(oneof1223: Int = 0) : HugeOneof<Int>(oneof1223)
        class Oneof1224(oneof1224: Int = 0) : HugeOneof<Int>(oneof1224)
        class Oneof1225(oneof1225: Int = 0) : HugeOneof<Int>(oneof1225)
        class Oneof1226(oneof1226: Int = 0) : HugeOneof<Int>(oneof1226)
        class Oneof1227(oneof1227: Int = 0) : HugeOneof<Int>(oneof1227)
        class Oneof1228(oneof1228: Int = 0) : HugeOneof<Int>(oneof1228)
        class Oneof1229(oneof1229: Int = 0) : HugeOneof<Int>(oneof1229)
        class Oneof1230(oneof1230: Int = 0) : HugeOneof<Int>(oneof1230)
        class Oneof1231(oneof1231: Int = 0) : HugeOneof<Int>(oneof1231)
        class Oneof1232(oneof1232: Int = 0) : HugeOneof<Int>(oneof1232)
        class Oneof1233(oneof1233: Int = 0) : HugeOneof<Int>(oneof1233)
        class Oneof1234(oneof1234: Int = 0) : HugeOneof<Int>(oneof1234)
        class Oneof1235(oneof1235: Int = 0) : HugeOneof<Int>(oneof1235)
        class Oneof1236(oneof1236: Int = 0) : HugeOneof<Int>(oneof1236)
        class Oneof1237(oneof1237: Int = 0) : HugeOneof<Int>(oneof1237)
        class Oneof1238(oneof1238: Int = 0) : HugeOneof<Int>(oneof1238)
        class Oneof1239(oneof1239: Int = 0) : HugeOneof<Int>(oneof1239)
        class Oneof1240(oneof1240: Int = 0) : HugeOneof<Int>(oneof1240)
        class Oneof1241(oneof1241: Int = 0) : HugeOneof<Int>(oneof1241)
        class Oneof1242(oneof1242: Int = 0) : HugeOneof<Int>(oneof1242)
        class Oneof1243(oneof1243: Int = 0) : HugeOneof<Int>(oneof1243)
        class Oneof1244(oneof1244: Int = 0) : HugeOneof<Int>(oneof1244)
        class Oneof1245(oneof1245: Int = 0) : HugeOneof<Int>(oneof1245)
        class Oneof1246(oneof1246: Int = 0) : HugeOneof<Int>(oneof1246)
        class Oneof1247(oneof1247: Int = 0) : HugeOneof<Int>(oneof1247)
        class Oneof1248(oneof1248: Int = 0) : HugeOneof<Int>(oneof1248)
        class Oneof1249(oneof1249: Int = 0) : HugeOneof<Int>(oneof1249)
        class Oneof1250(oneof1250: Int = 0) : HugeOneof<Int>(oneof1250)
        class Oneof1251(oneof1251: Int = 0) : HugeOneof<Int>(oneof1251)
        class Oneof1252(oneof1252: Int = 0) : HugeOneof<Int>(oneof1252)
        class Oneof1253(oneof1253: Int = 0) : HugeOneof<Int>(oneof1253)
        class Oneof1254(oneof1254: Int = 0) : HugeOneof<Int>(oneof1254)
        class Oneof1255(oneof1255: Int = 0) : HugeOneof<Int>(oneof1255)
        class Oneof1256(oneof1256: Int = 0) : HugeOneof<Int>(oneof1256)
        class Oneof1257(oneof1257: Int = 0) : HugeOneof<Int>(oneof1257)
        class Oneof1258(oneof1258: Int = 0) : HugeOneof<Int>(oneof1258)
        class Oneof1259(oneof1259: Int = 0) : HugeOneof<Int>(oneof1259)
        class Oneof1260(oneof1260: Int = 0) : HugeOneof<Int>(oneof1260)
        class Oneof1261(oneof1261: Int = 0) : HugeOneof<Int>(oneof1261)
        class Oneof1262(oneof1262: Int = 0) : HugeOneof<Int>(oneof1262)
        class Oneof1263(oneof1263: Int = 0) : HugeOneof<Int>(oneof1263)
        class Oneof1264(oneof1264: Int = 0) : HugeOneof<Int>(oneof1264)
        class Oneof1265(oneof1265: Int = 0) : HugeOneof<Int>(oneof1265)
        class Oneof1266(oneof1266: Int = 0) : HugeOneof<Int>(oneof1266)
        class Oneof1267(oneof1267: Int = 0) : HugeOneof<Int>(oneof1267)
        class Oneof1268(oneof1268: Int = 0) : HugeOneof<Int>(oneof1268)
        class Oneof1269(oneof1269: Int = 0) : HugeOneof<Int>(oneof1269)
        class Oneof1270(oneof1270: Int = 0) : HugeOneof<Int>(oneof1270)
        class Oneof1271(oneof1271: Int = 0) : HugeOneof<Int>(oneof1271)
        class Oneof1272(oneof1272: Int = 0) : HugeOneof<Int>(oneof1272)
        class Oneof1273(oneof1273: Int = 0) : HugeOneof<Int>(oneof1273)
        class Oneof1274(oneof1274: Int = 0) : HugeOneof<Int>(oneof1274)
        class Oneof1275(oneof1275: Int = 0) : HugeOneof<Int>(oneof1275)
        class Oneof1276(oneof1276: Int = 0) : HugeOneof<Int>(oneof1276)
        class Oneof1277(oneof1277: Int = 0) : HugeOneof<Int>(oneof1277)
        class Oneof1278(oneof1278: Int = 0) : HugeOneof<Int>(oneof1278)
        class Oneof1279(oneof1279: Int = 0) : HugeOneof<Int>(oneof1279)
        class Oneof1280(oneof1280: Int = 0) : HugeOneof<Int>(oneof1280)
        class Oneof1281(oneof1281: Int = 0) : HugeOneof<Int>(oneof1281)
        class Oneof1282(oneof1282: Int = 0) : HugeOneof<Int>(oneof1282)
        class Oneof1283(oneof1283: Int = 0) : HugeOneof<Int>(oneof1283)
        class Oneof1284(oneof1284: Int = 0) : HugeOneof<Int>(oneof1284)
        class Oneof1285(oneof1285: Int = 0) : HugeOneof<Int>(oneof1285)
        class Oneof1286(oneof1286: Int = 0) : HugeOneof<Int>(oneof1286)
        class Oneof1287(oneof1287: Int = 0) : HugeOneof<Int>(oneof1287)
        class Oneof1288(oneof1288: Int = 0) : HugeOneof<Int>(oneof1288)
        class Oneof1289(oneof1289: Int = 0) : HugeOneof<Int>(oneof1289)
        class Oneof1290(oneof1290: Int = 0) : HugeOneof<Int>(oneof1290)
        class Oneof1291(oneof1291: Int = 0) : HugeOneof<Int>(oneof1291)
        class Oneof1292(oneof1292: Int = 0) : HugeOneof<Int>(oneof1292)
        class Oneof1293(oneof1293: Int = 0) : HugeOneof<Int>(oneof1293)
        class Oneof1294(oneof1294: Int = 0) : HugeOneof<Int>(oneof1294)
        class Oneof1295(oneof1295: Int = 0) : HugeOneof<Int>(oneof1295)
        class Oneof1296(oneof1296: Int = 0) : HugeOneof<Int>(oneof1296)
        class Oneof1297(oneof1297: Int = 0) : HugeOneof<Int>(oneof1297)
        class Oneof1298(oneof1298: Int = 0) : HugeOneof<Int>(oneof1298)
        class Oneof1299(oneof1299: Int = 0) : HugeOneof<Int>(oneof1299)
        class Oneof1300(oneof1300: Int = 0) : HugeOneof<Int>(oneof1300)
        class Oneof1301(oneof1301: Int = 0) : HugeOneof<Int>(oneof1301)
        class Oneof1302(oneof1302: Int = 0) : HugeOneof<Int>(oneof1302)
        class Oneof1303(oneof1303: Int = 0) : HugeOneof<Int>(oneof1303)
        class Oneof1304(oneof1304: Int = 0) : HugeOneof<Int>(oneof1304)
        class Oneof1305(oneof1305: Int = 0) : HugeOneof<Int>(oneof1305)
        class Oneof1306(oneof1306: Int = 0) : HugeOneof<Int>(oneof1306)
        class Oneof1307(oneof1307: Int = 0) : HugeOneof<Int>(oneof1307)
        class Oneof1308(oneof1308: Int = 0) : HugeOneof<Int>(oneof1308)
        class Oneof1309(oneof1309: Int = 0) : HugeOneof<Int>(oneof1309)
        class Oneof1310(oneof1310: Int = 0) : HugeOneof<Int>(oneof1310)
        class Oneof1311(oneof1311: Int = 0) : HugeOneof<Int>(oneof1311)
        class Oneof1312(oneof1312: Int = 0) : HugeOneof<Int>(oneof1312)
        class Oneof1313(oneof1313: Int = 0) : HugeOneof<Int>(oneof1313)
        class Oneof1314(oneof1314: Int = 0) : HugeOneof<Int>(oneof1314)
        class Oneof1315(oneof1315: Int = 0) : HugeOneof<Int>(oneof1315)
        class Oneof1316(oneof1316: Int = 0) : HugeOneof<Int>(oneof1316)
        class Oneof1317(oneof1317: Int = 0) : HugeOneof<Int>(oneof1317)
        class Oneof1318(oneof1318: Int = 0) : HugeOneof<Int>(oneof1318)
        class Oneof1319(oneof1319: Int = 0) : HugeOneof<Int>(oneof1319)
        class Oneof1320(oneof1320: Int = 0) : HugeOneof<Int>(oneof1320)
        class Oneof1321(oneof1321: Int = 0) : HugeOneof<Int>(oneof1321)
        class Oneof1322(oneof1322: Int = 0) : HugeOneof<Int>(oneof1322)
        class Oneof1323(oneof1323: Int = 0) : HugeOneof<Int>(oneof1323)
        class Oneof1324(oneof1324: Int = 0) : HugeOneof<Int>(oneof1324)
        class Oneof1325(oneof1325: Int = 0) : HugeOneof<Int>(oneof1325)
        class Oneof1326(oneof1326: Int = 0) : HugeOneof<Int>(oneof1326)
        class Oneof1327(oneof1327: Int = 0) : HugeOneof<Int>(oneof1327)
        class Oneof1328(oneof1328: Int = 0) : HugeOneof<Int>(oneof1328)
        class Oneof1329(oneof1329: Int = 0) : HugeOneof<Int>(oneof1329)
        class Oneof1330(oneof1330: Int = 0) : HugeOneof<Int>(oneof1330)
        class Oneof1331(oneof1331: Int = 0) : HugeOneof<Int>(oneof1331)
        class Oneof1332(oneof1332: Int = 0) : HugeOneof<Int>(oneof1332)
        class Oneof1333(oneof1333: Int = 0) : HugeOneof<Int>(oneof1333)
        class Oneof1334(oneof1334: Int = 0) : HugeOneof<Int>(oneof1334)
        class Oneof1335(oneof1335: Int = 0) : HugeOneof<Int>(oneof1335)
        class Oneof1336(oneof1336: Int = 0) : HugeOneof<Int>(oneof1336)
        class Oneof1337(oneof1337: Int = 0) : HugeOneof<Int>(oneof1337)
        class Oneof1338(oneof1338: Int = 0) : HugeOneof<Int>(oneof1338)
        class Oneof1339(oneof1339: Int = 0) : HugeOneof<Int>(oneof1339)
        class Oneof1340(oneof1340: Int = 0) : HugeOneof<Int>(oneof1340)
        class Oneof1341(oneof1341: Int = 0) : HugeOneof<Int>(oneof1341)
        class Oneof1342(oneof1342: Int = 0) : HugeOneof<Int>(oneof1342)
        class Oneof1343(oneof1343: Int = 0) : HugeOneof<Int>(oneof1343)
        class Oneof1344(oneof1344: Int = 0) : HugeOneof<Int>(oneof1344)
        class Oneof1345(oneof1345: Int = 0) : HugeOneof<Int>(oneof1345)
        class Oneof1346(oneof1346: Int = 0) : HugeOneof<Int>(oneof1346)
        class Oneof1347(oneof1347: Int = 0) : HugeOneof<Int>(oneof1347)
        class Oneof1348(oneof1348: Int = 0) : HugeOneof<Int>(oneof1348)
        class Oneof1349(oneof1349: Int = 0) : HugeOneof<Int>(oneof1349)
        class Oneof1350(oneof1350: Int = 0) : HugeOneof<Int>(oneof1350)
        class Oneof1351(oneof1351: Int = 0) : HugeOneof<Int>(oneof1351)
        class Oneof1352(oneof1352: Int = 0) : HugeOneof<Int>(oneof1352)
        class Oneof1353(oneof1353: Int = 0) : HugeOneof<Int>(oneof1353)
        class Oneof1354(oneof1354: Int = 0) : HugeOneof<Int>(oneof1354)
        class Oneof1355(oneof1355: Int = 0) : HugeOneof<Int>(oneof1355)
        class Oneof1356(oneof1356: Int = 0) : HugeOneof<Int>(oneof1356)
        class Oneof1357(oneof1357: Int = 0) : HugeOneof<Int>(oneof1357)
        class Oneof1358(oneof1358: Int = 0) : HugeOneof<Int>(oneof1358)
        class Oneof1359(oneof1359: Int = 0) : HugeOneof<Int>(oneof1359)
        class Oneof1360(oneof1360: Int = 0) : HugeOneof<Int>(oneof1360)
        class Oneof1361(oneof1361: Int = 0) : HugeOneof<Int>(oneof1361)
        class Oneof1362(oneof1362: Int = 0) : HugeOneof<Int>(oneof1362)
        class Oneof1363(oneof1363: Int = 0) : HugeOneof<Int>(oneof1363)
        class Oneof1364(oneof1364: Int = 0) : HugeOneof<Int>(oneof1364)
        class Oneof1365(oneof1365: Int = 0) : HugeOneof<Int>(oneof1365)
        class Oneof1366(oneof1366: Int = 0) : HugeOneof<Int>(oneof1366)
        class Oneof1367(oneof1367: Int = 0) : HugeOneof<Int>(oneof1367)
        class Oneof1368(oneof1368: Int = 0) : HugeOneof<Int>(oneof1368)
        class Oneof1369(oneof1369: Int = 0) : HugeOneof<Int>(oneof1369)
        class Oneof1370(oneof1370: Int = 0) : HugeOneof<Int>(oneof1370)
        class Oneof1371(oneof1371: Int = 0) : HugeOneof<Int>(oneof1371)
        class Oneof1372(oneof1372: Int = 0) : HugeOneof<Int>(oneof1372)
        class Oneof1373(oneof1373: Int = 0) : HugeOneof<Int>(oneof1373)
        class Oneof1374(oneof1374: Int = 0) : HugeOneof<Int>(oneof1374)
        class Oneof1375(oneof1375: Int = 0) : HugeOneof<Int>(oneof1375)
        class Oneof1376(oneof1376: Int = 0) : HugeOneof<Int>(oneof1376)
        class Oneof1377(oneof1377: Int = 0) : HugeOneof<Int>(oneof1377)
        class Oneof1378(oneof1378: Int = 0) : HugeOneof<Int>(oneof1378)
        class Oneof1379(oneof1379: Int = 0) : HugeOneof<Int>(oneof1379)
        class Oneof1380(oneof1380: Int = 0) : HugeOneof<Int>(oneof1380)
        class Oneof1381(oneof1381: Int = 0) : HugeOneof<Int>(oneof1381)
        class Oneof1382(oneof1382: Int = 0) : HugeOneof<Int>(oneof1382)
        class Oneof1383(oneof1383: Int = 0) : HugeOneof<Int>(oneof1383)
        class Oneof1384(oneof1384: Int = 0) : HugeOneof<Int>(oneof1384)
        class Oneof1385(oneof1385: Int = 0) : HugeOneof<Int>(oneof1385)
        class Oneof1386(oneof1386: Int = 0) : HugeOneof<Int>(oneof1386)
        class Oneof1387(oneof1387: Int = 0) : HugeOneof<Int>(oneof1387)
        class Oneof1388(oneof1388: Int = 0) : HugeOneof<Int>(oneof1388)
        class Oneof1389(oneof1389: Int = 0) : HugeOneof<Int>(oneof1389)
        class Oneof1390(oneof1390: Int = 0) : HugeOneof<Int>(oneof1390)
        class Oneof1391(oneof1391: Int = 0) : HugeOneof<Int>(oneof1391)
        class Oneof1392(oneof1392: Int = 0) : HugeOneof<Int>(oneof1392)
        class Oneof1393(oneof1393: Int = 0) : HugeOneof<Int>(oneof1393)
        class Oneof1394(oneof1394: Int = 0) : HugeOneof<Int>(oneof1394)
        class Oneof1395(oneof1395: Int = 0) : HugeOneof<Int>(oneof1395)
        class Oneof1396(oneof1396: Int = 0) : HugeOneof<Int>(oneof1396)
        class Oneof1397(oneof1397: Int = 0) : HugeOneof<Int>(oneof1397)
        class Oneof1398(oneof1398: Int = 0) : HugeOneof<Int>(oneof1398)
        class Oneof1399(oneof1399: Int = 0) : HugeOneof<Int>(oneof1399)
        class Oneof1400(oneof1400: Int = 0) : HugeOneof<Int>(oneof1400)
        class Oneof1401(oneof1401: Int = 0) : HugeOneof<Int>(oneof1401)
        class Oneof1402(oneof1402: Int = 0) : HugeOneof<Int>(oneof1402)
        class Oneof1403(oneof1403: Int = 0) : HugeOneof<Int>(oneof1403)
        class Oneof1404(oneof1404: Int = 0) : HugeOneof<Int>(oneof1404)
        class Oneof1405(oneof1405: Int = 0) : HugeOneof<Int>(oneof1405)
        class Oneof1406(oneof1406: Int = 0) : HugeOneof<Int>(oneof1406)
        class Oneof1407(oneof1407: Int = 0) : HugeOneof<Int>(oneof1407)
        class Oneof1408(oneof1408: Int = 0) : HugeOneof<Int>(oneof1408)
        class Oneof1409(oneof1409: Int = 0) : HugeOneof<Int>(oneof1409)
        class Oneof1410(oneof1410: Int = 0) : HugeOneof<Int>(oneof1410)
        class Oneof1411(oneof1411: Int = 0) : HugeOneof<Int>(oneof1411)
        class Oneof1412(oneof1412: Int = 0) : HugeOneof<Int>(oneof1412)
        class Oneof1413(oneof1413: Int = 0) : HugeOneof<Int>(oneof1413)
        class Oneof1414(oneof1414: Int = 0) : HugeOneof<Int>(oneof1414)
        class Oneof1415(oneof1415: Int = 0) : HugeOneof<Int>(oneof1415)
        class Oneof1416(oneof1416: Int = 0) : HugeOneof<Int>(oneof1416)
        class Oneof1417(oneof1417: Int = 0) : HugeOneof<Int>(oneof1417)
        class Oneof1418(oneof1418: Int = 0) : HugeOneof<Int>(oneof1418)
        class Oneof1419(oneof1419: Int = 0) : HugeOneof<Int>(oneof1419)
        class Oneof1420(oneof1420: Int = 0) : HugeOneof<Int>(oneof1420)
        class Oneof1421(oneof1421: Int = 0) : HugeOneof<Int>(oneof1421)
        class Oneof1422(oneof1422: Int = 0) : HugeOneof<Int>(oneof1422)
        class Oneof1423(oneof1423: Int = 0) : HugeOneof<Int>(oneof1423)
        class Oneof1424(oneof1424: Int = 0) : HugeOneof<Int>(oneof1424)
        class Oneof1425(oneof1425: Int = 0) : HugeOneof<Int>(oneof1425)
        class Oneof1426(oneof1426: Int = 0) : HugeOneof<Int>(oneof1426)
        class Oneof1427(oneof1427: Int = 0) : HugeOneof<Int>(oneof1427)
        class Oneof1428(oneof1428: Int = 0) : HugeOneof<Int>(oneof1428)
        class Oneof1429(oneof1429: Int = 0) : HugeOneof<Int>(oneof1429)
        class Oneof1430(oneof1430: Int = 0) : HugeOneof<Int>(oneof1430)
        class Oneof1431(oneof1431: Int = 0) : HugeOneof<Int>(oneof1431)
        class Oneof1432(oneof1432: Int = 0) : HugeOneof<Int>(oneof1432)
        class Oneof1433(oneof1433: Int = 0) : HugeOneof<Int>(oneof1433)
        class Oneof1434(oneof1434: Int = 0) : HugeOneof<Int>(oneof1434)
        class Oneof1435(oneof1435: Int = 0) : HugeOneof<Int>(oneof1435)
        class Oneof1436(oneof1436: Int = 0) : HugeOneof<Int>(oneof1436)
        class Oneof1437(oneof1437: Int = 0) : HugeOneof<Int>(oneof1437)
        class Oneof1438(oneof1438: Int = 0) : HugeOneof<Int>(oneof1438)
        class Oneof1439(oneof1439: Int = 0) : HugeOneof<Int>(oneof1439)
        class Oneof1440(oneof1440: Int = 0) : HugeOneof<Int>(oneof1440)
        class Oneof1441(oneof1441: Int = 0) : HugeOneof<Int>(oneof1441)
        class Oneof1442(oneof1442: Int = 0) : HugeOneof<Int>(oneof1442)
        class Oneof1443(oneof1443: Int = 0) : HugeOneof<Int>(oneof1443)
        class Oneof1444(oneof1444: Int = 0) : HugeOneof<Int>(oneof1444)
        class Oneof1445(oneof1445: Int = 0) : HugeOneof<Int>(oneof1445)
        class Oneof1446(oneof1446: Int = 0) : HugeOneof<Int>(oneof1446)
        class Oneof1447(oneof1447: Int = 0) : HugeOneof<Int>(oneof1447)
        class Oneof1448(oneof1448: Int = 0) : HugeOneof<Int>(oneof1448)
        class Oneof1449(oneof1449: Int = 0) : HugeOneof<Int>(oneof1449)
        class Oneof1450(oneof1450: Int = 0) : HugeOneof<Int>(oneof1450)
        class Oneof1451(oneof1451: Int = 0) : HugeOneof<Int>(oneof1451)
        class Oneof1452(oneof1452: Int = 0) : HugeOneof<Int>(oneof1452)
        class Oneof1453(oneof1453: Int = 0) : HugeOneof<Int>(oneof1453)
        class Oneof1454(oneof1454: Int = 0) : HugeOneof<Int>(oneof1454)
        class Oneof1455(oneof1455: Int = 0) : HugeOneof<Int>(oneof1455)
        class Oneof1456(oneof1456: Int = 0) : HugeOneof<Int>(oneof1456)
        class Oneof1457(oneof1457: Int = 0) : HugeOneof<Int>(oneof1457)
        class Oneof1458(oneof1458: Int = 0) : HugeOneof<Int>(oneof1458)
        class Oneof1459(oneof1459: Int = 0) : HugeOneof<Int>(oneof1459)
        class Oneof1460(oneof1460: Int = 0) : HugeOneof<Int>(oneof1460)
        class Oneof1461(oneof1461: Int = 0) : HugeOneof<Int>(oneof1461)
        class Oneof1462(oneof1462: Int = 0) : HugeOneof<Int>(oneof1462)
        class Oneof1463(oneof1463: Int = 0) : HugeOneof<Int>(oneof1463)
        class Oneof1464(oneof1464: Int = 0) : HugeOneof<Int>(oneof1464)
        class Oneof1465(oneof1465: Int = 0) : HugeOneof<Int>(oneof1465)
        class Oneof1466(oneof1466: Int = 0) : HugeOneof<Int>(oneof1466)
        class Oneof1467(oneof1467: Int = 0) : HugeOneof<Int>(oneof1467)
        class Oneof1468(oneof1468: Int = 0) : HugeOneof<Int>(oneof1468)
        class Oneof1469(oneof1469: Int = 0) : HugeOneof<Int>(oneof1469)
        class Oneof1470(oneof1470: Int = 0) : HugeOneof<Int>(oneof1470)
        class Oneof1471(oneof1471: Int = 0) : HugeOneof<Int>(oneof1471)
        class Oneof1472(oneof1472: Int = 0) : HugeOneof<Int>(oneof1472)
        class Oneof1473(oneof1473: Int = 0) : HugeOneof<Int>(oneof1473)
        class Oneof1474(oneof1474: Int = 0) : HugeOneof<Int>(oneof1474)
        class Oneof1475(oneof1475: Int = 0) : HugeOneof<Int>(oneof1475)
        class Oneof1476(oneof1476: Int = 0) : HugeOneof<Int>(oneof1476)
        class Oneof1477(oneof1477: Int = 0) : HugeOneof<Int>(oneof1477)
        class Oneof1478(oneof1478: Int = 0) : HugeOneof<Int>(oneof1478)
        class Oneof1479(oneof1479: Int = 0) : HugeOneof<Int>(oneof1479)
        class Oneof1480(oneof1480: Int = 0) : HugeOneof<Int>(oneof1480)
        class Oneof1481(oneof1481: Int = 0) : HugeOneof<Int>(oneof1481)
        class Oneof1482(oneof1482: Int = 0) : HugeOneof<Int>(oneof1482)
        class Oneof1483(oneof1483: Int = 0) : HugeOneof<Int>(oneof1483)
        class Oneof1484(oneof1484: Int = 0) : HugeOneof<Int>(oneof1484)
        class Oneof1485(oneof1485: Int = 0) : HugeOneof<Int>(oneof1485)
        class Oneof1486(oneof1486: Int = 0) : HugeOneof<Int>(oneof1486)
        class Oneof1487(oneof1487: Int = 0) : HugeOneof<Int>(oneof1487)
        class Oneof1488(oneof1488: Int = 0) : HugeOneof<Int>(oneof1488)
        class Oneof1489(oneof1489: Int = 0) : HugeOneof<Int>(oneof1489)
        class Oneof1490(oneof1490: Int = 0) : HugeOneof<Int>(oneof1490)
        class Oneof1491(oneof1491: Int = 0) : HugeOneof<Int>(oneof1491)
        class Oneof1492(oneof1492: Int = 0) : HugeOneof<Int>(oneof1492)
        class Oneof1493(oneof1493: Int = 0) : HugeOneof<Int>(oneof1493)
        class Oneof1494(oneof1494: Int = 0) : HugeOneof<Int>(oneof1494)
        class Oneof1495(oneof1495: Int = 0) : HugeOneof<Int>(oneof1495)
        class Oneof1496(oneof1496: Int = 0) : HugeOneof<Int>(oneof1496)
        class Oneof1497(oneof1497: Int = 0) : HugeOneof<Int>(oneof1497)
        class Oneof1498(oneof1498: Int = 0) : HugeOneof<Int>(oneof1498)
        class Oneof1499(oneof1499: Int = 0) : HugeOneof<Int>(oneof1499)
        class Oneof1500(oneof1500: Int = 0) : HugeOneof<Int>(oneof1500)
        class Oneof1501(oneof1501: Int = 0) : HugeOneof<Int>(oneof1501)
        class Oneof1502(oneof1502: Int = 0) : HugeOneof<Int>(oneof1502)
        class Oneof1503(oneof1503: Int = 0) : HugeOneof<Int>(oneof1503)
        class Oneof1504(oneof1504: Int = 0) : HugeOneof<Int>(oneof1504)
        class Oneof1505(oneof1505: Int = 0) : HugeOneof<Int>(oneof1505)
        class Oneof1506(oneof1506: Int = 0) : HugeOneof<Int>(oneof1506)
        class Oneof1507(oneof1507: Int = 0) : HugeOneof<Int>(oneof1507)
        class Oneof1508(oneof1508: Int = 0) : HugeOneof<Int>(oneof1508)
        class Oneof1509(oneof1509: Int = 0) : HugeOneof<Int>(oneof1509)
        class Oneof1510(oneof1510: Int = 0) : HugeOneof<Int>(oneof1510)
        class Oneof1511(oneof1511: Int = 0) : HugeOneof<Int>(oneof1511)
        class Oneof1512(oneof1512: Int = 0) : HugeOneof<Int>(oneof1512)
        class Oneof1513(oneof1513: Int = 0) : HugeOneof<Int>(oneof1513)
        class Oneof1514(oneof1514: Int = 0) : HugeOneof<Int>(oneof1514)
        class Oneof1515(oneof1515: Int = 0) : HugeOneof<Int>(oneof1515)
        class Oneof1516(oneof1516: Int = 0) : HugeOneof<Int>(oneof1516)
        class Oneof1517(oneof1517: Int = 0) : HugeOneof<Int>(oneof1517)
        class Oneof1518(oneof1518: Int = 0) : HugeOneof<Int>(oneof1518)
        class Oneof1519(oneof1519: Int = 0) : HugeOneof<Int>(oneof1519)
        class Oneof1520(oneof1520: Int = 0) : HugeOneof<Int>(oneof1520)
        class Oneof1521(oneof1521: Int = 0) : HugeOneof<Int>(oneof1521)
        class Oneof1522(oneof1522: Int = 0) : HugeOneof<Int>(oneof1522)
        class Oneof1523(oneof1523: Int = 0) : HugeOneof<Int>(oneof1523)
        class Oneof1524(oneof1524: Int = 0) : HugeOneof<Int>(oneof1524)
        class Oneof1525(oneof1525: Int = 0) : HugeOneof<Int>(oneof1525)
        class Oneof1526(oneof1526: Int = 0) : HugeOneof<Int>(oneof1526)
        class Oneof1527(oneof1527: Int = 0) : HugeOneof<Int>(oneof1527)
        class Oneof1528(oneof1528: Int = 0) : HugeOneof<Int>(oneof1528)
        class Oneof1529(oneof1529: Int = 0) : HugeOneof<Int>(oneof1529)
        class Oneof1530(oneof1530: Int = 0) : HugeOneof<Int>(oneof1530)
        class Oneof1531(oneof1531: Int = 0) : HugeOneof<Int>(oneof1531)
        class Oneof1532(oneof1532: Int = 0) : HugeOneof<Int>(oneof1532)
        class Oneof1533(oneof1533: Int = 0) : HugeOneof<Int>(oneof1533)
        class Oneof1534(oneof1534: Int = 0) : HugeOneof<Int>(oneof1534)
        class Oneof1535(oneof1535: Int = 0) : HugeOneof<Int>(oneof1535)
        class Oneof1536(oneof1536: Int = 0) : HugeOneof<Int>(oneof1536)
        class Oneof1537(oneof1537: Int = 0) : HugeOneof<Int>(oneof1537)
        class Oneof1538(oneof1538: Int = 0) : HugeOneof<Int>(oneof1538)
        class Oneof1539(oneof1539: Int = 0) : HugeOneof<Int>(oneof1539)
        class Oneof1540(oneof1540: Int = 0) : HugeOneof<Int>(oneof1540)
        class Oneof1541(oneof1541: Int = 0) : HugeOneof<Int>(oneof1541)
        class Oneof1542(oneof1542: Int = 0) : HugeOneof<Int>(oneof1542)
        class Oneof1543(oneof1543: Int = 0) : HugeOneof<Int>(oneof1543)
        class Oneof1544(oneof1544: Int = 0) : HugeOneof<Int>(oneof1544)
        class Oneof1545(oneof1545: Int = 0) : HugeOneof<Int>(oneof1545)
        class Oneof1546(oneof1546: Int = 0) : HugeOneof<Int>(oneof1546)
        class Oneof1547(oneof1547: Int = 0) : HugeOneof<Int>(oneof1547)
        class Oneof1548(oneof1548: Int = 0) : HugeOneof<Int>(oneof1548)
        class Oneof1549(oneof1549: Int = 0) : HugeOneof<Int>(oneof1549)
        class Oneof1550(oneof1550: Int = 0) : HugeOneof<Int>(oneof1550)
        class Oneof1551(oneof1551: Int = 0) : HugeOneof<Int>(oneof1551)
        class Oneof1552(oneof1552: Int = 0) : HugeOneof<Int>(oneof1552)
        class Oneof1553(oneof1553: Int = 0) : HugeOneof<Int>(oneof1553)
        class Oneof1554(oneof1554: Int = 0) : HugeOneof<Int>(oneof1554)
        class Oneof1555(oneof1555: Int = 0) : HugeOneof<Int>(oneof1555)
        class Oneof1556(oneof1556: Int = 0) : HugeOneof<Int>(oneof1556)
        class Oneof1557(oneof1557: Int = 0) : HugeOneof<Int>(oneof1557)
        class Oneof1558(oneof1558: Int = 0) : HugeOneof<Int>(oneof1558)
        class Oneof1559(oneof1559: Int = 0) : HugeOneof<Int>(oneof1559)
        class Oneof1560(oneof1560: Int = 0) : HugeOneof<Int>(oneof1560)
        class Oneof1561(oneof1561: Int = 0) : HugeOneof<Int>(oneof1561)
        class Oneof1562(oneof1562: Int = 0) : HugeOneof<Int>(oneof1562)
        class Oneof1563(oneof1563: Int = 0) : HugeOneof<Int>(oneof1563)
        class Oneof1564(oneof1564: Int = 0) : HugeOneof<Int>(oneof1564)
        class Oneof1565(oneof1565: Int = 0) : HugeOneof<Int>(oneof1565)
        class Oneof1566(oneof1566: Int = 0) : HugeOneof<Int>(oneof1566)
        class Oneof1567(oneof1567: Int = 0) : HugeOneof<Int>(oneof1567)
        class Oneof1568(oneof1568: Int = 0) : HugeOneof<Int>(oneof1568)
        class Oneof1569(oneof1569: Int = 0) : HugeOneof<Int>(oneof1569)
        class Oneof1570(oneof1570: Int = 0) : HugeOneof<Int>(oneof1570)
        class Oneof1571(oneof1571: Int = 0) : HugeOneof<Int>(oneof1571)
        class Oneof1572(oneof1572: Int = 0) : HugeOneof<Int>(oneof1572)
        class Oneof1573(oneof1573: Int = 0) : HugeOneof<Int>(oneof1573)
        class Oneof1574(oneof1574: Int = 0) : HugeOneof<Int>(oneof1574)
        class Oneof1575(oneof1575: Int = 0) : HugeOneof<Int>(oneof1575)
        class Oneof1576(oneof1576: Int = 0) : HugeOneof<Int>(oneof1576)
        class Oneof1577(oneof1577: Int = 0) : HugeOneof<Int>(oneof1577)
        class Oneof1578(oneof1578: Int = 0) : HugeOneof<Int>(oneof1578)
        class Oneof1579(oneof1579: Int = 0) : HugeOneof<Int>(oneof1579)
        class Oneof1580(oneof1580: Int = 0) : HugeOneof<Int>(oneof1580)
        class Oneof1581(oneof1581: Int = 0) : HugeOneof<Int>(oneof1581)
        class Oneof1582(oneof1582: Int = 0) : HugeOneof<Int>(oneof1582)
        class Oneof1583(oneof1583: Int = 0) : HugeOneof<Int>(oneof1583)
        class Oneof1584(oneof1584: Int = 0) : HugeOneof<Int>(oneof1584)
        class Oneof1585(oneof1585: Int = 0) : HugeOneof<Int>(oneof1585)
        class Oneof1586(oneof1586: Int = 0) : HugeOneof<Int>(oneof1586)
        class Oneof1587(oneof1587: Int = 0) : HugeOneof<Int>(oneof1587)
        class Oneof1588(oneof1588: Int = 0) : HugeOneof<Int>(oneof1588)
        class Oneof1589(oneof1589: Int = 0) : HugeOneof<Int>(oneof1589)
        class Oneof1590(oneof1590: Int = 0) : HugeOneof<Int>(oneof1590)
        class Oneof1591(oneof1591: Int = 0) : HugeOneof<Int>(oneof1591)
        class Oneof1592(oneof1592: Int = 0) : HugeOneof<Int>(oneof1592)
        class Oneof1593(oneof1593: Int = 0) : HugeOneof<Int>(oneof1593)
        class Oneof1594(oneof1594: Int = 0) : HugeOneof<Int>(oneof1594)
        class Oneof1595(oneof1595: Int = 0) : HugeOneof<Int>(oneof1595)
        class Oneof1596(oneof1596: Int = 0) : HugeOneof<Int>(oneof1596)
        class Oneof1597(oneof1597: Int = 0) : HugeOneof<Int>(oneof1597)
        class Oneof1598(oneof1598: Int = 0) : HugeOneof<Int>(oneof1598)
        class Oneof1599(oneof1599: Int = 0) : HugeOneof<Int>(oneof1599)
        class Oneof1600(oneof1600: Int = 0) : HugeOneof<Int>(oneof1600)
        class Oneof1601(oneof1601: Int = 0) : HugeOneof<Int>(oneof1601)
        class Oneof1602(oneof1602: Int = 0) : HugeOneof<Int>(oneof1602)
        class Oneof1603(oneof1603: Int = 0) : HugeOneof<Int>(oneof1603)
        class Oneof1604(oneof1604: Int = 0) : HugeOneof<Int>(oneof1604)
        class Oneof1605(oneof1605: Int = 0) : HugeOneof<Int>(oneof1605)
        class Oneof1606(oneof1606: Int = 0) : HugeOneof<Int>(oneof1606)
        class Oneof1607(oneof1607: Int = 0) : HugeOneof<Int>(oneof1607)
        class Oneof1608(oneof1608: Int = 0) : HugeOneof<Int>(oneof1608)
        class Oneof1609(oneof1609: Int = 0) : HugeOneof<Int>(oneof1609)
        class Oneof1610(oneof1610: Int = 0) : HugeOneof<Int>(oneof1610)
        class Oneof1611(oneof1611: Int = 0) : HugeOneof<Int>(oneof1611)
        class Oneof1612(oneof1612: Int = 0) : HugeOneof<Int>(oneof1612)
        class Oneof1613(oneof1613: Int = 0) : HugeOneof<Int>(oneof1613)
        class Oneof1614(oneof1614: Int = 0) : HugeOneof<Int>(oneof1614)
        class Oneof1615(oneof1615: Int = 0) : HugeOneof<Int>(oneof1615)
        class Oneof1616(oneof1616: Int = 0) : HugeOneof<Int>(oneof1616)
        class Oneof1617(oneof1617: Int = 0) : HugeOneof<Int>(oneof1617)
        class Oneof1618(oneof1618: Int = 0) : HugeOneof<Int>(oneof1618)
        class Oneof1619(oneof1619: Int = 0) : HugeOneof<Int>(oneof1619)
        class Oneof1620(oneof1620: Int = 0) : HugeOneof<Int>(oneof1620)
        class Oneof1621(oneof1621: Int = 0) : HugeOneof<Int>(oneof1621)
        class Oneof1622(oneof1622: Int = 0) : HugeOneof<Int>(oneof1622)
        class Oneof1623(oneof1623: Int = 0) : HugeOneof<Int>(oneof1623)
        class Oneof1624(oneof1624: Int = 0) : HugeOneof<Int>(oneof1624)
        class Oneof1625(oneof1625: Int = 0) : HugeOneof<Int>(oneof1625)
        class Oneof1626(oneof1626: Int = 0) : HugeOneof<Int>(oneof1626)
        class Oneof1627(oneof1627: Int = 0) : HugeOneof<Int>(oneof1627)
        class Oneof1628(oneof1628: Int = 0) : HugeOneof<Int>(oneof1628)
        class Oneof1629(oneof1629: Int = 0) : HugeOneof<Int>(oneof1629)
        class Oneof1630(oneof1630: Int = 0) : HugeOneof<Int>(oneof1630)
        class Oneof1631(oneof1631: Int = 0) : HugeOneof<Int>(oneof1631)
        class Oneof1632(oneof1632: Int = 0) : HugeOneof<Int>(oneof1632)
        class Oneof1633(oneof1633: Int = 0) : HugeOneof<Int>(oneof1633)
        class Oneof1634(oneof1634: Int = 0) : HugeOneof<Int>(oneof1634)
        class Oneof1635(oneof1635: Int = 0) : HugeOneof<Int>(oneof1635)
        class Oneof1636(oneof1636: Int = 0) : HugeOneof<Int>(oneof1636)
        class Oneof1637(oneof1637: Int = 0) : HugeOneof<Int>(oneof1637)
        class Oneof1638(oneof1638: Int = 0) : HugeOneof<Int>(oneof1638)
        class Oneof1639(oneof1639: Int = 0) : HugeOneof<Int>(oneof1639)
        class Oneof1640(oneof1640: Int = 0) : HugeOneof<Int>(oneof1640)
        class Oneof1641(oneof1641: Int = 0) : HugeOneof<Int>(oneof1641)
        class Oneof1642(oneof1642: Int = 0) : HugeOneof<Int>(oneof1642)
        class Oneof1643(oneof1643: Int = 0) : HugeOneof<Int>(oneof1643)
        class Oneof1644(oneof1644: Int = 0) : HugeOneof<Int>(oneof1644)
        class Oneof1645(oneof1645: Int = 0) : HugeOneof<Int>(oneof1645)
        class Oneof1646(oneof1646: Int = 0) : HugeOneof<Int>(oneof1646)
        class Oneof1647(oneof1647: Int = 0) : HugeOneof<Int>(oneof1647)
        class Oneof1648(oneof1648: Int = 0) : HugeOneof<Int>(oneof1648)
        class Oneof1649(oneof1649: Int = 0) : HugeOneof<Int>(oneof1649)
        class Oneof1650(oneof1650: Int = 0) : HugeOneof<Int>(oneof1650)
        class Oneof1651(oneof1651: Int = 0) : HugeOneof<Int>(oneof1651)
        class Oneof1652(oneof1652: Int = 0) : HugeOneof<Int>(oneof1652)
        class Oneof1653(oneof1653: Int = 0) : HugeOneof<Int>(oneof1653)
        class Oneof1654(oneof1654: Int = 0) : HugeOneof<Int>(oneof1654)
        class Oneof1655(oneof1655: Int = 0) : HugeOneof<Int>(oneof1655)
        class Oneof1656(oneof1656: Int = 0) : HugeOneof<Int>(oneof1656)
        class Oneof1657(oneof1657: Int = 0) : HugeOneof<Int>(oneof1657)
        class Oneof1658(oneof1658: Int = 0) : HugeOneof<Int>(oneof1658)
        class Oneof1659(oneof1659: Int = 0) : HugeOneof<Int>(oneof1659)
        class Oneof1660(oneof1660: Int = 0) : HugeOneof<Int>(oneof1660)
        class Oneof1661(oneof1661: Int = 0) : HugeOneof<Int>(oneof1661)
        class Oneof1662(oneof1662: Int = 0) : HugeOneof<Int>(oneof1662)
        class Oneof1663(oneof1663: Int = 0) : HugeOneof<Int>(oneof1663)
        class Oneof1664(oneof1664: Int = 0) : HugeOneof<Int>(oneof1664)
        class Oneof1665(oneof1665: Int = 0) : HugeOneof<Int>(oneof1665)
        class Oneof1666(oneof1666: Int = 0) : HugeOneof<Int>(oneof1666)
        class Oneof1667(oneof1667: Int = 0) : HugeOneof<Int>(oneof1667)
        class Oneof1668(oneof1668: Int = 0) : HugeOneof<Int>(oneof1668)
        class Oneof1669(oneof1669: Int = 0) : HugeOneof<Int>(oneof1669)
        class Oneof1670(oneof1670: Int = 0) : HugeOneof<Int>(oneof1670)
        class Oneof1671(oneof1671: Int = 0) : HugeOneof<Int>(oneof1671)
        class Oneof1672(oneof1672: Int = 0) : HugeOneof<Int>(oneof1672)
        class Oneof1673(oneof1673: Int = 0) : HugeOneof<Int>(oneof1673)
        class Oneof1674(oneof1674: Int = 0) : HugeOneof<Int>(oneof1674)
        class Oneof1675(oneof1675: Int = 0) : HugeOneof<Int>(oneof1675)
        class Oneof1676(oneof1676: Int = 0) : HugeOneof<Int>(oneof1676)
        class Oneof1677(oneof1677: Int = 0) : HugeOneof<Int>(oneof1677)
        class Oneof1678(oneof1678: Int = 0) : HugeOneof<Int>(oneof1678)
        class Oneof1679(oneof1679: Int = 0) : HugeOneof<Int>(oneof1679)
        class Oneof1680(oneof1680: Int = 0) : HugeOneof<Int>(oneof1680)
        class Oneof1681(oneof1681: Int = 0) : HugeOneof<Int>(oneof1681)
        class Oneof1682(oneof1682: Int = 0) : HugeOneof<Int>(oneof1682)
        class Oneof1683(oneof1683: Int = 0) : HugeOneof<Int>(oneof1683)
        class Oneof1684(oneof1684: Int = 0) : HugeOneof<Int>(oneof1684)
        class Oneof1685(oneof1685: Int = 0) : HugeOneof<Int>(oneof1685)
        class Oneof1686(oneof1686: Int = 0) : HugeOneof<Int>(oneof1686)
        class Oneof1687(oneof1687: Int = 0) : HugeOneof<Int>(oneof1687)
        class Oneof1688(oneof1688: Int = 0) : HugeOneof<Int>(oneof1688)
        class Oneof1689(oneof1689: Int = 0) : HugeOneof<Int>(oneof1689)
        class Oneof1690(oneof1690: Int = 0) : HugeOneof<Int>(oneof1690)
        class Oneof1691(oneof1691: Int = 0) : HugeOneof<Int>(oneof1691)
        class Oneof1692(oneof1692: Int = 0) : HugeOneof<Int>(oneof1692)
        class Oneof1693(oneof1693: Int = 0) : HugeOneof<Int>(oneof1693)
        class Oneof1694(oneof1694: Int = 0) : HugeOneof<Int>(oneof1694)
        class Oneof1695(oneof1695: Int = 0) : HugeOneof<Int>(oneof1695)
        class Oneof1696(oneof1696: Int = 0) : HugeOneof<Int>(oneof1696)
        class Oneof1697(oneof1697: Int = 0) : HugeOneof<Int>(oneof1697)
        class Oneof1698(oneof1698: Int = 0) : HugeOneof<Int>(oneof1698)
        class Oneof1699(oneof1699: Int = 0) : HugeOneof<Int>(oneof1699)
        class Oneof1700(oneof1700: Int = 0) : HugeOneof<Int>(oneof1700)
        class Oneof1701(oneof1701: Int = 0) : HugeOneof<Int>(oneof1701)
        class Oneof1702(oneof1702: Int = 0) : HugeOneof<Int>(oneof1702)
        class Oneof1703(oneof1703: Int = 0) : HugeOneof<Int>(oneof1703)
        class Oneof1704(oneof1704: Int = 0) : HugeOneof<Int>(oneof1704)
        class Oneof1705(oneof1705: Int = 0) : HugeOneof<Int>(oneof1705)
        class Oneof1706(oneof1706: Int = 0) : HugeOneof<Int>(oneof1706)
        class Oneof1707(oneof1707: Int = 0) : HugeOneof<Int>(oneof1707)
        class Oneof1708(oneof1708: Int = 0) : HugeOneof<Int>(oneof1708)
        class Oneof1709(oneof1709: Int = 0) : HugeOneof<Int>(oneof1709)
        class Oneof1710(oneof1710: Int = 0) : HugeOneof<Int>(oneof1710)
        class Oneof1711(oneof1711: Int = 0) : HugeOneof<Int>(oneof1711)
        class Oneof1712(oneof1712: Int = 0) : HugeOneof<Int>(oneof1712)
        class Oneof1713(oneof1713: Int = 0) : HugeOneof<Int>(oneof1713)
        class Oneof1714(oneof1714: Int = 0) : HugeOneof<Int>(oneof1714)
        class Oneof1715(oneof1715: Int = 0) : HugeOneof<Int>(oneof1715)
        class Oneof1716(oneof1716: Int = 0) : HugeOneof<Int>(oneof1716)
        class Oneof1717(oneof1717: Int = 0) : HugeOneof<Int>(oneof1717)
        class Oneof1718(oneof1718: Int = 0) : HugeOneof<Int>(oneof1718)
        class Oneof1719(oneof1719: Int = 0) : HugeOneof<Int>(oneof1719)
        class Oneof1720(oneof1720: Int = 0) : HugeOneof<Int>(oneof1720)
        class Oneof1721(oneof1721: Int = 0) : HugeOneof<Int>(oneof1721)
        class Oneof1722(oneof1722: Int = 0) : HugeOneof<Int>(oneof1722)
        class Oneof1723(oneof1723: Int = 0) : HugeOneof<Int>(oneof1723)
        class Oneof1724(oneof1724: Int = 0) : HugeOneof<Int>(oneof1724)
        class Oneof1725(oneof1725: Int = 0) : HugeOneof<Int>(oneof1725)
        class Oneof1726(oneof1726: Int = 0) : HugeOneof<Int>(oneof1726)
        class Oneof1727(oneof1727: Int = 0) : HugeOneof<Int>(oneof1727)
        class Oneof1728(oneof1728: Int = 0) : HugeOneof<Int>(oneof1728)
        class Oneof1729(oneof1729: Int = 0) : HugeOneof<Int>(oneof1729)
        class Oneof1730(oneof1730: Int = 0) : HugeOneof<Int>(oneof1730)
        class Oneof1731(oneof1731: Int = 0) : HugeOneof<Int>(oneof1731)
        class Oneof1732(oneof1732: Int = 0) : HugeOneof<Int>(oneof1732)
        class Oneof1733(oneof1733: Int = 0) : HugeOneof<Int>(oneof1733)
        class Oneof1734(oneof1734: Int = 0) : HugeOneof<Int>(oneof1734)
        class Oneof1735(oneof1735: Int = 0) : HugeOneof<Int>(oneof1735)
        class Oneof1736(oneof1736: Int = 0) : HugeOneof<Int>(oneof1736)
        class Oneof1737(oneof1737: Int = 0) : HugeOneof<Int>(oneof1737)
        class Oneof1738(oneof1738: Int = 0) : HugeOneof<Int>(oneof1738)
        class Oneof1739(oneof1739: Int = 0) : HugeOneof<Int>(oneof1739)
        class Oneof1740(oneof1740: Int = 0) : HugeOneof<Int>(oneof1740)
        class Oneof1741(oneof1741: Int = 0) : HugeOneof<Int>(oneof1741)
        class Oneof1742(oneof1742: Int = 0) : HugeOneof<Int>(oneof1742)
        class Oneof1743(oneof1743: Int = 0) : HugeOneof<Int>(oneof1743)
        class Oneof1744(oneof1744: Int = 0) : HugeOneof<Int>(oneof1744)
        class Oneof1745(oneof1745: Int = 0) : HugeOneof<Int>(oneof1745)
        class Oneof1746(oneof1746: Int = 0) : HugeOneof<Int>(oneof1746)
        class Oneof1747(oneof1747: Int = 0) : HugeOneof<Int>(oneof1747)
        class Oneof1748(oneof1748: Int = 0) : HugeOneof<Int>(oneof1748)
        class Oneof1749(oneof1749: Int = 0) : HugeOneof<Int>(oneof1749)
        class Oneof1750(oneof1750: Int = 0) : HugeOneof<Int>(oneof1750)
        class Oneof1751(oneof1751: Int = 0) : HugeOneof<Int>(oneof1751)
        class Oneof1752(oneof1752: Int = 0) : HugeOneof<Int>(oneof1752)
        class Oneof1753(oneof1753: Int = 0) : HugeOneof<Int>(oneof1753)
        class Oneof1754(oneof1754: Int = 0) : HugeOneof<Int>(oneof1754)
        class Oneof1755(oneof1755: Int = 0) : HugeOneof<Int>(oneof1755)
        class Oneof1756(oneof1756: Int = 0) : HugeOneof<Int>(oneof1756)
        class Oneof1757(oneof1757: Int = 0) : HugeOneof<Int>(oneof1757)
        class Oneof1758(oneof1758: Int = 0) : HugeOneof<Int>(oneof1758)
        class Oneof1759(oneof1759: Int = 0) : HugeOneof<Int>(oneof1759)
        class Oneof1760(oneof1760: Int = 0) : HugeOneof<Int>(oneof1760)
        class Oneof1761(oneof1761: Int = 0) : HugeOneof<Int>(oneof1761)
        class Oneof1762(oneof1762: Int = 0) : HugeOneof<Int>(oneof1762)
        class Oneof1763(oneof1763: Int = 0) : HugeOneof<Int>(oneof1763)
        class Oneof1764(oneof1764: Int = 0) : HugeOneof<Int>(oneof1764)
        class Oneof1765(oneof1765: Int = 0) : HugeOneof<Int>(oneof1765)
        class Oneof1766(oneof1766: Int = 0) : HugeOneof<Int>(oneof1766)
        class Oneof1767(oneof1767: Int = 0) : HugeOneof<Int>(oneof1767)
        class Oneof1768(oneof1768: Int = 0) : HugeOneof<Int>(oneof1768)
        class Oneof1769(oneof1769: Int = 0) : HugeOneof<Int>(oneof1769)
        class Oneof1770(oneof1770: Int = 0) : HugeOneof<Int>(oneof1770)
        class Oneof1771(oneof1771: Int = 0) : HugeOneof<Int>(oneof1771)
        class Oneof1772(oneof1772: Int = 0) : HugeOneof<Int>(oneof1772)
        class Oneof1773(oneof1773: Int = 0) : HugeOneof<Int>(oneof1773)
        class Oneof1774(oneof1774: Int = 0) : HugeOneof<Int>(oneof1774)
        class Oneof1775(oneof1775: Int = 0) : HugeOneof<Int>(oneof1775)
        class Oneof1776(oneof1776: Int = 0) : HugeOneof<Int>(oneof1776)
        class Oneof1777(oneof1777: Int = 0) : HugeOneof<Int>(oneof1777)
        class Oneof1778(oneof1778: Int = 0) : HugeOneof<Int>(oneof1778)
        class Oneof1779(oneof1779: Int = 0) : HugeOneof<Int>(oneof1779)
        class Oneof1780(oneof1780: Int = 0) : HugeOneof<Int>(oneof1780)
        class Oneof1781(oneof1781: Int = 0) : HugeOneof<Int>(oneof1781)
        class Oneof1782(oneof1782: Int = 0) : HugeOneof<Int>(oneof1782)
        class Oneof1783(oneof1783: Int = 0) : HugeOneof<Int>(oneof1783)
        class Oneof1784(oneof1784: Int = 0) : HugeOneof<Int>(oneof1784)
        class Oneof1785(oneof1785: Int = 0) : HugeOneof<Int>(oneof1785)
        class Oneof1786(oneof1786: Int = 0) : HugeOneof<Int>(oneof1786)
        class Oneof1787(oneof1787: Int = 0) : HugeOneof<Int>(oneof1787)
        class Oneof1788(oneof1788: Int = 0) : HugeOneof<Int>(oneof1788)
        class Oneof1789(oneof1789: Int = 0) : HugeOneof<Int>(oneof1789)
        class Oneof1790(oneof1790: Int = 0) : HugeOneof<Int>(oneof1790)
        class Oneof1791(oneof1791: Int = 0) : HugeOneof<Int>(oneof1791)
        class Oneof1792(oneof1792: Int = 0) : HugeOneof<Int>(oneof1792)
        class Oneof1793(oneof1793: Int = 0) : HugeOneof<Int>(oneof1793)
        class Oneof1794(oneof1794: Int = 0) : HugeOneof<Int>(oneof1794)
        class Oneof1795(oneof1795: Int = 0) : HugeOneof<Int>(oneof1795)
        class Oneof1796(oneof1796: Int = 0) : HugeOneof<Int>(oneof1796)
        class Oneof1797(oneof1797: Int = 0) : HugeOneof<Int>(oneof1797)
        class Oneof1798(oneof1798: Int = 0) : HugeOneof<Int>(oneof1798)
        class Oneof1799(oneof1799: Int = 0) : HugeOneof<Int>(oneof1799)
        class Oneof1800(oneof1800: Int = 0) : HugeOneof<Int>(oneof1800)
        class Oneof1801(oneof1801: Int = 0) : HugeOneof<Int>(oneof1801)
        class Oneof1802(oneof1802: Int = 0) : HugeOneof<Int>(oneof1802)
        class Oneof1803(oneof1803: Int = 0) : HugeOneof<Int>(oneof1803)
        class Oneof1804(oneof1804: Int = 0) : HugeOneof<Int>(oneof1804)
        class Oneof1805(oneof1805: Int = 0) : HugeOneof<Int>(oneof1805)
        class Oneof1806(oneof1806: Int = 0) : HugeOneof<Int>(oneof1806)
        class Oneof1807(oneof1807: Int = 0) : HugeOneof<Int>(oneof1807)
        class Oneof1808(oneof1808: Int = 0) : HugeOneof<Int>(oneof1808)
        class Oneof1809(oneof1809: Int = 0) : HugeOneof<Int>(oneof1809)
        class Oneof1810(oneof1810: Int = 0) : HugeOneof<Int>(oneof1810)
        class Oneof1811(oneof1811: Int = 0) : HugeOneof<Int>(oneof1811)
        class Oneof1812(oneof1812: Int = 0) : HugeOneof<Int>(oneof1812)
        class Oneof1813(oneof1813: Int = 0) : HugeOneof<Int>(oneof1813)
        class Oneof1814(oneof1814: Int = 0) : HugeOneof<Int>(oneof1814)
        class Oneof1815(oneof1815: Int = 0) : HugeOneof<Int>(oneof1815)
        class Oneof1816(oneof1816: Int = 0) : HugeOneof<Int>(oneof1816)
        class Oneof1817(oneof1817: Int = 0) : HugeOneof<Int>(oneof1817)
        class Oneof1818(oneof1818: Int = 0) : HugeOneof<Int>(oneof1818)
        class Oneof1819(oneof1819: Int = 0) : HugeOneof<Int>(oneof1819)
        class Oneof1820(oneof1820: Int = 0) : HugeOneof<Int>(oneof1820)
        class Oneof1821(oneof1821: Int = 0) : HugeOneof<Int>(oneof1821)
        class Oneof1822(oneof1822: Int = 0) : HugeOneof<Int>(oneof1822)
        class Oneof1823(oneof1823: Int = 0) : HugeOneof<Int>(oneof1823)
        class Oneof1824(oneof1824: Int = 0) : HugeOneof<Int>(oneof1824)
        class Oneof1825(oneof1825: Int = 0) : HugeOneof<Int>(oneof1825)
        class Oneof1826(oneof1826: Int = 0) : HugeOneof<Int>(oneof1826)
        class Oneof1827(oneof1827: Int = 0) : HugeOneof<Int>(oneof1827)
        class Oneof1828(oneof1828: Int = 0) : HugeOneof<Int>(oneof1828)
        class Oneof1829(oneof1829: Int = 0) : HugeOneof<Int>(oneof1829)
        class Oneof1830(oneof1830: Int = 0) : HugeOneof<Int>(oneof1830)
        class Oneof1831(oneof1831: Int = 0) : HugeOneof<Int>(oneof1831)
        class Oneof1832(oneof1832: Int = 0) : HugeOneof<Int>(oneof1832)
        class Oneof1833(oneof1833: Int = 0) : HugeOneof<Int>(oneof1833)
        class Oneof1834(oneof1834: Int = 0) : HugeOneof<Int>(oneof1834)
        class Oneof1835(oneof1835: Int = 0) : HugeOneof<Int>(oneof1835)
        class Oneof1836(oneof1836: Int = 0) : HugeOneof<Int>(oneof1836)
        class Oneof1837(oneof1837: Int = 0) : HugeOneof<Int>(oneof1837)
        class Oneof1838(oneof1838: Int = 0) : HugeOneof<Int>(oneof1838)
        class Oneof1839(oneof1839: Int = 0) : HugeOneof<Int>(oneof1839)
        class Oneof1840(oneof1840: Int = 0) : HugeOneof<Int>(oneof1840)
        class Oneof1841(oneof1841: Int = 0) : HugeOneof<Int>(oneof1841)
        class Oneof1842(oneof1842: Int = 0) : HugeOneof<Int>(oneof1842)
        class Oneof1843(oneof1843: Int = 0) : HugeOneof<Int>(oneof1843)
        class Oneof1844(oneof1844: Int = 0) : HugeOneof<Int>(oneof1844)
        class Oneof1845(oneof1845: Int = 0) : HugeOneof<Int>(oneof1845)
        class Oneof1846(oneof1846: Int = 0) : HugeOneof<Int>(oneof1846)
        class Oneof1847(oneof1847: Int = 0) : HugeOneof<Int>(oneof1847)
        class Oneof1848(oneof1848: Int = 0) : HugeOneof<Int>(oneof1848)
        class Oneof1849(oneof1849: Int = 0) : HugeOneof<Int>(oneof1849)
        class Oneof1850(oneof1850: Int = 0) : HugeOneof<Int>(oneof1850)
        class Oneof1851(oneof1851: Int = 0) : HugeOneof<Int>(oneof1851)
        class Oneof1852(oneof1852: Int = 0) : HugeOneof<Int>(oneof1852)
        class Oneof1853(oneof1853: Int = 0) : HugeOneof<Int>(oneof1853)
        class Oneof1854(oneof1854: Int = 0) : HugeOneof<Int>(oneof1854)
        class Oneof1855(oneof1855: Int = 0) : HugeOneof<Int>(oneof1855)
        class Oneof1856(oneof1856: Int = 0) : HugeOneof<Int>(oneof1856)
        class Oneof1857(oneof1857: Int = 0) : HugeOneof<Int>(oneof1857)
        class Oneof1858(oneof1858: Int = 0) : HugeOneof<Int>(oneof1858)
        class Oneof1859(oneof1859: Int = 0) : HugeOneof<Int>(oneof1859)
        class Oneof1860(oneof1860: Int = 0) : HugeOneof<Int>(oneof1860)
        class Oneof1861(oneof1861: Int = 0) : HugeOneof<Int>(oneof1861)
        class Oneof1862(oneof1862: Int = 0) : HugeOneof<Int>(oneof1862)
        class Oneof1863(oneof1863: Int = 0) : HugeOneof<Int>(oneof1863)
        class Oneof1864(oneof1864: Int = 0) : HugeOneof<Int>(oneof1864)
        class Oneof1865(oneof1865: Int = 0) : HugeOneof<Int>(oneof1865)
        class Oneof1866(oneof1866: Int = 0) : HugeOneof<Int>(oneof1866)
        class Oneof1867(oneof1867: Int = 0) : HugeOneof<Int>(oneof1867)
        class Oneof1868(oneof1868: Int = 0) : HugeOneof<Int>(oneof1868)
        class Oneof1869(oneof1869: Int = 0) : HugeOneof<Int>(oneof1869)
        class Oneof1870(oneof1870: Int = 0) : HugeOneof<Int>(oneof1870)
        class Oneof1871(oneof1871: Int = 0) : HugeOneof<Int>(oneof1871)
        class Oneof1872(oneof1872: Int = 0) : HugeOneof<Int>(oneof1872)
        class Oneof1873(oneof1873: Int = 0) : HugeOneof<Int>(oneof1873)
        class Oneof1874(oneof1874: Int = 0) : HugeOneof<Int>(oneof1874)
        class Oneof1875(oneof1875: Int = 0) : HugeOneof<Int>(oneof1875)
        class Oneof1876(oneof1876: Int = 0) : HugeOneof<Int>(oneof1876)
        class Oneof1877(oneof1877: Int = 0) : HugeOneof<Int>(oneof1877)
        class Oneof1878(oneof1878: Int = 0) : HugeOneof<Int>(oneof1878)
        class Oneof1879(oneof1879: Int = 0) : HugeOneof<Int>(oneof1879)
        class Oneof1880(oneof1880: Int = 0) : HugeOneof<Int>(oneof1880)
        class Oneof1881(oneof1881: Int = 0) : HugeOneof<Int>(oneof1881)
        class Oneof1882(oneof1882: Int = 0) : HugeOneof<Int>(oneof1882)
        class Oneof1883(oneof1883: Int = 0) : HugeOneof<Int>(oneof1883)
        class Oneof1884(oneof1884: Int = 0) : HugeOneof<Int>(oneof1884)
        class Oneof1885(oneof1885: Int = 0) : HugeOneof<Int>(oneof1885)
        class Oneof1886(oneof1886: Int = 0) : HugeOneof<Int>(oneof1886)
        class Oneof1887(oneof1887: Int = 0) : HugeOneof<Int>(oneof1887)
        class Oneof1888(oneof1888: Int = 0) : HugeOneof<Int>(oneof1888)
        class Oneof1889(oneof1889: Int = 0) : HugeOneof<Int>(oneof1889)
        class Oneof1890(oneof1890: Int = 0) : HugeOneof<Int>(oneof1890)
        class Oneof1891(oneof1891: Int = 0) : HugeOneof<Int>(oneof1891)
        class Oneof1892(oneof1892: Int = 0) : HugeOneof<Int>(oneof1892)
        class Oneof1893(oneof1893: Int = 0) : HugeOneof<Int>(oneof1893)
        class Oneof1894(oneof1894: Int = 0) : HugeOneof<Int>(oneof1894)
        class Oneof1895(oneof1895: Int = 0) : HugeOneof<Int>(oneof1895)
        class Oneof1896(oneof1896: Int = 0) : HugeOneof<Int>(oneof1896)
        class Oneof1897(oneof1897: Int = 0) : HugeOneof<Int>(oneof1897)
        class Oneof1898(oneof1898: Int = 0) : HugeOneof<Int>(oneof1898)
        class Oneof1899(oneof1899: Int = 0) : HugeOneof<Int>(oneof1899)
        class Oneof1900(oneof1900: Int = 0) : HugeOneof<Int>(oneof1900)
        class Oneof1901(oneof1901: Int = 0) : HugeOneof<Int>(oneof1901)
        class Oneof1902(oneof1902: Int = 0) : HugeOneof<Int>(oneof1902)
        class Oneof1903(oneof1903: Int = 0) : HugeOneof<Int>(oneof1903)
        class Oneof1904(oneof1904: Int = 0) : HugeOneof<Int>(oneof1904)
        class Oneof1905(oneof1905: Int = 0) : HugeOneof<Int>(oneof1905)
        class Oneof1906(oneof1906: Int = 0) : HugeOneof<Int>(oneof1906)
        class Oneof1907(oneof1907: Int = 0) : HugeOneof<Int>(oneof1907)
        class Oneof1908(oneof1908: Int = 0) : HugeOneof<Int>(oneof1908)
        class Oneof1909(oneof1909: Int = 0) : HugeOneof<Int>(oneof1909)
        class Oneof1910(oneof1910: Int = 0) : HugeOneof<Int>(oneof1910)
        class Oneof1911(oneof1911: Int = 0) : HugeOneof<Int>(oneof1911)
        class Oneof1912(oneof1912: Int = 0) : HugeOneof<Int>(oneof1912)
        class Oneof1913(oneof1913: Int = 0) : HugeOneof<Int>(oneof1913)
        class Oneof1914(oneof1914: Int = 0) : HugeOneof<Int>(oneof1914)
        class Oneof1915(oneof1915: Int = 0) : HugeOneof<Int>(oneof1915)
        class Oneof1916(oneof1916: Int = 0) : HugeOneof<Int>(oneof1916)
        class Oneof1917(oneof1917: Int = 0) : HugeOneof<Int>(oneof1917)
        class Oneof1918(oneof1918: Int = 0) : HugeOneof<Int>(oneof1918)
        class Oneof1919(oneof1919: Int = 0) : HugeOneof<Int>(oneof1919)
        class Oneof1920(oneof1920: Int = 0) : HugeOneof<Int>(oneof1920)
        class Oneof1921(oneof1921: Int = 0) : HugeOneof<Int>(oneof1921)
        class Oneof1922(oneof1922: Int = 0) : HugeOneof<Int>(oneof1922)
        class Oneof1923(oneof1923: Int = 0) : HugeOneof<Int>(oneof1923)
        class Oneof1924(oneof1924: Int = 0) : HugeOneof<Int>(oneof1924)
        class Oneof1925(oneof1925: Int = 0) : HugeOneof<Int>(oneof1925)
        class Oneof1926(oneof1926: Int = 0) : HugeOneof<Int>(oneof1926)
        class Oneof1927(oneof1927: Int = 0) : HugeOneof<Int>(oneof1927)
        class Oneof1928(oneof1928: Int = 0) : HugeOneof<Int>(oneof1928)
        class Oneof1929(oneof1929: Int = 0) : HugeOneof<Int>(oneof1929)
        class Oneof1930(oneof1930: Int = 0) : HugeOneof<Int>(oneof1930)
        class Oneof1931(oneof1931: Int = 0) : HugeOneof<Int>(oneof1931)
        class Oneof1932(oneof1932: Int = 0) : HugeOneof<Int>(oneof1932)
        class Oneof1933(oneof1933: Int = 0) : HugeOneof<Int>(oneof1933)
        class Oneof1934(oneof1934: Int = 0) : HugeOneof<Int>(oneof1934)
        class Oneof1935(oneof1935: Int = 0) : HugeOneof<Int>(oneof1935)
        class Oneof1936(oneof1936: Int = 0) : HugeOneof<Int>(oneof1936)
        class Oneof1937(oneof1937: Int = 0) : HugeOneof<Int>(oneof1937)
        class Oneof1938(oneof1938: Int = 0) : HugeOneof<Int>(oneof1938)
        class Oneof1939(oneof1939: Int = 0) : HugeOneof<Int>(oneof1939)
        class Oneof1940(oneof1940: Int = 0) : HugeOneof<Int>(oneof1940)
        class Oneof1941(oneof1941: Int = 0) : HugeOneof<Int>(oneof1941)
        class Oneof1942(oneof1942: Int = 0) : HugeOneof<Int>(oneof1942)
        class Oneof1943(oneof1943: Int = 0) : HugeOneof<Int>(oneof1943)
        class Oneof1944(oneof1944: Int = 0) : HugeOneof<Int>(oneof1944)
        class Oneof1945(oneof1945: Int = 0) : HugeOneof<Int>(oneof1945)
        class Oneof1946(oneof1946: Int = 0) : HugeOneof<Int>(oneof1946)
        class Oneof1947(oneof1947: Int = 0) : HugeOneof<Int>(oneof1947)
        class Oneof1948(oneof1948: Int = 0) : HugeOneof<Int>(oneof1948)
        class Oneof1949(oneof1949: Int = 0) : HugeOneof<Int>(oneof1949)
        class Oneof1950(oneof1950: Int = 0) : HugeOneof<Int>(oneof1950)
        class Oneof1951(oneof1951: Int = 0) : HugeOneof<Int>(oneof1951)
        class Oneof1952(oneof1952: Int = 0) : HugeOneof<Int>(oneof1952)
        class Oneof1953(oneof1953: Int = 0) : HugeOneof<Int>(oneof1953)
        class Oneof1954(oneof1954: Int = 0) : HugeOneof<Int>(oneof1954)
        class Oneof1955(oneof1955: Int = 0) : HugeOneof<Int>(oneof1955)
        class Oneof1956(oneof1956: Int = 0) : HugeOneof<Int>(oneof1956)
        class Oneof1957(oneof1957: Int = 0) : HugeOneof<Int>(oneof1957)
        class Oneof1958(oneof1958: Int = 0) : HugeOneof<Int>(oneof1958)
        class Oneof1959(oneof1959: Int = 0) : HugeOneof<Int>(oneof1959)
        class Oneof1960(oneof1960: Int = 0) : HugeOneof<Int>(oneof1960)
        class Oneof1961(oneof1961: Int = 0) : HugeOneof<Int>(oneof1961)
        class Oneof1962(oneof1962: Int = 0) : HugeOneof<Int>(oneof1962)
        class Oneof1963(oneof1963: Int = 0) : HugeOneof<Int>(oneof1963)
        class Oneof1964(oneof1964: Int = 0) : HugeOneof<Int>(oneof1964)
        class Oneof1965(oneof1965: Int = 0) : HugeOneof<Int>(oneof1965)
        class Oneof1966(oneof1966: Int = 0) : HugeOneof<Int>(oneof1966)
        class Oneof1967(oneof1967: Int = 0) : HugeOneof<Int>(oneof1967)
        class Oneof1968(oneof1968: Int = 0) : HugeOneof<Int>(oneof1968)
        class Oneof1969(oneof1969: Int = 0) : HugeOneof<Int>(oneof1969)
        class Oneof1970(oneof1970: Int = 0) : HugeOneof<Int>(oneof1970)
        class Oneof1971(oneof1971: Int = 0) : HugeOneof<Int>(oneof1971)
        class Oneof1972(oneof1972: Int = 0) : HugeOneof<Int>(oneof1972)
        class Oneof1973(oneof1973: Int = 0) : HugeOneof<Int>(oneof1973)
        class Oneof1974(oneof1974: Int = 0) : HugeOneof<Int>(oneof1974)
        class Oneof1975(oneof1975: Int = 0) : HugeOneof<Int>(oneof1975)
        class Oneof1976(oneof1976: Int = 0) : HugeOneof<Int>(oneof1976)
        class Oneof1977(oneof1977: Int = 0) : HugeOneof<Int>(oneof1977)
        class Oneof1978(oneof1978: Int = 0) : HugeOneof<Int>(oneof1978)
        class Oneof1979(oneof1979: Int = 0) : HugeOneof<Int>(oneof1979)
        class Oneof1980(oneof1980: Int = 0) : HugeOneof<Int>(oneof1980)
        class Oneof1981(oneof1981: Int = 0) : HugeOneof<Int>(oneof1981)
        class Oneof1982(oneof1982: Int = 0) : HugeOneof<Int>(oneof1982)
        class Oneof1983(oneof1983: Int = 0) : HugeOneof<Int>(oneof1983)
        class Oneof1984(oneof1984: Int = 0) : HugeOneof<Int>(oneof1984)
        class Oneof1985(oneof1985: Int = 0) : HugeOneof<Int>(oneof1985)
        class Oneof1986(oneof1986: Int = 0) : HugeOneof<Int>(oneof1986)
        class Oneof1987(oneof1987: Int = 0) : HugeOneof<Int>(oneof1987)
        class Oneof1988(oneof1988: Int = 0) : HugeOneof<Int>(oneof1988)
        class Oneof1989(oneof1989: Int = 0) : HugeOneof<Int>(oneof1989)
        class Oneof1990(oneof1990: Int = 0) : HugeOneof<Int>(oneof1990)
        class Oneof1991(oneof1991: Int = 0) : HugeOneof<Int>(oneof1991)
        class Oneof1992(oneof1992: Int = 0) : HugeOneof<Int>(oneof1992)
        class Oneof1993(oneof1993: Int = 0) : HugeOneof<Int>(oneof1993)
        class Oneof1994(oneof1994: Int = 0) : HugeOneof<Int>(oneof1994)
        class Oneof1995(oneof1995: Int = 0) : HugeOneof<Int>(oneof1995)
        class Oneof1996(oneof1996: Int = 0) : HugeOneof<Int>(oneof1996)
        class Oneof1997(oneof1997: Int = 0) : HugeOneof<Int>(oneof1997)
        class Oneof1998(oneof1998: Int = 0) : HugeOneof<Int>(oneof1998)
        class Oneof1999(oneof1999: Int = 0) : HugeOneof<Int>(oneof1999)
    }

    val oneof1000: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1000)?.value
    val oneof1001: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1001)?.value
    val oneof1002: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1002)?.value
    val oneof1003: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1003)?.value
    val oneof1004: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1004)?.value
    val oneof1005: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1005)?.value
    val oneof1006: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1006)?.value
    val oneof1007: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1007)?.value
    val oneof1008: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1008)?.value
    val oneof1009: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1009)?.value
    val oneof1010: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1010)?.value
    val oneof1011: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1011)?.value
    val oneof1012: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1012)?.value
    val oneof1013: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1013)?.value
    val oneof1014: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1014)?.value
    val oneof1015: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1015)?.value
    val oneof1016: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1016)?.value
    val oneof1017: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1017)?.value
    val oneof1018: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1018)?.value
    val oneof1019: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1019)?.value
    val oneof1020: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1020)?.value
    val oneof1021: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1021)?.value
    val oneof1022: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1022)?.value
    val oneof1023: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1023)?.value
    val oneof1024: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1024)?.value
    val oneof1025: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1025)?.value
    val oneof1026: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1026)?.value
    val oneof1027: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1027)?.value
    val oneof1028: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1028)?.value
    val oneof1029: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1029)?.value
    val oneof1030: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1030)?.value
    val oneof1031: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1031)?.value
    val oneof1032: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1032)?.value
    val oneof1033: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1033)?.value
    val oneof1034: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1034)?.value
    val oneof1035: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1035)?.value
    val oneof1036: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1036)?.value
    val oneof1037: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1037)?.value
    val oneof1038: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1038)?.value
    val oneof1039: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1039)?.value
    val oneof1040: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1040)?.value
    val oneof1041: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1041)?.value
    val oneof1042: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1042)?.value
    val oneof1043: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1043)?.value
    val oneof1044: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1044)?.value
    val oneof1045: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1045)?.value
    val oneof1046: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1046)?.value
    val oneof1047: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1047)?.value
    val oneof1048: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1048)?.value
    val oneof1049: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1049)?.value
    val oneof1050: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1050)?.value
    val oneof1051: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1051)?.value
    val oneof1052: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1052)?.value
    val oneof1053: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1053)?.value
    val oneof1054: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1054)?.value
    val oneof1055: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1055)?.value
    val oneof1056: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1056)?.value
    val oneof1057: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1057)?.value
    val oneof1058: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1058)?.value
    val oneof1059: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1059)?.value
    val oneof1060: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1060)?.value
    val oneof1061: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1061)?.value
    val oneof1062: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1062)?.value
    val oneof1063: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1063)?.value
    val oneof1064: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1064)?.value
    val oneof1065: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1065)?.value
    val oneof1066: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1066)?.value
    val oneof1067: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1067)?.value
    val oneof1068: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1068)?.value
    val oneof1069: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1069)?.value
    val oneof1070: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1070)?.value
    val oneof1071: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1071)?.value
    val oneof1072: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1072)?.value
    val oneof1073: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1073)?.value
    val oneof1074: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1074)?.value
    val oneof1075: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1075)?.value
    val oneof1076: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1076)?.value
    val oneof1077: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1077)?.value
    val oneof1078: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1078)?.value
    val oneof1079: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1079)?.value
    val oneof1080: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1080)?.value
    val oneof1081: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1081)?.value
    val oneof1082: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1082)?.value
    val oneof1083: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1083)?.value
    val oneof1084: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1084)?.value
    val oneof1085: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1085)?.value
    val oneof1086: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1086)?.value
    val oneof1087: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1087)?.value
    val oneof1088: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1088)?.value
    val oneof1089: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1089)?.value
    val oneof1090: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1090)?.value
    val oneof1091: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1091)?.value
    val oneof1092: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1092)?.value
    val oneof1093: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1093)?.value
    val oneof1094: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1094)?.value
    val oneof1095: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1095)?.value
    val oneof1096: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1096)?.value
    val oneof1097: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1097)?.value
    val oneof1098: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1098)?.value
    val oneof1099: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1099)?.value
    val oneof1100: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1100)?.value
    val oneof1101: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1101)?.value
    val oneof1102: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1102)?.value
    val oneof1103: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1103)?.value
    val oneof1104: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1104)?.value
    val oneof1105: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1105)?.value
    val oneof1106: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1106)?.value
    val oneof1107: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1107)?.value
    val oneof1108: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1108)?.value
    val oneof1109: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1109)?.value
    val oneof1110: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1110)?.value
    val oneof1111: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1111)?.value
    val oneof1112: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1112)?.value
    val oneof1113: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1113)?.value
    val oneof1114: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1114)?.value
    val oneof1115: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1115)?.value
    val oneof1116: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1116)?.value
    val oneof1117: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1117)?.value
    val oneof1118: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1118)?.value
    val oneof1119: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1119)?.value
    val oneof1120: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1120)?.value
    val oneof1121: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1121)?.value
    val oneof1122: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1122)?.value
    val oneof1123: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1123)?.value
    val oneof1124: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1124)?.value
    val oneof1125: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1125)?.value
    val oneof1126: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1126)?.value
    val oneof1127: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1127)?.value
    val oneof1128: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1128)?.value
    val oneof1129: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1129)?.value
    val oneof1130: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1130)?.value
    val oneof1131: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1131)?.value
    val oneof1132: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1132)?.value
    val oneof1133: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1133)?.value
    val oneof1134: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1134)?.value
    val oneof1135: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1135)?.value
    val oneof1136: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1136)?.value
    val oneof1137: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1137)?.value
    val oneof1138: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1138)?.value
    val oneof1139: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1139)?.value
    val oneof1140: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1140)?.value
    val oneof1141: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1141)?.value
    val oneof1142: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1142)?.value
    val oneof1143: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1143)?.value
    val oneof1144: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1144)?.value
    val oneof1145: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1145)?.value
    val oneof1146: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1146)?.value
    val oneof1147: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1147)?.value
    val oneof1148: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1148)?.value
    val oneof1149: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1149)?.value
    val oneof1150: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1150)?.value
    val oneof1151: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1151)?.value
    val oneof1152: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1152)?.value
    val oneof1153: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1153)?.value
    val oneof1154: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1154)?.value
    val oneof1155: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1155)?.value
    val oneof1156: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1156)?.value
    val oneof1157: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1157)?.value
    val oneof1158: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1158)?.value
    val oneof1159: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1159)?.value
    val oneof1160: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1160)?.value
    val oneof1161: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1161)?.value
    val oneof1162: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1162)?.value
    val oneof1163: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1163)?.value
    val oneof1164: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1164)?.value
    val oneof1165: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1165)?.value
    val oneof1166: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1166)?.value
    val oneof1167: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1167)?.value
    val oneof1168: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1168)?.value
    val oneof1169: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1169)?.value
    val oneof1170: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1170)?.value
    val oneof1171: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1171)?.value
    val oneof1172: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1172)?.value
    val oneof1173: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1173)?.value
    val oneof1174: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1174)?.value
    val oneof1175: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1175)?.value
    val oneof1176: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1176)?.value
    val oneof1177: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1177)?.value
    val oneof1178: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1178)?.value
    val oneof1179: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1179)?.value
    val oneof1180: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1180)?.value
    val oneof1181: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1181)?.value
    val oneof1182: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1182)?.value
    val oneof1183: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1183)?.value
    val oneof1184: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1184)?.value
    val oneof1185: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1185)?.value
    val oneof1186: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1186)?.value
    val oneof1187: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1187)?.value
    val oneof1188: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1188)?.value
    val oneof1189: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1189)?.value
    val oneof1190: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1190)?.value
    val oneof1191: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1191)?.value
    val oneof1192: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1192)?.value
    val oneof1193: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1193)?.value
    val oneof1194: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1194)?.value
    val oneof1195: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1195)?.value
    val oneof1196: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1196)?.value
    val oneof1197: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1197)?.value
    val oneof1198: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1198)?.value
    val oneof1199: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1199)?.value
    val oneof1200: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1200)?.value
    val oneof1201: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1201)?.value
    val oneof1202: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1202)?.value
    val oneof1203: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1203)?.value
    val oneof1204: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1204)?.value
    val oneof1205: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1205)?.value
    val oneof1206: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1206)?.value
    val oneof1207: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1207)?.value
    val oneof1208: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1208)?.value
    val oneof1209: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1209)?.value
    val oneof1210: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1210)?.value
    val oneof1211: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1211)?.value
    val oneof1212: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1212)?.value
    val oneof1213: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1213)?.value
    val oneof1214: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1214)?.value
    val oneof1215: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1215)?.value
    val oneof1216: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1216)?.value
    val oneof1217: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1217)?.value
    val oneof1218: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1218)?.value
    val oneof1219: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1219)?.value
    val oneof1220: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1220)?.value
    val oneof1221: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1221)?.value
    val oneof1222: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1222)?.value
    val oneof1223: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1223)?.value
    val oneof1224: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1224)?.value
    val oneof1225: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1225)?.value
    val oneof1226: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1226)?.value
    val oneof1227: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1227)?.value
    val oneof1228: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1228)?.value
    val oneof1229: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1229)?.value
    val oneof1230: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1230)?.value
    val oneof1231: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1231)?.value
    val oneof1232: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1232)?.value
    val oneof1233: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1233)?.value
    val oneof1234: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1234)?.value
    val oneof1235: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1235)?.value
    val oneof1236: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1236)?.value
    val oneof1237: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1237)?.value
    val oneof1238: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1238)?.value
    val oneof1239: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1239)?.value
    val oneof1240: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1240)?.value
    val oneof1241: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1241)?.value
    val oneof1242: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1242)?.value
    val oneof1243: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1243)?.value
    val oneof1244: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1244)?.value
    val oneof1245: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1245)?.value
    val oneof1246: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1246)?.value
    val oneof1247: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1247)?.value
    val oneof1248: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1248)?.value
    val oneof1249: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1249)?.value
    val oneof1250: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1250)?.value
    val oneof1251: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1251)?.value
    val oneof1252: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1252)?.value
    val oneof1253: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1253)?.value
    val oneof1254: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1254)?.value
    val oneof1255: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1255)?.value
    val oneof1256: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1256)?.value
    val oneof1257: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1257)?.value
    val oneof1258: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1258)?.value
    val oneof1259: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1259)?.value
    val oneof1260: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1260)?.value
    val oneof1261: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1261)?.value
    val oneof1262: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1262)?.value
    val oneof1263: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1263)?.value
    val oneof1264: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1264)?.value
    val oneof1265: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1265)?.value
    val oneof1266: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1266)?.value
    val oneof1267: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1267)?.value
    val oneof1268: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1268)?.value
    val oneof1269: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1269)?.value
    val oneof1270: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1270)?.value
    val oneof1271: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1271)?.value
    val oneof1272: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1272)?.value
    val oneof1273: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1273)?.value
    val oneof1274: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1274)?.value
    val oneof1275: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1275)?.value
    val oneof1276: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1276)?.value
    val oneof1277: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1277)?.value
    val oneof1278: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1278)?.value
    val oneof1279: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1279)?.value
    val oneof1280: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1280)?.value
    val oneof1281: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1281)?.value
    val oneof1282: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1282)?.value
    val oneof1283: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1283)?.value
    val oneof1284: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1284)?.value
    val oneof1285: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1285)?.value
    val oneof1286: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1286)?.value
    val oneof1287: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1287)?.value
    val oneof1288: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1288)?.value
    val oneof1289: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1289)?.value
    val oneof1290: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1290)?.value
    val oneof1291: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1291)?.value
    val oneof1292: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1292)?.value
    val oneof1293: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1293)?.value
    val oneof1294: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1294)?.value
    val oneof1295: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1295)?.value
    val oneof1296: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1296)?.value
    val oneof1297: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1297)?.value
    val oneof1298: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1298)?.value
    val oneof1299: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1299)?.value
    val oneof1300: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1300)?.value
    val oneof1301: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1301)?.value
    val oneof1302: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1302)?.value
    val oneof1303: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1303)?.value
    val oneof1304: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1304)?.value
    val oneof1305: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1305)?.value
    val oneof1306: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1306)?.value
    val oneof1307: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1307)?.value
    val oneof1308: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1308)?.value
    val oneof1309: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1309)?.value
    val oneof1310: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1310)?.value
    val oneof1311: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1311)?.value
    val oneof1312: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1312)?.value
    val oneof1313: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1313)?.value
    val oneof1314: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1314)?.value
    val oneof1315: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1315)?.value
    val oneof1316: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1316)?.value
    val oneof1317: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1317)?.value
    val oneof1318: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1318)?.value
    val oneof1319: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1319)?.value
    val oneof1320: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1320)?.value
    val oneof1321: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1321)?.value
    val oneof1322: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1322)?.value
    val oneof1323: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1323)?.value
    val oneof1324: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1324)?.value
    val oneof1325: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1325)?.value
    val oneof1326: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1326)?.value
    val oneof1327: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1327)?.value
    val oneof1328: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1328)?.value
    val oneof1329: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1329)?.value
    val oneof1330: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1330)?.value
    val oneof1331: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1331)?.value
    val oneof1332: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1332)?.value
    val oneof1333: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1333)?.value
    val oneof1334: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1334)?.value
    val oneof1335: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1335)?.value
    val oneof1336: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1336)?.value
    val oneof1337: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1337)?.value
    val oneof1338: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1338)?.value
    val oneof1339: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1339)?.value
    val oneof1340: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1340)?.value
    val oneof1341: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1341)?.value
    val oneof1342: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1342)?.value
    val oneof1343: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1343)?.value
    val oneof1344: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1344)?.value
    val oneof1345: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1345)?.value
    val oneof1346: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1346)?.value
    val oneof1347: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1347)?.value
    val oneof1348: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1348)?.value
    val oneof1349: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1349)?.value
    val oneof1350: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1350)?.value
    val oneof1351: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1351)?.value
    val oneof1352: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1352)?.value
    val oneof1353: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1353)?.value
    val oneof1354: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1354)?.value
    val oneof1355: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1355)?.value
    val oneof1356: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1356)?.value
    val oneof1357: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1357)?.value
    val oneof1358: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1358)?.value
    val oneof1359: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1359)?.value
    val oneof1360: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1360)?.value
    val oneof1361: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1361)?.value
    val oneof1362: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1362)?.value
    val oneof1363: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1363)?.value
    val oneof1364: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1364)?.value
    val oneof1365: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1365)?.value
    val oneof1366: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1366)?.value
    val oneof1367: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1367)?.value
    val oneof1368: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1368)?.value
    val oneof1369: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1369)?.value
    val oneof1370: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1370)?.value
    val oneof1371: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1371)?.value
    val oneof1372: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1372)?.value
    val oneof1373: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1373)?.value
    val oneof1374: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1374)?.value
    val oneof1375: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1375)?.value
    val oneof1376: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1376)?.value
    val oneof1377: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1377)?.value
    val oneof1378: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1378)?.value
    val oneof1379: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1379)?.value
    val oneof1380: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1380)?.value
    val oneof1381: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1381)?.value
    val oneof1382: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1382)?.value
    val oneof1383: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1383)?.value
    val oneof1384: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1384)?.value
    val oneof1385: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1385)?.value
    val oneof1386: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1386)?.value
    val oneof1387: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1387)?.value
    val oneof1388: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1388)?.value
    val oneof1389: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1389)?.value
    val oneof1390: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1390)?.value
    val oneof1391: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1391)?.value
    val oneof1392: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1392)?.value
    val oneof1393: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1393)?.value
    val oneof1394: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1394)?.value
    val oneof1395: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1395)?.value
    val oneof1396: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1396)?.value
    val oneof1397: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1397)?.value
    val oneof1398: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1398)?.value
    val oneof1399: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1399)?.value
    val oneof1400: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1400)?.value
    val oneof1401: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1401)?.value
    val oneof1402: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1402)?.value
    val oneof1403: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1403)?.value
    val oneof1404: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1404)?.value
    val oneof1405: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1405)?.value
    val oneof1406: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1406)?.value
    val oneof1407: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1407)?.value
    val oneof1408: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1408)?.value
    val oneof1409: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1409)?.value
    val oneof1410: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1410)?.value
    val oneof1411: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1411)?.value
    val oneof1412: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1412)?.value
    val oneof1413: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1413)?.value
    val oneof1414: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1414)?.value
    val oneof1415: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1415)?.value
    val oneof1416: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1416)?.value
    val oneof1417: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1417)?.value
    val oneof1418: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1418)?.value
    val oneof1419: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1419)?.value
    val oneof1420: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1420)?.value
    val oneof1421: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1421)?.value
    val oneof1422: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1422)?.value
    val oneof1423: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1423)?.value
    val oneof1424: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1424)?.value
    val oneof1425: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1425)?.value
    val oneof1426: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1426)?.value
    val oneof1427: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1427)?.value
    val oneof1428: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1428)?.value
    val oneof1429: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1429)?.value
    val oneof1430: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1430)?.value
    val oneof1431: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1431)?.value
    val oneof1432: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1432)?.value
    val oneof1433: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1433)?.value
    val oneof1434: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1434)?.value
    val oneof1435: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1435)?.value
    val oneof1436: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1436)?.value
    val oneof1437: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1437)?.value
    val oneof1438: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1438)?.value
    val oneof1439: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1439)?.value
    val oneof1440: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1440)?.value
    val oneof1441: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1441)?.value
    val oneof1442: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1442)?.value
    val oneof1443: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1443)?.value
    val oneof1444: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1444)?.value
    val oneof1445: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1445)?.value
    val oneof1446: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1446)?.value
    val oneof1447: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1447)?.value
    val oneof1448: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1448)?.value
    val oneof1449: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1449)?.value
    val oneof1450: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1450)?.value
    val oneof1451: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1451)?.value
    val oneof1452: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1452)?.value
    val oneof1453: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1453)?.value
    val oneof1454: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1454)?.value
    val oneof1455: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1455)?.value
    val oneof1456: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1456)?.value
    val oneof1457: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1457)?.value
    val oneof1458: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1458)?.value
    val oneof1459: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1459)?.value
    val oneof1460: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1460)?.value
    val oneof1461: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1461)?.value
    val oneof1462: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1462)?.value
    val oneof1463: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1463)?.value
    val oneof1464: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1464)?.value
    val oneof1465: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1465)?.value
    val oneof1466: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1466)?.value
    val oneof1467: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1467)?.value
    val oneof1468: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1468)?.value
    val oneof1469: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1469)?.value
    val oneof1470: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1470)?.value
    val oneof1471: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1471)?.value
    val oneof1472: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1472)?.value
    val oneof1473: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1473)?.value
    val oneof1474: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1474)?.value
    val oneof1475: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1475)?.value
    val oneof1476: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1476)?.value
    val oneof1477: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1477)?.value
    val oneof1478: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1478)?.value
    val oneof1479: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1479)?.value
    val oneof1480: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1480)?.value
    val oneof1481: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1481)?.value
    val oneof1482: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1482)?.value
    val oneof1483: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1483)?.value
    val oneof1484: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1484)?.value
    val oneof1485: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1485)?.value
    val oneof1486: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1486)?.value
    val oneof1487: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1487)?.value
    val oneof1488: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1488)?.value
    val oneof1489: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1489)?.value
    val oneof1490: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1490)?.value
    val oneof1491: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1491)?.value
    val oneof1492: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1492)?.value
    val oneof1493: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1493)?.value
    val oneof1494: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1494)?.value
    val oneof1495: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1495)?.value
    val oneof1496: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1496)?.value
    val oneof1497: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1497)?.value
    val oneof1498: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1498)?.value
    val oneof1499: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1499)?.value
    val oneof1500: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1500)?.value
    val oneof1501: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1501)?.value
    val oneof1502: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1502)?.value
    val oneof1503: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1503)?.value
    val oneof1504: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1504)?.value
    val oneof1505: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1505)?.value
    val oneof1506: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1506)?.value
    val oneof1507: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1507)?.value
    val oneof1508: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1508)?.value
    val oneof1509: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1509)?.value
    val oneof1510: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1510)?.value
    val oneof1511: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1511)?.value
    val oneof1512: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1512)?.value
    val oneof1513: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1513)?.value
    val oneof1514: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1514)?.value
    val oneof1515: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1515)?.value
    val oneof1516: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1516)?.value
    val oneof1517: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1517)?.value
    val oneof1518: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1518)?.value
    val oneof1519: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1519)?.value
    val oneof1520: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1520)?.value
    val oneof1521: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1521)?.value
    val oneof1522: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1522)?.value
    val oneof1523: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1523)?.value
    val oneof1524: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1524)?.value
    val oneof1525: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1525)?.value
    val oneof1526: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1526)?.value
    val oneof1527: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1527)?.value
    val oneof1528: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1528)?.value
    val oneof1529: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1529)?.value
    val oneof1530: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1530)?.value
    val oneof1531: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1531)?.value
    val oneof1532: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1532)?.value
    val oneof1533: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1533)?.value
    val oneof1534: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1534)?.value
    val oneof1535: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1535)?.value
    val oneof1536: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1536)?.value
    val oneof1537: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1537)?.value
    val oneof1538: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1538)?.value
    val oneof1539: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1539)?.value
    val oneof1540: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1540)?.value
    val oneof1541: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1541)?.value
    val oneof1542: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1542)?.value
    val oneof1543: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1543)?.value
    val oneof1544: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1544)?.value
    val oneof1545: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1545)?.value
    val oneof1546: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1546)?.value
    val oneof1547: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1547)?.value
    val oneof1548: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1548)?.value
    val oneof1549: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1549)?.value
    val oneof1550: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1550)?.value
    val oneof1551: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1551)?.value
    val oneof1552: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1552)?.value
    val oneof1553: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1553)?.value
    val oneof1554: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1554)?.value
    val oneof1555: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1555)?.value
    val oneof1556: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1556)?.value
    val oneof1557: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1557)?.value
    val oneof1558: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1558)?.value
    val oneof1559: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1559)?.value
    val oneof1560: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1560)?.value
    val oneof1561: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1561)?.value
    val oneof1562: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1562)?.value
    val oneof1563: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1563)?.value
    val oneof1564: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1564)?.value
    val oneof1565: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1565)?.value
    val oneof1566: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1566)?.value
    val oneof1567: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1567)?.value
    val oneof1568: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1568)?.value
    val oneof1569: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1569)?.value
    val oneof1570: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1570)?.value
    val oneof1571: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1571)?.value
    val oneof1572: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1572)?.value
    val oneof1573: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1573)?.value
    val oneof1574: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1574)?.value
    val oneof1575: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1575)?.value
    val oneof1576: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1576)?.value
    val oneof1577: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1577)?.value
    val oneof1578: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1578)?.value
    val oneof1579: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1579)?.value
    val oneof1580: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1580)?.value
    val oneof1581: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1581)?.value
    val oneof1582: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1582)?.value
    val oneof1583: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1583)?.value
    val oneof1584: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1584)?.value
    val oneof1585: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1585)?.value
    val oneof1586: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1586)?.value
    val oneof1587: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1587)?.value
    val oneof1588: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1588)?.value
    val oneof1589: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1589)?.value
    val oneof1590: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1590)?.value
    val oneof1591: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1591)?.value
    val oneof1592: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1592)?.value
    val oneof1593: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1593)?.value
    val oneof1594: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1594)?.value
    val oneof1595: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1595)?.value
    val oneof1596: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1596)?.value
    val oneof1597: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1597)?.value
    val oneof1598: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1598)?.value
    val oneof1599: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1599)?.value
    val oneof1600: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1600)?.value
    val oneof1601: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1601)?.value
    val oneof1602: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1602)?.value
    val oneof1603: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1603)?.value
    val oneof1604: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1604)?.value
    val oneof1605: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1605)?.value
    val oneof1606: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1606)?.value
    val oneof1607: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1607)?.value
    val oneof1608: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1608)?.value
    val oneof1609: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1609)?.value
    val oneof1610: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1610)?.value
    val oneof1611: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1611)?.value
    val oneof1612: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1612)?.value
    val oneof1613: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1613)?.value
    val oneof1614: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1614)?.value
    val oneof1615: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1615)?.value
    val oneof1616: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1616)?.value
    val oneof1617: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1617)?.value
    val oneof1618: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1618)?.value
    val oneof1619: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1619)?.value
    val oneof1620: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1620)?.value
    val oneof1621: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1621)?.value
    val oneof1622: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1622)?.value
    val oneof1623: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1623)?.value
    val oneof1624: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1624)?.value
    val oneof1625: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1625)?.value
    val oneof1626: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1626)?.value
    val oneof1627: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1627)?.value
    val oneof1628: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1628)?.value
    val oneof1629: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1629)?.value
    val oneof1630: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1630)?.value
    val oneof1631: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1631)?.value
    val oneof1632: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1632)?.value
    val oneof1633: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1633)?.value
    val oneof1634: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1634)?.value
    val oneof1635: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1635)?.value
    val oneof1636: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1636)?.value
    val oneof1637: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1637)?.value
    val oneof1638: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1638)?.value
    val oneof1639: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1639)?.value
    val oneof1640: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1640)?.value
    val oneof1641: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1641)?.value
    val oneof1642: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1642)?.value
    val oneof1643: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1643)?.value
    val oneof1644: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1644)?.value
    val oneof1645: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1645)?.value
    val oneof1646: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1646)?.value
    val oneof1647: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1647)?.value
    val oneof1648: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1648)?.value
    val oneof1649: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1649)?.value
    val oneof1650: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1650)?.value
    val oneof1651: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1651)?.value
    val oneof1652: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1652)?.value
    val oneof1653: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1653)?.value
    val oneof1654: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1654)?.value
    val oneof1655: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1655)?.value
    val oneof1656: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1656)?.value
    val oneof1657: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1657)?.value
    val oneof1658: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1658)?.value
    val oneof1659: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1659)?.value
    val oneof1660: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1660)?.value
    val oneof1661: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1661)?.value
    val oneof1662: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1662)?.value
    val oneof1663: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1663)?.value
    val oneof1664: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1664)?.value
    val oneof1665: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1665)?.value
    val oneof1666: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1666)?.value
    val oneof1667: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1667)?.value
    val oneof1668: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1668)?.value
    val oneof1669: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1669)?.value
    val oneof1670: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1670)?.value
    val oneof1671: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1671)?.value
    val oneof1672: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1672)?.value
    val oneof1673: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1673)?.value
    val oneof1674: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1674)?.value
    val oneof1675: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1675)?.value
    val oneof1676: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1676)?.value
    val oneof1677: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1677)?.value
    val oneof1678: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1678)?.value
    val oneof1679: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1679)?.value
    val oneof1680: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1680)?.value
    val oneof1681: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1681)?.value
    val oneof1682: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1682)?.value
    val oneof1683: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1683)?.value
    val oneof1684: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1684)?.value
    val oneof1685: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1685)?.value
    val oneof1686: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1686)?.value
    val oneof1687: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1687)?.value
    val oneof1688: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1688)?.value
    val oneof1689: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1689)?.value
    val oneof1690: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1690)?.value
    val oneof1691: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1691)?.value
    val oneof1692: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1692)?.value
    val oneof1693: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1693)?.value
    val oneof1694: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1694)?.value
    val oneof1695: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1695)?.value
    val oneof1696: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1696)?.value
    val oneof1697: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1697)?.value
    val oneof1698: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1698)?.value
    val oneof1699: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1699)?.value
    val oneof1700: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1700)?.value
    val oneof1701: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1701)?.value
    val oneof1702: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1702)?.value
    val oneof1703: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1703)?.value
    val oneof1704: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1704)?.value
    val oneof1705: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1705)?.value
    val oneof1706: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1706)?.value
    val oneof1707: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1707)?.value
    val oneof1708: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1708)?.value
    val oneof1709: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1709)?.value
    val oneof1710: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1710)?.value
    val oneof1711: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1711)?.value
    val oneof1712: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1712)?.value
    val oneof1713: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1713)?.value
    val oneof1714: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1714)?.value
    val oneof1715: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1715)?.value
    val oneof1716: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1716)?.value
    val oneof1717: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1717)?.value
    val oneof1718: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1718)?.value
    val oneof1719: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1719)?.value
    val oneof1720: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1720)?.value
    val oneof1721: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1721)?.value
    val oneof1722: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1722)?.value
    val oneof1723: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1723)?.value
    val oneof1724: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1724)?.value
    val oneof1725: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1725)?.value
    val oneof1726: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1726)?.value
    val oneof1727: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1727)?.value
    val oneof1728: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1728)?.value
    val oneof1729: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1729)?.value
    val oneof1730: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1730)?.value
    val oneof1731: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1731)?.value
    val oneof1732: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1732)?.value
    val oneof1733: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1733)?.value
    val oneof1734: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1734)?.value
    val oneof1735: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1735)?.value
    val oneof1736: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1736)?.value
    val oneof1737: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1737)?.value
    val oneof1738: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1738)?.value
    val oneof1739: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1739)?.value
    val oneof1740: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1740)?.value
    val oneof1741: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1741)?.value
    val oneof1742: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1742)?.value
    val oneof1743: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1743)?.value
    val oneof1744: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1744)?.value
    val oneof1745: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1745)?.value
    val oneof1746: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1746)?.value
    val oneof1747: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1747)?.value
    val oneof1748: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1748)?.value
    val oneof1749: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1749)?.value
    val oneof1750: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1750)?.value
    val oneof1751: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1751)?.value
    val oneof1752: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1752)?.value
    val oneof1753: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1753)?.value
    val oneof1754: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1754)?.value
    val oneof1755: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1755)?.value
    val oneof1756: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1756)?.value
    val oneof1757: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1757)?.value
    val oneof1758: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1758)?.value
    val oneof1759: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1759)?.value
    val oneof1760: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1760)?.value
    val oneof1761: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1761)?.value
    val oneof1762: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1762)?.value
    val oneof1763: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1763)?.value
    val oneof1764: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1764)?.value
    val oneof1765: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1765)?.value
    val oneof1766: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1766)?.value
    val oneof1767: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1767)?.value
    val oneof1768: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1768)?.value
    val oneof1769: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1769)?.value
    val oneof1770: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1770)?.value
    val oneof1771: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1771)?.value
    val oneof1772: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1772)?.value
    val oneof1773: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1773)?.value
    val oneof1774: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1774)?.value
    val oneof1775: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1775)?.value
    val oneof1776: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1776)?.value
    val oneof1777: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1777)?.value
    val oneof1778: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1778)?.value
    val oneof1779: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1779)?.value
    val oneof1780: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1780)?.value
    val oneof1781: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1781)?.value
    val oneof1782: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1782)?.value
    val oneof1783: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1783)?.value
    val oneof1784: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1784)?.value
    val oneof1785: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1785)?.value
    val oneof1786: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1786)?.value
    val oneof1787: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1787)?.value
    val oneof1788: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1788)?.value
    val oneof1789: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1789)?.value
    val oneof1790: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1790)?.value
    val oneof1791: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1791)?.value
    val oneof1792: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1792)?.value
    val oneof1793: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1793)?.value
    val oneof1794: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1794)?.value
    val oneof1795: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1795)?.value
    val oneof1796: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1796)?.value
    val oneof1797: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1797)?.value
    val oneof1798: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1798)?.value
    val oneof1799: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1799)?.value
    val oneof1800: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1800)?.value
    val oneof1801: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1801)?.value
    val oneof1802: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1802)?.value
    val oneof1803: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1803)?.value
    val oneof1804: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1804)?.value
    val oneof1805: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1805)?.value
    val oneof1806: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1806)?.value
    val oneof1807: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1807)?.value
    val oneof1808: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1808)?.value
    val oneof1809: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1809)?.value
    val oneof1810: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1810)?.value
    val oneof1811: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1811)?.value
    val oneof1812: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1812)?.value
    val oneof1813: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1813)?.value
    val oneof1814: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1814)?.value
    val oneof1815: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1815)?.value
    val oneof1816: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1816)?.value
    val oneof1817: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1817)?.value
    val oneof1818: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1818)?.value
    val oneof1819: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1819)?.value
    val oneof1820: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1820)?.value
    val oneof1821: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1821)?.value
    val oneof1822: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1822)?.value
    val oneof1823: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1823)?.value
    val oneof1824: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1824)?.value
    val oneof1825: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1825)?.value
    val oneof1826: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1826)?.value
    val oneof1827: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1827)?.value
    val oneof1828: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1828)?.value
    val oneof1829: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1829)?.value
    val oneof1830: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1830)?.value
    val oneof1831: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1831)?.value
    val oneof1832: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1832)?.value
    val oneof1833: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1833)?.value
    val oneof1834: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1834)?.value
    val oneof1835: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1835)?.value
    val oneof1836: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1836)?.value
    val oneof1837: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1837)?.value
    val oneof1838: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1838)?.value
    val oneof1839: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1839)?.value
    val oneof1840: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1840)?.value
    val oneof1841: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1841)?.value
    val oneof1842: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1842)?.value
    val oneof1843: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1843)?.value
    val oneof1844: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1844)?.value
    val oneof1845: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1845)?.value
    val oneof1846: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1846)?.value
    val oneof1847: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1847)?.value
    val oneof1848: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1848)?.value
    val oneof1849: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1849)?.value
    val oneof1850: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1850)?.value
    val oneof1851: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1851)?.value
    val oneof1852: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1852)?.value
    val oneof1853: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1853)?.value
    val oneof1854: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1854)?.value
    val oneof1855: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1855)?.value
    val oneof1856: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1856)?.value
    val oneof1857: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1857)?.value
    val oneof1858: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1858)?.value
    val oneof1859: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1859)?.value
    val oneof1860: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1860)?.value
    val oneof1861: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1861)?.value
    val oneof1862: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1862)?.value
    val oneof1863: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1863)?.value
    val oneof1864: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1864)?.value
    val oneof1865: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1865)?.value
    val oneof1866: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1866)?.value
    val oneof1867: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1867)?.value
    val oneof1868: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1868)?.value
    val oneof1869: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1869)?.value
    val oneof1870: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1870)?.value
    val oneof1871: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1871)?.value
    val oneof1872: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1872)?.value
    val oneof1873: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1873)?.value
    val oneof1874: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1874)?.value
    val oneof1875: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1875)?.value
    val oneof1876: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1876)?.value
    val oneof1877: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1877)?.value
    val oneof1878: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1878)?.value
    val oneof1879: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1879)?.value
    val oneof1880: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1880)?.value
    val oneof1881: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1881)?.value
    val oneof1882: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1882)?.value
    val oneof1883: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1883)?.value
    val oneof1884: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1884)?.value
    val oneof1885: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1885)?.value
    val oneof1886: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1886)?.value
    val oneof1887: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1887)?.value
    val oneof1888: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1888)?.value
    val oneof1889: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1889)?.value
    val oneof1890: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1890)?.value
    val oneof1891: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1891)?.value
    val oneof1892: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1892)?.value
    val oneof1893: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1893)?.value
    val oneof1894: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1894)?.value
    val oneof1895: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1895)?.value
    val oneof1896: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1896)?.value
    val oneof1897: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1897)?.value
    val oneof1898: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1898)?.value
    val oneof1899: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1899)?.value
    val oneof1900: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1900)?.value
    val oneof1901: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1901)?.value
    val oneof1902: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1902)?.value
    val oneof1903: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1903)?.value
    val oneof1904: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1904)?.value
    val oneof1905: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1905)?.value
    val oneof1906: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1906)?.value
    val oneof1907: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1907)?.value
    val oneof1908: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1908)?.value
    val oneof1909: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1909)?.value
    val oneof1910: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1910)?.value
    val oneof1911: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1911)?.value
    val oneof1912: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1912)?.value
    val oneof1913: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1913)?.value
    val oneof1914: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1914)?.value
    val oneof1915: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1915)?.value
    val oneof1916: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1916)?.value
    val oneof1917: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1917)?.value
    val oneof1918: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1918)?.value
    val oneof1919: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1919)?.value
    val oneof1920: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1920)?.value
    val oneof1921: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1921)?.value
    val oneof1922: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1922)?.value
    val oneof1923: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1923)?.value
    val oneof1924: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1924)?.value
    val oneof1925: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1925)?.value
    val oneof1926: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1926)?.value
    val oneof1927: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1927)?.value
    val oneof1928: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1928)?.value
    val oneof1929: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1929)?.value
    val oneof1930: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1930)?.value
    val oneof1931: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1931)?.value
    val oneof1932: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1932)?.value
    val oneof1933: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1933)?.value
    val oneof1934: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1934)?.value
    val oneof1935: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1935)?.value
    val oneof1936: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1936)?.value
    val oneof1937: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1937)?.value
    val oneof1938: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1938)?.value
    val oneof1939: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1939)?.value
    val oneof1940: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1940)?.value
    val oneof1941: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1941)?.value
    val oneof1942: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1942)?.value
    val oneof1943: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1943)?.value
    val oneof1944: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1944)?.value
    val oneof1945: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1945)?.value
    val oneof1946: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1946)?.value
    val oneof1947: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1947)?.value
    val oneof1948: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1948)?.value
    val oneof1949: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1949)?.value
    val oneof1950: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1950)?.value
    val oneof1951: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1951)?.value
    val oneof1952: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1952)?.value
    val oneof1953: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1953)?.value
    val oneof1954: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1954)?.value
    val oneof1955: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1955)?.value
    val oneof1956: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1956)?.value
    val oneof1957: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1957)?.value
    val oneof1958: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1958)?.value
    val oneof1959: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1959)?.value
    val oneof1960: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1960)?.value
    val oneof1961: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1961)?.value
    val oneof1962: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1962)?.value
    val oneof1963: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1963)?.value
    val oneof1964: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1964)?.value
    val oneof1965: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1965)?.value
    val oneof1966: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1966)?.value
    val oneof1967: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1967)?.value
    val oneof1968: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1968)?.value
    val oneof1969: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1969)?.value
    val oneof1970: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1970)?.value
    val oneof1971: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1971)?.value
    val oneof1972: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1972)?.value
    val oneof1973: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1973)?.value
    val oneof1974: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1974)?.value
    val oneof1975: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1975)?.value
    val oneof1976: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1976)?.value
    val oneof1977: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1977)?.value
    val oneof1978: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1978)?.value
    val oneof1979: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1979)?.value
    val oneof1980: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1980)?.value
    val oneof1981: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1981)?.value
    val oneof1982: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1982)?.value
    val oneof1983: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1983)?.value
    val oneof1984: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1984)?.value
    val oneof1985: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1985)?.value
    val oneof1986: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1986)?.value
    val oneof1987: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1987)?.value
    val oneof1988: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1988)?.value
    val oneof1989: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1989)?.value
    val oneof1990: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1990)?.value
    val oneof1991: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1991)?.value
    val oneof1992: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1992)?.value
    val oneof1993: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1993)?.value
    val oneof1994: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1994)?.value
    val oneof1995: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1995)?.value
    val oneof1996: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1996)?.value
    val oneof1997: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1997)?.value
    val oneof1998: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1998)?.value
    val oneof1999: Int?
        get() = (hugeOneof as? HugeOneof.Oneof1999)?.value

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithHugeOneof> {
        val defaultInstance by lazy { pbandk.testpb.MessageWithHugeOneof() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.MessageWithHugeOneof.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithHugeOneof> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.MessageWithHugeOneof, *>>(1000).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1000",
                        number = 1000,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1000",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1000
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1001",
                        number = 1001,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1001",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1001
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1002",
                        number = 1002,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1002",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1002
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1003",
                        number = 1003,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1003",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1003
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1004",
                        number = 1004,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1004",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1004
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1005",
                        number = 1005,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1005",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1005
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1006",
                        number = 1006,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1006",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1006
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1007",
                        number = 1007,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1007",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1007
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1008",
                        number = 1008,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1008",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1008
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1009",
                        number = 1009,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1009",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1009
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1010",
                        number = 1010,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1010",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1010
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1011",
                        number = 1011,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1011",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1011
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1012",
                        number = 1012,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1012",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1012
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1013",
                        number = 1013,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1013",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1013
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1014",
                        number = 1014,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1014",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1014
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1015",
                        number = 1015,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1015",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1015
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1016",
                        number = 1016,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1016",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1016
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1017",
                        number = 1017,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1017",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1017
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1018",
                        number = 1018,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1018",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1018
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1019",
                        number = 1019,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1019",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1019
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1020",
                        number = 1020,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1020",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1020
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1021",
                        number = 1021,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1021",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1021
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1022",
                        number = 1022,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1022",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1022
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1023",
                        number = 1023,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1023",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1023
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1024",
                        number = 1024,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1024",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1024
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1025",
                        number = 1025,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1025",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1025
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1026",
                        number = 1026,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1026",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1026
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1027",
                        number = 1027,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1027",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1027
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1028",
                        number = 1028,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1028",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1028
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1029",
                        number = 1029,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1029",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1029
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1030",
                        number = 1030,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1030",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1030
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1031",
                        number = 1031,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1031",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1031
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1032",
                        number = 1032,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1032",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1032
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1033",
                        number = 1033,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1033",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1033
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1034",
                        number = 1034,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1034",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1034
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1035",
                        number = 1035,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1035",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1035
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1036",
                        number = 1036,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1036",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1036
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1037",
                        number = 1037,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1037",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1037
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1038",
                        number = 1038,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1038",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1038
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1039",
                        number = 1039,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1039",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1039
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1040",
                        number = 1040,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1040",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1040
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1041",
                        number = 1041,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1041",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1041
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1042",
                        number = 1042,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1042",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1042
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1043",
                        number = 1043,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1043",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1043
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1044",
                        number = 1044,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1044",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1044
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1045",
                        number = 1045,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1045",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1045
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1046",
                        number = 1046,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1046",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1046
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1047",
                        number = 1047,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1047",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1047
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1048",
                        number = 1048,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1048",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1048
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1049",
                        number = 1049,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1049",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1049
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1050",
                        number = 1050,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1050",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1050
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1051",
                        number = 1051,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1051",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1051
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1052",
                        number = 1052,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1052",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1052
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1053",
                        number = 1053,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1053",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1053
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1054",
                        number = 1054,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1054",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1054
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1055",
                        number = 1055,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1055",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1055
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1056",
                        number = 1056,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1056",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1056
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1057",
                        number = 1057,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1057",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1057
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1058",
                        number = 1058,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1058",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1058
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1059",
                        number = 1059,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1059",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1059
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1060",
                        number = 1060,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1060",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1060
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1061",
                        number = 1061,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1061",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1061
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1062",
                        number = 1062,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1062",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1062
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1063",
                        number = 1063,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1063",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1063
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1064",
                        number = 1064,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1064",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1064
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1065",
                        number = 1065,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1065",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1065
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1066",
                        number = 1066,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1066",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1066
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1067",
                        number = 1067,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1067",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1067
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1068",
                        number = 1068,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1068",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1068
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1069",
                        number = 1069,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1069",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1069
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1070",
                        number = 1070,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1070",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1070
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1071",
                        number = 1071,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1071",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1071
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1072",
                        number = 1072,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1072",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1072
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1073",
                        number = 1073,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1073",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1073
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1074",
                        number = 1074,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1074",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1074
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1075",
                        number = 1075,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1075",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1075
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1076",
                        number = 1076,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1076",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1076
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1077",
                        number = 1077,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1077",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1077
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1078",
                        number = 1078,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1078",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1078
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1079",
                        number = 1079,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1079",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1079
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1080",
                        number = 1080,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1080",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1080
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1081",
                        number = 1081,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1081",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1081
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1082",
                        number = 1082,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1082",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1082
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1083",
                        number = 1083,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1083",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1083
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1084",
                        number = 1084,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1084",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1084
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1085",
                        number = 1085,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1085",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1085
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1086",
                        number = 1086,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1086",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1086
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1087",
                        number = 1087,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1087",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1087
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1088",
                        number = 1088,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1088",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1088
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1089",
                        number = 1089,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1089",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1089
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1090",
                        number = 1090,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1090",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1090
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1091",
                        number = 1091,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1091",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1091
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1092",
                        number = 1092,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1092",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1092
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1093",
                        number = 1093,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1093",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1093
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1094",
                        number = 1094,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1094",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1094
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1095",
                        number = 1095,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1095",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1095
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1096",
                        number = 1096,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1096",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1096
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1097",
                        number = 1097,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1097",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1097
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1098",
                        number = 1098,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1098",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1098
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1099",
                        number = 1099,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1099",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1099
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1100",
                        number = 1100,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1100",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1100
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1101",
                        number = 1101,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1101",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1101
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1102",
                        number = 1102,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1102",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1102
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1103",
                        number = 1103,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1103",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1103
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1104",
                        number = 1104,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1104",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1104
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1105",
                        number = 1105,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1105",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1105
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1106",
                        number = 1106,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1106",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1106
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1107",
                        number = 1107,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1107",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1107
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1108",
                        number = 1108,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1108",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1108
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1109",
                        number = 1109,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1109",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1109
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1110",
                        number = 1110,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1110",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1110
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1111",
                        number = 1111,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1111",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1111
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1112",
                        number = 1112,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1112",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1112
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1113",
                        number = 1113,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1113",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1113
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1114",
                        number = 1114,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1114",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1114
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1115",
                        number = 1115,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1115",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1115
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1116",
                        number = 1116,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1116",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1116
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1117",
                        number = 1117,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1117",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1117
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1118",
                        number = 1118,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1118",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1118
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1119",
                        number = 1119,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1119",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1119
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1120",
                        number = 1120,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1120",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1120
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1121",
                        number = 1121,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1121",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1121
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1122",
                        number = 1122,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1122",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1122
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1123",
                        number = 1123,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1123",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1123
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1124",
                        number = 1124,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1124",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1124
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1125",
                        number = 1125,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1125",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1125
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1126",
                        number = 1126,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1126",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1126
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1127",
                        number = 1127,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1127",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1127
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1128",
                        number = 1128,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1128",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1128
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1129",
                        number = 1129,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1129",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1129
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1130",
                        number = 1130,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1130",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1130
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1131",
                        number = 1131,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1131",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1131
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1132",
                        number = 1132,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1132",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1132
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1133",
                        number = 1133,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1133",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1133
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1134",
                        number = 1134,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1134",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1134
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1135",
                        number = 1135,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1135",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1135
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1136",
                        number = 1136,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1136",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1136
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1137",
                        number = 1137,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1137",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1137
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1138",
                        number = 1138,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1138",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1138
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1139",
                        number = 1139,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1139",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1139
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1140",
                        number = 1140,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1140",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1140
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1141",
                        number = 1141,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1141",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1141
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1142",
                        number = 1142,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1142",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1142
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1143",
                        number = 1143,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1143",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1143
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1144",
                        number = 1144,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1144",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1144
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1145",
                        number = 1145,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1145",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1145
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1146",
                        number = 1146,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1146",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1146
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1147",
                        number = 1147,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1147",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1147
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1148",
                        number = 1148,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1148",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1148
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1149",
                        number = 1149,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1149",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1149
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1150",
                        number = 1150,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1150",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1150
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1151",
                        number = 1151,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1151",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1151
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1152",
                        number = 1152,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1152",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1152
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1153",
                        number = 1153,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1153",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1153
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1154",
                        number = 1154,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1154",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1154
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1155",
                        number = 1155,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1155",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1155
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1156",
                        number = 1156,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1156",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1156
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1157",
                        number = 1157,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1157",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1157
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1158",
                        number = 1158,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1158",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1158
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1159",
                        number = 1159,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1159",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1159
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1160",
                        number = 1160,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1160",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1160
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1161",
                        number = 1161,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1161",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1161
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1162",
                        number = 1162,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1162",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1162
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1163",
                        number = 1163,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1163",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1163
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1164",
                        number = 1164,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1164",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1164
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1165",
                        number = 1165,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1165",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1165
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1166",
                        number = 1166,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1166",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1166
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1167",
                        number = 1167,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1167",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1167
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1168",
                        number = 1168,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1168",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1168
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1169",
                        number = 1169,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1169",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1169
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1170",
                        number = 1170,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1170",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1170
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1171",
                        number = 1171,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1171",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1171
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1172",
                        number = 1172,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1172",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1172
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1173",
                        number = 1173,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1173",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1173
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1174",
                        number = 1174,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1174",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1174
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1175",
                        number = 1175,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1175",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1175
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1176",
                        number = 1176,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1176",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1176
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1177",
                        number = 1177,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1177",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1177
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1178",
                        number = 1178,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1178",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1178
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1179",
                        number = 1179,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1179",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1179
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1180",
                        number = 1180,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1180",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1180
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1181",
                        number = 1181,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1181",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1181
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1182",
                        number = 1182,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1182",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1182
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1183",
                        number = 1183,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1183",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1183
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1184",
                        number = 1184,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1184",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1184
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1185",
                        number = 1185,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1185",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1185
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1186",
                        number = 1186,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1186",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1186
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1187",
                        number = 1187,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1187",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1187
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1188",
                        number = 1188,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1188",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1188
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1189",
                        number = 1189,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1189",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1189
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1190",
                        number = 1190,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1190",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1190
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1191",
                        number = 1191,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1191",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1191
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1192",
                        number = 1192,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1192",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1192
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1193",
                        number = 1193,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1193",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1193
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1194",
                        number = 1194,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1194",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1194
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1195",
                        number = 1195,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1195",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1195
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1196",
                        number = 1196,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1196",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1196
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1197",
                        number = 1197,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1197",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1197
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1198",
                        number = 1198,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1198",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1198
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1199",
                        number = 1199,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1199",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1199
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1200",
                        number = 1200,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1200",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1200
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1201",
                        number = 1201,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1201",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1201
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1202",
                        number = 1202,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1202",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1202
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1203",
                        number = 1203,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1203",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1203
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1204",
                        number = 1204,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1204",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1204
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1205",
                        number = 1205,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1205",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1205
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1206",
                        number = 1206,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1206",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1206
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1207",
                        number = 1207,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1207",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1207
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1208",
                        number = 1208,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1208",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1208
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1209",
                        number = 1209,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1209",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1209
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1210",
                        number = 1210,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1210",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1210
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1211",
                        number = 1211,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1211",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1211
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1212",
                        number = 1212,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1212",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1212
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1213",
                        number = 1213,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1213",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1213
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1214",
                        number = 1214,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1214",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1214
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1215",
                        number = 1215,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1215",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1215
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1216",
                        number = 1216,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1216",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1216
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1217",
                        number = 1217,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1217",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1217
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1218",
                        number = 1218,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1218",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1218
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1219",
                        number = 1219,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1219",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1219
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1220",
                        number = 1220,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1220",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1220
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1221",
                        number = 1221,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1221",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1221
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1222",
                        number = 1222,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1222",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1222
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1223",
                        number = 1223,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1223",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1223
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1224",
                        number = 1224,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1224",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1224
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1225",
                        number = 1225,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1225",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1225
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1226",
                        number = 1226,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1226",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1226
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1227",
                        number = 1227,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1227",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1227
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1228",
                        number = 1228,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1228",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1228
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1229",
                        number = 1229,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1229",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1229
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1230",
                        number = 1230,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1230",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1230
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1231",
                        number = 1231,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1231",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1231
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1232",
                        number = 1232,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1232",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1232
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1233",
                        number = 1233,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1233",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1233
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1234",
                        number = 1234,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1234",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1234
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1235",
                        number = 1235,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1235",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1235
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1236",
                        number = 1236,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1236",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1236
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1237",
                        number = 1237,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1237",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1237
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1238",
                        number = 1238,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1238",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1238
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1239",
                        number = 1239,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1239",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1239
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1240",
                        number = 1240,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1240",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1240
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1241",
                        number = 1241,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1241",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1241
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1242",
                        number = 1242,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1242",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1242
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1243",
                        number = 1243,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1243",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1243
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1244",
                        number = 1244,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1244",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1244
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1245",
                        number = 1245,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1245",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1245
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1246",
                        number = 1246,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1246",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1246
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1247",
                        number = 1247,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1247",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1247
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1248",
                        number = 1248,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1248",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1248
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1249",
                        number = 1249,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1249",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1249
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1250",
                        number = 1250,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1250",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1250
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1251",
                        number = 1251,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1251",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1251
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1252",
                        number = 1252,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1252",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1252
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1253",
                        number = 1253,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1253",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1253
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1254",
                        number = 1254,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1254",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1254
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1255",
                        number = 1255,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1255",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1255
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1256",
                        number = 1256,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1256",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1256
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1257",
                        number = 1257,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1257",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1257
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1258",
                        number = 1258,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1258",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1258
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1259",
                        number = 1259,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1259",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1259
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1260",
                        number = 1260,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1260",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1260
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1261",
                        number = 1261,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1261",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1261
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1262",
                        number = 1262,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1262",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1262
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1263",
                        number = 1263,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1263",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1263
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1264",
                        number = 1264,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1264",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1264
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1265",
                        number = 1265,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1265",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1265
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1266",
                        number = 1266,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1266",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1266
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1267",
                        number = 1267,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1267",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1267
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1268",
                        number = 1268,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1268",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1268
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1269",
                        number = 1269,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1269",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1269
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1270",
                        number = 1270,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1270",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1270
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1271",
                        number = 1271,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1271",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1271
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1272",
                        number = 1272,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1272",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1272
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1273",
                        number = 1273,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1273",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1273
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1274",
                        number = 1274,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1274",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1274
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1275",
                        number = 1275,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1275",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1275
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1276",
                        number = 1276,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1276",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1276
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1277",
                        number = 1277,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1277",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1277
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1278",
                        number = 1278,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1278",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1278
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1279",
                        number = 1279,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1279",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1279
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1280",
                        number = 1280,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1280",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1280
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1281",
                        number = 1281,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1281",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1281
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1282",
                        number = 1282,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1282",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1282
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1283",
                        number = 1283,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1283",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1283
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1284",
                        number = 1284,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1284",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1284
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1285",
                        number = 1285,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1285",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1285
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1286",
                        number = 1286,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1286",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1286
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1287",
                        number = 1287,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1287",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1287
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1288",
                        number = 1288,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1288",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1288
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1289",
                        number = 1289,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1289",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1289
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1290",
                        number = 1290,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1290",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1290
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1291",
                        number = 1291,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1291",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1291
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1292",
                        number = 1292,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1292",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1292
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1293",
                        number = 1293,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1293",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1293
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1294",
                        number = 1294,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1294",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1294
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1295",
                        number = 1295,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1295",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1295
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1296",
                        number = 1296,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1296",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1296
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1297",
                        number = 1297,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1297",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1297
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1298",
                        number = 1298,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1298",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1298
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1299",
                        number = 1299,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1299",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1299
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1300",
                        number = 1300,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1300",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1300
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1301",
                        number = 1301,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1301",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1301
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1302",
                        number = 1302,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1302",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1302
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1303",
                        number = 1303,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1303",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1303
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1304",
                        number = 1304,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1304",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1304
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1305",
                        number = 1305,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1305",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1305
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1306",
                        number = 1306,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1306",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1306
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1307",
                        number = 1307,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1307",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1307
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1308",
                        number = 1308,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1308",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1308
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1309",
                        number = 1309,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1309",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1309
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1310",
                        number = 1310,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1310",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1310
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1311",
                        number = 1311,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1311",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1311
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1312",
                        number = 1312,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1312",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1312
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1313",
                        number = 1313,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1313",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1313
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1314",
                        number = 1314,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1314",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1314
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1315",
                        number = 1315,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1315",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1315
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1316",
                        number = 1316,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1316",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1316
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1317",
                        number = 1317,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1317",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1317
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1318",
                        number = 1318,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1318",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1318
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1319",
                        number = 1319,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1319",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1319
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1320",
                        number = 1320,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1320",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1320
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1321",
                        number = 1321,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1321",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1321
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1322",
                        number = 1322,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1322",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1322
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1323",
                        number = 1323,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1323",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1323
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1324",
                        number = 1324,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1324",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1324
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1325",
                        number = 1325,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1325",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1325
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1326",
                        number = 1326,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1326",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1326
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1327",
                        number = 1327,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1327",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1327
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1328",
                        number = 1328,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1328",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1328
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1329",
                        number = 1329,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1329",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1329
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1330",
                        number = 1330,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1330",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1330
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1331",
                        number = 1331,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1331",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1331
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1332",
                        number = 1332,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1332",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1332
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1333",
                        number = 1333,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1333",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1333
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1334",
                        number = 1334,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1334",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1334
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1335",
                        number = 1335,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1335",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1335
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1336",
                        number = 1336,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1336",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1336
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1337",
                        number = 1337,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1337",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1337
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1338",
                        number = 1338,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1338",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1338
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1339",
                        number = 1339,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1339",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1339
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1340",
                        number = 1340,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1340",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1340
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1341",
                        number = 1341,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1341",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1341
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1342",
                        number = 1342,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1342",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1342
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1343",
                        number = 1343,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1343",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1343
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1344",
                        number = 1344,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1344",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1344
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1345",
                        number = 1345,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1345",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1345
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1346",
                        number = 1346,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1346",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1346
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1347",
                        number = 1347,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1347",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1347
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1348",
                        number = 1348,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1348",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1348
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1349",
                        number = 1349,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1349",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1349
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1350",
                        number = 1350,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1350",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1350
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1351",
                        number = 1351,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1351",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1351
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1352",
                        number = 1352,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1352",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1352
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1353",
                        number = 1353,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1353",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1353
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1354",
                        number = 1354,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1354",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1354
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1355",
                        number = 1355,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1355",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1355
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1356",
                        number = 1356,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1356",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1356
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1357",
                        number = 1357,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1357",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1357
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1358",
                        number = 1358,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1358",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1358
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1359",
                        number = 1359,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1359",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1359
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1360",
                        number = 1360,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1360",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1360
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1361",
                        number = 1361,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1361",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1361
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1362",
                        number = 1362,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1362",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1362
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1363",
                        number = 1363,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1363",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1363
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1364",
                        number = 1364,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1364",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1364
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1365",
                        number = 1365,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1365",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1365
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1366",
                        number = 1366,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1366",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1366
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1367",
                        number = 1367,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1367",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1367
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1368",
                        number = 1368,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1368",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1368
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1369",
                        number = 1369,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1369",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1369
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1370",
                        number = 1370,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1370",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1370
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1371",
                        number = 1371,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1371",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1371
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1372",
                        number = 1372,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1372",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1372
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1373",
                        number = 1373,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1373",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1373
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1374",
                        number = 1374,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1374",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1374
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1375",
                        number = 1375,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1375",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1375
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1376",
                        number = 1376,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1376",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1376
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1377",
                        number = 1377,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1377",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1377
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1378",
                        number = 1378,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1378",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1378
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1379",
                        number = 1379,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1379",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1379
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1380",
                        number = 1380,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1380",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1380
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1381",
                        number = 1381,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1381",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1381
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1382",
                        number = 1382,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1382",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1382
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1383",
                        number = 1383,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1383",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1383
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1384",
                        number = 1384,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1384",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1384
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1385",
                        number = 1385,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1385",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1385
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1386",
                        number = 1386,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1386",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1386
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1387",
                        number = 1387,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1387",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1387
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1388",
                        number = 1388,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1388",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1388
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1389",
                        number = 1389,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1389",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1389
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1390",
                        number = 1390,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1390",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1390
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1391",
                        number = 1391,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1391",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1391
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1392",
                        number = 1392,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1392",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1392
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1393",
                        number = 1393,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1393",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1393
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1394",
                        number = 1394,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1394",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1394
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1395",
                        number = 1395,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1395",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1395
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1396",
                        number = 1396,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1396",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1396
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1397",
                        number = 1397,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1397",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1397
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1398",
                        number = 1398,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1398",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1398
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1399",
                        number = 1399,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1399",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1399
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1400",
                        number = 1400,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1400",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1400
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1401",
                        number = 1401,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1401",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1401
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1402",
                        number = 1402,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1402",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1402
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1403",
                        number = 1403,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1403",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1403
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1404",
                        number = 1404,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1404",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1404
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1405",
                        number = 1405,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1405",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1405
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1406",
                        number = 1406,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1406",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1406
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1407",
                        number = 1407,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1407",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1407
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1408",
                        number = 1408,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1408",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1408
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1409",
                        number = 1409,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1409",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1409
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1410",
                        number = 1410,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1410",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1410
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1411",
                        number = 1411,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1411",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1411
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1412",
                        number = 1412,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1412",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1412
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1413",
                        number = 1413,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1413",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1413
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1414",
                        number = 1414,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1414",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1414
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1415",
                        number = 1415,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1415",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1415
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1416",
                        number = 1416,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1416",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1416
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1417",
                        number = 1417,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1417",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1417
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1418",
                        number = 1418,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1418",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1418
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1419",
                        number = 1419,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1419",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1419
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1420",
                        number = 1420,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1420",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1420
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1421",
                        number = 1421,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1421",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1421
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1422",
                        number = 1422,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1422",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1422
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1423",
                        number = 1423,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1423",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1423
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1424",
                        number = 1424,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1424",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1424
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1425",
                        number = 1425,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1425",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1425
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1426",
                        number = 1426,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1426",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1426
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1427",
                        number = 1427,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1427",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1427
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1428",
                        number = 1428,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1428",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1428
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1429",
                        number = 1429,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1429",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1429
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1430",
                        number = 1430,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1430",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1430
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1431",
                        number = 1431,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1431",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1431
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1432",
                        number = 1432,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1432",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1432
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1433",
                        number = 1433,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1433",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1433
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1434",
                        number = 1434,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1434",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1434
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1435",
                        number = 1435,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1435",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1435
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1436",
                        number = 1436,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1436",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1436
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1437",
                        number = 1437,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1437",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1437
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1438",
                        number = 1438,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1438",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1438
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1439",
                        number = 1439,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1439",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1439
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1440",
                        number = 1440,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1440",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1440
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1441",
                        number = 1441,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1441",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1441
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1442",
                        number = 1442,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1442",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1442
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1443",
                        number = 1443,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1443",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1443
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1444",
                        number = 1444,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1444",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1444
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1445",
                        number = 1445,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1445",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1445
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1446",
                        number = 1446,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1446",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1446
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1447",
                        number = 1447,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1447",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1447
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1448",
                        number = 1448,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1448",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1448
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1449",
                        number = 1449,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1449",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1449
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1450",
                        number = 1450,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1450",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1450
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1451",
                        number = 1451,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1451",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1451
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1452",
                        number = 1452,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1452",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1452
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1453",
                        number = 1453,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1453",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1453
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1454",
                        number = 1454,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1454",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1454
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1455",
                        number = 1455,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1455",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1455
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1456",
                        number = 1456,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1456",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1456
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1457",
                        number = 1457,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1457",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1457
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1458",
                        number = 1458,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1458",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1458
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1459",
                        number = 1459,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1459",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1459
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1460",
                        number = 1460,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1460",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1460
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1461",
                        number = 1461,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1461",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1461
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1462",
                        number = 1462,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1462",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1462
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1463",
                        number = 1463,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1463",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1463
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1464",
                        number = 1464,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1464",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1464
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1465",
                        number = 1465,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1465",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1465
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1466",
                        number = 1466,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1466",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1466
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1467",
                        number = 1467,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1467",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1467
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1468",
                        number = 1468,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1468",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1468
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1469",
                        number = 1469,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1469",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1469
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1470",
                        number = 1470,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1470",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1470
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1471",
                        number = 1471,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1471",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1471
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1472",
                        number = 1472,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1472",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1472
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1473",
                        number = 1473,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1473",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1473
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1474",
                        number = 1474,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1474",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1474
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1475",
                        number = 1475,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1475",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1475
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1476",
                        number = 1476,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1476",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1476
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1477",
                        number = 1477,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1477",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1477
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1478",
                        number = 1478,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1478",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1478
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1479",
                        number = 1479,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1479",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1479
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1480",
                        number = 1480,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1480",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1480
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1481",
                        number = 1481,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1481",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1481
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1482",
                        number = 1482,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1482",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1482
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1483",
                        number = 1483,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1483",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1483
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1484",
                        number = 1484,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1484",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1484
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1485",
                        number = 1485,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1485",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1485
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1486",
                        number = 1486,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1486",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1486
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1487",
                        number = 1487,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1487",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1487
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1488",
                        number = 1488,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1488",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1488
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1489",
                        number = 1489,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1489",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1489
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1490",
                        number = 1490,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1490",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1490
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1491",
                        number = 1491,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1491",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1491
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1492",
                        number = 1492,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1492",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1492
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1493",
                        number = 1493,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1493",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1493
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1494",
                        number = 1494,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1494",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1494
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1495",
                        number = 1495,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1495",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1495
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1496",
                        number = 1496,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1496",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1496
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1497",
                        number = 1497,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1497",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1497
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1498",
                        number = 1498,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1498",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1498
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1499",
                        number = 1499,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1499",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1499
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1500",
                        number = 1500,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1500",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1500
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1501",
                        number = 1501,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1501",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1501
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1502",
                        number = 1502,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1502",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1502
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1503",
                        number = 1503,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1503",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1503
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1504",
                        number = 1504,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1504",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1504
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1505",
                        number = 1505,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1505",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1505
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1506",
                        number = 1506,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1506",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1506
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1507",
                        number = 1507,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1507",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1507
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1508",
                        number = 1508,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1508",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1508
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1509",
                        number = 1509,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1509",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1509
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1510",
                        number = 1510,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1510",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1510
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1511",
                        number = 1511,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1511",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1511
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1512",
                        number = 1512,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1512",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1512
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1513",
                        number = 1513,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1513",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1513
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1514",
                        number = 1514,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1514",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1514
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1515",
                        number = 1515,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1515",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1515
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1516",
                        number = 1516,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1516",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1516
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1517",
                        number = 1517,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1517",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1517
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1518",
                        number = 1518,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1518",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1518
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1519",
                        number = 1519,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1519",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1519
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1520",
                        number = 1520,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1520",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1520
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1521",
                        number = 1521,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1521",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1521
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1522",
                        number = 1522,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1522",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1522
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1523",
                        number = 1523,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1523",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1523
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1524",
                        number = 1524,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1524",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1524
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1525",
                        number = 1525,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1525",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1525
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1526",
                        number = 1526,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1526",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1526
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1527",
                        number = 1527,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1527",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1527
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1528",
                        number = 1528,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1528",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1528
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1529",
                        number = 1529,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1529",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1529
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1530",
                        number = 1530,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1530",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1530
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1531",
                        number = 1531,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1531",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1531
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1532",
                        number = 1532,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1532",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1532
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1533",
                        number = 1533,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1533",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1533
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1534",
                        number = 1534,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1534",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1534
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1535",
                        number = 1535,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1535",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1535
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1536",
                        number = 1536,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1536",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1536
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1537",
                        number = 1537,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1537",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1537
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1538",
                        number = 1538,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1538",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1538
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1539",
                        number = 1539,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1539",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1539
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1540",
                        number = 1540,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1540",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1540
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1541",
                        number = 1541,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1541",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1541
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1542",
                        number = 1542,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1542",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1542
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1543",
                        number = 1543,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1543",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1543
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1544",
                        number = 1544,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1544",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1544
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1545",
                        number = 1545,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1545",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1545
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1546",
                        number = 1546,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1546",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1546
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1547",
                        number = 1547,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1547",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1547
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1548",
                        number = 1548,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1548",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1548
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1549",
                        number = 1549,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1549",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1549
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1550",
                        number = 1550,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1550",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1550
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1551",
                        number = 1551,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1551",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1551
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1552",
                        number = 1552,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1552",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1552
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1553",
                        number = 1553,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1553",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1553
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1554",
                        number = 1554,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1554",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1554
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1555",
                        number = 1555,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1555",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1555
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1556",
                        number = 1556,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1556",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1556
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1557",
                        number = 1557,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1557",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1557
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1558",
                        number = 1558,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1558",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1558
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1559",
                        number = 1559,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1559",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1559
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1560",
                        number = 1560,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1560",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1560
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1561",
                        number = 1561,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1561",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1561
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1562",
                        number = 1562,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1562",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1562
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1563",
                        number = 1563,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1563",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1563
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1564",
                        number = 1564,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1564",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1564
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1565",
                        number = 1565,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1565",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1565
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1566",
                        number = 1566,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1566",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1566
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1567",
                        number = 1567,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1567",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1567
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1568",
                        number = 1568,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1568",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1568
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1569",
                        number = 1569,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1569",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1569
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1570",
                        number = 1570,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1570",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1570
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1571",
                        number = 1571,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1571",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1571
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1572",
                        number = 1572,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1572",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1572
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1573",
                        number = 1573,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1573",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1573
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1574",
                        number = 1574,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1574",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1574
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1575",
                        number = 1575,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1575",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1575
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1576",
                        number = 1576,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1576",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1576
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1577",
                        number = 1577,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1577",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1577
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1578",
                        number = 1578,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1578",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1578
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1579",
                        number = 1579,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1579",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1579
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1580",
                        number = 1580,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1580",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1580
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1581",
                        number = 1581,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1581",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1581
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1582",
                        number = 1582,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1582",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1582
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1583",
                        number = 1583,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1583",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1583
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1584",
                        number = 1584,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1584",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1584
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1585",
                        number = 1585,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1585",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1585
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1586",
                        number = 1586,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1586",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1586
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1587",
                        number = 1587,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1587",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1587
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1588",
                        number = 1588,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1588",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1588
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1589",
                        number = 1589,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1589",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1589
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1590",
                        number = 1590,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1590",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1590
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1591",
                        number = 1591,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1591",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1591
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1592",
                        number = 1592,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1592",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1592
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1593",
                        number = 1593,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1593",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1593
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1594",
                        number = 1594,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1594",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1594
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1595",
                        number = 1595,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1595",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1595
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1596",
                        number = 1596,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1596",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1596
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1597",
                        number = 1597,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1597",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1597
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1598",
                        number = 1598,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1598",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1598
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1599",
                        number = 1599,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1599",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1599
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1600",
                        number = 1600,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1600",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1600
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1601",
                        number = 1601,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1601",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1601
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1602",
                        number = 1602,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1602",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1602
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1603",
                        number = 1603,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1603",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1603
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1604",
                        number = 1604,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1604",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1604
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1605",
                        number = 1605,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1605",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1605
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1606",
                        number = 1606,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1606",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1606
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1607",
                        number = 1607,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1607",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1607
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1608",
                        number = 1608,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1608",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1608
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1609",
                        number = 1609,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1609",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1609
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1610",
                        number = 1610,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1610",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1610
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1611",
                        number = 1611,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1611",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1611
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1612",
                        number = 1612,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1612",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1612
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1613",
                        number = 1613,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1613",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1613
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1614",
                        number = 1614,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1614",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1614
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1615",
                        number = 1615,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1615",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1615
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1616",
                        number = 1616,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1616",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1616
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1617",
                        number = 1617,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1617",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1617
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1618",
                        number = 1618,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1618",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1618
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1619",
                        number = 1619,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1619",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1619
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1620",
                        number = 1620,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1620",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1620
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1621",
                        number = 1621,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1621",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1621
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1622",
                        number = 1622,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1622",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1622
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1623",
                        number = 1623,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1623",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1623
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1624",
                        number = 1624,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1624",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1624
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1625",
                        number = 1625,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1625",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1625
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1626",
                        number = 1626,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1626",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1626
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1627",
                        number = 1627,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1627",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1627
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1628",
                        number = 1628,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1628",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1628
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1629",
                        number = 1629,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1629",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1629
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1630",
                        number = 1630,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1630",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1630
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1631",
                        number = 1631,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1631",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1631
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1632",
                        number = 1632,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1632",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1632
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1633",
                        number = 1633,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1633",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1633
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1634",
                        number = 1634,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1634",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1634
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1635",
                        number = 1635,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1635",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1635
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1636",
                        number = 1636,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1636",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1636
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1637",
                        number = 1637,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1637",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1637
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1638",
                        number = 1638,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1638",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1638
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1639",
                        number = 1639,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1639",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1639
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1640",
                        number = 1640,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1640",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1640
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1641",
                        number = 1641,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1641",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1641
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1642",
                        number = 1642,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1642",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1642
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1643",
                        number = 1643,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1643",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1643
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1644",
                        number = 1644,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1644",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1644
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1645",
                        number = 1645,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1645",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1645
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1646",
                        number = 1646,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1646",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1646
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1647",
                        number = 1647,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1647",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1647
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1648",
                        number = 1648,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1648",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1648
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1649",
                        number = 1649,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1649",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1649
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1650",
                        number = 1650,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1650",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1650
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1651",
                        number = 1651,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1651",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1651
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1652",
                        number = 1652,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1652",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1652
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1653",
                        number = 1653,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1653",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1653
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1654",
                        number = 1654,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1654",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1654
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1655",
                        number = 1655,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1655",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1655
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1656",
                        number = 1656,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1656",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1656
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1657",
                        number = 1657,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1657",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1657
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1658",
                        number = 1658,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1658",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1658
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1659",
                        number = 1659,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1659",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1659
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1660",
                        number = 1660,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1660",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1660
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1661",
                        number = 1661,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1661",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1661
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1662",
                        number = 1662,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1662",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1662
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1663",
                        number = 1663,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1663",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1663
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1664",
                        number = 1664,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1664",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1664
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1665",
                        number = 1665,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1665",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1665
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1666",
                        number = 1666,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1666",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1666
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1667",
                        number = 1667,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1667",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1667
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1668",
                        number = 1668,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1668",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1668
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1669",
                        number = 1669,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1669",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1669
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1670",
                        number = 1670,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1670",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1670
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1671",
                        number = 1671,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1671",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1671
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1672",
                        number = 1672,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1672",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1672
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1673",
                        number = 1673,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1673",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1673
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1674",
                        number = 1674,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1674",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1674
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1675",
                        number = 1675,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1675",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1675
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1676",
                        number = 1676,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1676",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1676
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1677",
                        number = 1677,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1677",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1677
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1678",
                        number = 1678,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1678",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1678
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1679",
                        number = 1679,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1679",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1679
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1680",
                        number = 1680,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1680",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1680
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1681",
                        number = 1681,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1681",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1681
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1682",
                        number = 1682,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1682",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1682
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1683",
                        number = 1683,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1683",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1683
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1684",
                        number = 1684,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1684",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1684
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1685",
                        number = 1685,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1685",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1685
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1686",
                        number = 1686,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1686",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1686
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1687",
                        number = 1687,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1687",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1687
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1688",
                        number = 1688,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1688",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1688
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1689",
                        number = 1689,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1689",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1689
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1690",
                        number = 1690,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1690",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1690
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1691",
                        number = 1691,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1691",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1691
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1692",
                        number = 1692,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1692",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1692
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1693",
                        number = 1693,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1693",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1693
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1694",
                        number = 1694,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1694",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1694
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1695",
                        number = 1695,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1695",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1695
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1696",
                        number = 1696,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1696",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1696
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1697",
                        number = 1697,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1697",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1697
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1698",
                        number = 1698,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1698",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1698
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1699",
                        number = 1699,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1699",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1699
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1700",
                        number = 1700,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1700",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1700
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1701",
                        number = 1701,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1701",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1701
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1702",
                        number = 1702,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1702",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1702
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1703",
                        number = 1703,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1703",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1703
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1704",
                        number = 1704,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1704",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1704
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1705",
                        number = 1705,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1705",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1705
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1706",
                        number = 1706,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1706",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1706
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1707",
                        number = 1707,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1707",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1707
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1708",
                        number = 1708,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1708",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1708
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1709",
                        number = 1709,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1709",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1709
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1710",
                        number = 1710,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1710",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1710
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1711",
                        number = 1711,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1711",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1711
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1712",
                        number = 1712,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1712",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1712
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1713",
                        number = 1713,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1713",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1713
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1714",
                        number = 1714,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1714",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1714
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1715",
                        number = 1715,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1715",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1715
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1716",
                        number = 1716,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1716",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1716
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1717",
                        number = 1717,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1717",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1717
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1718",
                        number = 1718,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1718",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1718
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1719",
                        number = 1719,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1719",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1719
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1720",
                        number = 1720,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1720",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1720
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1721",
                        number = 1721,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1721",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1721
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1722",
                        number = 1722,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1722",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1722
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1723",
                        number = 1723,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1723",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1723
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1724",
                        number = 1724,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1724",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1724
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1725",
                        number = 1725,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1725",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1725
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1726",
                        number = 1726,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1726",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1726
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1727",
                        number = 1727,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1727",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1727
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1728",
                        number = 1728,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1728",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1728
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1729",
                        number = 1729,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1729",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1729
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1730",
                        number = 1730,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1730",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1730
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1731",
                        number = 1731,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1731",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1731
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1732",
                        number = 1732,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1732",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1732
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1733",
                        number = 1733,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1733",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1733
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1734",
                        number = 1734,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1734",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1734
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1735",
                        number = 1735,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1735",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1735
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1736",
                        number = 1736,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1736",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1736
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1737",
                        number = 1737,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1737",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1737
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1738",
                        number = 1738,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1738",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1738
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1739",
                        number = 1739,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1739",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1739
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1740",
                        number = 1740,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1740",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1740
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1741",
                        number = 1741,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1741",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1741
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1742",
                        number = 1742,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1742",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1742
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1743",
                        number = 1743,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1743",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1743
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1744",
                        number = 1744,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1744",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1744
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1745",
                        number = 1745,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1745",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1745
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1746",
                        number = 1746,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1746",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1746
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1747",
                        number = 1747,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1747",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1747
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1748",
                        number = 1748,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1748",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1748
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1749",
                        number = 1749,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1749",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1749
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1750",
                        number = 1750,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1750",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1750
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1751",
                        number = 1751,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1751",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1751
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1752",
                        number = 1752,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1752",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1752
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1753",
                        number = 1753,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1753",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1753
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1754",
                        number = 1754,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1754",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1754
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1755",
                        number = 1755,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1755",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1755
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1756",
                        number = 1756,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1756",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1756
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1757",
                        number = 1757,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1757",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1757
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1758",
                        number = 1758,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1758",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1758
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1759",
                        number = 1759,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1759",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1759
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1760",
                        number = 1760,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1760",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1760
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1761",
                        number = 1761,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1761",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1761
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1762",
                        number = 1762,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1762",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1762
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1763",
                        number = 1763,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1763",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1763
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1764",
                        number = 1764,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1764",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1764
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1765",
                        number = 1765,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1765",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1765
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1766",
                        number = 1766,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1766",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1766
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1767",
                        number = 1767,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1767",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1767
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1768",
                        number = 1768,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1768",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1768
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1769",
                        number = 1769,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1769",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1769
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1770",
                        number = 1770,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1770",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1770
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1771",
                        number = 1771,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1771",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1771
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1772",
                        number = 1772,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1772",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1772
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1773",
                        number = 1773,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1773",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1773
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1774",
                        number = 1774,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1774",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1774
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1775",
                        number = 1775,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1775",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1775
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1776",
                        number = 1776,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1776",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1776
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1777",
                        number = 1777,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1777",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1777
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1778",
                        number = 1778,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1778",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1778
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1779",
                        number = 1779,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1779",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1779
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1780",
                        number = 1780,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1780",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1780
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1781",
                        number = 1781,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1781",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1781
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1782",
                        number = 1782,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1782",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1782
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1783",
                        number = 1783,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1783",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1783
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1784",
                        number = 1784,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1784",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1784
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1785",
                        number = 1785,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1785",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1785
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1786",
                        number = 1786,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1786",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1786
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1787",
                        number = 1787,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1787",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1787
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1788",
                        number = 1788,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1788",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1788
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1789",
                        number = 1789,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1789",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1789
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1790",
                        number = 1790,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1790",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1790
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1791",
                        number = 1791,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1791",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1791
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1792",
                        number = 1792,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1792",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1792
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1793",
                        number = 1793,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1793",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1793
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1794",
                        number = 1794,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1794",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1794
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1795",
                        number = 1795,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1795",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1795
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1796",
                        number = 1796,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1796",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1796
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1797",
                        number = 1797,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1797",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1797
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1798",
                        number = 1798,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1798",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1798
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1799",
                        number = 1799,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1799",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1799
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1800",
                        number = 1800,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1800",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1800
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1801",
                        number = 1801,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1801",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1801
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1802",
                        number = 1802,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1802",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1802
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1803",
                        number = 1803,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1803",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1803
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1804",
                        number = 1804,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1804",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1804
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1805",
                        number = 1805,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1805",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1805
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1806",
                        number = 1806,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1806",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1806
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1807",
                        number = 1807,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1807",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1807
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1808",
                        number = 1808,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1808",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1808
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1809",
                        number = 1809,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1809",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1809
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1810",
                        number = 1810,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1810",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1810
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1811",
                        number = 1811,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1811",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1811
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1812",
                        number = 1812,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1812",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1812
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1813",
                        number = 1813,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1813",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1813
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1814",
                        number = 1814,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1814",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1814
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1815",
                        number = 1815,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1815",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1815
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1816",
                        number = 1816,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1816",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1816
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1817",
                        number = 1817,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1817",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1817
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1818",
                        number = 1818,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1818",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1818
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1819",
                        number = 1819,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1819",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1819
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1820",
                        number = 1820,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1820",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1820
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1821",
                        number = 1821,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1821",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1821
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1822",
                        number = 1822,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1822",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1822
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1823",
                        number = 1823,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1823",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1823
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1824",
                        number = 1824,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1824",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1824
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1825",
                        number = 1825,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1825",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1825
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1826",
                        number = 1826,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1826",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1826
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1827",
                        number = 1827,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1827",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1827
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1828",
                        number = 1828,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1828",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1828
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1829",
                        number = 1829,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1829",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1829
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1830",
                        number = 1830,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1830",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1830
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1831",
                        number = 1831,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1831",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1831
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1832",
                        number = 1832,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1832",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1832
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1833",
                        number = 1833,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1833",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1833
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1834",
                        number = 1834,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1834",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1834
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1835",
                        number = 1835,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1835",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1835
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1836",
                        number = 1836,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1836",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1836
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1837",
                        number = 1837,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1837",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1837
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1838",
                        number = 1838,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1838",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1838
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1839",
                        number = 1839,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1839",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1839
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1840",
                        number = 1840,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1840",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1840
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1841",
                        number = 1841,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1841",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1841
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1842",
                        number = 1842,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1842",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1842
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1843",
                        number = 1843,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1843",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1843
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1844",
                        number = 1844,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1844",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1844
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1845",
                        number = 1845,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1845",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1845
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1846",
                        number = 1846,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1846",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1846
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1847",
                        number = 1847,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1847",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1847
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1848",
                        number = 1848,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1848",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1848
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1849",
                        number = 1849,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1849",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1849
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1850",
                        number = 1850,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1850",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1850
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1851",
                        number = 1851,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1851",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1851
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1852",
                        number = 1852,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1852",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1852
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1853",
                        number = 1853,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1853",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1853
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1854",
                        number = 1854,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1854",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1854
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1855",
                        number = 1855,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1855",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1855
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1856",
                        number = 1856,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1856",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1856
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1857",
                        number = 1857,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1857",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1857
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1858",
                        number = 1858,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1858",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1858
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1859",
                        number = 1859,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1859",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1859
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1860",
                        number = 1860,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1860",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1860
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1861",
                        number = 1861,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1861",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1861
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1862",
                        number = 1862,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1862",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1862
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1863",
                        number = 1863,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1863",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1863
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1864",
                        number = 1864,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1864",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1864
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1865",
                        number = 1865,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1865",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1865
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1866",
                        number = 1866,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1866",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1866
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1867",
                        number = 1867,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1867",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1867
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1868",
                        number = 1868,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1868",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1868
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1869",
                        number = 1869,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1869",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1869
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1870",
                        number = 1870,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1870",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1870
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1871",
                        number = 1871,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1871",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1871
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1872",
                        number = 1872,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1872",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1872
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1873",
                        number = 1873,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1873",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1873
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1874",
                        number = 1874,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1874",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1874
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1875",
                        number = 1875,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1875",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1875
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1876",
                        number = 1876,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1876",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1876
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1877",
                        number = 1877,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1877",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1877
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1878",
                        number = 1878,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1878",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1878
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1879",
                        number = 1879,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1879",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1879
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1880",
                        number = 1880,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1880",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1880
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1881",
                        number = 1881,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1881",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1881
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1882",
                        number = 1882,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1882",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1882
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1883",
                        number = 1883,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1883",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1883
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1884",
                        number = 1884,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1884",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1884
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1885",
                        number = 1885,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1885",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1885
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1886",
                        number = 1886,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1886",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1886
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1887",
                        number = 1887,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1887",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1887
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1888",
                        number = 1888,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1888",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1888
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1889",
                        number = 1889,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1889",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1889
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1890",
                        number = 1890,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1890",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1890
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1891",
                        number = 1891,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1891",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1891
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1892",
                        number = 1892,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1892",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1892
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1893",
                        number = 1893,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1893",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1893
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1894",
                        number = 1894,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1894",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1894
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1895",
                        number = 1895,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1895",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1895
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1896",
                        number = 1896,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1896",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1896
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1897",
                        number = 1897,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1897",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1897
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1898",
                        number = 1898,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1898",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1898
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1899",
                        number = 1899,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1899",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1899
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1900",
                        number = 1900,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1900",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1900
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1901",
                        number = 1901,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1901",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1901
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1902",
                        number = 1902,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1902",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1902
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1903",
                        number = 1903,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1903",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1903
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1904",
                        number = 1904,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1904",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1904
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1905",
                        number = 1905,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1905",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1905
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1906",
                        number = 1906,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1906",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1906
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1907",
                        number = 1907,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1907",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1907
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1908",
                        number = 1908,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1908",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1908
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1909",
                        number = 1909,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1909",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1909
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1910",
                        number = 1910,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1910",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1910
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1911",
                        number = 1911,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1911",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1911
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1912",
                        number = 1912,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1912",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1912
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1913",
                        number = 1913,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1913",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1913
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1914",
                        number = 1914,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1914",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1914
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1915",
                        number = 1915,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1915",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1915
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1916",
                        number = 1916,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1916",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1916
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1917",
                        number = 1917,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1917",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1917
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1918",
                        number = 1918,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1918",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1918
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1919",
                        number = 1919,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1919",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1919
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1920",
                        number = 1920,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1920",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1920
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1921",
                        number = 1921,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1921",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1921
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1922",
                        number = 1922,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1922",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1922
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1923",
                        number = 1923,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1923",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1923
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1924",
                        number = 1924,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1924",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1924
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1925",
                        number = 1925,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1925",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1925
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1926",
                        number = 1926,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1926",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1926
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1927",
                        number = 1927,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1927",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1927
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1928",
                        number = 1928,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1928",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1928
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1929",
                        number = 1929,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1929",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1929
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1930",
                        number = 1930,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1930",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1930
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1931",
                        number = 1931,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1931",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1931
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1932",
                        number = 1932,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1932",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1932
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1933",
                        number = 1933,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1933",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1933
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1934",
                        number = 1934,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1934",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1934
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1935",
                        number = 1935,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1935",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1935
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1936",
                        number = 1936,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1936",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1936
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1937",
                        number = 1937,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1937",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1937
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1938",
                        number = 1938,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1938",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1938
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1939",
                        number = 1939,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1939",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1939
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1940",
                        number = 1940,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1940",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1940
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1941",
                        number = 1941,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1941",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1941
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1942",
                        number = 1942,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1942",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1942
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1943",
                        number = 1943,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1943",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1943
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1944",
                        number = 1944,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1944",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1944
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1945",
                        number = 1945,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1945",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1945
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1946",
                        number = 1946,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1946",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1946
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1947",
                        number = 1947,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1947",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1947
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1948",
                        number = 1948,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1948",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1948
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1949",
                        number = 1949,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1949",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1949
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1950",
                        number = 1950,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1950",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1950
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1951",
                        number = 1951,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1951",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1951
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1952",
                        number = 1952,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1952",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1952
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1953",
                        number = 1953,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1953",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1953
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1954",
                        number = 1954,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1954",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1954
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1955",
                        number = 1955,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1955",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1955
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1956",
                        number = 1956,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1956",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1956
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1957",
                        number = 1957,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1957",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1957
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1958",
                        number = 1958,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1958",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1958
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1959",
                        number = 1959,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1959",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1959
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1960",
                        number = 1960,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1960",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1960
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1961",
                        number = 1961,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1961",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1961
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1962",
                        number = 1962,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1962",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1962
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1963",
                        number = 1963,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1963",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1963
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1964",
                        number = 1964,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1964",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1964
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1965",
                        number = 1965,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1965",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1965
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1966",
                        number = 1966,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1966",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1966
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1967",
                        number = 1967,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1967",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1967
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1968",
                        number = 1968,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1968",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1968
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1969",
                        number = 1969,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1969",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1969
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1970",
                        number = 1970,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1970",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1970
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1971",
                        number = 1971,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1971",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1971
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1972",
                        number = 1972,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1972",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1972
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1973",
                        number = 1973,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1973",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1973
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1974",
                        number = 1974,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1974",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1974
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1975",
                        number = 1975,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1975",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1975
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1976",
                        number = 1976,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1976",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1976
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1977",
                        number = 1977,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1977",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1977
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1978",
                        number = 1978,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1978",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1978
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1979",
                        number = 1979,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1979",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1979
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1980",
                        number = 1980,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1980",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1980
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1981",
                        number = 1981,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1981",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1981
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1982",
                        number = 1982,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1982",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1982
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1983",
                        number = 1983,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1983",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1983
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1984",
                        number = 1984,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1984",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1984
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1985",
                        number = 1985,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1985",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1985
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1986",
                        number = 1986,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1986",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1986
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1987",
                        number = 1987,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1987",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1987
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1988",
                        number = 1988,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1988",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1988
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1989",
                        number = 1989,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1989",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1989
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1990",
                        number = 1990,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1990",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1990
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1991",
                        number = 1991,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1991",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1991
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1992",
                        number = 1992,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1992",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1992
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1993",
                        number = 1993,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1993",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1993
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1994",
                        number = 1994,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1994",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1994
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1995",
                        number = 1995,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1995",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1995
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1996",
                        number = 1996,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1996",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1996
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1997",
                        number = 1997,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1997",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1997
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1998",
                        number = 1998,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1998",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1998
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_1999",
                        number = 1999,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneof1999",
                        value = pbandk.testpb.MessageWithHugeOneof::oneof1999
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.MessageWithHugeOneof::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun MessageWithHugeOneof?.orDefault() = this ?: MessageWithHugeOneof.defaultInstance

private fun MessageWithHugeOneof.protoMergeImpl(plus: pbandk.Message?): MessageWithHugeOneof = (plus as? MessageWithHugeOneof)?.copy(
    hugeOneof = plus.hugeOneof ?: hugeOneof,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageWithHugeOneof.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithHugeOneof {
    var hugeOneof: MessageWithHugeOneof.HugeOneof<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1000 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1000(_fieldValue as Int)
            1001 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1001(_fieldValue as Int)
            1002 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1002(_fieldValue as Int)
            1003 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1003(_fieldValue as Int)
            1004 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1004(_fieldValue as Int)
            1005 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1005(_fieldValue as Int)
            1006 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1006(_fieldValue as Int)
            1007 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1007(_fieldValue as Int)
            1008 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1008(_fieldValue as Int)
            1009 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1009(_fieldValue as Int)
            1010 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1010(_fieldValue as Int)
            1011 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1011(_fieldValue as Int)
            1012 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1012(_fieldValue as Int)
            1013 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1013(_fieldValue as Int)
            1014 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1014(_fieldValue as Int)
            1015 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1015(_fieldValue as Int)
            1016 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1016(_fieldValue as Int)
            1017 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1017(_fieldValue as Int)
            1018 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1018(_fieldValue as Int)
            1019 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1019(_fieldValue as Int)
            1020 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1020(_fieldValue as Int)
            1021 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1021(_fieldValue as Int)
            1022 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1022(_fieldValue as Int)
            1023 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1023(_fieldValue as Int)
            1024 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1024(_fieldValue as Int)
            1025 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1025(_fieldValue as Int)
            1026 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1026(_fieldValue as Int)
            1027 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1027(_fieldValue as Int)
            1028 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1028(_fieldValue as Int)
            1029 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1029(_fieldValue as Int)
            1030 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1030(_fieldValue as Int)
            1031 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1031(_fieldValue as Int)
            1032 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1032(_fieldValue as Int)
            1033 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1033(_fieldValue as Int)
            1034 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1034(_fieldValue as Int)
            1035 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1035(_fieldValue as Int)
            1036 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1036(_fieldValue as Int)
            1037 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1037(_fieldValue as Int)
            1038 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1038(_fieldValue as Int)
            1039 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1039(_fieldValue as Int)
            1040 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1040(_fieldValue as Int)
            1041 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1041(_fieldValue as Int)
            1042 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1042(_fieldValue as Int)
            1043 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1043(_fieldValue as Int)
            1044 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1044(_fieldValue as Int)
            1045 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1045(_fieldValue as Int)
            1046 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1046(_fieldValue as Int)
            1047 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1047(_fieldValue as Int)
            1048 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1048(_fieldValue as Int)
            1049 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1049(_fieldValue as Int)
            1050 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1050(_fieldValue as Int)
            1051 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1051(_fieldValue as Int)
            1052 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1052(_fieldValue as Int)
            1053 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1053(_fieldValue as Int)
            1054 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1054(_fieldValue as Int)
            1055 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1055(_fieldValue as Int)
            1056 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1056(_fieldValue as Int)
            1057 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1057(_fieldValue as Int)
            1058 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1058(_fieldValue as Int)
            1059 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1059(_fieldValue as Int)
            1060 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1060(_fieldValue as Int)
            1061 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1061(_fieldValue as Int)
            1062 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1062(_fieldValue as Int)
            1063 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1063(_fieldValue as Int)
            1064 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1064(_fieldValue as Int)
            1065 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1065(_fieldValue as Int)
            1066 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1066(_fieldValue as Int)
            1067 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1067(_fieldValue as Int)
            1068 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1068(_fieldValue as Int)
            1069 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1069(_fieldValue as Int)
            1070 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1070(_fieldValue as Int)
            1071 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1071(_fieldValue as Int)
            1072 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1072(_fieldValue as Int)
            1073 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1073(_fieldValue as Int)
            1074 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1074(_fieldValue as Int)
            1075 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1075(_fieldValue as Int)
            1076 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1076(_fieldValue as Int)
            1077 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1077(_fieldValue as Int)
            1078 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1078(_fieldValue as Int)
            1079 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1079(_fieldValue as Int)
            1080 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1080(_fieldValue as Int)
            1081 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1081(_fieldValue as Int)
            1082 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1082(_fieldValue as Int)
            1083 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1083(_fieldValue as Int)
            1084 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1084(_fieldValue as Int)
            1085 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1085(_fieldValue as Int)
            1086 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1086(_fieldValue as Int)
            1087 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1087(_fieldValue as Int)
            1088 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1088(_fieldValue as Int)
            1089 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1089(_fieldValue as Int)
            1090 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1090(_fieldValue as Int)
            1091 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1091(_fieldValue as Int)
            1092 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1092(_fieldValue as Int)
            1093 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1093(_fieldValue as Int)
            1094 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1094(_fieldValue as Int)
            1095 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1095(_fieldValue as Int)
            1096 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1096(_fieldValue as Int)
            1097 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1097(_fieldValue as Int)
            1098 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1098(_fieldValue as Int)
            1099 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1099(_fieldValue as Int)
            1100 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1100(_fieldValue as Int)
            1101 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1101(_fieldValue as Int)
            1102 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1102(_fieldValue as Int)
            1103 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1103(_fieldValue as Int)
            1104 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1104(_fieldValue as Int)
            1105 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1105(_fieldValue as Int)
            1106 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1106(_fieldValue as Int)
            1107 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1107(_fieldValue as Int)
            1108 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1108(_fieldValue as Int)
            1109 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1109(_fieldValue as Int)
            1110 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1110(_fieldValue as Int)
            1111 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1111(_fieldValue as Int)
            1112 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1112(_fieldValue as Int)
            1113 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1113(_fieldValue as Int)
            1114 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1114(_fieldValue as Int)
            1115 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1115(_fieldValue as Int)
            1116 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1116(_fieldValue as Int)
            1117 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1117(_fieldValue as Int)
            1118 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1118(_fieldValue as Int)
            1119 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1119(_fieldValue as Int)
            1120 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1120(_fieldValue as Int)
            1121 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1121(_fieldValue as Int)
            1122 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1122(_fieldValue as Int)
            1123 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1123(_fieldValue as Int)
            1124 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1124(_fieldValue as Int)
            1125 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1125(_fieldValue as Int)
            1126 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1126(_fieldValue as Int)
            1127 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1127(_fieldValue as Int)
            1128 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1128(_fieldValue as Int)
            1129 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1129(_fieldValue as Int)
            1130 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1130(_fieldValue as Int)
            1131 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1131(_fieldValue as Int)
            1132 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1132(_fieldValue as Int)
            1133 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1133(_fieldValue as Int)
            1134 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1134(_fieldValue as Int)
            1135 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1135(_fieldValue as Int)
            1136 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1136(_fieldValue as Int)
            1137 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1137(_fieldValue as Int)
            1138 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1138(_fieldValue as Int)
            1139 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1139(_fieldValue as Int)
            1140 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1140(_fieldValue as Int)
            1141 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1141(_fieldValue as Int)
            1142 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1142(_fieldValue as Int)
            1143 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1143(_fieldValue as Int)
            1144 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1144(_fieldValue as Int)
            1145 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1145(_fieldValue as Int)
            1146 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1146(_fieldValue as Int)
            1147 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1147(_fieldValue as Int)
            1148 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1148(_fieldValue as Int)
            1149 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1149(_fieldValue as Int)
            1150 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1150(_fieldValue as Int)
            1151 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1151(_fieldValue as Int)
            1152 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1152(_fieldValue as Int)
            1153 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1153(_fieldValue as Int)
            1154 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1154(_fieldValue as Int)
            1155 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1155(_fieldValue as Int)
            1156 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1156(_fieldValue as Int)
            1157 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1157(_fieldValue as Int)
            1158 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1158(_fieldValue as Int)
            1159 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1159(_fieldValue as Int)
            1160 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1160(_fieldValue as Int)
            1161 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1161(_fieldValue as Int)
            1162 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1162(_fieldValue as Int)
            1163 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1163(_fieldValue as Int)
            1164 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1164(_fieldValue as Int)
            1165 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1165(_fieldValue as Int)
            1166 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1166(_fieldValue as Int)
            1167 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1167(_fieldValue as Int)
            1168 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1168(_fieldValue as Int)
            1169 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1169(_fieldValue as Int)
            1170 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1170(_fieldValue as Int)
            1171 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1171(_fieldValue as Int)
            1172 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1172(_fieldValue as Int)
            1173 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1173(_fieldValue as Int)
            1174 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1174(_fieldValue as Int)
            1175 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1175(_fieldValue as Int)
            1176 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1176(_fieldValue as Int)
            1177 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1177(_fieldValue as Int)
            1178 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1178(_fieldValue as Int)
            1179 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1179(_fieldValue as Int)
            1180 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1180(_fieldValue as Int)
            1181 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1181(_fieldValue as Int)
            1182 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1182(_fieldValue as Int)
            1183 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1183(_fieldValue as Int)
            1184 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1184(_fieldValue as Int)
            1185 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1185(_fieldValue as Int)
            1186 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1186(_fieldValue as Int)
            1187 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1187(_fieldValue as Int)
            1188 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1188(_fieldValue as Int)
            1189 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1189(_fieldValue as Int)
            1190 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1190(_fieldValue as Int)
            1191 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1191(_fieldValue as Int)
            1192 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1192(_fieldValue as Int)
            1193 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1193(_fieldValue as Int)
            1194 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1194(_fieldValue as Int)
            1195 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1195(_fieldValue as Int)
            1196 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1196(_fieldValue as Int)
            1197 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1197(_fieldValue as Int)
            1198 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1198(_fieldValue as Int)
            1199 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1199(_fieldValue as Int)
            1200 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1200(_fieldValue as Int)
            1201 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1201(_fieldValue as Int)
            1202 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1202(_fieldValue as Int)
            1203 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1203(_fieldValue as Int)
            1204 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1204(_fieldValue as Int)
            1205 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1205(_fieldValue as Int)
            1206 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1206(_fieldValue as Int)
            1207 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1207(_fieldValue as Int)
            1208 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1208(_fieldValue as Int)
            1209 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1209(_fieldValue as Int)
            1210 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1210(_fieldValue as Int)
            1211 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1211(_fieldValue as Int)
            1212 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1212(_fieldValue as Int)
            1213 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1213(_fieldValue as Int)
            1214 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1214(_fieldValue as Int)
            1215 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1215(_fieldValue as Int)
            1216 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1216(_fieldValue as Int)
            1217 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1217(_fieldValue as Int)
            1218 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1218(_fieldValue as Int)
            1219 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1219(_fieldValue as Int)
            1220 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1220(_fieldValue as Int)
            1221 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1221(_fieldValue as Int)
            1222 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1222(_fieldValue as Int)
            1223 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1223(_fieldValue as Int)
            1224 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1224(_fieldValue as Int)
            1225 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1225(_fieldValue as Int)
            1226 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1226(_fieldValue as Int)
            1227 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1227(_fieldValue as Int)
            1228 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1228(_fieldValue as Int)
            1229 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1229(_fieldValue as Int)
            1230 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1230(_fieldValue as Int)
            1231 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1231(_fieldValue as Int)
            1232 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1232(_fieldValue as Int)
            1233 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1233(_fieldValue as Int)
            1234 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1234(_fieldValue as Int)
            1235 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1235(_fieldValue as Int)
            1236 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1236(_fieldValue as Int)
            1237 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1237(_fieldValue as Int)
            1238 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1238(_fieldValue as Int)
            1239 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1239(_fieldValue as Int)
            1240 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1240(_fieldValue as Int)
            1241 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1241(_fieldValue as Int)
            1242 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1242(_fieldValue as Int)
            1243 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1243(_fieldValue as Int)
            1244 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1244(_fieldValue as Int)
            1245 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1245(_fieldValue as Int)
            1246 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1246(_fieldValue as Int)
            1247 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1247(_fieldValue as Int)
            1248 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1248(_fieldValue as Int)
            1249 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1249(_fieldValue as Int)
            1250 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1250(_fieldValue as Int)
            1251 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1251(_fieldValue as Int)
            1252 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1252(_fieldValue as Int)
            1253 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1253(_fieldValue as Int)
            1254 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1254(_fieldValue as Int)
            1255 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1255(_fieldValue as Int)
            1256 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1256(_fieldValue as Int)
            1257 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1257(_fieldValue as Int)
            1258 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1258(_fieldValue as Int)
            1259 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1259(_fieldValue as Int)
            1260 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1260(_fieldValue as Int)
            1261 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1261(_fieldValue as Int)
            1262 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1262(_fieldValue as Int)
            1263 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1263(_fieldValue as Int)
            1264 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1264(_fieldValue as Int)
            1265 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1265(_fieldValue as Int)
            1266 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1266(_fieldValue as Int)
            1267 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1267(_fieldValue as Int)
            1268 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1268(_fieldValue as Int)
            1269 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1269(_fieldValue as Int)
            1270 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1270(_fieldValue as Int)
            1271 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1271(_fieldValue as Int)
            1272 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1272(_fieldValue as Int)
            1273 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1273(_fieldValue as Int)
            1274 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1274(_fieldValue as Int)
            1275 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1275(_fieldValue as Int)
            1276 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1276(_fieldValue as Int)
            1277 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1277(_fieldValue as Int)
            1278 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1278(_fieldValue as Int)
            1279 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1279(_fieldValue as Int)
            1280 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1280(_fieldValue as Int)
            1281 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1281(_fieldValue as Int)
            1282 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1282(_fieldValue as Int)
            1283 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1283(_fieldValue as Int)
            1284 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1284(_fieldValue as Int)
            1285 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1285(_fieldValue as Int)
            1286 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1286(_fieldValue as Int)
            1287 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1287(_fieldValue as Int)
            1288 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1288(_fieldValue as Int)
            1289 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1289(_fieldValue as Int)
            1290 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1290(_fieldValue as Int)
            1291 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1291(_fieldValue as Int)
            1292 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1292(_fieldValue as Int)
            1293 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1293(_fieldValue as Int)
            1294 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1294(_fieldValue as Int)
            1295 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1295(_fieldValue as Int)
            1296 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1296(_fieldValue as Int)
            1297 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1297(_fieldValue as Int)
            1298 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1298(_fieldValue as Int)
            1299 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1299(_fieldValue as Int)
            1300 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1300(_fieldValue as Int)
            1301 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1301(_fieldValue as Int)
            1302 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1302(_fieldValue as Int)
            1303 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1303(_fieldValue as Int)
            1304 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1304(_fieldValue as Int)
            1305 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1305(_fieldValue as Int)
            1306 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1306(_fieldValue as Int)
            1307 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1307(_fieldValue as Int)
            1308 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1308(_fieldValue as Int)
            1309 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1309(_fieldValue as Int)
            1310 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1310(_fieldValue as Int)
            1311 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1311(_fieldValue as Int)
            1312 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1312(_fieldValue as Int)
            1313 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1313(_fieldValue as Int)
            1314 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1314(_fieldValue as Int)
            1315 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1315(_fieldValue as Int)
            1316 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1316(_fieldValue as Int)
            1317 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1317(_fieldValue as Int)
            1318 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1318(_fieldValue as Int)
            1319 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1319(_fieldValue as Int)
            1320 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1320(_fieldValue as Int)
            1321 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1321(_fieldValue as Int)
            1322 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1322(_fieldValue as Int)
            1323 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1323(_fieldValue as Int)
            1324 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1324(_fieldValue as Int)
            1325 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1325(_fieldValue as Int)
            1326 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1326(_fieldValue as Int)
            1327 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1327(_fieldValue as Int)
            1328 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1328(_fieldValue as Int)
            1329 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1329(_fieldValue as Int)
            1330 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1330(_fieldValue as Int)
            1331 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1331(_fieldValue as Int)
            1332 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1332(_fieldValue as Int)
            1333 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1333(_fieldValue as Int)
            1334 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1334(_fieldValue as Int)
            1335 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1335(_fieldValue as Int)
            1336 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1336(_fieldValue as Int)
            1337 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1337(_fieldValue as Int)
            1338 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1338(_fieldValue as Int)
            1339 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1339(_fieldValue as Int)
            1340 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1340(_fieldValue as Int)
            1341 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1341(_fieldValue as Int)
            1342 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1342(_fieldValue as Int)
            1343 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1343(_fieldValue as Int)
            1344 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1344(_fieldValue as Int)
            1345 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1345(_fieldValue as Int)
            1346 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1346(_fieldValue as Int)
            1347 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1347(_fieldValue as Int)
            1348 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1348(_fieldValue as Int)
            1349 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1349(_fieldValue as Int)
            1350 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1350(_fieldValue as Int)
            1351 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1351(_fieldValue as Int)
            1352 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1352(_fieldValue as Int)
            1353 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1353(_fieldValue as Int)
            1354 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1354(_fieldValue as Int)
            1355 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1355(_fieldValue as Int)
            1356 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1356(_fieldValue as Int)
            1357 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1357(_fieldValue as Int)
            1358 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1358(_fieldValue as Int)
            1359 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1359(_fieldValue as Int)
            1360 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1360(_fieldValue as Int)
            1361 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1361(_fieldValue as Int)
            1362 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1362(_fieldValue as Int)
            1363 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1363(_fieldValue as Int)
            1364 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1364(_fieldValue as Int)
            1365 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1365(_fieldValue as Int)
            1366 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1366(_fieldValue as Int)
            1367 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1367(_fieldValue as Int)
            1368 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1368(_fieldValue as Int)
            1369 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1369(_fieldValue as Int)
            1370 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1370(_fieldValue as Int)
            1371 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1371(_fieldValue as Int)
            1372 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1372(_fieldValue as Int)
            1373 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1373(_fieldValue as Int)
            1374 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1374(_fieldValue as Int)
            1375 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1375(_fieldValue as Int)
            1376 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1376(_fieldValue as Int)
            1377 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1377(_fieldValue as Int)
            1378 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1378(_fieldValue as Int)
            1379 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1379(_fieldValue as Int)
            1380 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1380(_fieldValue as Int)
            1381 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1381(_fieldValue as Int)
            1382 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1382(_fieldValue as Int)
            1383 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1383(_fieldValue as Int)
            1384 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1384(_fieldValue as Int)
            1385 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1385(_fieldValue as Int)
            1386 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1386(_fieldValue as Int)
            1387 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1387(_fieldValue as Int)
            1388 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1388(_fieldValue as Int)
            1389 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1389(_fieldValue as Int)
            1390 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1390(_fieldValue as Int)
            1391 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1391(_fieldValue as Int)
            1392 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1392(_fieldValue as Int)
            1393 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1393(_fieldValue as Int)
            1394 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1394(_fieldValue as Int)
            1395 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1395(_fieldValue as Int)
            1396 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1396(_fieldValue as Int)
            1397 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1397(_fieldValue as Int)
            1398 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1398(_fieldValue as Int)
            1399 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1399(_fieldValue as Int)
            1400 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1400(_fieldValue as Int)
            1401 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1401(_fieldValue as Int)
            1402 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1402(_fieldValue as Int)
            1403 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1403(_fieldValue as Int)
            1404 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1404(_fieldValue as Int)
            1405 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1405(_fieldValue as Int)
            1406 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1406(_fieldValue as Int)
            1407 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1407(_fieldValue as Int)
            1408 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1408(_fieldValue as Int)
            1409 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1409(_fieldValue as Int)
            1410 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1410(_fieldValue as Int)
            1411 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1411(_fieldValue as Int)
            1412 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1412(_fieldValue as Int)
            1413 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1413(_fieldValue as Int)
            1414 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1414(_fieldValue as Int)
            1415 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1415(_fieldValue as Int)
            1416 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1416(_fieldValue as Int)
            1417 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1417(_fieldValue as Int)
            1418 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1418(_fieldValue as Int)
            1419 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1419(_fieldValue as Int)
            1420 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1420(_fieldValue as Int)
            1421 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1421(_fieldValue as Int)
            1422 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1422(_fieldValue as Int)
            1423 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1423(_fieldValue as Int)
            1424 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1424(_fieldValue as Int)
            1425 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1425(_fieldValue as Int)
            1426 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1426(_fieldValue as Int)
            1427 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1427(_fieldValue as Int)
            1428 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1428(_fieldValue as Int)
            1429 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1429(_fieldValue as Int)
            1430 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1430(_fieldValue as Int)
            1431 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1431(_fieldValue as Int)
            1432 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1432(_fieldValue as Int)
            1433 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1433(_fieldValue as Int)
            1434 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1434(_fieldValue as Int)
            1435 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1435(_fieldValue as Int)
            1436 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1436(_fieldValue as Int)
            1437 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1437(_fieldValue as Int)
            1438 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1438(_fieldValue as Int)
            1439 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1439(_fieldValue as Int)
            1440 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1440(_fieldValue as Int)
            1441 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1441(_fieldValue as Int)
            1442 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1442(_fieldValue as Int)
            1443 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1443(_fieldValue as Int)
            1444 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1444(_fieldValue as Int)
            1445 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1445(_fieldValue as Int)
            1446 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1446(_fieldValue as Int)
            1447 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1447(_fieldValue as Int)
            1448 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1448(_fieldValue as Int)
            1449 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1449(_fieldValue as Int)
            1450 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1450(_fieldValue as Int)
            1451 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1451(_fieldValue as Int)
            1452 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1452(_fieldValue as Int)
            1453 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1453(_fieldValue as Int)
            1454 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1454(_fieldValue as Int)
            1455 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1455(_fieldValue as Int)
            1456 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1456(_fieldValue as Int)
            1457 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1457(_fieldValue as Int)
            1458 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1458(_fieldValue as Int)
            1459 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1459(_fieldValue as Int)
            1460 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1460(_fieldValue as Int)
            1461 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1461(_fieldValue as Int)
            1462 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1462(_fieldValue as Int)
            1463 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1463(_fieldValue as Int)
            1464 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1464(_fieldValue as Int)
            1465 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1465(_fieldValue as Int)
            1466 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1466(_fieldValue as Int)
            1467 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1467(_fieldValue as Int)
            1468 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1468(_fieldValue as Int)
            1469 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1469(_fieldValue as Int)
            1470 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1470(_fieldValue as Int)
            1471 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1471(_fieldValue as Int)
            1472 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1472(_fieldValue as Int)
            1473 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1473(_fieldValue as Int)
            1474 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1474(_fieldValue as Int)
            1475 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1475(_fieldValue as Int)
            1476 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1476(_fieldValue as Int)
            1477 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1477(_fieldValue as Int)
            1478 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1478(_fieldValue as Int)
            1479 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1479(_fieldValue as Int)
            1480 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1480(_fieldValue as Int)
            1481 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1481(_fieldValue as Int)
            1482 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1482(_fieldValue as Int)
            1483 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1483(_fieldValue as Int)
            1484 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1484(_fieldValue as Int)
            1485 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1485(_fieldValue as Int)
            1486 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1486(_fieldValue as Int)
            1487 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1487(_fieldValue as Int)
            1488 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1488(_fieldValue as Int)
            1489 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1489(_fieldValue as Int)
            1490 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1490(_fieldValue as Int)
            1491 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1491(_fieldValue as Int)
            1492 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1492(_fieldValue as Int)
            1493 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1493(_fieldValue as Int)
            1494 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1494(_fieldValue as Int)
            1495 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1495(_fieldValue as Int)
            1496 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1496(_fieldValue as Int)
            1497 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1497(_fieldValue as Int)
            1498 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1498(_fieldValue as Int)
            1499 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1499(_fieldValue as Int)
            1500 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1500(_fieldValue as Int)
            1501 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1501(_fieldValue as Int)
            1502 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1502(_fieldValue as Int)
            1503 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1503(_fieldValue as Int)
            1504 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1504(_fieldValue as Int)
            1505 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1505(_fieldValue as Int)
            1506 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1506(_fieldValue as Int)
            1507 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1507(_fieldValue as Int)
            1508 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1508(_fieldValue as Int)
            1509 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1509(_fieldValue as Int)
            1510 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1510(_fieldValue as Int)
            1511 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1511(_fieldValue as Int)
            1512 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1512(_fieldValue as Int)
            1513 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1513(_fieldValue as Int)
            1514 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1514(_fieldValue as Int)
            1515 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1515(_fieldValue as Int)
            1516 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1516(_fieldValue as Int)
            1517 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1517(_fieldValue as Int)
            1518 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1518(_fieldValue as Int)
            1519 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1519(_fieldValue as Int)
            1520 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1520(_fieldValue as Int)
            1521 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1521(_fieldValue as Int)
            1522 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1522(_fieldValue as Int)
            1523 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1523(_fieldValue as Int)
            1524 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1524(_fieldValue as Int)
            1525 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1525(_fieldValue as Int)
            1526 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1526(_fieldValue as Int)
            1527 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1527(_fieldValue as Int)
            1528 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1528(_fieldValue as Int)
            1529 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1529(_fieldValue as Int)
            1530 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1530(_fieldValue as Int)
            1531 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1531(_fieldValue as Int)
            1532 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1532(_fieldValue as Int)
            1533 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1533(_fieldValue as Int)
            1534 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1534(_fieldValue as Int)
            1535 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1535(_fieldValue as Int)
            1536 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1536(_fieldValue as Int)
            1537 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1537(_fieldValue as Int)
            1538 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1538(_fieldValue as Int)
            1539 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1539(_fieldValue as Int)
            1540 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1540(_fieldValue as Int)
            1541 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1541(_fieldValue as Int)
            1542 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1542(_fieldValue as Int)
            1543 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1543(_fieldValue as Int)
            1544 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1544(_fieldValue as Int)
            1545 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1545(_fieldValue as Int)
            1546 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1546(_fieldValue as Int)
            1547 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1547(_fieldValue as Int)
            1548 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1548(_fieldValue as Int)
            1549 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1549(_fieldValue as Int)
            1550 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1550(_fieldValue as Int)
            1551 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1551(_fieldValue as Int)
            1552 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1552(_fieldValue as Int)
            1553 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1553(_fieldValue as Int)
            1554 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1554(_fieldValue as Int)
            1555 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1555(_fieldValue as Int)
            1556 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1556(_fieldValue as Int)
            1557 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1557(_fieldValue as Int)
            1558 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1558(_fieldValue as Int)
            1559 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1559(_fieldValue as Int)
            1560 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1560(_fieldValue as Int)
            1561 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1561(_fieldValue as Int)
            1562 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1562(_fieldValue as Int)
            1563 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1563(_fieldValue as Int)
            1564 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1564(_fieldValue as Int)
            1565 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1565(_fieldValue as Int)
            1566 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1566(_fieldValue as Int)
            1567 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1567(_fieldValue as Int)
            1568 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1568(_fieldValue as Int)
            1569 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1569(_fieldValue as Int)
            1570 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1570(_fieldValue as Int)
            1571 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1571(_fieldValue as Int)
            1572 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1572(_fieldValue as Int)
            1573 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1573(_fieldValue as Int)
            1574 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1574(_fieldValue as Int)
            1575 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1575(_fieldValue as Int)
            1576 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1576(_fieldValue as Int)
            1577 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1577(_fieldValue as Int)
            1578 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1578(_fieldValue as Int)
            1579 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1579(_fieldValue as Int)
            1580 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1580(_fieldValue as Int)
            1581 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1581(_fieldValue as Int)
            1582 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1582(_fieldValue as Int)
            1583 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1583(_fieldValue as Int)
            1584 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1584(_fieldValue as Int)
            1585 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1585(_fieldValue as Int)
            1586 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1586(_fieldValue as Int)
            1587 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1587(_fieldValue as Int)
            1588 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1588(_fieldValue as Int)
            1589 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1589(_fieldValue as Int)
            1590 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1590(_fieldValue as Int)
            1591 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1591(_fieldValue as Int)
            1592 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1592(_fieldValue as Int)
            1593 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1593(_fieldValue as Int)
            1594 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1594(_fieldValue as Int)
            1595 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1595(_fieldValue as Int)
            1596 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1596(_fieldValue as Int)
            1597 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1597(_fieldValue as Int)
            1598 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1598(_fieldValue as Int)
            1599 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1599(_fieldValue as Int)
            1600 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1600(_fieldValue as Int)
            1601 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1601(_fieldValue as Int)
            1602 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1602(_fieldValue as Int)
            1603 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1603(_fieldValue as Int)
            1604 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1604(_fieldValue as Int)
            1605 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1605(_fieldValue as Int)
            1606 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1606(_fieldValue as Int)
            1607 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1607(_fieldValue as Int)
            1608 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1608(_fieldValue as Int)
            1609 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1609(_fieldValue as Int)
            1610 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1610(_fieldValue as Int)
            1611 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1611(_fieldValue as Int)
            1612 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1612(_fieldValue as Int)
            1613 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1613(_fieldValue as Int)
            1614 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1614(_fieldValue as Int)
            1615 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1615(_fieldValue as Int)
            1616 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1616(_fieldValue as Int)
            1617 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1617(_fieldValue as Int)
            1618 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1618(_fieldValue as Int)
            1619 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1619(_fieldValue as Int)
            1620 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1620(_fieldValue as Int)
            1621 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1621(_fieldValue as Int)
            1622 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1622(_fieldValue as Int)
            1623 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1623(_fieldValue as Int)
            1624 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1624(_fieldValue as Int)
            1625 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1625(_fieldValue as Int)
            1626 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1626(_fieldValue as Int)
            1627 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1627(_fieldValue as Int)
            1628 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1628(_fieldValue as Int)
            1629 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1629(_fieldValue as Int)
            1630 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1630(_fieldValue as Int)
            1631 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1631(_fieldValue as Int)
            1632 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1632(_fieldValue as Int)
            1633 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1633(_fieldValue as Int)
            1634 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1634(_fieldValue as Int)
            1635 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1635(_fieldValue as Int)
            1636 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1636(_fieldValue as Int)
            1637 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1637(_fieldValue as Int)
            1638 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1638(_fieldValue as Int)
            1639 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1639(_fieldValue as Int)
            1640 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1640(_fieldValue as Int)
            1641 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1641(_fieldValue as Int)
            1642 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1642(_fieldValue as Int)
            1643 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1643(_fieldValue as Int)
            1644 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1644(_fieldValue as Int)
            1645 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1645(_fieldValue as Int)
            1646 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1646(_fieldValue as Int)
            1647 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1647(_fieldValue as Int)
            1648 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1648(_fieldValue as Int)
            1649 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1649(_fieldValue as Int)
            1650 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1650(_fieldValue as Int)
            1651 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1651(_fieldValue as Int)
            1652 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1652(_fieldValue as Int)
            1653 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1653(_fieldValue as Int)
            1654 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1654(_fieldValue as Int)
            1655 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1655(_fieldValue as Int)
            1656 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1656(_fieldValue as Int)
            1657 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1657(_fieldValue as Int)
            1658 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1658(_fieldValue as Int)
            1659 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1659(_fieldValue as Int)
            1660 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1660(_fieldValue as Int)
            1661 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1661(_fieldValue as Int)
            1662 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1662(_fieldValue as Int)
            1663 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1663(_fieldValue as Int)
            1664 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1664(_fieldValue as Int)
            1665 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1665(_fieldValue as Int)
            1666 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1666(_fieldValue as Int)
            1667 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1667(_fieldValue as Int)
            1668 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1668(_fieldValue as Int)
            1669 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1669(_fieldValue as Int)
            1670 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1670(_fieldValue as Int)
            1671 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1671(_fieldValue as Int)
            1672 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1672(_fieldValue as Int)
            1673 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1673(_fieldValue as Int)
            1674 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1674(_fieldValue as Int)
            1675 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1675(_fieldValue as Int)
            1676 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1676(_fieldValue as Int)
            1677 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1677(_fieldValue as Int)
            1678 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1678(_fieldValue as Int)
            1679 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1679(_fieldValue as Int)
            1680 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1680(_fieldValue as Int)
            1681 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1681(_fieldValue as Int)
            1682 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1682(_fieldValue as Int)
            1683 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1683(_fieldValue as Int)
            1684 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1684(_fieldValue as Int)
            1685 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1685(_fieldValue as Int)
            1686 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1686(_fieldValue as Int)
            1687 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1687(_fieldValue as Int)
            1688 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1688(_fieldValue as Int)
            1689 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1689(_fieldValue as Int)
            1690 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1690(_fieldValue as Int)
            1691 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1691(_fieldValue as Int)
            1692 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1692(_fieldValue as Int)
            1693 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1693(_fieldValue as Int)
            1694 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1694(_fieldValue as Int)
            1695 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1695(_fieldValue as Int)
            1696 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1696(_fieldValue as Int)
            1697 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1697(_fieldValue as Int)
            1698 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1698(_fieldValue as Int)
            1699 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1699(_fieldValue as Int)
            1700 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1700(_fieldValue as Int)
            1701 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1701(_fieldValue as Int)
            1702 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1702(_fieldValue as Int)
            1703 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1703(_fieldValue as Int)
            1704 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1704(_fieldValue as Int)
            1705 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1705(_fieldValue as Int)
            1706 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1706(_fieldValue as Int)
            1707 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1707(_fieldValue as Int)
            1708 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1708(_fieldValue as Int)
            1709 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1709(_fieldValue as Int)
            1710 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1710(_fieldValue as Int)
            1711 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1711(_fieldValue as Int)
            1712 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1712(_fieldValue as Int)
            1713 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1713(_fieldValue as Int)
            1714 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1714(_fieldValue as Int)
            1715 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1715(_fieldValue as Int)
            1716 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1716(_fieldValue as Int)
            1717 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1717(_fieldValue as Int)
            1718 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1718(_fieldValue as Int)
            1719 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1719(_fieldValue as Int)
            1720 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1720(_fieldValue as Int)
            1721 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1721(_fieldValue as Int)
            1722 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1722(_fieldValue as Int)
            1723 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1723(_fieldValue as Int)
            1724 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1724(_fieldValue as Int)
            1725 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1725(_fieldValue as Int)
            1726 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1726(_fieldValue as Int)
            1727 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1727(_fieldValue as Int)
            1728 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1728(_fieldValue as Int)
            1729 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1729(_fieldValue as Int)
            1730 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1730(_fieldValue as Int)
            1731 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1731(_fieldValue as Int)
            1732 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1732(_fieldValue as Int)
            1733 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1733(_fieldValue as Int)
            1734 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1734(_fieldValue as Int)
            1735 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1735(_fieldValue as Int)
            1736 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1736(_fieldValue as Int)
            1737 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1737(_fieldValue as Int)
            1738 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1738(_fieldValue as Int)
            1739 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1739(_fieldValue as Int)
            1740 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1740(_fieldValue as Int)
            1741 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1741(_fieldValue as Int)
            1742 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1742(_fieldValue as Int)
            1743 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1743(_fieldValue as Int)
            1744 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1744(_fieldValue as Int)
            1745 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1745(_fieldValue as Int)
            1746 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1746(_fieldValue as Int)
            1747 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1747(_fieldValue as Int)
            1748 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1748(_fieldValue as Int)
            1749 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1749(_fieldValue as Int)
            1750 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1750(_fieldValue as Int)
            1751 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1751(_fieldValue as Int)
            1752 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1752(_fieldValue as Int)
            1753 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1753(_fieldValue as Int)
            1754 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1754(_fieldValue as Int)
            1755 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1755(_fieldValue as Int)
            1756 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1756(_fieldValue as Int)
            1757 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1757(_fieldValue as Int)
            1758 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1758(_fieldValue as Int)
            1759 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1759(_fieldValue as Int)
            1760 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1760(_fieldValue as Int)
            1761 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1761(_fieldValue as Int)
            1762 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1762(_fieldValue as Int)
            1763 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1763(_fieldValue as Int)
            1764 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1764(_fieldValue as Int)
            1765 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1765(_fieldValue as Int)
            1766 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1766(_fieldValue as Int)
            1767 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1767(_fieldValue as Int)
            1768 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1768(_fieldValue as Int)
            1769 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1769(_fieldValue as Int)
            1770 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1770(_fieldValue as Int)
            1771 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1771(_fieldValue as Int)
            1772 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1772(_fieldValue as Int)
            1773 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1773(_fieldValue as Int)
            1774 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1774(_fieldValue as Int)
            1775 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1775(_fieldValue as Int)
            1776 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1776(_fieldValue as Int)
            1777 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1777(_fieldValue as Int)
            1778 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1778(_fieldValue as Int)
            1779 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1779(_fieldValue as Int)
            1780 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1780(_fieldValue as Int)
            1781 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1781(_fieldValue as Int)
            1782 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1782(_fieldValue as Int)
            1783 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1783(_fieldValue as Int)
            1784 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1784(_fieldValue as Int)
            1785 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1785(_fieldValue as Int)
            1786 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1786(_fieldValue as Int)
            1787 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1787(_fieldValue as Int)
            1788 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1788(_fieldValue as Int)
            1789 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1789(_fieldValue as Int)
            1790 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1790(_fieldValue as Int)
            1791 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1791(_fieldValue as Int)
            1792 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1792(_fieldValue as Int)
            1793 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1793(_fieldValue as Int)
            1794 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1794(_fieldValue as Int)
            1795 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1795(_fieldValue as Int)
            1796 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1796(_fieldValue as Int)
            1797 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1797(_fieldValue as Int)
            1798 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1798(_fieldValue as Int)
            1799 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1799(_fieldValue as Int)
            1800 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1800(_fieldValue as Int)
            1801 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1801(_fieldValue as Int)
            1802 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1802(_fieldValue as Int)
            1803 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1803(_fieldValue as Int)
            1804 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1804(_fieldValue as Int)
            1805 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1805(_fieldValue as Int)
            1806 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1806(_fieldValue as Int)
            1807 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1807(_fieldValue as Int)
            1808 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1808(_fieldValue as Int)
            1809 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1809(_fieldValue as Int)
            1810 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1810(_fieldValue as Int)
            1811 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1811(_fieldValue as Int)
            1812 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1812(_fieldValue as Int)
            1813 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1813(_fieldValue as Int)
            1814 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1814(_fieldValue as Int)
            1815 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1815(_fieldValue as Int)
            1816 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1816(_fieldValue as Int)
            1817 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1817(_fieldValue as Int)
            1818 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1818(_fieldValue as Int)
            1819 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1819(_fieldValue as Int)
            1820 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1820(_fieldValue as Int)
            1821 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1821(_fieldValue as Int)
            1822 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1822(_fieldValue as Int)
            1823 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1823(_fieldValue as Int)
            1824 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1824(_fieldValue as Int)
            1825 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1825(_fieldValue as Int)
            1826 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1826(_fieldValue as Int)
            1827 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1827(_fieldValue as Int)
            1828 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1828(_fieldValue as Int)
            1829 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1829(_fieldValue as Int)
            1830 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1830(_fieldValue as Int)
            1831 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1831(_fieldValue as Int)
            1832 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1832(_fieldValue as Int)
            1833 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1833(_fieldValue as Int)
            1834 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1834(_fieldValue as Int)
            1835 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1835(_fieldValue as Int)
            1836 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1836(_fieldValue as Int)
            1837 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1837(_fieldValue as Int)
            1838 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1838(_fieldValue as Int)
            1839 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1839(_fieldValue as Int)
            1840 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1840(_fieldValue as Int)
            1841 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1841(_fieldValue as Int)
            1842 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1842(_fieldValue as Int)
            1843 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1843(_fieldValue as Int)
            1844 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1844(_fieldValue as Int)
            1845 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1845(_fieldValue as Int)
            1846 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1846(_fieldValue as Int)
            1847 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1847(_fieldValue as Int)
            1848 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1848(_fieldValue as Int)
            1849 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1849(_fieldValue as Int)
            1850 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1850(_fieldValue as Int)
            1851 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1851(_fieldValue as Int)
            1852 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1852(_fieldValue as Int)
            1853 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1853(_fieldValue as Int)
            1854 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1854(_fieldValue as Int)
            1855 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1855(_fieldValue as Int)
            1856 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1856(_fieldValue as Int)
            1857 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1857(_fieldValue as Int)
            1858 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1858(_fieldValue as Int)
            1859 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1859(_fieldValue as Int)
            1860 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1860(_fieldValue as Int)
            1861 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1861(_fieldValue as Int)
            1862 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1862(_fieldValue as Int)
            1863 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1863(_fieldValue as Int)
            1864 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1864(_fieldValue as Int)
            1865 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1865(_fieldValue as Int)
            1866 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1866(_fieldValue as Int)
            1867 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1867(_fieldValue as Int)
            1868 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1868(_fieldValue as Int)
            1869 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1869(_fieldValue as Int)
            1870 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1870(_fieldValue as Int)
            1871 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1871(_fieldValue as Int)
            1872 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1872(_fieldValue as Int)
            1873 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1873(_fieldValue as Int)
            1874 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1874(_fieldValue as Int)
            1875 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1875(_fieldValue as Int)
            1876 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1876(_fieldValue as Int)
            1877 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1877(_fieldValue as Int)
            1878 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1878(_fieldValue as Int)
            1879 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1879(_fieldValue as Int)
            1880 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1880(_fieldValue as Int)
            1881 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1881(_fieldValue as Int)
            1882 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1882(_fieldValue as Int)
            1883 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1883(_fieldValue as Int)
            1884 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1884(_fieldValue as Int)
            1885 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1885(_fieldValue as Int)
            1886 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1886(_fieldValue as Int)
            1887 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1887(_fieldValue as Int)
            1888 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1888(_fieldValue as Int)
            1889 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1889(_fieldValue as Int)
            1890 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1890(_fieldValue as Int)
            1891 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1891(_fieldValue as Int)
            1892 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1892(_fieldValue as Int)
            1893 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1893(_fieldValue as Int)
            1894 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1894(_fieldValue as Int)
            1895 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1895(_fieldValue as Int)
            1896 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1896(_fieldValue as Int)
            1897 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1897(_fieldValue as Int)
            1898 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1898(_fieldValue as Int)
            1899 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1899(_fieldValue as Int)
            1900 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1900(_fieldValue as Int)
            1901 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1901(_fieldValue as Int)
            1902 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1902(_fieldValue as Int)
            1903 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1903(_fieldValue as Int)
            1904 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1904(_fieldValue as Int)
            1905 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1905(_fieldValue as Int)
            1906 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1906(_fieldValue as Int)
            1907 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1907(_fieldValue as Int)
            1908 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1908(_fieldValue as Int)
            1909 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1909(_fieldValue as Int)
            1910 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1910(_fieldValue as Int)
            1911 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1911(_fieldValue as Int)
            1912 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1912(_fieldValue as Int)
            1913 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1913(_fieldValue as Int)
            1914 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1914(_fieldValue as Int)
            1915 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1915(_fieldValue as Int)
            1916 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1916(_fieldValue as Int)
            1917 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1917(_fieldValue as Int)
            1918 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1918(_fieldValue as Int)
            1919 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1919(_fieldValue as Int)
            1920 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1920(_fieldValue as Int)
            1921 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1921(_fieldValue as Int)
            1922 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1922(_fieldValue as Int)
            1923 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1923(_fieldValue as Int)
            1924 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1924(_fieldValue as Int)
            1925 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1925(_fieldValue as Int)
            1926 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1926(_fieldValue as Int)
            1927 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1927(_fieldValue as Int)
            1928 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1928(_fieldValue as Int)
            1929 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1929(_fieldValue as Int)
            1930 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1930(_fieldValue as Int)
            1931 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1931(_fieldValue as Int)
            1932 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1932(_fieldValue as Int)
            1933 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1933(_fieldValue as Int)
            1934 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1934(_fieldValue as Int)
            1935 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1935(_fieldValue as Int)
            1936 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1936(_fieldValue as Int)
            1937 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1937(_fieldValue as Int)
            1938 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1938(_fieldValue as Int)
            1939 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1939(_fieldValue as Int)
            1940 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1940(_fieldValue as Int)
            1941 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1941(_fieldValue as Int)
            1942 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1942(_fieldValue as Int)
            1943 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1943(_fieldValue as Int)
            1944 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1944(_fieldValue as Int)
            1945 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1945(_fieldValue as Int)
            1946 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1946(_fieldValue as Int)
            1947 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1947(_fieldValue as Int)
            1948 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1948(_fieldValue as Int)
            1949 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1949(_fieldValue as Int)
            1950 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1950(_fieldValue as Int)
            1951 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1951(_fieldValue as Int)
            1952 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1952(_fieldValue as Int)
            1953 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1953(_fieldValue as Int)
            1954 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1954(_fieldValue as Int)
            1955 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1955(_fieldValue as Int)
            1956 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1956(_fieldValue as Int)
            1957 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1957(_fieldValue as Int)
            1958 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1958(_fieldValue as Int)
            1959 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1959(_fieldValue as Int)
            1960 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1960(_fieldValue as Int)
            1961 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1961(_fieldValue as Int)
            1962 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1962(_fieldValue as Int)
            1963 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1963(_fieldValue as Int)
            1964 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1964(_fieldValue as Int)
            1965 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1965(_fieldValue as Int)
            1966 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1966(_fieldValue as Int)
            1967 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1967(_fieldValue as Int)
            1968 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1968(_fieldValue as Int)
            1969 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1969(_fieldValue as Int)
            1970 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1970(_fieldValue as Int)
            1971 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1971(_fieldValue as Int)
            1972 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1972(_fieldValue as Int)
            1973 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1973(_fieldValue as Int)
            1974 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1974(_fieldValue as Int)
            1975 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1975(_fieldValue as Int)
            1976 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1976(_fieldValue as Int)
            1977 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1977(_fieldValue as Int)
            1978 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1978(_fieldValue as Int)
            1979 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1979(_fieldValue as Int)
            1980 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1980(_fieldValue as Int)
            1981 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1981(_fieldValue as Int)
            1982 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1982(_fieldValue as Int)
            1983 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1983(_fieldValue as Int)
            1984 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1984(_fieldValue as Int)
            1985 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1985(_fieldValue as Int)
            1986 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1986(_fieldValue as Int)
            1987 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1987(_fieldValue as Int)
            1988 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1988(_fieldValue as Int)
            1989 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1989(_fieldValue as Int)
            1990 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1990(_fieldValue as Int)
            1991 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1991(_fieldValue as Int)
            1992 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1992(_fieldValue as Int)
            1993 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1993(_fieldValue as Int)
            1994 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1994(_fieldValue as Int)
            1995 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1995(_fieldValue as Int)
            1996 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1996(_fieldValue as Int)
            1997 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1997(_fieldValue as Int)
            1998 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1998(_fieldValue as Int)
            1999 -> hugeOneof = MessageWithHugeOneof.HugeOneof.Oneof1999(_fieldValue as Int)
        }
    }
    return MessageWithHugeOneof(hugeOneof, unknownFields)
}
