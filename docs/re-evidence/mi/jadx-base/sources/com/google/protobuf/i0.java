package com.google.protobuf;

import defpackage.t8i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 extends d<Long> implements d0.h, RandomAccess, t8i {
    public static final i0 d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f9653b;
    public int c;

    static {
        i0 i0Var = new i0(new long[0], 0);
        d = i0Var;
        i0Var.b();
    }

    public i0() {
        this(new long[10], 0);
    }

    public static i0 j() {
        return d;
    }

    private void k(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(o(i));
        }
    }

    private String o(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        e();
        d0.a(collection);
        if (!(collection instanceof i0)) {
            return super.addAll(collection);
        }
        i0 i0Var = (i0) collection;
        int i = i0Var.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f9653b;
        if (i3 > jArr.length) {
            this.f9653b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(i0Var.f9653b, 0, this.f9653b, this.c, i0Var.c);
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
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        if (this.c != i0Var.c) {
            return false;
        }
        long[] jArr = i0Var.f9653b;
        for (int i = 0; i < this.c; i++) {
            if (this.f9653b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i, Long l) {
        h(i, l.longValue());
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l) {
        i(l.longValue());
        return true;
    }

    public final void h(int i, long j) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(o(i));
        }
        long[] jArr = this.f9653b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f9653b, i, jArr2, i + 1, this.c - i);
            this.f9653b = jArr2;
        }
        this.f9653b[i] = j;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + d0.i(this.f9653b[i2]);
        }
        return i;
    }

    public void i(long j) {
        e();
        int i = this.c;
        long[] jArr = this.f9653b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f9653b = jArr2;
        }
        long[] jArr3 = this.f9653b;
        int i2 = this.c;
        this.c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9653b[i] == jLongValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long get(int i) {
        return Long.valueOf(m(i));
    }

    public long m(int i) {
        k(i);
        return this.f9653b[i];
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long remove(int i) {
        e();
        k(i);
        long[] jArr = this.f9653b;
        long j = jArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long set(int i, Long l) {
        return Long.valueOf(t(i, l.longValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        e();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f9653b;
        System.arraycopy(jArr, i2, jArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    public long t(int i, long j) {
        e();
        k(i);
        long[] jArr = this.f9653b;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public i0(long[] jArr, int i) {
        this.f9653b = jArr;
        this.c = i;
    }

    @Override // com.google.protobuf.d0.i, com.google.protobuf.d0.f
    /* JADX INFO: renamed from: a */
    public d0.i<Long> a2(int i) {
        if (i >= this.c) {
            return new i0(Arrays.copyOf(this.f9653b, i), this.c);
        }
        throw new IllegalArgumentException();
    }
}
