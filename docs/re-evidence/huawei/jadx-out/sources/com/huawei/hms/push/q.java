package com.huawei.hms.push;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes34.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f15874a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadPoolExecutor f15875b = new ThreadPoolExecutor(1, 50, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public static ThreadPoolExecutor a() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (f15874a) {
            threadPoolExecutor = f15875b;
        }
        return threadPoolExecutor;
    }
}
