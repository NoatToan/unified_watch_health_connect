package com.google.common.collect;

import defpackage.c6i;
import defpackage.ich;
import defpackage.o4n;
import defpackage.uaq;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class e0<E> extends ImmutableSortedSet<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0<Comparable> f9174b = new e0<>(ImmutableList.of(), ich.e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient ImmutableList<E> f9175a;

    public e0(ImmutableList<E> immutableList, Comparator<? super E> comparator) {
        super(comparator);
        this.f9175a = immutableList;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        return this.f9175a;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E ceiling(E e) {
        int iG = g(e, true);
        if (iG == size()) {
            return null;
        }
        return this.f9175a.get(iG);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return h(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof u) {
            collection = ((u) collection).elementSet();
        }
        if (!o4n.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        uaq<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iUnsafeCompare = unsafeCompare(next2, next);
                if (iUnsafeCompare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iUnsafeCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iUnsafeCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        return this.f9175a.copyIntoArray(objArr, i);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> createDescendingSet() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.comparator);
        return isEmpty() ? ImmutableSortedSet.emptySet(comparatorReverseOrder) : new e0(this.f9175a.reverse(), comparatorReverseOrder);
    }

    public e0<E> e(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        return i < i2 ? new e0<>(this.f9175a.subList(i, i2), this.comparator) : ImmutableSortedSet.emptySet(this.comparator);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
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
        if (!o4n.b(this.comparator, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            uaq<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || unsafeCompare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    public int f(E e, boolean z) {
        int iBinarySearch = Collections.binarySearch(this.f9175a, c6i.o(e), comparator());
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f9175a.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E floor(E e) {
        int iF = f(e, true) - 1;
        if (iF == -1) {
            return null;
        }
        return this.f9175a.get(iF);
    }

    public int g(E e, boolean z) {
        int iBinarySearch = Collections.binarySearch(this.f9175a, c6i.o(e), comparator());
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    public final int h(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.f9175a, obj, i());
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> headSetImpl(E e, boolean z) {
        return e(0, f(e, z));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E higher(E e) {
        int iG = g(e, false);
        if (iG == size()) {
            return null;
        }
        return this.f9175a.get(iG);
    }

    public Comparator<Object> i() {
        return this.comparator;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int iBinarySearch = Collections.binarySearch(this.f9175a, obj, i());
            if (iBinarySearch >= 0) {
                return iBinarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] internalArray() {
        return this.f9175a.internalArray();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayEnd() {
        return this.f9175a.internalArrayEnd();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayStart() {
        return this.f9175a.internalArrayStart();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.f9175a.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f9175a.get(size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E lower(E e) {
        int iF = f(e, false) - 1;
        if (iF == -1) {
            return null;
        }
        return this.f9175a.get(iF);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f9175a.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2) {
        return tailSetImpl(e, z).headSetImpl(e2, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> tailSetImpl(E e, boolean z) {
        return e(g(e, z), size());
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public uaq<E> descendingIterator() {
        return this.f9175a.reverse().iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public uaq<E> iterator() {
        return this.f9175a.iterator();
    }
}
