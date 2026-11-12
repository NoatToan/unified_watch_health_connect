package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
class z1<E> extends c1<E> {
    private final ImmutableCollection<E> c;
    private final ImmutableList<? extends E> d;

    public z1(ImmutableCollection<E> immutableCollection, ImmutableList<? extends E> immutableList) {
        this.c = immutableCollection;
        this.d = immutableList;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public int a(Object[] objArr, int i) {
        return this.d.a(objArr, i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] b() {
        return this.d.b();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int c() {
        return this.d.c();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int e() {
        return this.d.e();
    }

    @Override // java.util.List
    public E get(int i) {
        return this.d.get(i);
    }

    @Override // com.google.common.collect.c1
    public ImmutableCollection<E> k() {
        return this.c;
    }

    public ImmutableList<? extends E> m() {
        return this.d;
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public UnmodifiableListIterator<E> listIterator(int i) {
        return this.d.listIterator(i);
    }

    public z1(ImmutableCollection<E> immutableCollection, Object[] objArr) {
        this(immutableCollection, ImmutableList.g(objArr));
    }

    public z1(ImmutableCollection<E> immutableCollection, Object[] objArr, int i) {
        this(immutableCollection, ImmutableList.h(objArr, i));
    }
}
