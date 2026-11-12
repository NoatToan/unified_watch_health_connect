package com.google.common.math;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
public final class DoubleMath {
    private static final double a = -2.147483648E9d;
    private static final double b = 2.147483647E9d;
    private static final double c = -9.223372036854776E18d;
    private static final double d = 9.223372036854776E18d;

    @VisibleForTesting
    public static final int f = 170;
    private static final double e = Math.log(2.0d);

    @VisibleForTesting
    public static final double[] g = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private DoubleMath() {
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    private static double a(double d2) {
        Preconditions.checkArgument(com.google.common.math.a.d(d2));
        return d2;
    }

    @GwtIncompatible
    public static double b(double d2, RoundingMode roundingMode) {
        if (!com.google.common.math.a.d(d2)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                b.k(isMathematicalInteger(d2));
                return d2;
            case 2:
                return (d2 >= 0.0d || isMathematicalInteger(d2)) ? d2 : ((long) d2) - 1;
            case 3:
                return (d2 <= 0.0d || isMathematicalInteger(d2)) ? d2 : ((long) d2) + 1;
            case 4:
                return d2;
            case 5:
                if (isMathematicalInteger(d2)) {
                    return d2;
                }
                return ((long) d2) + ((long) (d2 > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(d2);
            case 7:
                double dRint = Math.rint(d2);
                return Math.abs(d2 - dRint) == 0.5d ? d2 + Math.copySign(0.5d, d2) : dRint;
            case 8:
                double dRint2 = Math.rint(d2);
                return Math.abs(d2 - dRint2) == 0.5d ? d2 : dRint2;
            default:
                throw new AssertionError();
        }
    }

    public static double factorial(int i) {
        b.e(GoogleApiAvailabilityLight.b, i);
        if (i > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d2 = 1.0d;
        int i2 = i & (-16);
        while (true) {
            i2++;
            if (i2 > i) {
                return d2 * g[i >> 4];
            }
            d2 *= (double) i2;
        }
    }

    public static int fuzzyCompare(double d2, double d3, double d4) {
        if (fuzzyEquals(d2, d3, d4)) {
            return 0;
        }
        if (d2 < d3) {
            return -1;
        }
        if (d2 > d3) {
            return 1;
        }
        return Booleans.compare(Double.isNaN(d2), Double.isNaN(d3));
    }

    public static boolean fuzzyEquals(double d2, double d3, double d4) {
        b.d("tolerance", d4);
        return Math.copySign(d2 - d3, 1.0d) <= d4 || d2 == d3 || (Double.isNaN(d2) && Double.isNaN(d3));
    }

    @GwtIncompatible
    public static boolean isMathematicalInteger(double d2) {
        return com.google.common.math.a.d(d2) && (d2 == 0.0d || 52 - Long.numberOfTrailingZeros(com.google.common.math.a.c(d2)) <= Math.getExponent(d2));
    }

    @GwtIncompatible
    public static boolean isPowerOfTwo(double d2) {
        if (d2 <= 0.0d || !com.google.common.math.a.d(d2)) {
            return false;
        }
        long jC = com.google.common.math.a.c(d2);
        return (jC & (jC - 1)) == 0;
    }

    public static double log2(double d2) {
        return Math.log(d2) / e;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0, "Cannot take mean of 0 values");
        double dA = a(dArr[0]);
        long j = 1;
        for (int i = 1; i < dArr.length; i++) {
            a(dArr[i]);
            j++;
            dA += (dArr[i] - dA) / j;
        }
        return dA;
    }

    @GwtIncompatible
    public static BigInteger roundToBigInteger(double d2, RoundingMode roundingMode) {
        double dB = b(d2, roundingMode);
        if ((dB < 9.223372036854776E18d) && ((-9.223372036854776E18d) - dB < 1.0d)) {
            return BigInteger.valueOf((long) dB);
        }
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(com.google.common.math.a.c(dB)).shiftLeft(Math.getExponent(dB) - 52);
        return dB < 0.0d ? bigIntegerShiftLeft.negate() : bigIntegerShiftLeft;
    }

    @GwtIncompatible
    public static int roundToInt(double d2, RoundingMode roundingMode) {
        double dB = b(d2, roundingMode);
        b.a((dB < 2.147483648E9d) & (dB > -2.147483649E9d), d2, roundingMode);
        return (int) dB;
    }

    @GwtIncompatible
    public static long roundToLong(double d2, RoundingMode roundingMode) {
        double dB = b(d2, roundingMode);
        b.a(((-9.223372036854776E18d) - dB < 1.0d) & (dB < 9.223372036854776E18d), d2, roundingMode);
        return (long) dB;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    @GwtIncompatible
    public static int log2(double d2, RoundingMode roundingMode) {
        boolean zIsPowerOfTwo;
        boolean z = false;
        Preconditions.checkArgument(d2 > 0.0d && com.google.common.math.a.d(d2), "x must be positive and finite");
        int exponent = Math.getExponent(d2);
        if (!com.google.common.math.a.e(d2)) {
            return log2(d2 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                b.k(isPowerOfTwo(d2));
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z = !isPowerOfTwo(d2);
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z = exponent < 0;
                zIsPowerOfTwo = isPowerOfTwo(d2);
                z &= !zIsPowerOfTwo;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z = exponent >= 0;
                zIsPowerOfTwo = isPowerOfTwo(d2);
                z &= !zIsPowerOfTwo;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dG = com.google.common.math.a.g(d2);
                if (dG * dG > 2.0d) {
                    z = true;
                }
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    @Deprecated
    public static double mean(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0, "Cannot take mean of 0 values");
        long j = 0;
        for (int i : iArr) {
            j += (long) i;
        }
        return j / ((double) iArr.length);
    }

    @Deprecated
    public static double mean(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0, "Cannot take mean of 0 values");
        double d2 = jArr[0];
        long j = 1;
        for (int i = 1; i < jArr.length; i++) {
            j++;
            d2 += (jArr[i] - d2) / j;
        }
        return d2;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterable<? extends Number> iterable) {
        return mean(iterable.iterator());
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterator<? extends Number> it2) {
        Preconditions.checkArgument(it2.hasNext(), "Cannot take mean of 0 values");
        double dA = a(it2.next().doubleValue());
        long j = 1;
        while (it2.hasNext()) {
            j++;
            dA += (a(it2.next().doubleValue()) - dA) / j;
        }
        return dA;
    }
}
