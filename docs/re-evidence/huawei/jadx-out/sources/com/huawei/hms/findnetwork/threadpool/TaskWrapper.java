package com.huawei.hms.findnetwork.threadpool;

import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class TaskWrapper implements Runnable {
    private static final String TAG = "TaskWrapper";
    private String mModuleName;
    private Runnable mRunnable;

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.mRunnable;
        if (runnable == null) {
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            HmsFindSDKLog.e(TAG, "run exception = " + th.getMessage());
        }
    }

    public TaskWrapper(String str, Runnable runnable) {
        this.mRunnable = runnable;
        this.mModuleName = str;
    }
}
