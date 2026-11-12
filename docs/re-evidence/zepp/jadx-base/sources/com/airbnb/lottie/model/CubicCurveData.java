package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class CubicCurveData {
    private final PointF a;
    private final PointF b;
    private final PointF c;

    public CubicCurveData() {
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }

    public PointF getControlPoint1() {
        return this.a;
    }

    public PointF getControlPoint2() {
        return this.b;
    }

    public PointF getVertex() {
        return this.c;
    }

    public void setControlPoint1(float f, float f2) {
        this.a.set(f, f2);
    }

    public void setControlPoint2(float f, float f2) {
        this.b.set(f, f2);
    }

    public void setVertex(float f, float f2) {
        this.c.set(f, f2);
    }

    public CubicCurveData(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }
}
