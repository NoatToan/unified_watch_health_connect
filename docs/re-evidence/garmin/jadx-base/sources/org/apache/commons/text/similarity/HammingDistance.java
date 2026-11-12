package org.apache.commons.text.similarity;

import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class HammingDistance implements EditDistance<Integer> {
    @Override // org.apache.commons.text.similarity.EditDistance, org.apache.commons.text.similarity.SimilarityScore
    public Integer apply(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            h.s("CharSequences must not be null");
            return null;
        }
        if (charSequence.length() != charSequence2.length()) {
            h.s("CharSequences must have the same length");
            return null;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < charSequence.length(); i15++) {
            if (charSequence.charAt(i15) != charSequence2.charAt(i15)) {
                i14++;
            }
        }
        return Integer.valueOf(i14);
    }
}
