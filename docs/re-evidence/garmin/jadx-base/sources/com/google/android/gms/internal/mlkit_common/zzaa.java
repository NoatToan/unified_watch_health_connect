package com.google.android.gms.internal.mlkit_common;

import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class zzaa {
    public static int zza(int i14, int i15) {
        if (i15 < 0) {
            h.q("cannot store more than MAX_VALUE elements");
            return 0;
        }
        int i16 = i14 + (i14 >> 1) + 1;
        if (i16 < i15) {
            int iHighestOneBit = Integer.highestOneBit(i15 - 1);
            i16 = iHighestOneBit + iHighestOneBit;
        }
        if (i16 < 0) {
            return Integer.MAX_VALUE;
        }
        return i16;
    }
}
