package com.huawei.haf.common.dfx.block;

import com.huawei.haf.threadpool.ThreadPoolCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.haf.threadpool.ThreadPoolTaskStatistics;

/* JADX INFO: loaded from: classes.dex */
public final class ThreadPoolMonitor {
    private ThreadPoolMonitor() {
    }

    public static void e(ThreadPoolCallback threadPoolCallback) {
        d(ThreadPoolManager.c(), threadPoolCallback);
    }

    public static void d(ThreadPoolManager threadPoolManager, ThreadPoolCallback threadPoolCallback) {
        if (threadPoolCallback == null) {
            threadPoolCallback = new DefaultThreadPoolHandler("HAF_PoolMonitor");
        }
        threadPoolManager.d(new ThreadPoolTaskStatistics(threadPoolManager, threadPoolCallback));
    }

    public static void c() {
        a(ThreadPoolManager.c());
    }

    public static void a(ThreadPoolManager threadPoolManager) {
        threadPoolManager.d(null);
    }
}
