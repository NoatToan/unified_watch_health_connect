package com.google.common.math;

import am.j;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.nimbusds.jose.shaded.gson.internal.a;
import java.math.BigInteger;
import java.math.RoundingMode;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
final class MathPreconditions {
    private MathPreconditions() {
    }

    public static void checkInRangeForRoundingInputs(boolean z14, double d14, RoundingMode roundingMode) {
        if (z14) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + d14 + " and rounding mode " + roundingMode);
    }

    public static void checkNoOverflow(boolean z14, String str, int i14, int i15) {
        if (z14) {
            return;
        }
        e.u(j.q(androidx.core.view.j.k(i14, "overflow: ", str, "(", ", "), i15, ")"));
    }

    @CanIgnoreReturnValue
    public static long checkNonNegative(String str, long j8) {
        if (j8 >= 0) {
            return j8;
        }
        throw new IllegalArgumentException(str + " (" + j8 + ") must be >= 0");
    }

    @CanIgnoreReturnValue
    public static long checkPositive(String str, long j8) {
        if (j8 > 0) {
            return j8;
        }
        throw new IllegalArgumentException(str + " (" + j8 + ") must be > 0");
    }

    public static void checkRoundingUnnecessary(boolean z14) {
        if (z14) {
            return;
        }
        e.u("mode was UNNECESSARY, but rounding was necessary");
    }

    public static void checkNoOverflow(boolean z14, String str, long j8, long j14) {
        if (z14) {
            return;
        }
        e.u(a.g(j14, ", ", ")", a.j(j8, "overflow: ", str, "(")));
    }

    @CanIgnoreReturnValue
    public static int checkNonNegative(String str, int i14) {
        if (i14 >= 0) {
            return i14;
        }
        throw new IllegalArgumentException(str + " (" + i14 + ") must be >= 0");
    }

    @CanIgnoreReturnValue
    public static int checkPositive(String str, int i14) {
        if (i14 > 0) {
            return i14;
        }
        throw new IllegalArgumentException(str + " (" + i14 + ") must be > 0");
    }

    @CanIgnoreReturnValue
    public static BigInteger checkNonNegative(String str, BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            return bigInteger;
        }
        throw new IllegalArgumentException(str + " (" + bigInteger + ") must be >= 0");
    }

    @CanIgnoreReturnValue
    public static BigInteger checkPositive(String str, BigInteger bigInteger) {
        if (bigInteger.signum() > 0) {
            return bigInteger;
        }
        throw new IllegalArgumentException(str + " (" + bigInteger + ") must be > 0");
    }

    @CanIgnoreReturnValue
    public static double checkNonNegative(String str, double d14) {
        if (d14 >= 0.0d) {
            return d14;
        }
        throw new IllegalArgumentException(str + " (" + d14 + ") must be >= 0");
    }
}
