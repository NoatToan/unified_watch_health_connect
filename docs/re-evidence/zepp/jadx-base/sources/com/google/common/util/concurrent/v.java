package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
class v<V> extends FluentFuture.a<V> implements RunnableFuture<V> {
    private volatile o<?> i;

    public final class a extends o<ListenableFuture<V>> {
        private final AsyncCallable<V> c;

        public a(AsyncCallable<V> asyncCallable) {
            this.c = (AsyncCallable) Preconditions.checkNotNull(asyncCallable);
        }

        @Override // com.google.common.util.concurrent.o
        public final boolean c() {
            return v.this.isDone();
        }

        @Override // com.google.common.util.concurrent.o
        public String f() {
            return this.c.toString();
        }

        @Override // com.google.common.util.concurrent.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(ListenableFuture<V> listenableFuture, Throwable th) {
            if (th == null) {
                v.this.setFuture(listenableFuture);
            } else {
                v.this.setException(th);
            }
        }

        @Override // com.google.common.util.concurrent.o
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public ListenableFuture<V> e() throws Exception {
            return (ListenableFuture) Preconditions.checkNotNull(this.c.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.c);
        }
    }

    public final class b extends o<V> {
        private final Callable<V> c;

        public b(Callable<V> callable) {
            this.c = (Callable) Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.o
        public void a(V v, Throwable th) {
            if (th == null) {
                v.this.set(v);
            } else {
                v.this.setException(th);
            }
        }

        @Override // com.google.common.util.concurrent.o
        public final boolean c() {
            return v.this.isDone();
        }

        @Override // com.google.common.util.concurrent.o
        public V e() throws Exception {
            return this.c.call();
        }

        @Override // com.google.common.util.concurrent.o
        public String f() {
            return this.c.toString();
        }
    }

    public v(Callable<V> callable) {
        this.i = new b(callable);
    }

    public static <V> v<V> w(AsyncCallable<V> asyncCallable) {
        return new v<>(asyncCallable);
    }

    public static <V> v<V> x(Runnable runnable, @NullableDecl V v) {
        return new v<>(Executors.callable(runnable, v));
    }

    public static <V> v<V> y(Callable<V> callable) {
        return new v<>(callable);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public void afterDone() {
        o<?> oVar;
        super.afterDone();
        if (wasInterrupted() && (oVar = this.i) != null) {
            oVar.b();
        }
        this.i = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
        o<?> oVar = this.i;
        if (oVar == null) {
            return super.pendingToString();
        }
        return "task=[" + oVar + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        o<?> oVar = this.i;
        if (oVar != null) {
            oVar.run();
        }
        this.i = null;
    }

    public v(AsyncCallable<V> asyncCallable) {
        this.i = new a(asyncCallable);
    }
}
