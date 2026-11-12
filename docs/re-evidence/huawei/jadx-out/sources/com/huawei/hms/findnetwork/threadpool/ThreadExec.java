package com.huawei.hms.findnetwork.threadpool;

import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes33.dex */
public final class ThreadExec {
    private static final long DEFAULT_KEEP_ALIVE_TIME = 60;
    private static final int QUEUE_CAPACITY = 100;
    private static final int SEQ_POOL_SIZE = 1;
    private static final String TAG = "ThreadExec";
    private static final int THREAD_MAX_DEFAULT = 4;
    private static final int THREAD_MAX_LIMIT = 16;
    private static final int THREAD_MIN_DEFAULT = 4;
    private static final String THREAD_POOL_PREFIX_CORE = "FindNetwork-Core";
    private static final String THREAD_POOL_PREFIX_SEQ = "FindNetwork-Seq";
    private static final int THREAD_SYSTEM_CORES_RATIO = 2;
    private static final long THREAD_WORK_MAX_DURATION = 1000;
    private static ThreadPoolExecutor sCoreExecutor;
    private static ThreadPoolExecutor sSeqTaskExecutor;

    public static void removeTask(Runnable runnable) {
        if (runnable != null) {
            sCoreExecutor.remove(runnable);
        }
    }

    private static void initExecutor() {
        synchronized (ThreadExec.class) {
            int maxPoolSize = getMaxPoolSize();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, maxPoolSize, 60L, timeUnit, new LinkedBlockingQueue(100), new NameThreadFactory(THREAD_POOL_PREFIX_CORE), new ThreadPoolExecutor.CallerRunsPolicy());
            sCoreExecutor = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 60L, timeUnit, new LinkedBlockingQueue(), new NameThreadFactory(THREAD_POOL_PREFIX_SEQ), new ThreadPoolExecutor.CallerRunsPolicy());
            sSeqTaskExecutor = threadPoolExecutor2;
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
        }
    }

    private static int getMaxPoolSize() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        HmsFindSDKLog.d(TAG, "cores num is " + iAvailableProcessors);
        int i = iAvailableProcessors * 2;
        if (i >= 16) {
            return 16;
        }
        return Math.max(i, 4);
    }

    public static void execSeqTask(String str, Runnable runnable) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            sSeqTaskExecutor.execute(new TaskWrapper(str, runnable));
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (jCurrentTimeMillis2 > 1000) {
                HmsFindSDKLog.w(TAG, str + " has run over " + jCurrentTimeMillis2 + " ms.");
            }
        } catch (Exception e) {
            HmsFindSDKLog.e(TAG, "exec task failed, " + e.getMessage());
        }
    }

    public static void execNormalTask(String str, Runnable runnable) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            sCoreExecutor.execute(new TaskWrapper(str, runnable));
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (jCurrentTimeMillis2 > 1000) {
                HmsFindSDKLog.w(TAG, str + " has run over " + jCurrentTimeMillis2 + " ms.");
            }
        } catch (Exception e) {
            HmsFindSDKLog.e(TAG, "exec task failed, " + e.getMessage());
        }
    }

    static {
        initExecutor();
    }
}
