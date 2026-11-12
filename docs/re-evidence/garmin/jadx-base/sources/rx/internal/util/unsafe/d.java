package rx.internal.util.unsafe;

import j20.x;

/* JADX INFO: loaded from: classes11.dex */
public final class d<E> extends h<E> {
    public d(int i14) {
        super(i14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return i() == f();
    }

    @Override // java.util.Queue
    public final boolean offer(E e4) {
        if (e4 == null) {
            x.l("Null is not a valid element");
            return false;
        }
        long jF = f();
        long jA = a(jF);
        E[] eArr = this.f154919b;
        if (a.c(eArr, jA) != null) {
            if (jF - i() > this.f154918a) {
                return false;
            }
            while (a.c(eArr, jA) != null) {
            }
        }
        a.e(eArr, jA, e4);
        g(jF + 1);
        return true;
    }

    @Override // java.util.Queue
    public final E peek() {
        E e4;
        long j8 = this.f154922h;
        do {
            long jI = i();
            if (jI >= j8) {
                long jF = f();
                if (jI >= jF) {
                    return null;
                }
                this.f154922h = jF;
            }
            e4 = (E) a.c(this.f154919b, a(jI));
        } while (e4 == null);
        return e4;
    }

    @Override // java.util.Queue
    public final E poll() {
        long jI;
        long j8 = this.f154922h;
        do {
            jI = i();
            if (jI >= j8) {
                long jF = f();
                if (jI >= jF) {
                    return null;
                }
                this.f154922h = jF;
            }
        } while (!h(jI, 1 + jI));
        long jA = a(jI);
        E[] eArr = this.f154919b;
        E e4 = (E) a.b(eArr, jA);
        a.d(eArr, jA, null);
        return e4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        long jI = i();
        while (true) {
            long jF = f();
            long jI2 = i();
            if (jI == jI2) {
                return (int) (jF - jI2);
            }
            jI = jI2;
        }
    }
}
