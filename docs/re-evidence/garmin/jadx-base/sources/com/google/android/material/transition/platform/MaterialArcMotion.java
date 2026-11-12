package com.google.android.material.transition.platform;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;

/* JADX INFO: loaded from: classes14.dex */
public final class MaterialArcMotion extends PathMotion {
    private static PointF getControlPoint(float f14, float f15, float f16, float f17) {
        return f15 > f17 ? new PointF(f16, f15) : new PointF(f14, f17);
    }

    @Override // android.transition.PathMotion
    public Path getPath(float f14, float f15, float f16, float f17) {
        Path path = new Path();
        path.moveTo(f14, f15);
        PointF controlPoint = getControlPoint(f14, f15, f16, f17);
        path.quadTo(controlPoint.x, controlPoint.y, f16, f17);
        return path;
    }
}
