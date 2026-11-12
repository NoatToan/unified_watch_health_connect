package defpackage;

import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ParametricNullness;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public class aqw<V> extends FutureTask<V> implements ListenableFuture<V> {
    private final aqm e;

    public static <V> aqw<V> e(Callable<V> callable) {
        return new aqw<>(callable);
    }

    aqw(Callable<V> callable) {
        super(callable);
        this.e = new aqm();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.e.d(runnable, executor);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    @ParametricNullness
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (nanos <= 2147483647999999999L) {
            return (V) super.get(j, timeUnit);
        }
        return (V) super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
        this.e.e();
    }
}
