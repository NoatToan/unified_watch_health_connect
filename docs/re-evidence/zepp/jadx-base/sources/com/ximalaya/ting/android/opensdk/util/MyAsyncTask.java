package com.ximalaya.ting.android.opensdk.util;

import android.os.AsyncTask;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes22.dex */
public abstract class MyAsyncTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE_SECONDS = 30;
    private static final int MAXIMUM_POOL_SIZE;
    public static final ThreadPoolExecutor MY_THREAD_POOL_EXECUTOR;
    public static String TAG = "MyAsyncTask";
    private static final BlockingQueue<Runnable> mPoolWorkQueue;
    private static final ThreadFactory mThreadFactory;

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        mPoolWorkQueue = linkedBlockingQueue;
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.ximalaya.ting.android.opensdk.util.MyAsyncTask.1
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "MyAsyncTask #" + this.mCount.getAndIncrement());
            }
        };
        mThreadFactory = threadFactory;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        int iMax = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        CORE_POOL_SIZE = iMax;
        MAXIMUM_POOL_SIZE = (iAvailableProcessors * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        MY_THREAD_POOL_EXECUTOR = threadPoolExecutor;
    }

    public static String dumpAllThreadStack() {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Thread thread : allStackTraces.keySet()) {
            if (thread != null) {
                sb.append("thread id: " + thread.getId() + ", name: " + thread.getName() + ", state:" + thread.getState() + ", priority:" + thread.getPriority());
                sb.append("\n");
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null) {
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(HTTP.TAB);
                        sb.append(stackTraceElement);
                        sb.append("\n");
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void execute(Runnable runnable) {
        handleThreadException();
        MY_THREAD_POOL_EXECUTOR.execute(runnable);
    }

    private static void handleThreadException() {
    }

    public final MyAsyncTask<Params, Progress, Result> myexec(Params... paramsArr) {
        Logger.i("MyAsyncTask", "MyAsyncTask --- myexec " + this);
        handleThreadException();
        executeOnExecutor(MY_THREAD_POOL_EXECUTOR, paramsArr);
        return this;
    }

    public static void execute(Runnable runnable, boolean z) {
        handleThreadException();
        if (MY_THREAD_POOL_EXECUTOR.getQueue().size() < 10 || !z) {
            execute(runnable);
        }
    }
}
