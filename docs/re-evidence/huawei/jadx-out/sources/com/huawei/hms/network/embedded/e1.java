package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes34.dex */
public final class e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f14713b = "RequestThreadPoolMgr";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExecutorService f14714a;

    public static class b {
        public static final e1 INSTANCE = new e1();
    }

    public Future submit(Runnable runnable) {
        try {
            return this.f14714a.submit(runnable);
        } catch (RejectedExecutionException unused) {
            Logger.e(f14713b, "the runnable task cannot be accepted for execution");
            return null;
        }
    }

    public void release() {
        Logger.i(f14713b, "ThreadPool release!");
        ExecutorService executorService = this.f14714a;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.f14714a.shutdown();
    }

    public void execute(Runnable runnable) {
        try {
            this.f14714a.execute(runnable);
        } catch (RejectedExecutionException unused) {
            Logger.e(f14713b, "the runnable task cannot be accepted for execution");
        }
    }

    public static e1 getInstance() {
        return b.INSTANCE;
    }

    public e1() {
        this.f14714a = null;
        Logger.i(f14713b, "ThreadPool init!");
        this.f14714a = Executors.newCachedThreadPool(ExecutorsUtils.createThreadFactory("request"));
    }
}
