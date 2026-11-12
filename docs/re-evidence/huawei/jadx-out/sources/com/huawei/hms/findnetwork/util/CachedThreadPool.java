package com.huawei.hms.findnetwork.util;

import com.huawei.hms.findnetwork.threadpool.NameThreadFactory;
import com.huawei.hms.findnetwork.threadpool.TaskWrapper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes33.dex */
public class CachedThreadPool {
    private static final int DEFAULT_KEEPALIVE_MILLIS = 60;
    private static final String TAG = "CachedThreadPool";
    private static final int THREAD_MAX_DEFAULT = 4;
    private static final int THREAD_MAX_LIMIT = 40;
    private static final int THREAD_MIN_DEFAULT = 4;
    private static final String THREAD_POOL_NAME_CORE = "Nearby-nStackX-Core";
    private static final String THREAD_POOL_NAME_SEQ = "Nearby-nStackX-Seq";
    private static final int THREAD_SYSTEM_CORES_RATIO = 2;
    private static volatile CachedThreadPool sInstance;
    private ThreadPoolExecutor mCoreExecutor;
    private ThreadPoolExecutor mSeqTaskExecutor;

    public void execSeqTask(String str, Runnable runnable, String... strArr) {
        String str2;
        String strAppendExtraInfo = appendExtraInfo(strArr);
        if (str == null || runnable == null) {
            str2 = "task is null" + getPrintExtraInfo(strAppendExtraInfo);
        } else {
            try {
                this.mSeqTaskExecutor.execute(new TaskWrapper(str, runnable));
                return;
            } catch (Exception e) {
                str2 = str + " exec sequence task failed, " + e.getMessage() + getPrintExtraInfo(strAppendExtraInfo);
            }
        }
        HmsFindSDKLog.w(TAG, str2);
    }

    public void execSafeTask(String str, Runnable runnable, String... strArr) {
        if (runnable == null) {
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            HmsFindSDKLog.e(str, "Execute task exception: " + th.getMessage() + getPrintExtraInfo(appendExtraInfo(strArr)));
        }
    }

    public void execNormalTask(String str, Runnable runnable, String... strArr) {
        String str2;
        String strAppendExtraInfo = appendExtraInfo(strArr);
        if (str == null || runnable == null) {
            str2 = "task is null" + getPrintExtraInfo(strAppendExtraInfo);
        } else {
            try {
                this.mCoreExecutor.execute(new TaskWrapper(str, runnable));
                return;
            } catch (Exception e) {
                str2 = str + " exec normal task failed, " + e.getMessage() + getPrintExtraInfo(strAppendExtraInfo);
            }
        }
        HmsFindSDKLog.w(TAG, str2);
    }

    private String getPrintExtraInfo(String str) {
        if (str.isEmpty()) {
            return "";
        }
        return ", extraInfo=" + str;
    }

    private int getMaxPoolSize() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        HmsFindSDKLog.d(TAG, "cores num is " + iAvailableProcessors);
        int i = iAvailableProcessors * 2;
        if (i >= 40) {
            return 40;
        }
        return Math.max(i, 4);
    }

    public static CachedThreadPool getInstance() {
        if (sInstance == null) {
            synchronized (CachedThreadPool.class) {
                if (sInstance == null) {
                    sInstance = new CachedThreadPool();
                }
            }
        }
        return sInstance;
    }

    private String appendExtraInfo(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (String str : strArr) {
            if (str != null && str.contains(":")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length >= 2) {
                    sb.append(StringUtil.wrapQuotes(strArrSplit[0]) + ":" + StringUtil.wrapQuotes(strArrSplit[1]));
                    sb.append(", ");
                }
            }
        }
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }

    private CachedThreadPool() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60L, timeUnit, new LinkedBlockingQueue(), new NameThreadFactory(THREAD_POOL_NAME_SEQ), new ThreadPoolExecutor.CallerRunsPolicy());
        this.mSeqTaskExecutor = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(4, getMaxPoolSize(), 60L, timeUnit, new SynchronousQueue(), new NameThreadFactory(THREAD_POOL_NAME_CORE), new ThreadPoolExecutor.CallerRunsPolicy());
        this.mCoreExecutor = threadPoolExecutor2;
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
    }
}
