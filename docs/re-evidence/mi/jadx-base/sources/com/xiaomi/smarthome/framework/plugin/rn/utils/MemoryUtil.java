package com.xiaomi.smarthome.framework.plugin.rn.utils;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.smarthome.library.MiJiaEnvironment;

/* JADX INFO: loaded from: classes2.dex */
public class MemoryUtil {
    public static Debug.MemoryInfo getDebugMemoryInfo() {
        Debug.MemoryInfo memoryInfo;
        ActivityManager activityManager = (ActivityManager) MiJiaEnvironment.getAppContext().getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        try {
            if (Build.VERSION.SDK_INT > 28) {
                memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
            } else {
                memoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0];
                if (memoryInfo == null) {
                    return null;
                }
            }
            return memoryInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ActivityManager.MemoryInfo getPhoneMemoryInfo() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) MiJiaEnvironment.getAppContext().getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)).getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Exception unused) {
            return null;
        }
    }
}
