package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
final class CombinedFuture<V> extends AggregateFuture<Object, V> {

    @CheckForNull
    private CombinedFuture<V>.CombinedFutureInterruptibleTask<?> d;

    @Override // com.google.common.util.concurrent.AggregateFuture
    void collectOneValue(int i, @CheckForNull Object obj) {
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void handleAllCompleted() {
        CombinedFuture<V>.CombinedFutureInterruptibleTask<?> combinedFutureInterruptibleTask = this.d;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.execute();
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void releaseResources(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.releaseResources(releaseResourcesReason);
        if (releaseResourcesReason == AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE) {
            this.d = null;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void interruptTask() {
        CombinedFuture<V>.CombinedFutureInterruptibleTask<?> combinedFutureInterruptibleTask = this.d;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.interruptTask();
        }
    }

    abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {
        private final Executor listenerExecutor;

        abstract void setValue(@ParametricNullness T t);

        CombinedFutureInterruptibleTask(Executor executor) {
            this.listenerExecutor = (Executor) Preconditions.checkNotNull(executor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        protected final boolean isDone() {
            return CombinedFuture.this.isDone();
        }

        final void execute() {
            try {
                this.listenerExecutor.execute(this);
            } catch (RejectedExecutionException e) {
                CombinedFuture.this.setException(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        protected final void afterRanInterruptiblySuccess(@ParametricNullness T t) {
            CombinedFuture.this.d = null;
            setValue(t);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        protected final void afterRanInterruptiblyFailure(Throwable th) {
            CombinedFuture.this.d = null;
            if (th instanceof ExecutionException) {
                CombinedFuture.this.setException(((ExecutionException) th).getCause());
            } else if (th instanceof CancellationException) {
                CombinedFuture.this.cancel(false);
            } else {
                CombinedFuture.this.setException(th);
            }
        }
    }
}
