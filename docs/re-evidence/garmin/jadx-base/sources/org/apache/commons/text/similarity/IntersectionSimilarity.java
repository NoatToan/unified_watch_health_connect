package org.apache.commons.text.similarity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class IntersectionSimilarity<T> implements SimilarityScore<IntersectionResult> {
    private final Function<CharSequence, Collection<T>> converter;

    public static class BagCount {
        int count;

        private BagCount() {
            this.count = 1;
        }
    }

    public class TinyBag {
        private final Map<T, BagCount> map;

        public TinyBag(int i14) {
            this.map = new HashMap(i14);
        }

        public void add(T t7) {
            BagCount bagCount = this.map.get(t7);
            if (bagCount == null) {
                this.map.put(t7, new BagCount());
            } else {
                bagCount.count++;
            }
        }

        public Set<Map.Entry<T, BagCount>> entrySet() {
            return this.map.entrySet();
        }

        public int getCount(Object obj) {
            BagCount bagCount = this.map.get(obj);
            if (bagCount != null) {
                return bagCount.count;
            }
            return 0;
        }

        public int uniqueElementSize() {
            return this.map.size();
        }
    }

    public IntersectionSimilarity(Function<CharSequence, Collection<T>> function) {
        if (function != null) {
            this.converter = function;
        } else {
            h.s("Converter must not be null");
            throw null;
        }
    }

    private int getIntersection(IntersectionSimilarity<T>.TinyBag tinyBag, IntersectionSimilarity<T>.TinyBag tinyBag2) {
        int iMin = 0;
        for (Map.Entry<T, BagCount> entry : tinyBag.entrySet()) {
            iMin += Math.min(entry.getValue().count, tinyBag2.getCount(entry.getKey()));
        }
        return iMin;
    }

    private IntersectionSimilarity<T>.TinyBag toBag(Collection<T> collection) {
        IntersectionSimilarity<T>.TinyBag tinyBag = new TinyBag(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            tinyBag.add(it.next());
        }
        return tinyBag;
    }

    @Override // org.apache.commons.text.similarity.SimilarityScore
    public IntersectionResult apply(CharSequence charSequence, CharSequence charSequence2) {
        int intersection;
        if (charSequence == null || charSequence2 == null) {
            h.s("Input cannot be null");
            return null;
        }
        Collection<T> collectionApply = this.converter.apply(charSequence);
        Collection<T> collectionApply2 = this.converter.apply(charSequence2);
        int size = collectionApply.size();
        int size2 = collectionApply2.size();
        if (Math.min(size, size2) == 0) {
            return new IntersectionResult(size, size2, 0);
        }
        if ((collectionApply instanceof Set) && (collectionApply2 instanceof Set)) {
            intersection = size < size2 ? getIntersection((Set) collectionApply, (Set) collectionApply2) : getIntersection((Set) collectionApply2, (Set) collectionApply);
        } else {
            IntersectionSimilarity<T>.TinyBag bag = toBag(collectionApply);
            IntersectionSimilarity<T>.TinyBag bag2 = toBag(collectionApply2);
            intersection = bag.uniqueElementSize() < bag2.uniqueElementSize() ? getIntersection(bag, bag2) : getIntersection(bag2, bag);
        }
        return new IntersectionResult(size, size2, intersection);
    }

    private static <T> int getIntersection(Set<T> set, Set<T> set2) {
        Iterator<T> it = set.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (set2.contains(it.next())) {
                i14++;
            }
        }
        return i14;
    }
}
