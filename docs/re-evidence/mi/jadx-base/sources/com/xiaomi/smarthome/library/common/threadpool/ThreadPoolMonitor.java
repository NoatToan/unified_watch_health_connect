package com.xiaomi.smarthome.library.common.threadpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ThreadPoolMonitor extends ThreadPoolExecutor {
    private static final long EXECUTE_TASK_WARNING_TIME = 3000;
    private static final int THREAD_ACTIVATION_WARNING_VALUE = 80;
    private String poolName;
    private ConcurrentHashMap<Integer, Long> startTimes;

    public ThreadPoolMonitor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, String str, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.startTimes = new ConcurrentHashMap<>();
        this.poolName = str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
    }
}
