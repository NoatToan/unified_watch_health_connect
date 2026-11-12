package com.google.android.material.shape;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes14.dex */
public class CornerTreatment {
    public void getCornerPath(ShapePath shapePath, float f14, float f15, RectF rectF, CornerSize cornerSize) {
        getCornerPath(shapePath, f14, f15, cornerSize.getCornerSize(rectF));
    }

    public void getCornerPath(ShapePath shapePath, float f14, float f15, float f16) {
        getCornerPath(f14, f15, shapePath);
    }

    @Deprecated
    public void getCornerPath(float f14, float f15, ShapePath shapePath) {
    }
}
