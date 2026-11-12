package com.huawei.openalliance.ad;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes12.dex */
public class gx implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f18852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f18853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f18854c;
    float d;

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("CubicBezierInterpolator  mControlPoint1x = ");
        stringBuffer.append(this.f18852a);
        stringBuffer.append(", mControlPoint1y = ").append(this.f18853b);
        stringBuffer.append(", mControlPoint2x = ").append(this.f18854c);
        stringBuffer.append(", mControlPoint2y = ").append(this.d);
        return stringBuffer.toString();
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return a(b(f) * 2.5E-4f);
    }

    long b(float f) {
        long j = 0;
        long j2 = 4000;
        while (j <= j2) {
            long j3 = (j + j2) >>> 1;
            float fC = c(j3 * 2.5E-4f);
            if (fC < f) {
                j = j3 + 1;
            } else {
                if (fC <= f) {
                    return j3;
                }
                j2 = j3 - 1;
            }
        }
        return j;
    }

    protected float a(float f) {
        float f2 = 1.0f - f;
        float f3 = 3.0f * f2;
        return (f2 * f3 * f * this.f18853b) + (f3 * f * f * this.d) + (f * f * f);
    }

    private float c(float f) {
        float f2 = 1.0f - f;
        float f3 = 3.0f * f2;
        return (f2 * f3 * f * this.f18852a) + (f3 * f * f * this.f18854c) + (f * f * f);
    }

    public gx(float f, float f2, float f3, float f4) {
        this.f18852a = f;
        this.f18853b = f2;
        this.f18854c = f3;
        this.d = f4;
        hw.a("CubicBezierInterpolator", toString());
    }
}
