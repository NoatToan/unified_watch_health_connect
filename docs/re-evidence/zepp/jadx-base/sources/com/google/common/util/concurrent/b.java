package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.ForOverride;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
abstract class b<I, O, F, T> extends FluentFuture.a<O> implements Runnable {

    @NullableDecl
    public ListenableFuture<? extends I> i;

    @NullableDecl
    public F j;

    public static final class a<I, O> extends b<I, O, AsyncFunction<? super I, ? extends O>, ListenableFuture<? extends O>> {
        public a(ListenableFuture<? extends I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction) {
            super(listenableFuture, asyncFunction);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.b
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public ListenableFuture<? extends O> y(AsyncFunction<? super I, ? extends O> asyncFunction, @NullableDecl I i) throws Exception {
            ListenableFuture<? extends O> listenableFutureApply = asyncFunction.apply(i);
            Preconditions.checkNotNull(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return listenableFutureApply;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.b
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public void z(ListenableFuture<? extends O> listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.b$b, reason: collision with other inner class name */
    public static final class C0240b<I, O> extends b<I, O, Function<? super I, ? extends O>, O> {
        public C0240b(ListenableFuture<? extends I> listenableFuture, Function<? super I, ? extends O> function) {
            super(listenableFuture, function);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.b
        @NullableDecl
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public O y(Function<? super I, ? extends O> function, @NullableDecl I i) {
            return function.apply(i);
        }

        @Override // com.google.common.util.concurrent.b
        public void z(@NullableDecl O o) {
            set(o);
        }
    }

    public b(ListenableFuture<? extends I> listenableFuture, F f) {
        this.i = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
        this.j = (F) Preconditions.checkNotNull(f);
    }

    public static <I, O> ListenableFuture<O> w(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
        Preconditions.checkNotNull(function);
        C0240b c0240b = new C0240b(listenableFuture, function);
        listenableFuture.addListener(c0240b, MoreExecutors.e(executor, c0240b));
        return c0240b;
    }

    public static <I, O> ListenableFuture<O> x(ListenableFuture<I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        Preconditions.checkNotNull(executor);
        a aVar = new a(listenableFuture, asyncFunction);
        listenableFuture.addListener(aVar, MoreExecutors.e(executor, aVar));
        return aVar;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        s(this.i);
        this.i = null;
        this.j = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
        String str;
        ListenableFuture<? extends I> listenableFuture = this.i;
        F f = this.j;
        String strPendingToString = super.pendingToString();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (f != null) {
            return str + "function=[" + f + "]";
        }
        if (strPendingToString == null) {
            return null;
        }
        return str + strPendingToString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture<? extends I> listenableFuture = this.i;
        F f = this.j;
        if ((isCancelled() | (listenableFuture == null)) || (f == null)) {
            return;
        }
        this.i = null;
        if (listenableFuture.isCancelled()) {
            setFuture(listenableFuture);
            return;
        }
        try {
            try {
                Object objY = y(f, Futures.getDone(listenableFuture));
                this.j = null;
                z(objY);
            } catch (Throwable th) {
                try {
                    setException(th);
                } finally {
                    this.j = null;
                }
            }
        } catch (Error e) {
            setException(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            setException(e2);
        } catch (ExecutionException e3) {
            setException(e3.getCause());
        }
    }

    @NullableDecl
    @ForOverride
    public abstract T y(F f, @NullableDecl I i) throws Exception;

    @ForOverride
    public abstract void z(@NullableDecl T t);
}
