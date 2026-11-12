package com.google.common.util.concurrent;

import com.google.common.annotations.J2ktIncompatible;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: loaded from: classes14.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
abstract class ForwardingCondition implements Condition {
    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j8, TimeUnit timeUnit) {
        return delegate().await(j8, timeUnit);
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j8) {
        return delegate().awaitNanos(j8);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        delegate().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date date) {
        return delegate().awaitUntil(date);
    }

    public abstract Condition delegate();

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        delegate().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        delegate().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public void await() throws InterruptedException {
        delegate().await();
    }
}
