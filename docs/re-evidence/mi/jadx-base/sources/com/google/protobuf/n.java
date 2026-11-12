package com.google.protobuf;

import defpackage.t8i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends d<Double> implements d0.b, RandomAccess, t8i {
    public static final n d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f9719b;
    public int c;

    static {
        n nVar = new n(new double[0], 0);
        d = nVar;
        nVar.b();
    }

    public n() {
        this(new double[10], 0);
    }

    public static n j() {
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
    public boolean addAll(Collection<? extends Double> collection) {
        e();
        d0.a(collection);
        if (!(collection instanceof n)) {
            return super.addAll(collection);
        }
        n nVar = (n) collection;
        int i = nVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f9719b;
        if (i3 > dArr.length) {
            this.f9719b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(nVar.f9719b, 0, this.f9719b, this.c, nVar.c);
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
        if (!(obj instanceof n)) {
            return super.equals(obj);
        }
        n nVar = (n) obj;
        if (this.c != nVar.c) {
            return false;
        }
        double[] dArr = nVar.f9719b;
        for (int i = 0; i < this.c; i++) {
            if (Double.doubleToLongBits(this.f9719b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i, Double d2) {
        i(i, d2.doubleValue());
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d2) {
        h(d2.doubleValue());
        return true;
    }

    public void h(double d2) {
        e();
        int i = this.c;
        double[] dArr = this.f9719b;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f9719b = dArr2;
        }
        double[] dArr3 = this.f9719b;
        int i2 = this.c;
        this.c = i2 + 1;
        dArr3[i2] = d2;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + d0.i(Double.doubleToLongBits(this.f9719b[i2]));
        }
        return i;
    }

    public final void i(int i, double d2) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(o(i));
        }
        double[] dArr = this.f9719b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f9719b, i, dArr2, i + 1, this.c - i);
            this.f9719b = dArr2;
        }
        this.f9719b[i] = d2;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9719b[i] == dDoubleValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Double get(int i) {
        return Double.valueOf(m(i));
    }

    public double m(int i) {
        k(i);
        return this.f9719b[i];
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Double remove(int i) {
        e();
        k(i);
        double[] dArr = this.f9719b;
        double d2 = dArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Double set(int i, Double d2) {
        return Double.valueOf(t(i, d2.doubleValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        e();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f9719b;
        System.arraycopy(dArr, i2, dArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    public double t(int i, double d2) {
        e();
        k(i);
        double[] dArr = this.f9719b;
        double d3 = dArr[i];
        dArr[i] = d2;
        return d3;
    }

    public n(double[] dArr, int i) {
        this.f9719b = dArr;
        this.c = i;
    }

    @Override // com.google.protobuf.d0.i, com.google.protobuf.d0.f
    /* JADX INFO: renamed from: a */
    public d0.i<Double> a2(int i) {
        if (i >= this.c) {
            return new n(Arrays.copyOf(this.f9719b, i), this.c);
        }
        throw new IllegalArgumentException();
    }
}
