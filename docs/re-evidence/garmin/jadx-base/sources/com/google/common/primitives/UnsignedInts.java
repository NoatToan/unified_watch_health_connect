package com.google.common.primitives;

import c22.t;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import fb1.c;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class UnsignedInts {
    static final long INT_MASK = 4294967295L;

    public enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = Math.min(iArr.length, iArr2.length);
            for (int i14 = 0; i14 < iMin; i14++) {
                int i15 = iArr[i14];
                int i16 = iArr2[i14];
                if (i15 != i16) {
                    return UnsignedInts.compare(i15, i16);
                }
            }
            return iArr.length - iArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }

    private UnsignedInts() {
    }

    public static int checkedCast(long j8) {
        Preconditions.checkArgument((j8 >> 32) == 0, "out of range: %s", j8);
        return (int) j8;
    }

    public static int compare(int i14, int i15) {
        return Ints.compare(flip(i14), flip(i15));
    }

    @CanIgnoreReturnValue
    public static int decode(String str) {
        ParseRequest parseRequestFromString = ParseRequest.fromString(str);
        try {
            return parseUnsignedInt(parseRequestFromString.rawValue, parseRequestFromString.radix);
        } catch (NumberFormatException e4) {
            NumberFormatException numberFormatException = new NumberFormatException(c.n("Error parsing value: ", str));
            numberFormatException.initCause(e4);
            throw numberFormatException;
        }
    }

    public static int divide(int i14, int i15) {
        return (int) (toLong(i14) / toLong(i15));
    }

    public static int flip(int i14) {
        return i14 ^ Integer.MIN_VALUE;
    }

    public static String join(String str, int... iArr) {
        Preconditions.checkNotNull(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder(iArr.length * 5);
        sb3.append(toString(iArr[0]));
        for (int i14 = 1; i14 < iArr.length; i14++) {
            sb3.append(str);
            sb3.append(toString(iArr[i14]));
        }
        return sb3.toString();
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static int max(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        int iFlip = flip(iArr[0]);
        for (int i14 = 1; i14 < iArr.length; i14++) {
            int iFlip2 = flip(iArr[i14]);
            if (iFlip2 > iFlip) {
                iFlip = iFlip2;
            }
        }
        return flip(iFlip);
    }

    public static int min(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        int iFlip = flip(iArr[0]);
        for (int i14 = 1; i14 < iArr.length; i14++) {
            int iFlip2 = flip(iArr[i14]);
            if (iFlip2 < iFlip) {
                iFlip = iFlip2;
            }
        }
        return flip(iFlip);
    }

    @CanIgnoreReturnValue
    public static int parseUnsignedInt(String str, int i14) {
        Preconditions.checkNotNull(str);
        long j8 = Long.parseLong(str, i14);
        if ((INT_MASK & j8) == j8) {
            return (int) j8;
        }
        throw new NumberFormatException(t.e(i14, "Input ", str, " in base ", " is not in the range of an unsigned integer"));
    }

    public static int remainder(int i14, int i15) {
        return (int) (toLong(i14) % toLong(i15));
    }

    public static int saturatedCast(long j8) {
        if (j8 <= 0) {
            return 0;
        }
        if (j8 >= 4294967296L) {
            return -1;
        }
        return (int) j8;
    }

    public static void sort(int[] iArr, int i14, int i15) {
        Preconditions.checkNotNull(iArr);
        Preconditions.checkPositionIndexes(i14, i15, iArr.length);
        for (int i16 = i14; i16 < i15; i16++) {
            iArr[i16] = flip(iArr[i16]);
        }
        Arrays.sort(iArr, i14, i15);
        while (i14 < i15) {
            iArr[i14] = flip(iArr[i14]);
            i14++;
        }
    }

    public static void sortDescending(int[] iArr, int i14, int i15) {
        Preconditions.checkNotNull(iArr);
        Preconditions.checkPositionIndexes(i14, i15, iArr.length);
        for (int i16 = i14; i16 < i15; i16++) {
            iArr[i16] = Integer.MAX_VALUE ^ iArr[i16];
        }
        Arrays.sort(iArr, i14, i15);
        while (i14 < i15) {
            iArr[i14] = iArr[i14] ^ Integer.MAX_VALUE;
            i14++;
        }
    }

    public static long toLong(int i14) {
        return ((long) i14) & INT_MASK;
    }

    public static String toString(int i14, int i15) {
        return Long.toString(((long) i14) & INT_MASK, i15);
    }

    public static String toString(int i14) {
        return toString(i14, 10);
    }

    @CanIgnoreReturnValue
    public static int parseUnsignedInt(String str) {
        return parseUnsignedInt(str, 10);
    }

    public static void sortDescending(int[] iArr) {
        Preconditions.checkNotNull(iArr);
        sortDescending(iArr, 0, iArr.length);
    }

    public static void sort(int[] iArr) {
        Preconditions.checkNotNull(iArr);
        sort(iArr, 0, iArr.length);
    }
}
