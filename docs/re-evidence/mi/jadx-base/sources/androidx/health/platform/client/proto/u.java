package androidx.health.platform.client.proto;

import defpackage.r8i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class u extends c<Double> implements f0.b, RandomAccess, r8i {
    public static final u d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f2536b;
    public int c;

    static {
        u uVar = new u(new double[0], 0);
        d = uVar;
        uVar.b();
    }

    public u() {
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

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        e();
        f0.a(collection);
        if (!(collection instanceof u)) {
            return super.addAll(collection);
        }
        u uVar = (u) collection;
        int i = uVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f2536b;
        if (i3 > dArr.length) {
            this.f2536b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(uVar.f2536b, 0, this.f2536b, this.c, uVar.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return super.equals(obj);
        }
        u uVar = (u) obj;
        if (this.c != uVar.c) {
            return false;
        }
        double[] dArr = uVar.f2536b;
        for (int i = 0; i < this.c; i++) {
            if (Double.doubleToLongBits(this.f2536b[i]) != Double.doubleToLongBits(dArr[i])) {
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

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d2) {
        h(d2.doubleValue());
        return true;
    }

    public void h(double d2) {
        e();
        int i = this.c;
        double[] dArr = this.f2536b;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f2536b = dArr2;
        }
        double[] dArr3 = this.f2536b;
        int i2 = this.c;
        this.c = i2 + 1;
        dArr3[i2] = d2;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i = 0; i < this.c; i++) {
            iF = (iF * 31) + f0.f(Double.doubleToLongBits(this.f2536b[i]));
        }
        return iF;
    }

    public final void i(int i, double d2) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(m(i));
        }
        double[] dArr = this.f2536b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f2536b, i, dArr2, i + 1, this.c - i);
            this.f2536b = dArr2;
        }
        this.f2536b[i] = d2;
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
            if (this.f2536b[i] == dDoubleValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Double get(int i) {
        return Double.valueOf(l(i));
    }

    public double l(int i) {
        j(i);
        return this.f2536b[i];
    }

    @Override // androidx.health.platform.client.proto.f0.i
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public f0.b a(int i) {
        if (i >= this.c) {
            return new u(Arrays.copyOf(this.f2536b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Double remove(int i) {
        e();
        j(i);
        double[] dArr = this.f2536b;
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
        double[] dArr = this.f2536b;
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
        double[] dArr = this.f2536b;
        double d3 = dArr[i];
        dArr[i] = d2;
        return d3;
    }

    public u(double[] dArr, int i) {
        this.f2536b = dArr;
        this.c = i;
    }
}
