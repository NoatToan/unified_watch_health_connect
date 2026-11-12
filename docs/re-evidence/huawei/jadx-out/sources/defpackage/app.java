package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.math.ElementTypesAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class app {
    public static double d(double d) {
        return -Math.nextUp(-d);
    }

    static long c(double d) {
        Preconditions.checkArgument(e(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean e(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static double a(double d) {
        Preconditions.checkArgument(!Double.isNaN(d));
        return Math.max(d, 0.0d);
    }
}
