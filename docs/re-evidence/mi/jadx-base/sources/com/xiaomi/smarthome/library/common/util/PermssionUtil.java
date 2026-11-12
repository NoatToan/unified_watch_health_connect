package com.xiaomi.smarthome.library.common.util;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public class PermssionUtil {
    private static final String LOWEST_MIUI_ALPHA_SUPPORTED_VERSION = "7.3.13";
    private static final String LOWEST_MIUI_STABLE_SUPPORTED_VERSION = "8.3.0";
    private static final String TAG = "PermssionUtil";

    public static boolean canAutoStart(Context context) {
        return true;
    }

    public static boolean canShowLock(Context context) {
        return checkMiuiOp(context, 10020);
    }

    public static boolean checkMiuiOp(Context context, int i) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            Class<?> cls = appOpsManager.getClass();
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(i), Integer.valueOf(Process.myUid()), context.getPackageName())).intValue() == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void setAutoStart(Context context, boolean z) {
    }
}
