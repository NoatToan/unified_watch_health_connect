package com.google.android.exoplayer2.util;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes14.dex */
public abstract class RunnableFutureTask<R, E extends Exception> implements RunnableFuture<R> {
    private boolean canceled;
    private Exception exception;
    private R result;
    private Thread workThread;
    private final ConditionVariable started = new ConditionVariable();
    private final ConditionVariable finished = new ConditionVariable();
    private final Object cancelLock = new Object();

    @UnknownNull
    private R getResult() throws ExecutionException {
        if (this.canceled) {
            throw new CancellationException();
        }
        Exception exc = this.exception;
        if (exc == null) {
            return this.result;
        }
        throw new ExecutionException(exc);
    }

    public final void blockUntilFinished() {
        this.finished.blockUninterruptible();
    }

    public final void blockUntilStarted() {
        this.started.blockUninterruptible();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z14) {
        synchronized (this.cancelLock) {
            try {
                if (!this.canceled && !this.finished.isOpen()) {
                    this.canceled = true;
                    cancelWork();
                    Thread thread = this.workThread;
                    if (thread == null) {
                        this.started.open();
                        this.finished.open();
                    } else if (z14) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void cancelWork() {
    }

    @UnknownNull
    public abstract R doWork();

    @Override // java.util.concurrent.Future
    @UnknownNull
    public final R get(long j8, TimeUnit timeUnit) throws TimeoutException {
        if (this.finished.block(TimeUnit.MILLISECONDS.convert(j8, timeUnit))) {
            return getResult();
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.canceled;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.finished.isOpen();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.cancelLock) {
            try {
                if (this.canceled) {
                    return;
                }
                this.workThread = Thread.currentThread();
                this.started.open();
                try {
                    try {
                        this.result = doWork();
                        synchronized (this.cancelLock) {
                            this.finished.open();
                            this.workThread = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th3) {
                        synchronized (this.cancelLock) {
                            this.finished.open();
                            this.workThread = null;
                            Thread.interrupted();
                            throw th3;
                        }
                    }
                } catch (Exception e4) {
                    this.exception = e4;
                    synchronized (this.cancelLock) {
                        this.finished.open();
                        this.workThread = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // java.util.concurrent.Future
    @UnknownNull
    public final R get() {
        this.finished.block();
        return getResult();
    }
}
