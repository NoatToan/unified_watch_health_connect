package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorUtils {
    private static final long a = 2;

    public class a implements ThreadFactory {
        public final /* synthetic */ String a;
        public final /* synthetic */ AtomicLong b;

        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$a$a, reason: collision with other inner class name */
        public class C0244a extends BackgroundPriorityRunnable {
            public final /* synthetic */ Runnable a;

            public C0244a(Runnable runnable) {
                this.a = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
            public void onRun() {
                this.a.run();
            }
        }

        public a(String str, AtomicLong atomicLong) {
            this.a = str;
            this.b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0244a(runnable));
            threadNewThread.setName(this.a + this.b.getAndIncrement());
            return threadNewThread;
        }
    }

    public class b extends BackgroundPriorityRunnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ ExecutorService b;
        public final /* synthetic */ long c;
        public final /* synthetic */ TimeUnit d;

        public b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.a = str;
            this.b = executorService;
            this.c = j;
            this.d = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
        public void onRun() {
            try {
                Logger.getLogger().d("Executing shutdown hook for " + this.a);
                this.b.shutdown();
                if (this.b.awaitTermination(this.c, this.d)) {
                    return;
                }
                Logger.getLogger().d(this.a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.b.shutdownNow();
            } catch (InterruptedException unused) {
                Logger.getLogger().d(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.a));
                this.b.shutdownNow();
            }
        }
    }

    private ExecutorUtils() {
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService buildSingleThreadExecutorService(String str) {
        ExecutorService executorServiceC = c(getNamedThreadFactory(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceC);
        return executorServiceC;
    }

    public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String str) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(getNamedThreadFactory(str));
        a(str, scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    private static ExecutorService c(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }

    public static ThreadFactory getNamedThreadFactory(String str) {
        return new a(str, new AtomicLong(1L));
    }
}
