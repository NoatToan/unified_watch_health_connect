package androidx.health.platform.client.proto;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class v extends c<Double> implements RandomAccess, p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f7794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7795c;

    static {
        new v(new double[0], 0, false);
    }

    public v() {
        this(new double[10], 0, true);
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public final void add(int i14, Object obj) {
        int i15;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i14 < 0 || i14 > (i15 = this.f7795c)) {
            yc.l2.j(this.f7795c, b71.i.i(i14, "Index:", ", Size:"));
            return;
        }
        double[] dArr = this.f7794b;
        if (i15 < dArr.length) {
            System.arraycopy(dArr, i14, dArr, i14 + 1, i15 - i14);
        } else {
            double[] dArr2 = new double[androidx.core.view.j.a(i15, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i14);
            System.arraycopy(this.f7794b, i14, dArr2, i14 + 1, this.f7795c - i14);
            this.f7794b = dArr2;
        }
        this.f7794b[i14] = dDoubleValue;
        this.f7795c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        Charset charset = l0.f7708a;
        collection.getClass();
        if (!(collection instanceof v)) {
            return super.addAll(collection);
        }
        v vVar = (v) collection;
        int i14 = vVar.f7795c;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.f7795c;
        if (Integer.MAX_VALUE - i15 < i14) {
            com.google.protobuf.a.b();
            return false;
        }
        int i16 = i15 + i14;
        double[] dArr = this.f7794b;
        if (i16 > dArr.length) {
            this.f7794b = Arrays.copyOf(dArr, i16);
        }
        System.arraycopy(vVar.f7794b, 0, this.f7794b, this.f7795c, vVar.f7795c);
        this.f7795c = i16;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addDouble(double d14) {
        a();
        int i14 = this.f7795c;
        double[] dArr = this.f7794b;
        if (i14 == dArr.length) {
            double[] dArr2 = new double[androidx.core.view.j.a(i14, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i14);
            this.f7794b = dArr2;
        }
        double[] dArr3 = this.f7794b;
        int i15 = this.f7795c;
        this.f7795c = i15 + 1;
        dArr3[i15] = d14;
    }

    public final void b(int i14) {
        if (i14 < 0 || i14 >= this.f7795c) {
            yc.l2.j(this.f7795c, b71.i.i(i14, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return super.equals(obj);
        }
        v vVar = (v) obj;
        if (this.f7795c != vVar.f7795c) {
            return false;
        }
        double[] dArr = vVar.f7794b;
        for (int i14 = 0; i14 < this.f7795c; i14++) {
            if (Double.doubleToLongBits(this.f7794b[i14]) != Double.doubleToLongBits(dArr[i14])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i14) {
        b(i14);
        return Double.valueOf(this.f7794b[i14]);
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i14 = 0; i14 < this.f7795c; i14++) {
            iB = (iB * 31) + l0.b(Double.doubleToLongBits(this.f7794b[i14]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i14 = this.f7795c;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.f7794b[i15] == dDoubleValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // androidx.health.platform.client.proto.l0.d
    public final l0.d mutableCopyWithCapacity(int i14) {
        if (i14 >= this.f7795c) {
            return new v(Arrays.copyOf(this.f7794b, i14), this.f7795c, true);
        }
        vb.h.w();
        return null;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public final Object remove(int i14) {
        a();
        b(i14);
        double[] dArr = this.f7794b;
        double d14 = dArr[i14];
        int i15 = this.f7795c;
        if (i14 < i15 - 1) {
            System.arraycopy(dArr, i14 + 1, dArr, i14, (i15 - i14) - 1);
        }
        this.f7795c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d14);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i14, int i15) {
        a();
        if (i15 < i14) {
            org.apache.commons.lang3.e.v("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.f7794b;
        System.arraycopy(dArr, i15, dArr, i14, this.f7795c - i15);
        this.f7795c -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public final Object set(int i14, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        b(i14);
        double[] dArr = this.f7794b;
        double d14 = dArr[i14];
        dArr[i14] = dDoubleValue;
        return Double.valueOf(d14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7795c;
    }

    private v(double[] dArr, int i14, boolean z14) {
        super(z14);
        this.f7794b = dArr;
        this.f7795c = i14;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
