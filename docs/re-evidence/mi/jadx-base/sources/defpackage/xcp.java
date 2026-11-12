package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class xcp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f38977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f38978b;
    public static final ExecutorService c;
    public static final ThreadFactory d;
    public static final ScheduledExecutorService e;
    public static final Handler f;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AtomicInteger f38979a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "scheduled-executor-service" + this.f38979a.incrementAndGet());
            thread.setPriority(3);
            return thread;
        }
    }

    public static class b extends ThreadPoolExecutor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f38980a;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f38981a;

            public a(Runnable runnable) {
                this.f38981a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                this.f38981a.run();
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                if (jUptimeMillis2 > b.this.f38980a) {
                    String.format("task run time costs %s millis", Long.valueOf(jUptimeMillis2));
                }
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: xcp$b$b, reason: collision with other inner class name */
        public class CallableC1146b<T> implements Callable<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Callable f38983a;

            public CallableC1146b(Callable callable) {
                this.f38983a = callable;
            }

            @Override // java.util.concurrent.Callable
            public T call() throws Exception {
                long jUptimeMillis = SystemClock.uptimeMillis();
                try {
                    try {
                        T t = (T) this.f38983a.call();
                        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                        if (jUptimeMillis2 > b.this.f38980a) {
                            String.format("task run time costs %s millis", Long.valueOf(jUptimeMillis2));
                        }
                        return t;
                    } catch (Exception e) {
                        String.format("run Callable %s", e);
                        throw e;
                    }
                } catch (Throwable th) {
                    long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis;
                    if (jUptimeMillis3 > b.this.f38980a) {
                        String.format("task run time costs %s millis", Long.valueOf(jUptimeMillis3));
                    }
                    throw th;
                }
            }
        }

        public b(int i, long j) {
            super(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            this.f38980a = j;
        }

        public final <T> Callable<T> b(Callable<T> callable) {
            return new CallableC1146b(callable);
        }

        public final Runnable c(Runnable runnable) {
            return new a(runnable);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            super.execute(c(runnable));
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return super.submit(c(runnable));
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t) {
            return super.submit(c(runnable), t);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return super.submit(b(callable));
        }
    }

    static {
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        f38977a = iAvailableProcessors;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f38978b = new b(4, timeUnit.toMillis(10L));
        c = new b(iAvailableProcessors, timeUnit.toMillis(5L));
        a aVar = new a();
        d = aVar;
        e = new ScheduledThreadPoolExecutor(1, aVar);
        f = new Handler(Looper.getMainLooper());
    }

    public static ExecutorService a() {
        return f38978b;
    }
}
