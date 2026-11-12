package com.huawei.updatesdk.service.store;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes20.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f30005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f30006b;

    static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f30007a = new AtomicInteger();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30008b;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.f30008b + "#" + this.f30007a.incrementAndGet());
        }

        a(String str) {
            this.f30008b = str;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f30005a = new ThreadPoolExecutor(2, 2, 10L, timeUnit, new LinkedBlockingQueue(), new a("UpdateSDK-ServerTask"));
        f30006b = new ThreadPoolExecutor(3, 8, 5L, timeUnit, new LinkedBlockingQueue(), new a("UpdateSDK-CheckTask"));
    }
}
