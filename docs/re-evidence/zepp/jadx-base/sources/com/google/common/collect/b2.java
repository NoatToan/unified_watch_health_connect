package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
class b2<E> extends ImmutableList<E> {
    public static final ImmutableList<Object> e = new b2(new Object[0], 0);

    @VisibleForTesting
    public final transient Object[] c;
    private final transient int d;

    public b2(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public int a(Object[] objArr, int i) {
        System.arraycopy(this.c, 0, objArr, i, this.d);
        return i + this.d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] b() {
        return this.c;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int c() {
        return this.d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int e() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean f() {
        return false;
    }

    @Override // java.util.List
    public E get(int i) {
        Preconditions.checkElementIndex(i, this.d);
        return (E) this.c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.d;
    }
}
