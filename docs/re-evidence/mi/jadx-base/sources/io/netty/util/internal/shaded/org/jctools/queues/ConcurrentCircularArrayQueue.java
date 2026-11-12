package io.netty.util.internal.shaded.org.jctools.queues;

import io.netty.util.internal.shaded.org.jctools.util.Pow2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ConcurrentCircularArrayQueue<E> extends ConcurrentCircularArrayQueueL0Pad<E> {
    protected final E[] buffer;
    protected final long mask;

    public ConcurrentCircularArrayQueue(int i) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.mask = iRoundToPowerOfTwo - 1;
        this.buffer = (E[]) CircularArrayOffsetCalculator.allocate(iRoundToPowerOfTwo);
    }

    public static long calcElementOffset(long j, long j2) {
        return CircularArrayOffsetCalculator.calcElementOffset(j, j2);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int capacity() {
        return (int) (this.mask + 1);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void clear() {
        while (poll() != null) {
        }
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public final long currentConsumerIndex() {
        return lvConsumerIndex();
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators
    public final long currentProducerIndex() {
        return lvProducerIndex();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final boolean isEmpty() {
        return IndexedQueueSizeUtil.isEmpty(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final int size() {
        return IndexedQueueSizeUtil.size(this);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return getClass().getName();
    }

    public final long calcElementOffset(long j) {
        return calcElementOffset(j, this.mask);
    }
}
