package k0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l0.j;
import l0.m;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f101927a;

    public class a extends ThreadLocal<ScheduledExecutorService> {
        @Override // java.lang.ThreadLocal
        public final ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return k0.b.d();
            }
            if (Looper.myLooper() != null) {
                return new d(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    public class b implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f101928a;

        public b(d dVar, Runnable runnable) {
            this.f101928a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            this.f101928a.run();
            return null;
        }
    }

    static {
        new a();
    }

    public d(Handler handler) {
        this.f101927a = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(d.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.f101927a;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j8, TimeUnit timeUnit) {
        long jConvert = TimeUnit.MILLISECONDS.convert(j8, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.f101927a;
        c cVar = new c(handler, jConvert, callable);
        if (handler.postAtTime(cVar, jConvert)) {
            return cVar;
        }
        RejectedExecutionException rejectedExecutionException = new RejectedExecutionException(handler + " is shutting down");
        j.a aVar = j.f107810a;
        return new m.b(rejectedExecutionException);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j8, long j14, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(d.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j8, long j14, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(d.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(d.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(d.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    public static class c<V> implements RunnableScheduledFuture<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference<androidx.concurrent.futures.b.a<V>> f101929a = new AtomicReference<>(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f101930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Callable<V> f101931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.concurrent.futures.b.d f101932d;

        public class a implements androidx.concurrent.futures.b.c<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Handler f101933a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Callable f101934b;

            /* JADX INFO: renamed from: k0.d$c$a$a, reason: collision with other inner class name */
            public class RunnableC1957a implements Runnable {
                public RunnableC1957a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    if (c.this.f101929a.getAndSet(null) != null) {
                        aVar.f101933a.removeCallbacks(c.this);
                    }
                }
            }

            public a(Handler handler, Callable callable) {
                this.f101933a = handler;
                this.f101934b = callable;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object d(androidx.concurrent.futures.b.a<V> aVar) {
                aVar.a(new RunnableC1957a(), k0.b.a());
                c.this.f101929a.set(aVar);
                return "HandlerScheduledFuture-" + this.f101934b.toString();
            }
        }

        public c(Handler handler, long j8, Callable<V> callable) {
            this.f101930b = j8;
            this.f101931c = callable;
            this.f101932d = androidx.concurrent.futures.b.a(new a(handler, callable));
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z14) {
            return this.f101932d.cancel(z14);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public final V get() {
            return (V) this.f101932d.f6084b.get();
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f101930b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f101932d.f6084b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f101932d.f6084b.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public final boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public final void run() {
            androidx.concurrent.futures.b.a andSet = this.f101929a.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.b(this.f101931c.call());
                } catch (Exception e4) {
                    andSet.d(e4);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public final V get(long j8, TimeUnit timeUnit) {
            return (V) this.f101932d.f6084b.get(j8, timeUnit);
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j8, TimeUnit timeUnit) {
        return schedule(new b(this, runnable), j8, timeUnit);
    }
}
