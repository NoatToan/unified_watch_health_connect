package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
@Beta
public final class ExecutionSequencer {
    private final AtomicReference<ListenableFuture<Object>> a = new AtomicReference<>(Futures.immediateFuture(null));

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements AsyncCallable<T> {
        public final /* synthetic */ Callable a;

        public a(Callable callable) {
            this.a = callable;
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture<T> call() throws Exception {
            return Futures.immediateFuture(this.a.call());
        }

        public String toString() {
            return this.a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements AsyncCallable<T> {
        public final /* synthetic */ AtomicReference a;
        public final /* synthetic */ AsyncCallable b;

        public b(AtomicReference atomicReference, AsyncCallable asyncCallable) {
            this.a = atomicReference;
            this.b = asyncCallable;
        }

        @Override // com.google.common.util.concurrent.AsyncCallable
        public ListenableFuture<T> call() throws Exception {
            return !this.a.compareAndSet(e.NOT_RUN, e.STARTED) ? Futures.immediateCancelledFuture() : this.b.call();
        }

        public String toString() {
            return this.b.toString();
        }
    }

    public class c implements Executor {
        public final /* synthetic */ ListenableFuture a;
        public final /* synthetic */ Executor b;

        public c(ListenableFuture listenableFuture, Executor executor) {
            this.a = listenableFuture;
            this.b = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.a.addListener(runnable, this.b);
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ ListenableFuture a;
        public final /* synthetic */ ListenableFuture b;
        public final /* synthetic */ AtomicReference c;
        public final /* synthetic */ SettableFuture d;
        public final /* synthetic */ ListenableFuture e;

        public d(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, AtomicReference atomicReference, SettableFuture settableFuture, ListenableFuture listenableFuture3) {
            this.a = listenableFuture;
            this.b = listenableFuture2;
            this.c = atomicReference;
            this.d = settableFuture;
            this.e = listenableFuture3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.isDone() || (this.b.isCancelled() && this.c.compareAndSet(e.NOT_RUN, e.CANCELLED))) {
                this.d.setFuture(this.e);
            }
        }
    }

    public enum e {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    private ExecutionSequencer() {
    }

    public static ExecutionSequencer create() {
        return new ExecutionSequencer();
    }

    public <T> ListenableFuture<T> submit(Callable<T> callable, Executor executor) {
        Preconditions.checkNotNull(callable);
        return submitAsync(new a(callable), executor);
    }

    public <T> ListenableFuture<T> submitAsync(AsyncCallable<T> asyncCallable, Executor executor) {
        Preconditions.checkNotNull(asyncCallable);
        AtomicReference atomicReference = new AtomicReference(e.NOT_RUN);
        b bVar = new b(atomicReference, asyncCallable);
        SettableFuture settableFutureCreate = SettableFuture.create();
        ListenableFuture<Object> andSet = this.a.getAndSet(settableFutureCreate);
        ListenableFuture listenableFutureSubmitAsync = Futures.submitAsync(bVar, new c(andSet, executor));
        ListenableFuture<T> listenableFutureNonCancellationPropagating = Futures.nonCancellationPropagating(listenableFutureSubmitAsync);
        d dVar = new d(listenableFutureSubmitAsync, listenableFutureNonCancellationPropagating, atomicReference, settableFutureCreate, andSet);
        listenableFutureNonCancellationPropagating.addListener(dVar, MoreExecutors.directExecutor());
        listenableFutureSubmitAsync.addListener(dVar, MoreExecutors.directExecutor());
        return listenableFutureNonCancellationPropagating;
    }
}
