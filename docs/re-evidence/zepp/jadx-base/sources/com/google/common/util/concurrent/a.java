package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.ForOverride;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
abstract class a<V, X extends Throwable, F, T> extends FluentFuture.a<V> implements Runnable {

    @NullableDecl
    public ListenableFuture<? extends V> i;

    @NullableDecl
    public Class<X> j;

    @NullableDecl
    public F k;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.a$a, reason: collision with other inner class name */
    public static final class C0239a<V, X extends Throwable> extends a<V, X, AsyncFunction<? super X, ? extends V>, ListenableFuture<? extends V>> {
        public C0239a(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction) {
            super(listenableFuture, cls, asyncFunction);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public ListenableFuture<? extends V> y(AsyncFunction<? super X, ? extends V> asyncFunction, X x) throws Exception {
            ListenableFuture<? extends V> listenableFutureApply = asyncFunction.apply(x);
            Preconditions.checkNotNull(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return listenableFutureApply;
        }

        @Override // com.google.common.util.concurrent.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public void z(ListenableFuture<? extends V> listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    public static final class b<V, X extends Throwable> extends a<V, X, Function<? super X, ? extends V>, V> {
        public b(ListenableFuture<? extends V> listenableFuture, Class<X> cls, Function<? super X, ? extends V> function) {
            super(listenableFuture, cls, function);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.a
        @NullableDecl
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public V y(Function<? super X, ? extends V> function, X x) throws Exception {
            return function.apply(x);
        }

        @Override // com.google.common.util.concurrent.a
        public void z(@NullableDecl V v) {
            set(v);
        }
    }

    public a(ListenableFuture<? extends V> listenableFuture, Class<X> cls, F f) {
        this.i = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
        this.j = (Class) Preconditions.checkNotNull(cls);
        this.k = (F) Preconditions.checkNotNull(f);
    }

    public static <V, X extends Throwable> ListenableFuture<V> w(ListenableFuture<? extends V> listenableFuture, Class<X> cls, Function<? super X, ? extends V> function, Executor executor) {
        b bVar = new b(listenableFuture, cls, function);
        listenableFuture.addListener(bVar, MoreExecutors.e(executor, bVar));
        return bVar;
    }

    public static <X extends Throwable, V> ListenableFuture<V> x(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction, Executor executor) {
        C0239a c0239a = new C0239a(listenableFuture, cls, asyncFunction);
        listenableFuture.addListener(c0239a, MoreExecutors.e(executor, c0239a));
        return c0239a;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        s(this.i);
        this.i = null;
        this.j = null;
        this.k = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
        String str;
        ListenableFuture<? extends V> listenableFuture = this.i;
        Class<X> cls = this.j;
        F f = this.k;
        String strPendingToString = super.pendingToString();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls == null || f == null) {
            if (strPendingToString == null) {
                return null;
            }
            return str + strPendingToString;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + f + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() throws ExecutionException {
        Object done;
        ListenableFuture<? extends V> listenableFuture = this.i;
        Class<X> cls = this.j;
        F f = this.k;
        if (((f == null) | (listenableFuture == null) | (cls == null)) || isCancelled()) {
            return;
        }
        ?? r3 = (Class<X>) null;
        this.i = null;
        try {
            done = Futures.getDone(listenableFuture);
            th = null;
        } catch (ExecutionException e) {
            th = (Throwable) Preconditions.checkNotNull(e.getCause());
            done = null;
        } catch (Throwable th) {
            th = th;
            done = null;
        }
        if (th == null) {
            set(done);
            return;
        }
        if (!r.a(th, cls)) {
            setFuture(listenableFuture);
            return;
        }
        try {
            Object objY = y(f, th);
            this.j = null;
            this.k = null;
            z(objY);
        } catch (Throwable th2) {
            try {
                setException(th2);
            } finally {
                this.j = null;
                this.k = null;
            }
        }
    }

    @NullableDecl
    @ForOverride
    public abstract T y(F f, X x) throws Exception;

    @ForOverride
    public abstract void z(@NullableDecl T t);
}
