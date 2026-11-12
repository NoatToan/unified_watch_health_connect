package com.huawei.hms.network.file.core;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.ThreadPoolExcutorEnhance;
import com.huawei.hms.network.file.api.GlobalRequestConfig;
import com.huawei.hms.network.file.core.util.FLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class f {
    private static final Object f = new Object();
    private static volatile ThreadPoolExecutor g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private GlobalRequestConfig f15743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ThreadPoolExecutor f15744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ExecutorService f15745c;
    ExecutorService d;
    int e;

    public void e() {
        synchronized (this) {
            FLogger.i("ThreadPoolManager", "shutdown executors", new Object[0]);
            ThreadPoolExecutor threadPoolExecutor = this.f15744b;
            if (threadPoolExecutor != null || this.f15745c != null || this.d != null) {
                a(threadPoolExecutor, this.f15745c, this.d);
                this.f15744b = null;
                this.f15745c = null;
                this.d = null;
            }
        }
    }

    public ThreadPoolExecutor d() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (this) {
            if (this.f15744b == null) {
                g();
            }
            threadPoolExecutor = this.f15744b;
        }
        return threadPoolExecutor;
    }

    public ExecutorService c() {
        ExecutorService executorService;
        synchronized (this) {
            if (this.f15745c == null) {
                g();
            }
            executorService = this.f15745c;
        }
        return executorService;
    }

    public int b() {
        return this.e;
    }

    public ExecutorService a() {
        ExecutorService executorService;
        synchronized (this) {
            if (this.d == null) {
                g();
            }
            executorService = this.d;
        }
        return executorService;
    }

    private void g() {
        int iC = b.c();
        if (iC <= 0) {
            iC = Runtime.getRuntime().availableProcessors() * 2;
        }
        this.e = iC;
        GlobalRequestConfig globalRequestConfig = this.f15743a;
        if (globalRequestConfig != null && globalRequestConfig.getThreadPoolSize() != -100) {
            iC = this.f15743a.getThreadPoolSize();
            this.e = iC;
            FLogger.i("ThreadPoolManager", "use taskPoolSize executeCorePoolSize:" + iC, new Object[0]);
        }
        int i = iC;
        FLogger.i("ThreadPoolManager", "executeCorePoolSize:" + i + ",maxThreadPoolSize:" + this.e, new Object[0]);
        if (this.f15744b == null) {
            ThreadPoolExcutorEnhance threadPoolExcutorEnhance = new ThreadPoolExcutorEnhance(i, this.e, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), ExecutorsUtils.createThreadFactory("fileTaskPoolThread"));
            this.f15744b = threadPoolExcutorEnhance;
            threadPoolExcutorEnhance.allowCoreThreadTimeOut(true);
        }
        if (this.f15745c == null) {
            this.f15745c = ExecutorsUtils.newSingleThreadExecutor("fileRespPoolThread");
        }
        if (this.d == null) {
            this.d = ExecutorsUtils.newSingleThreadExecutor("fileExtraPoolThread");
        }
    }

    public static ThreadPoolExecutor f() {
        if (g == null) {
            synchronized (f) {
                if (g == null) {
                    g = new ThreadPoolExcutorEnhance(2, 2, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), ExecutorsUtils.createThreadFactory("initPoolThread"));
                }
            }
        }
        g.allowCoreThreadTimeOut(true);
        return g;
    }

    private void a(ExecutorService... executorServiceArr) {
        for (ExecutorService executorService : executorServiceArr) {
            if (executorService != null && !executorService.isShutdown()) {
                executorService.shutdown();
            }
        }
    }

    public f(GlobalRequestConfig globalRequestConfig) {
        this.f15743a = globalRequestConfig;
    }
}
