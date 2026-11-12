package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Comparators {
    private Comparators() {
    }

    @IgnoreJRERequirement
    public static <T> Collector<T, ?, List<T>> greatest(int i14, Comparator<? super T> comparator) {
        return least(i14, comparator.reversed());
    }

    public static <T> boolean isInOrder(Iterable<? extends T> iterable, Comparator<T> comparator) {
        Preconditions.checkNotNull(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T> boolean isInStrictOrder(Iterable<? extends T> iterable, Comparator<T> comparator) {
        Preconditions.checkNotNull(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    @IgnoreJRERequirement
    public static <T> Collector<T, ?, List<T>> least(final int i14, final Comparator<? super T> comparator) {
        CollectPreconditions.checkNonnegative(i14, JWKParameterNames.OCT_KEY_VALUE);
        Preconditions.checkNotNull(comparator);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.m
            @Override // java.util.function.Supplier
            public final Object get() {
                return TopKSelector.least(i14, comparator);
            }
        }, new d(1), new a(7), new e(3), Collector.Characteristics.UNORDERED);
    }

    public static <T, S extends T> Comparator<Iterable<S>> lexicographical(Comparator<T> comparator) {
        return new LexicographicalOrdering((Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <T extends Comparable<? super T>> T max(T t7, T t14) {
        return t7.compareTo(t14) >= 0 ? t7 : t14;
    }

    public static <T extends Comparable<? super T>> T min(T t7, T t14) {
        return t7.compareTo(t14) <= 0 ? t7 : t14;
    }

    @ParametricNullness
    public static <T> T max(@ParametricNullness T t7, @ParametricNullness T t14, Comparator<? super T> comparator) {
        return comparator.compare(t7, t14) >= 0 ? t7 : t14;
    }

    @ParametricNullness
    public static <T> T min(@ParametricNullness T t7, @ParametricNullness T t14, Comparator<? super T> comparator) {
        return comparator.compare(t7, t14) <= 0 ? t7 : t14;
    }
}
