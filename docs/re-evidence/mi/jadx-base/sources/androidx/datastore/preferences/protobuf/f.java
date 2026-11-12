package androidx.datastore.preferences.protobuf;

import defpackage.u8i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class f extends c<Boolean> implements s.a, RandomAccess, u8i {
    public static final f d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f2199b;
    public int c;

    static {
        f fVar = new f(new boolean[0], 0);
        d = fVar;
        fVar.b();
    }

    public f() {
        this(new boolean[10], 0);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        e();
        s.a(collection);
        if (!(collection instanceof f)) {
            return super.addAll(collection);
        }
        f fVar = (f) collection;
        int i = fVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f2199b;
        if (i3 > zArr.length) {
            this.f2199b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(fVar.f2199b, 0, this.f2199b, this.c, fVar.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (this.c != fVar.c) {
            return false;
        }
        boolean[] zArr = fVar.f2199b;
        for (int i = 0; i < this.c; i++) {
            if (this.f2199b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i, Boolean bool) {
        h(i, bool.booleanValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        p(bool.booleanValue());
        return true;
    }

    public boolean getBoolean(int i) {
        i(i);
        return this.f2199b[i];
    }

    public final void h(int i, boolean z) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(k(i));
        }
        boolean[] zArr = this.f2199b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f2199b, i, zArr2, i + 1, this.c - i);
            this.f2199b = zArr2;
        }
        this.f2199b[i] = z;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iC = 1;
        for (int i = 0; i < this.c; i++) {
            iC = (iC * 31) + s.c(this.f2199b[i]);
        }
        return iC;
    }

    public final void i(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(k(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i) {
        return Boolean.valueOf(getBoolean(i));
    }

    public final String k(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    @Override // androidx.datastore.preferences.protobuf.s.i
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public s.a a(int i) {
        if (i >= this.c) {
            return new f(Arrays.copyOf(this.f2199b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i) {
        e();
        i(i);
        boolean[] zArr = this.f2199b;
        boolean z = zArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(s(i, bool.booleanValue()));
    }

    public void p(boolean z) {
        e();
        int i = this.c;
        boolean[] zArr = this.f2199b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f2199b = zArr2;
        }
        boolean[] zArr3 = this.f2199b;
        int i2 = this.c;
        this.c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        e();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f2199b;
        System.arraycopy(zArr, i2, zArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public boolean s(int i, boolean z) {
        e();
        i(i);
        boolean[] zArr = this.f2199b;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    public f(boolean[] zArr, int i) {
        this.f2199b = zArr;
        this.c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        e();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Boolean.valueOf(this.f2199b[i]))) {
                boolean[] zArr = this.f2199b;
                System.arraycopy(zArr, i + 1, zArr, i, (this.c - i) - 1);
                this.c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
