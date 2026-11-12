package com.huawei.hianalytics.framework.threadpool;

import android.os.HandlerThread;
import android.os.Looper;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.framework.b0;
import com.huawei.hianalytics.framework.c0;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class TaskThread {
    private static final int KEEP_ALIVE_TIME = 10000;
    private static final int KEEP_UPDATE_ALIVE_TIME = 60000;
    private static final int MAX_TASK_SIZE = 5000;
    private static final String TAG = "TaskThread";
    private static HandlerThread worker;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f11528a;
    private static final TaskThread RECORD_THREAD = new TaskThread(5, "OnEvent", 10000);
    private static final TaskThread REPORT_THREAD = new TaskThread(1, "OnReport", 10000);
    private static final TaskThread UPDATE_THREAD = new TaskThread(1, "Update", 60000);

    public TaskThread(int i, String str, int i2) {
        this.f11528a = new ThreadPoolExecutor(0, i, i2, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(5000), new c0(str));
    }

    public static TaskThread getRecordThread() {
        return RECORD_THREAD;
    }

    public static TaskThread getReportThread() {
        return REPORT_THREAD;
    }

    public static TaskThread getUpdateThread() {
        return UPDATE_THREAD;
    }

    public static Looper getWorkLooper() {
        if (worker == null) {
            synchronized (TaskThread.class) {
                if (worker == null) {
                    HandlerThread handlerThread = new HandlerThread("HASDK-OnEvent-31");
                    worker = handlerThread;
                    handlerThread.start();
                }
            }
        }
        HandlerThread handlerThread2 = worker;
        return handlerThread2 != null ? handlerThread2.getLooper() : Looper.getMainLooper();
    }

    public void addToQueue(Runnable runnable) {
        try {
            this.f11528a.execute(new b0(runnable));
        } catch (RejectedExecutionException unused) {
            HiLog.w(TAG, "exception has happened from rejected execution");
        }
    }
}
