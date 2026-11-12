package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes14.dex */
class zzbn implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzbo zzc;

    public zzbn(zzbo zzboVar) {
        this.zzc = zzboVar;
        Collection collection = zzboVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        this.zzc.zze.zzb--;
        this.zzc.zzc();
    }

    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb == this.zzb) {
            return;
        }
        e.h();
    }

    public zzbn(zzbo zzboVar, Iterator it) {
        this.zzc = zzboVar;
        this.zzb = zzboVar.zzb;
        this.zza = it;
    }
}
