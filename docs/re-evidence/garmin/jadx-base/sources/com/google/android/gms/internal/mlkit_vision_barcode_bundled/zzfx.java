package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import c22.t;

/* JADX INFO: loaded from: classes14.dex */
final class zzfx extends zzcz {
    final zzgb zza;
    zzdb zzb = zzb();
    final /* synthetic */ zzgd zzc;

    public zzfx(zzgd zzgdVar) {
        this.zzc = zzgdVar;
        this.zza = new zzgb(zzgdVar, null);
    }

    private final zzdb zzb() {
        zzgb zzgbVar = this.zza;
        if (zzgbVar.hasNext()) {
            return zzgbVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte zza() {
        zzdb zzdbVar = this.zzb;
        if (zzdbVar == null) {
            t.g();
            return (byte) 0;
        }
        byte bZza = zzdbVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
