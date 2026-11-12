package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Ordering;
import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class alo<E> extends ImmutableSortedSet<E> {
    private final ImmutableSortedSet<E> d;

    public alo(ImmutableSortedSet<E> immutableSortedSet) {
        super(Ordering.from(immutableSortedSet.comparator()).reverse());
        this.d = immutableSortedSet;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.d.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.d.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return this.d.descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> headSetImpl(E e, boolean z) {
        return this.d.tailSet((Object) e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2) {
        return this.d.subSet((Object) e2, z2, (Object) e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> tailSetImpl(E e, boolean z) {
        return this.d.headSet((Object) e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public ImmutableSortedSet<E> descendingSet() {
        return this.d;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public UnmodifiableIterator<E> descendingIterator() {
        return this.d.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> createDescendingSet() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E lower(E e) {
        return this.d.higher(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E floor(E e) {
        return this.d.ceiling(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E ceiling(E e) {
        return this.d.floor(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @CheckForNull
    public E higher(E e) {
        return this.d.lower(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public int indexOf(@CheckForNull Object obj) {
        int iIndexOf = this.d.indexOf(obj);
        return iIndexOf == -1 ? iIndexOf : (size() - 1) - iIndexOf;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.d.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
