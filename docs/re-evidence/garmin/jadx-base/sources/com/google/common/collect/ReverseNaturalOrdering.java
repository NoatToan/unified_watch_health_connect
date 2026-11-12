package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class ReverseNaturalOrdering extends Ordering<Comparable<?>> implements Serializable {
    static final ReverseNaturalOrdering INSTANCE = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0;

    private ReverseNaturalOrdering() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> reverse() {
        return Ordering.natural();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E max(E e4, E e14) {
        return (E) NaturalOrdering.INSTANCE.min(e4, e14);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E min(E e4, E e14) {
        return (E) NaturalOrdering.INSTANCE.max(e4, e14);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E max(E e4, E e14, E e15, E... eArr) {
        return (E) NaturalOrdering.INSTANCE.min(e4, e14, e15, eArr);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E min(E e4, E e14, E e15, E... eArr) {
        return (E) NaturalOrdering.INSTANCE.max(e4, e14, e15, eArr);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E max(Iterator<E> it) {
        return (E) NaturalOrdering.INSTANCE.min(it);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E min(Iterator<E> it) {
        return (E) NaturalOrdering.INSTANCE.max(it);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E max(Iterable<E> iterable) {
        return (E) NaturalOrdering.INSTANCE.min(iterable);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends Comparable<?>> E min(Iterable<E> iterable) {
        return (E) NaturalOrdering.INSTANCE.max(iterable);
    }
}
