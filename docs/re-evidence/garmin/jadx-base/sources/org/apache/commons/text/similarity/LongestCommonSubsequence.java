package org.apache.commons.text.similarity;

import java.lang.reflect.Array;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class LongestCommonSubsequence implements SimilarityScore<Integer> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.text.similarity.SimilarityScore
    public Integer apply(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            return Integer.valueOf(longestCommonSubsequence(charSequence, charSequence2).length());
        }
        h.s("Inputs must not be null");
        return null;
    }

    @Deprecated
    public CharSequence logestCommonSubsequence(CharSequence charSequence, CharSequence charSequence2) {
        return longestCommonSubsequence(charSequence, charSequence2);
    }

    public CharSequence longestCommonSubsequence(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            h.s("Inputs must not be null");
            return null;
        }
        StringBuilder sb3 = new StringBuilder(Math.max(charSequence.length(), charSequence2.length()));
        int[][] iArrLongestCommonSubstringLengthArray = longestCommonSubstringLengthArray(charSequence, charSequence2);
        int length = charSequence.length() - 1;
        int length2 = charSequence2.length() - 1;
        int i14 = iArrLongestCommonSubstringLengthArray[charSequence.length()][charSequence2.length()];
        while (true) {
            i14--;
            while (i14 >= 0) {
                if (charSequence.charAt(length) == charSequence2.charAt(length2)) {
                    sb3.append(charSequence.charAt(length));
                    length--;
                    length2--;
                } else if (iArrLongestCommonSubstringLengthArray[length + 1][length2] < iArrLongestCommonSubstringLengthArray[length][length2 + 1]) {
                    length--;
                } else {
                    length2--;
                }
            }
            return sb3.reverse().toString();
        }
    }

    public int[][] longestCommonSubstringLengthArray(CharSequence charSequence, CharSequence charSequence2) {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, charSequence.length() + 1, charSequence2.length() + 1);
        for (int i14 = 0; i14 < charSequence.length(); i14++) {
            for (int i15 = 0; i15 < charSequence2.length(); i15++) {
                if (i14 == 0) {
                    iArr[i14][i15] = 0;
                }
                if (i15 == 0) {
                    iArr[i14][i15] = 0;
                }
                if (charSequence.charAt(i14) == charSequence2.charAt(i15)) {
                    iArr[i14 + 1][i15 + 1] = iArr[i14][i15] + 1;
                } else {
                    int[] iArr2 = iArr[i14 + 1];
                    int i16 = i15 + 1;
                    iArr2[i16] = Math.max(iArr2[i15], iArr[i14][i16]);
                }
            }
        }
        return iArr;
    }
}
