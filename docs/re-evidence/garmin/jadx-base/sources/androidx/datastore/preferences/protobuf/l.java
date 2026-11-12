package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public final class l extends c<Double> implements RandomAccess, a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f6782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6783c;

    static {
        new l(new double[0], 0, false);
    }

    public l() {
        this(new double[10], 0, true);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final void add(int i14, Object obj) {
        int i15;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i14 < 0 || i14 > (i15 = this.f6783c)) {
            l2.j(this.f6783c, b71.i.i(i14, "Index:", ", Size:"));
            return;
        }
        double[] dArr = this.f6782b;
        if (i15 < dArr.length) {
            System.arraycopy(dArr, i14, dArr, i14 + 1, i15 - i14);
        } else {
            double[] dArr2 = new double[androidx.core.view.j.a(i15, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i14);
            System.arraycopy(this.f6782b, i14, dArr2, i14 + 1, this.f6783c - i14);
            this.f6782b = dArr2;
        }
        this.f6782b[i14] = dDoubleValue;
        this.f6783c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        Charset charset = z.f6936a;
        collection.getClass();
        if (!(collection instanceof l)) {
            return super.addAll(collection);
        }
        l lVar = (l) collection;
        int i14 = lVar.f6783c;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.f6783c;
        if (Integer.MAX_VALUE - i15 < i14) {
            com.google.protobuf.a.b();
            return false;
        }
        int i16 = i15 + i14;
        double[] dArr = this.f6782b;
        if (i16 > dArr.length) {
            this.f6782b = Arrays.copyOf(dArr, i16);
        }
        System.arraycopy(lVar.f6782b, 0, this.f6782b, this.f6783c, lVar.f6783c);
        this.f6783c = i16;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addDouble(double d14) {
        a();
        int i14 = this.f6783c;
        double[] dArr = this.f6782b;
        if (i14 == dArr.length) {
            double[] dArr2 = new double[androidx.core.view.j.a(i14, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i14);
            this.f6782b = dArr2;
        }
        double[] dArr3 = this.f6782b;
        int i15 = this.f6783c;
        this.f6783c = i15 + 1;
        dArr3[i15] = d14;
    }

    public final void b(int i14) {
        if (i14 < 0 || i14 >= this.f6783c) {
            l2.j(this.f6783c, b71.i.i(i14, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return super.equals(obj);
        }
        l lVar = (l) obj;
        if (this.f6783c != lVar.f6783c) {
            return false;
        }
        double[] dArr = lVar.f6782b;
        for (int i14 = 0; i14 < this.f6783c; i14++) {
            if (Double.doubleToLongBits(this.f6782b[i14]) != Double.doubleToLongBits(dArr[i14])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i14) {
        b(i14);
        return Double.valueOf(this.f6782b[i14]);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i14 = 0; i14 < this.f6783c; i14++) {
            iB = (iB * 31) + z.b(Double.doubleToLongBits(this.f6782b[i14]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i14 = this.f6783c;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.f6782b[i15] == dDoubleValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.z.d
    public final z.d mutableCopyWithCapacity(int i14) {
        if (i14 >= this.f6783c) {
            return new l(Arrays.copyOf(this.f6782b, i14), this.f6783c, true);
        }
        vb.h.w();
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i14) {
        a();
        b(i14);
        double[] dArr = this.f6782b;
        double d14 = dArr[i14];
        int i15 = this.f6783c;
        if (i14 < i15 - 1) {
            System.arraycopy(dArr, i14 + 1, dArr, i14, (i15 - i14) - 1);
        }
        this.f6783c--;
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
        double[] dArr = this.f6782b;
        System.arraycopy(dArr, i15, dArr, i14, this.f6783c - i15);
        this.f6783c -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final Object set(int i14, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        b(i14);
        double[] dArr = this.f6782b;
        double d14 = dArr[i14];
        dArr[i14] = dDoubleValue;
        return Double.valueOf(d14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6783c;
    }

    private l(double[] dArr, int i14, boolean z14) {
        super(z14);
        this.f6782b = dArr;
        this.f6783c = i14;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
