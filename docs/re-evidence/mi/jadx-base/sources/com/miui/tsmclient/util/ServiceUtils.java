package com.miui.tsmclient.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ServiceUtils {
    public static final String EXTRA_PROCESS = "process";
    private static final String KEY_START_FOREGROUND_SERVICE_FLAG = "key_start_foreground_service";

    private ServiceUtils() {
    }

    private static boolean isAppRunInBackground(Context context, Intent intent) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return true;
        }
        String stringExtra = intent.getStringExtra(EXTRA_PROCESS);
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = TextUtils.isEmpty(intent.getPackage()) ? context.getPackageName() : intent.getPackage();
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (TextUtils.equals(runningAppProcessInfo.processName, stringExtra) && runningAppProcessInfo.importance == 100) {
                return false;
            }
        }
        return true;
    }

    public static boolean isStartByForeground(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra(KEY_START_FOREGROUND_SERVICE_FLAG, false);
    }

    private static boolean needStartInForeground(Context context, Intent intent) {
        return isAppRunInBackground(context, intent);
    }

    public static void startService(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            if (needStartInForeground(context, intent)) {
                LogUtils.d("start foreground service, " + intent);
                intent.putExtra(KEY_START_FOREGROUND_SERVICE_FLAG, true);
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        } catch (Exception e) {
            LogUtils.e("startService failed", e);
        }
    }
}
