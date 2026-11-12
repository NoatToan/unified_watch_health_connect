package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class ues {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f35695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f35696b;
    public static final BlockingQueue<Runnable> c;
    public static int d;
    public static boolean e;

    static {
        Runtime.getRuntime().availableProcessors();
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        c = linkedBlockingQueue;
        d = Integer.MAX_VALUE;
        e = false;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(16, 32, 10L, timeUnit, linkedBlockingQueue, new gns("GlobalThread-core", 5));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f35695a = threadPoolExecutor;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new gns("GlobalThread-delay", 5));
        f35696b = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(10L, timeUnit);
        f35696b.allowCoreThreadTimeOut(true);
        new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(128), new gns("GlobalThread-log_upload", 1), new ThreadPoolExecutor.DiscardOldestPolicy()).allowCoreThreadTimeOut(true);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    public static ScheduledFuture a(Runnable runnable, long j) {
        String str;
        if (e) {
            if (f35696b.getQueue().size() <= 128) {
                wpe.c("GlobalThread", "queue full .error", false);
                throw new RejectedExecutionException("GlobalThread,queue overflow .error");
            }
            if (runnable == null) {
                return f35696b.schedule(runnable, j, TimeUnit.MILLISECONDS);
            }
            str = "runnable null .error";
        } else if (d >= 21) {
            f35696b.setRemoveOnCancelPolicy(true);
            e = true;
            if (f35696b.getQueue().size() <= 128) {
                wpe.c("GlobalThread", "queue full .error", false);
                throw new RejectedExecutionException("GlobalThread,queue overflow .error");
            }
            if (runnable == null) {
                return f35696b.schedule(runnable, j, TimeUnit.MILLISECONDS);
            }
            str = "runnable null .error";
        } else {
            str = "non-supported android api:" + d;
        }
        wpe.c("GlobalThread", str, false);
        return null;
    }

    public static void b(int i) {
        if (d == Integer.MAX_VALUE) {
            d = i;
        }
        if (d >= 21) {
            f35696b.setRemoveOnCancelPolicy(true);
        }
    }

    public static void c(ScheduledFuture scheduledFuture) {
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        } else {
            wpe.i("GlobalThread", "removeCallBacks error,empty future", false);
        }
    }
}
