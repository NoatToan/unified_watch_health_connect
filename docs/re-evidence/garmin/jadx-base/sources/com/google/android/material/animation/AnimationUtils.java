package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import j20.x;
import q9.a;
import q9.b;
import q9.c;

/* JADX INFO: loaded from: classes14.dex */
public class AnimationUtils {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new b();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new a();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new c();
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static float lerp(float f14, float f15, float f16, float f17, float f18) {
        if (f18 <= f16) {
            return f14;
        }
        return f18 >= f17 ? f15 : lerp(f14, f15, (f18 - f16) / (f17 - f16));
    }

    public static int lerp(int i14, int i15, float f14) {
        return Math.round(f14 * (i15 - i14)) + i14;
    }

    public static float lerp(float f14, float f15, float f16) {
        return x.a(f15, f14, f16, f14);
    }
}
