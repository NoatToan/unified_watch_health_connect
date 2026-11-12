package com.huawei.agconnect.credential.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f4970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f4971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f4972c;
    private static final long d = 1;

    static class NetworkThreadFactory implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static AtomicInteger f4973a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AGC-Thread-network-" + f4973a.getAndIncrement());
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            return thread;
        }

        NetworkThreadFactory() {
        }
    }

    public static ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f4972c, f4971b, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NetworkThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f4970a = iAvailableProcessors;
        f4971b = (iAvailableProcessors * 2) + 1;
        f4972c = iAvailableProcessors + 1;
    }
}
