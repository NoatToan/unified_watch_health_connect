package com.google.android.gms.internal.common;

import java.util.Arrays;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzaa(int i14) {
    }

    public final zzaa zza(Object obj) {
        int i14;
        obj.getClass();
        int length = this.zza.length;
        int i15 = this.zzb;
        int i16 = i15 + 1;
        if (i16 < 0) {
            h.s("cannot store more than Integer.MAX_VALUE elements");
            return null;
        }
        if (i16 <= length) {
            i14 = length;
        } else {
            i14 = (length >> 1) + length + 1;
            if (i14 < i16) {
                int iHighestOneBit = Integer.highestOneBit(i15);
                i14 = iHighestOneBit + iHighestOneBit;
            }
            if (i14 < 0) {
                i14 = Integer.MAX_VALUE;
            }
        }
        if (i14 > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, i14);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i17 = this.zzb;
        this.zzb = i17 + 1;
        objArr[i17] = obj;
        return this;
    }
}
