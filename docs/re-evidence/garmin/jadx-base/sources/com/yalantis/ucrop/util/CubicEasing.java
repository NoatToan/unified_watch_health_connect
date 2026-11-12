package com.yalantis.ucrop.util;

/* JADX INFO: loaded from: classes3.dex */
public final class CubicEasing {
    public static float easeIn(float f14, float f15, float f16, float f17) {
        float f18 = f14 / f17;
        return (f16 * f18 * f18 * f18) + f15;
    }

    public static float easeInOut(float f14, float f15, float f16, float f17) {
        float f18 = f14 / (f17 / 2.0f);
        float f19 = f16 / 2.0f;
        if (f18 < 1.0f) {
            return (f19 * f18 * f18 * f18) + f15;
        }
        float f22 = f18 - 2.0f;
        return (((f22 * f22 * f22) + 2.0f) * f19) + f15;
    }

    public static float easeOut(float f14, float f15, float f16, float f17) {
        float f18 = (f14 / f17) - 1.0f;
        return (((f18 * f18 * f18) + 1.0f) * f16) + f15;
    }
}
