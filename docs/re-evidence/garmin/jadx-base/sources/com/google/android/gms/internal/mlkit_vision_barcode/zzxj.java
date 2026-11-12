package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes14.dex */
final class zzxj implements zzeh {
    final /* synthetic */ zzrc zza;
    final /* synthetic */ float zzb;
    final /* synthetic */ zzxn zzc;
    final /* synthetic */ float zzd;
    final /* synthetic */ zzxk zze;

    public zzxj(zzxk zzxkVar, zzrc zzrcVar, float f14, zzxn zzxnVar, float f15) {
        this.zza = zzrcVar;
        this.zzb = f14;
        this.zzc = zzxnVar;
        this.zzd = f15;
        this.zze = zzxkVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeh
    public final void zza(Throwable th3) {
        zzxk.zzf.w("AutoZoom", "Unable to set zoom to " + this.zzd, th3);
        this.zze.zzg.set(false);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Float f14 = (Float) obj;
        if (f14.floatValue() >= 1.0f) {
            zzxk.zzg(this.zze, f14.floatValue());
            this.zze.zzq(this.zza, this.zzb, f14.floatValue(), this.zzc);
        }
        this.zze.zzg.set(false);
    }
}
