package com.google.android.gms.internal.maps;

import c22.t;

/* JADX INFO: loaded from: classes14.dex */
final class zzbp extends zzbz {
    private final Object zza;
    private boolean zzb;

    public zzbp(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zzb) {
            t.g();
            return null;
        }
        this.zzb = true;
        return this.zza;
    }
}
