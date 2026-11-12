package com.xiaomi.hm.health.relation.copy;

import android.content.Context;

/* JADX INFO: loaded from: classes21.dex */
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
        return true;
    }
}
