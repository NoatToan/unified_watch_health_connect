package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RunnableFutureTask<R, E extends Exception> implements RunnableFuture<R> {
    private final ConditionVariable a = new ConditionVariable();
    private final ConditionVariable b = new ConditionVariable();
    private final Object c = new Object();

    @Nullable
    private Exception d;

    @Nullable
    private R e;

    @Nullable
    private Thread f;
    private boolean g;

    @UnknownNull
    private R a() throws ExecutionException {
        if (this.g) {
            throw new CancellationException();
        }
        if (this.d == null) {
            return this.e;
        }
        throw new ExecutionException(this.d);
    }

    public final void blockUntilFinished() {
        this.b.blockUninterruptible();
    }

    public final void blockUntilStarted() {
        this.a.blockUninterruptible();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean interruptIfRunning) {
        synchronized (this.c) {
            if (!this.g && !this.b.isOpen()) {
                this.g = true;
                cancelWork();
                Thread thread = this.f;
                if (thread == null) {
                    this.a.open();
                    this.b.open();
                } else if (interruptIfRunning) {
                    thread.interrupt();
                }
                return true;
            }
            return false;
        }
    }

    public void cancelWork() {
    }

    @UnknownNull
    public abstract R doWork() throws Exception;

    @Override // java.util.concurrent.Future
    @UnknownNull
    public final R get() throws ExecutionException, InterruptedException {
        this.b.block();
        return a();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isOpen();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            if (this.g) {
                return;
            }
            this.f = Thread.currentThread();
            this.a.open();
            try {
                try {
                    this.e = doWork();
                    synchronized (this.c) {
                        this.b.open();
                        this.f = null;
                        Thread.interrupted();
                    }
                } catch (Exception e) {
                    this.d = e;
                    synchronized (this.c) {
                        this.b.open();
                        this.f = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.c) {
                    this.b.open();
                    this.f = null;
                    Thread.interrupted();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    @UnknownNull
    public final R get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.b.block(TimeUnit.MILLISECONDS.convert(timeout, unit))) {
            return a();
        }
        throw new TimeoutException();
    }
}
