package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import c22.t;

/* JADX INFO: loaded from: classes14.dex */
final class zzcy extends zzcz {
    final /* synthetic */ zzdf zza;
    private int zzb = 0;
    private final int zzc;

    public zzcy(zzdf zzdfVar) {
        this.zza = zzdfVar;
        this.zzc = zzdfVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte zza() {
        int i14 = this.zzb;
        if (i14 < this.zzc) {
            this.zzb = i14 + 1;
            return this.zza.zzb(i14);
        }
        t.g();
        return (byte) 0;
    }
}
