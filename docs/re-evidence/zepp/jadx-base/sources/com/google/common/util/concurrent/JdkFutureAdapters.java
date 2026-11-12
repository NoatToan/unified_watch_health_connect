package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public final class JdkFutureAdapters {

    public static class a<V> extends ForwardingFuture<V> implements ListenableFuture<V> {
        private static final ThreadFactory e;
        private static final Executor f;
        private final Executor a;
        private final ExecutionList b;
        private final AtomicBoolean c;
        private final Future<V> d;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.JdkFutureAdapters$a$a, reason: collision with other inner class name */
        public class RunnableC0236a implements Runnable {
            public RunnableC0236a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Uninterruptibles.getUninterruptibly(a.this.d);
                } catch (Throwable unused) {
                }
                a.this.b.execute();
            }
        }

        static {
            ThreadFactory threadFactoryBuild = new ThreadFactoryBuilder().setDaemon(true).setNameFormat("ListenableFutureAdapter-thread-%d").build();
            e = threadFactoryBuild;
            f = Executors.newCachedThreadPool(threadFactoryBuild);
        }

        public a(Future<V> future) {
            this(future, f);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.b.add(runnable, executor);
            if (this.c.compareAndSet(false, true)) {
                if (this.d.isDone()) {
                    this.b.execute();
                } else {
                    this.a.execute(new RunnableC0236a());
                }
            }
        }

        public a(Future<V> future, Executor executor) {
            this.b = new ExecutionList();
            this.c = new AtomicBoolean(false);
            this.d = (Future) Preconditions.checkNotNull(future);
            this.a = (Executor) Preconditions.checkNotNull(executor);
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public Future<V> delegate() {
            return this.d;
        }
    }

    private JdkFutureAdapters() {
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future) {
        return future instanceof ListenableFuture ? (ListenableFuture) future : new a(future);
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future, Executor executor) {
        Preconditions.checkNotNull(executor);
        if (future instanceof ListenableFuture) {
            return (ListenableFuture) future;
        }
        return new a(future, executor);
    }
}
