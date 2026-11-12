package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ForwardingQueue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class ForwardingBlockingQueue<E> extends ForwardingQueue<E> implements BlockingQueue<E> {
    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract BlockingQueue<E> delegate();

    @Override // java.util.concurrent.BlockingQueue
    @CanIgnoreReturnValue
    public int drainTo(Collection<? super E> collection, int i14) {
        return delegate().drainTo(collection, i14);
    }

    @Override // java.util.concurrent.BlockingQueue
    @CanIgnoreReturnValue
    public boolean offer(E e4, long j8, TimeUnit timeUnit) {
        return delegate().offer(e4, j8, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    @CanIgnoreReturnValue
    public E poll(long j8, TimeUnit timeUnit) {
        return delegate().poll(j8, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e4) throws InterruptedException {
        delegate().put(e4);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return delegate().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    @CanIgnoreReturnValue
    public E take() {
        return delegate().take();
    }

    @Override // java.util.concurrent.BlockingQueue
    @CanIgnoreReturnValue
    public int drainTo(Collection<? super E> collection) {
        return delegate().drainTo(collection);
    }
}
