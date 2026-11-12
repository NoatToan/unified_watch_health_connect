package defpackage;

import com.xiaomi.fitness.common.utils.AppUtil;

/* JADX INFO: loaded from: classes6.dex */
public class xr5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f39380a = Double.longBitsToDouble(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f39381b = Float.intBitsToFloat(1);

    public static final boolean a(float f, float f2) {
        return f > f2 || b(f, f2);
    }

    public static final boolean b(float f, float f2) {
        return ((double) Math.abs(f - f2)) < 1.0E-5d;
    }

    public static final boolean c(float f, int i) {
        return ((double) Math.abs(f - ((float) i))) < 1.0E-5d;
    }

    public static Double d(int i, double d) {
        double d2;
        long jRound;
        if (i == 2) {
            d2 = 100.0d;
            jRound = Math.round(d * 100.0d);
        } else if (i == 3) {
            d2 = 1000.0d;
            jRound = Math.round(d * 1000.0d);
        } else {
            d2 = 10.0d;
            jRound = Math.round(d * 10.0d);
        }
        return Double.valueOf(jRound / d2);
    }

    public static float e(int i, float f) {
        if (i == 2) {
            return Math.round(((f * 1000.0f) / 10.0f) + 0.01f) / 100.0f;
        }
        return i == 3 ? Math.round(f * 1000.0f) / 1000.0f : Math.round(f * 10.0f) / 10.0f;
    }

    public static String f(float f) {
        return g(1, f);
    }

    public static String g(int i, float f) {
        return Float.toString(e(i, f));
    }

    public static String h(int i) {
        return AppUtil.getApp().getString(rzi.common_percent_join_str, Integer.valueOf(i));
    }

    public static String i(int i, int i2, int i3) {
        if (i2 == 0) {
            return "";
        }
        return i3 == 1 ? h((i * 100) / i2) : h(Math.round(((i * 1.0f) / i2) * 100.0f));
    }

    public static int j(float f) {
        float fAbs = Math.abs(f);
        if (0.0f <= fAbs && fAbs < 1.0E-5d) {
            return 0;
        }
        double d = fAbs;
        if (0.9999d > d || d >= 1.00001d) {
            return Math.round(fAbs + 0.5f);
        }
        return 1;
    }

    public static final boolean k(float f, float f2) {
        return f < f2 || b(f, f2);
    }

    public static final boolean l(float f, int i) {
        return f < ((float) i) || c(f, i);
    }
}
