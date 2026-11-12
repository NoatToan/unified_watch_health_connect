package com.huawei.hms.adapter.sysobs;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.log.HMSLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ApkResolutionFailedManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ApkResolutionFailedManager f12720c = new ApkResolutionFailedManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f12721a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Runnable> f12722b = new HashMap(2);

    private ApkResolutionFailedManager() {
    }

    public static ApkResolutionFailedManager getInstance() {
        return f12720c;
    }

    public void postTask(String str, Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.e("ApkResolutionFailedManager", "postTask is not in main thread");
        } else {
            this.f12722b.put(str, runnable);
            this.f12721a.postDelayed(runnable, 2000L);
        }
    }

    public void removeTask(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.e("ApkResolutionFailedManager", "removeTask is not in main thread");
            return;
        }
        Runnable runnableRemove = this.f12722b.remove(str);
        if (runnableRemove == null) {
            HMSLog.e("ApkResolutionFailedManager", "cancel runnable is null");
        } else {
            this.f12721a.removeCallbacks(runnableRemove);
        }
    }

    public void removeValueOnly(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.e("ApkResolutionFailedManager", "removeValueOnly is not in main thread");
        } else {
            this.f12722b.remove(str);
        }
    }
}
