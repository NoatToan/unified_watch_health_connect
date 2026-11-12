package com.xiaomi.smarthome.core.server.internal.util;

import android.app.ActivityManager;
import android.content.Context;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ProcUtil {
    public static final String ACTION_PROCESS_DEAD = "action.coremanager.process_dead";
    public static final String KEY_PROCESS_NAME = "process_name";
    public static final String PROCESS_SUFFIX_CAMERA = ":camera";
    public static final String PROCESS_SUFFIX_CORE = ":core";
    public static final String PROCESS_SUFFIX_FRAME_1 = ":frame1";
    public static final String PROCESS_SUFFIX_FRAME_2 = ":frame2";
    public static final String PROCESS_SUFFIX_PLUGIN_0 = ":plugin0";
    public static final String PROCESS_SUFFIX_PLUGIN_1 = ":plugin1";
    public static final String PROCESS_SUFFIX_PLUGIN_2 = ":plugin2";
    public static final String PROCESS_SUFFIX_PLUGIN_3 = ":plugin3";

    public static String getSmartHomeMainProcessName(Context context) {
        return context.getPackageName();
    }

    public static String getSmartHomePluginProcessName(Context context) {
        return context.getPackageName() + ":plugin";
    }

    public static boolean isMainProcess(Context context, int i) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)).getRunningAppProcesses();
        String smartHomeMainProcessName = getSmartHomeMainProcessName(context);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == i && smartHomeMainProcessName.equals(runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMainProcessOnForeground(Context context) {
        int i;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(getSmartHomeMainProcessName(context)) && ((i = runningAppProcessInfo.importance) == 100 || i == 200)) {
                return true;
            }
        }
        return false;
    }
}
