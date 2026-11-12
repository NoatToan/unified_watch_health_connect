package defpackage;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes5.dex */
public final class gs5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f19291a = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    public static ts5 a(byte[] bArr, int i) {
        String strH;
        StringBuilder sb = new StringBuilder(144);
        if (i == 2 || i == 3) {
            if (i == 2) {
                strH = new DecimalFormat("0000000000".substring(0, g(bArr))).format(f(bArr));
            } else {
                strH = h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String str = decimalFormat.format(c(bArr));
            String str2 = decimalFormat.format(i(bArr));
            sb.append(e(bArr, 10, 84));
            if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                sb.insert(9, strH + (char) 29 + str + (char) 29 + str2 + (char) 29);
            } else {
                sb.insert(0, strH + (char) 29 + str + (char) 29 + str2 + (char) 29);
            }
        } else if (i == 4) {
            sb.append(e(bArr, 1, 93));
        } else if (i == 5) {
            sb.append(e(bArr, 1, 77));
        }
        return new ts5(bArr, sb.toString(), null, String.valueOf(i));
    }

    public static int b(int i, byte[] bArr) {
        int i2 = i - 1;
        return ((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0 ? 0 : 1;
    }

    public static int c(byte[] bArr) {
        return d(bArr, new byte[]{HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 45, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE, 48, HMProSyncDataBaseProfile.DATA_SPO2_POINT, HMProSyncDataBaseProfile.DATA_SPO2_OSA});
    }

    public static int d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            throw new IllegalArgumentException();
        }
        int iB = 0;
        for (int i = 0; i < bArr2.length; i++) {
            iB += b(bArr2[i], bArr) << ((bArr2.length - i) - 1);
        }
        return iB;
    }

    public static String e(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = i;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        while (i3 < i + i2) {
            char cCharAt = f19291a[i5].charAt(bArr[i3]);
            switch (cCharAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i6 = i5;
                    i5 = cCharAt - 65520;
                    i4 = 1;
                    break;
                case 65525:
                    i4 = 2;
                    i6 = i5;
                    i5 = 0;
                    break;
                case 65526:
                    i4 = 3;
                    i6 = i5;
                    i5 = 0;
                    break;
                case 65527:
                    i4 = -1;
                    i5 = 0;
                    break;
                case 65528:
                    i4 = -1;
                    i5 = 1;
                    break;
                case 65529:
                    i4 = -1;
                    break;
                case 65530:
                default:
                    sb.append(cCharAt);
                    break;
                case 65531:
                    int i7 = (bArr[i3 + 1] << 24) + (bArr[i3 + 2] << HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE) + (bArr[i3 + 3] << AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT) + (bArr[i3 + 4] << 6);
                    i3 += 5;
                    sb.append(new DecimalFormat("000000000").format(i7 + bArr[i3]));
                    break;
            }
            int i8 = i4 - 1;
            if (i4 == 0) {
                i5 = i6;
            }
            i3++;
            i4 = i8;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static int f(byte[] bArr) {
        return d(bArr, new byte[]{SettingsModule.VALUE_TYPE_STRING_ENUM, 34, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, 25, 26, 27, 28, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR, HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, HMProSyncDataBaseProfile.DATA_TYPE_PAI, HMProSyncDataBaseProfile.DATA_TYPE_COACHING, 15, 16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, 7, 8, 9, 10, 11, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 1, 2});
    }

    public static int g(byte[] bArr) {
        return d(bArr, new byte[]{HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT, HMProSyncDataBaseProfile.DATA_SPO2_ODI, HMProSyncDataBaseProfile.DATA_STAND_HOUR, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, 31, 32});
    }

    public static String h(byte[] bArr) {
        String[] strArr = f19291a;
        return String.valueOf(new char[]{strArr[0].charAt(d(bArr, new byte[]{HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT, HMProSyncDataBaseProfile.DATA_SPO2_ODI, HMProSyncDataBaseProfile.DATA_STAND_HOUR, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, 31, 32})), strArr[0].charAt(d(bArr, new byte[]{SettingsModule.VALUE_TYPE_STRING_ENUM, 34, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, 25, 26})), strArr[0].charAt(d(bArr, new byte[]{27, 28, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR, HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20})), strArr[0].charAt(d(bArr, new byte[]{21, 22, 23, 24, HMProSyncDataBaseProfile.DATA_TYPE_PAI, HMProSyncDataBaseProfile.DATA_TYPE_COACHING})), strArr[0].charAt(d(bArr, new byte[]{15, 16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, 7, 8})), strArr[0].charAt(d(bArr, new byte[]{9, 10, 11, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 1, 2}))});
    }

    public static int i(byte[] bArr) {
        return d(bArr, new byte[]{HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 59, 60, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG});
    }
}
