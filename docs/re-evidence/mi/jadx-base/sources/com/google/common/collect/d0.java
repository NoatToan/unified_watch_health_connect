package com.google.common.collect;

import defpackage.ahd;
import defpackage.c6i;
import defpackage.ich;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class d0<E> extends ImmutableSortedMultiset<E> {
    public static final long[] e = {0};
    public static final ImmutableSortedMultiset<Comparable> f = new d0(ich.e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient e0<E> f9170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient long[] f9171b;
    public final transient int c;
    public final transient int d;

    public d0(Comparator<? super E> comparator) {
        this.f9170a = ImmutableSortedSet.emptySet(comparator);
        this.f9171b = e;
        this.c = 0;
        this.d = 0;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.u
    public int count(Object obj) {
        int iIndexOf = this.f9170a.indexOf(obj);
        if (iIndexOf >= 0) {
            return e(iIndexOf);
        }
        return 0;
    }

    public final int e(int i) {
        long[] jArr = this.f9171b;
        int i2 = this.c;
        return (int) (jArr[(i2 + i) + 1] - jArr[i2 + i]);
    }

    public ImmutableSortedMultiset<E> f(int i, int i2) {
        c6i.s(i, i2, this.d);
        if (i == i2) {
            return ImmutableSortedMultiset.emptyMultiset(comparator());
        }
        return (i == 0 && i2 == this.d) ? this : new d0(this.f9170a.e(i, i2), this.f9171b, this.c + i, i2 - i);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.l0
    public u.a<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(0);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public u.a<E> getEntry(int i) {
        return v.g(this.f9170a.asList().get(i), e(i));
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.c > 0 || this.d < this.f9171b.length - 1;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.l0
    public u.a<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(this.d - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
    public int size() {
        long[] jArr = this.f9171b;
        int i = this.c;
        return ahd.j(jArr[this.d + i] - jArr[i]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.l0
    public ImmutableSortedMultiset<E> headMultiset(E e2, BoundType boundType) {
        return f(0, this.f9170a.f(e2, c6i.o(boundType) == BoundType.CLOSED));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.l0
    public ImmutableSortedMultiset<E> tailMultiset(E e2, BoundType boundType) {
        return f(this.f9170a.g(e2, c6i.o(boundType) == BoundType.CLOSED), this.d);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.u
    public ImmutableSortedSet<E> elementSet() {
        return this.f9170a;
    }

    public d0(e0<E> e0Var, long[] jArr, int i, int i2) {
        this.f9170a = e0Var;
        this.f9171b = jArr;
        this.c = i;
        this.d = i2;
    }
}
