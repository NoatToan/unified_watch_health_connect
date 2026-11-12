package com.xiaomi.hm.health.baseutil;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huami.tools.log.HMLog;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Deprecated;

/* JADX INFO: loaded from: classes19.dex */
public class GlobalUtil {
    private static final String a = "GlobalUtil";
    private static final String b = "play";
    private static final String c = "Normal";
    private static final String d = "internal";
    private static final String e = "midong";
    private static String f = null;
    private static String g = null;
    private static boolean h = false;
    private static Gson i = null;
    private static final String j = "checkOpNoThrow";

    public static void bringActivityToFront(Context context, Class<?> cls) {
        if (context == null || cls == null) {
            HMLog.i("IllegalArgumentException", "PackageUtils bringActivityToFront", new Object[0]);
            throw new IllegalArgumentException();
        }
        try {
            Intent intent = new Intent(new Intent(context, cls));
            intent.addFlags(268566528);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    @Deprecated(message = "")
    public static Gson gson() {
        if (i == null) {
            i = new GsonBuilder().create();
        }
        return i;
    }

    public static boolean hasLockDisplayPermission(Context context) {
        int i2;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i3 = applicationInfo.uid;
        try {
            Class<?> cls = appOpsManager.getClass();
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod(j, cls2, cls2, String.class);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 23) {
                i2 = 10020;
            } else {
                i2 = i4 > 19 ? 66 : 63;
            }
            return ((Integer) method.invoke(appOpsManager, Integer.valueOf(i2), Integer.valueOf(i3), packageName)).intValue() == 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    public static void init(String str, String str2, boolean z) {
        f = str;
        g = str2;
        h = z;
    }

    public static boolean isDebug() {
        return h;
    }

    public static boolean isInnerFlavor() {
        return d.equals(g);
    }

    public static boolean isMidong() {
        return "midong".equals(f);
    }

    public static boolean isNormalFlavor() {
        return "Normal".equals(g);
    }

    public static boolean isPlayFlavor() {
        return "play".equals(g);
    }

    @Deprecated(message = "隐私相关api请参照文档使用：https://huami.feishu.cn/wiki/wikcnvEShjYKVlnnrgZ8SYgKuSd#")
    public static boolean isRunningForeground(Context context, String... strArr) {
        String packageName = (strArr == null || strArr.length != 1) ? context.getPackageName() : strArr[0];
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        HMLog.i(a, "app thread:" + Thread.currentThread().getName(), new Object[0]);
        if (Build.VERSION.SDK_INT < 21) {
            List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
            HMLog.i(a, "BringToFront>> old check Foreground", new Object[0]);
            if (runningTasks == null || runningTasks.size() <= 0) {
                return false;
            }
            ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(0);
            boolean zEqualsIgnoreCase = runningTaskInfo != null ? packageName.equalsIgnoreCase(runningTaskInfo.topActivity.getPackageName()) : false;
            HMLog.i(a, "BringToFront>> old Foreground App:" + zEqualsIgnoreCase, new Object[0]);
            return zEqualsIgnoreCase;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(packageName)) {
                    HMLog.i(a, "BringToFront>> Importance:" + runningAppProcessInfo.importance, new Object[0]);
                    int i2 = runningAppProcessInfo.importance;
                    if (i2 == 100 || i2 == 325) {
                        HMLog.i(a, "BringToFront>> Foreground App:" + runningAppProcessInfo.processName, new Object[0]);
                        return true;
                    }
                    HMLog.i(a, "BringToFront>> Background App:" + runningAppProcessInfo.processName, new Object[0]);
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean isValidUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^(http|https)\\://([a-zA-Z0-9\\.\\-]+(\\:[a-zA-Z0-9\\.&%\\$\\-]+)*@)?((25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[0-9])|([a-zA-Z0-9\\-]+\\.)*[a-zA-Z0-9\\-]+\\.[a-zA-Z]{2,4})(\\:[0-9]+)?(/[^/][a-zA-Z0-9\\.\\,\\?\\'\\\\/\\+&%\\$\\=~_\\-@]*)*$").matcher(str).matches();
    }

    public static void init(String str, boolean z) {
        init("", str, z);
    }
}
