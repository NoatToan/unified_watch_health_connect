package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class ays {
    public static volatile ays c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BlockingQueue<Runnable> f3593a = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExecutorService f3594b;

    public ays() {
        this.f3594b = null;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        this.f3594b = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors * 2, 1L, TimeUnit.SECONDS, this.f3593a, new ThreadPoolExecutor.AbortPolicy());
    }

    public static ays a() {
        if (c == null) {
            synchronized (ays.class) {
                try {
                    if (c == null) {
                        c = new ays();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static void c() {
        if (c != null) {
            synchronized (ays.class) {
                try {
                    if (c != null) {
                        c.f3594b.shutdownNow();
                        c.f3594b = null;
                        c = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(Runnable runnable) {
        ExecutorService executorService = this.f3594b;
        if (executorService != null) {
            executorService.execute(runnable);
        }
    }
}
