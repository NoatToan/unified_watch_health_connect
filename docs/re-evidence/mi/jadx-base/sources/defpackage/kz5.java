package defpackage;

import com.google.common.collect.ImmutableSortedSet;

/* JADX INFO: loaded from: classes5.dex */
public final class kz5<E> extends ImmutableSortedSet<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableSortedSet<E> f24435a;

    public kz5(ImmutableSortedSet<E> immutableSortedSet) {
        super(ich.a(immutableSortedSet.comparator()).h());
        this.f24435a = immutableSortedSet;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E ceiling(E e) {
        return this.f24435a.floor(e);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f24435a.contains(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> createDescendingSet() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E floor(E e) {
        return this.f24435a.ceiling(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> headSetImpl(E e, boolean z) {
        return this.f24435a.tailSet((Object) e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E higher(E e) {
        return this.f24435a.lower(e);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public int indexOf(Object obj) {
        int iIndexOf = this.f24435a.indexOf(obj);
        return iIndexOf == -1 ? iIndexOf : (size() - 1) - iIndexOf;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.f24435a.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E lower(E e) {
        return this.f24435a.higher(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f24435a.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2) {
        return this.f24435a.subSet((Object) e2, z2, (Object) e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<E> tailSetImpl(E e, boolean z) {
        return this.f24435a.headSet((Object) e, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public uaq<E> descendingIterator() {
        return this.f24435a.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public ImmutableSortedSet<E> descendingSet() {
        return this.f24435a;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public uaq<E> iterator() {
        return this.f24435a.descendingIterator();
    }
}
