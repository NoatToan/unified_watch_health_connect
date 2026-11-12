package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
class y<E> extends w<E> {
    private static final int r = -2;

    @MonotonicNonNullDecl
    private transient int[] n;

    @MonotonicNonNullDecl
    private transient int[] o;
    private transient int p;
    private transient int q;

    public y() {
    }

    public static <E> y<E> A() {
        return new y<>();
    }

    public static <E> y<E> B(Collection<? extends E> collection) {
        y<E> yVarD = D(collection.size());
        yVarD.addAll(collection);
        return yVarD;
    }

    public static <E> y<E> C(E... eArr) {
        y<E> yVarD = D(eArr.length);
        Collections.addAll(yVarD, eArr);
        return yVarD;
    }

    public static <E> y<E> D(int i) {
        return new y<>(i);
    }

    private void E(int i, int i2) {
        if (i == -2) {
            this.p = i2;
        } else {
            this.o[i] = i2;
        }
        if (i2 == -2) {
            this.q = i;
        } else {
            this.n[i2] = i;
        }
    }

    @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        super.clear();
        this.p = -2;
        this.q = -2;
        Arrays.fill(this.n, -1);
        Arrays.fill(this.o, -1);
    }

    @Override // com.google.common.collect.w
    public int e(int i, int i2) {
        return i == size() ? i2 : i;
    }

    @Override // com.google.common.collect.w
    public int j() {
        return this.p;
    }

    @Override // com.google.common.collect.w
    public int n(int i) {
        return this.o[i];
    }

    @Override // com.google.common.collect.w
    public void p(int i, float f) {
        super.p(i, f);
        int[] iArr = new int[i];
        this.n = iArr;
        this.o = new int[i];
        Arrays.fill(iArr, -1);
        Arrays.fill(this.o, -1);
        this.p = -2;
        this.q = -2;
    }

    @Override // com.google.common.collect.w
    public void q(int i, E e, int i2) {
        super.q(i, e, i2);
        E(this.q, i);
        E(i, -2);
    }

    @Override // com.google.common.collect.w
    public void r(int i) {
        int size = size() - 1;
        super.r(i);
        E(this.n[i], this.o[i]);
        if (size != i) {
            E(this.n[size], i);
            E(i, this.o[size]);
        }
        this.n[size] = -1;
        this.o[size] = -1;
    }

    @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return ObjectArrays.g(this);
    }

    @Override // com.google.common.collect.w
    public void v(int i) {
        super.v(i);
        int[] iArr = this.n;
        int length = iArr.length;
        this.n = Arrays.copyOf(iArr, i);
        this.o = Arrays.copyOf(this.o, i);
        if (length < i) {
            Arrays.fill(this.n, length, i, -1);
            Arrays.fill(this.o, length, i, -1);
        }
    }

    public y(int i) {
        super(i);
    }

    @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ObjectArrays.h(this, tArr);
    }
}
