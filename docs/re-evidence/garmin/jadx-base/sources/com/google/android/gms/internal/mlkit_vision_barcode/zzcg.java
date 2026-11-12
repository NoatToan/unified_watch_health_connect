package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
final class zzcg extends zzbs {
    final /* synthetic */ zzci zza;
    private final Object zzb;
    private int zzc;

    public zzcg(zzci zzciVar, int i14) {
        this.zza = zzciVar;
        this.zzb = zzci.zzg(zzciVar, i14);
        this.zzc = i14;
    }

    private final void zza() {
        int i14 = this.zzc;
        if (i14 == -1 || i14 >= this.zza.size() || !zzax.zza(this.zzb, zzci.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzw(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbs, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbs, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.zzb);
        }
        zza();
        int i14 = this.zzc;
        if (i14 == -1) {
            return null;
        }
        return zzci.zzj(this.zza, i14);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbs, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.zzb, obj);
        }
        zza();
        int i14 = this.zzc;
        zzci zzciVar = this.zza;
        if (i14 == -1) {
            zzciVar.put(this.zzb, obj);
            return null;
        }
        Object objZzj = zzci.zzj(zzciVar, i14);
        zzci.zzn(zzciVar, this.zzc, obj);
        return objZzj;
    }
}
