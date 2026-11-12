package com.huawei.hms.iapfull;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f13651a;

    public void a(Runnable runnable) {
        this.f13651a.execute(runnable);
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static d1 f13652a = new d1();
    }

    static class c implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f13653a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "Pay-Message-" + this.f13653a.getAndIncrement());
        }

        c() {
        }
    }

    public static d1 a() {
        return b.f13652a;
    }

    private d1() {
        y0.b("ThreadpoolManager", "threadpool init.");
        this.f13651a = Executors.newCachedThreadPool(new c());
    }
}
