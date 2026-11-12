package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import defpackage.aqt;
import defpackage.aqx;
import defpackage.arc;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractTransformFuture<I, O, F, T> extends FluentFuture.TrustedFuture<O> implements Runnable {

    @CheckForNull
    F function;

    @CheckForNull
    ListenableFuture<? extends I> inputFuture;

    @ParametricNullness
    abstract T doTransform(F f, @ParametricNullness I i) throws Exception;

    abstract void setResult(@ParametricNullness T t);

    public static <I, O> ListenableFuture<O> create(ListenableFuture<I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        Preconditions.checkNotNull(executor);
        b bVar = new b(listenableFuture, asyncFunction);
        listenableFuture.addListener(bVar, aqx.e(executor, bVar));
        return bVar;
    }

    public static <I, O> ListenableFuture<O> create(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
        Preconditions.checkNotNull(function);
        c cVar = new c(listenableFuture, function);
        listenableFuture.addListener(cVar, aqx.e(executor, cVar));
        return cVar;
    }

    AbstractTransformFuture(ListenableFuture<? extends I> listenableFuture, F f) {
        this.inputFuture = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
        this.function = (F) Preconditions.checkNotNull(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture<? extends I> listenableFuture = this.inputFuture;
        F f = this.function;
        if ((isCancelled() | (listenableFuture == null)) || (f == null)) {
            return;
        }
        this.inputFuture = null;
        if (listenableFuture.isCancelled()) {
            setFuture(listenableFuture);
            return;
        }
        try {
            try {
                Object objDoTransform = doTransform(f, aqt.e(listenableFuture));
                this.function = null;
                setResult(objDoTransform);
            } catch (Throwable th) {
                try {
                    arc.e(th);
                    setException(th);
                } finally {
                    this.function = null;
                }
            }
        } catch (Error e) {
            setException(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            setException(e2.getCause());
        } catch (Exception e3) {
            setException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        maybePropagateCancellationTo(this.inputFuture);
        this.inputFuture = null;
        this.function = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.AbstractFuture
    @CheckForNull
    public String pendingToString() {
        String str;
        ListenableFuture<? extends I> listenableFuture = this.inputFuture;
        F f = this.function;
        String strPendingToString = super.pendingToString();
        if (listenableFuture == null) {
            str = "";
        } else {
            str = "inputFuture=[" + listenableFuture + "], ";
        }
        if (f != null) {
            return str + "function=[" + f + "]";
        }
        if (strPendingToString == null) {
            return null;
        }
        return str + strPendingToString;
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class b<I, O> extends AbstractTransformFuture<I, O, AsyncFunction<? super I, ? extends O>, ListenableFuture<? extends O>> {
        b(ListenableFuture<? extends I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction) {
            super(listenableFuture, asyncFunction);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ListenableFuture<? extends O> doTransform(AsyncFunction<? super I, ? extends O> asyncFunction, @ParametricNullness I i) throws Exception {
            ListenableFuture<? extends O> listenableFutureApply = asyncFunction.apply(i);
            Preconditions.checkNotNull(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return listenableFutureApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void setResult(ListenableFuture<? extends O> listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    static final class c<I, O> extends AbstractTransformFuture<I, O, Function<? super I, ? extends O>, O> {
        c(ListenableFuture<? extends I> listenableFuture, Function<? super I, ? extends O> function) {
            super(listenableFuture, function);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        @ParametricNullness
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public O doTransform(Function<? super I, ? extends O> function, @ParametricNullness I i) {
            return function.apply(i);
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        void setResult(@ParametricNullness O o) {
            set(o);
        }
    }
}
