package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes23.dex */
public abstract class BackgroundInitializer<T> implements ConcurrentInitializer<T> {
    private ExecutorService a;
    private ExecutorService b;
    private Future<T> c;

    public class a implements Callable<T> {
        private final ExecutorService a;

        public a(ExecutorService executorService) {
            this.a = executorService;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            try {
                return (T) BackgroundInitializer.this.initialize();
            } finally {
                ExecutorService executorService = this.a;
                if (executorService != null) {
                    executorService.shutdown();
                }
            }
        }
    }

    public BackgroundInitializer() {
        this(null);
    }

    private ExecutorService a() {
        return Executors.newFixedThreadPool(getTaskCount());
    }

    private Callable<T> b(ExecutorService executorService) {
        return new a(executorService);
    }

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public T get() throws ConcurrentException {
        try {
            return getFuture().get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new ConcurrentException(e);
        } catch (ExecutionException e2) {
            ConcurrentUtils.handleCause(e2);
            return null;
        }
    }

    public final synchronized ExecutorService getActiveExecutor() {
        return this.b;
    }

    public final synchronized ExecutorService getExternalExecutor() {
        return this.a;
    }

    public synchronized Future<T> getFuture() {
        Future<T> future;
        future = this.c;
        if (future == null) {
            throw new IllegalStateException("start() must be called first!");
        }
        return future;
    }

    public int getTaskCount() {
        return 1;
    }

    public abstract T initialize() throws Exception;

    public synchronized boolean isStarted() {
        return this.c != null;
    }

    public final synchronized void setExternalExecutor(ExecutorService executorService) {
        if (isStarted()) {
            throw new IllegalStateException("Cannot set ExecutorService after start()!");
        }
        this.a = executorService;
    }

    public synchronized boolean start() {
        ExecutorService executorServiceA;
        if (isStarted()) {
            return false;
        }
        ExecutorService externalExecutor = getExternalExecutor();
        this.b = externalExecutor;
        if (externalExecutor == null) {
            executorServiceA = a();
            this.b = executorServiceA;
        } else {
            executorServiceA = null;
        }
        this.c = this.b.submit(b(executorServiceA));
        return true;
    }

    public BackgroundInitializer(ExecutorService executorService) {
        setExternalExecutor(executorService);
    }
}
