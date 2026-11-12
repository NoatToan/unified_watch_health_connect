package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ParametricNullness;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class aqq<V> extends FluentFuture<V> {
    private final ListenableFuture<V> e;

    public aqq(ListenableFuture<V> listenableFuture) {
        this.e = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.e.addListener(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.e.cancel(z);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.e.isCancelled();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean isDone() {
        return this.e.isDone();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    @ParametricNullness
    public V get() throws ExecutionException, InterruptedException {
        return this.e.get();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    @ParametricNullness
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.e.get(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String toString() {
        return this.e.toString();
    }
}
