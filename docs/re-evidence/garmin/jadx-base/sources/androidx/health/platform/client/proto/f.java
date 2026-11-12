package androidx.health.platform.client.proto;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class f extends c<Boolean> implements RandomAccess, p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f7602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7603c;

    static {
        new f(new boolean[0], 0, false);
    }

    public f() {
        this(new boolean[10], 0, true);
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public final void add(int i14, Object obj) {
        int i15;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i14 < 0 || i14 > (i15 = this.f7603c)) {
            yc.l2.j(this.f7603c, b71.i.i(i14, "Index:", ", Size:"));
            return;
        }
        boolean[] zArr = this.f7602b;
        if (i15 < zArr.length) {
            System.arraycopy(zArr, i14, zArr, i14 + 1, i15 - i14);
        } else {
            boolean[] zArr2 = new boolean[androidx.core.view.j.a(i15, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i14);
            System.arraycopy(this.f7602b, i14, zArr2, i14 + 1, this.f7603c - i14);
            this.f7602b = zArr2;
        }
        this.f7602b[i14] = zBooleanValue;
        this.f7603c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        Charset charset = l0.f7708a;
        collection.getClass();
        if (!(collection instanceof f)) {
            return super.addAll(collection);
        }
        f fVar = (f) collection;
        int i14 = fVar.f7603c;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.f7603c;
        if (Integer.MAX_VALUE - i15 < i14) {
            com.google.protobuf.a.b();
            return false;
        }
        int i16 = i15 + i14;
        boolean[] zArr = this.f7602b;
        if (i16 > zArr.length) {
            this.f7602b = Arrays.copyOf(zArr, i16);
        }
        System.arraycopy(fVar.f7602b, 0, this.f7602b, this.f7603c, fVar.f7603c);
        this.f7603c = i16;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addBoolean(boolean z14) {
        a();
        int i14 = this.f7603c;
        boolean[] zArr = this.f7602b;
        if (i14 == zArr.length) {
            boolean[] zArr2 = new boolean[androidx.core.view.j.a(i14, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i14);
            this.f7602b = zArr2;
        }
        boolean[] zArr3 = this.f7602b;
        int i15 = this.f7603c;
        this.f7603c = i15 + 1;
        zArr3[i15] = z14;
    }

    public final void b(int i14) {
        if (i14 < 0 || i14 >= this.f7603c) {
            yc.l2.j(this.f7603c, b71.i.i(i14, "Index:", ", Size:"));
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
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (this.f7603c != fVar.f7603c) {
            return false;
        }
        boolean[] zArr = fVar.f7602b;
        for (int i14 = 0; i14 < this.f7603c; i14++) {
            if (this.f7602b[i14] != zArr[i14]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i14) {
        b(i14);
        return Boolean.valueOf(this.f7602b[i14]);
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i14 = 1;
        for (int i15 = 0; i15 < this.f7603c; i15++) {
            int i16 = i14 * 31;
            boolean z14 = this.f7602b[i15];
            Charset charset = l0.f7708a;
            i14 = i16 + (z14 ? 1231 : 1237);
        }
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i14 = this.f7603c;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.f7602b[i15] == zBooleanValue) {
                return i15;
            }
        }
        return -1;
    }

    @Override // androidx.health.platform.client.proto.l0.d
    public final l0.d mutableCopyWithCapacity(int i14) {
        if (i14 >= this.f7603c) {
            return new f(Arrays.copyOf(this.f7602b, i14), this.f7603c, true);
        }
        vb.h.w();
        return null;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public final Object remove(int i14) {
        a();
        b(i14);
        boolean[] zArr = this.f7602b;
        boolean z14 = zArr[i14];
        int i15 = this.f7603c;
        if (i14 < i15 - 1) {
            System.arraycopy(zArr, i14 + 1, zArr, i14, (i15 - i14) - 1);
        }
        this.f7603c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z14);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i14, int i15) {
        a();
        if (i15 < i14) {
            org.apache.commons.lang3.e.v("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.f7602b;
        System.arraycopy(zArr, i15, zArr, i14, this.f7603c - i15);
        this.f7603c -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public final Object set(int i14, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        b(i14);
        boolean[] zArr = this.f7602b;
        boolean z14 = zArr[i14];
        zArr[i14] = zBooleanValue;
        return Boolean.valueOf(z14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7603c;
    }

    private f(boolean[] zArr, int i14, boolean z14) {
        super(z14);
        this.f7602b = zArr;
        this.f7603c = i14;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
