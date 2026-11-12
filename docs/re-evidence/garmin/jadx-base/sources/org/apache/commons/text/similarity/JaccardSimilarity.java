package org.apache.commons.text.similarity;

import java.util.HashSet;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class JaccardSimilarity implements SimilarityScore<Double> {
    private Double calculateJaccardSimilarity(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (length == 0 || length2 == 0) {
            return Double.valueOf(0.0d);
        }
        HashSet hashSet = new HashSet();
        for (int i14 = 0; i14 < length; i14++) {
            hashSet.add(Character.valueOf(charSequence.charAt(i14)));
        }
        HashSet hashSet2 = new HashSet();
        for (int i15 = 0; i15 < length2; i15++) {
            hashSet2.add(Character.valueOf(charSequence2.charAt(i15)));
        }
        HashSet hashSet3 = new HashSet(hashSet);
        hashSet3.addAll(hashSet2);
        return Double.valueOf((((double) ((hashSet2.size() + hashSet.size()) - hashSet3.size())) * 1.0d) / ((double) hashSet3.size()));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.text.similarity.SimilarityScore
    public Double apply(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            return calculateJaccardSimilarity(charSequence, charSequence2);
        }
        h.s("Input cannot be null");
        return null;
    }
}
