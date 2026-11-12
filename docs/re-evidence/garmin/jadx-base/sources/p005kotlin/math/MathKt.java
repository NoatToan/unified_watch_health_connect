package p005kotlin.math;

import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"kotlin/math/MathKt__MathHKt", "kotlin/math/MathKt__MathJVMKt"}, k = 4, mv = {2, 3, 0}, xi = 49)
public final class MathKt extends MathKt__MathJVMKt {
    private MathKt() {
    }

    public static double a(double d14) {
        return Math.log(d14) / Constants.f105824a;
    }

    public static int b(double d14) {
        if (Double.isNaN(d14)) {
            h.s("Cannot round NaN value.");
            return 0;
        }
        if (d14 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d14 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d14);
    }

    public static int c(float f14) {
        if (!Float.isNaN(f14)) {
            return Math.round(f14);
        }
        h.s("Cannot round NaN value.");
        return 0;
    }

    public static long d(double d14) {
        if (!Double.isNaN(d14)) {
            return Math.round(d14);
        }
        h.s("Cannot round NaN value.");
        return 0L;
    }

    public static double e(double d14) {
        if (Double.isNaN(d14) || Double.isInfinite(d14)) {
            return d14;
        }
        return d14 > 0.0d ? Math.floor(d14) : Math.ceil(d14);
    }
}
