package com.google.android.gms.internal.mlkit_vision_barcode;

import v.e0;

/* JADX INFO: loaded from: classes14.dex */
final class zzxg extends zzxn {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;

    public zzxg(float f14, float f15, float f16, float f17, float f18) {
        this.zza = f14;
        this.zzb = f15;
        this.zzc = f16;
        this.zzd = f17;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzxn) {
            zzxn zzxnVar = (zzxn) obj;
            if (Float.floatToIntBits(this.zza) == Float.floatToIntBits(zzxnVar.zzc()) && Float.floatToIntBits(this.zzb) == Float.floatToIntBits(zzxnVar.zze()) && Float.floatToIntBits(this.zzc) == Float.floatToIntBits(zzxnVar.zzb()) && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzxnVar.zzd())) {
                int iFloatToIntBits = Float.floatToIntBits(0.0f);
                zzxnVar.zza();
                if (iFloatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.zza) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.zzb)) * 1000003) ^ Float.floatToIntBits(this.zzc)) * 1000003) ^ Float.floatToIntBits(this.zzd)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PredictedArea{xMin=");
        sb3.append(this.zza);
        sb3.append(", yMin=");
        sb3.append(this.zzb);
        sb3.append(", xMax=");
        sb3.append(this.zzc);
        sb3.append(", yMax=");
        return e0.e(this.zzd, ", confidenceScore=0.0}", sb3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zza() {
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    public final float zze() {
        return this.zzb;
    }
}
