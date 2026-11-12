package com.google.common.math;

import androidx.room.a0;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaPeriodQueue;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedLongs;
import com.google.mlkit.common.MlKitException;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.math.RoundingMode;
import okhttp3.internal.connection.RealConnection;
import org.apache.commons.lang3.e;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class LongMath {

    @VisibleForTesting
    static final long FLOOR_SQRT_MAX_LONG = 3037000499L;

    @VisibleForTesting
    static final long MAX_POWER_OF_SQRT2_UNSIGNED = -5402926248376769404L;

    @VisibleForTesting
    static final long MAX_SIGNED_POWER_OF_TWO = 4611686018427387904L;
    private static final int SIEVE_30 = -545925251;

    @VisibleForTesting
    static final byte[] maxLog10ForLeadingZeros = {19, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, 17, 17, 17, Ascii.DLE, Ascii.DLE, Ascii.DLE, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.VT, Ascii.VT, Ascii.VT, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    @VisibleForTesting
    @GwtIncompatible
    static final long[] powersOf10 = {1, 10, 100, 1000, AbstractComponentTracker.LINGERING_TIMEOUT, 100000, 1000000, 10000000, 100000000, C.NANOS_PER_SECOND, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    @VisibleForTesting
    @GwtIncompatible
    static final long[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    static final long[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    static final int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    @VisibleForTesting
    static final int[] biggestSimpleBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    private static final long[][] millerRabinBaseSets = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* JADX INFO: renamed from: com.google.common.math.LongMath$1, reason: invalid class name */
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

    private LongMath() {
    }

    public static long binomial(int i14, int i15) {
        MathPreconditions.checkNonNegative(JWKParameterNames.RSA_MODULUS, i14);
        MathPreconditions.checkNonNegative(JWKParameterNames.OCT_KEY_VALUE, i15);
        Preconditions.checkArgument(i15 <= i14, "k (%s) > n (%s)", i15, i14);
        if (i15 > (i14 >> 1)) {
            i15 = i14 - i15;
        }
        long jMultiplyFraction = 1;
        if (i15 == 0) {
            return 1L;
        }
        if (i15 == 1) {
            return i14;
        }
        long[] jArr = factorials;
        if (i14 < jArr.length) {
            return jArr[i14] / (jArr[i15] * jArr[i14 - i15]);
        }
        int[] iArr = biggestBinomials;
        if (i15 >= iArr.length || i14 > iArr[i15]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = biggestSimpleBinomials;
        if (i15 < iArr2.length && i14 <= iArr2[i15]) {
            int i16 = i14 - 1;
            long j8 = i14;
            for (int i17 = 2; i17 <= i15; i17++) {
                j8 = (j8 * ((long) i16)) / ((long) i17);
                i16--;
            }
            return j8;
        }
        long j14 = i14;
        int iLog2 = log2(j14, RoundingMode.CEILING);
        int i18 = i14 - 1;
        int i19 = iLog2;
        int i24 = 2;
        long j15 = j14;
        long j16 = 1;
        while (i24 <= i15) {
            i19 += iLog2;
            if (i19 < 63) {
                j15 *= (long) i18;
                j16 *= (long) i24;
            } else {
                jMultiplyFraction = multiplyFraction(jMultiplyFraction, j15, j16);
                j15 = i18;
                j16 = i24;
                i19 = iLog2;
            }
            i24++;
            i18--;
        }
        return multiplyFraction(jMultiplyFraction, j15, j16);
    }

    public static long ceilingPowerOfTwo(long j8) {
        MathPreconditions.checkPositive("x", j8);
        if (j8 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(j8 - 1));
        }
        e.u(a0.f(j8, "ceilingPowerOfTwo(", ") is not representable as a long"));
        return 0L;
    }

    public static long checkedAdd(long j8, long j14) {
        long j15 = j8 + j14;
        MathPreconditions.checkNoOverflow(((j8 ^ j14) < 0) | ((j8 ^ j15) >= 0), "checkedAdd", j8, j14);
        return j15;
    }

    public static long checkedMultiply(long j8, long j14) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j14) + Long.numberOfLeadingZeros(j14) + Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j8);
        if (iNumberOfLeadingZeros > 65) {
            return j8 * j14;
        }
        MathPreconditions.checkNoOverflow(iNumberOfLeadingZeros >= 64, "checkedMultiply", j8, j14);
        MathPreconditions.checkNoOverflow((j8 >= 0) | (j14 != Long.MIN_VALUE), "checkedMultiply", j8, j14);
        long j15 = j8 * j14;
        MathPreconditions.checkNoOverflow(j8 == 0 || j15 / j8 == j14, "checkedMultiply", j8, j14);
        return j15;
    }

    @GwtIncompatible
    public static long checkedPow(long j8, int i14) {
        int i15 = i14;
        MathPreconditions.checkNonNegative("exponent", i15);
        long jCheckedMultiply = 1;
        if (!(j8 >= -2) || !(j8 <= 2)) {
            long j14 = j8;
            while (i15 != 0) {
                if (i15 == 1) {
                    return checkedMultiply(jCheckedMultiply, j14);
                }
                if ((i15 & 1) != 0) {
                    jCheckedMultiply = checkedMultiply(jCheckedMultiply, j14);
                }
                i15 >>= 1;
                if (i15 > 0) {
                    MathPreconditions.checkNoOverflow(-3037000499L <= j14 && j14 <= FLOOR_SQRT_MAX_LONG, "checkedPow", j14, i15);
                    j14 *= j14;
                }
            }
            return jCheckedMultiply;
        }
        int i16 = (int) j8;
        if (i16 == -2) {
            MathPreconditions.checkNoOverflow(i15 < 64, "checkedPow", j8, i15);
            return (i15 & 1) == 0 ? 1 << i15 : (-1) << i15;
        }
        if (i16 == -1) {
            return (i15 & 1) == 0 ? 1L : -1L;
        }
        if (i16 == 0) {
            return i15 == 0 ? 1L : 0L;
        }
        if (i16 == 1) {
            return 1L;
        }
        if (i16 == 2) {
            MathPreconditions.checkNoOverflow(i15 < 63, "checkedPow", j8, i15);
            return 1 << i15;
        }
        e0.l();
        return 0L;
    }

    @GwtIncompatible
    public static long checkedSubtract(long j8, long j14) {
        long j15 = j8 - j14;
        MathPreconditions.checkNoOverflow(((j8 ^ j14) >= 0) | ((j8 ^ j15) >= 0), "checkedSubtract", j8, j14);
        return j15;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @GwtIncompatible
    public static long divide(long j8, long j14, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        long j15 = j8 / j14;
        long j16 = j8 - (j14 * j15);
        if (j16 == 0) {
            return j15;
        }
        int i14 = ((int) ((j8 ^ j14) >> 63)) | 1;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j16 == 0);
                return j15;
            case 2:
                return j15;
            case 3:
                if (i14 >= 0) {
                    return j15;
                }
                return j15 + ((long) i14);
            case 4:
                return j15 + ((long) i14);
            case 5:
                if (i14 <= 0) {
                    return j15;
                }
                return j15 + ((long) i14);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j16);
                long jAbs2 = jAbs - (Math.abs(j14) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j15) == 0)) {
                        return j15;
                    }
                } else if (jAbs2 <= 0) {
                    return j15;
                }
                return j15 + ((long) i14);
            default:
                e0.l();
                return 0L;
        }
    }

    @GwtIncompatible
    public static long factorial(int i14) {
        MathPreconditions.checkNonNegative(JWKParameterNames.RSA_MODULUS, i14);
        long[] jArr = factorials;
        if (i14 < jArr.length) {
            return jArr[i14];
        }
        return Long.MAX_VALUE;
    }

    public static boolean fitsInInt(long j8) {
        return ((long) ((int) j8)) == j8;
    }

    public static long floorPowerOfTwo(long j8) {
        MathPreconditions.checkPositive("x", j8);
        return 1 << (63 - Long.numberOfLeadingZeros(j8));
    }

    public static long gcd(long j8, long j14) {
        MathPreconditions.checkNonNegative("a", j8);
        MathPreconditions.checkNonNegative("b", j14);
        if (j8 == 0) {
            return j14;
        }
        if (j14 == 0) {
            return j8;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
        long jNumberOfTrailingZeros = j8 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j14);
        long j15 = j14 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j15) {
            long j16 = jNumberOfTrailingZeros - j15;
            long j17 = (j16 >> 63) & j16;
            long j18 = (j16 - j17) - j17;
            j15 += j17;
            jNumberOfTrailingZeros = j18 >> Long.numberOfTrailingZeros(j18);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(long j8) {
        return (j8 > 0) & ((j8 & (j8 - 1)) == 0);
    }

    @GwtIncompatible
    public static boolean isPrime(long j8) {
        if (j8 < 2) {
            MathPreconditions.checkNonNegative(JWKParameterNames.RSA_MODULUS, j8);
            return false;
        }
        if (j8 < 66) {
            return ((722865708377213483 >> (((int) j8) + (-2))) & 1) != 0;
        }
        if (((1 << ((int) (j8 % 30))) & SIEVE_30) != 0 || j8 % 7 == 0 || j8 % 11 == 0 || j8 % 13 == 0) {
            return false;
        }
        if (j8 < 289) {
            return true;
        }
        for (long[] jArr : millerRabinBaseSets) {
            if (j8 <= jArr[0]) {
                for (int i14 = 1; i14 < jArr.length; i14++) {
                    if (!MillerRabinTester.test(jArr[i14], j8)) {
                        return false;
                    }
                }
                return true;
            }
        }
        e0.l();
        return false;
    }

    @VisibleForTesting
    public static int lessThanBranchFree(long j8, long j14) {
        return (int) ((~(~(j8 - j14))) >>> 63);
    }

    @GwtIncompatible
    public static int log10(long j8, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", j8);
        int iLog10Floor = log10Floor(j8);
        long j14 = powersOf10[iLog10Floor];
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j8 == j14);
                return iLog10Floor;
            case 2:
            case 3:
                return iLog10Floor;
            case 4:
            case 5:
                return lessThanBranchFree(j14, j8) + iLog10Floor;
            case 6:
            case 7:
            case 8:
                return lessThanBranchFree(halfPowersOf10[iLog10Floor], j8) + iLog10Floor;
            default:
                e0.l();
                return 0;
        }
    }

    @GwtIncompatible
    public static int log10Floor(long j8) {
        byte b14 = maxLog10ForLeadingZeros[Long.numberOfLeadingZeros(j8)];
        return b14 - lessThanBranchFree(j8, powersOf10[b14]);
    }

    public static int log2(long j8, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", j8);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(j8));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j8 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j8);
                return lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> iNumberOfLeadingZeros, j8) + (63 - iNumberOfLeadingZeros);
            default:
                h.q("impossible");
                return 0;
        }
        return 63 - Long.numberOfLeadingZeros(j8);
    }

    public static long mean(long j8, long j14) {
        return (j8 & j14) + ((j8 ^ j14) >> 1);
    }

    @GwtIncompatible
    public static long mod(long j8, long j14) {
        if (j14 > 0) {
            long j15 = j8 % j14;
            return j15 >= 0 ? j15 : j15 + j14;
        }
        e.u("Modulus must be positive");
        return 0L;
    }

    public static long multiplyFraction(long j8, long j14, long j15) {
        if (j8 == 1) {
            return j14 / j15;
        }
        long jGcd = gcd(j8, j15);
        return (j14 / (j15 / jGcd)) * (j8 / jGcd);
    }

    @GwtIncompatible
    public static long pow(long j8, int i14) {
        MathPreconditions.checkNonNegative("exponent", i14);
        if (-2 > j8 || j8 > 2) {
            long j14 = 1;
            while (i14 != 0) {
                if (i14 == 1) {
                    return j14 * j8;
                }
                j14 *= (i14 & 1) == 0 ? 1L : j8;
                j8 *= j8;
                i14 >>= 1;
            }
            return j14;
        }
        int i15 = (int) j8;
        if (i15 == -2) {
            if (i14 < 64) {
                return (i14 & 1) == 0 ? 1 << i14 : -(1 << i14);
            }
            return 0L;
        }
        if (i15 == -1) {
            return (i14 & 1) == 0 ? 1L : -1L;
        }
        if (i15 == 0) {
            return i14 == 0 ? 1L : 0L;
        }
        if (i15 == 1) {
            return 1L;
        }
        if (i15 != 2) {
            e0.l();
            return 0L;
        }
        if (i14 < 64) {
            return 1 << i14;
        }
        return 0L;
    }

    @GwtIncompatible
    public static double roundToDouble(long j8, RoundingMode roundingMode) {
        double dNextUp;
        long jCeil;
        double d14 = j8;
        long j14 = (long) d14;
        int iCompare = j14 == Long.MAX_VALUE ? -1 : Long.compare(j8, j14);
        int[] iArr = AnonymousClass1.$SwitchMap$java$math$RoundingMode;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(iCompare == 0);
                return d14;
            case 2:
                if (j8 >= 0) {
                    if (iCompare < 0) {
                        return DoubleUtils.nextDown(d14);
                    }
                } else if (iCompare > 0) {
                    return Math.nextUp(d14);
                }
                return d14;
            case 3:
                if (iCompare < 0) {
                    return DoubleUtils.nextDown(d14);
                }
                return d14;
            case 4:
                if (j8 >= 0) {
                    if (iCompare > 0) {
                        return Math.nextUp(d14);
                    }
                } else if (iCompare < 0) {
                    return DoubleUtils.nextDown(d14);
                }
                return d14;
            case 5:
                if (iCompare > 0) {
                    return Math.nextUp(d14);
                }
                return d14;
            case 6:
            case 7:
            case 8:
                if (iCompare >= 0) {
                    dNextUp = Math.nextUp(d14);
                    jCeil = (long) Math.ceil(dNextUp);
                } else {
                    double dNextDown = DoubleUtils.nextDown(d14);
                    long jFloor = (long) Math.floor(dNextDown);
                    dNextUp = d14;
                    d14 = dNextDown;
                    jCeil = j14;
                    j14 = jFloor;
                }
                long j15 = j8 - j14;
                long j16 = jCeil - j8;
                if (jCeil == 9223372036854775807) {
                    j16++;
                }
                int iCompare2 = Long.compare(j15, j16);
                if (iCompare2 >= 0) {
                    if (iCompare2 <= 0) {
                        int i14 = iArr[roundingMode.ordinal()];
                        if (i14 != 6) {
                            if (i14 != 7) {
                                if (i14 != 8) {
                                    h.q("impossible");
                                    return 0.0d;
                                }
                                if ((DoubleUtils.getSignificand(d14) & 1) == 0) {
                                }
                            } else if (j8 >= 0) {
                            }
                        } else if (j8 >= 0) {
                        }
                    }
                    return dNextUp;
                }
                return d14;
            default:
                h.q("impossible");
                return 0.0d;
        }
    }

    public static long saturatedAdd(long j8, long j14) {
        long j15 = j8 + j14;
        return (((j14 ^ j8) > 0L ? 1 : ((j14 ^ j8) == 0L ? 0 : -1)) < 0) | ((j8 ^ j15) >= 0) ? j15 : ((j15 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long saturatedMultiply(long j8, long j14) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j14) + Long.numberOfLeadingZeros(j14) + Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j8);
        if (iNumberOfLeadingZeros > 65) {
            return j8 * j14;
        }
        long j15 = ((j8 ^ j14) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j14 == Long.MIN_VALUE) & (j8 < 0)))) {
            long j16 = j8 * j14;
            if (j8 == 0 || j16 / j8 == j14) {
                return j16;
            }
        }
        return j15;
    }

    public static long saturatedPow(long j8, int i14) {
        MathPreconditions.checkNonNegative("exponent", i14);
        long jSaturatedMultiply = 1;
        if (!(j8 >= -2) || !(j8 <= 2)) {
            long j14 = ((j8 >>> 63) & ((long) (i14 & 1))) + Long.MAX_VALUE;
            while (i14 != 0) {
                if (i14 == 1) {
                    return saturatedMultiply(jSaturatedMultiply, j8);
                }
                if ((i14 & 1) != 0) {
                    jSaturatedMultiply = saturatedMultiply(jSaturatedMultiply, j8);
                }
                i14 >>= 1;
                if (i14 > 0) {
                    if ((-3037000499L > j8) || (j8 > FLOOR_SQRT_MAX_LONG)) {
                        return j14;
                    }
                    j8 *= j8;
                }
            }
            return jSaturatedMultiply;
        }
        int i15 = (int) j8;
        if (i15 == -2) {
            if (i14 >= 64) {
                return ((long) (i14 & 1)) + Long.MAX_VALUE;
            }
            return (i14 & 1) == 0 ? 1 << i14 : (-1) << i14;
        }
        if (i15 == -1) {
            return (i14 & 1) == 0 ? 1L : -1L;
        }
        if (i15 == 0) {
            return i14 == 0 ? 1L : 0L;
        }
        if (i15 == 1) {
            return 1L;
        }
        if (i15 != 2) {
            e0.l();
            return 0L;
        }
        if (i14 >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << i14;
    }

    public static long saturatedSubtract(long j8, long j14) {
        long j15 = j8 - j14;
        return (((j14 ^ j8) > 0L ? 1 : ((j14 ^ j8) == 0L ? 0 : -1)) >= 0) | ((j8 ^ j15) >= 0) ? j15 : ((j15 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @GwtIncompatible
    public static long sqrt(long j8, RoundingMode roundingMode) {
        MathPreconditions.checkNonNegative("x", j8);
        if (fitsInInt(j8)) {
            return IntMath.sqrt((int) j8, roundingMode);
        }
        long jSqrt = (long) Math.sqrt(j8);
        long j14 = jSqrt * jSqrt;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j14 == j8);
                return jSqrt;
            case 2:
            case 3:
                return j8 < j14 ? jSqrt - 1 : jSqrt;
            case 4:
            case 5:
                return j8 > j14 ? jSqrt + 1 : jSqrt;
            case 6:
            case 7:
            case 8:
                long j15 = jSqrt - ((long) (j8 < j14 ? 1 : 0));
                return j15 + ((long) lessThanBranchFree((j15 * j15) + j15, j8));
            default:
                e0.l();
                return 0L;
        }
    }

    public enum MillerRabinTester {
        SMALL { // from class: com.google.common.math.LongMath.MillerRabinTester.1
            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j8, long j14, long j15) {
                return (j8 * j14) % j15;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j8, long j14) {
                return (j8 * j8) % j14;
            }
        },
        LARGE { // from class: com.google.common.math.LongMath.MillerRabinTester.2
            private long plusMod(long j8, long j14, long j15) {
                long j16 = j8 + j14;
                return j8 >= j15 - j14 ? j16 - j15 : j16;
            }

            private long times2ToThe32Mod(long j8, long j14) {
                int i14 = 32;
                do {
                    int iMin = Math.min(i14, Long.numberOfLeadingZeros(j8));
                    j8 = UnsignedLongs.remainder(j8 << iMin, j14);
                    i14 -= iMin;
                } while (i14 > 0);
                return j8;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j8, long j14, long j15) {
                long j16 = j8 >>> 32;
                long j17 = j14 >>> 32;
                long j18 = j8 & 4294967295L;
                long j19 = j14 & 4294967295L;
                long jTimes2ToThe32Mod = (j16 * j19) + times2ToThe32Mod(j16 * j17, j15);
                if (jTimes2ToThe32Mod < 0) {
                    jTimes2ToThe32Mod = UnsignedLongs.remainder(jTimes2ToThe32Mod, j15);
                }
                return plusMod(times2ToThe32Mod((j17 * j18) + jTimes2ToThe32Mod, j15), UnsignedLongs.remainder(j18 * j19, j15), j15);
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j8, long j14) {
                long j15 = j8 >>> 32;
                long j16 = j8 & 4294967295L;
                long jTimes2ToThe32Mod = times2ToThe32Mod(j15 * j15, j14);
                long jRemainder = j15 * j16 * 2;
                if (jRemainder < 0) {
                    jRemainder = UnsignedLongs.remainder(jRemainder, j14);
                }
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + jRemainder, j14), UnsignedLongs.remainder(j16 * j16, j14), j14);
            }
        };

        private long powMod(long j8, long j14, long j15) {
            long jSquareMod = j8;
            long jMulMod = 1;
            while (j14 != 0) {
                long j16 = j15;
                if ((j14 & 1) != 0) {
                    jMulMod = mulMod(jMulMod, jSquareMod, j16);
                }
                jSquareMod = squareMod(jSquareMod, j16);
                j14 >>= 1;
                j15 = j16;
            }
            return jMulMod;
        }

        public static boolean test(long j8, long j14) {
            return (j14 <= LongMath.FLOOR_SQRT_MAX_LONG ? SMALL : LARGE).testWitness(j8, j14);
        }

        private boolean testWitness(long j8, long j14) {
            long j15 = j14 - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j15);
            long j16 = j15 >> iNumberOfTrailingZeros;
            long j17 = j8 % j14;
            if (j17 == 0) {
                return true;
            }
            long jPowMod = powMod(j17, j16, j14);
            if (jPowMod == 1) {
                return true;
            }
            int i14 = 0;
            while (jPowMod != j15) {
                i14++;
                if (i14 == iNumberOfTrailingZeros) {
                    return false;
                }
                jPowMod = squareMod(jPowMod, j14);
            }
            return true;
        }

        public abstract long mulMod(long j8, long j14, long j15);

        public abstract long squareMod(long j8, long j14);

        /* synthetic */ MillerRabinTester(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    @GwtIncompatible
    public static int mod(long j8, int i14) {
        return (int) mod(j8, i14);
    }
}
