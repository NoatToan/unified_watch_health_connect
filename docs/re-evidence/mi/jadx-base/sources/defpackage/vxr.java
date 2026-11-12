package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class vxr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f37344b;
    public static final int c;
    public static final int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f37345a;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f37346a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f37347b;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f37347b = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "YRN_YRNV3_SDK:LoaderThreadPool:new thread ==>" + this.f37346a.getAndIncrement());
            thread.setPriority(6);
            thread.setUncaughtExceptionHandler(this.f37347b);
            return thread;
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f37344b = iAvailableProcessors;
        c = iAvailableProcessors + 1;
        d = (iAvailableProcessors * 2) + 1;
    }

    public vxr(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(c, d, 1L, TimeUnit.SECONDS, new ArrayBlockingQueue(32), new a(uncaughtExceptionHandler));
        this.f37345a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public void a(Runnable runnable) {
        if (this.f37345a.isShutdown()) {
            return;
        }
        this.f37345a.execute(runnable);
    }
}
