package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue;
import io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public class MpscAtomicArrayQueue<E> extends MpscAtomicArrayQueueL3Pad<E> {
    public MpscAtomicArrayQueue(int i) {
        super(i);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer) {
        return drain(consumer, capacity());
    }

    public final int failFastOffer(E e) {
        if (e == null) {
            throw null;
        }
        int i = this.mask;
        long j = i + 1;
        long jLvProducerIndex = lvProducerIndex();
        if (jLvProducerIndex >= lvProducerLimit()) {
            long jLvConsumerIndex = lvConsumerIndex() + j;
            if (jLvProducerIndex >= jLvConsumerIndex) {
                return 1;
            }
            soProducerLimit(jLvConsumerIndex);
        }
        if (!casProducerIndex(jLvProducerIndex, 1 + jLvProducerIndex)) {
            return -1;
        }
        AtomicReferenceArrayQueue.soElement(this.buffer, calcElementOffset(jLvProducerIndex, i), e);
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

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        long jLvProducerIndex;
        if (e == null) {
            throw null;
        }
        int i = this.mask;
        long jLvProducerLimit = lvProducerLimit();
        do {
            jLvProducerIndex = lvProducerIndex();
            if (jLvProducerIndex >= jLvProducerLimit) {
                jLvProducerLimit = lvConsumerIndex() + ((long) i) + 1;
                if (jLvProducerIndex >= jLvProducerLimit) {
                    return false;
                }
                soProducerLimit(jLvProducerLimit);
            }
        } while (!casProducerIndex(jLvProducerIndex, 1 + jLvProducerIndex));
        AtomicReferenceArrayQueue.soElement(this.buffer, calcElementOffset(jLvProducerIndex, i), e);
        return true;
    }

    public boolean offerIfBelowThreshold(E e, int i) {
        long jLvProducerIndex;
        if (e == null) {
            throw null;
        }
        int i2 = this.mask;
        long j = i2 + 1;
        long jLvProducerLimit = lvProducerLimit();
        do {
            jLvProducerIndex = lvProducerIndex();
            long j2 = i;
            if (j - (jLvProducerLimit - jLvProducerIndex) >= j2) {
                long jLvConsumerIndex = lvConsumerIndex();
                if (jLvProducerIndex - jLvConsumerIndex >= j2) {
                    return false;
                }
                jLvProducerLimit = jLvConsumerIndex + j;
                soProducerLimit(jLvProducerLimit);
            }
        } while (!casProducerIndex(jLvProducerIndex, 1 + jLvProducerIndex));
        AtomicReferenceArrayQueue.soElement(this.buffer, calcElementOffset(jLvProducerIndex, i2), e);
        return true;
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E peek() {
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int iCalcElementOffset = calcElementOffset(jLpConsumerIndex);
        E e = (E) AtomicReferenceArrayQueue.lvElement(atomicReferenceArray, iCalcElementOffset);
        if (e == null) {
            if (jLpConsumerIndex == lvProducerIndex()) {
                return null;
            }
            do {
                e = (E) AtomicReferenceArrayQueue.lvElement(atomicReferenceArray, iCalcElementOffset);
            } while (e == null);
        }
        return e;
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E poll() {
        long jLpConsumerIndex = lpConsumerIndex();
        int iCalcElementOffset = calcElementOffset(jLpConsumerIndex);
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        E e = (E) AtomicReferenceArrayQueue.lvElement(atomicReferenceArray, iCalcElementOffset);
        if (e == null) {
            if (jLpConsumerIndex == lvProducerIndex()) {
                return null;
            }
            do {
                e = (E) AtomicReferenceArrayQueue.lvElement(atomicReferenceArray, iCalcElementOffset);
            } while (e == null);
        }
        AtomicReferenceArrayQueue.spElement(atomicReferenceArray, iCalcElementOffset, null);
        soConsumerIndex(jLpConsumerIndex + 1);
        return e;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        return offer(e);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        return (E) AtomicReferenceArrayQueue.lvElement(this.buffer, calcElementOffset(lpConsumerIndex(), this.mask));
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int iCalcElementOffset = calcElementOffset(jLpConsumerIndex);
        E e = (E) AtomicReferenceArrayQueue.lvElement(atomicReferenceArray, iCalcElementOffset);
        if (e == null) {
            return null;
        }
        AtomicReferenceArrayQueue.spElement(atomicReferenceArray, iCalcElementOffset, null);
        soConsumerIndex(jLpConsumerIndex + 1);
        return e;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Deprecated
    public int weakOffer(E e) {
        return failFastOffer(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer, int i) {
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i2 = this.mask;
        long jLpConsumerIndex = lpConsumerIndex();
        for (int i3 = 0; i3 < i; i3++) {
            long j = ((long) i3) + jLpConsumerIndex;
            int iCalcElementOffset = calcElementOffset(j, i2);
            Object objLvElement = AtomicReferenceArrayQueue.lvElement(atomicReferenceArray, iCalcElementOffset);
            if (objLvElement == null) {
                return i3;
            }
            AtomicReferenceArrayQueue.spElement(atomicReferenceArray, iCalcElementOffset, null);
            soConsumerIndex(j + 1);
            consumer.accept(objLvElement);
        }
        return i;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier, int i) {
        long jLvProducerIndex;
        int i2;
        int iMin;
        int i3 = this.mask;
        long j = i3 + 1;
        long jLvProducerLimit = lvProducerLimit();
        do {
            jLvProducerIndex = lvProducerIndex();
            long j2 = jLvProducerLimit - jLvProducerIndex;
            if (j2 <= 0) {
                jLvProducerLimit = lvConsumerIndex() + j;
                j2 = jLvProducerLimit - jLvProducerIndex;
                if (j2 <= 0) {
                    return 0;
                }
                soProducerLimit(jLvProducerLimit);
            }
            iMin = Math.min((int) j2, i);
        } while (!casProducerIndex(jLvProducerIndex, ((long) iMin) + jLvProducerIndex));
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        for (i2 = 0; i2 < iMin; i2++) {
            AtomicReferenceArrayQueue.soElement(atomicReferenceArray, calcElementOffset(((long) i2) + jLvProducerIndex, i3), supplier.get());
        }
        return iMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void drain(MessagePassingQueue.Consumer<E> consumer, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i = this.mask;
        long jLpConsumerIndex = lpConsumerIndex();
        int iIdle = 0;
        while (exitCondition.keepRunning()) {
            for (int i2 = 0; i2 < 4096; i2++) {
                int iCalcElementOffset = calcElementOffset(jLpConsumerIndex, i);
                Object objLvElement = AtomicReferenceArrayQueue.lvElement(atomicReferenceArray, iCalcElementOffset);
                if (objLvElement == null) {
                    iIdle = waitStrategy.idle(iIdle);
                } else {
                    jLpConsumerIndex++;
                    AtomicReferenceArrayQueue.spElement(atomicReferenceArray, iCalcElementOffset, null);
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
