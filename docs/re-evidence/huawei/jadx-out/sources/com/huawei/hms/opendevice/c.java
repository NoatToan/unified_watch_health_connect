package com.huawei.hms.opendevice;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes34.dex */
public class c implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadGroup f15804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15805b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15806c;

    public c(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.f15804a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.f15806c = str + "-pool-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        synchronized (this) {
            this.f15805b++;
        }
        Thread thread = new Thread(this.f15804a, runnable, this.f15806c + this.f15805b, 0L);
        thread.setUncaughtExceptionHandler(null);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
