package io.reactivex.internal.queue;

import defpackage.d5i;
import defpackage.fdm;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements fdm<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex;
    final int lookAheadStep;
    final int mask;
    final AtomicLong producerIndex;
    long producerLookAhead;

    public SpscArrayQueue(int i) {
        super(d5i.a(i));
        this.mask = length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }

    public int calcElementOffset(long j, int i) {
        return ((int) j) & i;
    }

    @Override // defpackage.jdm
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // defpackage.jdm
    public boolean isEmpty() {
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    public E lvElement(int i) {
        return get(i);
    }

    @Override // defpackage.jdm
    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i = this.mask;
        long j = this.producerIndex.get();
        int iCalcElementOffset = calcElementOffset(j, i);
        if (j >= this.producerLookAhead) {
            long j2 = ((long) this.lookAheadStep) + j;
            if (lvElement(calcElementOffset(j2, i)) == null) {
                this.producerLookAhead = j2;
            } else if (lvElement(iCalcElementOffset) != null) {
                return false;
            }
        }
        soElement(iCalcElementOffset, e);
        soProducerIndex(j + 1);
        return true;
    }

    @Override // defpackage.fdm, defpackage.jdm
    public E poll() {
        long j = this.consumerIndex.get();
        int iCalcElementOffset = calcElementOffset(j);
        E eLvElement = lvElement(iCalcElementOffset);
        if (eLvElement == null) {
            return null;
        }
        soConsumerIndex(j + 1);
        soElement(iCalcElementOffset, null);
        return eLvElement;
    }

    public void soConsumerIndex(long j) {
        this.consumerIndex.lazySet(j);
    }

    public void soElement(int i, E e) {
        lazySet(i, e);
    }

    public void soProducerIndex(long j) {
        this.producerIndex.lazySet(j);
    }

    public int calcElementOffset(long j) {
        return ((int) j) & this.mask;
    }

    public boolean offer(E e, E e2) {
        return offer(e) && offer(e2);
    }
}
