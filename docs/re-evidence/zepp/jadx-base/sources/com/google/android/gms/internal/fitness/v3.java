package com.google.android.gms.internal.fitness;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class v3<E> extends v1<E> implements RandomAccess {
    private static final v3<Object> d;
    private E[] b;
    private int c;

    static {
        v3<Object> v3Var = new v3<>(new Object[0], 0);
        d = v3Var;
        v3Var.zzar();
    }

    public v3() {
        this(new Object[10], 0);
    }

    private final void a(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(b(i));
        }
    }

    private final String b(int i) {
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public static <E> v3<E> c() {
        return (v3<E>) d;
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        zzas();
        int i = this.c;
        E[] eArr = this.b;
        if (i == eArr.length) {
            this.b = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        a(i);
        return this.b[i];
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        zzas();
        a(i);
        E[] eArr = this.b;
        E e = eArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zzas();
        a(i);
        E[] eArr = this.b;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.fitness.zzhh
    public final /* synthetic */ zzhh zzae(int i) {
        if (i >= this.c) {
            return new v3(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    private v3(E[] eArr, int i) {
        this.b = eArr;
        this.c = i;
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        zzas();
        if (i >= 0 && i <= (i2 = this.c)) {
            E[] eArr = this.b;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.b, i, eArr2, i + 1, this.c - i);
                this.b = eArr2;
            }
            this.b[i] = e;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(b(i));
    }
}
