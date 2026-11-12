package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Multiset;
import com.google.common.collect.Ordering;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class ani<E> extends ImmutableSortedSet<E> {
    public static final ani<Comparable> e = new ani<>(ImmutableList.of(), Ordering.natural());
    final transient ImmutableList<E> d;

    public ani(ImmutableList<E> immutableList, Comparator<? super E> comparator) {
        super(comparator);
        this.d = immutableList;
    }

    @Override // com.google.common.collect.ImmutableCollection
    @CheckForNull
    public Object[] internalArray() {
        return this.d.internalArray();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayStart() {
        return this.d.internalArrayStart();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayEnd() {
        return this.d.internalArrayEnd();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return this.d.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public UnmodifiableIterator<E> descendingIterator() {
        return this.d.reverse().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.d.size();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        if (!ano.c(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        UnmodifiableIterator<E> it = iterator();
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

    private int a(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.d, obj, d());
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.d.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        return this.d.copyIntoArray(objArr, i);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
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
        if (ano.c(this.comparator, set)) {
            Iterator<E> it = set.iterator();
            try {
                UnmodifiableIterator<E> it2 = iterator();
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
        return containsAll(set);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E lower(E e2) {
        int iE = e(e2, false) - 1;
        if (iE == -1) {
            return null;
        }
        return this.d.get(iE);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E floor(E e2) {
        int iE = e(e2, true) - 1;
        if (iE == -1) {
            return null;
        }
        return this.d.get(iE);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E ceiling(E e2) {
        int iD = d(e2, true);
        if (iD == size()) {
            return null;
        }
        return this.d.get(iD);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E higher(E e2) {
        int iD = d(e2, false);
        if (iD == size()) {
            return null;
        }
        return this.d.get(iD);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> headSetImpl(E e2, boolean z) {
        return a(0, e(e2, z));
    }

    int e(E e2, boolean z) {
        int iBinarySearch = Collections.binarySearch(this.d, Preconditions.checkNotNull(e2), comparator());
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> subSetImpl(E e2, boolean z, E e3, boolean z2) {
        return tailSetImpl(e2, z).headSetImpl(e3, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> tailSetImpl(E e2, boolean z) {
        return a(d(e2, z), size());
    }

    int d(E e2, boolean z) {
        int iBinarySearch = Collections.binarySearch(this.d, Preconditions.checkNotNull(e2), comparator());
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    Comparator<Object> d() {
        return this.comparator;
    }

    ani<E> a(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new ani<>(this.d.subList(i, i2), this.comparator);
        }
        return emptySet(this.comparator);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int iBinarySearch = Collections.binarySearch(this.d, obj, d());
            if (iBinarySearch >= 0) {
                return iBinarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
        }
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        return this.d;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> createDescendingSet() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.comparator);
        if (isEmpty()) {
            return emptySet(comparatorReverseOrder);
        }
        return new ani(this.d.reverse(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
