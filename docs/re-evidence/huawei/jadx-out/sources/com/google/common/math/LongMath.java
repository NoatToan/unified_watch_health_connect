package com.google.common.math;

import androidx.media3.exoplayer.MediaPeriodQueue;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.muxer.Mp4Utils;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedLongs;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.apr;
import java.math.RoundingMode;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class LongMath {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final byte[] f4623c = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};
    static final long[] h = {1, 10, 100, 1000, 10000, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};
    static final long[] e = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    static final long[] d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f4622b = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int[] f4621a = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, a.M, 169, 139, Constants.MAX_PRO_BOTTOM_MARGIN_PAD, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    private static final long[][] i = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    public static long b(long j, long j2) {
        long j3 = j + j2;
        return (((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: com.google.common.math.LongMath$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4624a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f4624a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4624a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4624a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4624a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4624a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4624a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4624a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4624a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long d(long j, long j2, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i2 = ((int) ((j ^ j2) >> 63)) | 1;
        switch (AnonymousClass3.f4624a[roundingMode.ordinal()]) {
            case 1:
                apr.e(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i2 >= 0) {
                    return j3;
                }
                return j3 + ((long) i2);
            case 4:
                return j3 + ((long) i2);
            case 5:
                if (i2 <= 0) {
                    return j3;
                }
                return j3 + ((long) i2);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                return j3 + ((long) i2);
            default:
                throw new AssertionError();
        }
    }

    public static long e(long j, long j2) {
        apr.c("a", j);
        apr.c("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long a(long j, long j2) {
        long j3 = j + j2;
        apr.a(((j ^ j2) < 0) | ((j ^ j3) >= 0), "checkedAdd", j, j2);
        return j3;
    }

    public static long c(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j3 = j * j2;
            if (j == 0 || j3 / j == j2) {
                return j3;
            }
        }
        return ((j ^ j2) >>> 63) + Long.MAX_VALUE;
    }

    /* JADX INFO: loaded from: classes21.dex */
    enum MillerRabinTester {
        SMALL { // from class: com.google.common.math.LongMath.MillerRabinTester.1
            @Override // com.google.common.math.LongMath.MillerRabinTester
            long mulMod(long j, long j2, long j3) {
                return (j * j2) % j3;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long squareMod(long j, long j2) {
                return (j * j) % j2;
            }
        },
        LARGE { // from class: com.google.common.math.LongMath.MillerRabinTester.2
            private long plusMod(long j, long j2, long j3) {
                long j4 = j + j2;
                return j >= j3 - j2 ? j4 - j3 : j4;
            }

            private long times2ToThe32Mod(long j, long j2) {
                int i = 32;
                do {
                    int iMin = Math.min(i, Long.numberOfLeadingZeros(j));
                    j = UnsignedLongs.a(j << iMin, j2);
                    i -= iMin;
                } while (i > 0);
                return j;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long mulMod(long j, long j2, long j3) {
                long j4 = j >>> 32;
                long j5 = j2 >>> 32;
                long j6 = j & Mp4Utils.UNSIGNED_INT_MAX_VALUE;
                long j7 = j2 & Mp4Utils.UNSIGNED_INT_MAX_VALUE;
                long jTimes2ToThe32Mod = times2ToThe32Mod(j4 * j5, j3) + (j4 * j7);
                if (jTimes2ToThe32Mod < 0) {
                    jTimes2ToThe32Mod = UnsignedLongs.a(jTimes2ToThe32Mod, j3);
                }
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + (j5 * j6), j3), UnsignedLongs.a(j6 * j7, j3), j3);
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long squareMod(long j, long j2) {
                long j3 = j >>> 32;
                long j4 = j & Mp4Utils.UNSIGNED_INT_MAX_VALUE;
                long jTimes2ToThe32Mod = times2ToThe32Mod(j3 * j3, j2);
                long jA = j3 * j4 * 2;
                if (jA < 0) {
                    jA = UnsignedLongs.a(jA, j2);
                }
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + jA, j2), UnsignedLongs.a(j4 * j4, j2), j2);
            }
        };

        abstract long mulMod(long j, long j2, long j3);

        abstract long squareMod(long j, long j2);

        /* synthetic */ MillerRabinTester(AnonymousClass3 anonymousClass3) {
            this();
        }

        static boolean test(long j, long j2) {
            return (j2 <= 3037000499L ? SMALL : LARGE).testWitness(j, j2);
        }

        private long powMod(long j, long j2, long j3) {
            long jMulMod = 1;
            while (j2 != 0) {
                if ((j2 & 1) != 0) {
                    jMulMod = mulMod(jMulMod, j, j3);
                }
                j = squareMod(j, j3);
                j2 >>= 1;
            }
            return jMulMod;
        }

        private boolean testWitness(long j, long j2) {
            long j3 = j2 - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
            long j4 = j % j2;
            if (j4 == 0) {
                return true;
            }
            long jPowMod = powMod(j4, j3 >> iNumberOfTrailingZeros, j2);
            if (jPowMod == 1) {
                return true;
            }
            int i = 0;
            while (jPowMod != j3) {
                i++;
                if (i == iNumberOfTrailingZeros) {
                    return false;
                }
                jPowMod = squareMod(jPowMod, j2);
            }
            return true;
        }
    }
}
