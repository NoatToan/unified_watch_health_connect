package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import defpackage.aqt;
import defpackage.aqx;
import defpackage.aqz;
import defpackage.arc;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractCatchingFuture<V, X extends Throwable, F, T> extends FluentFuture.TrustedFuture<V> implements Runnable {

    @CheckForNull
    Class<X> exceptionType;

    @CheckForNull
    F fallback;

    @CheckForNull
    ListenableFuture<? extends V> inputFuture;

    @ParametricNullness
    abstract T doFallback(F f, X x) throws Exception;

    abstract void setResult(@ParametricNullness T t);

    public static <V, X extends Throwable> ListenableFuture<V> create(ListenableFuture<? extends V> listenableFuture, Class<X> cls, Function<? super X, ? extends V> function, Executor executor) {
        a aVar = new a(listenableFuture, cls, function);
        listenableFuture.addListener(aVar, aqx.e(executor, aVar));
        return aVar;
    }

    public static <X extends Throwable, V> ListenableFuture<V> create(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction, Executor executor) {
        d dVar = new d(listenableFuture, cls, asyncFunction);
        listenableFuture.addListener(dVar, aqx.e(executor, dVar));
        return dVar;
    }

    AbstractCatchingFuture(ListenableFuture<? extends V> listenableFuture, Class<X> cls, F f) {
        this.inputFuture = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
        this.exceptionType = (Class) Preconditions.checkNotNull(cls);
        this.fallback = (F) Preconditions.checkNotNull(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objE;
        InternalFutureFailureAccess internalFutureFailureAccess = this.inputFuture;
        Class<X> cls = this.exceptionType;
        F f = this.fallback;
        if (((f == null) || ((internalFutureFailureAccess == null) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r3 = (Class<X>) null;
        this.inputFuture = null;
        try {
            th = internalFutureFailureAccess instanceof InternalFutureFailureAccess ? arq.a(internalFutureFailureAccess) : null;
            objE = th == null ? aqt.e(internalFutureFailureAccess) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                th = new NullPointerException("Future type " + internalFutureFailureAccess.getClass() + " threw " + e.getClass() + " without a cause");
            } else {
                th = cause;
            }
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            set(aqz.e(objE));
            return;
        }
        if (!arc.e(th, cls)) {
            setFuture(internalFutureFailureAccess);
            return;
        }
        try {
            Object objDoFallback = doFallback(f, th);
            this.exceptionType = null;
            this.fallback = null;
            setResult(objDoFallback);
        } catch (Throwable th2) {
            try {
                arc.e(th2);
                setException(th2);
            } finally {
                this.exceptionType = null;
                this.fallback = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.AbstractFuture
    @CheckForNull
    public String pendingToString() {
        String str;
        ListenableFuture<? extends V> listenableFuture = this.inputFuture;
        Class<X> cls = this.exceptionType;
        F f = this.fallback;
        String strPendingToString = super.pendingToString();
        if (listenableFuture == null) {
            str = "";
        } else {
            str = "inputFuture=[" + listenableFuture + "], ";
        }
        if (cls == null || f == null) {
            if (strPendingToString == null) {
                return null;
            }
            return str + strPendingToString;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + f + "]";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        maybePropagateCancellationTo(this.inputFuture);
        this.inputFuture = null;
        this.exceptionType = null;
        this.fallback = null;
    }

    static final class d<V, X extends Throwable> extends AbstractCatchingFuture<V, X, AsyncFunction<? super X, ? extends V>, ListenableFuture<? extends V>> {
        d(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction) {
            super(listenableFuture, cls, asyncFunction);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ListenableFuture<? extends V> doFallback(AsyncFunction<? super X, ? extends V> asyncFunction, X x) throws Exception {
            ListenableFuture<? extends V> listenableFutureApply = asyncFunction.apply(x);
            Preconditions.checkNotNull(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return listenableFutureApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void setResult(ListenableFuture<? extends V> listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    static final class a<V, X extends Throwable> extends AbstractCatchingFuture<V, X, Function<? super X, ? extends V>, V> {
        a(ListenableFuture<? extends V> listenableFuture, Class<X> cls, Function<? super X, ? extends V> function) {
            super(listenableFuture, cls, function);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        @ParametricNullness
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public V doFallback(Function<? super X, ? extends V> function, X x) throws Exception {
            return function.apply(x);
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        void setResult(@ParametricNullness V v) {
            set(v);
        }
    }
}
