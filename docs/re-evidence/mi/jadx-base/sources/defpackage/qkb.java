package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class qkb extends AbstractExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadLocal<ScheduledExecutorService> f31590b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f31591a;

    public class a extends ThreadLocal<ScheduledExecutorService> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return li3.d();
            }
            if (Looper.myLooper() != null) {
                return new qkb(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    public class b implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f31592a;

        public b(Runnable runnable) {
            this.f31592a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f31592a.run();
            return null;
        }
    }

    public static class c<V> implements RunnableScheduledFuture<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference<cb3.a<V>> f31594a = new AtomicReference<>(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f31595b;
        public final Callable<V> c;
        public final lhe<V> d;

        public class a implements cb3.c<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Handler f31596a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Callable f31597b;

            /* JADX INFO: renamed from: qkb$c$a$a, reason: collision with other inner class name */
            public class RunnableC1089a implements Runnable {
                public RunnableC1089a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (c.this.f31594a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f31596a.removeCallbacks(c.this);
                    }
                }
            }

            public a(Handler handler, Callable callable) {
                this.f31596a = handler;
                this.f31597b = callable;
            }

            @Override // cb3.c
            public Object a(cb3.a<V> aVar) throws RejectedExecutionException {
                aVar.a(new RunnableC1089a(), li3.a());
                c.this.f31594a.set(aVar);
                return "HandlerScheduledFuture-" + this.f31597b.toString();
            }
        }

        public c(Handler handler, long j, Callable<V> callable) {
            this.f31595b = j;
            this.c = callable;
            this.d = cb3.a(new a(handler, callable));
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return this.d.cancel(z);
        }

        @Override // java.util.concurrent.Future
        public V get() throws ExecutionException, InterruptedException {
            return this.d.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f31595b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            cb3.a andSet = this.f31594a.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.c(this.c.call());
                } catch (Exception e) {
                    andSet.f(e);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.d.get(j, timeUnit);
        }
    }

    public qkb(Handler handler) {
        this.f31591a = handler;
    }

    public final RejectedExecutionException a() {
        return new RejectedExecutionException(this.f31591a + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(qkb.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f31591a.post(runnable)) {
            throw a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new b(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(qkb.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(qkb.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(qkb.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(qkb.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
        c cVar = new c(this.f31591a, jUptimeMillis, callable);
        return this.f31591a.postAtTime(cVar, jUptimeMillis) ? cVar : oua.g(a());
    }
}
