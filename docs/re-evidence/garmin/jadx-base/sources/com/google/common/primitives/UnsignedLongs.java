package com.google.common.primitives;

import am.j;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import fb1.c;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class UnsignedLongs {
    public static final long MAX_VALUE = -1;

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i14 = 0; i14 < iMin; i14++) {
                long j8 = jArr[i14];
                long j14 = jArr2[i14];
                if (j8 != j14) {
                    return UnsignedLongs.compare(j8, j14);
                }
            }
            return jArr.length - jArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    public static final class ParseOverflowDetection {
        static final long[] maxValueDivs = new long[37];
        static final int[] maxValueMods = new int[37];
        static final int[] maxSafeDigits = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i14 = 2; i14 <= 36; i14++) {
                long j8 = i14;
                maxValueDivs[i14] = UnsignedLongs.divide(-1L, j8);
                maxValueMods[i14] = (int) UnsignedLongs.remainder(-1L, j8);
                maxSafeDigits[i14] = bigInteger.toString(i14).length() - 1;
            }
        }

        private ParseOverflowDetection() {
        }

        public static boolean overflowInParse(long j8, int i14, int i15) {
            if (j8 < 0) {
                return true;
            }
            long j14 = maxValueDivs[i15];
            if (j8 < j14) {
                return false;
            }
            return j8 > j14 || i14 > maxValueMods[i15];
        }
    }

    private UnsignedLongs() {
    }

    public static int compare(long j8, long j14) {
        return Longs.compare(flip(j8), flip(j14));
    }

    @CanIgnoreReturnValue
    public static long decode(String str) {
        ParseRequest parseRequestFromString = ParseRequest.fromString(str);
        try {
            return parseUnsignedLong(parseRequestFromString.rawValue, parseRequestFromString.radix);
        } catch (NumberFormatException e4) {
            NumberFormatException numberFormatException = new NumberFormatException(c.n("Error parsing value: ", str));
            numberFormatException.initCause(e4);
            throw numberFormatException;
        }
    }

    public static long divide(long j8, long j14) {
        if (j14 < 0) {
            return compare(j8, j14) < 0 ? 0L : 1L;
        }
        if (j8 >= 0) {
            return j8 / j14;
        }
        long j15 = ((j8 >>> 1) / j14) << 1;
        return j15 + ((long) (compare(j8 - (j15 * j14), j14) < 0 ? 0 : 1));
    }

    private static long flip(long j8) {
        return j8 ^ Long.MIN_VALUE;
    }

    public static String join(String str, long... jArr) {
        Preconditions.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder(jArr.length * 5);
        sb3.append(toString(jArr[0]));
        for (int i14 = 1; i14 < jArr.length; i14++) {
            sb3.append(str);
            sb3.append(toString(jArr[i14]));
        }
        return sb3.toString();
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static long max(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long jFlip = flip(jArr[0]);
        for (int i14 = 1; i14 < jArr.length; i14++) {
            long jFlip2 = flip(jArr[i14]);
            if (jFlip2 > jFlip) {
                jFlip = jFlip2;
            }
        }
        return flip(jFlip);
    }

    public static long min(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long jFlip = flip(jArr[0]);
        for (int i14 = 1; i14 < jArr.length; i14++) {
            long jFlip2 = flip(jArr[i14]);
            if (jFlip2 < jFlip) {
                jFlip = jFlip2;
            }
        }
        return flip(jFlip);
    }

    @CanIgnoreReturnValue
    public static long parseUnsignedLong(String str, int i14) {
        Preconditions.checkNotNull(str);
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (i14 < 2 || i14 > 36) {
            throw new NumberFormatException(j.h(i14, "illegal radix: "));
        }
        int i15 = ParseOverflowDetection.maxSafeDigits[i14] - 1;
        long j8 = 0;
        for (int i16 = 0; i16 < str.length(); i16++) {
            int iDigit = Character.digit(str.charAt(i16), i14);
            if (iDigit == -1) {
                throw new NumberFormatException(str);
            }
            if (i16 > i15 && ParseOverflowDetection.overflowInParse(j8, iDigit, i14)) {
                throw new NumberFormatException("Too large for unsigned long: ".concat(str));
            }
            j8 = (j8 * ((long) i14)) + ((long) iDigit);
        }
        return j8;
    }

    public static long remainder(long j8, long j14) {
        if (j14 < 0) {
            return compare(j8, j14) < 0 ? j8 : j8 - j14;
        }
        if (j8 >= 0) {
            return j8 % j14;
        }
        long j15 = j8 - ((((j8 >>> 1) / j14) << 1) * j14);
        if (compare(j15, j14) < 0) {
            j14 = 0;
        }
        return j15 - j14;
    }

    public static void sort(long[] jArr, int i14, int i15) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i14, i15, jArr.length);
        for (int i16 = i14; i16 < i15; i16++) {
            jArr[i16] = flip(jArr[i16]);
        }
        Arrays.sort(jArr, i14, i15);
        while (i14 < i15) {
            jArr[i14] = flip(jArr[i14]);
            i14++;
        }
    }

    public static void sortDescending(long[] jArr, int i14, int i15) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i14, i15, jArr.length);
        for (int i16 = i14; i16 < i15; i16++) {
            jArr[i16] = Long.MAX_VALUE ^ jArr[i16];
        }
        Arrays.sort(jArr, i14, i15);
        while (i14 < i15) {
            jArr[i14] = jArr[i14] ^ Long.MAX_VALUE;
            i14++;
        }
    }

    public static String toString(long j8, int i14) {
        Preconditions.checkArgument(i14 >= 2 && i14 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i14);
        if (j8 == 0) {
            return "0";
        }
        if (j8 > 0) {
            return Long.toString(j8, i14);
        }
        int i15 = 64;
        char[] cArr = new char[64];
        int i16 = i14 - 1;
        if ((i14 & i16) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i14);
            do {
                i15--;
                cArr[i15] = Character.forDigit(((int) j8) & i16, i14);
                j8 >>>= iNumberOfTrailingZeros;
            } while (j8 != 0);
        } else {
            long jDivide = (i14 & 1) == 0 ? (j8 >>> 1) / ((long) (i14 >>> 1)) : divide(j8, i14);
            long j14 = i14;
            int i17 = 63;
            cArr[63] = Character.forDigit((int) (j8 - (jDivide * j14)), i14);
            while (jDivide > 0) {
                i17--;
                cArr[i17] = Character.forDigit((int) (jDivide % j14), i14);
                jDivide /= j14;
            }
            i15 = i17;
        }
        return new String(cArr, i15, 64 - i15);
    }

    public static void sortDescending(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    public static void sort(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sort(jArr, 0, jArr.length);
    }

    @CanIgnoreReturnValue
    public static long parseUnsignedLong(String str) {
        return parseUnsignedLong(str, 10);
    }

    public static String toString(long j8) {
        return toString(j8, 10);
    }
}
