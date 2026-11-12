package rx.internal.util.atomic;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes23.dex */
public final class SpscAtomicArrayQueue<E> extends a<E> {
    private static final Integer e = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public final AtomicLong a;
    public long b;
    public final AtomicLong c;
    public final int d;

    public SpscAtomicArrayQueue(int i) {
        super(i);
        this.a = new AtomicLong();
        this.c = new AtomicLong();
        this.d = Math.min(i / 4, e.intValue());
    }

    private long a() {
        return this.c.get();
    }

    private long b() {
        return this.a.get();
    }

    private void c(long j) {
        this.c.lazySet(j);
    }

    private void d(long j) {
        this.a.lazySet(j);
    }

    @Override // rx.internal.util.atomic.a, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return b() == a();
    }

    @Override // rx.internal.util.atomic.a, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        Objects.requireNonNull(e2, "Null is not a valid element");
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i = this.mask;
        long j = this.a.get();
        int iCalcElementOffset = calcElementOffset(j, i);
        if (j >= this.b) {
            long j2 = ((long) this.d) + j;
            if (lvElement(atomicReferenceArray, calcElementOffset(j2, i)) == null) {
                this.b = j2;
            } else if (lvElement(atomicReferenceArray, iCalcElementOffset) != null) {
                return false;
            }
        }
        soElement(atomicReferenceArray, iCalcElementOffset, e2);
        d(j + 1);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        return lvElement(calcElementOffset(this.c.get()));
    }

    @Override // java.util.Queue
    public E poll() {
        long j = this.c.get();
        int iCalcElementOffset = calcElementOffset(j);
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        E eLvElement = lvElement(atomicReferenceArray, iCalcElementOffset);
        if (eLvElement == null) {
            return null;
        }
        soElement(atomicReferenceArray, iCalcElementOffset, null);
        c(j + 1);
        return eLvElement;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long jA = a();
        while (true) {
            long jB = b();
            long jA2 = a();
            if (jA == jA2) {
                return (int) (jB - jA2);
            }
            jA = jA2;
        }
    }
}
