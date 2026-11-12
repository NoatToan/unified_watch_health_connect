package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import io.netty.util.internal.shaded.org.jctools.util.Pow2;
import io.netty.util.internal.shaded.org.jctools.util.RangeUtil;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public class MpscGrowableAtomicArrayQueue<E> extends MpscChunkedAtomicArrayQueue<E> {
    public MpscGrowableAtomicArrayQueue(int i) {
        super(Math.max(2, Pow2.roundToPowerOfTwo(i / 8)), i);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscChunkedAtomicArrayQueue, io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue
    public long getCurrentBufferCapacity(long j) {
        long j2 = 2 + j;
        long j3 = this.maxQueueCapacity;
        return j2 == j3 ? j3 : j;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscChunkedAtomicArrayQueue, io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue
    public int getNextBufferSize(AtomicReferenceArray<E> atomicReferenceArray) {
        RangeUtil.checkLessThanOrEqual(LinkedAtomicArrayQueueUtil.length(atomicReferenceArray), this.maxQueueCapacity / 2, "buffer.length");
        return ((LinkedAtomicArrayQueueUtil.length(atomicReferenceArray) - 1) * 2) + 1;
    }

    public MpscGrowableAtomicArrayQueue(int i, int i2) {
        super(i, i2);
    }
}
