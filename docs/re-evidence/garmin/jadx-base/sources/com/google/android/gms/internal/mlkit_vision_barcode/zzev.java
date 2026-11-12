package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes14.dex */
final class zzev extends zzer {
    final /* synthetic */ zzew zza;
    private final zzxh zzb;

    public zzev(zzew zzewVar, zzxh zzxhVar) {
        this.zza = zzewVar;
        this.zzb = zzxhVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzer
    public final /* bridge */ /* synthetic */ Object zza() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzer
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzer
    public final void zzc(Throwable th3) {
        this.zza.zzn(th3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzer
    public final /* synthetic */ void zzd(Object obj) {
        this.zza.zzo((zzet) obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzer
    public final boolean zzf() {
        return this.zza.isDone();
    }
}
