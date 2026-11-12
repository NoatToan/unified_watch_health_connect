package com.google.common.primitives;

import androidx.media3.muxer.Mp4Utils;
import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class UnsignedInts {
    static int d(int i) {
        return i ^ Integer.MIN_VALUE;
    }

    public static long e(int i) {
        return ((long) i) & Mp4Utils.UNSIGNED_INT_MAX_VALUE;
    }

    public static int e(int i, int i2) {
        return Ints.d(d(i), d(i2));
    }

    enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < iMin; i++) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                if (i2 != i3) {
                    return UnsignedInts.e(i2, i3);
                }
            }
            return iArr.length - iArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }
}
