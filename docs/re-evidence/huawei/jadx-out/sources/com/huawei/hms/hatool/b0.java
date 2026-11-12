package com.huawei.hms.hatool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b0 f13403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b0 f13404c;
    private static b0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f13405a = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(5000), new b());

    public void a(g gVar) {
        try {
            this.f13405a.execute(new a(gVar));
        } catch (RejectedExecutionException unused) {
            v.e("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }

    public static b0 c() {
        return f13403b;
    }

    static class b implements ThreadFactory {
        private static final AtomicInteger d = new AtomicInteger(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadGroup f13407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f13408b = new AtomicInteger(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f13409c;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(this.f13407a, runnable, this.f13409c + this.f13408b.getAndIncrement(), 0L);
        }

        b() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f13407a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f13409c = "FormalHASDK-base-" + d.getAndIncrement();
        }
    }

    public static b0 b() {
        return f13404c;
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Runnable f13406a;

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.f13406a;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    v.e("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }

        public a(Runnable runnable) {
            this.f13406a = runnable;
        }
    }

    public static b0 a() {
        return d;
    }

    private b0() {
    }

    static {
        new b0();
        new b0();
        f13403b = new b0();
        f13404c = new b0();
        d = new b0();
    }
}
