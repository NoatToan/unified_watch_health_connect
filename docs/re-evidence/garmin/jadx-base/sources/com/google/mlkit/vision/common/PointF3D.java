package com.google.mlkit.vision.common;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PointF3D {
    public static PointF3D from(float f14, float f15, float f16) {
        return new zza(f14, f15, f16);
    }

    public abstract float getX();

    public abstract float getY();

    public abstract float getZ();
}
