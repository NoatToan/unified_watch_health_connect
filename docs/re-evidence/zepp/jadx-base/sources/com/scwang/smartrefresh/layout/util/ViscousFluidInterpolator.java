package com.scwang.smartrefresh.layout.util;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes18.dex */
public class ViscousFluidInterpolator implements Interpolator {
    private static final float a = 8.0f;
    private static final float b;
    private static final float c;

    static {
        float fA = 1.0f / a(1.0f);
        b = fA;
        c = 1.0f - (fA * a(1.0f));
    }

    private static float a(float f) {
        float f2 = f * 8.0f;
        return f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : ((1.0f - ((float) Math.exp(1.0f - f2))) * 0.63212055f) + 0.36787945f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float fA = b * a(f);
        return fA > 0.0f ? fA + c : fA;
    }
}
