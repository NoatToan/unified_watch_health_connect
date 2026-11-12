package com.github.mikephil.chartingv2.animation;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"NewApi"})
@Deprecated
public interface EasingFunction extends TimeInterpolator {
    @Override // android.animation.TimeInterpolator
    float getInterpolation(float f14);
}
