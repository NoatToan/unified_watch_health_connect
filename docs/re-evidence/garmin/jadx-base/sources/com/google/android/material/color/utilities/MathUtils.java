package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes14.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static double clampDouble(double d14, double d15, double d16) {
        if (d16 < d14) {
            return d14;
        }
        return d16 > d15 ? d15 : d16;
    }

    public static int clampInt(int i14, int i15, int i16) {
        if (i16 < i14) {
            return i14;
        }
        return i16 > i15 ? i15 : i16;
    }

    public static double differenceDegrees(double d14, double d15) {
        return 180.0d - Math.abs(Math.abs(d14 - d15) - 180.0d);
    }

    public static double lerp(double d14, double d15, double d16) {
        return (d16 * d15) + ((1.0d - d16) * d14);
    }

    public static double[] matrixMultiply(double[] dArr, double[][] dArr2) {
        double d14 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d15 = dArr3[0] * d14;
        double d16 = dArr[1];
        double d17 = (dArr3[1] * d16) + d15;
        double d18 = dArr[2];
        double d19 = (dArr3[2] * d18) + d17;
        double[] dArr4 = dArr2[1];
        double d24 = (dArr4[2] * d18) + (dArr4[1] * d16) + (dArr4[0] * d14);
        double[] dArr5 = dArr2[2];
        return new double[]{d19, d24, (d18 * dArr5[2]) + (d16 * dArr5[1]) + (d14 * dArr5[0])};
    }

    public static double rotationDirection(double d14, double d15) {
        return sanitizeDegreesDouble(d15 - d14) <= 180.0d ? 1.0d : -1.0d;
    }

    public static double sanitizeDegreesDouble(double d14) {
        double d15 = d14 % 360.0d;
        return d15 < 0.0d ? d15 + 360.0d : d15;
    }

    public static int sanitizeDegreesInt(int i14) {
        int i15 = i14 % 360;
        return i15 < 0 ? i15 + 360 : i15;
    }

    public static int signum(double d14) {
        if (d14 < 0.0d) {
            return -1;
        }
        return d14 == 0.0d ? 0 : 1;
    }
}
