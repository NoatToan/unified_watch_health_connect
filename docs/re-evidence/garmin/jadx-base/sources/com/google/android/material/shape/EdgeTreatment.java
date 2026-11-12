package com.google.android.material.shape;

/* JADX INFO: loaded from: classes14.dex */
public class EdgeTreatment {
    public boolean forceIntersection() {
        return false;
    }

    @Deprecated
    public void getEdgePath(float f14, float f15, ShapePath shapePath) {
        getEdgePath(f14, f14 / 2.0f, f15, shapePath);
    }

    public void getEdgePath(float f14, float f15, float f16, ShapePath shapePath) {
        shapePath.lineTo(f14, 0.0f);
    }
}
