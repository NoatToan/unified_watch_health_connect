package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes14.dex */
public class ColorUtils {
    static final double[][] SRGB_TO_XYZ = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    static final double[][] XYZ_TO_SRGB = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    static final double[] WHITE_POINT_D65 = {95.047d, 100.0d, 108.883d};

    private ColorUtils() {
    }

    public static int alphaFromArgb(int i14) {
        return (i14 >> 24) & 255;
    }

    public static int argbFromLab(double d14, double d15, double d16) {
        double[] dArr = WHITE_POINT_D65;
        double d17 = (d14 + 16.0d) / 116.0d;
        double d18 = d17 - (d16 / 200.0d);
        return argbFromXyz(labInvf((d15 / 500.0d) + d17) * dArr[0], labInvf(d17) * dArr[1], labInvf(d18) * dArr[2]);
    }

    public static int argbFromLinrgb(double[] dArr) {
        return argbFromRgb(delinearized(dArr[0]), delinearized(dArr[1]), delinearized(dArr[2]));
    }

    public static int argbFromLstar(double d14) {
        int iDelinearized = delinearized(yFromLstar(d14));
        return argbFromRgb(iDelinearized, iDelinearized, iDelinearized);
    }

    public static int argbFromRgb(int i14, int i15, int i16) {
        return ((i14 & 255) << 16) | (-16777216) | ((i15 & 255) << 8) | (i16 & 255);
    }

    public static int argbFromXyz(double d14, double d15, double d16) {
        double[][] dArr = XYZ_TO_SRGB;
        double[] dArr2 = dArr[0];
        double d17 = (dArr2[2] * d16) + (dArr2[1] * d15) + (dArr2[0] * d14);
        double[] dArr3 = dArr[1];
        double d18 = (dArr3[2] * d16) + (dArr3[1] * d15) + (dArr3[0] * d14);
        double[] dArr4 = dArr[2];
        return argbFromRgb(delinearized(d17), delinearized(d18), delinearized((dArr4[2] * d16) + (dArr4[1] * d15) + (dArr4[0] * d14)));
    }

    public static int blueFromArgb(int i14) {
        return i14 & 255;
    }

    public static int delinearized(double d14) {
        double d15 = d14 / 100.0d;
        return MathUtils.clampInt(0, 255, (int) Math.round((d15 <= 0.0031308d ? d15 * 12.92d : (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d));
    }

    public static int greenFromArgb(int i14) {
        return (i14 >> 8) & 255;
    }

    public static boolean isOpaque(int i14) {
        return alphaFromArgb(i14) >= 255;
    }

    public static double labF(double d14) {
        return d14 > 0.008856451679035631d ? Math.pow(d14, 0.3333333333333333d) : ((d14 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double[] labFromArgb(int i14) {
        double dLinearized = linearized(redFromArgb(i14));
        double dLinearized2 = linearized(greenFromArgb(i14));
        double dLinearized3 = linearized(blueFromArgb(i14));
        double[][] dArr = SRGB_TO_XYZ;
        double[] dArr2 = dArr[0];
        double d14 = (dArr2[2] * dLinearized3) + (dArr2[1] * dLinearized2) + (dArr2[0] * dLinearized);
        double[] dArr3 = dArr[1];
        double d15 = (dArr3[2] * dLinearized3) + (dArr3[1] * dLinearized2) + (dArr3[0] * dLinearized);
        double[] dArr4 = dArr[2];
        double d16 = (dArr4[2] * dLinearized3) + (dArr4[1] * dLinearized2) + (dArr4[0] * dLinearized);
        double[] dArr5 = WHITE_POINT_D65;
        double d17 = d14 / dArr5[0];
        double d18 = d15 / dArr5[1];
        double d19 = d16 / dArr5[2];
        double dLabF = labF(d17);
        double dLabF2 = labF(d18);
        return new double[]{(116.0d * dLabF2) - 16.0d, (dLabF - dLabF2) * 500.0d, (dLabF2 - labF(d19)) * 200.0d};
    }

    public static double labInvf(double d14) {
        double d15 = d14 * d14 * d14;
        return d15 > 0.008856451679035631d ? d15 : ((d14 * 116.0d) - 16.0d) / 903.2962962962963d;
    }

    public static double linearized(int i14) {
        double d14 = ((double) i14) / 255.0d;
        return (d14 <= 0.040449936d ? d14 / 12.92d : Math.pow((d14 + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static double lstarFromArgb(int i14) {
        return (labF(xyzFromArgb(i14)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public static double lstarFromY(double d14) {
        return (labF(d14 / 100.0d) * 116.0d) - 16.0d;
    }

    public static int redFromArgb(int i14) {
        return (i14 >> 16) & 255;
    }

    public static double[] whitePointD65() {
        return WHITE_POINT_D65;
    }

    public static double[] xyzFromArgb(int i14) {
        return MathUtils.matrixMultiply(new double[]{linearized(redFromArgb(i14)), linearized(greenFromArgb(i14)), linearized(blueFromArgb(i14))}, SRGB_TO_XYZ);
    }

    public static double yFromLstar(double d14) {
        return labInvf((d14 + 16.0d) / 116.0d) * 100.0d;
    }
}
