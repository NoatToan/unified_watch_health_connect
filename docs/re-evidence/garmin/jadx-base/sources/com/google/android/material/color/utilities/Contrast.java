package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes14.dex */
public final class Contrast {
    private static final double CONTRAST_RATIO_EPSILON = 0.04d;
    private static final double LUMINANCE_GAMUT_MAP_TOLERANCE = 0.4d;
    public static final double RATIO_30 = 3.0d;
    public static final double RATIO_45 = 4.5d;
    public static final double RATIO_70 = 7.0d;
    public static final double RATIO_MAX = 21.0d;
    public static final double RATIO_MIN = 1.0d;

    private Contrast() {
    }

    public static double darker(double d14, double d15) {
        if (d14 >= 0.0d && d14 <= 100.0d) {
            double dYFromLstar = ColorUtils.yFromLstar(d14);
            double d16 = ((dYFromLstar + 5.0d) / d15) - 5.0d;
            if (d16 >= 0.0d && d16 <= 100.0d) {
                double dRatioOfYs = ratioOfYs(dYFromLstar, d16);
                double dAbs = Math.abs(dRatioOfYs - d15);
                if (dRatioOfYs < d15 && dAbs > CONTRAST_RATIO_EPSILON) {
                    return -1.0d;
                }
                double dLstarFromY = ColorUtils.lstarFromY(d16) - LUMINANCE_GAMUT_MAP_TOLERANCE;
                if (dLstarFromY >= 0.0d && dLstarFromY <= 100.0d) {
                    return dLstarFromY;
                }
            }
        }
        return -1.0d;
    }

    public static double darkerUnsafe(double d14, double d15) {
        return Math.max(0.0d, darker(d14, d15));
    }

    public static double lighter(double d14, double d15) {
        if (d14 >= 0.0d && d14 <= 100.0d) {
            double dYFromLstar = ColorUtils.yFromLstar(d14);
            double d16 = ((dYFromLstar + 5.0d) * d15) - 5.0d;
            if (d16 >= 0.0d && d16 <= 100.0d) {
                double dRatioOfYs = ratioOfYs(d16, dYFromLstar);
                double dAbs = Math.abs(dRatioOfYs - d15);
                if (dRatioOfYs < d15 && dAbs > CONTRAST_RATIO_EPSILON) {
                    return -1.0d;
                }
                double dLstarFromY = ColorUtils.lstarFromY(d16) + LUMINANCE_GAMUT_MAP_TOLERANCE;
                if (dLstarFromY >= 0.0d && dLstarFromY <= 100.0d) {
                    return dLstarFromY;
                }
            }
        }
        return -1.0d;
    }

    public static double lighterUnsafe(double d14, double d15) {
        double dLighter = lighter(d14, d15);
        if (dLighter < 0.0d) {
            return 100.0d;
        }
        return dLighter;
    }

    public static double ratioOfTones(double d14, double d15) {
        return ratioOfYs(ColorUtils.yFromLstar(d14), ColorUtils.yFromLstar(d15));
    }

    public static double ratioOfYs(double d14, double d15) {
        double dMax = Math.max(d14, d15);
        if (dMax != d15) {
            d14 = d15;
        }
        return (dMax + 5.0d) / (d14 + 5.0d);
    }
}
