package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class DoubleUtils {
    static final int EXPONENT_BIAS = 1023;
    static final long EXPONENT_MASK = 9218868437227405312L;
    static final long IMPLICIT_BIT = 4503599627370496L;

    @VisibleForTesting
    static final long ONE_BITS = 4607182418800017408L;
    static final int SIGNIFICAND_BITS = 52;
    static final long SIGNIFICAND_MASK = 4503599627370495L;
    static final long SIGN_MASK = Long.MIN_VALUE;

    private DoubleUtils() {
    }

    public static double bigToDouble(BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        int iBitLength = bigIntegerAbs.bitLength();
        int i14 = iBitLength - 1;
        if (i14 < 63) {
            return bigInteger.longValue();
        }
        if (i14 > 1023) {
            return ((double) bigInteger.signum()) * Double.POSITIVE_INFINITY;
        }
        int i15 = iBitLength - 54;
        long jLongValue = bigIntegerAbs.shiftRight(i15).longValue();
        long j8 = jLongValue >> 1;
        long j14 = SIGNIFICAND_MASK & j8;
        if ((jLongValue & 1) != 0 && ((j8 & 1) != 0 || bigIntegerAbs.getLowestSetBit() < i15)) {
            j14++;
        }
        return Double.longBitsToDouble(((((long) (iBitLength + 1022)) << 52) + j14) | (((long) bigInteger.signum()) & Long.MIN_VALUE));
    }

    public static double ensureNonNegative(double d14) {
        Preconditions.checkArgument(!Double.isNaN(d14));
        return Math.max(d14, 0.0d);
    }

    public static long getSignificand(double d14) {
        Preconditions.checkArgument(isFinite(d14), "not a normal value");
        int exponent = Math.getExponent(d14);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d14) & SIGNIFICAND_MASK;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | IMPLICIT_BIT;
    }

    public static boolean isFinite(double d14) {
        return Math.getExponent(d14) <= 1023;
    }

    public static boolean isNormal(double d14) {
        return Math.getExponent(d14) >= -1022;
    }

    public static double nextDown(double d14) {
        return -Math.nextUp(-d14);
    }

    public static double scaleNormalize(double d14) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d14) & SIGNIFICAND_MASK) | ONE_BITS);
    }
}
