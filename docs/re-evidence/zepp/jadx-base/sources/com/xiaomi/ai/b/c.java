package com.xiaomi.ai.b;

import com.xiaomi.ai.log.Logger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
public final class c {
    public static final ExecutorService a;
    public static final ThreadPoolExecutor b;
    private static ScheduledThreadPoolExecutor c;
    private static final int d = Runtime.getRuntime().availableProcessors();
    private static final BlockingQueue<Runnable> e;
    private static int f;
    private static boolean g;

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        e = linkedBlockingQueue;
        f = Integer.MAX_VALUE;
        g = false;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(16, 32, 10L, timeUnit, linkedBlockingQueue, new e("GlobalThread-core", 5));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        a = threadPoolExecutor;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new e("GlobalThread-delay", 5));
        c = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(10L, timeUnit);
        c.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(128), new e("GlobalThread-log_upload", 1), new ThreadPoolExecutor.DiscardOldestPolicy());
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    public static ScheduledFuture a(Runnable runnable, long j) {
        String str;
        if (g) {
            if (c.getQueue().size() <= 128) {
                Logger.c("GlobalThread", "queue full .error", false);
                throw new RejectedExecutionException("GlobalThread,queue overflow .error");
            }
            if (runnable == null) {
                return c.schedule(runnable, j, TimeUnit.MILLISECONDS);
            }
            str = "runnable null .error";
        } else if (f >= 21) {
            c.setRemoveOnCancelPolicy(true);
            g = true;
            if (c.getQueue().size() <= 128) {
                Logger.c("GlobalThread", "queue full .error", false);
                throw new RejectedExecutionException("GlobalThread,queue overflow .error");
            }
            if (runnable == null) {
                return c.schedule(runnable, j, TimeUnit.MILLISECONDS);
            }
            str = "runnable null .error";
        } else {
            str = "non-supported android api:" + f;
        }
        Logger.c("GlobalThread", str, false);
        return null;
    }

    public static void a(int i) {
        if (f == Integer.MAX_VALUE) {
            f = i;
        }
        if (f >= 21) {
            c.setRemoveOnCancelPolicy(true);
        }
    }

    public static void a(ScheduledFuture scheduledFuture) {
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        } else {
            Logger.b("GlobalThread", "removeCallBacks error,empty future", false);
        }
    }
}
