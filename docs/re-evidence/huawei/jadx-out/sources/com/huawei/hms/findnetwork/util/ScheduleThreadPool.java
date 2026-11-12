package com.huawei.hms.findnetwork.util;

import com.huawei.hms.findnetwork.threadpool.NameThreadFactory;
import com.huawei.hms.findnetwork.threadpool.TaskWrapper;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes33.dex */
public class ScheduleThreadPool extends ScheduledThreadPoolExecutor {
    private static final int CORE_POOL_SIZE = 0;
    private static final int DEFAULT_KEEPALIVE_MILLIS = 60;
    private static final int SCHEDULED_MAX_POOL_SIZE = 20;
    private static final String TAG = "ScheduleThreadPool";
    private static volatile ScheduleThreadPool sInstance;

    public ScheduledFuture<?> scheduleTaskWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (runnable == null) {
            HmsFindSDKLog.w(TAG, "task is null.");
            return null;
        }
        if (timeUnit == null) {
            HmsFindSDKLog.w(TAG, "unit is null.");
            return null;
        }
        if (j2 <= 0) {
            HmsFindSDKLog.w(TAG, "delay is illegal");
            return null;
        }
        try {
            return sInstance.scheduleWithFixedDelay(new TaskWrapper(TAG, runnable), j, j2, timeUnit);
        } catch (Exception e) {
            HmsFindSDKLog.d(TAG, "schedule task failed, " + e.getMessage());
            return null;
        }
    }

    public ScheduledFuture<?> scheduleTaskAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (runnable == null) {
            HmsFindSDKLog.w(TAG, "task is null.");
            return null;
        }
        if (timeUnit == null) {
            HmsFindSDKLog.w(TAG, "unit is null.");
            return null;
        }
        if (j2 <= 0) {
            HmsFindSDKLog.w(TAG, "delay is illegal");
            return null;
        }
        try {
            return sInstance.scheduleAtFixedRate(new TaskWrapper(TAG, runnable), j, j2, timeUnit);
        } catch (Exception e) {
            HmsFindSDKLog.d(TAG, "schedule task failed, " + e.getMessage());
            return null;
        }
    }

    public ScheduledFuture<?> scheduleTask(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            HmsFindSDKLog.w(TAG, "task is null.");
            return null;
        }
        if (timeUnit == null) {
            HmsFindSDKLog.w(TAG, "unit is null.");
            return null;
        }
        try {
            return sInstance.schedule(new TaskWrapper(TAG, runnable), j, timeUnit);
        } catch (Exception e) {
            HmsFindSDKLog.d(TAG, "schedule task failed, " + e.getMessage());
            return null;
        }
    }

    public static ScheduleThreadPool getInstance() {
        if (sInstance == null) {
            synchronized (ScheduleThreadPool.class) {
                if (sInstance == null) {
                    sInstance = new ScheduleThreadPool();
                }
            }
        }
        return sInstance;
    }

    private ScheduleThreadPool() {
        super(0);
        setMaximumPoolSize(20);
        setKeepAliveTime(60L, TimeUnit.SECONDS);
        setThreadFactory(new NameThreadFactory("Nearby-nStackX-Timer"));
    }
}
