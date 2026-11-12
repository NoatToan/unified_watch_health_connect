package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class y27 {
    public static double a(double d) {
        c6i.d(!Double.isNaN(d));
        return Math.max(d, 0.0d);
    }

    public static long b(double d) {
        c6i.e(c(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean c(double d) {
        return Math.getExponent(d) <= 1023;
    }
}
