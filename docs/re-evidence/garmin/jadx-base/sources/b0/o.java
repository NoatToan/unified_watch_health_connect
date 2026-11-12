package b0;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class o implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14039c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14040a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ThreadPoolExecutor f14041b;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f14042a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(new n(runnable, 0));
            thread.setPriority(7);
            Locale locale = Locale.US;
            thread.setName("CameraX-core_camera_" + this.f14042a.getAndIncrement());
            return thread;
        }
    }

    public o() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f14039c);
        threadPoolExecutor.setRejectedExecutionHandler(new m());
        this.f14041b = threadPoolExecutor;
    }

    public final void a(androidx.camera.core.impl.j0 j0Var) {
        ThreadPoolExecutor threadPoolExecutor;
        j0Var.getClass();
        synchronized (this.f14040a) {
            try {
                if (this.f14041b.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f14039c);
                    threadPoolExecutor2.setRejectedExecutionHandler(new m());
                    this.f14041b = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f14041b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        int iMax = Math.max(1, j0Var.e().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f14040a) {
            this.f14041b.execute(runnable);
        }
    }
}
