package com.google.mlkit.vision.common;

import org.apache.commons.text.StringSubstitutor;
import v.e0;

/* JADX INFO: loaded from: classes2.dex */
final class zza extends PointF3D {
    private final float zza;
    private final float zzb;
    private final float zzc;

    public zza(float f14, float f15, float f16) {
        this.zza = f14;
        this.zzb = f15;
        this.zzc = f16;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PointF3D) {
            PointF3D pointF3D = (PointF3D) obj;
            if (Float.floatToIntBits(this.zza) == Float.floatToIntBits(pointF3D.getX()) && Float.floatToIntBits(this.zzb) == Float.floatToIntBits(pointF3D.getY()) && Float.floatToIntBits(this.zzc) == Float.floatToIntBits(pointF3D.getZ())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getX() {
        return this.zza;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getY() {
        return this.zzb;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getZ() {
        return this.zzc;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.zza) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.zzb)) * 1000003) ^ Float.floatToIntBits(this.zzc);
    }

    public final String toString() {
        return e0.e(this.zzc, StringSubstitutor.DEFAULT_VAR_END, e0.i("PointF3D{x=", this.zza, ", y=", this.zzb, ", z="));
    }
}
