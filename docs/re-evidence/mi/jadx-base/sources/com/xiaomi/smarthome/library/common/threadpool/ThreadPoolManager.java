package com.xiaomi.smarthome.library.common.threadpool;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.SharePrefsManager;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ThreadPoolManager {
    private static final ThreadPoolExecutor ASYNC_TASK_THREAD_POOL_EXECUTOR;
    private static final int CPU_COUNT;
    private static final ThreadPoolExecutor CPU_THREAD_POOL_EXECUTOR;
    private static final ThreadPoolExecutor DEFAULT_THREAD_POOL_EXECUTOR;
    private static ThreadPoolExecutor HTTP_THREAD_POOL_EXECUTOR;
    private static final ThreadPoolExecutor IO_THREAD_POOL_EXECUTOR;
    private static final ScheduledExecutorService SCHEDULED_EXECUTOR_SERVICE;
    private static final ThreadPoolExecutor SINGLE_THREAD_POOL_EXECUTOR;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        SINGLE_THREAD_POOL_EXECUTOR = new ThreadPoolMonitor(1, 1, 0L, timeUnit, new LinkedBlockingQueue(128), Executors.defaultThreadFactory(), "single-thread-pool", new StatisticalRejectedExecutionPolicy());
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        IO_THREAD_POOL_EXECUTOR = new ThreadPoolMonitor((iAvailableProcessors * 2) + 1, (iAvailableProcessors * 2) + 1, 30L, timeUnit2, new LinkedBlockingQueue(128), Executors.defaultThreadFactory(), "io-thread-pool", new StatisticalRejectedExecutionPolicy());
        CPU_THREAD_POOL_EXECUTOR = new ThreadPoolMonitor(iAvailableProcessors + 1, (iAvailableProcessors * 2) + 1, 30L, timeUnit2, new LinkedBlockingQueue(128), Executors.defaultThreadFactory(), "cpu-thread-pool", new StatisticalRejectedExecutionPolicy());
        DEFAULT_THREAD_POOL_EXECUTOR = new ThreadPoolMonitor(Math.max(5, iAvailableProcessors), Math.max(5, iAvailableProcessors), 0L, timeUnit, new LinkedBlockingQueue(128), Executors.defaultThreadFactory(), "default-thread-pool", new StatisticalRejectedExecutionPolicy());
        ASYNC_TASK_THREAD_POOL_EXECUTOR = new ThreadPoolMonitor(iAvailableProcessors + 1, Math.max(30, iAvailableProcessors + 1), 60L, timeUnit2, new LinkedBlockingQueue(128), Executors.defaultThreadFactory(), "async-task-thread-pool", new StatisticalRejectedExecutionPolicy());
        SCHEDULED_EXECUTOR_SERVICE = Executors.newScheduledThreadPool(iAvailableProcessors + 1);
    }

    public static void executeCpuTask(Runnable runnable) {
        CPU_THREAD_POOL_EXECUTOR.execute(new RenameThreadNameRunnable(runnable, getRenameThreadName("executeCpuTask")));
    }

    public static void executeIoTask(Runnable runnable) {
        IO_THREAD_POOL_EXECUTOR.execute(new RenameThreadNameRunnable(runnable, getRenameThreadName("executeIoTask")));
    }

    public static Future<?> executeScheduledTask(Runnable runnable, long j) {
        return SCHEDULED_EXECUTOR_SERVICE.schedule(new RenameThreadNameRunnable(runnable, getRenameThreadName("executeScheduledTask")), j, TimeUnit.MILLISECONDS);
    }

    public static void executeSingleTask(Runnable runnable) {
        SINGLE_THREAD_POOL_EXECUTOR.execute(new RenameThreadNameRunnable(runnable, getRenameThreadName("executeSingleTask")));
    }

    public static void executeTask(Runnable runnable) {
        DEFAULT_THREAD_POOL_EXECUTOR.execute(new RenameThreadNameRunnable(runnable, getRenameThreadName("executeTask")));
    }

    public static Executor getAsyncTaskThreadPool() {
        return ASYNC_TASK_THREAD_POOL_EXECUTOR;
    }

    public static ExecutorService getHttpThreadPool() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (ThreadPoolManager.class) {
            try {
                if (HTTP_THREAD_POOL_EXECUTOR == null) {
                    HTTP_THREAD_POOL_EXECUTOR = new ThreadPoolMonitor(Math.max(SharePrefsManager.getSettingInt(MiJiaEnvironment.getAppContext(), SharePrefsManager.SP_THREADPOOL_AB_CONFIG, SharePrefsManager.SP_THREADPOOL_COREPOOLSIZE, 10), 10), Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(256), Executors.defaultThreadFactory(), "OkHttp Dispatcher-thread-pool", new StatisticalRejectedExecutionPolicy());
                }
                threadPoolExecutor = HTTP_THREAD_POOL_EXECUTOR;
            } catch (Throwable th) {
                throw th;
            }
        }
        return threadPoolExecutor;
    }

    private static String getRenameThreadName(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTrace.length; i++) {
            if (stackTrace[i].getClassName().contains("com.xiaomi.smarthome") && !str.equalsIgnoreCase(stackTrace[i].getMethodName()) && !"getRenameThreadName".equalsIgnoreCase(stackTrace[i].getMethodName())) {
                return stackTrace[i].getClassName() + "." + stackTrace[i].getMethodName();
            }
        }
        return "";
    }

    public static Future<?> submitTask(Runnable runnable) {
        return DEFAULT_THREAD_POOL_EXECUTOR.submit(new RenameThreadNameRunnable(runnable, getRenameThreadName("submitTask")));
    }
}
