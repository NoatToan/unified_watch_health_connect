package com.huawei.hianalytics.visual;

import com.huawei.hianalytics.core.log.HiLog;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes33.dex */
public final class g1 implements ThreadFactory {
    public static final Thread.UncaughtExceptionHandler d = new Thread.UncaughtExceptionHandler() { // from class: com.huawei.hianalytics.visual.g1$$ExternalSyntheticLambda0
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            HiLog.w("ThreadNamedFactory", "uncaught exception " + th.getMessage() + " occurred in thread [" + thread.getName() + "]");
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadGroup f11644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f11646c = new AtomicInteger(1);

    public g1() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f11644a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.f11645b = "HA_HA-VISUAL-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f11644a, runnable, this.f11645b + this.f11646c.getAndIncrement(), 0L);
        thread.setUncaughtExceptionHandler(d);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
