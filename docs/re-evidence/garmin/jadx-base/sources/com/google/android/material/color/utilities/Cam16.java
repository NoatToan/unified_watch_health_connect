package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes14.dex */
public final class Cam16 {
    private final double astar;
    private final double bstar;
    private final double chroma;
    private final double hue;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double f53174j;
    private final double jstar;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final double f53175m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final double f53176q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final double f53177s;
    private final double[] tempArray = {0.0d, 0.0d, 0.0d};
    static final double[][] XYZ_TO_CAM16RGB = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    static final double[][] CAM16RGB_TO_XYZ = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    private Cam16(double d14, double d15, double d16, double d17, double d18, double d19, double d24, double d25, double d26) {
        this.hue = d14;
        this.chroma = d15;
        this.f53174j = d16;
        this.f53176q = d17;
        this.f53175m = d18;
        this.f53177s = d19;
        this.jstar = d24;
        this.astar = d25;
        this.bstar = d26;
    }

    public static Cam16 fromInt(int i14) {
        return fromIntInViewingConditions(i14, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromIntInViewingConditions(int i14, ViewingConditions viewingConditions) {
        double dLinearized = ColorUtils.linearized((16711680 & i14) >> 16);
        double dLinearized2 = ColorUtils.linearized((65280 & i14) >> 8);
        double dLinearized3 = ColorUtils.linearized(i14 & 255);
        return fromXyzInViewingConditions((0.18051042d * dLinearized3) + (0.35762064d * dLinearized2) + (0.41233895d * dLinearized), (0.0722d * dLinearized3) + (0.7152d * dLinearized2) + (0.2126d * dLinearized), (dLinearized3 * 0.95034478d) + (dLinearized2 * 0.11916382d) + (dLinearized * 0.01932141d), viewingConditions);
    }

    public static Cam16 fromJch(double d14, double d15, double d16) {
        return fromJchInViewingConditions(d14, d15, d16, ViewingConditions.DEFAULT);
    }

    private static Cam16 fromJchInViewingConditions(double d14, double d15, double d16, ViewingConditions viewingConditions) {
        double d17 = d14 / 100.0d;
        double flRoot = viewingConditions.getFlRoot() * (viewingConditions.getAw() + 4.0d) * Math.sqrt(d17) * (4.0d / viewingConditions.getC());
        double flRoot2 = viewingConditions.getFlRoot() * d15;
        double dSqrt = Math.sqrt((viewingConditions.getC() * (d15 / Math.sqrt(d17))) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d16);
        double d18 = (1.7000000000000002d * d14) / ((0.007d * d14) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot2) * 43.859649122807014d;
        return new Cam16(d16, d15, d14, flRoot, flRoot2, dSqrt, d18, Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    public static Cam16 fromUcs(double d14, double d15, double d16) {
        return fromUcsInViewingConditions(d14, d15, d16, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(double d14, double d15, double d16, ViewingConditions viewingConditions) {
        double dExpm1 = (Math.expm1(Math.hypot(d15, d16) * 0.0228d) / 0.0228d) / viewingConditions.getFlRoot();
        double dAtan2 = Math.atan2(d16, d15) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return fromJchInViewingConditions(d14 / (1.0d - ((d14 - 100.0d) * 0.007d)), dExpm1, dAtan2, viewingConditions);
    }

    public static Cam16 fromXyzInViewingConditions(double d14, double d15, double d16, ViewingConditions viewingConditions) {
        double[][] dArr = XYZ_TO_CAM16RGB;
        double[] dArr2 = dArr[0];
        double d17 = (dArr2[2] * d16) + (dArr2[1] * d15) + (dArr2[0] * d14);
        double[] dArr3 = dArr[1];
        double d18 = (dArr3[2] * d16) + (dArr3[1] * d15) + (dArr3[0] * d14);
        double[] dArr4 = dArr[2];
        double d19 = (dArr4[2] * d16) + (dArr4[1] * d15) + (dArr4[0] * d14);
        double d24 = viewingConditions.getRgbD()[0] * d17;
        double d25 = viewingConditions.getRgbD()[1] * d18;
        double d26 = viewingConditions.getRgbD()[2] * d19;
        double dPow = Math.pow((Math.abs(d24) * viewingConditions.getFl()) / 100.0d, 0.42d);
        double dPow2 = Math.pow((Math.abs(d25) * viewingConditions.getFl()) / 100.0d, 0.42d);
        double dPow3 = Math.pow((Math.abs(d26) * viewingConditions.getFl()) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d24) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d25) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d26) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d27 = ((((-12.0d) * dSignum2) + (dSignum * 11.0d)) + dSignum3) / 11.0d;
        double d28 = ((dSignum + dSignum2) - (dSignum3 * 2.0d)) / 9.0d;
        double d29 = dSignum2 * 20.0d;
        double d34 = ((21.0d * dSignum3) + ((dSignum * 20.0d) + d29)) / 20.0d;
        double d35 = (((dSignum * 40.0d) + d29) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d28, d27));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d36 = degrees;
        double radians = Math.toRadians(d36);
        double dPow4 = Math.pow((viewingConditions.getNbb() * d35) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ()) * 100.0d;
        double d37 = dPow4 / 100.0d;
        double flRoot = viewingConditions.getFlRoot() * (viewingConditions.getAw() + 4.0d) * Math.sqrt(d37) * (4.0d / viewingConditions.getC());
        double dPow5 = Math.pow((Math.hypot(d27, d28) * (viewingConditions.getNcb() * (viewingConditions.getNc() * (((Math.cos(Math.toRadians(d36 < 20.14d ? d36 + 360.0d : d36) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d)))) / (d34 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d);
        double dSqrt = Math.sqrt(d37) * dPow5;
        double flRoot2 = viewingConditions.getFlRoot() * dSqrt;
        double dSqrt2 = Math.sqrt((viewingConditions.getC() * dPow5) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double d38 = (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot2) * 43.859649122807014d;
        return new Cam16(d36, dSqrt, dPow4, flRoot, flRoot2, dSqrt2, d38, Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    public double distance(Cam16 cam16) {
        double jstar = getJstar() - cam16.getJstar();
        double astar = getAstar() - cam16.getAstar();
        double bstar = getBstar() - cam16.getBstar();
        return Math.pow(Math.sqrt((bstar * bstar) + (astar * astar) + (jstar * jstar)), 0.63d) * 1.41d;
    }

    public double getAstar() {
        return this.astar;
    }

    public double getBstar() {
        return this.bstar;
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getJ() {
        return this.f53174j;
    }

    public double getJstar() {
        return this.jstar;
    }

    public double getM() {
        return this.f53175m;
    }

    public double getQ() {
        return this.f53176q;
    }

    public double getS() {
        return this.f53177s;
    }

    public int toInt() {
        return viewed(ViewingConditions.DEFAULT);
    }

    public int viewed(ViewingConditions viewingConditions) {
        double[] dArrXyzInViewingConditions = xyzInViewingConditions(viewingConditions, this.tempArray);
        return ColorUtils.argbFromXyz(dArrXyzInViewingConditions[0], dArrXyzInViewingConditions[1], dArrXyzInViewingConditions[2]);
    }

    public double[] xyzInViewingConditions(ViewingConditions viewingConditions, double[] dArr) {
        double dPow = Math.pow(((getChroma() == 0.0d || getJ() == 0.0d) ? 0.0d : getChroma() / Math.sqrt(getJ() / 100.0d)) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(getHue());
        double dCos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double dPow2 = Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ()) * viewingConditions.getAw();
        double ncb = viewingConditions.getNcb() * viewingConditions.getNc() * dCos * 3846.153846153846d;
        double nbb = dPow2 / viewingConditions.getNbb();
        double dSin = Math.sin(radians);
        double dCos2 = Math.cos(radians);
        double d14 = (((0.305d + nbb) * 23.0d) * dPow) / (((dPow * 108.0d) * dSin) + (((11.0d * dPow) * dCos2) + (ncb * 23.0d)));
        double d15 = dCos2 * d14;
        double d16 = d14 * dSin;
        double d17 = nbb * 460.0d;
        double d18 = ((288.0d * d16) + ((451.0d * d15) + d17)) / 1403.0d;
        double d19 = ((d17 - (891.0d * d15)) - (261.0d * d16)) / 1403.0d;
        double d24 = ((d17 - (d15 * 220.0d)) - (d16 * 6300.0d)) / 1403.0d;
        double dPow3 = Math.pow(Math.max(0.0d, (Math.abs(d18) * 27.13d) / (400.0d - Math.abs(d18))), 2.380952380952381d) * (100.0d / viewingConditions.getFl()) * Math.signum(d18);
        double dPow4 = Math.pow(Math.max(0.0d, (Math.abs(d19) * 27.13d) / (400.0d - Math.abs(d19))), 2.380952380952381d) * (100.0d / viewingConditions.getFl()) * Math.signum(d19);
        double dPow5 = Math.pow(Math.max(0.0d, (Math.abs(d24) * 27.13d) / (400.0d - Math.abs(d24))), 2.380952380952381d) * (100.0d / viewingConditions.getFl()) * Math.signum(d24);
        double d25 = dPow3 / viewingConditions.getRgbD()[0];
        double d26 = dPow4 / viewingConditions.getRgbD()[1];
        double d27 = dPow5 / viewingConditions.getRgbD()[2];
        double[][] dArr2 = CAM16RGB_TO_XYZ;
        double[] dArr3 = dArr2[0];
        double d28 = (dArr3[2] * d27) + (dArr3[1] * d26) + (dArr3[0] * d25);
        double[] dArr4 = dArr2[1];
        double d29 = (dArr4[2] * d27) + (dArr4[1] * d26) + (dArr4[0] * d25);
        double[] dArr5 = dArr2[2];
        double d34 = (d27 * dArr5[2]) + (d26 * dArr5[1]) + (d25 * dArr5[0]);
        if (dArr == null) {
            return new double[]{d28, d29, d34};
        }
        dArr[0] = d28;
        dArr[1] = d29;
        dArr[2] = d34;
        return dArr;
    }
}
