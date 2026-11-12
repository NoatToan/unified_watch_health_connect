package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzgk implements Iterator {
    final /* synthetic */ zzgo zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i14 = this.zzb + 1;
        zzgo zzgoVar = this.zza;
        if (i14 >= zzgoVar.zzb) {
            return !zzgoVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i14 = this.zzb + 1;
        this.zzb = i14;
        zzgo zzgoVar = this.zza;
        return i14 < zzgoVar.zzb ? (zzgi) zzgoVar.zza[i14] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            h.z("remove() was called before next()");
            return;
        }
        this.zzc = false;
        this.zza.zzo();
        int i14 = this.zzb;
        zzgo zzgoVar = this.zza;
        if (i14 >= zzgoVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i14 - 1;
            zzgoVar.zzm(i14);
        }
    }
}
