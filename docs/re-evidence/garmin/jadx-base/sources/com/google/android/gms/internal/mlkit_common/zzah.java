package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzah {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzag zzc;

    public final zzah zza(Object obj, Object obj2) {
        int i14 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i15 = i14 + i14;
        if (i15 > length) {
            this.zza = Arrays.copyOf(objArr, zzaa.zza(length, i15));
        }
        zzw.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i16 = this.zzb;
        int i17 = i16 + i16;
        objArr2[i17] = obj;
        objArr2[i17 + 1] = obj2;
        this.zzb = i16 + 1;
        return this;
    }

    public final zzai zzb() {
        zzag zzagVar = this.zzc;
        if (zzagVar != null) {
            throw zzagVar.zza();
        }
        zzaq zzaqVarZzg = zzaq.zzg(this.zzb, this.zza, this);
        zzag zzagVar2 = this.zzc;
        if (zzagVar2 == null) {
            return zzaqVarZzg;
        }
        throw zzagVar2.zza();
    }
}
