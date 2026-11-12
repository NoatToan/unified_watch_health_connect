package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.math.RoundingMode;
import org.apache.commons.lang3.e;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class IntMath {

    @VisibleForTesting
    static final int FLOOR_SQRT_MAX_INT = 46340;

    @VisibleForTesting
    static final int MAX_POWER_OF_SQRT2_UNSIGNED = -1257966797;

    @VisibleForTesting
    static final int MAX_SIGNED_POWER_OF_TWO = 1073741824;

    @VisibleForTesting
    static final byte[] maxLog10ForLeadingZeros = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    @VisibleForTesting
    static final int[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    @VisibleForTesting
    static final int[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    private static final int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    @VisibleForTesting
    static int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: renamed from: com.google.common.math.IntMath$1, reason: invalid class name */
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
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private IntMath() {
    }

    public static int binomial(int i14, int i15) {
        MathPreconditions.checkNonNegative(JWKParameterNames.RSA_MODULUS, i14);
        MathPreconditions.checkNonNegative(JWKParameterNames.OCT_KEY_VALUE, i15);
        int i16 = 0;
        Preconditions.checkArgument(i15 <= i14, "k (%s) > n (%s)", i15, i14);
        if (i15 > (i14 >> 1)) {
            i15 = i14 - i15;
        }
        int[] iArr = biggestBinomials;
        if (i15 >= iArr.length || i14 > iArr[i15]) {
            return Integer.MAX_VALUE;
        }
        if (i15 == 0) {
            return 1;
        }
        if (i15 == 1) {
            return i14;
        }
        long j8 = 1;
        while (i16 < i15) {
            long j14 = j8 * ((long) (i14 - i16));
            i16++;
            j8 = j14 / ((long) i16);
        }
        return (int) j8;
    }

    public static int ceilingPowerOfTwo(int i14) {
        MathPreconditions.checkPositive("x", i14);
        if (i14 <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(i14 - 1));
        }
        e.u(e0.f(i14, "ceilingPowerOfTwo(", ") not representable as an int"));
        return 0;
    }

    public static int checkedAdd(int i14, int i15) {
        long j8 = ((long) i14) + ((long) i15);
        int i16 = (int) j8;
        MathPreconditions.checkNoOverflow(j8 == ((long) i16), "checkedAdd", i14, i15);
        return i16;
    }

    public static int checkedMultiply(int i14, int i15) {
        long j8 = ((long) i14) * ((long) i15);
        int i16 = (int) j8;
        MathPreconditions.checkNoOverflow(j8 == ((long) i16), "checkedMultiply", i14, i15);
        return i16;
    }

    public static int checkedPow(int i14, int i15) {
        MathPreconditions.checkNonNegative("exponent", i15);
        if (i14 == -2) {
            MathPreconditions.checkNoOverflow(i15 < 32, "checkedPow", i14, i15);
            return (i15 & 1) == 0 ? 1 << i15 : (-1) << i15;
        }
        if (i14 == -1) {
            return (i15 & 1) == 0 ? 1 : -1;
        }
        if (i14 == 0) {
            return i15 == 0 ? 1 : 0;
        }
        if (i14 == 1) {
            return 1;
        }
        if (i14 == 2) {
            MathPreconditions.checkNoOverflow(i15 < 31, "checkedPow", i14, i15);
            return 1 << i15;
        }
        int iCheckedMultiply = 1;
        while (i15 != 0) {
            if (i15 == 1) {
                return checkedMultiply(iCheckedMultiply, i14);
            }
            if ((i15 & 1) != 0) {
                iCheckedMultiply = checkedMultiply(iCheckedMultiply, i14);
            }
            i15 >>= 1;
            if (i15 > 0) {
                MathPreconditions.checkNoOverflow((-46340 <= i14) & (i14 <= FLOOR_SQRT_MAX_INT), "checkedPow", i14, i15);
                i14 *= i14;
            }
        }
        return iCheckedMultiply;
    }

    public static int checkedSubtract(int i14, int i15) {
        long j8 = ((long) i14) - ((long) i15);
        int i16 = (int) j8;
        MathPreconditions.checkNoOverflow(j8 == ((long) i16), "checkedSubtract", i14, i15);
        return i16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int divide(int i14, int i15, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        if (i15 == 0) {
            e.u("/ by zero");
            return 0;
        }
        int i16 = i14 / i15;
        int i17 = i14 - (i15 * i16);
        if (i17 == 0) {
            return i16;
        }
        int i18 = ((i14 ^ i15) >> 31) | 1;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(i17 == 0);
                return i16;
            case 2:
                return i16;
            case 3:
                if (i18 >= 0) {
                    return i16;
                }
                return i16 + i18;
            case 4:
                return i16 + i18;
            case 5:
                if (i18 <= 0) {
                    return i16;
                }
                return i16 + i18;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i17);
                int iAbs2 = iAbs - (Math.abs(i15) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i16 & 1) != 0))) {
                            return i16;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i16;
                }
                return i16 + i18;
            default:
                e0.l();
                return 0;
        }
    }

    public static int factorial(int i14) {
        MathPreconditions.checkNonNegative(JWKParameterNames.RSA_MODULUS, i14);
        int[] iArr = factorials;
        if (i14 < iArr.length) {
            return iArr[i14];
        }
        return Integer.MAX_VALUE;
    }

    public static int floorPowerOfTwo(int i14) {
        MathPreconditions.checkPositive("x", i14);
        return Integer.highestOneBit(i14);
    }

    public static int gcd(int i14, int i15) {
        MathPreconditions.checkNonNegative("a", i14);
        MathPreconditions.checkNonNegative("b", i15);
        if (i14 == 0) {
            return i15;
        }
        if (i15 == 0) {
            return i14;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i14);
        int iNumberOfTrailingZeros2 = i14 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(i15);
        int i16 = i15 >> iNumberOfTrailingZeros3;
        while (iNumberOfTrailingZeros2 != i16) {
            int i17 = iNumberOfTrailingZeros2 - i16;
            int i18 = (i17 >> 31) & i17;
            int i19 = (i17 - i18) - i18;
            i16 += i18;
            iNumberOfTrailingZeros2 = i19 >> Integer.numberOfTrailingZeros(i19);
        }
        return iNumberOfTrailingZeros2 << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros3);
    }

    public static boolean isPowerOfTwo(int i14) {
        return (i14 > 0) & ((i14 & (i14 + (-1))) == 0);
    }

    @GwtIncompatible
    public static boolean isPrime(int i14) {
        return LongMath.isPrime(i14);
    }

    @VisibleForTesting
    public static int lessThanBranchFree(int i14, int i15) {
        return (~(~(i14 - i15))) >>> 31;
    }

    @GwtIncompatible
    public static int log10(int i14, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", i14);
        int iLog10Floor = log10Floor(i14);
        int i15 = powersOf10[iLog10Floor];
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(i14 == i15);
                return iLog10Floor;
            case 2:
            case 3:
                return iLog10Floor;
            case 4:
            case 5:
                return lessThanBranchFree(i15, i14) + iLog10Floor;
            case 6:
            case 7:
            case 8:
                return lessThanBranchFree(halfPowersOf10[iLog10Floor], i14) + iLog10Floor;
            default:
                e0.l();
                return 0;
        }
    }

    private static int log10Floor(int i14) {
        byte b14 = maxLog10ForLeadingZeros[Integer.numberOfLeadingZeros(i14)];
        return b14 - lessThanBranchFree(i14, powersOf10[b14]);
    }

    public static int log2(int i14, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", i14);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(i14));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i14 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i14);
                return lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> iNumberOfLeadingZeros, i14) + (31 - iNumberOfLeadingZeros);
            default:
                e0.l();
                return 0;
        }
        return 31 - Integer.numberOfLeadingZeros(i14);
    }

    public static int mean(int i14, int i15) {
        return (i14 & i15) + ((i14 ^ i15) >> 1);
    }

    public static int mod(int i14, int i15) {
        if (i15 > 0) {
            int i16 = i14 % i15;
            return i16 >= 0 ? i16 : i16 + i15;
        }
        e.u(e0.f(i15, "Modulus ", " must be > 0"));
        return 0;
    }

    @GwtIncompatible
    public static int pow(int i14, int i15) {
        MathPreconditions.checkNonNegative("exponent", i15);
        if (i14 == -2) {
            if (i15 < 32) {
                return (i15 & 1) == 0 ? 1 << i15 : -(1 << i15);
            }
            return 0;
        }
        if (i14 == -1) {
            return (i15 & 1) == 0 ? 1 : -1;
        }
        if (i14 == 0) {
            return i15 == 0 ? 1 : 0;
        }
        if (i14 == 1) {
            return 1;
        }
        if (i14 == 2) {
            if (i15 < 32) {
                return 1 << i15;
            }
            return 0;
        }
        int i16 = 1;
        while (i15 != 0) {
            if (i15 == 1) {
                return i14 * i16;
            }
            i16 *= (i15 & 1) == 0 ? 1 : i14;
            i14 *= i14;
            i15 >>= 1;
        }
        return i16;
    }

    public static int saturatedAdd(int i14, int i15) {
        return Ints.saturatedCast(((long) i14) + ((long) i15));
    }

    public static int saturatedMultiply(int i14, int i15) {
        return Ints.saturatedCast(((long) i14) * ((long) i15));
    }

    public static int saturatedPow(int i14, int i15) {
        MathPreconditions.checkNonNegative("exponent", i15);
        if (i14 == -2) {
            if (i15 >= 32) {
                return (i15 & 1) + Integer.MAX_VALUE;
            }
            return (i15 & 1) == 0 ? 1 << i15 : (-1) << i15;
        }
        if (i14 == -1) {
            return (i15 & 1) == 0 ? 1 : -1;
        }
        if (i14 == 0) {
            return i15 == 0 ? 1 : 0;
        }
        if (i14 == 1) {
            return 1;
        }
        if (i14 == 2) {
            if (i15 >= 31) {
                return Integer.MAX_VALUE;
            }
            return 1 << i15;
        }
        int i16 = ((i14 >>> 31) & i15 & 1) + Integer.MAX_VALUE;
        int iSaturatedMultiply = 1;
        while (i15 != 0) {
            if (i15 == 1) {
                return saturatedMultiply(iSaturatedMultiply, i14);
            }
            if ((i15 & 1) != 0) {
                iSaturatedMultiply = saturatedMultiply(iSaturatedMultiply, i14);
            }
            i15 >>= 1;
            if (i15 > 0) {
                if ((-46340 > i14) || (i14 > FLOOR_SQRT_MAX_INT)) {
                    return i16;
                }
                i14 *= i14;
            }
        }
        return iSaturatedMultiply;
    }

    public static int saturatedSubtract(int i14, int i15) {
        return Ints.saturatedCast(((long) i14) - ((long) i15));
    }

    @GwtIncompatible
    public static int sqrt(int i14, RoundingMode roundingMode) {
        MathPreconditions.checkNonNegative("x", i14);
        int iSqrtFloor = sqrtFloor(i14);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(iSqrtFloor * iSqrtFloor == i14);
                return iSqrtFloor;
            case 2:
            case 3:
                return iSqrtFloor;
            case 4:
            case 5:
                return lessThanBranchFree(iSqrtFloor * iSqrtFloor, i14) + iSqrtFloor;
            case 6:
            case 7:
            case 8:
                return lessThanBranchFree((iSqrtFloor * iSqrtFloor) + iSqrtFloor, i14) + iSqrtFloor;
            default:
                e0.l();
                return 0;
        }
    }

    private static int sqrtFloor(int i14) {
        return (int) Math.sqrt(i14);
    }
}
