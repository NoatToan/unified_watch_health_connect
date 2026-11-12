package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.j2objc.annotations.Weak;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
final class r2 {

    public static class a<E> extends Multisets.h<E> implements SortedSet<E> {

        @Weak
        private final SortedMultiset<E> a;

        public a(SortedMultiset<E> sortedMultiset) {
            this.a = sortedMultiset;
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return d().comparator();
        }

        @Override // com.google.common.collect.Multisets.h
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final SortedMultiset<E> d() {
            return this.a;
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) r2.d(d().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e) {
            return d().headMultiset(e, BoundType.OPEN).elementSet();
        }

        @Override // com.google.common.collect.Multisets.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Multisets.e(d().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public E last() {
            return (E) r2.d(d().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e, E e2) {
            return d().subMultiset(e, BoundType.CLOSED, e2, BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e) {
            return d().tailMultiset(e, BoundType.CLOSED).elementSet();
        }
    }

    @GwtIncompatible
    public static class b<E> extends a<E> implements NavigableSet<E> {
        public b(SortedMultiset<E> sortedMultiset) {
            super(sortedMultiset);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e) {
            return (E) r2.c(d().tailMultiset(e, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new b(d().descendingMultiset());
        }

        @Override // java.util.NavigableSet
        public E floor(E e) {
            return (E) r2.c(d().headMultiset(e, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
            return new b(d().headMultiset(e, BoundType.b(z)));
        }

        @Override // java.util.NavigableSet
        public E higher(E e) {
            return (E) r2.c(d().tailMultiset(e, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public E lower(E e) {
            return (E) r2.c(d().headMultiset(e, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) r2.c(d().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) r2.c(d().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return new b(d().subMultiset(e, BoundType.b(z), e2, BoundType.b(z2)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            return new b(d().tailMultiset(e, BoundType.b(z)));
        }
    }

    private r2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> E c(@NullableDecl Multiset.Entry<E> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> E d(Multiset.Entry<E> entry) {
        if (entry != null) {
            return entry.getElement();
        }
        throw new NoSuchElementException();
    }
}
