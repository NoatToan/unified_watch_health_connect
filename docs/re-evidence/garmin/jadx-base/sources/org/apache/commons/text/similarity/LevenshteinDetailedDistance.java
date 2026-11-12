package org.apache.commons.text.similarity;

import java.lang.reflect.Array;
import java.util.Arrays;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class LevenshteinDetailedDistance implements EditDistance<LevenshteinResults> {
    private static final LevenshteinDetailedDistance DEFAULT_INSTANCE = new LevenshteinDetailedDistance();
    private final Integer threshold;

    public LevenshteinDetailedDistance(Integer num) {
        if (num == null || num.intValue() >= 0) {
            this.threshold = num;
        } else {
            h.s("Threshold must not be negative");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0066 A[PHI: r0 r1
      0x0066: PHI (r0v6 int) = (r0v3 int), (r0v1 int) binds: [B:42:0x007b, B:33:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r1v5 int) = (r1v1 int), (r1v6 int) binds: [B:42:0x007b, B:33:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x006a A[PHI: r0 r1
      0x006a: PHI (r0v4 int) = (r0v3 int), (r0v1 int) binds: [B:42:0x007b, B:33:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r1v3 int) = (r1v1 int), (r1v6 int) binds: [B:42:0x007b, B:33:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    private static LevenshteinResults findDetailedResults(CharSequence charSequence, CharSequence charSequence2, int[][] iArr, boolean z14) {
        boolean z15;
        int length = charSequence2.length();
        int length2 = charSequence.length();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (length >= 0 && length2 >= 0) {
            int i17 = length2 == 0 ? -1 : iArr[length][length2 - 1];
            int i18 = length == 0 ? -1 : iArr[length - 1][length2];
            int i19 = (length <= 0 || length2 <= 0) ? -1 : iArr[length - 1][length2 - 1];
            if (i17 == -1 && i18 == -1 && i19 == -1) {
                break;
            }
            int i24 = iArr[length][length2];
            if (length2 <= 0 || length <= 0 || charSequence.charAt(length2 - 1) != charSequence2.charAt(length - 1)) {
                int i25 = i24 - 1;
                boolean z16 = true;
                if ((i25 == i17 && i24 <= i19 && i24 <= i18) || (i19 == -1 && i18 == -1)) {
                    length2--;
                    if (z14) {
                        i15++;
                        z15 = false;
                    } else {
                        i14++;
                        z15 = true;
                        z16 = false;
                    }
                } else if ((i25 != i18 || i24 > i19 || i24 > i17) && !(i19 == -1 && i17 == -1)) {
                    z15 = false;
                    z16 = false;
                } else {
                    length--;
                    if (z14) {
                        i14++;
                        z15 = true;
                        z16 = false;
                    } else {
                        i15++;
                        z15 = false;
                    }
                }
                if (!z16 && !z15) {
                    i16++;
                }
            }
            length2--;
            length--;
        }
        return new LevenshteinResults(Integer.valueOf(i15 + i14 + i16), Integer.valueOf(i15), Integer.valueOf(i14), Integer.valueOf(i16));
    }

    public static LevenshteinDetailedDistance getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static LevenshteinResults limitedCompare(CharSequence charSequence, CharSequence charSequence2, int i14) {
        boolean z14;
        int i15;
        int length;
        CharSequence charSequence3;
        CharSequence charSequence4;
        char c14 = 0;
        if (charSequence == null || charSequence2 == null) {
            h.s("CharSequences must not be null");
            return null;
        }
        if (i14 < 0) {
            h.s("Threshold must not be negative");
            return null;
        }
        int length2 = charSequence.length();
        int length3 = charSequence2.length();
        if (length2 == 0) {
            return length3 <= i14 ? new LevenshteinResults(Integer.valueOf(length3), Integer.valueOf(length3), 0, 0) : new LevenshteinResults(-1, 0, 0, 0);
        }
        if (length3 == 0) {
            return length2 <= i14 ? new LevenshteinResults(Integer.valueOf(length2), 0, Integer.valueOf(length2), 0) : new LevenshteinResults(-1, 0, 0, 0);
        }
        int i16 = 1;
        if (length2 > length3) {
            length = charSequence.length();
            i15 = length3;
            z14 = true;
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            z14 = false;
            i15 = length2;
            length = length3;
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int i17 = i15 + 1;
        int[] iArr = new int[i17];
        int[] iArr2 = new int[i17];
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length + 1, i17);
        for (int i18 = 0; i18 <= i15; i18++) {
            iArr3[0][i18] = i18;
        }
        for (int i19 = 0; i19 <= length; i19++) {
            iArr3[i19][0] = i19;
        }
        int iMin = Math.min(i15, i14) + 1;
        for (int i24 = 0; i24 < iMin; i24++) {
            iArr[i24] = i24;
        }
        int i25 = Integer.MAX_VALUE;
        Arrays.fill(iArr, iMin, i17, Integer.MAX_VALUE);
        Arrays.fill(iArr2, Integer.MAX_VALUE);
        int i26 = 1;
        while (i26 <= length) {
            char cCharAt = charSequence4.charAt(i26 - 1);
            iArr2[c14] = i26;
            int iMax = Math.max(i16, i26 - i14);
            int i27 = i25;
            int iMin2 = i26 > i27 - i14 ? i15 : Math.min(i15, i26 + i14);
            if (iMax > iMin2) {
                return new LevenshteinResults(-1, 0, 0, 0);
            }
            if (iMax > i16) {
                iArr2[iMax - 1] = i27;
            }
            while (iMax <= iMin2) {
                int i28 = i16;
                int i29 = iMax - 1;
                int i30 = iMax;
                if (charSequence3.charAt(i29) == cCharAt) {
                    iArr2[i30] = iArr[i29];
                } else {
                    iArr2[i30] = Math.min(Math.min(iArr2[i29], iArr[i30]), iArr[i29]) + 1;
                }
                iArr3[i26][i30] = iArr2[i30];
                iMax = i30 + 1;
                i16 = i28;
            }
            i26++;
            int[] iArr4 = iArr2;
            iArr2 = iArr;
            iArr = iArr4;
            i25 = i27;
            c14 = 0;
        }
        return iArr[i15] <= i14 ? findDetailedResults(charSequence3, charSequence4, iArr3, z14) : new LevenshteinResults(-1, 0, 0, 0);
    }

    private static LevenshteinResults unlimitedCompare(CharSequence charSequence, CharSequence charSequence2) {
        boolean z14;
        int i14;
        int length;
        CharSequence charSequence3;
        CharSequence charSequence4;
        int i15 = 0;
        if (charSequence == null || charSequence2 == null) {
            h.s("CharSequences must not be null");
            return null;
        }
        int length2 = charSequence.length();
        int length3 = charSequence2.length();
        if (length2 == 0) {
            return new LevenshteinResults(Integer.valueOf(length3), Integer.valueOf(length3), 0, 0);
        }
        if (length3 == 0) {
            return new LevenshteinResults(Integer.valueOf(length2), 0, Integer.valueOf(length2), 0);
        }
        if (length2 > length3) {
            z14 = true;
            length = charSequence.length();
            i14 = length3;
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            z14 = false;
            i14 = length2;
            length = length3;
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int i16 = i14 + 1;
        int[] iArr = new int[i16];
        int[] iArr2 = new int[i16];
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length + 1, i16);
        for (int i17 = 0; i17 <= i14; i17++) {
            iArr3[0][i17] = i17;
        }
        for (int i18 = 0; i18 <= length; i18++) {
            iArr3[i18][0] = i18;
        }
        for (int i19 = 0; i19 <= i14; i19++) {
            iArr[i19] = i19;
        }
        int[] iArr4 = iArr;
        int[] iArr5 = iArr2;
        int i24 = 1;
        while (i24 <= length) {
            char cCharAt = charSequence4.charAt(i24 - 1);
            iArr5[i15] = i24;
            int i25 = 1;
            while (i25 <= i14) {
                int i26 = i25 - 1;
                int iMin = Math.min(Math.min(iArr5[i26] + 1, iArr4[i25] + 1), iArr4[i26] + (charSequence3.charAt(i26) == cCharAt ? i15 : 1));
                iArr5[i25] = iMin;
                iArr3[i24][i25] = iMin;
                i25++;
                i15 = 0;
            }
            i24++;
            int[] iArr6 = iArr4;
            iArr4 = iArr5;
            iArr5 = iArr6;
            i15 = 0;
        }
        return findDetailedResults(charSequence3, charSequence4, iArr3, z14);
    }

    @Override // org.apache.commons.text.similarity.EditDistance, org.apache.commons.text.similarity.SimilarityScore
    public LevenshteinResults apply(CharSequence charSequence, CharSequence charSequence2) {
        Integer num = this.threshold;
        return num != null ? limitedCompare(charSequence, charSequence2, num.intValue()) : unlimitedCompare(charSequence, charSequence2);
    }

    public Integer getThreshold() {
        return this.threshold;
    }

    public LevenshteinDetailedDistance() {
        this(null);
    }
}
