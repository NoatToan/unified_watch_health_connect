package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class ffl<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f17742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FutureTask<V> f17743b;

    public ffl(Handler handler, Callable<V> callable) {
        this.f17742a = handler;
        this.f17743b = new FutureTask<>(callable);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f17743b.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return this.f17743b.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f17743b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f17743b.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f17743b.run();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f17743b.get(j, timeUnit);
    }

    public ffl(Handler handler, Runnable runnable, V v) {
        this.f17742a = handler;
        this.f17743b = new FutureTask<>(runnable, v);
    }
}
