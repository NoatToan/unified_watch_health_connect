package com.huawei.uikit.animations.interpolator;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes20.dex */
public abstract class bzrwd implements Interpolator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f29225c = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f29226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f29227b;

    public bzrwd(float[] fArr) {
        this.f29226a = fArr;
        if (fArr.length > 1) {
            this.f29227b = 1.0f / (fArr.length - 1);
        } else {
            this.f29227b = 0.0f;
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (Float.compare(f, 1.0f) >= 0) {
            return 1.0f;
        }
        if (Float.compare(f, 0.0f) <= 0) {
            return 0.0f;
        }
        float[] fArr = this.f29226a;
        if (fArr.length <= 1) {
            if (fArr.length > 0) {
                return fArr[0];
            }
            return 0.0f;
        }
        int length = (int) ((fArr.length - 1) * f);
        int length2 = fArr.length - 2;
        if (length >= length2) {
            length = length2;
        }
        float f2 = length;
        float f3 = this.f29227b;
        float f4 = Float.compare(f3, 0.0f) != 0 ? (f - (f2 * f3)) / this.f29227b : 0.0f;
        float[] fArr2 = this.f29226a;
        float f5 = fArr2[length];
        return f5 + (f4 * (fArr2[length + 1] - f5));
    }
}
