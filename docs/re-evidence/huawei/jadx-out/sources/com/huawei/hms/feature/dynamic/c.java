package com.huawei.hms.feature.dynamic;

import com.huawei.hms.common.util.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13166a = "ExecutorsManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f13167b = 60;

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f13168a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f13169b;

        /* JADX INFO: renamed from: com.huawei.hms.feature.dynamic.c$a$a, reason: collision with other inner class name */
        public class C0111a implements Thread.UncaughtExceptionHandler {
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                Logger.e(c.f13166a, thread.getName() + " : " + th.getMessage());
            }

            public C0111a() {
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f13169b + this.f13168a.getAndIncrement());
            thread.setUncaughtExceptionHandler(new C0111a());
            return thread;
        }

        public a(String str) {
            this.f13169b = str + "-thread-";
        }
    }

    public static ExecutorService a(int i, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
