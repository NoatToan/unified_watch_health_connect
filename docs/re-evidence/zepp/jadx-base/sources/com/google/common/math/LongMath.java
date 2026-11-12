package com.google.common.math;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedLongs;
import com.huami.heartrate.constant.ConstantKt;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
public final class LongMath {

    @VisibleForTesting
    public static final long a = 4611686018427387904L;

    @VisibleForTesting
    public static final long b = -5402926248376769404L;

    @VisibleForTesting
    public static final long f = 3037000499L;
    private static final int j = -545925251;

    @VisibleForTesting
    public static final byte[] c = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    @VisibleForTesting
    @GwtIncompatible
    public static final long[] d = {1, 10, 100, 1000, 10000, com.google.android.exoplayer2.extractor.mp3.b.e, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    @VisibleForTesting
    @GwtIncompatible
    public static final long[] e = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    public static final long[] g = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    public static final int[] h = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, WeightingState.state_bodyfat_detail, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    @VisibleForTesting
    public static final int[] i = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, ConstantKt.DRAW_END_INDEX, FTPCodes.HELP_MESSAGE, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    private static final long[][] k = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

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
                a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b LARGE;
        public static final b SMALL;

        public static enum a extends b {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.math.LongMath.b
            public long a(long j, long j2, long j3) {
                return (j * j2) % j3;
            }

            @Override // com.google.common.math.LongMath.b
            public long c(long j, long j2) {
                return (j * j) % j2;
            }
        }

        /* JADX INFO: renamed from: com.google.common.math.LongMath$b$b, reason: collision with other inner class name */
        public static enum C0224b extends b {
            public C0224b(String str, int i) {
                super(str, i, null);
            }

            private long g(long j, long j2, long j3) {
                long j4 = j + j2;
                return j >= j3 - j2 ? j4 - j3 : j4;
            }

            private long h(long j, long j2) {
                int i = 32;
                do {
                    int iMin = Math.min(i, Long.numberOfLeadingZeros(j));
                    j = UnsignedLongs.remainder(j << iMin, j2);
                    i -= iMin;
                } while (i > 0);
                return j;
            }

            @Override // com.google.common.math.LongMath.b
            public long a(long j, long j2, long j3) {
                long j4 = j >>> 32;
                long j5 = j2 >>> 32;
                long j6 = j & 4294967295L;
                long j7 = j2 & 4294967295L;
                long jH = h(j4 * j5, j3) + (j4 * j7);
                if (jH < 0) {
                    jH = UnsignedLongs.remainder(jH, j3);
                }
                Long.signum(j6);
                return g(h(jH + (j5 * j6), j3), UnsignedLongs.remainder(j6 * j7, j3), j3);
            }

            @Override // com.google.common.math.LongMath.b
            public long c(long j, long j2) {
                long j3 = j >>> 32;
                long j4 = j & 4294967295L;
                long jH = h(j3 * j3, j2);
                long jRemainder = j3 * j4 * 2;
                if (jRemainder < 0) {
                    jRemainder = UnsignedLongs.remainder(jRemainder, j2);
                }
                return g(h(jH + jRemainder, j2), UnsignedLongs.remainder(j4 * j4, j2), j2);
            }
        }

        static {
            a aVar = new a("SMALL", 0);
            SMALL = aVar;
            C0224b c0224b = new C0224b("LARGE", 1);
            LARGE = c0224b;
            $VALUES = new b[]{aVar, c0224b};
        }

        private b(String str, int i) {
            super(str, i);
        }

        private long b(long j, long j2, long j3) {
            long jA = 1;
            while (j2 != 0) {
                if ((j2 & 1) != 0) {
                    jA = a(jA, j, j3);
                }
                j = c(j, j3);
                j2 >>= 1;
            }
            return jA;
        }

        public static boolean e(long j, long j2) {
            return (j2 <= LongMath.f ? SMALL : LARGE).f(j, j2);
        }

        private boolean f(long j, long j2) {
            long j3 = j2 - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
            long j4 = j3 >> iNumberOfTrailingZeros;
            long j5 = j % j2;
            if (j5 == 0) {
                return true;
            }
            long jB = b(j5, j4, j2);
            if (jB == 1) {
                return true;
            }
            int i = 0;
            while (jB != j3) {
                i++;
                if (i == iNumberOfTrailingZeros) {
                    return false;
                }
                jB = c(jB, j2);
            }
            return true;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public abstract long a(long j, long j2, long j3);

        public abstract long c(long j, long j2);

        public /* synthetic */ b(String str, int i, a aVar) {
            this(str, i);
        }
    }

    private LongMath() {
    }

    public static boolean a(long j2) {
        return ((long) ((int) j2)) == j2;
    }

    @VisibleForTesting
    public static int b(long j2, long j3) {
        return (int) ((~(~(j2 - j3))) >>> 63);
    }

    public static long binomial(int i2, int i3) {
        com.google.common.math.b.e(GoogleApiAvailabilityLight.b, i2);
        com.google.common.math.b.e(hl.k, i3);
        Preconditions.checkArgument(i3 <= i2, "k (%s) > n (%s)", i3, i2);
        if (i3 > (i2 >> 1)) {
            i3 = i2 - i3;
        }
        long jD = 1;
        if (i3 == 0) {
            return 1L;
        }
        if (i3 == 1) {
            return i2;
        }
        long[] jArr = g;
        if (i2 < jArr.length) {
            return jArr[i2] / (jArr[i3] * jArr[i2 - i3]);
        }
        int[] iArr = h;
        if (i3 >= iArr.length || i2 > iArr[i3]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = i;
        if (i3 < iArr2.length && i2 <= iArr2[i3]) {
            int i4 = i2 - 1;
            long j2 = i2;
            for (int i5 = 2; i5 <= i3; i5++) {
                j2 = (j2 * ((long) i4)) / ((long) i5);
                i4--;
            }
            return j2;
        }
        long j3 = i2;
        int iLog2 = log2(j3, RoundingMode.CEILING);
        int i6 = i2 - 1;
        int i7 = iLog2;
        long j4 = j3;
        int i8 = 2;
        long j5 = 1;
        while (i8 <= i3) {
            i7 += iLog2;
            if (i7 < 63) {
                j4 *= (long) i6;
                j5 *= (long) i8;
            } else {
                jD = d(jD, j4, j5);
                j4 = i6;
                j5 = i8;
                i7 = iLog2;
            }
            i8++;
            i6--;
        }
        return d(jD, j4, j5);
    }

    @GwtIncompatible
    public static int c(long j2) {
        byte b2 = c[Long.numberOfLeadingZeros(j2)];
        return b2 - b(j2, d[b2]);
    }

    @Beta
    public static long ceilingPowerOfTwo(long j2) {
        com.google.common.math.b.i("x", j2);
        if (j2 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(j2 - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + j2 + ") is not representable as a long");
    }

    @GwtIncompatible
    public static long checkedAdd(long j2, long j3) {
        long j4 = j2 + j3;
        com.google.common.math.b.c(((j2 ^ j3) < 0) | ((j2 ^ j4) >= 0), "checkedAdd", j2, j3);
        return j4;
    }

    public static long checkedMultiply(long j2, long j3) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j3);
        if (iNumberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        com.google.common.math.b.c(iNumberOfLeadingZeros >= 64, "checkedMultiply", j2, j3);
        com.google.common.math.b.c((j2 >= 0) | (j3 != Long.MIN_VALUE), "checkedMultiply", j2, j3);
        long j4 = j2 * j3;
        com.google.common.math.b.c(j2 == 0 || j4 / j2 == j3, "checkedMultiply", j2, j3);
        return j4;
    }

    @GwtIncompatible
    public static long checkedPow(long j2, int i2) {
        int i3 = i2;
        com.google.common.math.b.e("exponent", i3);
        if ((j2 >= -2) && (j2 <= 2)) {
            int i4 = (int) j2;
            if (i4 == -2) {
                com.google.common.math.b.c(i3 < 64, "checkedPow", j2, i3);
                return (i3 & 1) == 0 ? 1 << i3 : (-1) << i3;
            }
            if (i4 == -1) {
                return (i3 & 1) == 0 ? 1L : -1L;
            }
            if (i4 == 0) {
                return i3 == 0 ? 1L : 0L;
            }
            if (i4 == 1) {
                return 1L;
            }
            if (i4 != 2) {
                throw new AssertionError();
            }
            com.google.common.math.b.c(i3 < 63, "checkedPow", j2, i3);
            return 1 << i3;
        }
        long jCheckedMultiply = 1;
        long j3 = j2;
        while (i3 != 0) {
            if (i3 == 1) {
                return checkedMultiply(jCheckedMultiply, j3);
            }
            if ((i3 & 1) != 0) {
                jCheckedMultiply = checkedMultiply(jCheckedMultiply, j3);
            }
            long j4 = jCheckedMultiply;
            int i5 = i3 >> 1;
            if (i5 > 0) {
                com.google.common.math.b.c(-3037000499L <= j3 && j3 <= f, "checkedPow", j3, i5);
                j3 *= j3;
            }
            jCheckedMultiply = j4;
            i3 = i5;
        }
        return jCheckedMultiply;
    }

    @GwtIncompatible
    public static long checkedSubtract(long j2, long j3) {
        long j4 = j2 - j3;
        com.google.common.math.b.c(((j2 ^ j3) >= 0) | ((j2 ^ j4) >= 0), "checkedSubtract", j2, j3);
        return j4;
    }

    public static long d(long j2, long j3, long j4) {
        if (j2 == 1) {
            return j3 / j4;
        }
        long jGcd = gcd(j2, j4);
        return (j2 / jGcd) * (j3 / (j4 / jGcd));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @GwtIncompatible
    public static long divide(long j2, long j3, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        long j4 = j2 / j3;
        long j5 = j2 - (j3 * j4);
        if (j5 == 0) {
            return j4;
        }
        int i2 = (int) ((j2 ^ j3) >> 63);
        boolean z = true;
        int i3 = i2 | 1;
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.b.k(j5 == 0);
                z = false;
                if (z) {
                    return j4 + ((long) i3);
                }
                return j4;
            case 2:
                z = false;
                if (z) {
                    return j4 + ((long) i3);
                }
                return j4;
            case 3:
                if (i3 >= 0) {
                    z = false;
                }
                if (z) {
                    return j4 + ((long) i3);
                }
                return j4;
            case 4:
                if (z) {
                    return j4 + ((long) i3);
                }
                return j4;
            case 5:
                if (i3 <= 0) {
                    z = false;
                }
                if (z) {
                    return j4 + ((long) i3);
                }
                return j4;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j5);
                long jAbs2 = jAbs - (Math.abs(j3) - jAbs);
                if (jAbs2 == 0) {
                    z = (((1 & j4) != 0) & (roundingMode == RoundingMode.HALF_EVEN)) | (roundingMode == RoundingMode.HALF_UP);
                } else if (jAbs2 <= 0) {
                    z = false;
                }
                if (z) {
                    return j4 + ((long) i3);
                }
                return j4;
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static long factorial(int i2) {
        com.google.common.math.b.e(GoogleApiAvailabilityLight.b, i2);
        long[] jArr = g;
        if (i2 < jArr.length) {
            return jArr[i2];
        }
        return Long.MAX_VALUE;
    }

    @Beta
    public static long floorPowerOfTwo(long j2) {
        com.google.common.math.b.i("x", j2);
        return 1 << (63 - Long.numberOfLeadingZeros(j2));
    }

    public static long gcd(long j2, long j3) {
        com.google.common.math.b.f("a", j2);
        com.google.common.math.b.f("b", j3);
        if (j2 == 0) {
            return j3;
        }
        if (j3 == 0) {
            return j2;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
        long jNumberOfTrailingZeros = j2 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
        long j4 = j3 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j4) {
            long j5 = jNumberOfTrailingZeros - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            jNumberOfTrailingZeros = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(long j2) {
        return (j2 > 0) & ((j2 & (j2 - 1)) == 0);
    }

    @Beta
    @GwtIncompatible
    public static boolean isPrime(long j2) {
        if (j2 < 2) {
            com.google.common.math.b.f(GoogleApiAvailabilityLight.b, j2);
            return false;
        }
        if (j2 == 2 || j2 == 3 || j2 == 5 || j2 == 7 || j2 == 11 || j2 == 13) {
            return true;
        }
        if ((j & (1 << ((int) (j2 % 30)))) != 0 || j2 % 7 == 0 || j2 % 11 == 0 || j2 % 13 == 0) {
            return false;
        }
        if (j2 < 289) {
            return true;
        }
        for (long[] jArr : k) {
            if (j2 <= jArr[0]) {
                for (int i2 = 1; i2 < jArr.length; i2++) {
                    if (!b.e(jArr[i2], j2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new AssertionError();
    }

    @GwtIncompatible
    public static int log10(long j2, RoundingMode roundingMode) {
        int iB;
        com.google.common.math.b.i("x", j2);
        int iC = c(j2);
        long j3 = d[iC];
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.b.k(j2 == j3);
            case 2:
            case 3:
                return iC;
            case 4:
            case 5:
                iB = b(j3, j2);
                return iC + iB;
            case 6:
            case 7:
            case 8:
                iB = b(e[iC], j2);
                return iC + iB;
            default:
                throw new AssertionError();
        }
    }

    public static int log2(long j2, RoundingMode roundingMode) {
        com.google.common.math.b.i("x", j2);
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.b.k(isPowerOfTwo(j2));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
                return (63 - iNumberOfLeadingZeros) + b(b >>> iNumberOfLeadingZeros, j2);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(j2);
    }

    public static long mean(long j2, long j3) {
        return (j2 & j3) + ((j2 ^ j3) >> 1);
    }

    @GwtIncompatible
    public static int mod(long j2, int i2) {
        return (int) mod(j2, i2);
    }

    @GwtIncompatible
    public static long pow(long j2, int i2) {
        com.google.common.math.b.e("exponent", i2);
        if (-2 > j2 || j2 > 2) {
            long j3 = 1;
            while (i2 != 0) {
                if (i2 == 1) {
                    return j3 * j2;
                }
                j3 *= (i2 & 1) == 0 ? 1L : j2;
                j2 *= j2;
                i2 >>= 1;
            }
            return j3;
        }
        int i3 = (int) j2;
        if (i3 == -2) {
            if (i2 < 64) {
                return (i2 & 1) == 0 ? 1 << i2 : -(1 << i2);
            }
            return 0L;
        }
        if (i3 == -1) {
            return (i2 & 1) == 0 ? 1L : -1L;
        }
        if (i3 == 0) {
            return i2 == 0 ? 1L : 0L;
        }
        if (i3 == 1) {
            return 1L;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        if (i2 < 64) {
            return 1 << i2;
        }
        return 0L;
    }

    @Beta
    public static long saturatedAdd(long j2, long j3) {
        long j4 = j2 + j3;
        return (((j3 ^ j2) > 0L ? 1 : ((j3 ^ j2) == 0L ? 0 : -1)) < 0) | ((j2 ^ j4) >= 0) ? j4 : ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @Beta
    public static long saturatedMultiply(long j2, long j3) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j3);
        if (iNumberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        long j4 = ((j2 ^ j3) >>> 63) + Long.MAX_VALUE;
        if ((iNumberOfLeadingZeros < 64) || ((j3 == Long.MIN_VALUE) & (j2 < 0))) {
            return j4;
        }
        long j5 = j2 * j3;
        return (j2 == 0 || j5 / j2 == j3) ? j5 : j4;
    }

    @Beta
    public static long saturatedPow(long j2, int i2) {
        com.google.common.math.b.e("exponent", i2);
        long jSaturatedMultiply = 1;
        if (!(j2 >= -2) || !(j2 <= 2)) {
            long j3 = ((j2 >>> 63) & ((long) (i2 & 1))) + Long.MAX_VALUE;
            while (i2 != 0) {
                if (i2 == 1) {
                    return saturatedMultiply(jSaturatedMultiply, j2);
                }
                if ((i2 & 1) != 0) {
                    jSaturatedMultiply = saturatedMultiply(jSaturatedMultiply, j2);
                }
                i2 >>= 1;
                if (i2 > 0) {
                    if ((-3037000499L > j2) || (j2 > f)) {
                        return j3;
                    }
                    j2 *= j2;
                }
            }
            return jSaturatedMultiply;
        }
        int i3 = (int) j2;
        if (i3 == -2) {
            if (i2 >= 64) {
                return ((long) (i2 & 1)) + Long.MAX_VALUE;
            }
            return (i2 & 1) == 0 ? 1 << i2 : (-1) << i2;
        }
        if (i3 == -1) {
            return (i2 & 1) == 0 ? 1L : -1L;
        }
        if (i3 == 0) {
            return i2 == 0 ? 1L : 0L;
        }
        if (i3 == 1) {
            return 1L;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        if (i2 >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << i2;
    }

    @Beta
    public static long saturatedSubtract(long j2, long j3) {
        long j4 = j2 - j3;
        return (((j3 ^ j2) > 0L ? 1 : ((j3 ^ j2) == 0L ? 0 : -1)) >= 0) | ((j2 ^ j4) >= 0) ? j4 : ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @GwtIncompatible
    public static long sqrt(long j2, RoundingMode roundingMode) {
        com.google.common.math.b.f("x", j2);
        if (a(j2)) {
            return IntMath.sqrt((int) j2, roundingMode);
        }
        long jSqrt = (long) Math.sqrt(j2);
        long j3 = jSqrt * jSqrt;
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                com.google.common.math.b.k(j3 == j2);
                return jSqrt;
            case 2:
            case 3:
                return j2 < j3 ? jSqrt - 1 : jSqrt;
            case 4:
            case 5:
                return j2 > j3 ? jSqrt + 1 : jSqrt;
            case 6:
            case 7:
            case 8:
                long j4 = jSqrt - ((long) (j2 >= j3 ? 0 : 1));
                return j4 + ((long) b((j4 * j4) + j4, j2));
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static long mod(long j2, long j3) {
        if (j3 <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long j4 = j2 % j3;
        return j4 >= 0 ? j4 : j4 + j3;
    }
}
