package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.nio.charset.Charset;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes.dex */
public class v12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f36365a = au3.f3449b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f36366b = {HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, APDUConstants.TAG_MORE_DATA, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE};
    public static final byte[] c = {HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, APDUConstants.TAG_MORE_DATA, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, 45, 95};

    public static String a(byte[] bArr) {
        return lio.F0(b(bArr, false), f36365a);
    }

    public static byte[] b(byte[] bArr, boolean z) {
        return c(bArr, z, false);
    }

    public static byte[] c(byte[] bArr, boolean z, boolean z2) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        if (length == 0) {
            return new byte[0];
        }
        int i = (length / 3) * 3;
        int i2 = length - 1;
        int i3 = ((i2 / 3) + 1) << 2;
        int i4 = i3 + (z ? ((i3 - 1) / 76) << 1 : 0);
        byte[] bArr2 = new byte[i4];
        byte[] bArr3 = z2 ? c : f36366b;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < i) {
            int i8 = i5 + 2;
            int i9 = ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5] & 255) << 16);
            i5 += 3;
            int i10 = i9 | (bArr[i8] & 255);
            bArr2[i6] = bArr3[(i10 >>> 18) & 63];
            bArr2[i6 + 1] = bArr3[(i10 >>> 12) & 63];
            bArr2[i6 + 2] = bArr3[(i10 >>> 6) & 63];
            int i11 = i6 + 4;
            bArr2[i6 + 3] = bArr3[i10 & 63];
            if (z && (i7 = i7 + 1) == 19 && i11 < i4 - 2) {
                int i12 = i6 + 5;
                bArr2[i11] = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                i6 += 6;
                bArr2[i12] = 10;
                i7 = 0;
            } else {
                i6 = i11;
            }
        }
        int i13 = length - i;
        if (i13 > 0) {
            int i14 = (i13 == 2 ? (bArr[i2] & 255) << 2 : 0) | ((bArr[i] & 255) << 10);
            bArr2[i4 - 4] = bArr3[i14 >> 12];
            bArr2[i4 - 3] = bArr3[(i14 >>> 6) & 63];
            if (z2) {
                int i15 = i4 - 2;
                if (2 == i13) {
                    bArr2[i15] = bArr3[i14 & 63];
                    i15 = i4 - 1;
                }
                byte[] bArr4 = new byte[i15];
                System.arraycopy(bArr2, 0, bArr4, 0, i15);
                return bArr4;
            }
            bArr2[i4 - 2] = i13 == 2 ? bArr3[i14 & 63] : (byte) 61;
            bArr2[i4 - 1] = Base64.padSymbol;
        }
        return bArr2;
    }

    public static String d(byte[] bArr, boolean z, boolean z2) {
        return lio.F0(c(bArr, z, z2), f36365a);
    }

    public static String e(byte[] bArr) {
        return lio.F0(f(bArr, false), f36365a);
    }

    public static byte[] f(byte[] bArr, boolean z) {
        return c(bArr, z, true);
    }
}
