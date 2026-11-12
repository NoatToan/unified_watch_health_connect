package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes14.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E> {

    public class StandardDescendingSet extends Sets.DescendingSet<E> {
        public StandardDescendingSet() {
            super(ForwardingNavigableSet.this);
        }
    }

    @Override // java.util.NavigableSet
    public E ceiling(@ParametricNullness E e4) {
        return delegate().ceiling(e4);
    }

    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract NavigableSet<E> delegate();

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return delegate().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return delegate().descendingSet();
    }

    @Override // java.util.NavigableSet
    public E floor(@ParametricNullness E e4) {
        return delegate().floor(e4);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(@ParametricNullness E e4, boolean z14) {
        return delegate().headSet(e4, z14);
    }

    @Override // java.util.NavigableSet
    public E higher(@ParametricNullness E e4) {
        return delegate().higher(e4);
    }

    @Override // java.util.NavigableSet
    public E lower(@ParametricNullness E e4) {
        return delegate().lower(e4);
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
        return delegate().pollFirst();
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
        return delegate().pollLast();
    }

    public E standardCeiling(@ParametricNullness E e4) {
        return (E) Iterators.getNext(tailSet(e4, true).iterator(), null);
    }

    @ParametricNullness
    public E standardFirst() {
        return iterator().next();
    }

    public E standardFloor(@ParametricNullness E e4) {
        return (E) Iterators.getNext(headSet(e4, true).descendingIterator(), null);
    }

    public SortedSet<E> standardHeadSet(@ParametricNullness E e4) {
        return headSet(e4, false);
    }

    public E standardHigher(@ParametricNullness E e4) {
        return (E) Iterators.getNext(tailSet(e4, false).iterator(), null);
    }

    @ParametricNullness
    public E standardLast() {
        return descendingIterator().next();
    }

    public E standardLower(@ParametricNullness E e4) {
        return (E) Iterators.getNext(headSet(e4, false).descendingIterator(), null);
    }

    public E standardPollFirst() {
        return (E) Iterators.pollNext(iterator());
    }

    public E standardPollLast() {
        return (E) Iterators.pollNext(descendingIterator());
    }

    public NavigableSet<E> standardSubSet(@ParametricNullness E e4, boolean z14, @ParametricNullness E e14, boolean z15) {
        return tailSet(e4, z14).headSet(e14, z15);
    }

    public SortedSet<E> standardTailSet(@ParametricNullness E e4) {
        return tailSet(e4, true);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(@ParametricNullness E e4, boolean z14, @ParametricNullness E e14, boolean z15) {
        return delegate().subSet(e4, z14, e14, z15);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(@ParametricNullness E e4, boolean z14) {
        return delegate().tailSet(e4, z14);
    }

    @Override // com.google.common.collect.ForwardingSortedSet
    public SortedSet<E> standardSubSet(@ParametricNullness E e4, @ParametricNullness E e14) {
        return subSet(e4, true, e14, false);
    }
}
