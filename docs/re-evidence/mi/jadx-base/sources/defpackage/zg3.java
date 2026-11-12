package defpackage;

import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class zg3 implements Executor {
    public static final ThreadFactory c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41240a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mExecutorLock")
    public ThreadPoolExecutor f41241b = b();

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f41242a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f41242a.getAndIncrement())));
            return thread;
        }
    }

    public static ThreadPoolExecutor b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: yg3
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                zpe.c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    public void c(ah3 ah3Var) {
        ThreadPoolExecutor threadPoolExecutor;
        g6i.g(ah3Var);
        synchronized (this.f41240a) {
            try {
                if (this.f41241b.isShutdown()) {
                    this.f41241b = b();
                }
                threadPoolExecutor = this.f41241b;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iMax = Math.max(1, ah3Var.b().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        g6i.g(runnable);
        synchronized (this.f41240a) {
            this.f41241b.execute(runnable);
        }
    }
}
