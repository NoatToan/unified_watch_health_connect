package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class FutureChain<V> implements ListenableFuture<V> {

    @Nullable
    public CallbackToFutureAdapter.Completer<V> mCompleter;

    @NonNull
    private final ListenableFuture<V> mDelegate;

    public FutureChain(@NonNull ListenableFuture<V> delegate) {
        this.mDelegate = (ListenableFuture) Preconditions.checkNotNull(delegate);
    }

    @NonNull
    public static <V> FutureChain<V> from(@NonNull ListenableFuture<V> future) {
        return future instanceof FutureChain ? (FutureChain) future : new FutureChain<>(future);
    }

    public final void addCallback(@NonNull FutureCallback<? super V> callback, @NonNull Executor executor) {
        Futures.addCallback(this, callback, executor);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(@NonNull Runnable listener, @NonNull Executor executor) {
        this.mDelegate.addListener(listener, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        return this.mDelegate.cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get() throws ExecutionException, InterruptedException {
        return this.mDelegate.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mDelegate.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mDelegate.isDone();
    }

    boolean set(@Nullable V value) {
        CallbackToFutureAdapter.Completer<V> completer = this.mCompleter;
        if (completer != null) {
            return completer.set(value);
        }
        return false;
    }

    boolean setException(@NonNull Throwable throwable) {
        CallbackToFutureAdapter.Completer<V> completer = this.mCompleter;
        if (completer != null) {
            return completer.setException(throwable);
        }
        return false;
    }

    @NonNull
    public final <T> FutureChain<T> transform(@NonNull Function<? super V, T> function, @NonNull Executor executor) {
        return (FutureChain) Futures.transform(this, function, executor);
    }

    @NonNull
    public final <T> FutureChain<T> transformAsync(@NonNull AsyncFunction<? super V, T> function, @NonNull Executor executor) {
        return (FutureChain) Futures.transformAsync(this, function, executor);
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public V get(long timeout, @NonNull TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.mDelegate.get(timeout, unit);
    }

    public FutureChain() {
        this.mDelegate = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<V>() { // from class: androidx.camera.core.impl.utils.futures.FutureChain.1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public Object attachCompleter(@NonNull CallbackToFutureAdapter.Completer<V> completer) {
                Preconditions.checkState(FutureChain.this.mCompleter == null, "The result can only set once!");
                FutureChain.this.mCompleter = completer;
                return "FutureChain[" + FutureChain.this + "]";
            }
        });
    }
}
