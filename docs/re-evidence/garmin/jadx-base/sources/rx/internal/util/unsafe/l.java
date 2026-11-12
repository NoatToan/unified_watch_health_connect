package rx.internal.util.unsafe;

import j20.x;

/* JADX INFO: loaded from: classes11.dex */
public final class l<E> extends q<E> {
    public l(int i14) {
        super(i14);
    }

    public final long f() {
        return s.f154926a.getLongVolatile(this, n.f154924h);
    }

    public final long g() {
        return s.f154926a.getLongVolatile(this, r.f154925g);
    }

    public final void h(long j8) {
        s.f154926a.putOrderedLong(this, n.f154924h, j8);
    }

    public final void i(long j8) {
        s.f154926a.putOrderedLong(this, r.f154925g, j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return g() == f();
    }

    @Override // java.util.Queue
    public final boolean offer(E e4) {
        if (e4 == null) {
            x.l("null elements not allowed");
            return false;
        }
        long j8 = this.producerIndex;
        long jA = a(j8);
        E[] eArr = this.f154919b;
        if (a.c(eArr, jA) != null) {
            return false;
        }
        a.d(eArr, jA, e4);
        i(j8 + 1);
        return true;
    }

    @Override // java.util.Queue
    public final E peek() {
        return (E) a.c(this.f154919b, a(this.consumerIndex));
    }

    @Override // java.util.Queue
    public final E poll() {
        long j8 = this.consumerIndex;
        long jA = a(j8);
        E[] eArr = this.f154919b;
        E e4 = (E) a.c(eArr, jA);
        if (e4 == null) {
            return null;
        }
        a.d(eArr, jA, null);
        h(j8 + 1);
        return e4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        long jF = f();
        while (true) {
            long jG = g();
            long jF2 = f();
            if (jF == jF2) {
                return (int) (jG - jF2);
            }
            jF = jF2;
        }
    }
}
