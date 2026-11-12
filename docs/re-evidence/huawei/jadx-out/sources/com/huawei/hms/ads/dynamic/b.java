package com.huawei.hms.ads.dynamic;

import com.huawei.hms.ads.uiengineloader.af;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f12775a = "ExecutorsManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f12776b = 60;

    static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f12777a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f12778b;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f12778b + this.f12777a.getAndIncrement());
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.huawei.hms.ads.dynamic.b.a.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread2, Throwable th) {
                    af.d(b.f12775a, thread2.getName() + " : " + th.getMessage());
                }
            });
            return thread;
        }

        a(String str) {
            this.f12778b = str + "-thread-";
        }
    }

    public static ExecutorService a(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
