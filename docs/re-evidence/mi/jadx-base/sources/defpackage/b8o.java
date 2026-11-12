package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class b8o<E> extends cm1<E> {
    public static final Integer g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public final AtomicLong c;
    public long d;
    public final AtomicLong e;
    public final int f;

    public b8o(int i) {
        super(i);
        this.c = new AtomicLong();
        this.e = new AtomicLong();
        this.f = Math.min(i / 4, g.intValue());
    }

    @Override // defpackage.cm1, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return k() == j();
    }

    @Override // defpackage.cm1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public final long j() {
        return this.e.get();
    }

    public final long k() {
        return this.c.get();
    }

    public final void l(long j) {
        this.e.lazySet(j);
    }

    public final void m(long j) {
        this.c.lazySet(j);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<E> atomicReferenceArray = this.f5472a;
        int i = this.f5473b;
        long j = this.c.get();
        int iF = f(j, i);
        if (j >= this.d) {
            long j2 = ((long) this.f) + j;
            if (h(atomicReferenceArray, f(j2, i)) == null) {
                this.d = j2;
            } else if (h(atomicReferenceArray, iF) != null) {
                return false;
            }
        }
        i(atomicReferenceArray, iF, e);
        m(j + 1);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        return g(e(this.e.get()));
    }

    @Override // java.util.Queue
    public E poll() {
        long j = this.e.get();
        int iE = e(j);
        AtomicReferenceArray<E> atomicReferenceArray = this.f5472a;
        E eH = h(atomicReferenceArray, iE);
        if (eH == null) {
            return null;
        }
        i(atomicReferenceArray, iE, null);
        l(j + 1);
        return eH;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long j = j();
        while (true) {
            long jK = k();
            long j2 = j();
            if (j == j2) {
                return (int) (jK - j2);
            }
            j = j2;
        }
    }
}
