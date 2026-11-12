package com.amap.api.mapcore.util;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class eq {
    private static volatile eq c;
    private BlockingQueue<Runnable> a = new LinkedBlockingQueue();
    private ExecutorService b;

    private eq() {
        this.b = null;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        this.b = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors * 2, 10L, TimeUnit.SECONDS, this.a, new ee("AMapThreadUtil"), new ThreadPoolExecutor.AbortPolicy());
    }

    public static eq a() {
        if (c == null) {
            synchronized (eq.class) {
                if (c == null) {
                    c = new eq();
                }
            }
        }
        return c;
    }

    public static void b() {
        if (c != null) {
            try {
                c.b.shutdownNow();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            c.b = null;
            c = null;
        }
    }

    public final void b(Runnable runnable) {
        BlockingQueue<Runnable> blockingQueue = this.a;
        if (blockingQueue != null) {
            try {
                blockingQueue.remove(runnable);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void a(Runnable runnable) {
        ExecutorService executorService = this.b;
        if (executorService != null) {
            try {
                executorService.execute(runnable);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
