package defpackage;

import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public class ped {
    public static double a(int i) {
        return (((double) i) * 3.5d) / 65536.0d;
    }

    public static float a(float f) {
        return ((int) (f * 10.0f)) / 10.0f;
    }

    public static float b(float f) {
        return f / 1000.0f;
    }

    public static float b(int i) {
        return i / 1000.0f;
    }

    public static float c(float f) {
        return f * 3.6f;
    }

    public static int d(float f) {
        if (f <= 1.0E-6f) {
            return Integer.MAX_VALUE;
        }
        return (int) (1000.0f / f);
    }

    public static int e(int i) {
        return i * 1000;
    }

    public static int g(float f) {
        return (int) (f * 1000.0f);
    }

    public static int h(float f) {
        return (int) (f * 1000.0f);
    }

    public static String c(double d) {
        return UnitUtil.c(d, 1, 2, false);
    }

    public static String e(double d) {
        return c(CommonUtil.a(UnitUtil.c(d, 1, 3, false)));
    }

    public static String f(double d) {
        return UnitUtil.e(d, 1, 2);
    }

    public static String e(float f) {
        return UnitUtil.e(Math.round(f / 1000.0f), 1, 0);
    }

    public static String f(float f) {
        return UnitUtil.e(f, 1, 0);
    }

    public static String i(float f) {
        return UnitUtil.e(f / 60000.0f, 1, 0);
    }

    public static String m(float f) {
        return UnitUtil.e(f / 60.0f, 1, 0);
    }

    public static String j(float f) {
        return UnitUtil.e(f / 1000.0f, 1, 0);
    }

    public static double b(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            d = 0.0d;
        }
        return new BigDecimal(d).setScale(3, 1).floatValue();
    }

    public static int d(int i) {
        return i / 60;
    }

    public static int c(int i) {
        return i % 60;
    }

    public static float d(double d) {
        return (int) Math.round(d);
    }

    public static float a(double d) {
        return new BigDecimal(d).setScale(1, 1).floatValue();
    }

    public static double h(double d) {
        return UnitUtil.f() ? UnitUtil.e(d, 3) : d;
    }
}
