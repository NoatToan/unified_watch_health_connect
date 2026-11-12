package io.netty.util.internal.shaded.org.jctools.queues;

import io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess;

/* JADX INFO: loaded from: classes2.dex */
abstract class BaseMpscLinkedArrayQueueColdProducerFields<E> extends BaseMpscLinkedArrayQueuePad3<E> {
    private static final long P_LIMIT_OFFSET;
    protected E[] producerBuffer;
    private volatile long producerLimit;
    protected long producerMask;

    static {
        try {
            P_LIMIT_OFFSET = UnsafeAccess.UNSAFE.objectFieldOffset(BaseMpscLinkedArrayQueueColdProducerFields.class.getDeclaredField("producerLimit"));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean casProducerLimit(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_LIMIT_OFFSET, j, j2);
    }

    public final long lvProducerLimit() {
        return this.producerLimit;
    }

    public final void soProducerLimit(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_LIMIT_OFFSET, j);
    }
}
