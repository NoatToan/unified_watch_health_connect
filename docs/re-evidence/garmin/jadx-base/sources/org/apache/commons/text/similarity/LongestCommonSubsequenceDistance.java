package org.apache.commons.text.similarity;

import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class LongestCommonSubsequenceDistance implements EditDistance<Integer> {
    private final LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();

    @Override // org.apache.commons.text.similarity.EditDistance, org.apache.commons.text.similarity.SimilarityScore
    public Integer apply(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            h.s("Inputs must not be null");
            return null;
        }
        return Integer.valueOf((charSequence2.length() + charSequence.length()) - (this.longestCommonSubsequence.apply(charSequence, charSequence2).intValue() * 2));
    }
}
