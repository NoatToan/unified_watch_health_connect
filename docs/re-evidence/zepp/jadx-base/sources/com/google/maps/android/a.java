package com.google.maps.android;

/* JADX INFO: loaded from: classes3.dex */
class a {
    public static final double a = 6371009.0d;

    public static double a(double d) {
        return Math.asin(Math.sqrt(d)) * 2.0d;
    }

    public static double b(double d, double d2, double d3) {
        if (d < d2) {
            return d2;
        }
        return d > d3 ? d3 : d;
    }

    public static double c(double d) {
        double dSin = Math.sin(d * 0.5d);
        return dSin * dSin;
    }

    public static double d(double d, double d2, double d3) {
        return c(d - d2) + (c(d3) * Math.cos(d) * Math.cos(d2));
    }

    public static double e(double d) {
        double d2 = d * d;
        return (d2 / (Math.sqrt(1.0d - d2) + 1.0d)) * 0.5d;
    }

    public static double f(double d) {
        return (Math.atan(Math.exp(d)) * 2.0d) - 1.5707963267948966d;
    }

    public static double g(double d) {
        return Math.log(Math.tan((d * 0.5d) + 0.7853981633974483d));
    }

    public static double h(double d, double d2) {
        return ((d % d2) + d2) % d2;
    }

    public static double i(double d) {
        return Math.sqrt(d * (1.0d - d)) * 2.0d;
    }

    public static double j(double d, double d2) {
        double dSqrt = Math.sqrt((1.0d - d) * d);
        double dSqrt2 = Math.sqrt((1.0d - d2) * d2);
        return ((dSqrt + dSqrt2) - (((dSqrt * d2) + (dSqrt2 * d)) * 2.0d)) * 2.0d;
    }

    public static double k(double d, double d2, double d3) {
        return (d < d2 || d >= d3) ? h(d - d2, d3 - d2) + d2 : d;
    }
}
