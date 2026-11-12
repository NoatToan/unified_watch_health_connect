package com.xiaomi.smarthome.core.server.internal.network;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.example.statistics.export.OneTrackConstant;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class NetworkUtil {
    public static boolean isAppOnForeground(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
        if (runningTasks.size() == 0 || runningTasks.get(0) == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(context.getPackageName())) {
                try {
                    if (((Integer) ActivityManager.RunningAppProcessInfo.class.getField("processState").get(runningAppProcessInfo)).intValue() == 6) {
                        return true;
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (NoSuchFieldException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return false;
    }

    public static boolean isNetActiveAndAvailable(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
        } catch (Exception unused) {
            return false;
        }
    }
}
