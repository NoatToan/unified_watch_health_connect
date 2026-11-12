package com.xiaomi.onetrack.util;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ThreadPoolExecutor f13930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f13931b = Runtime.getRuntime().availableProcessors() + 1;

    static {
        int i = f13931b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f13930a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static void a(Runnable runnable) {
        try {
            f13930a.execute(runnable);
        } catch (Throwable unused) {
        }
    }
}
