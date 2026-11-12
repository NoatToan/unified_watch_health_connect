package com.google.protobuf;

import defpackage.t8i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends d<Integer> implements d0.g, RandomAccess, t8i {
    public static final c0 d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f9611b;
    public int c;

    static {
        c0 c0Var = new c0(new int[0], 0);
        d = c0Var;
        c0Var.b();
    }

    public c0() {
        this(new int[10], 0);
    }

    public static c0 i() {
        return d;
    }

    private void j(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(l(i));
        }
    }

    private String l(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    @Override // com.google.protobuf.d0.g
    public int K(int i, int i2) {
        e();
        j(i);
        int[] iArr = this.f9611b;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // com.google.protobuf.d0.g
    public void Q(int i) {
        e();
        int i2 = this.c;
        int[] iArr = this.f9611b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f9611b = iArr2;
        }
        int[] iArr3 = this.f9611b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        e();
        d0.a(collection);
        if (!(collection instanceof c0)) {
            return super.addAll(collection);
        }
        c0 c0Var = (c0) collection;
        int i = c0Var.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f9611b;
        if (i3 > iArr.length) {
            this.f9611b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c0Var.f9611b, 0, this.f9611b, this.c, c0Var.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return super.equals(obj);
        }
        c0 c0Var = (c0) obj;
        if (this.c != c0Var.c) {
            return false;
        }
        int[] iArr = c0Var.f9611b;
        for (int i = 0; i < this.c; i++) {
            if (this.f9611b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i, Integer num) {
        h(i, num.intValue());
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        Q(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.d0.g
    public int getInt(int i) {
        j(i);
        return this.f9611b[i];
    }

    public final void h(int i, int i2) {
        int i3;
        e();
        if (i < 0 || i > (i3 = this.c)) {
            throw new IndexOutOfBoundsException(l(i));
        }
        int[] iArr = this.f9611b;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f9611b, i, iArr2, i + 1, this.c - i);
            this.f9611b = iArr2;
        }
        this.f9611b[i] = i2;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.f9611b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9611b[i] == iIntValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i) {
        e();
        j(i);
        int[] iArr = this.f9611b;
        int i2 = iArr[i];
        int i3 = this.c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(K(i, num.intValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        e();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f9611b;
        System.arraycopy(iArr, i2, iArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    public c0(int[] iArr, int i) {
        this.f9611b = iArr;
        this.c = i;
    }

    @Override // com.google.protobuf.d0.i, com.google.protobuf.d0.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d0.i<Integer> a2(int i) {
        if (i >= this.c) {
            return new c0(Arrays.copyOf(this.f9611b, i), this.c);
        }
        throw new IllegalArgumentException();
    }
}
