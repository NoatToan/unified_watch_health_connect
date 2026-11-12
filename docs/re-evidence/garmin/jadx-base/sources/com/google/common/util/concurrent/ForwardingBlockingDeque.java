package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ForwardingDeque;
import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E> implements BlockingDeque<E> {
    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract BlockingDeque<E> delegate();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return delegate().drainTo(collection);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E e4, long j8, TimeUnit timeUnit) {
        return delegate().offer(e4, j8, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E e4, long j8, TimeUnit timeUnit) {
        return delegate().offerFirst(e4, j8, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E e4, long j8, TimeUnit timeUnit) {
        return delegate().offerLast(e4, j8, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E poll(long j8, TimeUnit timeUnit) {
        return delegate().poll(j8, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public E pollFirst(long j8, TimeUnit timeUnit) {
        return delegate().pollFirst(j8, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public E pollLast(long j8, TimeUnit timeUnit) {
        return delegate().pollLast(j8, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E e4) throws InterruptedException {
        delegate().put(e4);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E e4) throws InterruptedException {
        delegate().putFirst(e4);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E e4) throws InterruptedException {
        delegate().putLast(e4);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return delegate().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() {
        return delegate().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() {
        return delegate().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() {
        return delegate().takeLast();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i14) {
        return delegate().drainTo(collection, i14);
    }
}
