package com.google.android.gms.common;

/* JADX INFO: loaded from: classes14.dex */
final class zzz {
    public static int zza(int i14) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i15 = 0; i15 < 6; i15++) {
            int i16 = iArr[i15];
            int i17 = i16 - 1;
            if (i16 == 0) {
                throw null;
            }
            if (i17 == i14) {
                return i16;
            }
        }
        return 1;
    }
}
