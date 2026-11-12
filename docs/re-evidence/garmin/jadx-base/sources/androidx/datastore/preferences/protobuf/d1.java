package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public final class d1<E> extends c<E> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d1<Object> f6693d = new d1<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E[] f6694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6695c;

    public d1() {
        this(new Object[10], 0, true);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final void add(int i14, E e4) {
        int i15;
        a();
        if (i14 < 0 || i14 > (i15 = this.f6695c)) {
            l2.j(this.f6695c, b71.i.i(i14, "Index:", ", Size:"));
            return;
        }
        E[] eArr = this.f6694b;
        if (i15 < eArr.length) {
            System.arraycopy(eArr, i14, eArr, i14 + 1, i15 - i14);
        } else {
            E[] eArr2 = (E[]) new Object[androidx.core.view.j.a(i15, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i14);
            System.arraycopy(this.f6694b, i14, eArr2, i14 + 1, this.f6695c - i14);
            this.f6694b = eArr2;
        }
        this.f6694b[i14] = e4;
        this.f6695c++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i14) {
        if (i14 < 0 || i14 >= this.f6695c) {
            l2.j(this.f6695c, b71.i.i(i14, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i14) {
        b(i14);
        return this.f6694b[i14];
    }

    @Override // androidx.datastore.preferences.protobuf.z.d
    public final z.d mutableCopyWithCapacity(int i14) {
        if (i14 >= this.f6695c) {
            return new d1(Arrays.copyOf(this.f6694b, i14), this.f6695c, true);
        }
        vb.h.w();
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final E remove(int i14) {
        a();
        b(i14);
        E[] eArr = this.f6694b;
        E e4 = eArr[i14];
        int i15 = this.f6695c;
        if (i14 < i15 - 1) {
            System.arraycopy(eArr, i14 + 1, eArr, i14, (i15 - i14) - 1);
        }
        this.f6695c--;
        ((AbstractList) this).modCount++;
        return e4;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final E set(int i14, E e4) {
        a();
        b(i14);
        E[] eArr = this.f6694b;
        E e14 = eArr[i14];
        eArr[i14] = e4;
        ((AbstractList) this).modCount++;
        return e14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6695c;
    }

    private d1(E[] eArr, int i14, boolean z14) {
        super(z14);
        this.f6694b = eArr;
        this.f6695c = i14;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e4) {
        a();
        int i14 = this.f6695c;
        E[] eArr = this.f6694b;
        if (i14 == eArr.length) {
            this.f6694b = (E[]) Arrays.copyOf(eArr, ((i14 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f6694b;
        int i15 = this.f6695c;
        this.f6695c = i15 + 1;
        eArr2[i15] = e4;
        ((AbstractList) this).modCount++;
        return true;
    }
}
