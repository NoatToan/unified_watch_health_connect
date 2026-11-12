package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes23.dex */
public class bhu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ScheduledExecutorService f1116c;

    static class d implements ThreadFactory {
        private final AtomicInteger e;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "Core thread #" + this.e.getAndIncrement());
        }

        private d() {
            this.e = new AtomicInteger();
        }
    }

    public static void a(Runnable runnable, long j) {
        f1116c.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    static {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new d());
        scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        f1116c = scheduledThreadPoolExecutor;
    }
}
