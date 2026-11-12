package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
class zzj extends zzk {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzj(int i14) {
    }

    private final void zzb(int i14) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i14) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i15 = length + (length >> 1) + 1;
        if (i15 < i14) {
            int iHighestOneBit = Integer.highestOneBit(i14 - 1);
            i15 = iHighestOneBit + iHighestOneBit;
        }
        if (i15 < 0) {
            i15 = Integer.MAX_VALUE;
        }
        this.zza = Arrays.copyOf(objArr, i15);
        this.zzc = false;
    }

    public final zzj zza(Object obj) {
        obj.getClass();
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i14 = this.zzb;
        this.zzb = i14 + 1;
        objArr[i14] = obj;
        return this;
    }
}
