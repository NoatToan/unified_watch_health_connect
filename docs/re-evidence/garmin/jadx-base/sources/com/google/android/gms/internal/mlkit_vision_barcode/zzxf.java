package com.google.android.gms.internal.mlkit_vision_barcode;

import org.apache.commons.text.StringSubstitutor;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
final class zzxf extends zzxm {
    private final int zzb;
    private final int zzc;
    private final float zzd;
    private final float zze;
    private final boolean zzf;
    private final float zzg;
    private final float zzh;
    private final long zzi;
    private final long zzj;
    private final boolean zzk;
    private final float zzl;
    private final float zzm;

    public /* synthetic */ zzxf(int i14, int i15, float f14, float f15, boolean z14, float f16, float f17, long j8, long j14, boolean z15, float f18, float f19, zzxe zzxeVar) {
        this.zzb = i14;
        this.zzc = i15;
        this.zzd = f14;
        this.zze = f15;
        this.zzf = z14;
        this.zzg = f16;
        this.zzh = f17;
        this.zzi = j8;
        this.zzj = j14;
        this.zzk = z15;
        this.zzl = f18;
        this.zzm = f19;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzxm) {
            zzxm zzxmVar = (zzxm) obj;
            if (this.zzb == zzxmVar.zzh() && this.zzc == zzxmVar.zzg() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzxmVar.zzd()) && Float.floatToIntBits(this.zze) == Float.floatToIntBits(zzxmVar.zzc()) && this.zzf == zzxmVar.zzl() && Float.floatToIntBits(this.zzg) == Float.floatToIntBits(zzxmVar.zzb()) && Float.floatToIntBits(this.zzh) == Float.floatToIntBits(zzxmVar.zza()) && this.zzi == zzxmVar.zzj() && this.zzj == zzxmVar.zzi() && this.zzk == zzxmVar.zzk() && Float.floatToIntBits(this.zzl) == Float.floatToIntBits(zzxmVar.zze()) && Float.floatToIntBits(this.zzm) == Float.floatToIntBits(zzxmVar.zzf())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.zzb ^ 1000003) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd)) * 1000003) ^ Float.floatToIntBits(this.zze)) * 1000003) ^ (true != this.zzf ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.zzg)) * 1000003) ^ Float.floatToIntBits(this.zzh)) * 1000003) ^ ((int) this.zzi)) * 1000003) ^ ((int) this.zzj)) * 1000003) ^ (true != this.zzk ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.zzl)) * 1000003) ^ Float.floatToIntBits(this.zzm);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AutoZoomOptions{recentFramesToCheck=");
        sb3.append(this.zzb);
        sb3.append(", recentFramesContainingPredictedArea=");
        sb3.append(this.zzc);
        sb3.append(", recentFramesIou=");
        sb3.append(this.zzd);
        sb3.append(", maxCoverage=");
        sb3.append(this.zze);
        sb3.append(", useConfidenceScore=");
        sb3.append(this.zzf);
        sb3.append(", lowerConfidenceScore=");
        sb3.append(this.zzg);
        sb3.append(", higherConfidenceScore=");
        sb3.append(this.zzh);
        sb3.append(", zoomIntervalInMillis=");
        sb3.append(this.zzi);
        sb3.append(", resetIntervalInMillis=");
        sb3.append(this.zzj);
        sb3.append(", enableZoomThreshold=");
        sb3.append(this.zzk);
        sb3.append(", zoomInThreshold=");
        sb3.append(this.zzl);
        sb3.append(", zoomOutThreshold=");
        return e0.e(this.zzm, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zza() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zze() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzf() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final int zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final int zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final long zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final long zzj() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final boolean zzk() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final boolean zzl() {
        return this.zzf;
    }
}
