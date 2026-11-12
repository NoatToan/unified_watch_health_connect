package defpackage;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes7.dex */
public class q12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f30973a = {HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, APDUConstants.TAG_MORE_DATA, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f30974b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, -9, -9, -9, 63, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 59, 60, Base64.padSymbol, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_PAI, HMProSyncDataBaseProfile.DATA_TYPE_COACHING, 15, 16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR, HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC, 31, 32, SettingsModule.VALUE_TYPE_STRING_ENUM, 34, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, HMProSyncDataBaseProfile.DATA_SPO2_POINT, HMProSyncDataBaseProfile.DATA_SPO2_OSA, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT, HMProSyncDataBaseProfile.DATA_SPO2_ODI, HMProSyncDataBaseProfile.DATA_STAND_HOUR, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 45, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, -9, -9, -9, -9};
    public static final byte[] c = {HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, APDUConstants.TAG_MORE_DATA, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, 45, 95};
    public static final byte[] d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, -9, -9, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 59, 60, Base64.padSymbol, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_PAI, HMProSyncDataBaseProfile.DATA_TYPE_COACHING, 15, 16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR, HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC, 31, 32, SettingsModule.VALUE_TYPE_STRING_ENUM, 34, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, HMProSyncDataBaseProfile.DATA_SPO2_POINT, HMProSyncDataBaseProfile.DATA_SPO2_OSA, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT, HMProSyncDataBaseProfile.DATA_SPO2_ODI, HMProSyncDataBaseProfile.DATA_STAND_HOUR, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 45, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, -9, -9, -9, -9};
    public static final byte[] e = {45, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, APDUConstants.TAG_MORE_DATA, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    public static final byte[] f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_PAI, HMProSyncDataBaseProfile.DATA_TYPE_COACHING, 15, 16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, 26, 27, 28, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR, HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC, 31, 32, SettingsModule.VALUE_TYPE_STRING_ENUM, 34, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, -9, -9, -9, -9, HMProSyncDataBaseProfile.DATA_SPO2_POINT, -9, HMProSyncDataBaseProfile.DATA_SPO2_OSA, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT, HMProSyncDataBaseProfile.DATA_SPO2_ODI, HMProSyncDataBaseProfile.DATA_STAND_HOUR, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 45, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 59, 60, Base64.padSymbol, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, 63, -9, -9, -9, -9};

    public static byte[] e(String str) {
        return f(str, 0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:42:0x0054
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static byte[] f(java.lang.String r5, int r6) {
        /*
            java.lang.String r0 = "UTF-8"
            byte[] r5 = r5.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L7
            goto Lb
        L7:
            byte[] r5 = r5.getBytes()
        Lb:
            int r0 = r5.length
            r1 = 0
            byte[] r5 = g(r5, r1, r0, r6)
            if (r5 == 0) goto L7c
            int r6 = r5.length
            r0 = 4
            if (r6 < r0) goto L7c
            r6 = r5[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r0 = 1
            r0 = r5[r0]
            int r0 = r0 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r2
            r6 = r6 | r0
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r0 != r6) goto L7c
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r6]
            r0 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6b
            r2.<init>()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6b
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L64
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L64
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5e
        L3e:
            int r0 = r4.read(r6)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            if (r0 < 0) goto L4d
            r2.write(r6, r1, r0)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            goto L3e
        L48:
            r5 = move-exception
        L49:
            r0 = r2
            goto L6e
        L4b:
            r0 = r2
            goto L78
        L4d:
            byte[] r5 = r2.toByteArray()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            r2.close()     // Catch: java.lang.Exception -> L54
        L54:
            r4.close()     // Catch: java.lang.Exception -> L57
        L57:
            r3.close()     // Catch: java.lang.Exception -> L7c
            goto L7c
        L5b:
            r5 = move-exception
            r4 = r0
            goto L49
        L5e:
            r4 = r0
            goto L4b
        L60:
            r5 = move-exception
            r3 = r0
            r4 = r3
            goto L49
        L64:
            r3 = r0
            r4 = r3
            goto L4b
        L67:
            r5 = move-exception
            r3 = r0
            r4 = r3
            goto L6e
        L6b:
            r3 = r0
            r4 = r3
            goto L78
        L6e:
            r0.close()     // Catch: java.lang.Exception -> L71
        L71:
            r4.close()     // Catch: java.lang.Exception -> L74
        L74:
            r3.close()     // Catch: java.lang.Exception -> L77
        L77:
            throw r5
        L78:
            r0.close()     // Catch: java.lang.Exception -> L54
            goto L54
        L7c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q12.f(java.lang.String, int):byte[]");
    }

    public static byte[] g(byte[] bArr, int i, int i2, int i3) {
        byte[] bArrO = o(i3);
        byte[] bArr2 = new byte[(i2 * 3) / 4];
        byte[] bArr3 = new byte[4];
        int i4 = 0;
        int iH = 0;
        for (int i5 = i; i5 < i + i2; i5++) {
            byte b2 = (byte) (bArr[i5] & 127);
            byte b3 = bArrO[b2];
            if (b3 < -5) {
                System.err.println("Bad Base64Coder input character at " + i5 + ": " + ((int) bArr[i5]) + "(decimal)");
                return null;
            }
            if (b3 >= -1) {
                int i6 = i4 + 1;
                bArr3[i4] = b2;
                if (i6 > 3) {
                    iH += h(bArr3, 0, bArr2, iH, i3);
                    if (b2 == 61) {
                        break;
                    }
                    i4 = 0;
                } else {
                    i4 = i6;
                }
            }
        }
        byte[] bArr4 = new byte[iH];
        System.arraycopy(bArr2, 0, bArr4, 0, iH);
        return bArr4;
    }

    public static int h(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        byte[] bArrO = o(i3);
        int i4 = i + 2;
        byte b2 = bArr[i4];
        if (b2 == 61) {
            bArr2[i2] = (byte) ((((bArrO[bArr[i + 1]] & 255) << 12) | ((bArrO[bArr[i]] & 255) << 18)) >>> 16);
            return 1;
        }
        int i5 = i + 3;
        byte b3 = bArr[i5];
        if (b3 == 61) {
            int i6 = ((bArrO[bArr[i + 1]] & 255) << 12) | ((bArrO[bArr[i]] & 255) << 18) | ((bArrO[b2] & 255) << 6);
            bArr2[i2] = (byte) (i6 >>> 16);
            bArr2[i2 + 1] = (byte) (i6 >>> 8);
            return 2;
        }
        try {
            int i7 = ((bArrO[b2] & 255) << 6) | ((bArrO[bArr[i]] & 255) << 18) | ((bArrO[bArr[i + 1]] & 255) << 12) | (bArrO[b3] & 255);
            bArr2[i2] = (byte) (i7 >> 16);
            bArr2[i2 + 1] = (byte) (i7 >> 8);
            bArr2[i2 + 2] = (byte) i7;
            return 3;
        } catch (Exception unused) {
            PrintStream printStream = System.out;
            printStream.println("" + ((int) bArr[i]) + ": " + ((int) bArrO[bArr[i]]));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            int i8 = i + 1;
            sb.append((int) bArr[i8]);
            sb.append(": ");
            sb.append((int) bArrO[bArr[i8]]);
            printStream.println(sb.toString());
            printStream.println("" + ((int) bArr[i4]) + ": " + ((int) bArrO[bArr[i4]]));
            printStream.println("" + ((int) bArr[i5]) + ": " + ((int) bArrO[bArr[i5]]));
            return -1;
        }
    }

    public static String i(byte[] bArr) {
        return l(bArr);
    }

    public static byte[] j(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] bArrN = n(i4);
        int i5 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        if (i2 == 1) {
            bArr2[i3] = bArrN[i5 >>> 18];
            bArr2[i3 + 1] = bArrN[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = Base64.padSymbol;
            bArr2[i3 + 3] = Base64.padSymbol;
            return bArr2;
        }
        if (i2 == 2) {
            bArr2[i3] = bArrN[i5 >>> 18];
            bArr2[i3 + 1] = bArrN[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = bArrN[(i5 >>> 6) & 63];
            bArr2[i3 + 3] = Base64.padSymbol;
            return bArr2;
        }
        if (i2 != 3) {
            return bArr2;
        }
        bArr2[i3] = bArrN[i5 >>> 18];
        bArr2[i3 + 1] = bArrN[(i5 >>> 12) & 63];
        bArr2[i3 + 2] = bArrN[(i5 >>> 6) & 63];
        bArr2[i3 + 3] = bArrN[i5 & 63];
        return bArr2;
    }

    public static byte[] k(byte[] bArr, byte[] bArr2, int i, int i2) {
        j(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    public static String l(byte[] bArr) {
        return m(bArr, 0, bArr.length, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0046: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:18:0x0046 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.io.OutputStream, java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static String m(byte[] bArr, int i, int i2, int i3) throws Throwable {
        int i4;
        a aVar;
        OutputStream outputStream;
        ?? gZIPOutputStream;
        int i5 = i3 & 8;
        ?? byteArrayOutputStream = i3 & 2;
        if (byteArrayOutputStream == 2) {
            OutputStream outputStream2 = null;
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        aVar = new a(byteArrayOutputStream, i3 | 1);
                        try {
                            gZIPOutputStream = new GZIPOutputStream(aVar);
                            try {
                                gZIPOutputStream.write(bArr, i, i2);
                                gZIPOutputStream.close();
                                try {
                                    gZIPOutputStream.close();
                                } catch (Exception unused) {
                                }
                                try {
                                    aVar.close();
                                } catch (Exception unused2) {
                                }
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused3) {
                                }
                                try {
                                    return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                                } catch (UnsupportedEncodingException unused4) {
                                    return new String(byteArrayOutputStream.toByteArray());
                                }
                            } catch (IOException e2) {
                                e = e2;
                                e.printStackTrace();
                                try {
                                    gZIPOutputStream.close();
                                } catch (Exception unused5) {
                                }
                                try {
                                    aVar.close();
                                } catch (Exception unused6) {
                                }
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused7) {
                                }
                                return null;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            gZIPOutputStream = 0;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                outputStream2.close();
                            } catch (Exception unused8) {
                            }
                            try {
                                aVar.close();
                            } catch (Exception unused9) {
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (Exception unused10) {
                                throw th;
                            }
                        }
                    } catch (IOException e4) {
                        e = e4;
                        aVar = null;
                        byteArrayOutputStream = byteArrayOutputStream;
                        gZIPOutputStream = aVar;
                        e.printStackTrace();
                        gZIPOutputStream.close();
                        aVar.close();
                        byteArrayOutputStream.close();
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outputStream2 = outputStream;
                }
            } catch (IOException e5) {
                e = e5;
                byteArrayOutputStream = 0;
                aVar = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = 0;
                aVar = null;
            }
        } else {
            boolean z = i5 == 0;
            int i6 = (i2 * 4) / 3;
            byte[] bArr2 = new byte[(i2 % 3 > 0 ? 4 : 0) + i6 + (z ? i6 / 76 : 0)];
            int i7 = i2 - 2;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < i7) {
                int i11 = i8;
                int i12 = i7;
                byte[] bArr3 = bArr2;
                j(bArr, i8 + i, 3, bArr2, i9, i3);
                int i13 = i10 + 4;
                if (z && i13 == 76) {
                    bArr3[i9 + 4] = 10;
                    i9++;
                    i10 = 0;
                } else {
                    i10 = i13;
                }
                i8 = i11 + 3;
                i9 += 4;
                bArr2 = bArr3;
                i7 = i12;
            }
            int i14 = i8;
            byte[] bArr4 = bArr2;
            if (i14 < i2) {
                int i15 = i2 - i14;
                j(bArr, i14 + i, i15, bArr4, i9, i3);
                if ((i3 & 16) != 16) {
                    i9 += 4;
                } else if (i15 == 0) {
                    i9++;
                } else if (i15 == 1) {
                    i9 += 2;
                } else if (i15 == 2) {
                    i9 += 3;
                }
            }
            int i16 = i9;
            try {
                i4 = 0;
                try {
                    return new String(bArr4, 0, i16, "UTF-8");
                } catch (UnsupportedEncodingException unused11) {
                    return new String(bArr4, i4, i16);
                }
            } catch (UnsupportedEncodingException unused12) {
                i4 = 0;
            }
        }
    }

    public static final byte[] n(int i) {
        if ((i & 16) == 16) {
            return c;
        }
        return (i & 32) == 32 ? e : f30973a;
    }

    public static final byte[] o(int i) {
        if ((i & 16) == 16) {
            return d;
        }
        return (i & 32) == 32 ? f : f30974b;
    }

    public static class a extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f30975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30976b;
        public byte[] c;
        public int d;
        public int e;
        public boolean f;
        public byte[] g;
        public boolean h;
        public int i;
        public byte[] j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f30977k;

        public a(OutputStream outputStream, int i) {
            super(outputStream);
            this.f = (i & 8) != 8;
            boolean z = (i & 1) == 1;
            this.f30975a = z;
            int i2 = z ? 3 : 4;
            this.d = i2;
            this.c = new byte[i2];
            this.f30976b = 0;
            this.e = 0;
            this.h = false;
            this.g = new byte[4];
            this.i = i;
            this.j = q12.n(i);
            this.f30977k = q12.o(i);
        }

        public void a() throws IOException {
            int i = this.f30976b;
            if (i > 0) {
                if (!this.f30975a) {
                    throw new IOException("Base64Coder input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(q12.k(this.g, this.c, i, this.i));
                this.f30976b = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a();
            super.close();
            this.c = null;
            ((FilterOutputStream) this).out = null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            if (this.h) {
                ((FilterOutputStream) this).out.write(i);
                return;
            }
            if (!this.f30975a) {
                byte b2 = this.f30977k[i & 127];
                if (b2 <= -5) {
                    if (b2 != -5) {
                        throw new IOException("Invalid character in Base64Coder data.");
                    }
                    return;
                }
                byte[] bArr = this.c;
                int i2 = this.f30976b;
                int i3 = i2 + 1;
                this.f30976b = i3;
                bArr[i2] = (byte) i;
                if (i3 >= this.d) {
                    ((FilterOutputStream) this).out.write(this.g, 0, q12.h(bArr, 0, this.g, 0, this.i));
                    this.f30976b = 0;
                    return;
                }
                return;
            }
            byte[] bArr2 = this.c;
            int i4 = this.f30976b;
            int i5 = i4 + 1;
            this.f30976b = i5;
            bArr2[i4] = (byte) i;
            int i6 = this.d;
            if (i5 >= i6) {
                ((FilterOutputStream) this).out.write(q12.k(this.g, bArr2, i6, this.i));
                int i7 = this.e + 4;
                this.e = i7;
                if (this.f && i7 >= 76) {
                    ((FilterOutputStream) this).out.write(10);
                    this.e = 0;
                }
                this.f30976b = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.h) {
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }
    }
}
