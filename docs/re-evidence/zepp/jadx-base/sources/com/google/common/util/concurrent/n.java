package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
abstract class n<V> implements ListenableFuture<V> {
    private static final Logger a = Logger.getLogger(n.class.getName());

    public static final class a<V> extends AbstractFuture.j<V> {
        public a() {
            cancel(false);
        }
    }

    @GwtIncompatible
    public static class b<V, X extends Exception> extends n<V> implements CheckedFuture<V, X> {
        private final X b;

        public b(X x) {
            this.b = x;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Exception */
        @Override // com.google.common.util.concurrent.CheckedFuture
        public V checkedGet() throws Exception {
            throw this.b;
        }

        @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
        public V get() throws ExecutionException {
            throw new ExecutionException(this.b);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.b + "]]";
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Exception */
        @Override // com.google.common.util.concurrent.CheckedFuture
        public V checkedGet(long j, TimeUnit timeUnit) throws Exception {
            Preconditions.checkNotNull(timeUnit);
            throw this.b;
        }
    }

    public static final class c<V> extends AbstractFuture.j<V> {
        public c(Throwable th) {
            setException(th);
        }
    }

    @GwtIncompatible
    public static class d<V, X extends Exception> extends n<V> implements CheckedFuture<V, X> {

        @NullableDecl
        private final V b;

        public d(@NullableDecl V v) {
            this.b = v;
        }

        @Override // com.google.common.util.concurrent.CheckedFuture
        public V checkedGet() {
            return this.b;
        }

        @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
        public V get() {
            return this.b;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.b + "]]";
        }

        @Override // com.google.common.util.concurrent.CheckedFuture
        public V checkedGet(long j, TimeUnit timeUnit) {
            Preconditions.checkNotNull(timeUnit);
            return this.b;
        }
    }

    public static class e<V> extends n<V> {
        public static final e<Object> c = new e<>(null);

        @NullableDecl
        private final V b;

        public e(@NullableDecl V v) {
            this.b = v;
        }

        @Override // com.google.common.util.concurrent.n, java.util.concurrent.Future
        public V get() {
            return this.b;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.b + "]]";
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            a.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get() throws ExecutionException;

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        Preconditions.checkNotNull(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
