package com.huawei.openalliance.ad.download;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public class f implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f18620a = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f18622c = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadGroup f18621b = Thread.currentThread().getThreadGroup();
    private final String d = "PPS-download-pool-" + f18620a.getAndIncrement() + "-thread-";

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f18621b, runnable, this.d + this.f18622c.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        thread.setPriority(1);
        return thread;
    }
}
