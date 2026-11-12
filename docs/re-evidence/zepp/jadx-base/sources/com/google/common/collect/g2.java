package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
final class g2<E> extends ImmutableSortedSet<E> {
    public static final g2<Comparable> i = new g2<>(ImmutableList.of(), Ordering.natural());

    @VisibleForTesting
    public final transient ImmutableList<E> h;

    public g2(ImmutableList<E> immutableList, Comparator<? super E> comparator) {
        super(comparator);
        this.h = immutableList;
    }

    private int z(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.h, obj, A());
    }

    public Comparator<Object> A() {
        return this.f;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int a(Object[] objArr, int i2) {
        return this.h.a(objArr, i2);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        return this.h;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] b() {
        return this.h.b();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int c() {
        return this.h.c();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E ceiling(E e) {
        int iY = y(e, true);
        if (iY == size()) {
            return null;
        }
        return this.h.get(iY);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return z(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        if (!o2.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        UnmodifiableIterator<E> it2 = iterator();
        Iterator<?> it3 = collection.iterator();
        if (!it2.hasNext()) {
            return false;
        }
        Object next = it3.next();
        E next2 = it2.next();
        while (true) {
            try {
                int iU = u(next2, next);
                if (iU < 0) {
                    if (!it2.hasNext()) {
                        return false;
                    }
                    next2 = it2.next();
                } else if (iU == 0) {
                    if (!it3.hasNext()) {
                        return true;
                    }
                    next = it3.next();
                } else if (iU > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int e() {
        return this.h.e();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!o2.b(this.f, set)) {
            return containsAll(set);
        }
        Iterator<E> it2 = set.iterator();
        try {
            UnmodifiableIterator<E> it3 = iterator();
            while (it3.hasNext()) {
                E next = it3.next();
                E next2 = it2.next();
                if (next2 == null || u(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean f() {
        return this.h.f();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.h.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E floor(E e) {
        int iX = x(e, true) - 1;
        if (iX == -1) {
            return null;
        }
        return this.h.get(iX);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E higher(E e) {
        int iY = y(e, false);
        if (iY == size()) {
            return null;
        }
        return this.h.get(iY);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int iBinarySearch = Collections.binarySearch(this.h, obj, A());
            if (iBinarySearch >= 0) {
                return iBinarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.h.get(size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E lower(E e) {
        int iX = x(e, false) - 1;
        if (iX == -1) {
            return null;
        }
        return this.h.get(iX);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> p() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f);
        return isEmpty() ? ImmutableSortedSet.q(comparatorReverseOrder) : new g2(this.h.reverse(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> r(E e, boolean z) {
        return w(0, x(e, z));
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> s(E e, boolean z, E e2, boolean z2) {
        return t(e, z).r(e2, z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.h.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> t(E e, boolean z) {
        return w(y(e, z), size());
    }

    public g2<E> w(int i2, int i3) {
        if (i2 == 0 && i3 == size()) {
            return this;
        }
        return i2 < i3 ? new g2<>(this.h.subList(i2, i3), this.f) : ImmutableSortedSet.q(this.f);
    }

    public int x(E e, boolean z) {
        int iBinarySearch = Collections.binarySearch(this.h, Preconditions.checkNotNull(e), comparator());
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public int y(E e, boolean z) {
        int iBinarySearch = Collections.binarySearch(this.h, Preconditions.checkNotNull(e), comparator());
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public UnmodifiableIterator<E> descendingIterator() {
        return this.h.reverse().iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public UnmodifiableIterator<E> iterator() {
        return this.h.iterator();
    }
}
