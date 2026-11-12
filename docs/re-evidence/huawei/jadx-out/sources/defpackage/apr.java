package defpackage;

import com.google.common.math.ElementTypesAreNonnullByDefault;
import com.huawei.operation.utils.Constants;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class apr {
    static int a(String str, int i) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " (" + i + ") must be > 0");
    }

    public static long c(String str, long j) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void e(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    static void c(boolean z, double d, RoundingMode roundingMode) {
        if (z) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
    }

    static void b(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + Constants.LEFT_BRACKET_ONLY + i + ", " + i2 + Constants.RIGHT_BRACKET_ONLY);
    }

    public static void a(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + Constants.LEFT_BRACKET_ONLY + j + ", " + j2 + Constants.RIGHT_BRACKET_ONLY);
    }
}
