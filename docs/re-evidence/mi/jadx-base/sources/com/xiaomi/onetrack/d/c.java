package com.xiaomi.onetrack.d;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.onetrack.util.p;
import java.io.UnsupportedEncodingException;
import kotlin.io.encoding.Base64;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13864a = "Base64Util";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f13865b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static byte[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, -1, -1, -1, 63, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 59, 60, Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_PAI, HMProSyncDataBaseProfile.DATA_TYPE_COACHING, 15, 16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR, HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC, 31, 32, SettingsModule.VALUE_TYPE_STRING_ENUM, 34, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, HMProSyncDataBaseProfile.DATA_SPO2_POINT, HMProSyncDataBaseProfile.DATA_SPO2_OSA, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT, HMProSyncDataBaseProfile.DATA_SPO2_ODI, HMProSyncDataBaseProfile.DATA_STAND_HOUR, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 45, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, -1, -1, -1, -1, -1};

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            byte b2 = bArr[i];
            int i3 = b2 & 255;
            if (i2 == length) {
                stringBuffer.append(f13865b[i3 >>> 2]);
                stringBuffer.append(f13865b[(b2 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i4 = i + 2;
            byte b3 = bArr[i2];
            if (i4 == length) {
                stringBuffer.append(f13865b[i3 >>> 2]);
                stringBuffer.append(f13865b[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
                stringBuffer.append(f13865b[(b3 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            i += 3;
            byte b4 = bArr[i4];
            stringBuffer.append(f13865b[i3 >>> 2]);
            stringBuffer.append(f13865b[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
            stringBuffer.append(f13865b[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
            stringBuffer.append(f13865b[b4 & 63]);
        }
        return stringBuffer.toString();
    }

    private static byte[] b(String str) throws UnsupportedEncodingException {
        int i;
        byte b2;
        int i2;
        byte b3;
        int i3;
        byte b4;
        int i4;
        byte b5;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bytes = str.getBytes("US-ASCII");
        int length = bytes.length;
        int i5 = 0;
        while (i5 < length) {
            while (true) {
                i = i5 + 1;
                b2 = c[bytes[i5]];
                if (i >= length || b2 != -1) {
                    break;
                }
                i5 = i;
            }
            if (b2 == -1) {
                break;
            }
            while (true) {
                i2 = i + 1;
                b3 = c[bytes[i]];
                if (i2 >= length || b3 != -1) {
                    break;
                }
                i = i2;
            }
            if (b3 == -1) {
                break;
            }
            stringBuffer.append((char) ((b2 << 2) | ((b3 & 48) >>> 4)));
            while (true) {
                i3 = i2 + 1;
                byte b6 = bytes[i2];
                if (b6 == 61) {
                    return stringBuffer.toString().getBytes("iso8859-1");
                }
                b4 = c[b6];
                if (i3 >= length || b4 != -1) {
                    break;
                }
                i2 = i3;
            }
            if (b4 == -1) {
                break;
            }
            stringBuffer.append((char) (((b3 & 15) << 4) | ((b4 & 60) >>> 2)));
            while (true) {
                i4 = i3 + 1;
                byte b7 = bytes[i3];
                if (b7 == 61) {
                    return stringBuffer.toString().getBytes("iso8859-1");
                }
                b5 = c[b7];
                if (i4 >= length || b5 != -1) {
                    break;
                }
                i3 = i4;
            }
            if (b5 == -1) {
                break;
            }
            stringBuffer.append((char) (b5 | ((b4 & 3) << 6)));
            i5 = i4;
        }
        return stringBuffer.toString().getBytes("iso8859-1");
    }

    public static byte[] a(String str) {
        try {
            return b(str);
        } catch (UnsupportedEncodingException e) {
            p.b(p.a(f13864a), "decode e", e);
            return new byte[0];
        }
    }

    public static byte[] a() {
        return new byte[]{84, 123, 100, 101, 118, SettingsModule.VALUE_TYPE_STRING_ENUM, SettingsModule.VALUE_TYPE_FLAG, 100, 101, 116, 116, HMProSyncDataBaseProfile.DATA_SPO2_POINT, 94, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, 77, 73};
    }
}
