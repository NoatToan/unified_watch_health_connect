package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class c8o<T> implements fdm<T> {
    public static final int i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object j = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5055b;
    public long c;
    public final int d;
    public AtomicReferenceArray<Object> e;
    public final int f;
    public AtomicReferenceArray<Object> g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f5054a = new AtomicLong();
    public final AtomicLong h = new AtomicLong();

    public c8o(int i2) {
        int iA = d5i.a(Math.max(8, i2));
        int i3 = iA - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iA + 1);
        this.e = atomicReferenceArray;
        this.d = i3;
        a(iA);
        this.g = atomicReferenceArray;
        this.f = i3;
        this.c = iA - 2;
        o(0L);
    }

    public static int b(int i2) {
        return i2;
    }

    public static int c(long j2, int i2) {
        return b(((int) j2) & i2);
    }

    public static <E> Object g(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }

    private void l(long j2) {
        this.h.lazySet(j2);
    }

    public static void m(AtomicReferenceArray<Object> atomicReferenceArray, int i2, Object obj) {
        atomicReferenceArray.lazySet(i2, obj);
    }

    private void o(long j2) {
        this.f5054a.lazySet(j2);
    }

    public final void a(int i2) {
        this.f5055b = Math.min(i2 / 4, i);
    }

    @Override // defpackage.jdm
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final long d() {
        return this.h.get();
    }

    public final long e() {
        return this.f5054a.get();
    }

    public final long f() {
        return this.h.get();
    }

    public final AtomicReferenceArray<Object> h(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        int iB = b(i2);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) g(atomicReferenceArray, iB);
        m(atomicReferenceArray, iB, null);
        return atomicReferenceArray2;
    }

    public final long i() {
        return this.f5054a.get();
    }

    @Override // defpackage.jdm
    public boolean isEmpty() {
        return i() == f();
    }

    public final T j(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.g = atomicReferenceArray;
        int iC = c(j2, i2);
        T t = (T) g(atomicReferenceArray, iC);
        if (t != null) {
            m(atomicReferenceArray, iC, null);
            l(j2 + 1);
        }
        return t;
    }

    public final void k(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.e = atomicReferenceArray2;
        this.c = (j3 + j2) - 1;
        m(atomicReferenceArray2, i2, t);
        n(atomicReferenceArray, atomicReferenceArray2);
        m(atomicReferenceArray, i2, j);
        o(j2 + 1);
    }

    public final void n(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    @Override // defpackage.jdm
    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.e;
        long jE = e();
        int i2 = this.d;
        int iC = c(jE, i2);
        if (jE < this.c) {
            return p(atomicReferenceArray, t, jE, iC);
        }
        long j2 = ((long) this.f5055b) + jE;
        if (g(atomicReferenceArray, c(j2, i2)) == null) {
            this.c = j2 - 1;
            return p(atomicReferenceArray, t, jE, iC);
        }
        if (g(atomicReferenceArray, c(1 + jE, i2)) == null) {
            return p(atomicReferenceArray, t, jE, iC);
        }
        k(atomicReferenceArray, jE, iC, t, i2);
        return true;
    }

    public final boolean p(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        m(atomicReferenceArray, i2, t);
        o(j2 + 1);
        return true;
    }

    @Override // defpackage.fdm, defpackage.jdm
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.g;
        long jD = d();
        int i2 = this.f;
        int iC = c(jD, i2);
        T t = (T) g(atomicReferenceArray, iC);
        boolean z = t == j;
        if (t == null || z) {
            if (z) {
                return j(h(atomicReferenceArray, i2 + 1), jD, i2);
            }
            return null;
        }
        m(atomicReferenceArray, iC, null);
        l(jD + 1);
        return t;
    }
}
