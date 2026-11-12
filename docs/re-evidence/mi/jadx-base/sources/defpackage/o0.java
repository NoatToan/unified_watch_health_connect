package defpackage;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.miui.tsmclient.service.DKFRequestService;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.miot.ble.bouncycastle.crypto.DataLengthException;
import com.xiaomi.miot.ble.bouncycastle.crypto.OutputLengthException;
import java.lang.reflect.Array;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes11.dex */
public class o0 implements qv2 {
    public static final byte[] i = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, HMProSyncDataBaseProfile.DATA_SPO2_OSA, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, 63, -9, -52, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, -91, -27, -15, 113, -40, 49, 21, 4, -57, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL, -61, 24, -106, 5, -102, 7, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, -128, -30, -21, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT, -78, 117, 9, -125, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 26, 27, 110, 90, DKFRequestService.o, 82, 59, -42, -77, HMProSyncDataBaseProfile.DATA_STAND_HOUR, -29, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, SettingsModule.VALUE_TYPE_FLAG, 60, -97, -88, 81, -93, 64, -113, -110, -99, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, -11, -68, -74, -38, SettingsModule.VALUE_TYPE_STRING_ENUM, 16, -1, -13, -46, -51, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, -20, 95, -105, 68, 23, -60, -89, 126, Base64.padSymbol, 100, 93, 25, 115, 96, -127, 79, -36, 34, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 10, 73, 6, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, HMProSyncDataBaseProfile.DATA_SPO2_POINT, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, -75, 102, 72, 3, -10, HMProSyncDataBaseProfile.DATA_TYPE_COACHING, APDUConstants.TAG_MORE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, 87, -71, -122, -63, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC, -121, -23, -50, 85, HMProSyncDataBaseProfile.DATA_SPO2_ODI, -33, -116, -95, -119, HMProSyncDataBaseProfile.DATA_TYPE_PAI, -65, -26, 66, 104, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, -103, 45, 15, -80, 84, -69, 22};
    public static final byte[] j = {82, 9, 106, -43, 48, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, -91, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, -126, -101, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE, -1, -121, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, -90, -62, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL, Base64.padSymbol, -18, 76, -107, 11, 66, -6, -61, 78, 8, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, -95, 102, HMProSyncDataBaseProfile.DATA_SPO2_ODI, -39, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, -78, 118, 91, -94, 73, 109, -117, -47, HMProSyncDataBaseProfile.DATA_SPO2_POINT, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, SettingsModule.VALUE_TYPE_FLAG, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, -118, 107, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, -111, 17, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, -123, -30, -7, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, -24, 28, 117, -33, 110, 71, -15, 26, 113, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR, HMProSyncDataBaseProfile.DATA_STAND_HOUR, -59, -119, 111, -73, 98, HMProSyncDataBaseProfile.DATA_TYPE_COACHING, -86, 24, -66, 27, -4, 86, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, 16, 89, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT, -128, -20, 95, 96, 81, 127, -87, 25, -75, 74, HMProSyncDataBaseProfile.DATA_TYPE_PAI, 45, -27, 122, -97, -109, -55, -100, -17, DKFRequestService.o, -32, 59, 77, -82, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, -11, -80, -56, -21, -69, 60, -125, 83, -103, APDUConstants.TAG_MORE_DATA, 23, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, 4, 126, -70, 119, -42, HMProSyncDataBaseProfile.DATA_SPO2_OSA, -31, 105, 20, 99, 85, SettingsModule.VALUE_TYPE_STRING_ENUM, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 125};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f28600k = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, SportReportBaseParser.ReportType.avgDescentRate, 99, SportReportBaseParser.ReportType.algorithmDataSource, 151, 53, 106, 212, 179, 125, 250, 239, SportReportBaseParser.ReportType.noFlyDuration, 145};
    public static final int[] l = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};
    public static final int[] m = {1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[][] f28602b = null;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public byte[] h;

    public static int b(int i2) {
        return (((i2 & (-2139062144)) >>> 7) * 27) ^ ((2139062143 & i2) << 1);
    }

    public static int c(int i2) {
        int i3 = (1061109567 & i2) << 2;
        int i4 = i2 & (-1061109568);
        int i5 = i4 ^ (i4 >>> 1);
        return (i5 >>> 5) ^ (i3 ^ (i5 >>> 2));
    }

    public static int g(int i2) {
        int i3 = i(i2, 8) ^ i2;
        int iB = i2 ^ b(i3);
        int iC = i3 ^ c(iB);
        return iB ^ (iC ^ i(iC, 16));
    }

    public static int i(int i2, int i3) {
        return (i2 << (-i3)) | (i2 >>> i3);
    }

    public static int j(int i2) {
        byte[] bArr = i;
        return (bArr[(i2 >> 24) & 255] << 24) | (bArr[i2 & 255] & 255) | ((bArr[(i2 >> 8) & 255] & 255) << 8) | ((bArr[(i2 >> 16) & 255] & 255) << 16);
    }

    @Override // defpackage.qv2
    public void a(boolean z, nw3 nw3Var) {
        if (!(nw3Var instanceof e0e)) {
            throw new IllegalArgumentException("invalid parameter passed to AES init - " + nw3Var.getClass().getName());
        }
        this.f28602b = f(((e0e) nw3Var).a(), z);
        this.g = z;
        if (z) {
            this.h = xj1.a(i);
        } else {
            this.h = xj1.a(j);
        }
    }

    public final void d(int[][] iArr) {
        int i2 = this.c;
        int i3 = this.f28601a;
        int[] iArr2 = iArr[i3];
        char c = 0;
        int i4 = i2 ^ iArr2[0];
        int i5 = 1;
        int i6 = this.d ^ iArr2[1];
        int i7 = this.e ^ iArr2[2];
        int i8 = i3 - 1;
        char c2 = 3;
        int i9 = iArr2[3] ^ this.f;
        while (i8 > i5) {
            int[] iArr3 = m;
            int i10 = (((iArr3[i4 & 255] ^ i(iArr3[(i9 >> 8) & 255], 24)) ^ i(iArr3[(i7 >> 16) & 255], 16)) ^ i(iArr3[(i6 >> 24) & 255], 8)) ^ iArr[i8][c];
            int i11 = (((i(iArr3[(i4 >> 8) & 255], 24) ^ iArr3[i6 & 255]) ^ i(iArr3[(i9 >> 16) & 255], 16)) ^ i(iArr3[(i7 >> 24) & 255], 8)) ^ iArr[i8][i5];
            int i12 = (((i(iArr3[(i6 >> 8) & 255], 24) ^ iArr3[i7 & 255]) ^ i(iArr3[(i4 >> 16) & 255], 16)) ^ i(iArr3[(i9 >> 24) & 255], 8)) ^ iArr[i8][2];
            int i13 = i(iArr3[(i4 >> 24) & 255], 8) ^ ((iArr3[i9 & 255] ^ i(iArr3[(i7 >> 8) & 255], 24)) ^ i(iArr3[(i6 >> 16) & 255], 16));
            int i14 = i8 - 1;
            int i15 = i13 ^ iArr[i8][c2];
            int i16 = (((iArr3[i10 & 255] ^ i(iArr3[(i15 >> 8) & 255], 24)) ^ i(iArr3[(i12 >> 16) & 255], 16)) ^ i(iArr3[(i11 >> 24) & 255], 8)) ^ iArr[i14][0];
            int i17 = (((iArr3[i11 & 255] ^ i(iArr3[(i10 >> 8) & 255], 24)) ^ i(iArr3[(i15 >> 16) & 255], 16)) ^ i(iArr3[(i12 >> 24) & 255], 8)) ^ iArr[i14][1];
            int i18 = (((i(iArr3[(i11 >> 8) & 255], 24) ^ iArr3[i12 & 255]) ^ i(iArr3[(i10 >> 16) & 255], 16)) ^ i(iArr3[(i15 >> 24) & 255], 8)) ^ iArr[i14][2];
            i8 -= 2;
            i9 = iArr[i14][3] ^ (((iArr3[i15 & 255] ^ i(iArr3[(i12 >> 8) & 255], 24)) ^ i(iArr3[(i11 >> 16) & 255], 16)) ^ i(iArr3[(i10 >> 24) & 255], 8));
            i4 = i16;
            i6 = i17;
            i7 = i18;
            c = 0;
            i5 = 1;
            c2 = 3;
        }
        int[] iArr4 = m;
        int i19 = (((iArr4[i4 & 255] ^ i(iArr4[(i9 >> 8) & 255], 24)) ^ i(iArr4[(i7 >> 16) & 255], 16)) ^ i(iArr4[(i6 >> 24) & 255], 8)) ^ iArr[i8][0];
        int i20 = (((iArr4[i6 & 255] ^ i(iArr4[(i4 >> 8) & 255], 24)) ^ i(iArr4[(i9 >> 16) & 255], 16)) ^ i(iArr4[(i7 >> 24) & 255], 8)) ^ iArr[i8][1];
        int i21 = (((iArr4[i7 & 255] ^ i(iArr4[(i6 >> 8) & 255], 24)) ^ i(iArr4[(i4 >> 16) & 255], 16)) ^ i(iArr4[(i9 >> 24) & 255], 8)) ^ iArr[i8][2];
        int i22 = (i(iArr4[(i4 >> 24) & 255], 8) ^ ((iArr4[i9 & 255] ^ i(iArr4[(i7 >> 8) & 255], 24)) ^ i(iArr4[(i6 >> 16) & 255], 16))) ^ iArr[i8][3];
        byte[] bArr = j;
        int i23 = bArr[i19 & 255] & 255;
        byte[] bArr2 = this.h;
        int i24 = ((i23 ^ ((bArr2[(i22 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i21 >> 16) & 255] & 255) << 16)) ^ (bArr[(i20 >> 24) & 255] << 24);
        int[] iArr5 = iArr[0];
        this.c = i24 ^ iArr5[0];
        this.d = ((((bArr2[i20 & 255] & 255) ^ ((bArr2[(i19 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i22 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i21 >> 24) & 255] << 24)) ^ iArr5[1];
        this.e = ((((bArr2[i21 & 255] & 255) ^ ((bArr[(i20 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i19 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i22 >> 24) & 255] << 24)) ^ iArr5[2];
        this.f = ((((bArr[i22 & 255] & 255) ^ ((bArr2[(i21 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i20 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i19 >> 24) & 255] << 24)) ^ iArr5[3];
    }

    public final void e(int[][] iArr) {
        int i2 = this.c;
        char c = 0;
        int[] iArr2 = iArr[0];
        int i3 = i2 ^ iArr2[0];
        int i4 = 1;
        int i5 = this.d ^ iArr2[1];
        int i6 = this.e ^ iArr2[2];
        char c2 = 3;
        int i7 = iArr2[3] ^ this.f;
        int i8 = 1;
        while (i8 < this.f28601a - i4) {
            int[] iArr3 = l;
            int i9 = (((iArr3[i3 & 255] ^ i(iArr3[(i5 >> 8) & 255], 24)) ^ i(iArr3[(i6 >> 16) & 255], 16)) ^ i(iArr3[(i7 >> 24) & 255], 8)) ^ iArr[i8][c];
            int i10 = (((i(iArr3[(i6 >> 8) & 255], 24) ^ iArr3[i5 & 255]) ^ i(iArr3[(i7 >> 16) & 255], 16)) ^ i(iArr3[(i3 >> 24) & 255], 8)) ^ iArr[i8][i4];
            int i11 = (((i(iArr3[(i7 >> 8) & 255], 24) ^ iArr3[i6 & 255]) ^ i(iArr3[(i3 >> 16) & 255], 16)) ^ i(iArr3[(i5 >> 24) & 255], 8)) ^ iArr[i8][2];
            int i12 = ((i(iArr3[(i3 >> 8) & 255], 24) ^ iArr3[i7 & 255]) ^ i(iArr3[(i5 >> 16) & 255], 16)) ^ i(iArr3[(i6 >> 24) & 255], 8);
            int i13 = i8 + 1;
            int i14 = i12 ^ iArr[i8][c2];
            int i15 = (((iArr3[i9 & 255] ^ i(iArr3[(i10 >> 8) & 255], 24)) ^ i(iArr3[(i11 >> 16) & 255], 16)) ^ i(iArr3[(i14 >> 24) & 255], 8)) ^ iArr[i13][0];
            int i16 = (((iArr3[i10 & 255] ^ i(iArr3[(i11 >> 8) & 255], 24)) ^ i(iArr3[(i14 >> 16) & 255], 16)) ^ i(iArr3[(i9 >> 24) & 255], 8)) ^ iArr[i13][1];
            int i17 = (((i(iArr3[(i14 >> 8) & 255], 24) ^ iArr3[i11 & 255]) ^ i(iArr3[(i9 >> 16) & 255], 16)) ^ i(iArr3[(i10 >> 24) & 255], 8)) ^ iArr[i13][2];
            i8 += 2;
            i7 = (((iArr3[i14 & 255] ^ i(iArr3[(i9 >> 8) & 255], 24)) ^ i(iArr3[(i10 >> 16) & 255], 16)) ^ i(iArr3[(i11 >> 24) & 255], 8)) ^ iArr[i13][3];
            i3 = i15;
            i5 = i16;
            i6 = i17;
            c = 0;
            i4 = 1;
            c2 = 3;
        }
        int[] iArr4 = l;
        int i18 = (((iArr4[i3 & 255] ^ i(iArr4[(i5 >> 8) & 255], 24)) ^ i(iArr4[(i6 >> 16) & 255], 16)) ^ i(iArr4[(i7 >> 24) & 255], 8)) ^ iArr[i8][0];
        int i19 = (((iArr4[i5 & 255] ^ i(iArr4[(i6 >> 8) & 255], 24)) ^ i(iArr4[(i7 >> 16) & 255], 16)) ^ i(iArr4[(i3 >> 24) & 255], 8)) ^ iArr[i8][1];
        int i20 = (((iArr4[i6 & 255] ^ i(iArr4[(i7 >> 8) & 255], 24)) ^ i(iArr4[(i3 >> 16) & 255], 16)) ^ i(iArr4[(i5 >> 24) & 255], 8)) ^ iArr[i8][2];
        int i21 = (((i(iArr4[(i3 >> 8) & 255], 24) ^ iArr4[i7 & 255]) ^ i(iArr4[(i5 >> 16) & 255], 16)) ^ i(iArr4[(i6 >> 24) & 255], 8)) ^ iArr[i8][3];
        byte[] bArr = i;
        int i22 = (bArr[i18 & 255] & 255) ^ ((bArr[(i19 >> 8) & 255] & 255) << 8);
        byte[] bArr2 = this.h;
        int i23 = (i22 ^ ((bArr2[(i20 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i21 >> 24) & 255] << 24);
        int[] iArr5 = iArr[i8 + 1];
        this.c = i23 ^ iArr5[0];
        this.d = ((((bArr2[i19 & 255] & 255) ^ ((bArr[(i20 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i21 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i18 >> 24) & 255] << 24)) ^ iArr5[1];
        this.e = ((((bArr2[i20 & 255] & 255) ^ ((bArr[(i21 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i18 >> 16) & 255] & 255) << 16)) ^ (bArr[(i19 >> 24) & 255] << 24)) ^ iArr5[2];
        this.f = ((((bArr2[i21 & 255] & 255) ^ ((bArr2[(i18 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i19 >> 16) & 255] & 255) << 16)) ^ (bArr[(i20 >> 24) & 255] << 24)) ^ iArr5[3];
    }

    public final int[][] f(byte[] bArr, boolean z) {
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i2 = length >>> 2;
        this.f28601a = i2 + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2 + 7, 4);
        if (i2 == 4) {
            int iA = bhh.a(bArr, 0);
            iArr[0][0] = iA;
            int iA2 = bhh.a(bArr, 4);
            iArr[0][1] = iA2;
            int iA3 = bhh.a(bArr, 8);
            iArr[0][2] = iA3;
            int iA4 = bhh.a(bArr, 12);
            iArr[0][3] = iA4;
            for (int i3 = 1; i3 <= 10; i3++) {
                iA ^= j(i(iA4, 8)) ^ f28600k[i3 - 1];
                int[] iArr2 = iArr[i3];
                iArr2[0] = iA;
                iA2 ^= iA;
                iArr2[1] = iA2;
                iA3 ^= iA2;
                iArr2[2] = iA3;
                iA4 ^= iA3;
                iArr2[3] = iA4;
            }
        } else if (i2 == 6) {
            int iA5 = bhh.a(bArr, 0);
            iArr[0][0] = iA5;
            int iA6 = bhh.a(bArr, 4);
            iArr[0][1] = iA6;
            int iA7 = bhh.a(bArr, 8);
            iArr[0][2] = iA7;
            int iA8 = bhh.a(bArr, 12);
            iArr[0][3] = iA8;
            int iA9 = bhh.a(bArr, 16);
            iArr[1][0] = iA9;
            int iA10 = bhh.a(bArr, 20);
            iArr[1][1] = iA10;
            int iJ = iA5 ^ (j(i(iA10, 8)) ^ 1);
            int[] iArr3 = iArr[1];
            iArr3[2] = iJ;
            int i4 = iA6 ^ iJ;
            iArr3[3] = i4;
            int i5 = iA7 ^ i4;
            int[] iArr4 = iArr[2];
            iArr4[0] = i5;
            int i6 = iA8 ^ i5;
            iArr4[1] = i6;
            int i7 = iA9 ^ i6;
            iArr4[2] = i7;
            int i8 = iA10 ^ i7;
            iArr4[3] = i8;
            int i9 = 2;
            for (int i10 = 3; i10 < 12; i10 += 3) {
                int iJ2 = iJ ^ (j(i(i8, 8)) ^ i9);
                int[] iArr5 = iArr[i10];
                iArr5[0] = iJ2;
                int i11 = i4 ^ iJ2;
                iArr5[1] = i11;
                int i12 = i5 ^ i11;
                iArr5[2] = i12;
                int i13 = i6 ^ i12;
                iArr5[3] = i13;
                int i14 = i7 ^ i13;
                int i15 = i10 + 1;
                int[] iArr6 = iArr[i15];
                iArr6[0] = i14;
                int i16 = i8 ^ i14;
                iArr6[1] = i16;
                int iJ3 = j(i(i16, 8)) ^ (i9 << 1);
                i9 <<= 2;
                iJ = iJ2 ^ iJ3;
                int[] iArr7 = iArr[i15];
                iArr7[2] = iJ;
                i4 = i11 ^ iJ;
                iArr7[3] = i4;
                i5 = i12 ^ i4;
                int[] iArr8 = iArr[i10 + 2];
                iArr8[0] = i5;
                i6 = i13 ^ i5;
                iArr8[1] = i6;
                i7 = i14 ^ i6;
                iArr8[2] = i7;
                i8 = i16 ^ i7;
                iArr8[3] = i8;
            }
            int iJ4 = (j(i(i8, 8)) ^ i9) ^ iJ;
            int[] iArr9 = iArr[12];
            iArr9[0] = iJ4;
            int i17 = iJ4 ^ i4;
            iArr9[1] = i17;
            int i18 = i17 ^ i5;
            iArr9[2] = i18;
            iArr9[3] = i18 ^ i6;
        } else {
            if (i2 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int iA11 = bhh.a(bArr, 0);
            iArr[0][0] = iA11;
            int iA12 = bhh.a(bArr, 4);
            iArr[0][1] = iA12;
            int iA13 = bhh.a(bArr, 8);
            iArr[0][2] = iA13;
            int iA14 = bhh.a(bArr, 12);
            iArr[0][3] = iA14;
            int iA15 = bhh.a(bArr, 16);
            iArr[1][0] = iA15;
            int iA16 = bhh.a(bArr, 20);
            iArr[1][1] = iA16;
            int iA17 = bhh.a(bArr, 24);
            iArr[1][2] = iA17;
            int iA18 = bhh.a(bArr, 28);
            iArr[1][3] = iA18;
            int i19 = 1;
            for (int i20 = 2; i20 < 14; i20 += 2) {
                int iJ5 = j(i(iA18, 8)) ^ i19;
                i19 <<= 1;
                iA11 ^= iJ5;
                int[] iArr10 = iArr[i20];
                iArr10[0] = iA11;
                iA12 ^= iA11;
                iArr10[1] = iA12;
                iA13 ^= iA12;
                iArr10[2] = iA13;
                iA14 ^= iA13;
                iArr10[3] = iA14;
                iA15 ^= j(iA14);
                int[] iArr11 = iArr[i20 + 1];
                iArr11[0] = iA15;
                iA16 ^= iA15;
                iArr11[1] = iA16;
                iA17 ^= iA16;
                iArr11[2] = iA17;
                iA18 ^= iA17;
                iArr11[3] = iA18;
            }
            int iJ6 = (j(i(iA18, 8)) ^ i19) ^ iA11;
            int[] iArr12 = iArr[14];
            iArr12[0] = iJ6;
            int i21 = iJ6 ^ iA12;
            iArr12[1] = i21;
            int i22 = i21 ^ iA13;
            iArr12[2] = i22;
            iArr12[3] = i22 ^ iA14;
        }
        if (!z) {
            for (int i23 = 1; i23 < this.f28601a; i23++) {
                for (int i24 = 0; i24 < 4; i24++) {
                    int[] iArr13 = iArr[i23];
                    iArr13[i24] = g(iArr13[i24]);
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.qv2
    public int getBlockSize() {
        return 16;
    }

    public final void h(byte[] bArr, int i2) {
        int i3 = this.c;
        bArr[i2] = (byte) i3;
        bArr[i2 + 1] = (byte) (i3 >> 8);
        bArr[i2 + 2] = (byte) (i3 >> 16);
        bArr[i2 + 3] = (byte) (i3 >> 24);
        int i4 = this.d;
        bArr[i2 + 4] = (byte) i4;
        bArr[i2 + 5] = (byte) (i4 >> 8);
        bArr[i2 + 6] = (byte) (i4 >> 16);
        bArr[i2 + 7] = (byte) (i4 >> 24);
        int i5 = this.e;
        bArr[i2 + 8] = (byte) i5;
        bArr[i2 + 9] = (byte) (i5 >> 8);
        bArr[i2 + 10] = (byte) (i5 >> 16);
        bArr[i2 + 11] = (byte) (i5 >> 24);
        int i6 = this.f;
        bArr[i2 + 12] = (byte) i6;
        bArr[i2 + 13] = (byte) (i6 >> 8);
        bArr[i2 + 14] = (byte) (i6 >> 16);
        bArr[i2 + 15] = (byte) (i6 >> 24);
    }

    public final void k(byte[] bArr, int i2) {
        this.c = ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255) | ((bArr[i2 + 2] & 255) << 16) | (bArr[i2 + 3] << 24);
        this.d = ((bArr[i2 + 5] & 255) << 8) | (bArr[i2 + 4] & 255) | ((bArr[i2 + 6] & 255) << 16) | (bArr[i2 + 7] << 24);
        this.e = ((bArr[i2 + 9] & 255) << 8) | (bArr[i2 + 8] & 255) | ((bArr[i2 + 10] & 255) << 16) | (bArr[i2 + 11] << 24);
        int i3 = ((bArr[i2 + 13] & 255) << 8) | (bArr[i2 + 12] & 255);
        this.f = (bArr[i2 + 15] << 24) | i3 | ((bArr[i2 + 14] & 255) << 16);
    }

    @Override // defpackage.qv2
    public int processBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        if (this.f28602b == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i2 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.g) {
            k(bArr, i2);
            e(this.f28602b);
            h(bArr2, i3);
            return 16;
        }
        k(bArr, i2);
        d(this.f28602b);
        h(bArr2, i3);
        return 16;
    }

    @Override // defpackage.qv2
    public void reset() {
    }
}
