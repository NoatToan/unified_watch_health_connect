package com.amap.api.mapcore.util;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class kh {
    public static int a(Context context, String str, String str2) {
        try {
            return context.getSharedPreferences(str, 0).getInt(str2, 200);
        } catch (Throwable th) {
            ke.a(th, "SpUtil", "getPrefsInt");
            return 200;
        }
    }

    public static String a(Context context) {
        return context == null ? com.alipay.sdk.m.u.c.b : a(context, "pref", "smac", com.alipay.sdk.m.u.c.b);
    }

    private static String a(Context context, String str, String str2, String str3) {
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Throwable th) {
            ke.a(th, "SpUtil", "getPrefsInt");
            return str3;
        }
    }

    public static boolean b(Context context, String str, String str2) {
        try {
            return context.getSharedPreferences(str, 0).getBoolean(str2, true);
        } catch (Throwable th) {
            ke.a(th, "SpUtil", "getPrefsBoolean");
            return true;
        }
    }
}
