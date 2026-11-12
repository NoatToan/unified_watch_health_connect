package com.google.crypto.tink.shaded.protobuf;

import defpackage.s8i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends c<Long> implements s.h, RandomAccess, s8i {
    public static final x d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f9443b;
    public int c;

    static {
        x xVar = new x(new long[0], 0);
        d = xVar;
        xVar.b();
    }

    public x() {
        this(new long[10], 0);
    }

    private void j(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(m(i));
        }
    }

    private String m(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        e();
        s.a(collection);
        if (!(collection instanceof x)) {
            return super.addAll(collection);
        }
        x xVar = (x) collection;
        int i = xVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f9443b;
        if (i3 > jArr.length) {
            this.f9443b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(xVar.f9443b, 0, this.f9443b, this.c, xVar.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return super.equals(obj);
        }
        x xVar = (x) obj;
        if (this.c != xVar.c) {
            return false;
        }
        long[] jArr = xVar.f9443b;
        for (int i = 0; i < this.c; i++) {
            if (this.f9443b[i] != jArr[i]) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l) {
        i(l.longValue());
        return true;
    }

    public final void h(int i, long j) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(m(i));
        }
        long[] jArr = this.f9443b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f9443b, i, jArr2, i + 1, this.c - i);
            this.f9443b = jArr2;
        }
        this.f9443b[i] = j;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i = 0; i < this.c; i++) {
            iF = (iF * 31) + s.f(this.f9443b[i]);
        }
        return iF;
    }

    public void i(long j) {
        e();
        int i = this.c;
        long[] jArr = this.f9443b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f9443b = jArr2;
        }
        long[] jArr3 = this.f9443b;
        int i2 = this.c;
        this.c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Long get(int i) {
        return Long.valueOf(l(i));
    }

    public long l(int i) {
        j(i);
        return this.f9443b[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s.i
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public s.h a(int i) {
        if (i >= this.c) {
            return new x(Arrays.copyOf(this.f9443b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long remove(int i) {
        e();
        j(i);
        long[] jArr = this.f9443b;
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
        long[] jArr = this.f9443b;
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
        j(i);
        long[] jArr = this.f9443b;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public x(long[] jArr, int i) {
        this.f9443b = jArr;
        this.c = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        e();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Long.valueOf(this.f9443b[i]))) {
                long[] jArr = this.f9443b;
                System.arraycopy(jArr, i + 1, jArr, i, (this.c - i) - 1);
                this.c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
