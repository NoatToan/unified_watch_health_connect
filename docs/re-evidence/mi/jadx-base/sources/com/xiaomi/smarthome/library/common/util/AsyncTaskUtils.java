package com.xiaomi.smarthome.library.common.util;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import com.xiaomi.smarthome.library.common.threadpool.ThreadPoolManager;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public abstract class AsyncTaskUtils {
    public static <Params, Progress, Result> void exe(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        asyncTask.executeOnExecutor(ThreadPoolManager.getAsyncTaskThreadPool(), paramsArr);
    }
}
