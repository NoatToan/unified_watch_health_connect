package com.ximalaya.ting.android.opensdk.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.ximalaya.ting.android.opensdk.constants.ConstantsOpenSdk;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes22.dex */
public class BaseUtil {
    public static String curProcessName;
    public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];
    public static final Class<?>[] EMPTY_CLASS_ARRAY = new Class[0];

    public static String getCurProcessName(Context context) {
        if (context == null) {
            return "";
        }
        if (!TextUtils.isEmpty(curProcessName)) {
            return curProcessName;
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = null;
        try {
            runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    curProcessName = runningAppProcessInfo.processName;
                    break;
                }
            }
        }
        if (TextUtils.isEmpty(curProcessName)) {
            curProcessName = getProcessName();
        }
        if (TextUtils.isEmpty(curProcessName)) {
            curProcessName = context.getPackageName();
        }
        return curProcessName;
    }

    private static String getProcessName() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            String strTrim = bufferedReader.readLine().trim();
            bufferedReader.close();
            return strTrim;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String[] getYDTDayNum() {
        String[] strArr = new String[3];
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy:MM:dd");
        int i = -1;
        for (int i2 = 0; i2 < 3; i2++) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, i);
            strArr[i2] = simpleDateFormat.format(calendar.getTime());
            i++;
        }
        return strArr;
    }

    public static boolean isActivityAlive(Context context, String str) {
        if (context == null) {
            return false;
        }
        for (ActivityManager.RunningTaskInfo runningTaskInfo : ((ActivityManager) context.getSystemService("activity")).getRunningTasks(100)) {
            if (runningTaskInfo.topActivity.toString().equals(str) || runningTaskInfo.baseActivity.toString().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAppOnForeground(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
        String packageName = context.getApplicationContext().getPackageName();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static int isInTime(String str) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str) || !str.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER) || !str.contains(":")) {
            if (!ConstantsOpenSdk.isDebug) {
                return -2;
            }
            throw new IllegalArgumentException("Illegal Argument arg:" + str);
        }
        String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        boolean z = strArrSplit[0].split(":").length == 2;
        boolean z2 = strArrSplit[0].split(":").length == 3;
        boolean z3 = strArrSplit[0].split(":").length == 5;
        SimpleDateFormat simpleDateFormat = null;
        if (z2) {
            simpleDateFormat = new SimpleDateFormat("dd:HH:mm", Locale.getDefault());
        } else if (z3) {
            simpleDateFormat = new SimpleDateFormat("yy:MM:dd:HH:mm", Locale.getDefault());
        } else if (z) {
            simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        }
        if (simpleDateFormat == null) {
            return -2;
        }
        try {
            long time = simpleDateFormat.parse(simpleDateFormat.format(new Date(System.currentTimeMillis()))).getTime();
            long time2 = simpleDateFormat.parse(strArrSplit[0]).getTime();
            if (strArrSplit[1].contains("00:00") && z2) {
                strArrSplit[1] = strArrSplit[1].split(":")[0] + ":23:59";
            } else if (strArrSplit[1].contains("00:00") && z3) {
                strArrSplit[1] = strArrSplit[1].split(":")[0] + ":" + strArrSplit[1].split(":")[1] + ":" + strArrSplit[1].split(":")[2] + ":23:59";
            } else if (strArrSplit[1].contains("00:00") && z) {
                strArrSplit[1] = "23:59";
            }
            long time3 = simpleDateFormat.parse(strArrSplit[1]).getTime();
            if (time >= time3) {
                return -1;
            }
            return (time < time2 || time >= time3) ? 1 : 0;
        } catch (ParseException e) {
            e.printStackTrace();
            if (!ConstantsOpenSdk.isDebug) {
                return -2;
            }
            throw new IllegalArgumentException("Illegal Argument arg:" + str);
        }
    }

    public static boolean isMainProcess(Context context) {
        String curProcessName2 = getCurProcessName(context);
        return !TextUtils.isEmpty(curProcessName2) && curProcessName2.equals(context.getPackageName());
    }

    public static boolean isNight() {
        int iIntValue = Integer.valueOf(new SimpleDateFormat("HH", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())).trim()).intValue();
        if (iIntValue == 22 || iIntValue == 23) {
            return true;
        }
        return iIntValue >= 0 && iIntValue < 6;
    }

    public static boolean isPlayerProcess(Context context) {
        String curProcessName2 = getCurProcessName(context);
        return !TextUtils.isEmpty(curProcessName2) && curProcessName2.contains(":player");
    }

    public static boolean isProcessInRecentTasks(Context context, String str) {
        ActivityManager activityManager;
        Intent intent;
        if (context == null || str == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
            if (appTasks != null && !appTasks.isEmpty()) {
                for (ActivityManager.AppTask appTask : appTasks) {
                    Logger.log("process RecentTaskInfo processName0:" + appTask.getTaskInfo().baseIntent.getComponent().getPackageName());
                    ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                    if (taskInfo != null && (intent = taskInfo.baseIntent) != null && intent.getComponent() != null && str.equals(taskInfo.baseIntent.getComponent().getPackageName())) {
                        return true;
                    }
                }
            }
            return false;
        }
        List<ActivityManager.RecentTaskInfo> recentTasks = activityManager.getRecentTasks(100, 2);
        if (recentTasks != null && !recentTasks.isEmpty()) {
            for (int i = 0; i < recentTasks.size(); i++) {
                ActivityManager.RecentTaskInfo recentTaskInfo = recentTasks.get(i);
                Logger.log("process RecentTaskInfo processName1:" + recentTaskInfo.baseIntent.getComponent().getPackageName());
                Intent intent2 = recentTaskInfo.baseIntent;
                if (intent2 != null && intent2.getComponent() != null && str.equals(recentTaskInfo.baseIntent.getComponent().getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isProcessRunning(Context context, String str) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        } catch (Exception e) {
            e.printStackTrace();
            runningAppProcesses = null;
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
        return false;
    }

    public static Class<?>[] nullToEmpty(Class<?>[] clsArr) {
        return (clsArr == null || clsArr.length == 0) ? EMPTY_CLASS_ARRAY : clsArr;
    }

    public static String printTrack() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return "无堆栈...";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" <- ");
                stringBuffer.append(System.getProperty("line.separator"));
            }
            stringBuffer.append(MessageFormat.format("{0}.{1}() {2}", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())));
        }
        return stringBuffer.toString();
    }

    public static Object[] nullToEmpty(Object[] objArr) {
        return (objArr == null || objArr.length == 0) ? EMPTY_OBJECT_ARRAY : objArr;
    }
}
