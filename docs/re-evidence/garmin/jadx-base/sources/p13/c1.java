package p13;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
public class c1 extends b1 {
    public static LinkedHashSet f(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(t0.a(set.size()));
        boolean z14 = false;
        for (Object obj2 : set) {
            boolean z15 = true;
            if (!z14 && p005kotlin.jvm.internal.s.g(obj2, obj)) {
                z14 = true;
                z15 = false;
            }
            if (z15) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> g(Set<? extends T> set, Iterable<? extends T> iterable) {
        set.getClass();
        iterable.getClass();
        Collection<?> collectionY = d0.y(iterable);
        if (collectionY.isEmpty()) {
            return h0.g1(set);
        }
        if (!(collectionY instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionY);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t7 : set) {
            if (!((Set) collectionY).contains(t7)) {
                linkedHashSet2.add(t7);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet h(Set set, Iterable iterable) {
        int size;
        set.getClass();
        iterable.getClass();
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(t0.a(size));
        linkedHashSet.addAll(set);
        d0.v(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet i(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(t0.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
