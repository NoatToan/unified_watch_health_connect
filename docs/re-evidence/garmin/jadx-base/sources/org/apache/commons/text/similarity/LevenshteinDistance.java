package org.apache.commons.text.similarity;

import java.util.Arrays;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class LevenshteinDistance implements EditDistance<Integer> {
    private static final LevenshteinDistance DEFAULT_INSTANCE = new LevenshteinDistance();
    private final Integer threshold;

    public LevenshteinDistance(Integer num) {
        if (num == null || num.intValue() >= 0) {
            this.threshold = num;
        } else {
            h.s("Threshold must not be negative");
            throw null;
        }
    }

    public static LevenshteinDistance getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int limitedCompare(CharSequence charSequence, CharSequence charSequence2, int i14) {
        int i15;
        int length;
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence == null || charSequence2 == null) {
            h.s("CharSequences must not be null");
            return 0;
        }
        if (i14 < 0) {
            h.s("Threshold must not be negative");
            return 0;
        }
        int length2 = charSequence.length();
        int length3 = charSequence2.length();
        int i16 = -1;
        if (length2 == 0) {
            if (length3 <= i14) {
                return length3;
            }
            return -1;
        }
        if (length3 == 0) {
            if (length2 <= i14) {
                return length2;
            }
            return -1;
        }
        if (length2 > length3) {
            length = charSequence.length();
            i15 = length3;
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            i15 = length2;
            length = length3;
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        if (length - i15 > i14) {
            return -1;
        }
        int i17 = i15 + 1;
        int[] iArr = new int[i17];
        int[] iArr2 = new int[i17];
        int i18 = 1;
        int iMin = Math.min(i15, i14) + 1;
        for (int i19 = 0; i19 < iMin; i19++) {
            iArr[i19] = i19;
        }
        Arrays.fill(iArr, iMin, i17, Integer.MAX_VALUE);
        Arrays.fill(iArr2, Integer.MAX_VALUE);
        int i24 = 1;
        while (i24 <= length) {
            char cCharAt = charSequence4.charAt(i24 - 1);
            iArr2[0] = i24;
            int iMax = Math.max(i18, i24 - i14);
            int iMin2 = i24 > Integer.MAX_VALUE - i14 ? i15 : Math.min(i15, i24 + i14);
            if (iMax > i18) {
                iArr2[iMax - 1] = Integer.MAX_VALUE;
            }
            while (iMax <= iMin2) {
                int i25 = iMax - 1;
                int i26 = i16;
                if (charSequence3.charAt(i25) == cCharAt) {
                    iArr2[iMax] = iArr[i25];
                } else {
                    iArr2[iMax] = Math.min(Math.min(iArr2[i25], iArr[iMax]), iArr[i25]) + 1;
                }
                iMax++;
                i18 = i18;
                i16 = i26;
            }
            int i27 = i16;
            i24++;
            int[] iArr3 = iArr2;
            iArr2 = iArr;
            iArr = iArr3;
            i16 = i27;
        }
        int i28 = i16;
        int i29 = iArr[i15];
        return i29 <= i14 ? i29 : i28;
    }

    private static int unlimitedCompare(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            h.s("CharSequences must not be null");
            return 0;
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (length == 0) {
            return length2;
        }
        if (length2 == 0) {
            return length;
        }
        if (length > length2) {
            length2 = charSequence.length();
            length = length2;
        } else {
            charSequence2 = charSequence;
            charSequence = charSequence2;
        }
        int[] iArr = new int[length + 1];
        for (int i14 = 0; i14 <= length; i14++) {
            iArr[i14] = i14;
        }
        for (int i15 = 1; i15 <= length2; i15++) {
            int i16 = iArr[0];
            char cCharAt = charSequence.charAt(i15 - 1);
            iArr[0] = i15;
            int i17 = 1;
            while (i17 <= length) {
                int i18 = iArr[i17];
                int i19 = i17 - 1;
                iArr[i17] = Math.min(Math.min(iArr[i19] + 1, iArr[i17] + 1), i16 + (charSequence2.charAt(i19) == cCharAt ? 0 : 1));
                i17++;
                i16 = i18;
            }
        }
        return iArr[length];
    }

    @Override // org.apache.commons.text.similarity.EditDistance, org.apache.commons.text.similarity.SimilarityScore
    public Integer apply(CharSequence charSequence, CharSequence charSequence2) {
        Integer num = this.threshold;
        return num != null ? Integer.valueOf(limitedCompare(charSequence, charSequence2, num.intValue())) : Integer.valueOf(unlimitedCompare(charSequence, charSequence2));
    }

    public Integer getThreshold() {
        return this.threshold;
    }

    public LevenshteinDistance() {
        this(null);
    }
}
