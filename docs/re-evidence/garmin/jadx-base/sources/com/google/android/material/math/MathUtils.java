package com.google.android.material.math;

/* JADX INFO: loaded from: classes14.dex */
public final class MathUtils {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    private MathUtils() {
    }

    public static float dist(float f14, float f15, float f16, float f17) {
        return (float) Math.hypot(f16 - f14, f17 - f15);
    }

    public static float distanceToFurthestCorner(float f14, float f15, float f16, float f17, float f18, float f19) {
        return max(dist(f14, f15, f16, f17), dist(f14, f15, f18, f17), dist(f14, f15, f18, f19), dist(f14, f15, f16, f19));
    }

    public static float floorMod(float f14, int i14) {
        float f15 = i14;
        int i15 = (int) (f14 / f15);
        if (Math.signum(f14) * f15 < 0.0f && i15 * i14 != f14) {
            i15--;
        }
        return f14 - (i15 * i14);
    }

    public static boolean geq(float f14, float f15, float f16) {
        return f14 + f16 >= f15;
    }

    public static float lerp(float f14, float f15, float f16) {
        return (f16 * f15) + ((1.0f - f16) * f14);
    }

    private static float max(float f14, float f15, float f16, float f17) {
        if (f14 > f15 && f14 > f16 && f14 > f17) {
            return f14;
        }
        if (f15 <= f16 || f15 <= f17) {
            return f16 > f17 ? f16 : f17;
        }
        return f15;
    }

    public static int floorMod(int i14, int i15) {
        int i16 = i14 / i15;
        if ((i14 ^ i15) < 0 && i16 * i15 != i14) {
            i16--;
        }
        return i14 - (i16 * i15);
    }
}
