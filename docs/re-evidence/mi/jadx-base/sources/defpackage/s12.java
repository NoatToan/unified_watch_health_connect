package defpackage;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.nio.charset.Charset;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes.dex */
public class s12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f33149a = au3.f3449b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f33150b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, -1, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, -1, 63, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, 59, 60, Base64.padSymbol, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_PAI, HMProSyncDataBaseProfile.DATA_TYPE_COACHING, 15, 16, 17, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR, HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC, 31, 32, SettingsModule.VALUE_TYPE_STRING_ENUM, 34, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE, HMProSyncDataBaseProfile.DATA_SPO2_POINT, HMProSyncDataBaseProfile.DATA_SPO2_OSA, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT, HMProSyncDataBaseProfile.DATA_SPO2_ODI, HMProSyncDataBaseProfile.DATA_STAND_HOUR, HMProSyncDataBaseProfile.DATA_TYPE_ECG_SUMMARY, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 45, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51};

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33151a;

        public a(int i) {
            this.f33151a = i;
        }
    }

    public static byte[] a(CharSequence charSequence) {
        return b(tt3.g(charSequence, f33149a));
    }

    public static byte[] b(byte[] bArr) {
        return p8i.c(bArr) ? bArr : c(bArr, 0, bArr.length);
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        if (p8i.c(bArr)) {
            return bArr;
        }
        a aVar = new a(i);
        int i3 = (i + i2) - 1;
        int i4 = (i2 * 3) / 4;
        byte[] bArr2 = new byte[i4];
        int i5 = 0;
        while (aVar.f33151a <= i3) {
            byte bD = d(bArr, aVar, i3);
            byte bD2 = d(bArr, aVar, i3);
            byte bD3 = d(bArr, aVar, i3);
            byte bD4 = d(bArr, aVar, i3);
            if (-2 != bD2) {
                bArr2[i5] = (byte) ((bD << 2) | (bD2 >>> 4));
                i5++;
            }
            if (-2 != bD3) {
                bArr2[i5] = (byte) (((bD2 & 15) << 4) | (bD3 >>> 2));
                i5++;
            }
            if (-2 != bD4) {
                bArr2[i5] = (byte) (((bD3 & 3) << 6) | bD4);
                i5++;
            }
        }
        return i5 == i4 ? bArr2 : (byte[]) qj1.p(bArr2, new byte[i5], i5);
    }

    public static byte d(byte[] bArr, a aVar, int i) {
        byte b2;
        while (true) {
            int i2 = aVar.f33151a;
            if (i2 > i) {
                return (byte) -2;
            }
            aVar.f33151a = i2 + 1;
            byte b3 = bArr[i2];
            if (b3 > -1 && (b2 = f33150b[b3]) > -1) {
                return b2;
            }
        }
    }
}
