package com.huawei.hms.findnetwork.comm.exception;

import com.huawei.hms.findnetwork.comm.log.HmsFindCommonLog;

/* JADX INFO: loaded from: classes33.dex */
public class FindExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final String TAG = "FindExceptionHandler";
    private String mModuleName;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        HmsFindCommonLog.w(TAG, "mModuleName:" + this.mModuleName + "Thread:" + thread.getName() + " UncaughtException: " + th.getMessage());
    }

    public FindExceptionHandler(String str) {
        this.mModuleName = str;
    }
}
