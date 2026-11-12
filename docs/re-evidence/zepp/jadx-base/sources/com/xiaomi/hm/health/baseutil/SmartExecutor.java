package com.xiaomi.hm.health.baseutil;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public class SmartExecutor {
    private static final Executor a;
    private static volatile Executor b = null;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f = 30;
    private static final ThreadFactory g;
    private static final BlockingQueue<Runnable> h;
    public static final Executor i;

    public class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(runnable, "SmartExecutorPool #" + this.a.getAndIncrement());
        }
    }

    static {
        b bVar = new b(null);
        a = bVar;
        b = bVar;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        c = iAvailableProcessors;
        int iMax = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        d = iMax;
        int i2 = (iAvailableProcessors * 2) + 1;
        e = i2;
        a aVar = new a();
        g = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        h = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, i2, 30L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        i = threadPoolExecutor;
    }

    public static Executor getExecutor() {
        return i;
    }

    public static Executor getSerialExecutor() {
        return b;
    }

    public static class b implements Executor {
        public final ArrayDeque<Runnable> a;
        public Runnable b;

        private b() {
            this.a = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                c();
            }
        }

        public synchronized void c() {
            Runnable runnablePoll = this.a.poll();
            this.b = runnablePoll;
            if (runnablePoll != null) {
                SmartExecutor.i.execute(runnablePoll);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(@NonNull final Runnable runnable) {
            this.a.offer(new Runnable() { // from class: com.xiaomi.hm.health.baseutil.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(runnable);
                }
            });
            if (this.b == null) {
                c();
            }
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }
}
