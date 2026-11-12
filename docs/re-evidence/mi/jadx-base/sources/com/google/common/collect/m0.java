package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 {

    public static class a<E> extends v.c<E> implements SortedSet<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0<E> f9202a;

        public a(l0<E> l0Var) {
            this.f9202a = l0Var;
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return i().comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) m0.d(i().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e) {
            return i().headMultiset(e, BoundType.OPEN).elementSet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return v.e(i().entrySet().iterator());
        }

        @Override // com.google.common.collect.v.c
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final l0<E> i() {
            return this.f9202a;
        }

        @Override // java.util.SortedSet
        public E last() {
            return (E) m0.d(i().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e, E e2) {
            return i().subMultiset(e, BoundType.CLOSED, e2, BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e) {
            return i().tailMultiset(e, BoundType.CLOSED).elementSet();
        }
    }

    public static class b<E> extends a<E> implements NavigableSet<E> {
        public b(l0<E> l0Var) {
            super(l0Var);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e) {
            return (E) m0.c(i().tailMultiset(e, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new b(i().descendingMultiset());
        }

        @Override // java.util.NavigableSet
        public E floor(E e) {
            return (E) m0.c(i().headMultiset(e, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
            return new b(i().headMultiset(e, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableSet
        public E higher(E e) {
            return (E) m0.c(i().tailMultiset(e, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public E lower(E e) {
            return (E) m0.c(i().headMultiset(e, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) m0.c(i().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) m0.c(i().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return new b(i().subMultiset(e, BoundType.forBoolean(z), e2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            return new b(i().tailMultiset(e, BoundType.forBoolean(z)));
        }
    }

    public static <E> E c(u.a<E> aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.getElement();
    }

    public static <E> E d(u.a<E> aVar) {
        if (aVar != null) {
            return aVar.getElement();
        }
        throw new NoSuchElementException();
    }
}
