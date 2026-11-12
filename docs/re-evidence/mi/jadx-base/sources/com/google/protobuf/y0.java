package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class y0<E> extends d<E> implements RandomAccess {
    public static final y0<Object> d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E[] f9780b;
    public int c;

    static {
        y0<Object> y0Var = new y0<>(new Object[0], 0);
        d = y0Var;
        y0Var.b();
    }

    public y0(E[] eArr, int i) {
        this.f9780b = eArr;
        this.c = i;
    }

    public static <E> E[] f(int i) {
        return (E[]) new Object[i];
    }

    public static <E> y0<E> g() {
        return (y0<E>) d;
    }

    private void h(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    private String i(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        e();
        int i = this.c;
        E[] eArr = this.f9780b;
        if (i == eArr.length) {
            this.f9780b = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f9780b;
        int i2 = this.c;
        this.c = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        h(i);
        return this.f9780b[i];
    }

    @Override // com.google.protobuf.d0.i, com.google.protobuf.d0.f
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public y0<E> a(int i) {
        if (i >= this.c) {
            return new y0<>(Arrays.copyOf(this.f9780b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public E remove(int i) {
        e();
        h(i);
        E[] eArr = this.f9780b;
        E e = eArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        e();
        h(i);
        E[] eArr = this.f9780b;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        e();
        if (i >= 0 && i <= (i2 = this.c)) {
            E[] eArr = this.f9780b;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) f(((i2 * 3) / 2) + 1);
                System.arraycopy(this.f9780b, 0, eArr2, 0, i);
                System.arraycopy(this.f9780b, i, eArr2, i + 1, this.c - i);
                this.f9780b = eArr2;
            }
            this.f9780b[i] = e;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i));
    }
}
