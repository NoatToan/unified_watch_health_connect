package com.google.android.material.shape;

/* JADX INFO: loaded from: classes14.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {
    private final float offset;
    private final EdgeTreatment other;

    public OffsetEdgeTreatment(EdgeTreatment edgeTreatment, float f14) {
        this.other = edgeTreatment;
        this.offset = f14;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public boolean forceIntersection() {
        return this.other.forceIntersection();
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f14, float f15, float f16, ShapePath shapePath) {
        this.other.getEdgePath(f14, f15 - this.offset, f16, shapePath);
    }
}
