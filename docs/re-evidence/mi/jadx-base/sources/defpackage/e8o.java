package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: classes3.dex */
public final class e8o<T> implements Queue<T> {
    public static final int i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f16390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16391b;
    public long c;
    public int d;
    public AtomicReferenceArray<Object> e;
    public int f;
    public AtomicReferenceArray<Object> g;
    public final AtomicLong h;

    public e8o(int i2) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i2));
        int i3 = iRoundToPowerOfTwo - 1;
        this.f16390a = new AtomicLong();
        this.h = new AtomicLong();
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.e = atomicReferenceArray;
        this.d = i3;
        e(iRoundToPowerOfTwo);
        this.g = atomicReferenceArray;
        this.f = i3;
        this.c = iRoundToPowerOfTwo - 2;
        w(0L);
    }

    public static int f(int i2) {
        return i2;
    }

    public static int g(long j2, int i2) {
        return f(((int) j2) & i2);
    }

    public static <E> Object k(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }

    public static void u(AtomicReferenceArray<Object> atomicReferenceArray, int i2, Object obj) {
        atomicReferenceArray.lazySet(i2, obj);
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final void e(int i2) {
        this.f16391b = Math.min(i2 / 4, i);
    }

    @Override // java.util.Queue
    public T element() {
        throw new UnsupportedOperationException();
    }

    public final long h() {
        return this.h.get();
    }

    public final long i() {
        return this.f16390a.get();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m() == j();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    public final long j() {
        return this.h.get();
    }

    public final AtomicReferenceArray<Object> l(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) k(atomicReferenceArray, f(atomicReferenceArray.length() - 1));
    }

    public final long m() {
        return this.f16390a.get();
    }

    public final T o(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.g = atomicReferenceArray;
        return (T) k(atomicReferenceArray, g(j2, i2));
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        t.getClass();
        AtomicReferenceArray<Object> atomicReferenceArray = this.e;
        long jI = i();
        int i2 = this.d;
        int iG = g(jI, i2);
        if (jI < this.c) {
            return x(atomicReferenceArray, t, jI, iG);
        }
        long j2 = ((long) this.f16391b) + jI;
        if (k(atomicReferenceArray, g(j2, i2)) == null) {
            this.c = j2 - 1;
            return x(atomicReferenceArray, t, jI, iG);
        }
        if (k(atomicReferenceArray, g(1 + jI, i2)) != null) {
            return x(atomicReferenceArray, t, jI, iG);
        }
        r(atomicReferenceArray, jI, iG, t, i2);
        return true;
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.g;
        long jH = h();
        int i2 = this.f;
        T t = (T) k(atomicReferenceArray, g(jH, i2));
        return t == j ? o(l(atomicReferenceArray), jH, i2) : t;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.g;
        long jH = h();
        int i2 = this.f;
        int iG = g(jH, i2);
        T t = (T) k(atomicReferenceArray, iG);
        boolean z = t == j;
        if (t == null || z) {
            if (z) {
                return q(l(atomicReferenceArray), jH, i2);
            }
            return null;
        }
        t(jH + 1);
        u(atomicReferenceArray, iG, null);
        return t;
    }

    public final T q(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.g = atomicReferenceArray;
        int iG = g(j2, i2);
        T t = (T) k(atomicReferenceArray, iG);
        if (t == null) {
            return null;
        }
        t(j2 + 1);
        u(atomicReferenceArray, iG, null);
        return t;
    }

    public final void r(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.e = atomicReferenceArray2;
        this.c = (j3 + j2) - 1;
        w(j2 + 1);
        u(atomicReferenceArray2, i2, t);
        v(atomicReferenceArray, atomicReferenceArray2);
        u(atomicReferenceArray, i2, j);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public int size() {
        long j2 = j();
        while (true) {
            long jM = m();
            long j3 = j();
            if (j2 == j3) {
                return (int) (jM - j3);
            }
            j2 = j3;
        }
    }

    public final void t(long j2) {
        this.h.lazySet(j2);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public final void v(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        u(atomicReferenceArray, f(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    public final void w(long j2) {
        this.f16390a.lazySet(j2);
    }

    public final boolean x(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        w(j2 + 1);
        u(atomicReferenceArray, i2, t);
        return true;
    }

    @Override // java.util.Queue
    public T remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }
}
