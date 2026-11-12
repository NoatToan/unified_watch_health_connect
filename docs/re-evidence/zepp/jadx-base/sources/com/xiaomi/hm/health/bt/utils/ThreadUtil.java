package com.xiaomi.hm.health.bt.utils;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.utils.ThreadUtil;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public class ThreadUtil {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(String str, Thread thread, Throwable th) {
        Debug.fi(str, "uncaughtException:" + th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread d(final String str, int i, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(i);
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io7
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread2, Throwable th) {
                ThreadUtil.c(str, thread2, th);
            }
        });
        return thread;
    }

    public static ExecutorService newMultiThreadExecutor(String name, int priority) {
        return new ThreadPoolExecutor(5, 10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), newPriorityNamedThreadFactory(name, priority));
    }

    public static ThreadFactory newPriorityNamedThreadFactory(final String name, final int priority) {
        return new ThreadFactory() { // from class: jo7
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return ThreadUtil.d(name, priority, runnable);
            }
        };
    }

    public static ExecutorService newSingleThreadExecutor(String name, int priority) {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), newPriorityNamedThreadFactory(name, priority));
    }

    public static ExecutorService newMultiThreadExecutor(String name) {
        return newMultiThreadExecutor(name, 5);
    }

    public static ExecutorService newSingleThreadExecutor(String name) {
        return newSingleThreadExecutor(name, 5);
    }
}
