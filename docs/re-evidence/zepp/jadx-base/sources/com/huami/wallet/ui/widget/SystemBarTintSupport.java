package com.huami.wallet.ui.widget;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
public class SystemBarTintSupport {
    private static String a(Context context) {
        return b(context, "ro.miui.ui.version.name");
    }

    private static String b(Context context, String str) throws IllegalArgumentException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, str);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean isSupport(Context context) {
        return (!TextUtils.isEmpty(a(context)) && Build.VERSION.SDK_INT >= 19) || Build.VERSION.SDK_INT >= 21;
    }
}
