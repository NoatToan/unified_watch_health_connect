package com.xiaomi.smarthome.frame.process;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.smarthome.core.server.internal.util.ProcUtil;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ProcessUtil {
    private static final String TAG = "ProcessUtil";
    public static final String WIDGET_CONTROL_PROCESS_NAME = ":widgetControl";
    public static String sProcessName = "";

    public static String getCurrentProcessName(Context context) {
        initProcessName(context);
        return sProcessName;
    }

    private static String getProcessName(int i) throws Throwable {
        String str = "/proc/" + i + "/cmdline";
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(str), StandardCharsets.ISO_8859_1));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        int i2 = bufferedReader2.read();
                        if (i2 <= 0) {
                            break;
                        }
                        sb.append((char) i2);
                    }
                    String string = sb.toString();
                    try {
                        bufferedReader2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return string;
                } catch (Exception unused) {
                    bufferedReader = bufferedReader2;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("cannot read ");
                    sb2.append(str);
                    if (bufferedReader == null) {
                        return "";
                    }
                    try {
                        bufferedReader.close();
                        return "";
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return "";
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String getProcessNameById(Context context, int i) throws Throwable {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return "";
        }
        String processName = getProcessName(i);
        StringBuilder sb = new StringBuilder();
        sb.append("getProcessName /prop:");
        sb.append(processName);
        if (TextUtils.isEmpty(processName) && (runningAppProcesses = ((ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)).getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == i) {
                    processName = runningAppProcessInfo.processName;
                    break;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getProcessName getRunningAppProcesses:");
        sb2.append(processName);
        return processName;
    }

    public static void initProcessName(Context context) {
        if (context != null && TextUtils.isEmpty(sProcessName)) {
            if (Build.VERSION.SDK_INT >= 28) {
                sProcessName = Application.getProcessName();
            }
            if (TextUtils.isEmpty(sProcessName)) {
                sProcessName = getProcessNameById(context, Process.myPid());
            }
            if (sProcessName == null) {
                sProcessName = "";
            }
        }
    }

    public static boolean isCameraProcess(Context context) {
        initProcessName(context);
        return sProcessName.endsWith(ProcUtil.PROCESS_SUFFIX_CAMERA);
    }

    public static boolean isCoreProcess(Context context) {
        initProcessName(context);
        return sProcessName.endsWith(ProcUtil.PROCESS_SUFFIX_CORE);
    }

    public static boolean isForegroundGroup(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (!runningAppProcessInfo.processName.equals(context.getPackageName())) {
                if (!runningAppProcessInfo.processName.startsWith(context.getPackageName() + ":")) {
                    continue;
                }
            }
            int i = runningAppProcessInfo.importance;
            if (i == 100 || i == 200) {
                return true;
            }
        }
        return false;
    }

    public static boolean isIsolateProcess(Context context) {
        initProcessName(context);
        return sProcessName.startsWith(context.getPackageName() + WIDGET_CONTROL_PROCESS_NAME);
    }

    public static boolean isMainProcess(Context context) {
        initProcessName(context);
        return sProcessName.equalsIgnoreCase(context.getPackageName());
    }

    public static boolean isPluginProcess(Context context) {
        initProcessName(context);
        return sProcessName.endsWith(ProcUtil.PROCESS_SUFFIX_PLUGIN_0) || sProcessName.endsWith(ProcUtil.PROCESS_SUFFIX_PLUGIN_1) || sProcessName.endsWith(ProcUtil.PROCESS_SUFFIX_PLUGIN_2) || sProcessName.endsWith(ProcUtil.PROCESS_SUFFIX_PLUGIN_3) || sProcessName.endsWith(ProcUtil.PROCESS_SUFFIX_CAMERA);
    }

    public static boolean isSmartHomeMainProcess(Context context) {
        initProcessName(context);
        return TextUtils.equals(ProcUtil.getSmartHomeMainProcessName(context), sProcessName);
    }

    public static boolean isSmartHomePluginProcess(Context context) {
        initProcessName(context);
        return sProcessName.startsWith(ProcUtil.getSmartHomePluginProcessName(context));
    }
}
