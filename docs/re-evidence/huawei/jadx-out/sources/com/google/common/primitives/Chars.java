package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Chars {
    public static int a(char c2, char c3) {
        return c2 - c3;
    }

    public static char d(byte b2, byte b3) {
        return (char) ((b2 << 8) | (b3 & 255));
    }

    public static char d(long j) {
        char c2 = (char) j;
        Preconditions.checkArgument(((long) c2) == j, "Out of range: %s", j);
        return c2;
    }

    public static boolean d(char[] cArr, char c2) {
        for (char c3 : cArr) {
            if (c3 == c2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: loaded from: classes21.dex */
    enum LexicographicalComparator implements Comparator<char[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(char[] cArr, char[] cArr2) {
            int iMin = Math.min(cArr.length, cArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iA = Chars.a(cArr[i], cArr2[i]);
                if (iA != 0) {
                    return iA;
                }
            }
            return cArr.length - cArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }
    }
}
