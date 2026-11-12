package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class let {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f24987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Executor f24988b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final ThreadFactory f;
    public static final BlockingQueue<Runnable> g;
    public static final Executor h;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f24989a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "SmartExecutorPool #" + this.f24989a.getAndIncrement());
        }
    }

    public static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque<Runnable> f24990a = new ArrayDeque<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f24991b;

        public synchronized void b() {
            Runnable runnablePoll = this.f24990a.poll();
            this.f24991b = runnablePoll;
            if (runnablePoll != null) {
                let.h.execute(runnablePoll);
            }
        }

        public final /* synthetic */ void c(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                b();
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            this.f24990a.offer(new Runnable() { // from class: met
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26089a.c(runnable);
                }
            });
            if (this.f24991b == null) {
                b();
            }
        }
    }

    static {
        b bVar = new b();
        f24987a = bVar;
        f24988b = bVar;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        c = iAvailableProcessors;
        int iMax = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        d = iMax;
        int i = (iAvailableProcessors * 2) + 1;
        e = i;
        a aVar = new a();
        f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, i, 30L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        h = threadPoolExecutor;
    }

    public static Executor a() {
        return f24988b;
    }
}
