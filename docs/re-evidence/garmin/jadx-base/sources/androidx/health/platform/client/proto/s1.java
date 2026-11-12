package androidx.health.platform.client.proto;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class s1<E> extends c<E> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s1<Object> f7778d = new s1<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E[] f7779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7780c;

    public s1() {
        this(new Object[10], 0, true);
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public final void add(int i14, E e4) {
        int i15;
        a();
        if (i14 < 0 || i14 > (i15 = this.f7780c)) {
            yc.l2.j(this.f7780c, b71.i.i(i14, "Index:", ", Size:"));
            return;
        }
        E[] eArr = this.f7779b;
        if (i15 < eArr.length) {
            System.arraycopy(eArr, i14, eArr, i14 + 1, i15 - i14);
        } else {
            E[] eArr2 = (E[]) new Object[androidx.core.view.j.a(i15, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i14);
            System.arraycopy(this.f7779b, i14, eArr2, i14 + 1, this.f7780c - i14);
            this.f7779b = eArr2;
        }
        this.f7779b[i14] = e4;
        this.f7780c++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i14) {
        if (i14 < 0 || i14 >= this.f7780c) {
            yc.l2.j(this.f7780c, b71.i.i(i14, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i14) {
        b(i14);
        return this.f7779b[i14];
    }

    @Override // androidx.health.platform.client.proto.l0.d
    public final l0.d mutableCopyWithCapacity(int i14) {
        if (i14 >= this.f7780c) {
            return new s1(Arrays.copyOf(this.f7779b, i14), this.f7780c, true);
        }
        vb.h.w();
        return null;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public final E remove(int i14) {
        a();
        b(i14);
        E[] eArr = this.f7779b;
        E e4 = eArr[i14];
        int i15 = this.f7780c;
        if (i14 < i15 - 1) {
            System.arraycopy(eArr, i14 + 1, eArr, i14, (i15 - i14) - 1);
        }
        this.f7780c--;
        ((AbstractList) this).modCount++;
        return e4;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public final E set(int i14, E e4) {
        a();
        b(i14);
        E[] eArr = this.f7779b;
        E e14 = eArr[i14];
        eArr[i14] = e4;
        ((AbstractList) this).modCount++;
        return e14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7780c;
    }

    private s1(E[] eArr, int i14, boolean z14) {
        super(z14);
        this.f7779b = eArr;
        this.f7780c = i14;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e4) {
        a();
        int i14 = this.f7780c;
        E[] eArr = this.f7779b;
        if (i14 == eArr.length) {
            this.f7779b = (E[]) Arrays.copyOf(eArr, ((i14 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f7779b;
        int i15 = this.f7780c;
        this.f7780c = i15 + 1;
        eArr2[i15] = e4;
        ((AbstractList) this).modCount++;
        return true;
    }
}
