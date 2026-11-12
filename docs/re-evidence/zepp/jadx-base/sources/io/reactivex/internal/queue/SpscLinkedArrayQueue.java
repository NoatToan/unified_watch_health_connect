package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes22.dex */
public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {
    public static final int i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object j = new Object();
    public int b;
    public long c;
    public final int d;
    public AtomicReferenceArray<Object> e;
    public final int f;
    public AtomicReferenceArray<Object> g;
    public final AtomicLong a = new AtomicLong();
    public final AtomicLong h = new AtomicLong();

    public SpscLinkedArrayQueue(int i2) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i2));
        int i3 = iRoundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.e = atomicReferenceArray;
        this.d = i3;
        a(iRoundToPowerOfTwo);
        this.g = atomicReferenceArray;
        this.f = i3;
        this.c = i3 - 1;
        s(0L);
    }

    private void a(int i2) {
        this.b = Math.min(i2 / 4, i);
    }

    private static int d(int i2) {
        return i2;
    }

    private static int f(long j2, int i2) {
        return d(((int) j2) & i2);
    }

    private long g() {
        return this.h.get();
    }

    private long h() {
        return this.a.get();
    }

    private long i() {
        return this.h.get();
    }

    private static <E> Object j(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }

    private AtomicReferenceArray<Object> k(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        int iD = d(i2);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) j(atomicReferenceArray, iD);
        q(atomicReferenceArray, iD, null);
        return atomicReferenceArray2;
    }

    private long l() {
        return this.a.get();
    }

    private T m(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.g = atomicReferenceArray;
        return (T) j(atomicReferenceArray, f(j2, i2));
    }

    private T n(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.g = atomicReferenceArray;
        int iF = f(j2, i2);
        T t = (T) j(atomicReferenceArray, iF);
        if (t != null) {
            q(atomicReferenceArray, iF, null);
            p(j2 + 1);
        }
        return t;
    }

    private void o(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.e = atomicReferenceArray2;
        this.c = (j3 + j2) - 1;
        q(atomicReferenceArray2, i2, t);
        r(atomicReferenceArray, atomicReferenceArray2);
        q(atomicReferenceArray, i2, j);
        s(j2 + 1);
    }

    private void p(long j2) {
        this.h.lazySet(j2);
    }

    private static void q(AtomicReferenceArray<Object> atomicReferenceArray, int i2, Object obj) {
        atomicReferenceArray.lazySet(i2, obj);
    }

    private void r(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        q(atomicReferenceArray, d(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void s(long j2) {
        this.a.lazySet(j2);
    }

    private boolean t(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        q(atomicReferenceArray, i2, t);
        s(j2 + 1);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return l() == i();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        AtomicReferenceArray<Object> atomicReferenceArray = this.e;
        long jH = h();
        int i2 = this.d;
        int iF = f(jH, i2);
        if (jH < this.c) {
            return t(atomicReferenceArray, t, jH, iF);
        }
        long j2 = ((long) this.b) + jH;
        if (j(atomicReferenceArray, f(j2, i2)) == null) {
            this.c = j2 - 1;
            return t(atomicReferenceArray, t, jH, iF);
        }
        if (j(atomicReferenceArray, f(1 + jH, i2)) == null) {
            return t(atomicReferenceArray, t, jH, iF);
        }
        o(atomicReferenceArray, jH, iF, t, i2);
        return true;
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.g;
        long jG = g();
        int i2 = this.f;
        T t = (T) j(atomicReferenceArray, f(jG, i2));
        return t == j ? m(k(atomicReferenceArray, i2 + 1), jG, i2) : t;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.g;
        long jG = g();
        int i2 = this.f;
        int iF = f(jG, i2);
        T t = (T) j(atomicReferenceArray, iF);
        boolean z = t == j;
        if (t == null || z) {
            if (z) {
                return n(k(atomicReferenceArray, i2 + 1), jG, i2);
            }
            return null;
        }
        q(atomicReferenceArray, iF, null);
        p(jG + 1);
        return t;
    }

    public int size() {
        long jI = i();
        while (true) {
            long jL = l();
            long jI2 = i();
            if (jI == jI2) {
                return (int) (jL - jI2);
            }
            jI = jI2;
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.e;
        long jL = l();
        int i2 = this.d;
        long j2 = 2 + jL;
        if (j(atomicReferenceArray, f(j2, i2)) == null) {
            int iF = f(jL, i2);
            q(atomicReferenceArray, iF + 1, t2);
            q(atomicReferenceArray, iF, t);
            s(j2);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.e = atomicReferenceArray2;
        int iF2 = f(jL, i2);
        q(atomicReferenceArray2, iF2 + 1, t2);
        q(atomicReferenceArray2, iF2, t);
        r(atomicReferenceArray, atomicReferenceArray2);
        q(atomicReferenceArray, iF2, j);
        s(j2);
        return true;
    }
}
