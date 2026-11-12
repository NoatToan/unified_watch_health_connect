package defpackage;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public class x1t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f38592a = {HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, APDUConstants.TAG_MORE_DATA, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f38593b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, -9, -9, -9, 63, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 59, 60, Base64.padSymbol, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_PAI, HMProSyncDataBaseProfile.DATA_TYPE_COACHING, 15, 16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR, HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC, 31, 32, SettingsModule.VALUE_TYPE_STRING_ENUM, 34, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, HMProSyncDataBaseProfile.DATA_SPO2_POINT, HMProSyncDataBaseProfile.DATA_SPO2_OSA, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT, HMProSyncDataBaseProfile.DATA_SPO2_ODI, HMProSyncDataBaseProfile.DATA_STAND_HOUR, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 45, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    public static final byte[] c = {HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, APDUConstants.TAG_MORE_DATA, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, 45, 95};
    public static final byte[] d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, -9, -9, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 59, 60, Base64.padSymbol, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_PAI, HMProSyncDataBaseProfile.DATA_TYPE_COACHING, 15, 16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR, HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC, 31, 32, SettingsModule.VALUE_TYPE_STRING_ENUM, 34, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, HMProSyncDataBaseProfile.DATA_SPO2_POINT, HMProSyncDataBaseProfile.DATA_SPO2_OSA, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT, HMProSyncDataBaseProfile.DATA_SPO2_ODI, HMProSyncDataBaseProfile.DATA_STAND_HOUR, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 45, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    public static final byte[] e = {45, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, APDUConstants.TAG_MORE_DATA, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    public static final byte[] f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_PAI, HMProSyncDataBaseProfile.DATA_TYPE_COACHING, 15, 16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, 26, 27, 28, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR, HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC, 31, 32, SettingsModule.VALUE_TYPE_STRING_ENUM, 34, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, -9, -9, -9, -9, HMProSyncDataBaseProfile.DATA_SPO2_POINT, -9, HMProSyncDataBaseProfile.DATA_SPO2_OSA, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT, HMProSyncDataBaseProfile.DATA_SPO2_ODI, HMProSyncDataBaseProfile.DATA_STAND_HOUR, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 45, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 59, 60, Base64.padSymbol, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    public static final /* synthetic */ boolean g = true;

    public static String a(byte[] bArr) {
        String strB;
        try {
            strB = b(bArr, bArr.length);
        } catch (IOException e2) {
            if (!g) {
                throw new AssertionError(e2.getMessage());
            }
            strB = null;
        }
        if (g || strB != null) {
            return strB;
        }
        throw new AssertionError();
    }

    public static String b(byte[] bArr, int i) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Cannot have length offset: ".concat(String.valueOf(i)));
        }
        if (i > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", 0, Integer.valueOf(i), Integer.valueOf(bArr.length)));
        }
        int i2 = ((i / 3) * 4) + (i % 3 <= 0 ? 0 : 4);
        byte[] bArr2 = new byte[i2];
        int i3 = i - 2;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            d(bArr, i4, 3, bArr2, i5);
            i4 += 3;
            i5 += 4;
        }
        if (i4 < i) {
            d(bArr, i4, i - i4, bArr2, i5);
            i5 += 4;
        }
        if (i5 <= i2 - 1) {
            byte[] bArr3 = new byte[i5];
            System.arraycopy(bArr2, 0, bArr3, 0, i5);
            bArr2 = bArr3;
        }
        try {
            return new String(bArr2, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr2);
        }
    }

    public static byte[] c(String str) throws IOException {
        return e(str);
    }

    public static byte[] d(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3 = f38592a;
        int i4 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        if (i2 == 1) {
            bArr2[i3] = bArr3[i4 >>> 18];
            bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
            bArr2[i3 + 2] = Base64.padSymbol;
            bArr2[i3 + 3] = Base64.padSymbol;
            return bArr2;
        }
        if (i2 == 2) {
            bArr2[i3] = bArr3[i4 >>> 18];
            bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i4 >>> 6) & 63];
            bArr2[i3 + 3] = Base64.padSymbol;
            return bArr2;
        }
        if (i2 != 3) {
            return bArr2;
        }
        bArr2[i3] = bArr3[i4 >>> 18];
        bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
        bArr2[i3 + 2] = bArr3[(i4 >>> 6) & 63];
        bArr2[i3 + 3] = bArr3[i4 & 63];
        return bArr2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:49:0x0055
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static byte[] e(java.lang.String r6) throws java.io.IOException {
        /*
            if (r6 == 0) goto L84
            java.lang.String r0 = "US-ASCII"
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L9
            goto Ld
        L9:
            byte[] r6 = r6.getBytes()
        Ld:
            int r0 = r6.length
            byte[] r6 = f(r6, r0)
            int r0 = r6.length
            r1 = 4
            if (r0 < r1) goto L83
            r0 = 0
            r1 = r6[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 1
            r2 = r6[r2]
            int r2 = r2 << 8
            r3 = 65280(0xff00, float:9.1477E-41)
            r2 = r2 & r3
            r1 = r1 | r2
            r2 = 35615(0x8b1f, float:4.9907E-41)
            if (r2 != r1) goto L83
            r1 = 2048(0x800, float:2.87E-42)
            byte[] r1 = new byte[r1]
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6e
            r3.<init>()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6e
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L66
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L66
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5f
        L3e:
            int r2 = r5.read(r1)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            if (r2 < 0) goto L4e
            r3.write(r1, r0, r2)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            goto L3e
        L48:
            r6 = move-exception
        L49:
            r2 = r3
            goto L79
        L4b:
            r0 = move-exception
        L4c:
            r2 = r3
            goto L71
        L4e:
            byte[] r6 = r3.toByteArray()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            r3.close()     // Catch: java.lang.Exception -> L55
        L55:
            r5.close()     // Catch: java.lang.Exception -> L58
        L58:
            r4.close()     // Catch: java.lang.Exception -> L83
            goto L83
        L5c:
            r6 = move-exception
            r5 = r2
            goto L49
        L5f:
            r0 = move-exception
            r5 = r2
            goto L4c
        L62:
            r6 = move-exception
            r4 = r2
            r5 = r4
            goto L49
        L66:
            r0 = move-exception
            r4 = r2
            r5 = r4
            goto L4c
        L6a:
            r6 = move-exception
            r4 = r2
            r5 = r4
            goto L79
        L6e:
            r0 = move-exception
            r4 = r2
            r5 = r4
        L71:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L78
            r2.close()     // Catch: java.lang.Exception -> L55
            goto L55
        L78:
            r6 = move-exception
        L79:
            r2.close()     // Catch: java.lang.Exception -> L7c
        L7c:
            r5.close()     // Catch: java.lang.Exception -> L7f
        L7f:
            r4.close()     // Catch: java.lang.Exception -> L82
        L82:
            throw r6
        L83:
            return r6
        L84:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "Input string was null."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1t.e(java.lang.String):byte[]");
    }

    public static byte[] f(byte[] bArr, int i) throws IOException {
        int i2;
        int i3;
        if (bArr == null) {
            throw new NullPointerException("Cannot decode null source array.");
        }
        if (i > bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        if (i == 0) {
            return new byte[0];
        }
        if (i < 4) {
            throw new IllegalArgumentException("Base64Util-encoded string must have at least four characters, but length specified was ".concat(String.valueOf(i)));
        }
        byte[] bArr2 = f38593b;
        int i4 = (i * 3) / 4;
        byte[] bArr3 = new byte[i4];
        byte[] bArr4 = new byte[4];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i; i7++) {
            byte b2 = bArr[i7];
            byte b3 = bArr2[b2 & 255];
            if (b3 < -5) {
                throw new IOException(String.format("Bad Base64Util input character decimal %d in array position %d", Integer.valueOf(bArr[i7] & 255), Integer.valueOf(i7)));
            }
            if (b3 >= -1) {
                int i8 = i5 + 1;
                bArr4[i5] = b2;
                if (i8 <= 3) {
                    i5 = i8;
                } else {
                    if (i6 < 0 || (i2 = i6 + 2) >= i4) {
                        throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(i4), Integer.valueOf(i6)));
                    }
                    byte[] bArr5 = f38593b;
                    byte b4 = bArr4[2];
                    if (b4 == 61) {
                        bArr3[i6] = (byte) ((((bArr5[bArr4[0]] & 255) << 18) | ((bArr5[bArr4[1]] & 255) << 12)) >>> 16);
                        i3 = 1;
                    } else {
                        byte b5 = bArr4[3];
                        if (b5 == 61) {
                            int i9 = ((bArr5[bArr4[0]] & 255) << 18) | ((bArr5[bArr4[1]] & 255) << 12) | ((bArr5[b4] & 255) << 6);
                            bArr3[i6] = (byte) (i9 >>> 16);
                            bArr3[i6 + 1] = (byte) (i9 >>> 8);
                            i3 = 2;
                        } else {
                            int i10 = ((bArr5[bArr4[0]] & 255) << 18) | ((bArr5[bArr4[1]] & 255) << 12) | ((bArr5[b4] & 255) << 6) | (bArr5[b5] & 255);
                            bArr3[i6] = (byte) (i10 >> 16);
                            bArr3[i6 + 1] = (byte) (i10 >> 8);
                            bArr3[i2] = (byte) i10;
                            i3 = 3;
                        }
                    }
                    i6 += i3;
                    if (bArr[i7] == 61) {
                        break;
                    }
                    i5 = 0;
                }
            }
        }
        byte[] bArr6 = new byte[i6];
        System.arraycopy(bArr3, 0, bArr6, 0, i6);
        return bArr6;
    }
}
