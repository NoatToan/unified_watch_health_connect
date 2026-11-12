package com.ximalaya.ting.android.opensdk.httputil.httpswitch;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ProcessUtil {
    private static final String TAG = "ProcessUtil";
    private static String processName;

    public static String getProcessName(Context context) throws Throwable {
        if (!TextUtils.isEmpty(processName)) {
            return processName;
        }
        String processNameInternal = getProcessNameInternal(context);
        processName = processNameInternal;
        return processNameInternal;
    }

    public static String getProcessNameInternal(Context context) throws Throwable {
        ActivityManager.RunningAppProcessInfo next;
        int i;
        int iMyPid = Process.myPid();
        if (context == null || iMyPid <= 0) {
            return "";
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        FileInputStream fileInputStream = null;
        if (activityManager != null) {
            try {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it2 = runningAppProcesses.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (next.pid != iMyPid);
                    if (next != null) {
                        return next.processName;
                    }
                }
            } catch (Exception e) {
                Log.e(TAG, "getProcessNameInternal exception:" + e.getMessage());
            }
        }
        byte[] bArr = new byte[128];
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream("/proc/" + iMyPid + "/cmdline");
                    try {
                        int i2 = fileInputStream2.read(bArr);
                        if (i2 > 0) {
                            while (i < i2) {
                                i = ((bArr[i] & 255) <= 128 && bArr[i] > 0) ? i + 1 : 0;
                                i2 = i;
                                break;
                            }
                            String str = new String(bArr, 0, i2);
                            try {
                                fileInputStream2.close();
                            } catch (Exception unused) {
                            }
                            return str;
                        }
                        fileInputStream2.close();
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = fileInputStream2;
                        Log.e(TAG, "getProcessNameInternal exception:" + e.getMessage());
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                return "";
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused3) {
        }
    }

    public static boolean isAppForeground(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context != null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMainProcess(Context context) throws Throwable {
        if (context == null) {
            return false;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = applicationInfo != null ? applicationInfo.processName : null;
        if (TextUtils.isEmpty(packageName)) {
            packageName = context.getPackageName();
        }
        String processName2 = getProcessName(context);
        if (TextUtils.isEmpty(packageName)) {
            processName2 = "";
        }
        return packageName.equals(processName2);
    }

    public static boolean isProcessRunning(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = null;
            try {
                runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (runningAppProcesses == null) {
                return false;
            }
            Iterator<ActivityManager.RunningAppProcessInfo> it2 = runningAppProcesses.iterator();
            while (it2.hasNext()) {
                if (it2.next().processName.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void killAllOtherProcess(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.uid == Process.myUid() && runningAppProcessInfo.pid != Process.myPid()) {
                Process.killProcess(runningAppProcessInfo.pid);
            }
        }
    }
}
