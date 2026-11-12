package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
class w<E> extends AbstractSet<E> implements Serializable {
    private static final int h = 1073741824;
    private static final float i = 1.0f;
    private static final long j = 4294967295L;
    private static final long k = -4294967296L;
    private static final int l = 3;
    public static final int m = -1;

    @MonotonicNonNullDecl
    private transient int[] a;

    @MonotonicNonNullDecl
    private transient long[] b;

    @MonotonicNonNullDecl
    public transient Object[] c;
    public transient float d;
    public transient int e;
    private transient int f;
    private transient int g;

    public class a implements Iterator<E> {
        public int a;
        public int b;
        public int c = -1;

        public a() {
            this.a = w.this.e;
            this.b = w.this.j();
        }

        private void a() {
            if (w.this.e != this.a) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b >= 0;
        }

        @Override // java.util.Iterator
        public E next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.b;
            this.c = i;
            w wVar = w.this;
            E e = (E) wVar.c[i];
            this.b = wVar.n(i);
            return e;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            u.e(this.c >= 0);
            this.a++;
            w wVar = w.this;
            wVar.u(wVar.c[this.c], w.k(wVar.b[this.c]));
            this.b = w.this.e(this.b, this.c);
            this.c = -1;
        }
    }

    public w() {
        p(3, 1.0f);
    }

    public static <E> w<E> f() {
        return new w<>();
    }

    public static <E> w<E> g(Collection<? extends E> collection) {
        w<E> wVarI = i(collection.size());
        wVarI.addAll(collection);
        return wVarI;
    }

    public static <E> w<E> h(E... eArr) {
        w<E> wVarI = i(eArr.length);
        Collections.addAll(wVarI, eArr);
        return wVarI;
    }

    public static <E> w<E> i(int i2) {
        return new w<>(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(long j2) {
        return (int) (j2 >>> 32);
    }

    private static int m(long j2) {
        return (int) j2;
    }

    private int o() {
        return this.a.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        p(3, 1.0f);
        int i2 = objectInputStream.readInt();
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                add(objectInputStream.readObject());
            }
        }
    }

    private static long[] s(int i2) {
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] t(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public boolean u(Object obj, int i2) {
        int iO = o() & i2;
        int i3 = this.a[iO];
        if (i3 == -1) {
            return false;
        }
        int i4 = -1;
        while (true) {
            if (k(this.b[i3]) == i2 && Objects.equal(obj, this.c[i3])) {
                if (i4 == -1) {
                    this.a[iO] = m(this.b[i3]);
                } else {
                    long[] jArr = this.b;
                    jArr[i4] = y(jArr[i4], m(jArr[i3]));
                }
                r(i3);
                this.g--;
                this.e++;
                return true;
            }
            int iM = m(this.b[i3]);
            if (iM == -1) {
                return false;
            }
            i4 = i3;
            i3 = iM;
        }
    }

    private void w(int i2) {
        int length = this.b.length;
        if (i2 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                v(iMax);
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.g);
        Iterator<E> it2 = iterator();
        while (it2.hasNext()) {
            objectOutputStream.writeObject(it2.next());
        }
    }

    private void x(int i2) {
        if (this.a.length >= 1073741824) {
            this.f = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (i2 * this.d)) + 1;
        int[] iArrT = t(i2);
        long[] jArr = this.b;
        int length = iArrT.length - 1;
        for (int i4 = 0; i4 < this.g; i4++) {
            int iK = k(jArr[i4]);
            int i5 = iK & length;
            int i6 = iArrT[i5];
            iArrT[i5] = i4;
            jArr[i4] = (((long) iK) << 32) | (((long) i6) & 4294967295L);
        }
        this.f = i3;
        this.a = iArrT;
    }

    private static long y(long j2, int i2) {
        return (j2 & k) | (((long) i2) & 4294967295L);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean add(@NullableDecl E e) {
        long[] jArr = this.b;
        Object[] objArr = this.c;
        int iD = b1.d(e);
        int iO = o() & iD;
        int i2 = this.g;
        int[] iArr = this.a;
        int i3 = iArr[iO];
        if (i3 == -1) {
            iArr[iO] = i2;
        } else {
            while (true) {
                long j2 = jArr[i3];
                if (k(j2) == iD && Objects.equal(e, objArr[i3])) {
                    return false;
                }
                int iM = m(j2);
                if (iM == -1) {
                    jArr[i3] = y(j2, i2);
                    break;
                }
                i3 = iM;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i4 = i2 + 1;
        w(i4);
        q(i2, e, iD);
        this.g = i4;
        if (i2 >= this.f) {
            x(this.a.length * 2);
        }
        this.e++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.e++;
        Arrays.fill(this.c, 0, this.g, (Object) null);
        Arrays.fill(this.a, -1);
        Arrays.fill(this.b, -1L);
        this.g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        int iD = b1.d(obj);
        int iM = this.a[o() & iD];
        while (iM != -1) {
            long j2 = this.b[iM];
            if (k(j2) == iD && Objects.equal(obj, this.c[iM])) {
                return true;
            }
            iM = m(j2);
        }
        return false;
    }

    public int e(int i2, int i3) {
        return i2 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.g == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new a();
    }

    public int j() {
        return isEmpty() ? -1 : 0;
    }

    public int n(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.g) {
            return i3;
        }
        return -1;
    }

    public void p(int i2, float f) {
        Preconditions.checkArgument(i2 >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f > 0.0f, "Illegal load factor");
        int iA = b1.a(i2, f);
        this.a = t(iA);
        this.d = f;
        this.c = new Object[i2];
        this.b = s(i2);
        this.f = Math.max(1, (int) (iA * f));
    }

    public void q(int i2, E e, int i3) {
        this.b[i2] = (((long) i3) << 32) | 4294967295L;
        this.c[i2] = e;
    }

    public void r(int i2) {
        int size = size() - 1;
        if (i2 >= size) {
            this.c[i2] = null;
            this.b[i2] = -1;
            return;
        }
        Object[] objArr = this.c;
        objArr[i2] = objArr[size];
        objArr[size] = null;
        long[] jArr = this.b;
        long j2 = jArr[size];
        jArr[i2] = j2;
        jArr[size] = -1;
        int iK = k(j2) & o();
        int[] iArr = this.a;
        int i3 = iArr[iK];
        if (i3 == size) {
            iArr[iK] = i2;
            return;
        }
        while (true) {
            long j3 = this.b[i3];
            int iM = m(j3);
            if (iM == size) {
                this.b[i3] = y(j3, i2);
                return;
            }
            i3 = iM;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj) {
        return u(obj, b1.d(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return Arrays.copyOf(this.c, this.g);
    }

    public void v(int i2) {
        this.c = Arrays.copyOf(this.c, i2);
        long[] jArr = this.b;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(jArrCopyOf, length, i2, -1L);
        }
        this.b = jArrCopyOf;
    }

    public void z() {
        int i2 = this.g;
        if (i2 < this.b.length) {
            v(i2);
        }
        int iMax = Math.max(1, Integer.highestOneBit((int) (i2 / this.d)));
        if (iMax < 1073741824 && ((double) i2) / ((double) iMax) > this.d) {
            iMax <<= 1;
        }
        if (iMax < this.a.length) {
            x(iMax);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ObjectArrays.i(this.c, 0, this.g, tArr);
    }

    public w(int i2) {
        p(i2, 1.0f);
    }
}
