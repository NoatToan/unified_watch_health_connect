package com.google.android.material.shape;

/* JADX INFO: loaded from: classes14.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(ShapePath shapePath, float f14, float f15, float f16) {
        shapePath.reset(0.0f, f16 * f15, 180.0f, 180.0f - f14);
        double d14 = f16;
        double d15 = f15;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f14)) * d14 * d15), (float) (Math.sin(Math.toRadians(90.0f - f14)) * d14 * d15));
    }

    @Deprecated
    public CutCornerTreatment(float f14) {
        this.size = f14;
    }
}
