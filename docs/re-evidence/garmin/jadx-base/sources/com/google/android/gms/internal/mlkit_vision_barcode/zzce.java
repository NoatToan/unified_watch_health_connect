package com.google.android.gms.internal.mlkit_vision_barcode;

import c22.t;
import java.util.Iterator;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes14.dex */
abstract class zzce implements Iterator {
    int zzb;
    int zzc;
    int zzd = -1;
    final /* synthetic */ zzci zze;

    public /* synthetic */ zzce(zzci zzciVar, zzcd zzcdVar) {
        this.zze = zzciVar;
        this.zzb = zzciVar.zzf;
        this.zzc = zzciVar.zze();
    }

    private final void zzb() {
        if (this.zze.zzf == this.zzb) {
            return;
        }
        e.h();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            t.g();
            return null;
        }
        int i14 = this.zzc;
        this.zzd = i14;
        Object objZza = zza(i14);
        this.zzc = this.zze.zzf(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzaz.zzf(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i14 = this.zzd;
        zzci zzciVar = this.zze;
        zzciVar.remove(zzci.zzg(zzciVar, i14));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i14);
}
