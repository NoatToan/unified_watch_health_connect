package com.google.android.material.shape;

/* JADX INFO: loaded from: classes14.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float f14, boolean z14) {
        this.size = f14;
        this.inside = z14;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f14, float f15, float f16, ShapePath shapePath) {
        boolean z14 = this.inside;
        float f17 = this.size;
        if (!z14) {
            shapePath.lineTo(f15 - (f17 * f16), 0.0f, f15, (-f17) * f16);
            shapePath.lineTo((this.size * f16) + f15, 0.0f, f14, 0.0f);
        } else {
            shapePath.lineTo(f15 - (f17 * f16), 0.0f);
            float f18 = this.size;
            shapePath.lineTo(f15, f18 * f16, (f18 * f16) + f15, 0.0f);
            shapePath.lineTo(f14, 0.0f);
        }
    }
}
