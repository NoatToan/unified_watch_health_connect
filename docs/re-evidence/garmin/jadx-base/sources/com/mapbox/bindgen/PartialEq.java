package com.mapbox.bindgen;

/* JADX INFO: loaded from: classes2.dex */
public final class PartialEq {
    private static double epsilonD = Math.ulp(1.0d);
    private static float epsilonF = Math.ulp(1.0f);

    public static boolean compare(double d14, double d15) {
        return Math.abs(d14 - d15) <= epsilonD * Math.max(1.0d, Math.max(Math.abs(d14), Math.abs(d15)));
    }

    public static boolean compare(float f14, float f15) {
        return Math.abs(f14 - f15) <= epsilonF * Math.max(1.0f, Math.max(Math.abs(f14), Math.abs(f15)));
    }
}
