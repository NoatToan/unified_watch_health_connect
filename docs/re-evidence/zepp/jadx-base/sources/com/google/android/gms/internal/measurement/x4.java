package com.google.android.gms.internal.measurement;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;

/* JADX INFO: loaded from: classes3.dex */
final class x4 {
    public static /* synthetic */ void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzkh {
        if (e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || e(b3) || e(b4)) {
            throw zzkh.c();
        }
        int i2 = ((b & 7) << 18) | ((b2 & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY) << 12) | ((b3 & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY) << 6) | (b4 & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    public static /* synthetic */ void b(byte b, byte b2, char[] cArr, int i) throws zzkh {
        if (b < -62 || e(b2)) {
            throw zzkh.c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    /* JADX WARN: Code duplicated, block: B:12:0x0018 A[PHI: r2
      0x0018: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0012, B:11:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    public static /* synthetic */ void c(byte b, byte b2, byte b3, char[] cArr, int i) throws zzkh {
        if (!e(b2)) {
            if (b != -32) {
                if (b != -19) {
                    if (!e(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY) << 6) | (b3 & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!e(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY) << 6) | (b3 & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY));
                        return;
                    }
                }
            } else if (b2 >= -96) {
                b = MiLiProProfile.ECF_COMMAND_SET_SPORT_TYPE_SORT;
                if (b != -19) {
                    if (!e(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY) << 6) | (b3 & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!e(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY) << 6) | (b3 & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY));
                        return;
                    }
                }
            }
        }
        throw zzkh.c();
    }

    public static /* synthetic */ boolean d(byte b) {
        return b >= 0;
    }

    private static boolean e(byte b) {
        return b > -65;
    }
}
