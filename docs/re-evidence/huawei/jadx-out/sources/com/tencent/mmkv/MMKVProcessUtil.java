package com.tencent.mmkv;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class MMKVProcessUtil {
    private static String currentProcessName = "";

    MMKVProcessUtil() {
    }

    public static String getCurrentProcessName(Context context) {
        if (!TextUtils.isEmpty(currentProcessName)) {
            return currentProcessName;
        }
        String currentProcessNameByApplication = getCurrentProcessNameByApplication();
        currentProcessName = currentProcessNameByApplication;
        if (!TextUtils.isEmpty(currentProcessNameByApplication)) {
            return currentProcessName;
        }
        String currentProcessNameByActivityThread = getCurrentProcessNameByActivityThread();
        currentProcessName = currentProcessNameByActivityThread;
        if (!TextUtils.isEmpty(currentProcessNameByActivityThread)) {
            return currentProcessName;
        }
        String currentProcessNameByActivityManager = getCurrentProcessNameByActivityManager(context);
        currentProcessName = currentProcessNameByActivityManager;
        return currentProcessNameByActivityManager;
    }

    private static String getCurrentProcessNameByApplication() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        return "";
    }

    private static String getCurrentProcessNameByActivityThread() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    private static String getCurrentProcessNameByActivityManager(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        }
        return "";
    }
}
