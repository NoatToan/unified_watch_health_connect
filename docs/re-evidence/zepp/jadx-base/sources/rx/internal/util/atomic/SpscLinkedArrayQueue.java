package rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: classes23.dex */
public final class SpscLinkedArrayQueue<T> implements Queue<T> {
    public static final int i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object j = new Object();
    public final AtomicLong a;
    public int b;
    public long c;
    public int d;
    public AtomicReferenceArray<Object> e;
    public int f;
    public AtomicReferenceArray<Object> g;
    public final AtomicLong h;

    public SpscLinkedArrayQueue(int i2) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i2);
        int i3 = iRoundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.e = atomicReferenceArray;
        this.d = i3;
        a(iRoundToPowerOfTwo);
        this.g = atomicReferenceArray;
        this.f = i3;
        this.c = i3 - 1;
        this.a = new AtomicLong();
        this.h = new AtomicLong();
    }

    private void a(int i2) {
        this.b = Math.min(i2 / 4, i);
    }

    private static int b(int i2) {
        return i2;
    }

    private static int c(long j2, int i2) {
        return b(((int) j2) & i2);
    }

    private long d() {
        return this.h.get();
    }

    private long e() {
        return this.a.get();
    }

    private long f() {
        return this.h.get();
    }

    private static <E> Object g(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }

    private AtomicReferenceArray<Object> h(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) g(atomicReferenceArray, b(atomicReferenceArray.length() - 1));
    }

    private long i() {
        return this.a.get();
    }

    private T j(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.g = atomicReferenceArray;
        return (T) g(atomicReferenceArray, c(j2, i2));
    }

    private T k(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.g = atomicReferenceArray;
        int iC = c(j2, i2);
        T t = (T) g(atomicReferenceArray, iC);
        if (t == null) {
            return null;
        }
        n(atomicReferenceArray, iC, null);
        m(j2 + 1);
        return t;
    }

    private void l(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.e = atomicReferenceArray2;
        this.c = (j3 + j2) - 1;
        n(atomicReferenceArray2, i2, t);
        o(atomicReferenceArray, atomicReferenceArray2);
        n(atomicReferenceArray, i2, j);
        p(j2 + 1);
    }

    private void m(long j2) {
        this.h.lazySet(j2);
    }

    private static void n(AtomicReferenceArray<Object> atomicReferenceArray, int i2, Object obj) {
        atomicReferenceArray.lazySet(i2, obj);
    }

    private void o(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        n(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void p(long j2) {
        this.a.lazySet(j2);
    }

    private boolean q(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        n(atomicReferenceArray, i2, t);
        p(j2 + 1);
        return true;
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

    @Override // java.util.Queue
    public T element() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return i() == f();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.e;
        long jE = e();
        int i2 = this.d;
        int iC = c(jE, i2);
        if (jE < this.c) {
            return q(atomicReferenceArray, t, jE, iC);
        }
        long j2 = ((long) this.b) + jE;
        if (g(atomicReferenceArray, c(j2, i2)) == null) {
            this.c = j2 - 1;
            return q(atomicReferenceArray, t, jE, iC);
        }
        if (g(atomicReferenceArray, c(1 + jE, i2)) == null) {
            return q(atomicReferenceArray, t, jE, iC);
        }
        l(atomicReferenceArray, jE, iC, t, i2);
        return true;
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.g;
        long jD = d();
        int i2 = this.f;
        T t = (T) g(atomicReferenceArray, c(jD, i2));
        return t == j ? j(h(atomicReferenceArray), jD, i2) : t;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.g;
        long jD = d();
        int i2 = this.f;
        int iC = c(jD, i2);
        T t = (T) g(atomicReferenceArray, iC);
        boolean z = t == j;
        if (t == null || z) {
            if (z) {
                return k(h(atomicReferenceArray), jD, i2);
            }
            return null;
        }
        n(atomicReferenceArray, iC, null);
        m(jD + 1);
        return t;
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
        long jF = f();
        while (true) {
            long jI = i();
            long jF2 = f();
            if (jF == jF2) {
                return (int) (jI - jF2);
            }
            jF = jF2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    public boolean offer(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.e;
        long jI = i();
        int i2 = this.d;
        long j2 = 2 + jI;
        if (g(atomicReferenceArray, c(j2, i2)) == null) {
            int iC = c(jI, i2);
            n(atomicReferenceArray, iC + 1, t2);
            n(atomicReferenceArray, iC, t);
            p(j2);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.e = atomicReferenceArray2;
        int iC2 = c(jI, i2);
        n(atomicReferenceArray2, iC2 + 1, t2);
        n(atomicReferenceArray2, iC2, t);
        o(atomicReferenceArray, atomicReferenceArray2);
        n(atomicReferenceArray, iC2, j);
        p(j2);
        return true;
    }
}
