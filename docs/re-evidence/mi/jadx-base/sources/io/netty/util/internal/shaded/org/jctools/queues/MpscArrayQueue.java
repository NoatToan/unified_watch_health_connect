package io.netty.util.internal.shaded.org.jctools.queues;

import io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo;
import io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess;

/* JADX INFO: loaded from: classes2.dex */
public class MpscArrayQueue<E> extends MpscArrayQueueL3Pad<E> {
    public MpscArrayQueue(int i) {
        super(i);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer) {
        return drain(consumer, capacity());
    }

    public final int failFastOffer(E e) {
        if (e == null) {
            throw null;
        }
        long j = this.mask;
        long j2 = j + 1;
        long jLvProducerIndex = lvProducerIndex();
        if (jLvProducerIndex >= lvProducerLimit()) {
            long jLvConsumerIndex = lvConsumerIndex() + j2;
            if (jLvProducerIndex >= jLvConsumerIndex) {
                return 1;
            }
            soProducerLimit(jLvConsumerIndex);
        }
        if (!casProducerIndex(jLvProducerIndex, 1 + jLvProducerIndex)) {
            return -1;
        }
        UnsafeRefArrayAccess.soElement(this.buffer, ConcurrentCircularArrayQueue.calcElementOffset(jLvProducerIndex, j), e);
        return 0;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier) {
        int iCapacity = capacity();
        long j = 0;
        do {
            int iFill = fill(supplier, PortableJvmInfo.RECOMENDED_OFFER_BATCH);
            if (iFill == 0) {
                return (int) j;
            }
            j += (long) iFill;
        } while (j <= iCapacity);
        return (int) j;
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        long jLvProducerIndex;
        if (e == null) {
            throw null;
        }
        long j = this.mask;
        long jLvProducerLimit = lvProducerLimit();
        do {
            jLvProducerIndex = lvProducerIndex();
            if (jLvProducerIndex >= jLvProducerLimit) {
                jLvProducerLimit = lvConsumerIndex() + j + 1;
                if (jLvProducerIndex >= jLvProducerLimit) {
                    return false;
                }
                soProducerLimit(jLvProducerLimit);
            }
        } while (!casProducerIndex(jLvProducerIndex, 1 + jLvProducerIndex));
        UnsafeRefArrayAccess.soElement(this.buffer, ConcurrentCircularArrayQueue.calcElementOffset(jLvProducerIndex, j), e);
        return true;
    }

    public boolean offerIfBelowThreshold(E e, int i) {
        long jLvProducerIndex;
        if (e == null) {
            throw null;
        }
        long j = this.mask;
        long j2 = j + 1;
        long jLvProducerLimit = lvProducerLimit();
        do {
            jLvProducerIndex = lvProducerIndex();
            long j3 = i;
            if (j2 - (jLvProducerLimit - jLvProducerIndex) >= j3) {
                long jLvConsumerIndex = lvConsumerIndex();
                if (jLvProducerIndex - jLvConsumerIndex >= j3) {
                    return false;
                }
                jLvProducerLimit = jLvConsumerIndex + j2;
                soProducerLimit(jLvProducerLimit);
            }
        } while (!casProducerIndex(jLvProducerIndex, jLvProducerIndex + 1));
        UnsafeRefArrayAccess.soElement(this.buffer, ConcurrentCircularArrayQueue.calcElementOffset(jLvProducerIndex, j), e);
        return true;
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E peek() {
        E[] eArr = this.buffer;
        long jLpConsumerIndex = lpConsumerIndex();
        long jCalcElementOffset = calcElementOffset(jLpConsumerIndex);
        E e = (E) UnsafeRefArrayAccess.lvElement(eArr, jCalcElementOffset);
        if (e == null) {
            if (jLpConsumerIndex == lvProducerIndex()) {
                return null;
            }
            do {
                e = (E) UnsafeRefArrayAccess.lvElement(eArr, jCalcElementOffset);
            } while (e == null);
        }
        return e;
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E poll() {
        long jLpConsumerIndex = lpConsumerIndex();
        long jCalcElementOffset = calcElementOffset(jLpConsumerIndex);
        E[] eArr = this.buffer;
        E e = (E) UnsafeRefArrayAccess.lvElement(eArr, jCalcElementOffset);
        if (e == null) {
            if (jLpConsumerIndex == lvProducerIndex()) {
                return null;
            }
            do {
                e = (E) UnsafeRefArrayAccess.lvElement(eArr, jCalcElementOffset);
            } while (e == null);
        }
        UnsafeRefArrayAccess.spElement(eArr, jCalcElementOffset, null);
        soConsumerIndex(jLpConsumerIndex + 1);
        return e;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        return offer(e);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        return (E) UnsafeRefArrayAccess.lvElement(this.buffer, ConcurrentCircularArrayQueue.calcElementOffset(lpConsumerIndex(), this.mask));
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        E[] eArr = this.buffer;
        long jLpConsumerIndex = lpConsumerIndex();
        long jCalcElementOffset = calcElementOffset(jLpConsumerIndex);
        E e = (E) UnsafeRefArrayAccess.lvElement(eArr, jCalcElementOffset);
        if (e == null) {
            return null;
        }
        UnsafeRefArrayAccess.spElement(eArr, jCalcElementOffset, null);
        soConsumerIndex(jLpConsumerIndex + 1);
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer, int i) {
        E[] eArr = this.buffer;
        long j = this.mask;
        long jLpConsumerIndex = lpConsumerIndex();
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = ((long) i2) + jLpConsumerIndex;
            long jCalcElementOffset = ConcurrentCircularArrayQueue.calcElementOffset(j2, j);
            Object objLvElement = UnsafeRefArrayAccess.lvElement(eArr, jCalcElementOffset);
            if (objLvElement == null) {
                return i2;
            }
            UnsafeRefArrayAccess.spElement(eArr, jCalcElementOffset, null);
            soConsumerIndex(j2 + 1);
            consumer.accept(objLvElement);
        }
        return i;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier, int i) {
        long jLvProducerIndex;
        int i2;
        int iMin;
        long j = this.mask;
        long j2 = 1 + j;
        long jLvProducerLimit = lvProducerLimit();
        do {
            jLvProducerIndex = lvProducerIndex();
            long j3 = jLvProducerLimit - jLvProducerIndex;
            if (j3 <= 0) {
                jLvProducerLimit = lvConsumerIndex() + j2;
                j3 = jLvProducerLimit - jLvProducerIndex;
                if (j3 <= 0) {
                    return 0;
                }
                soProducerLimit(jLvProducerLimit);
            }
            iMin = Math.min((int) j3, i);
        } while (!casProducerIndex(jLvProducerIndex, ((long) iMin) + jLvProducerIndex));
        E[] eArr = this.buffer;
        for (i2 = 0; i2 < iMin; i2++) {
            UnsafeRefArrayAccess.soElement(eArr, ConcurrentCircularArrayQueue.calcElementOffset(((long) i2) + jLvProducerIndex, j), supplier.get());
        }
        return iMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void drain(MessagePassingQueue.Consumer<E> consumer, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        E[] eArr = this.buffer;
        long j = this.mask;
        long jLpConsumerIndex = lpConsumerIndex();
        int iIdle = 0;
        while (exitCondition.keepRunning()) {
            for (int i = 0; i < 4096; i++) {
                long jCalcElementOffset = ConcurrentCircularArrayQueue.calcElementOffset(jLpConsumerIndex, j);
                Object objLvElement = UnsafeRefArrayAccess.lvElement(eArr, jCalcElementOffset);
                if (objLvElement == null) {
                    iIdle = waitStrategy.idle(iIdle);
                } else {
                    jLpConsumerIndex++;
                    UnsafeRefArrayAccess.spElement(eArr, jCalcElementOffset, null);
                    soConsumerIndex(jLpConsumerIndex);
                    consumer.accept(objLvElement);
                    iIdle = 0;
                }
            }
        }
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void fill(MessagePassingQueue.Supplier<E> supplier, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        while (true) {
            int iIdle = 0;
            while (exitCondition.keepRunning()) {
                if (fill(supplier, PortableJvmInfo.RECOMENDED_OFFER_BATCH) == 0) {
                    iIdle = waitStrategy.idle(iIdle);
                }
            }
            return;
        }
    }
}
