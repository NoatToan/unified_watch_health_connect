package com.google.common.collect;

import defpackage.n4n;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public interface l0<E> extends u, n4n<E> {
    Comparator<? super E> comparator();

    l0<E> descendingMultiset();

    @Override // com.google.common.collect.u
    NavigableSet<E> elementSet();

    @Override // com.google.common.collect.u
    Set<u.a<E>> entrySet();

    u.a<E> firstEntry();

    l0<E> headMultiset(E e, BoundType boundType);

    u.a<E> lastEntry();

    u.a<E> pollFirstEntry();

    u.a<E> pollLastEntry();

    l0<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2);

    l0<E> tailMultiset(E e, BoundType boundType);
}
