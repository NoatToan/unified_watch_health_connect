package com.google.crypto.tink.shaded.protobuf;

import defpackage.s8i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends c<Double> implements s.b, RandomAccess, s8i {
    public static final j d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f9396b;
    public int c;

    static {
        j jVar = new j(new double[0], 0);
        d = jVar;
        jVar.b();
    }

    public j() {
        this(new double[10], 0);
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
    public boolean addAll(Collection<? extends Double> collection) {
        e();
        s.a(collection);
        if (!(collection instanceof j)) {
            return super.addAll(collection);
        }
        j jVar = (j) collection;
        int i = jVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f9396b;
        if (i3 > dArr.length) {
            this.f9396b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(jVar.f9396b, 0, this.f9396b, this.c, jVar.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return super.equals(obj);
        }
        j jVar = (j) obj;
        if (this.c != jVar.c) {
            return false;
        }
        double[] dArr = jVar.f9396b;
        for (int i = 0; i < this.c; i++) {
            if (Double.doubleToLongBits(this.f9396b[i]) != Double.doubleToLongBits(dArr[i])) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d2) {
        h(d2.doubleValue());
        return true;
    }

    public void h(double d2) {
        e();
        int i = this.c;
        double[] dArr = this.f9396b;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f9396b = dArr2;
        }
        double[] dArr3 = this.f9396b;
        int i2 = this.c;
        this.c = i2 + 1;
        dArr3[i2] = d2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i = 0; i < this.c; i++) {
            iF = (iF * 31) + s.f(Double.doubleToLongBits(this.f9396b[i]));
        }
        return iF;
    }

    public final void i(int i, double d2) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(m(i));
        }
        double[] dArr = this.f9396b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f9396b, i, dArr2, i + 1, this.c - i);
            this.f9396b = dArr2;
        }
        this.f9396b[i] = d2;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Double get(int i) {
        return Double.valueOf(l(i));
    }

    public double l(int i) {
        j(i);
        return this.f9396b[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s.i
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public s.b a(int i) {
        if (i >= this.c) {
            return new j(Arrays.copyOf(this.f9396b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Double remove(int i) {
        e();
        j(i);
        double[] dArr = this.f9396b;
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
        double[] dArr = this.f9396b;
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
        j(i);
        double[] dArr = this.f9396b;
        double d3 = dArr[i];
        dArr[i] = d2;
        return d3;
    }

    public j(double[] dArr, int i) {
        this.f9396b = dArr;
        this.c = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        e();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Double.valueOf(this.f9396b[i]))) {
                double[] dArr = this.f9396b;
                System.arraycopy(dArr, i + 1, dArr, i, (this.c - i) - 1);
                this.c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
