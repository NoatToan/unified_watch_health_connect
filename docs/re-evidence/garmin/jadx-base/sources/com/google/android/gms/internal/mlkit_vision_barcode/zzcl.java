package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
class zzcl extends zzcm {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzcl(int i14) {
    }

    private final void zzd(int i14) {
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

    public final zzcl zza(Object obj) {
        obj.getClass();
        zzd(this.zzb + 1);
        Object[] objArr = this.zza;
        int i14 = this.zzb;
        this.zzb = i14 + 1;
        objArr[i14] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcm
    public /* bridge */ /* synthetic */ zzcm zzb(Object obj) {
        throw null;
    }

    public final zzcm zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzd(collection.size() + this.zzb);
            if (collection instanceof zzcn) {
                this.zzb = ((zzcn) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
        return this;
    }
}
