package com.airbnb.lottie.value;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public class LottieFrameInfo<T> {
    private float a;
    private float b;
    private T c;
    private T d;
    private float e;
    private float f;
    private float g;

    public float getEndFrame() {
        return this.b;
    }

    public T getEndValue() {
        return this.d;
    }

    public float getInterpolatedKeyframeProgress() {
        return this.f;
    }

    public float getLinearKeyframeProgress() {
        return this.e;
    }

    public float getOverallProgress() {
        return this.g;
    }

    public float getStartFrame() {
        return this.a;
    }

    public T getStartValue() {
        return this.c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieFrameInfo<T> set(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = t;
        this.d = t2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        return this;
    }
}
