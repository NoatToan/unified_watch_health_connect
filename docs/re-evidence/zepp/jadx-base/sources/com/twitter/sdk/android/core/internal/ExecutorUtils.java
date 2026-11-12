package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.Twitter;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes18.dex */
public final class ExecutorUtils {
    private static final int a;
    private static final int b;
    private static final int c;
    private static final long d = 1;
    private static final long e = 1;

    public static class a implements ThreadFactory {
        public final /* synthetic */ String a;
        public final /* synthetic */ AtomicLong b;

        public a(String str, AtomicLong atomicLong) {
            this.a = str;
            this.b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName(this.a + this.b.getAndIncrement());
            return threadNewThread;
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ ExecutorService a;
        public final /* synthetic */ long b;
        public final /* synthetic */ TimeUnit c;
        public final /* synthetic */ String d;

        public b(ExecutorService executorService, long j, TimeUnit timeUnit, String str) {
            this.a = executorService;
            this.b = j;
            this.c = timeUnit;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.shutdown();
                if (this.a.awaitTermination(this.b, this.c)) {
                    return;
                }
                Twitter.getLogger().d("Twitter", this.d + " did not shutdown in the allocated time. Requesting immediate shutdown.");
                this.a.shutdownNow();
            } catch (InterruptedException unused) {
                Twitter.getLogger().d("Twitter", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.d));
                this.a.shutdownNow();
            }
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        a = iAvailableProcessors;
        b = iAvailableProcessors + 1;
        c = (iAvailableProcessors * 2) + 1;
    }

    private ExecutorUtils() {
    }

    public static void a(String str, ExecutorService executorService) {
        b(str, executorService, 1L, TimeUnit.SECONDS);
    }

    public static void b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(executorService, j, timeUnit, str), "Twitter Shutdown Hook for " + str));
    }

    public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String str) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(c(str));
        a(str, scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    public static ExecutorService buildThreadPoolExecutorService(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(b, c, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), c(str));
        a(str, threadPoolExecutor);
        return threadPoolExecutor;
    }

    public static ThreadFactory c(String str) {
        return new a(str, new AtomicLong(1L));
    }
}
