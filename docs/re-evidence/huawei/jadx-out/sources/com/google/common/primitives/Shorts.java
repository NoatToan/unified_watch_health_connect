package com.google.common.primitives;

import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class Shorts extends ShortsMethodsForWeb {
    public static int a(short s, short s2) {
        return s - s2;
    }

    enum LexicographicalComparator implements Comparator<short[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(short[] sArr, short[] sArr2) {
            int iMin = Math.min(sArr.length, sArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iA = Shorts.a(sArr[i], sArr2[i]);
                if (iA != 0) {
                    return iA;
                }
            }
            return sArr.length - sArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }
}
