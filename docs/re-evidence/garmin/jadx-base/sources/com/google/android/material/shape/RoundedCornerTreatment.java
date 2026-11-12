package com.google.android.material.shape;

/* JADX INFO: loaded from: classes14.dex */
public class RoundedCornerTreatment extends CornerTreatment {
    float radius;

    public RoundedCornerTreatment() {
        this.radius = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(ShapePath shapePath, float f14, float f15, float f16) {
        shapePath.reset(0.0f, f16 * f15, 180.0f, 180.0f - f14);
        float f17 = f16 * 2.0f * f15;
        shapePath.addArc(0.0f, 0.0f, f17, f17, 180.0f, f14);
    }

    @Deprecated
    public RoundedCornerTreatment(float f14) {
        this.radius = f14;
    }
}
