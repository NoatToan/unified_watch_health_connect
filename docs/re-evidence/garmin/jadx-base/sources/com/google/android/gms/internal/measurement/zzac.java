package com.google.android.gms.internal.measurement;

import c22.t;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzac implements Iterator {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ Iterator zzb;

    public zzac(zzae zzaeVar, Iterator it, Iterator it3) {
        this.zza = it;
        this.zzb = it3;
        Objects.requireNonNull(zzaeVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza.hasNext()) {
            return true;
        }
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.zza;
        if (it.hasNext()) {
            return new zzas(((Integer) it.next()).toString());
        }
        Iterator it3 = this.zzb;
        if (it3.hasNext()) {
            return new zzas((String) it3.next());
        }
        t.g();
        return null;
    }
}
