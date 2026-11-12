package com.google.android.gms.internal.measurement;

import j20.x;
import java.util.Iterator;
import java.util.Objects;
import n23.j;

/* JADX INFO: loaded from: classes14.dex */
final class zzad implements Iterator {
    final /* synthetic */ zzae zza;
    private int zzb;

    public zzad(zzae zzaeVar) {
        Objects.requireNonNull(zzaeVar);
        this.zza = zzaeVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzh();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        zzae zzaeVar = this.zza;
        int i14 = this.zzb;
        int iZzh = zzaeVar.zzh();
        int i15 = this.zzb;
        if (i14 < iZzh) {
            this.zzb = i15 + 1;
            return zzaeVar.zzl(i15);
        }
        j.s(x.e(new StringBuilder(String.valueOf(i15).length() + 21), i15, "Out of bounds index: "));
        return null;
    }
}
