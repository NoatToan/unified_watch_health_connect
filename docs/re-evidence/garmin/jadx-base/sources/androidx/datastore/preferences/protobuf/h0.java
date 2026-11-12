package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends c<Long> implements RandomAccess, a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f6715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6716c;

    static {
        new h0(new long[0], 0, false);
    }

    public h0() {
        this(new long[10], 0, true);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final void add(int i14, Object obj) {
        int i15;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i14 < 0 || i14 > (i15 = this.f6716c)) {
            l2.j(this.f6716c, b71.i.i(i14, "Index:", ", Size:"));
            return;
        }
        long[] jArr = this.f6715b;
        if (i15 < jArr.length) {
            System.arraycopy(jArr, i14, jArr, i14 + 1, i15 - i14);
        } else {
            long[] jArr2 = new long[androidx.core.view.j.a(i15, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i14);
            System.arraycopy(this.f6715b, i14, jArr2, i14 + 1, this.f6716c - i14);
            this.f6715b = jArr2;
        }
        this.f6715b[i14] = jLongValue;
        this.f6716c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        Charset charset = z.f6936a;
        collection.getClass();
        if (!(collection instanceof h0)) {
            return super.addAll(collection);
        }
        h0 h0Var = (h0) collection;
        int i14 = h0Var.f6716c;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.f6716c;
        if (Integer.MAX_VALUE - i15 < i14) {
            com.google.protobuf.a.b();
            return false;
        }
        int i16 = i15 + i14;
        long[] jArr = this.f6715b;
        if (i16 > jArr.length) {
            this.f6715b = Arrays.copyOf(jArr, i16);
        }
        System.arraycopy(h0Var.f6715b, 0, this.f6715b, this.f6716c, h0Var.f6716c);
        this.f6716c = i16;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addLong(long j8) {
        a();
        int i14 = this.f6716c;
        long[] jArr = this.f6715b;
        if (i14 == jArr.length) {
            long[] jArr2 = new long[androidx.core.view.j.a(i14, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i14);
            this.f6715b = jArr2;
        }
        long[] jArr3 = this.f6715b;
        int i15 = this.f6716c;
        this.f6716c = i15 + 1;
        jArr3[i15] = j8;
    }

    public final void b(int i14) {
        if (i14 < 0 || i14 >= this.f6716c) {
            l2.j(this.f6716c, b71.i.i(i14, "Index:", ", Size:"));
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
        if (!(obj instanceof h0)) {
            return super.equals(obj);
        }
        h0 h0Var = (h0) obj;
        if (this.f6716c != h0Var.f6716c) {
            return false;
        }
        long[] jArr = h0Var.f6715b;
        for (int i14 = 0; i14 < this.f6716c; i14++) {
            if (this.f6715b[i14] != jArr[i14]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i14) {
        return Long.valueOf(getLong(i14));
    }

    public final long getLong(int i14) {
        b(i14);
        return this.f6715b[i14];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i14 = 0; i14 < this.f6716c; i14++) {
            iB = (iB * 31) + z.b(this.f6715b[i14]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i14 = this.f6716c;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.f6715b[i15] == jLongValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.z.d
    public final z.d mutableCopyWithCapacity(int i14) {
        if (i14 >= this.f6716c) {
            return new h0(Arrays.copyOf(this.f6715b, i14), this.f6716c, true);
        }
        vb.h.w();
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i14) {
        a();
        b(i14);
        long[] jArr = this.f6715b;
        long j8 = jArr[i14];
        int i15 = this.f6716c;
        if (i14 < i15 - 1) {
            System.arraycopy(jArr, i14 + 1, jArr, i14, (i15 - i14) - 1);
        }
        this.f6716c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i14, int i15) {
        a();
        if (i15 < i14) {
            org.apache.commons.lang3.e.v("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f6715b;
        System.arraycopy(jArr, i15, jArr, i14, this.f6716c - i15);
        this.f6716c -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final Object set(int i14, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        b(i14);
        long[] jArr = this.f6715b;
        long j8 = jArr[i14];
        jArr[i14] = jLongValue;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6716c;
    }

    private h0(long[] jArr, int i14, boolean z14) {
        super(z14);
        this.f6715b = jArr;
        this.f6716c = i14;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
