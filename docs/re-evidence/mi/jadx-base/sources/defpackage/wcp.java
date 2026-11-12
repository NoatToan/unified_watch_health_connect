package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class wcp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadFactory f37853a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f37854b;
    public static final BlockingQueue<Runnable> c;
    public static final ExecutorService d;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f37855a = new AtomicInteger();

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "cir_thread" + this.f37855a.getAndIncrement());
        }
    }

    static {
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        f37854b = iAvailableProcessors;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        c = synchronousQueue;
        d = new ThreadPoolExecutor(iAvailableProcessors, Integer.MAX_VALUE, 3000L, TimeUnit.MILLISECONDS, synchronousQueue);
    }

    public static void a(Runnable runnable) {
        ExecutorService executorService = d;
        if (executorService.isShutdown()) {
            return;
        }
        executorService.execute(runnable);
    }

    public static ExecutorService b() {
        return d;
    }
}
