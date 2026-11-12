package com.xiaomi.smarthome.library.securecompact;

import android.app.ActivityManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RunningAppProcessesCompact {
    private static List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = new ArrayList();

    private static String getCacheTimeKey() {
        return "running.app.process.time.key";
    }

    public static synchronized List<ActivityManager.RunningAppProcessInfo> getRunningAppProcesses(ActivityManager activityManager) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("getRunningAppProcesses:");
            sb.append(FrequencySecureLimitHelper.canInvoke(getCacheTimeKey()));
            if (FrequencySecureLimitHelper.canInvoke(getCacheTimeKey())) {
                runningAppProcesses = activityManager.getRunningAppProcesses();
                FrequencySecureLimitHelper.cacheInvokeTime(getCacheTimeKey());
            }
        } catch (Throwable th) {
            throw th;
        }
        return runningAppProcesses;
    }
}
