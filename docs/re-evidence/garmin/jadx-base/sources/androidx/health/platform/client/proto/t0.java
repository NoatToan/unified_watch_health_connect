package androidx.health.platform.client.proto;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends c<Long> implements RandomAccess, p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f7783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7784c;

    static {
        new t0(new long[0], 0, false);
    }

    public t0() {
        this(new long[10], 0, true);
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public final void add(int i14, Object obj) {
        int i15;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i14 < 0 || i14 > (i15 = this.f7784c)) {
            yc.l2.j(this.f7784c, b71.i.i(i14, "Index:", ", Size:"));
            return;
        }
        long[] jArr = this.f7783b;
        if (i15 < jArr.length) {
            System.arraycopy(jArr, i14, jArr, i14 + 1, i15 - i14);
        } else {
            long[] jArr2 = new long[androidx.core.view.j.a(i15, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i14);
            System.arraycopy(this.f7783b, i14, jArr2, i14 + 1, this.f7784c - i14);
            this.f7783b = jArr2;
        }
        this.f7783b[i14] = jLongValue;
        this.f7784c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        Charset charset = l0.f7708a;
        collection.getClass();
        if (!(collection instanceof t0)) {
            return super.addAll(collection);
        }
        t0 t0Var = (t0) collection;
        int i14 = t0Var.f7784c;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.f7784c;
        if (Integer.MAX_VALUE - i15 < i14) {
            com.google.protobuf.a.b();
            return false;
        }
        int i16 = i15 + i14;
        long[] jArr = this.f7783b;
        if (i16 > jArr.length) {
            this.f7783b = Arrays.copyOf(jArr, i16);
        }
        System.arraycopy(t0Var.f7783b, 0, this.f7783b, this.f7784c, t0Var.f7784c);
        this.f7784c = i16;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addLong(long j8) {
        a();
        int i14 = this.f7784c;
        long[] jArr = this.f7783b;
        if (i14 == jArr.length) {
            long[] jArr2 = new long[androidx.core.view.j.a(i14, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i14);
            this.f7783b = jArr2;
        }
        long[] jArr3 = this.f7783b;
        int i15 = this.f7784c;
        this.f7784c = i15 + 1;
        jArr3[i15] = j8;
    }

    public final void b(int i14) {
        if (i14 < 0 || i14 >= this.f7784c) {
            yc.l2.j(this.f7784c, b71.i.i(i14, "Index:", ", Size:"));
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
        if (!(obj instanceof t0)) {
            return super.equals(obj);
        }
        t0 t0Var = (t0) obj;
        if (this.f7784c != t0Var.f7784c) {
            return false;
        }
        long[] jArr = t0Var.f7783b;
        for (int i14 = 0; i14 < this.f7784c; i14++) {
            if (this.f7783b[i14] != jArr[i14]) {
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
        return this.f7783b[i14];
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i14 = 0; i14 < this.f7784c; i14++) {
            iB = (iB * 31) + l0.b(this.f7783b[i14]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i14 = this.f7784c;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.f7783b[i15] == jLongValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // androidx.health.platform.client.proto.l0.d
    public final l0.d mutableCopyWithCapacity(int i14) {
        if (i14 >= this.f7784c) {
            return new t0(Arrays.copyOf(this.f7783b, i14), this.f7784c, true);
        }
        vb.h.w();
        return null;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public final Object remove(int i14) {
        a();
        b(i14);
        long[] jArr = this.f7783b;
        long j8 = jArr[i14];
        int i15 = this.f7784c;
        if (i14 < i15 - 1) {
            System.arraycopy(jArr, i14 + 1, jArr, i14, (i15 - i14) - 1);
        }
        this.f7784c--;
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
        long[] jArr = this.f7783b;
        System.arraycopy(jArr, i15, jArr, i14, this.f7784c - i15);
        this.f7784c -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public final Object set(int i14, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        b(i14);
        long[] jArr = this.f7783b;
        long j8 = jArr[i14];
        jArr[i14] = jLongValue;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7784c;
    }

    private t0(long[] jArr, int i14, boolean z14) {
        super(z14);
        this.f7783b = jArr;
        this.f7784c = i14;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
