package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.elements.util.ClockUtil;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zzo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Boolean f54828c;
    private static final Boolean d;
    private static final Logger e = aaex.a((Class<?>) zzo.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Runnable f54827b = new Runnable() { // from class: zzo.2
        @Override // java.lang.Runnable
        public void run() {
            zzo.e.trace("warmup ...");
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadGroup f54826a = new ThreadGroup("Timer");

    static {
        Boolean bool = true;
        f54828c = bool;
        Boolean boolE = zzp.e("EXECUTER_REMOVE_ON_CANCEL");
        bool = boolE != null ? boolE : true;
        if (bool != null) {
            try {
                ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                bool = null;
            }
        }
        d = bool;
    }

    public static ExecutorService b(int i, ThreadFactory threadFactory) {
        e.trace("create thread pool of {} threads", Integer.valueOf(i));
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i, threadFactory);
        executorServiceNewFixedThreadPool.execute(f54827b);
        return executorServiceNewFixedThreadPool;
    }

    public static ScheduledExecutorService c(ThreadFactory threadFactory) {
        e.trace("create scheduled single thread pool");
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(threadFactory);
        d(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.execute(f54827b);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    public static void c(long j, ExecutorService... executorServiceArr) {
        if (executorServiceArr.length == 0) {
            return;
        }
        long jC = ClockUtil.c();
        for (ExecutorService executorService : executorServiceArr) {
            executorService.shutdown();
        }
        long millis = TimeUnit.NANOSECONDS.toMillis(ClockUtil.c() - jC);
        if (millis > j) {
            e.warn("shutdown {} ms exceeded the maximum {} ms", Long.valueOf(millis), Long.valueOf(j));
        }
        try {
            long length = (j / ((long) executorServiceArr.length)) / 2;
            for (ExecutorService executorService2 : executorServiceArr) {
                if (!executorService2.awaitTermination(length, TimeUnit.MILLISECONDS)) {
                    List<Runnable> listShutdownNow = executorService2.shutdownNow();
                    if (listShutdownNow.size() > 0) {
                        e.debug("ignoring remaining {} scheduled task(s)", Integer.valueOf(listShutdownNow.size()));
                    }
                    executorService2.awaitTermination(length, TimeUnit.MILLISECONDS);
                }
            }
        } catch (InterruptedException unused) {
            for (ExecutorService executorService3 : executorServiceArr) {
                executorService3.shutdownNow();
            }
            Thread.currentThread().interrupt();
        } finally {
            long millis2 = TimeUnit.NANOSECONDS.toMillis(ClockUtil.c() - jC);
            if (millis2 > j) {
                e.warn("await termination {} ms exceeded the maximum {} ms", Long.valueOf(millis2), Long.valueOf(j));
            }
        }
    }

    public static void d(List<Runnable> list) {
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (Throwable th) {
                e.warn("Ignoring error:", th);
            }
        }
    }

    private static void d(ScheduledExecutorService scheduledExecutorService) {
        Boolean bool = d;
        if (bool == null || !(scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            return;
        }
        ((ScheduledThreadPoolExecutor) scheduledExecutorService).setRemoveOnCancelPolicy(bool.booleanValue());
    }
}
