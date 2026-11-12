package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue;
import io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators;
import io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo;
import io.netty.util.internal.shaded.org.jctools.util.Pow2;
import io.netty.util.internal.shaded.org.jctools.util.RangeUtil;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseMpscLinkedAtomicArrayQueue<E> extends BaseMpscLinkedAtomicArrayQueueColdProducerFields<E> implements MessagePassingQueue<E>, QueueProgressIndicators {
    private static final Object JUMP = new Object();

    public BaseMpscLinkedAtomicArrayQueue(int i) {
        RangeUtil.checkGreaterThanOrEqual(i, 2, "initialCapacity");
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        long j = (iRoundToPowerOfTwo - 1) << 1;
        AtomicReferenceArray<E> atomicReferenceArrayAllocate = LinkedAtomicArrayQueueUtil.allocate(iRoundToPowerOfTwo + 1);
        this.producerBuffer = atomicReferenceArrayAllocate;
        this.producerMask = j;
        this.consumerBuffer = atomicReferenceArrayAllocate;
        this.consumerMask = j;
        soProducerLimit(j);
    }

    private AtomicReferenceArray<E> getNextBuffer(AtomicReferenceArray<E> atomicReferenceArray, long j) {
        int iNextArrayOffset = nextArrayOffset(j);
        AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray) LinkedAtomicArrayQueueUtil.lvElement(atomicReferenceArray, iNextArrayOffset);
        LinkedAtomicArrayQueueUtil.soElement(atomicReferenceArray, iNextArrayOffset, null);
        return atomicReferenceArray2;
    }

    private int newBufferAndOffset(AtomicReferenceArray<E> atomicReferenceArray, long j) {
        this.consumerBuffer = atomicReferenceArray;
        long length = (LinkedAtomicArrayQueueUtil.length(atomicReferenceArray) - 2) << 1;
        this.consumerMask = length;
        return LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(j, length);
    }

    private E newBufferPeek(AtomicReferenceArray<E> atomicReferenceArray, long j) {
        E e = (E) LinkedAtomicArrayQueueUtil.lvElement(atomicReferenceArray, newBufferAndOffset(atomicReferenceArray, j));
        if (e != null) {
            return e;
        }
        throw new IllegalStateException("new buffer must have at least one element");
    }

    private E newBufferPoll(AtomicReferenceArray<E> atomicReferenceArray, long j) {
        int iNewBufferAndOffset = newBufferAndOffset(atomicReferenceArray, j);
        E e = (E) LinkedAtomicArrayQueueUtil.lvElement(atomicReferenceArray, iNewBufferAndOffset);
        if (e == null) {
            throw new IllegalStateException("new buffer must have at least one element");
        }
        LinkedAtomicArrayQueueUtil.soElement(atomicReferenceArray, iNewBufferAndOffset, null);
        soConsumerIndex(j + 2);
        return e;
    }

    private int nextArrayOffset(long j) {
        return LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(j + 2, Long.MAX_VALUE);
    }

    private int offerSlowPath(long j, long j2, long j3) {
        long jLvConsumerIndex = lvConsumerIndex();
        long currentBufferCapacity = getCurrentBufferCapacity(j) + jLvConsumerIndex;
        if (currentBufferCapacity > j2) {
            return !casProducerLimit(j3, currentBufferCapacity) ? 1 : 0;
        }
        if (availableInQueue(j2, jLvConsumerIndex) <= 0) {
            return 2;
        }
        return casProducerIndex(j2, 1 + j2) ? 3 : 1;
    }

    private void resize(long j, AtomicReferenceArray<E> atomicReferenceArray, long j2, E e) {
        int nextBufferSize = getNextBufferSize(atomicReferenceArray);
        AtomicReferenceArray<E> atomicReferenceArrayAllocate = LinkedAtomicArrayQueueUtil.allocate(nextBufferSize);
        this.producerBuffer = atomicReferenceArrayAllocate;
        long j3 = (nextBufferSize - 2) << 1;
        this.producerMask = j3;
        int iModifiedCalcElementOffset = LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(j2, j);
        LinkedAtomicArrayQueueUtil.soElement(atomicReferenceArrayAllocate, LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(j2, j3), e);
        LinkedAtomicArrayQueueUtil.soElement(atomicReferenceArray, nextArrayOffset(j), atomicReferenceArrayAllocate);
        long jAvailableInQueue = availableInQueue(j2, lvConsumerIndex());
        RangeUtil.checkPositive(jAvailableInQueue, "availableInQueue");
        soProducerLimit(Math.min(j3, jAvailableInQueue) + j2);
        soProducerIndex(j2 + 2);
        LinkedAtomicArrayQueueUtil.soElement(atomicReferenceArray, iModifiedCalcElementOffset, JUMP);
    }

    public abstract long availableInQueue(long j, long j2);

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public abstract int capacity();

    @Override // io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public long currentConsumerIndex() {
        return lvConsumerIndex() / 2;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public long currentProducerIndex() {
        return lvProducerIndex() / 2;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer) {
        return drain(consumer, capacity());
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

    public abstract long getCurrentBufferCapacity(long j);

    public abstract int getNextBufferSize(AtomicReferenceArray<E> atomicReferenceArray);

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final boolean isEmpty() {
        return lvConsumerIndex() == lvProducerIndex();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        if (e == null) {
            throw null;
        }
        while (true) {
            long jLvProducerLimit = lvProducerLimit();
            long jLvProducerIndex = lvProducerIndex();
            if ((jLvProducerIndex & 1) != 1) {
                long j = this.producerMask;
                AtomicReferenceArray<E> atomicReferenceArray = this.producerBuffer;
                if (jLvProducerLimit <= jLvProducerIndex) {
                    int iOfferSlowPath = offerSlowPath(j, jLvProducerIndex, jLvProducerLimit);
                    if (iOfferSlowPath == 1) {
                        continue;
                    } else {
                        if (iOfferSlowPath == 2) {
                            return false;
                        }
                        if (iOfferSlowPath == 3) {
                            resize(j, atomicReferenceArray, jLvProducerIndex, e);
                            return true;
                        }
                    }
                }
                if (casProducerIndex(jLvProducerIndex, 2 + jLvProducerIndex)) {
                    LinkedAtomicArrayQueueUtil.soElement(atomicReferenceArray, LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(jLvProducerIndex, j), e);
                    return true;
                }
            }
        }
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E peek() {
        AtomicReferenceArray<E> atomicReferenceArray = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        int iModifiedCalcElementOffset = LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(j, j2);
        E e = (E) LinkedAtomicArrayQueueUtil.lvElement(atomicReferenceArray, iModifiedCalcElementOffset);
        if (e == null && j != lvProducerIndex()) {
            do {
                e = (E) LinkedAtomicArrayQueueUtil.lvElement(atomicReferenceArray, iModifiedCalcElementOffset);
            } while (e == null);
        }
        return e == JUMP ? newBufferPeek(getNextBuffer(atomicReferenceArray, j2), j) : e;
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E poll() {
        AtomicReferenceArray<E> atomicReferenceArray = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        int iModifiedCalcElementOffset = LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(j, j2);
        E e = (E) LinkedAtomicArrayQueueUtil.lvElement(atomicReferenceArray, iModifiedCalcElementOffset);
        if (e == null) {
            if (j == lvProducerIndex()) {
                return null;
            }
            do {
                e = (E) LinkedAtomicArrayQueueUtil.lvElement(atomicReferenceArray, iModifiedCalcElementOffset);
            } while (e == null);
        }
        if (e == JUMP) {
            return newBufferPoll(getNextBuffer(atomicReferenceArray, j2), j);
        }
        LinkedAtomicArrayQueueUtil.soElement(atomicReferenceArray, iModifiedCalcElementOffset, null);
        soConsumerIndex(j + 2);
        return e;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        return offer(e);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        AtomicReferenceArray<E> atomicReferenceArray = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        E e = (E) LinkedAtomicArrayQueueUtil.lvElement(atomicReferenceArray, LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(j, j2));
        return e == JUMP ? newBufferPeek(getNextBuffer(atomicReferenceArray, j2), j) : e;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        AtomicReferenceArray<E> atomicReferenceArray = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        int iModifiedCalcElementOffset = LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(j, j2);
        E e = (E) LinkedAtomicArrayQueueUtil.lvElement(atomicReferenceArray, iModifiedCalcElementOffset);
        if (e == null) {
            return null;
        }
        if (e == JUMP) {
            return newBufferPoll(getNextBuffer(atomicReferenceArray, j2), j);
        }
        LinkedAtomicArrayQueueUtil.soElement(atomicReferenceArray, iModifiedCalcElementOffset, null);
        soConsumerIndex(j + 2);
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final int size() {
        long jLvProducerIndex;
        long jLvConsumerIndex;
        long jLvConsumerIndex2 = lvConsumerIndex();
        while (true) {
            jLvProducerIndex = lvProducerIndex();
            jLvConsumerIndex = lvConsumerIndex();
            if (jLvConsumerIndex2 == jLvConsumerIndex) {
                break;
            }
            jLvConsumerIndex2 = jLvConsumerIndex;
        }
        long j = (jLvProducerIndex - jLvConsumerIndex) >> 1;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return getClass().getName();
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer, int i) {
        int i2 = 0;
        while (i2 < i) {
            E eRelaxedPoll = relaxedPoll();
            if (eRelaxedPoll == null) {
                break;
            }
            consumer.accept(eRelaxedPoll);
            i2++;
        }
        return i2;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier, int i) {
        while (true) {
            long jLvProducerLimit = lvProducerLimit();
            long jLvProducerIndex = lvProducerIndex();
            if ((jLvProducerIndex & 1) != 1) {
                long j = this.producerMask;
                AtomicReferenceArray<E> atomicReferenceArray = this.producerBuffer;
                long jMin = Math.min(jLvProducerLimit, ((long) (i * 2)) + jLvProducerIndex);
                if (jLvProducerIndex == jLvProducerLimit || jLvProducerLimit < jMin) {
                    int iOfferSlowPath = offerSlowPath(j, jLvProducerIndex, jLvProducerLimit);
                    if (iOfferSlowPath == 1) {
                        continue;
                    } else {
                        if (iOfferSlowPath == 2) {
                            return 0;
                        }
                        if (iOfferSlowPath == 3) {
                            resize(j, atomicReferenceArray, jLvProducerIndex, supplier.get());
                            return 1;
                        }
                    }
                }
                if (casProducerIndex(jLvProducerIndex, jMin)) {
                    int i2 = (int) ((jMin - jLvProducerIndex) / 2);
                    for (int i3 = 0; i3 < i2; i3++) {
                        LinkedAtomicArrayQueueUtil.soElement(atomicReferenceArray, LinkedAtomicArrayQueueUtil.modifiedCalcElementOffset(((long) (i3 * 2)) + jLvProducerIndex, j), supplier.get());
                    }
                    return i2;
                }
            }
        }
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void drain(MessagePassingQueue.Consumer<E> consumer, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        while (true) {
            int iIdle = 0;
            while (exitCondition.keepRunning()) {
                E eRelaxedPoll = relaxedPoll();
                if (eRelaxedPoll == null) {
                    iIdle = waitStrategy.idle(iIdle);
                } else {
                    consumer.accept(eRelaxedPoll);
                }
            }
            return;
        }
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void fill(MessagePassingQueue.Supplier<E> supplier, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        while (exitCondition.keepRunning()) {
            while (fill(supplier, PortableJvmInfo.RECOMENDED_OFFER_BATCH) != 0 && exitCondition.keepRunning()) {
            }
            int iIdle = 0;
            while (exitCondition.keepRunning() && fill(supplier, PortableJvmInfo.RECOMENDED_OFFER_BATCH) == 0) {
                iIdle = waitStrategy.idle(iIdle);
            }
        }
    }
}
