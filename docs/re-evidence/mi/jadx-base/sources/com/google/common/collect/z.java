package com.google.common.collect;

import defpackage.c6i;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class z<E> extends ImmutableList<E> {
    public static final ImmutableList<Object> c = new z(new Object[0], 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Object[] f9267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f9268b;

    public z(Object[] objArr, int i) {
        this.f9267a = objArr;
        this.f9268b = i;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.f9267a, 0, objArr, i, this.f9268b);
        return i + this.f9268b;
    }

    @Override // java.util.List
    public E get(int i) {
        c6i.m(i, this.f9268b);
        E e = (E) this.f9267a[i];
        Objects.requireNonNull(e);
        return e;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] internalArray() {
        return this.f9267a;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayEnd() {
        return this.f9268b;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayStart() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9268b;
    }
}
