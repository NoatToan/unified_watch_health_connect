package com.huawei.watchface;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public class o3 extends ThreadPoolExecutor {
    public o3(int i, int i2, long j, TimeUnit timeUnit) {
        super(i, i2, j, timeUnit, a());
    }

    public static PriorityBlockingQueue a() {
        return new PriorityBlockingQueue();
    }

    public void b(int i, Runnable runnable) {
        if (runnable instanceof m3) {
            super.execute(runnable);
        } else {
            super.execute(a(i, runnable));
        }
    }

    public Future c(int i, Runnable runnable) {
        return super.submit(a(i, runnable));
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        b(0, runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new m3(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return c(0, runnable);
    }

    public Future a(int i, Runnable runnable, Object obj) {
        return super.submit(a(i, runnable), obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public RunnableFuture newTaskFor(Callable callable) {
        return new m3(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return a(0, runnable, obj);
    }

    public final n3 a(int i, Runnable runnable) {
        if (runnable instanceof n3) {
            return (n3) runnable;
        }
        return new n3(runnable, i);
    }
}
