package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes2.dex */
abstract class a<T> extends LottieValueCallback<T> {
    private final T c;
    private final T d;
    private final Interpolator e;

    public a(T t, T t2) {
        this(t, t2, new LinearInterpolator());
    }

    public abstract T a(T t, T t2, float f);

    @Override // com.airbnb.lottie.value.LottieValueCallback
    public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
        return a(this.c, this.d, this.e.getInterpolation(lottieFrameInfo.getOverallProgress()));
    }

    public a(T t, T t2, Interpolator interpolator) {
        this.c = t;
        this.d = t2;
        this.e = interpolator;
    }
}
