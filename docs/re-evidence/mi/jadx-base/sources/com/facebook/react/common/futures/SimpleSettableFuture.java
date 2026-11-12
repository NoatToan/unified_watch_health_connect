package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleSettableFuture<T> implements Future<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f7220a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f7221b;
    public Exception c;

    public final void a() {
        if (this.f7220a.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    public T b() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public void c(Exception exc) {
        a();
        this.c = exc;
        this.f7220a.countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        this.f7220a.await();
        if (this.c == null) {
            return this.f7221b;
        }
        throw new ExecutionException(this.c);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f7220a.getCount() == 0;
    }

    public void set(T t) {
        a();
        this.f7221b = t;
        this.f7220a.countDown();
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f7220a.await(j, timeUnit)) {
            if (this.c == null) {
                return this.f7221b;
            }
            throw new ExecutionException(this.c);
        }
        throw new TimeoutException("Timed out waiting for result");
    }
}
