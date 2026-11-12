package com.huawei.openalliance.ad.utils;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public class p implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadGroup f20674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f20675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20676c;
    private final int d;

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f20674a, runnable, this.f20676c + this.f20675b.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int priority = thread.getPriority();
        int i = this.d;
        if (priority != i) {
            thread.setPriority(i);
        }
        return thread;
    }

    public p(String str, int i) {
        this.f20675b = new AtomicInteger(1);
        this.d = i;
        this.f20674a = Thread.currentThread().getThreadGroup();
        this.f20676c = "PPS-" + str + "-pool-thread-";
    }

    public p(String str) {
        this(str, 5);
    }
}
