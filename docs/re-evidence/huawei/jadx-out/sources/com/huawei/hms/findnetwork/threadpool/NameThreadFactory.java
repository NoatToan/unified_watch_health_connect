package com.huawei.hms.findnetwork.threadpool;

import com.huawei.hms.findnetwork.comm.exception.FindExceptionHandler;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes33.dex */
public class NameThreadFactory implements ThreadFactory {
    private static final int ATOMIC_INITIAL_VALUE = 1;
    private final AtomicInteger mCounter = new AtomicInteger(1);
    private final String mPoolName;

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.mPoolName + Constants.LINK + this.mCounter.getAndIncrement());
        thread.setUncaughtExceptionHandler(new FindExceptionHandler(thread.getName()));
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }

    public NameThreadFactory(String str) {
        this.mPoolName = str;
    }
}
