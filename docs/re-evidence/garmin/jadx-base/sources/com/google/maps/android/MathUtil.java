package com.google.maps.android;

/* JADX INFO: loaded from: classes2.dex */
class MathUtil {
    static final double EARTH_RADIUS = 6371009.0d;

    public static double arcHav(double d14) {
        return Math.asin(Math.sqrt(d14)) * 2.0d;
    }

    public static double clamp(double d14, double d15, double d16) {
        if (d14 < d15) {
            return d15;
        }
        return d14 > d16 ? d16 : d14;
    }

    public static double hav(double d14) {
        double dSin = Math.sin(d14 * 0.5d);
        return dSin * dSin;
    }

    public static double havDistance(double d14, double d15, double d16) {
        return (Math.cos(d15) * Math.cos(d14) * hav(d16)) + hav(d14 - d15);
    }

    public static double havFromSin(double d14) {
        double d15 = d14 * d14;
        return (d15 / (Math.sqrt(1.0d - d15) + 1.0d)) * 0.5d;
    }

    public static double inverseMercator(double d14) {
        return (Math.atan(Math.exp(d14)) * 2.0d) - 1.5707963267948966d;
    }

    public static double mercator(double d14) {
        return Math.log(Math.tan((d14 * 0.5d) + 0.7853981633974483d));
    }

    public static double mod(double d14, double d15) {
        return ((d14 % d15) + d15) % d15;
    }

    public static double sinFromHav(double d14) {
        return Math.sqrt((1.0d - d14) * d14) * 2.0d;
    }

    public static double sinSumFromHav(double d14, double d15) {
        double dSqrt = Math.sqrt((1.0d - d14) * d14);
        double dSqrt2 = Math.sqrt((1.0d - d15) * d15);
        return ((dSqrt + dSqrt2) - (((dSqrt2 * d14) + (dSqrt * d15)) * 2.0d)) * 2.0d;
    }

    public static double wrap(double d14, double d15, double d16) {
        return (d14 < d15 || d14 >= d16) ? mod(d14 - d15, d16 - d15) + d15 : d14;
    }
}
