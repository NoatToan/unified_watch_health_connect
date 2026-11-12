package com.xiaomi.hm.health.baseutil;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.le;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Deprecated;

/* JADX INFO: loaded from: classes11.dex */
public class GlobalUtil {
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    private static final String FLAVOR_INTERNAL = "internal";
    private static final String FLAVOR_MIDONG = "midong";
    private static final String FLAVOR_NORMAL = "Normal";
    private static final String FLAVOR_PLAY = "play";
    private static final String TAG = "GlobalUtil";
    private static String flavorChannel;
    private static String flavorProduction;
    private static boolean isDebug;
    private static Gson mGson;

    public static void bringActivityToFront(Context context, Class<?> cls) {
        if (context == null || cls == null) {
            le.c("IllegalArgumentException", "PackageUtils bringActivityToFront", new Object[0]);
            throw new IllegalArgumentException();
        }
        try {
            Intent intent = new Intent(new Intent(context, cls));
            intent.addFlags(268566528);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Deprecated(message = "")
    public static Gson gson() {
        if (mGson == null) {
            mGson = new GsonBuilder().create();
        }
        return mGson;
    }

    public static boolean hasLockDisplayPermission(Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = appOpsManager.getClass();
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod(CHECK_OP_NO_THROW, cls2, cls2, String.class).invoke(appOpsManager, 10020, Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public static void init(String str, String str2, boolean z) {
        flavorProduction = str;
        flavorChannel = str2;
        isDebug = z;
    }

    public static boolean isDebug() {
        return isDebug;
    }

    public static boolean isInnerFlavor() {
        return FLAVOR_INTERNAL.equals(flavorChannel);
    }

    public static boolean isMidong() {
        return FLAVOR_MIDONG.equals(flavorProduction);
    }

    public static boolean isNormalFlavor() {
        return FLAVOR_NORMAL.equals(flavorChannel);
    }

    public static boolean isPlayFlavor() {
        return "play".equals(flavorChannel);
    }

    @Deprecated(message = "隐私相关api请参照文档使用：https://huami.feishu.cn/wiki/wikcnvEShjYKVlnnrgZ8SYgKuSd#")
    public static boolean isRunningForeground(Context context, String... strArr) {
        String packageName = (strArr == null || strArr.length != 1) ? context.getPackageName() : strArr[0];
        ActivityManager activityManager = (ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        le.c(TAG, "app thread:" + Thread.currentThread().getName(), new Object[0]);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(packageName)) {
                    le.c(TAG, "BringToFront>> Importance:" + runningAppProcessInfo.importance, new Object[0]);
                    int i = runningAppProcessInfo.importance;
                    if (i == 100 || i == 325) {
                        le.c(TAG, "BringToFront>> Foreground App:" + runningAppProcessInfo.processName, new Object[0]);
                        return true;
                    }
                    le.c(TAG, "BringToFront>> Background App:" + runningAppProcessInfo.processName, new Object[0]);
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
