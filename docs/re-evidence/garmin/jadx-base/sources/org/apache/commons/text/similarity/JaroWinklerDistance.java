package org.apache.commons.text.similarity;

import java.util.Arrays;
import o2.c;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class JaroWinklerDistance implements EditDistance<Double> {

    @Deprecated
    public static final int INDEX_NOT_FOUND = -1;

    @Deprecated
    public static int[] matches(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence.length() > charSequence2.length()) {
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int iMax = Math.max((charSequence4.length() / 2) - 1, 0);
        int[] iArr = new int[charSequence3.length()];
        Arrays.fill(iArr, -1);
        boolean[] zArr = new boolean[charSequence4.length()];
        int i14 = 0;
        for (int i15 = 0; i15 < charSequence3.length(); i15++) {
            char cCharAt = charSequence3.charAt(i15);
            int iMin = Math.min(i15 + iMax + 1, charSequence4.length());
            for (int iMax2 = Math.max(i15 - iMax, 0); iMax2 < iMin; iMax2++) {
                if (!zArr[iMax2] && cCharAt == charSequence4.charAt(iMax2)) {
                    iArr[i15] = iMax2;
                    zArr[iMax2] = true;
                    i14++;
                    break;
                }
            }
        }
        char[] cArr = new char[i14];
        char[] cArr2 = new char[i14];
        int i16 = 0;
        for (int i17 = 0; i17 < charSequence3.length(); i17++) {
            if (iArr[i17] != -1) {
                cArr[i16] = charSequence3.charAt(i17);
                i16++;
            }
        }
        int i18 = 0;
        for (int i19 = 0; i19 < charSequence4.length(); i19++) {
            if (zArr[i19]) {
                cArr2[i18] = charSequence4.charAt(i19);
                i18++;
            }
        }
        int i24 = 0;
        for (int i25 = 0; i25 < i14; i25++) {
            if (cArr[i25] != cArr2[i25]) {
                i24++;
            }
        }
        int i26 = 0;
        for (int i27 = 0; i27 < Math.min(4, charSequence3.length()) && charSequence.charAt(i27) == charSequence2.charAt(i27); i27++) {
            i26++;
        }
        return new int[]{i14, i24, i26};
    }

    @Override // org.apache.commons.text.similarity.EditDistance, org.apache.commons.text.similarity.SimilarityScore
    public Double apply(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            h.s("CharSequences must not be null");
            return null;
        }
        int[] iArrMatches = matches(charSequence, charSequence2);
        double d14 = iArrMatches[0];
        if (d14 == 0.0d) {
            return Double.valueOf(0.0d);
        }
        double length = (((d14 - (((double) iArrMatches[1]) / 2.0d)) / d14) + ((d14 / ((double) charSequence2.length())) + (d14 / ((double) charSequence.length())))) / 3.0d;
        if (length >= 0.7d) {
            length = c.b(1.0d, length, ((double) iArrMatches[2]) * 0.1d, length);
        }
        return Double.valueOf(length);
    }
}
