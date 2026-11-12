package io.netty.util.internal.shaded.org.jctools.queues;

import io.netty.util.internal.shaded.org.jctools.util.PortableJvmInfo;
import io.netty.util.internal.shaded.org.jctools.util.Pow2;
import io.netty.util.internal.shaded.org.jctools.util.RangeUtil;
import io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseMpscLinkedArrayQueue<E> extends BaseMpscLinkedArrayQueueColdProducerFields<E> implements MessagePassingQueue<E>, QueueProgressIndicators {
    private static final int CONTINUE_TO_P_INDEX_CAS = 0;
    private static final Object JUMP = new Object();
    private static final int QUEUE_FULL = 2;
    private static final int QUEUE_RESIZE = 3;
    private static final int RETRY = 1;

    public BaseMpscLinkedArrayQueue(int i) {
        RangeUtil.checkGreaterThanOrEqual(i, 2, "initialCapacity");
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        long j = (iRoundToPowerOfTwo - 1) << 1;
        E[] eArr = (E[]) CircularArrayOffsetCalculator.allocate(iRoundToPowerOfTwo + 1);
        this.producerBuffer = eArr;
        this.producerMask = j;
        this.consumerBuffer = eArr;
        this.consumerMask = j;
        soProducerLimit(j);
    }

    private E[] getNextBuffer(E[] eArr, long j) {
        long jNextArrayOffset = nextArrayOffset(j);
        E[] eArr2 = (E[]) ((Object[]) UnsafeRefArrayAccess.lvElement(eArr, jNextArrayOffset));
        UnsafeRefArrayAccess.soElement(eArr, jNextArrayOffset, null);
        return eArr2;
    }

    private long newBufferAndOffset(E[] eArr, long j) {
        this.consumerBuffer = eArr;
        long length = (LinkedArrayQueueUtil.length(eArr) - 2) << 1;
        this.consumerMask = length;
        return LinkedArrayQueueUtil.modifiedCalcElementOffset(j, length);
    }

    private E newBufferPeek(E[] eArr, long j) {
        E e = (E) UnsafeRefArrayAccess.lvElement(eArr, newBufferAndOffset(eArr, j));
        if (e != null) {
            return e;
        }
        throw new IllegalStateException("new buffer must have at least one element");
    }

    private E newBufferPoll(E[] eArr, long j) {
        long jNewBufferAndOffset = newBufferAndOffset(eArr, j);
        E e = (E) UnsafeRefArrayAccess.lvElement(eArr, jNewBufferAndOffset);
        if (e == null) {
            throw new IllegalStateException("new buffer must have at least one element");
        }
        UnsafeRefArrayAccess.soElement(eArr, jNewBufferAndOffset, null);
        soConsumerIndex(j + 2);
        return e;
    }

    private long nextArrayOffset(long j) {
        return LinkedArrayQueueUtil.modifiedCalcElementOffset(j + 2, Long.MAX_VALUE);
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

    private void resize(long j, E[] eArr, long j2, E e) {
        int nextBufferSize = getNextBufferSize(eArr);
        E[] eArr2 = (E[]) CircularArrayOffsetCalculator.allocate(nextBufferSize);
        this.producerBuffer = eArr2;
        long j3 = (nextBufferSize - 2) << 1;
        this.producerMask = j3;
        long jModifiedCalcElementOffset = LinkedArrayQueueUtil.modifiedCalcElementOffset(j2, j);
        UnsafeRefArrayAccess.soElement(eArr2, LinkedArrayQueueUtil.modifiedCalcElementOffset(j2, j3), e);
        UnsafeRefArrayAccess.soElement(eArr, nextArrayOffset(j), eArr2);
        long jAvailableInQueue = availableInQueue(j2, lvConsumerIndex());
        RangeUtil.checkPositive(jAvailableInQueue, "availableInQueue");
        soProducerLimit(Math.min(j3, jAvailableInQueue) + j2);
        soProducerIndex(j2 + 2);
        UnsafeRefArrayAccess.soElement(eArr, jModifiedCalcElementOffset, JUMP);
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

    public abstract int getNextBufferSize(E[] eArr);

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
                E[] eArr = this.producerBuffer;
                if (jLvProducerLimit <= jLvProducerIndex) {
                    int iOfferSlowPath = offerSlowPath(j, jLvProducerIndex, jLvProducerLimit);
                    if (iOfferSlowPath == 1) {
                        continue;
                    } else {
                        if (iOfferSlowPath == 2) {
                            return false;
                        }
                        if (iOfferSlowPath == 3) {
                            resize(j, eArr, jLvProducerIndex, e);
                            return true;
                        }
                    }
                }
                if (casProducerIndex(jLvProducerIndex, 2 + jLvProducerIndex)) {
                    UnsafeRefArrayAccess.soElement(eArr, LinkedArrayQueueUtil.modifiedCalcElementOffset(jLvProducerIndex, j), e);
                    return true;
                }
            }
        }
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E peek() {
        E[] eArr = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        long jModifiedCalcElementOffset = LinkedArrayQueueUtil.modifiedCalcElementOffset(j, j2);
        E e = (E) UnsafeRefArrayAccess.lvElement(eArr, jModifiedCalcElementOffset);
        if (e == null && j != lvProducerIndex()) {
            do {
                e = (E) UnsafeRefArrayAccess.lvElement(eArr, jModifiedCalcElementOffset);
            } while (e == null);
        }
        return e == JUMP ? newBufferPeek(getNextBuffer(eArr, j2), j) : e;
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E poll() {
        E[] eArr = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        long jModifiedCalcElementOffset = LinkedArrayQueueUtil.modifiedCalcElementOffset(j, j2);
        E e = (E) UnsafeRefArrayAccess.lvElement(eArr, jModifiedCalcElementOffset);
        if (e == null) {
            if (j == lvProducerIndex()) {
                return null;
            }
            do {
                e = (E) UnsafeRefArrayAccess.lvElement(eArr, jModifiedCalcElementOffset);
            } while (e == null);
        }
        if (e == JUMP) {
            return newBufferPoll(getNextBuffer(eArr, j2), j);
        }
        UnsafeRefArrayAccess.soElement(eArr, jModifiedCalcElementOffset, null);
        soConsumerIndex(j + 2);
        return e;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        return offer(e);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        E[] eArr = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        E e = (E) UnsafeRefArrayAccess.lvElement(eArr, LinkedArrayQueueUtil.modifiedCalcElementOffset(j, j2));
        return e == JUMP ? newBufferPeek(getNextBuffer(eArr, j2), j) : e;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        E[] eArr = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        long jModifiedCalcElementOffset = LinkedArrayQueueUtil.modifiedCalcElementOffset(j, j2);
        E e = (E) UnsafeRefArrayAccess.lvElement(eArr, jModifiedCalcElementOffset);
        if (e == null) {
            return null;
        }
        if (e == JUMP) {
            return newBufferPoll(getNextBuffer(eArr, j2), j);
        }
        UnsafeRefArrayAccess.soElement(eArr, jModifiedCalcElementOffset, null);
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
                E[] eArr = this.producerBuffer;
                long jMin = Math.min(jLvProducerLimit, ((long) (i * 2)) + jLvProducerIndex);
                if (jLvProducerIndex >= jLvProducerLimit || jLvProducerLimit < jMin) {
                    int iOfferSlowPath = offerSlowPath(j, jLvProducerIndex, jLvProducerLimit);
                    if (iOfferSlowPath != 0 && iOfferSlowPath != 1) {
                        if (iOfferSlowPath == 2) {
                            return 0;
                        }
                        if (iOfferSlowPath == 3) {
                            resize(j, eArr, jLvProducerIndex, supplier.get());
                            return 1;
                        }
                    }
                }
                if (casProducerIndex(jLvProducerIndex, jMin)) {
                    int i2 = (int) ((jMin - jLvProducerIndex) / 2);
                    for (int i3 = 0; i3 < i2; i3++) {
                        UnsafeRefArrayAccess.soElement(eArr, LinkedArrayQueueUtil.modifiedCalcElementOffset(((long) (i3 * 2)) + jLvProducerIndex, j), supplier.get());
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
            if (fill(supplier, PortableJvmInfo.RECOMENDED_OFFER_BATCH) == 0) {
                int iIdle = 0;
                while (exitCondition.keepRunning() && fill(supplier, PortableJvmInfo.RECOMENDED_OFFER_BATCH) == 0) {
                    iIdle = waitStrategy.idle(iIdle);
                }
            }
        }
    }
}
