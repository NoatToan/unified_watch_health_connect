package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public final class o4n {
    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? ich.e() : comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        c6i.o(comparator);
        c6i.o(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof n4n)) {
                return false;
            }
            comparator2 = ((n4n) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
