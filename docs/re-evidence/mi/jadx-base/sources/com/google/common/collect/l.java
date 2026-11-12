package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
public final class l<E> extends ImmutableSortedMultiset<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient ImmutableSortedMultiset<E> f9198a;

    public l(ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.f9198a = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.u
    public int count(Object obj) {
        return this.f9198a.count(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.l0
    public u.a<E> firstEntry() {
        return this.f9198a.lastEntry();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public u.a<E> getEntry(int i) {
        return this.f9198a.entrySet().asList().reverse().get(i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.f9198a.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.l0
    public u.a<E> lastEntry() {
        return this.f9198a.firstEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
    public int size() {
        return this.f9198a.size();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.l0
    public ImmutableSortedMultiset<E> descendingMultiset() {
        return this.f9198a;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.l0
    public ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType) {
        return this.f9198a.tailMultiset((Object) e, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.l0
    public ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        return this.f9198a.headMultiset((Object) e, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.u
    public ImmutableSortedSet<E> elementSet() {
        return this.f9198a.elementSet().descendingSet();
    }
}
