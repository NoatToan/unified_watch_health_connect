package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class k0 {
    private static double a = 3.141592653589793d;
    private static double b = 6378245.0d;
    private static double c = 0.006693421622965943d;

    public static double a(double d, double d2, double d3, double d4) {
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(d2);
        double radians3 = Math.toRadians(d3);
        double radians4 = Math.toRadians(d4);
        return Math.acos((Math.sin(radians2) * Math.sin(radians4)) + (Math.cos(radians2) * Math.cos(radians4) * Math.cos(radians3 - radians))) * 6370996.81d;
    }

    public static double[] b(double d, double d2) {
        if (d < 72.004d || d > 137.8347d || d2 < 0.8293d || d2 > 55.8271d) {
            return new double[]{d, d2};
        }
        double d3 = d - 105.0d;
        double d4 = d2 - 35.0d;
        double d5 = d3 * 2.0d;
        double d6 = d3 * 0.1d;
        double d7 = d6 * d4;
        double d8 = 6.0d * d3;
        double dSqrt = (-100.0d) + d5 + (d4 * 3.0d) + (d4 * 0.2d * d4) + d7 + (Math.sqrt(Math.abs(d3)) * 0.2d) + ((((Math.sin(a * d8) * 20.0d) + (Math.sin(a * d5) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(a * d4) * 20.0d) + (Math.sin((d4 / 3.0d) * a) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d4 / 12.0d) * a) * 160.0d) + (Math.sin((a * d4) / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
        double dSqrt2 = d3 + 300.0d + (d4 * 2.0d) + (d6 * d3) + d7 + (Math.sqrt(Math.abs(d3)) * 0.1d) + ((((Math.sin(d8 * a) * 20.0d) + (Math.sin(d5 * a) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(a * d3) * 20.0d) + (Math.sin((d3 / 3.0d) * a) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d3 / 12.0d) * a) * 150.0d) + (Math.sin((d3 / 30.0d) * a) * 300.0d)) * 2.0d) / 3.0d);
        double d9 = (d2 / 180.0d) * a;
        double dSin = Math.sin(d9);
        double d10 = 1.0d - ((c * dSin) * dSin);
        double dSqrt3 = Math.sqrt(d10);
        double d11 = b;
        return new double[]{d + ((dSqrt2 * 180.0d) / (((d11 / dSqrt3) * Math.cos(d9)) * a)), d2 + ((dSqrt * 180.0d) / ((((1.0d - c) * d11) / (d10 * dSqrt3)) * a))};
    }

    public static double[] c(double d, double d2) {
        boolean z;
        boolean z2;
        double d3 = d;
        double d4 = d2;
        double[] dArr = new double[2];
        if (d3 < 0.0d) {
            d3 = -d3;
            z = false;
        } else {
            z = true;
        }
        if (d4 < 0.0d) {
            d4 = -d4;
            z2 = false;
        } else {
            z2 = true;
        }
        double[] dArr2 = m0.k;
        m0[] m0VarArr = m0.s;
        m0 m0Var = m0VarArr[0];
        for (int i = 0; dArr2[i] != -1.0d; i++) {
            if (d4 > dArr2[i]) {
                m0Var = m0VarArr[i];
                break;
            }
        }
        dArr[0] = m0Var.a + (m0Var.b * d3);
        double d5 = d4 / m0Var.j;
        dArr[1] = m0Var.c + (m0Var.d * d5) + (m0Var.e * d5 * d5) + (m0Var.f * d5 * d5 * d5) + (m0Var.g * d5 * d5 * d5 * d5) + (m0Var.h * d5 * d5 * d5 * d5 * d5) + (m0Var.i * d5 * d5 * d5 * d5 * d5 * d5);
        if (!z) {
            dArr[0] = dArr[0] * (-1.0d);
        }
        if (!z2) {
            dArr[1] = dArr[1] * (-1.0d);
        }
        return dArr;
    }
}
