package com.xiaomi.smarthome.framework.plugin.rn.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RnPluginLog {
    private static boolean IS_OPEN_RN_DEBUG = false;
    private static final String LOG_TAG = "miot-rn-plugin";
    private static final int MAX_LOG_SIZE = 2000;
    private static String ProcessName = "";

    public static void addFrameworkLog(String str, String str2) {
        addFrameworkLog(str, 3, str2);
    }

    public static void addPluginLog(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, str2, str, "ProcessName:" + ProcessName + ":  " + str3);
    }

    public static void d(String str) {
        d(LOG_TAG, str);
    }

    public static void e(String str) {
        e(LOG_TAG, str);
    }

    public static void i(String str) {
        i(LOG_TAG, str);
    }

    public static void initProcessName(String str) {
        ProcessName = str;
    }

    public static void initShowLog(boolean z) {
        IS_OPEN_RN_DEBUG = z;
    }

    private static boolean showShowLog() {
        return IS_OPEN_RN_DEBUG || MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isDevChannel() || MiJiaEnvironment.isSdkBuildType();
    }

    public static void v(String str) {
        v(LOG_TAG, str);
    }

    public static void w(String str) {
        w(LOG_TAG, str);
    }

    public static void wirtePluginProcessLog(Context context) {
        if (showShowLog() && context != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)).getRunningAppProcesses();
            StringBuilder sb = new StringBuilder();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    sb.append("  进程名： ");
                    sb.append(runningAppProcessInfo.processName);
                }
            }
            MiJiaLog.writeLogOnAll(LogType.PLUGIN, "RnPlugin", "RnPluginLog", sb.toString());
        }
    }

    public static void writeAppLog(String str) {
        if (!showShowLog() || TextUtils.isEmpty(str) || MiJiaEnvironment.getAppContext() == null) {
            return;
        }
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "RnApp", "RnPluginLog", str);
    }

    public static void writePluginLog(String str) {
        if (!showShowLog() || TextUtils.isEmpty(str) || MiJiaEnvironment.getAppContext() == null) {
            return;
        }
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "RnPlugin", "RnPluginLog", str);
    }

    public static void addFrameworkLog(String str, int i, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "rn-plugin-framework", i, str, "ProcessName:" + ProcessName + ",ThreadId:" + Thread.currentThread().getId() + ",:  " + str2);
    }

    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        TextUtils.isEmpty(str);
        if (showShowLog()) {
            int length = str2.length() / 2000;
            int i = 0;
            while (i <= length) {
                int i2 = i * 2000;
                i++;
                int length2 = i * 2000;
                if (length2 > str2.length()) {
                    length2 = str2.length();
                }
                if (i2 >= length2) {
                    i2 = length2 - 1;
                }
                str2.substring(i2, length2);
            }
        }
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        TextUtils.isEmpty(str);
        if (showShowLog()) {
            int length = str2.length() / 2000;
            int i = 0;
            while (i <= length) {
                int i2 = i * 2000;
                i++;
                int length2 = i * 2000;
                if (length2 > str2.length()) {
                    length2 = str2.length();
                }
                if (i2 >= length2) {
                    i2 = length2 - 1;
                }
                str2.substring(i2, length2);
            }
        }
    }

    public static void i(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        TextUtils.isEmpty(str);
        if (showShowLog()) {
            int length = str2.length() / 2000;
            int i = 0;
            while (i <= length) {
                int i2 = i * 2000;
                i++;
                int length2 = i * 2000;
                if (length2 > str2.length()) {
                    length2 = str2.length();
                }
                if (i2 >= length2) {
                    i2 = length2 - 1;
                }
                str2.substring(i2, length2);
            }
        }
    }

    public static void v(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        TextUtils.isEmpty(str);
        if (showShowLog()) {
            int length = str2.length() / 2000;
            int i = 0;
            while (i <= length) {
                int i2 = i * 2000;
                i++;
                int length2 = i * 2000;
                if (length2 > str2.length()) {
                    length2 = str2.length();
                }
                if (i2 >= length2) {
                    i2 = length2 - 1;
                }
                str2.substring(i2, length2);
            }
        }
    }

    public static void w(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        TextUtils.isEmpty(str);
        if (showShowLog()) {
            int length = str2.length() / 2000;
            int i = 0;
            while (i <= length) {
                int i2 = i * 2000;
                i++;
                int length2 = i * 2000;
                if (length2 > str2.length()) {
                    length2 = str2.length();
                }
                if (i2 >= length2) {
                    i2 = length2 - 1;
                }
                str2.substring(i2, length2);
            }
        }
    }

    public static void addFrameworkLog(String str) {
        addFrameworkLog(LOG_TAG, str);
    }
}
