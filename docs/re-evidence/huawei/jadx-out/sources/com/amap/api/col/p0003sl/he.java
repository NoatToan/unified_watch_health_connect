package com.amap.api.col.p0003sl;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class he {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile he f2617c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BlockingQueue<Runnable> f2618a = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f2619b;

    public static he a() {
        if (f2617c == null) {
            synchronized (he.class) {
                if (f2617c == null) {
                    f2617c = new he();
                }
            }
        }
        return f2617c;
    }

    public static void b() {
        if (f2617c != null) {
            synchronized (he.class) {
                if (f2617c != null) {
                    f2617c.f2619b.shutdownNow();
                    f2617c.f2619b = null;
                    f2617c = null;
                }
            }
        }
    }

    private he() {
        this.f2619b = null;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        this.f2619b = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors * 2, 1L, TimeUnit.SECONDS, this.f2618a, new ThreadPoolExecutor.AbortPolicy());
    }

    public final void a(Runnable runnable) {
        ExecutorService executorService = this.f2619b;
        if (executorService != null) {
            executorService.execute(runnable);
        }
    }
}
