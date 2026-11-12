package com.xiaomi.channel.commonutils.android;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.push.z;

/* JADX INFO: loaded from: classes18.dex */
public class k {
    private static Context a;
    private static String b;

    public static int a() {
        try {
            Class<?> clsA = a(null, "miui.os.Build");
            if (clsA.getField("IS_STABLE_VERSION").getBoolean(null)) {
                return 3;
            }
            return clsA.getField("IS_DEVELOPMENT_VERSION").getBoolean(null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Context m3431a() {
        return a;
    }

    public static Class<?> a(Context context, String str) throws ClassNotFoundException {
        if (str == null || str.trim().length() == 0) {
            throw new ClassNotFoundException("class is empty");
        }
        boolean z = context != null;
        if (z && Build.VERSION.SDK_INT >= 29) {
            try {
                return context.getClassLoader().loadClass(str);
            } catch (Throwable unused) {
            }
        }
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m3434a(String.format("loadClass fail hasContext= %s, errMsg = %s", Boolean.valueOf(z), th.getLocalizedMessage()));
            throw new ClassNotFoundException("loadClass fail ", th);
        }
    }

    public static void a(Context context) {
        a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3432a() {
        return TextUtils.equals((String) z.a("android.os.SystemProperties", "get", "sys.boot_completed"), "1");
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3433a(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return false;
        }
    }
}
