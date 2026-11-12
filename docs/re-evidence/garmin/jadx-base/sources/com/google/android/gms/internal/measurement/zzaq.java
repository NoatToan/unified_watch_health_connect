package com.google.android.gms.internal.measurement;

import c22.t;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzaq implements Iterator {
    final /* synthetic */ zzas zza;
    private int zzb;

    public zzaq(zzas zzasVar) {
        Objects.requireNonNull(zzasVar);
        this.zza = zzasVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzb().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String strZzb = this.zza.zzb();
        int i14 = this.zzb;
        if (i14 < strZzb.length()) {
            this.zzb = i14 + 1;
            return new zzas(String.valueOf(i14));
        }
        t.g();
        return null;
    }
}
