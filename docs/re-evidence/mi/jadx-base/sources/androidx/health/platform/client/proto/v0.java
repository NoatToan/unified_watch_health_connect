package androidx.health.platform.client.proto;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class v0<E> extends c<E> implements RandomAccess {
    public static final v0<Object> d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E[] f2538b;
    public int c;

    static {
        v0<Object> v0Var = new v0<>(new Object[0], 0);
        d = v0Var;
        v0Var.b();
    }

    public v0(E[] eArr, int i) {
        this.f2538b = eArr;
        this.c = i;
    }

    public static <E> E[] f(int i) {
        return (E[]) new Object[i];
    }

    public static <E> v0<E> g() {
        return (v0<E>) d;
    }

    private void h(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    private String i(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        e();
        int i = this.c;
        E[] eArr = this.f2538b;
        if (i == eArr.length) {
            this.f2538b = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f2538b;
        int i2 = this.c;
        this.c = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        h(i);
        return this.f2538b[i];
    }

    @Override // androidx.health.platform.client.proto.f0.i
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public v0<E> a(int i) {
        if (i >= this.c) {
            return new v0<>(Arrays.copyOf(this.f2538b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public E remove(int i) {
        e();
        h(i);
        E[] eArr = this.f2538b;
        E e = eArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        e();
        h(i);
        E[] eArr = this.f2538b;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        e();
        if (i >= 0 && i <= (i2 = this.c)) {
            E[] eArr = this.f2538b;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) f(((i2 * 3) / 2) + 1);
                System.arraycopy(this.f2538b, 0, eArr2, 0, i);
                System.arraycopy(this.f2538b, i, eArr2, i + 1, this.c - i);
                this.f2538b = eArr2;
            }
            this.f2538b[i] = e;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i));
    }
}
