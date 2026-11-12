package com.google.protobuf;

import defpackage.t8i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends d<Boolean> implements d0.a, RandomAccess, t8i {
    public static final i d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f9652b;
    public int c;

    static {
        i iVar = new i(new boolean[0], 0);
        d = iVar;
        iVar.b();
    }

    public i() {
        this(new boolean[10], 0);
    }

    public static i i() {
        return d;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        e();
        d0.a(collection);
        if (!(collection instanceof i)) {
            return super.addAll(collection);
        }
        i iVar = (i) collection;
        int i = iVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f9652b;
        if (i3 > zArr.length) {
            this.f9652b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(iVar.f9652b, 0, this.f9652b, this.c, iVar.c);
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
        if (!(obj instanceof i)) {
            return super.equals(obj);
        }
        i iVar = (i) obj;
        if (this.c != iVar.c) {
            return false;
        }
        boolean[] zArr = iVar.f9652b;
        for (int i = 0; i < this.c; i++) {
            if (this.f9652b[i] != zArr[i]) {
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

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        p(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.d0.a
    public boolean getBoolean(int i) {
        j(i);
        return this.f9652b[i];
    }

    public final void h(int i, boolean z) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(l(i));
        }
        boolean[] zArr = this.f9652b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f9652b, i, zArr2, i + 1, this.c - i);
            this.f9652b = zArr2;
        }
        this.f9652b[i] = z;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iD = 1;
        for (int i = 0; i < this.c; i++) {
            iD = (iD * 31) + d0.d(this.f9652b[i]);
        }
        return iD;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9652b[i] == zBooleanValue) {
                return i;
            }
        }
        return -1;
    }

    public final void j(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(l(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i) {
        return Boolean.valueOf(getBoolean(i));
    }

    public final String l(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i) {
        e();
        j(i);
        boolean[] zArr = this.f9652b;
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

    @Override // com.google.protobuf.d0.a
    public void p(boolean z) {
        e();
        int i = this.c;
        boolean[] zArr = this.f9652b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f9652b = zArr2;
        }
        boolean[] zArr3 = this.f9652b;
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
        boolean[] zArr = this.f9652b;
        System.arraycopy(zArr, i2, zArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d0.a
    public boolean s(int i, boolean z) {
        e();
        j(i);
        boolean[] zArr = this.f9652b;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    public i(boolean[] zArr, int i) {
        this.f9652b = zArr;
        this.c = i;
    }

    @Override // com.google.protobuf.d0.i, com.google.protobuf.d0.f
    /* JADX INFO: renamed from: a */
    public d0.i<Boolean> a2(int i) {
        if (i >= this.c) {
            return new i(Arrays.copyOf(this.f9652b, i), this.c);
        }
        throw new IllegalArgumentException();
    }
}
