package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;
import org.apache.commons.lang3.e;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class DoubleMath {

    @VisibleForTesting
    static final int MAX_FACTORIAL = 170;
    private static final double MAX_INT_AS_DOUBLE = 2.147483647E9d;
    private static final double MAX_LONG_AS_DOUBLE_PLUS_ONE = 9.223372036854776E18d;
    private static final double MIN_INT_AS_DOUBLE = -2.147483648E9d;
    private static final double MIN_LONG_AS_DOUBLE = -9.223372036854776E18d;
    private static final double LN_2 = Math.log(2.0d);

    @VisibleForTesting
    static final double[] everySixteenthFactorial = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: renamed from: com.google.common.math.DoubleMath$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private DoubleMath() {
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    private static double checkFinite(double d14) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d14));
        return d14;
    }

    public static double factorial(int i14) {
        MathPreconditions.checkNonNegative(JWKParameterNames.RSA_MODULUS, i14);
        if (i14 > MAX_FACTORIAL) {
            return Double.POSITIVE_INFINITY;
        }
        double d14 = 1.0d;
        for (int i15 = (i14 & (-16)) + 1; i15 <= i14; i15++) {
            d14 *= (double) i15;
        }
        return d14 * everySixteenthFactorial[i14 >> 4];
    }

    public static int fuzzyCompare(double d14, double d15, double d16) {
        if (fuzzyEquals(d14, d15, d16)) {
            return 0;
        }
        if (d14 < d15) {
            return -1;
        }
        if (d14 > d15) {
            return 1;
        }
        return Boolean.compare(Double.isNaN(d14), Double.isNaN(d15));
    }

    public static boolean fuzzyEquals(double d14, double d15, double d16) {
        MathPreconditions.checkNonNegative("tolerance", d16);
        if (Math.copySign(d14 - d15, 1.0d) <= d16 || d14 == d15) {
            return true;
        }
        return Double.isNaN(d14) && Double.isNaN(d15);
    }

    @GwtIncompatible
    public static boolean isMathematicalInteger(double d14) {
        if (DoubleUtils.isFinite(d14)) {
            return d14 == 0.0d || 52 - Long.numberOfTrailingZeros(DoubleUtils.getSignificand(d14)) <= Math.getExponent(d14);
        }
        return false;
    }

    @GwtIncompatible
    public static boolean isPowerOfTwo(double d14) {
        if (d14 > 0.0d && DoubleUtils.isFinite(d14)) {
            long significand = DoubleUtils.getSignificand(d14);
            if ((significand & (significand - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    @GwtIncompatible
    public static int log2(double d14, RoundingMode roundingMode) {
        boolean zIsPowerOfTwo;
        boolean z14 = false;
        Preconditions.checkArgument(d14 > 0.0d && DoubleUtils.isFinite(d14), "x must be positive and finite");
        int exponent = Math.getExponent(d14);
        if (!DoubleUtils.isNormal(d14)) {
            return log2(d14 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(d14));
                if (z14) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z14) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z14 = !isPowerOfTwo(d14);
                if (z14) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z14 = exponent < 0;
                zIsPowerOfTwo = isPowerOfTwo(d14);
                z14 &= !zIsPowerOfTwo;
                if (z14) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z14 = exponent >= 0;
                zIsPowerOfTwo = isPowerOfTwo(d14);
                z14 &= !zIsPowerOfTwo;
                if (z14) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dScaleNormalize = DoubleUtils.scaleNormalize(d14);
                if (dScaleNormalize * dScaleNormalize > 2.0d) {
                    z14 = true;
                }
                if (z14) {
                    return exponent + 1;
                }
                return exponent;
            default:
                e0.l();
                return 0;
        }
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterator<? extends Number> it) {
        Preconditions.checkArgument(it.hasNext(), "Cannot take mean of 0 values");
        double dCheckFinite = checkFinite(it.next().doubleValue());
        long j8 = 1;
        while (it.hasNext()) {
            j8++;
            dCheckFinite += (checkFinite(it.next().doubleValue()) - dCheckFinite) / j8;
        }
        return dCheckFinite;
    }

    @GwtIncompatible
    public static double roundIntermediate(double d14, RoundingMode roundingMode) {
        if (!DoubleUtils.isFinite(d14)) {
            e.u("input is infinite or NaN");
            return 0.0d;
        }
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isMathematicalInteger(d14));
                return d14;
            case 2:
                return (d14 >= 0.0d || isMathematicalInteger(d14)) ? d14 : ((long) d14) - 1;
            case 3:
                return (d14 <= 0.0d || isMathematicalInteger(d14)) ? d14 : ((long) d14) + 1;
            case 4:
                return d14;
            case 5:
                if (isMathematicalInteger(d14)) {
                    return d14;
                }
                return ((long) d14) + ((long) (d14 > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(d14);
            case 7:
                double dRint = Math.rint(d14);
                return Math.abs(d14 - dRint) == 0.5d ? Math.copySign(0.5d, d14) + d14 : dRint;
            case 8:
                double dRint2 = Math.rint(d14);
                return Math.abs(d14 - dRint2) == 0.5d ? d14 : dRint2;
            default:
                e0.l();
                return 0.0d;
        }
    }

    @GwtIncompatible
    public static BigInteger roundToBigInteger(double d14, RoundingMode roundingMode) {
        double dRoundIntermediate = roundIntermediate(d14, roundingMode);
        if ((MIN_LONG_AS_DOUBLE - dRoundIntermediate < 1.0d) && (dRoundIntermediate < MAX_LONG_AS_DOUBLE_PLUS_ONE)) {
            return BigInteger.valueOf((long) dRoundIntermediate);
        }
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(DoubleUtils.getSignificand(dRoundIntermediate)).shiftLeft(Math.getExponent(dRoundIntermediate) - 52);
        return dRoundIntermediate < 0.0d ? bigIntegerShiftLeft.negate() : bigIntegerShiftLeft;
    }

    @GwtIncompatible
    public static int roundToInt(double d14, RoundingMode roundingMode) {
        double dRoundIntermediate = roundIntermediate(d14, roundingMode);
        MathPreconditions.checkInRangeForRoundingInputs((dRoundIntermediate > -2.147483649E9d) & (dRoundIntermediate < 2.147483648E9d), d14, roundingMode);
        return (int) dRoundIntermediate;
    }

    @GwtIncompatible
    public static long roundToLong(double d14, RoundingMode roundingMode) {
        double dRoundIntermediate = roundIntermediate(d14, roundingMode);
        MathPreconditions.checkInRangeForRoundingInputs((MIN_LONG_AS_DOUBLE - dRoundIntermediate < 1.0d) & (dRoundIntermediate < MAX_LONG_AS_DOUBLE_PLUS_ONE), d14, roundingMode);
        return (long) dRoundIntermediate;
    }

    @Deprecated
    public static double mean(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0, "Cannot take mean of 0 values");
        long j8 = 0;
        for (int i14 : iArr) {
            j8 += (long) i14;
        }
        return j8 / ((double) iArr.length);
    }

    @Deprecated
    public static double mean(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0, "Cannot take mean of 0 values");
        double d14 = jArr[0];
        long j8 = 1;
        for (int i14 = 1; i14 < jArr.length; i14++) {
            j8++;
            d14 += (jArr[i14] - d14) / j8;
        }
        return d14;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterable<? extends Number> iterable) {
        return mean(iterable.iterator());
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0, "Cannot take mean of 0 values");
        double dCheckFinite = checkFinite(dArr[0]);
        long j8 = 1;
        for (int i14 = 1; i14 < dArr.length; i14++) {
            checkFinite(dArr[i14]);
            j8++;
            dCheckFinite += (dArr[i14] - dCheckFinite) / j8;
        }
        return dCheckFinite;
    }

    public static double log2(double d14) {
        return Math.log(d14) / LN_2;
    }
}
