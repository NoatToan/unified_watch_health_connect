package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
final class a {
    public static final long a = 4503599627370495L;
    public static final long b = 9218868437227405312L;
    public static final long c = Long.MIN_VALUE;
    public static final int d = 52;
    public static final int e = 1023;
    public static final long f = 4503599627370496L;

    @VisibleForTesting
    public static final long g = 4607182418800017408L;

    private a() {
    }

    public static double a(BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        boolean z = true;
        int iBitLength = bigIntegerAbs.bitLength() - 1;
        if (iBitLength < 63) {
            return bigInteger.longValue();
        }
        if (iBitLength > 1023) {
            return ((double) bigInteger.signum()) * Double.POSITIVE_INFINITY;
        }
        int i = (iBitLength - 52) - 1;
        long jLongValue = bigIntegerAbs.shiftRight(i).longValue();
        long j = (jLongValue >> 1) & a;
        if ((jLongValue & 1) == 0 || ((j & 1) == 0 && bigIntegerAbs.getLowestSetBit() >= i)) {
            z = false;
        }
        if (z) {
            j++;
        }
        return Double.longBitsToDouble(((((long) (iBitLength + 1023)) << 52) + j) | (((long) bigInteger.signum()) & Long.MIN_VALUE));
    }

    public static double b(double d2) {
        Preconditions.checkArgument(!Double.isNaN(d2));
        if (d2 > 0.0d) {
            return d2;
        }
        return 0.0d;
    }

    public static long c(double d2) {
        Preconditions.checkArgument(d(d2), "not a normal value");
        int exponent = Math.getExponent(d2);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2) & a;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | f;
    }

    public static boolean d(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    public static boolean e(double d2) {
        return Math.getExponent(d2) >= -1022;
    }

    public static double f(double d2) {
        return -Math.nextUp(-d2);
    }

    public static double g(double d2) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d2) & a) | g);
    }
}
