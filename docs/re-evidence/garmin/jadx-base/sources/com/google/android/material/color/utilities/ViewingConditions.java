package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes14.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);

    /* JADX INFO: renamed from: aw, reason: collision with root package name */
    private final double f53189aw;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f53190c;

    /* JADX INFO: renamed from: fl, reason: collision with root package name */
    private final double f53191fl;
    private final double flRoot;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final double f53192n;
    private final double nbb;

    /* JADX INFO: renamed from: nc, reason: collision with root package name */
    private final double f53193nc;
    private final double ncb;
    private final double[] rgbD;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final double f53194z;

    private ViewingConditions(double d14, double d15, double d16, double d17, double d18, double d19, double[] dArr, double d24, double d25, double d26) {
        this.f53192n = d14;
        this.f53189aw = d15;
        this.nbb = d16;
        this.ncb = d17;
        this.f53190c = d18;
        this.f53193nc = d19;
        this.rgbD = dArr;
        this.f53191fl = d24;
        this.flRoot = d25;
        this.f53194z = d26;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d14) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d14, 2.0d, false);
    }

    public static ViewingConditions make(double[] dArr, double d14, double d15, double d16, boolean z14) {
        double dMax = Math.max(0.1d, d15);
        double[][] dArr2 = Cam16.XYZ_TO_CAM16RGB;
        double d17 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d18 = dArr3[0] * d17;
        double d19 = dArr[1];
        double d24 = (dArr3[1] * d19) + d18;
        double d25 = dArr[2];
        double d26 = (dArr3[2] * d25) + d24;
        double[] dArr4 = dArr2[1];
        double d27 = (dArr4[2] * d25) + (dArr4[1] * d19) + (dArr4[0] * d17);
        double[] dArr5 = dArr2[2];
        double d28 = (d25 * dArr5[2]) + (d19 * dArr5[1]) + (d17 * dArr5[0]);
        double d29 = (d16 / 10.0d) + 0.8d;
        double dLerp = d29 >= 0.9d ? MathUtils.lerp(0.59d, 0.69d, (d29 - 0.9d) * 10.0d) : MathUtils.lerp(0.525d, 0.59d, (d29 - 0.8d) * 10.0d);
        double dClampDouble = MathUtils.clampDouble(0.0d, 1.0d, z14 ? 1.0d : (1.0d - (Math.exp(((-d14) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d29);
        double[] dArr6 = {(((100.0d / d26) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d27) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d28) * dClampDouble) + 1.0d) - dClampDouble};
        double d34 = 5.0d * d14;
        double d35 = 1.0d / (d34 + 1.0d);
        double d36 = d35 * d35 * d35 * d35;
        double d37 = 1.0d - d36;
        double dCbrt = (Math.cbrt(d34) * 0.1d * d37 * d37) + (d36 * d14);
        double dYFromLstar = ColorUtils.yFromLstar(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dYFromLstar) + 1.48d;
        double dPow = 0.725d / Math.pow(dYFromLstar, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d26) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d27) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d28) / 100.0d, 0.42d)};
        double d38 = dArr7[0];
        double d39 = (d38 * 400.0d) / (d38 + 27.13d);
        double d44 = dArr7[1];
        double d45 = (d44 * 400.0d) / (d44 + 27.13d);
        double d46 = dArr7[2];
        double[] dArr8 = {d39, d45, (400.0d * d46) / (d46 + 27.13d)};
        return new ViewingConditions(dYFromLstar, ((dArr8[2] * 0.05d) + (dArr8[0] * 2.0d) + dArr8[1]) * dPow, dPow, dPow, dLerp, d29, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    public double getAw() {
        return this.f53189aw;
    }

    public double getC() {
        return this.f53190c;
    }

    public double getFl() {
        return this.f53191fl;
    }

    public double getFlRoot() {
        return this.flRoot;
    }

    public double getN() {
        return this.f53192n;
    }

    public double getNbb() {
        return this.nbb;
    }

    public double getNc() {
        return this.f53193nc;
    }

    public double getNcb() {
        return this.ncb;
    }

    public double[] getRgbD() {
        return this.rgbD;
    }

    public double getZ() {
        return this.f53194z;
    }
}
