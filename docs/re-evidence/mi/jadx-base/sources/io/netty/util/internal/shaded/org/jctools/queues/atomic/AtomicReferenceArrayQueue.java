package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil;
import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue;
import io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators;
import io.netty.util.internal.shaded.org.jctools.util.Pow2;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
abstract class AtomicReferenceArrayQueue<E> extends AbstractQueue<E> implements IndexedQueueSizeUtil.IndexedQueue, QueueProgressIndicators, MessagePassingQueue<E> {
    protected final AtomicReferenceArray<E> buffer;
    protected final int mask;

    public AtomicReferenceArrayQueue(int i) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.mask = iRoundToPowerOfTwo - 1;
        this.buffer = new AtomicReferenceArray<>(iRoundToPowerOfTwo);
    }

    public static <E> E lpElement(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public static <E> E lvElement(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public static <E> void soElement(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }

    public static <E> void spElement(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }

    public static <E> void svElement(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.set(i, e);
    }

    public final int calcElementOffset(long j, int i) {
        return ((int) j) & i;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final int capacity() {
        return this.mask + 1;
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

    public final int calcElementOffset(long j) {
        return ((int) j) & this.mask;
    }

    public final E lpElement(int i) {
        return this.buffer.get(i);
    }

    public final E lvElement(int i) {
        return (E) lvElement(this.buffer, i);
    }

    public final void soElement(int i, E e) {
        this.buffer.lazySet(i, e);
    }

    public final void spElement(int i, E e) {
        this.buffer.lazySet(i, e);
    }
}
