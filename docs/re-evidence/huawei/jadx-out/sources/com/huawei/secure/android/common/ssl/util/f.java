package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes42.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22909a = "SPUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f22910b = "aegis";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SharedPreferences f22911c;

    public static long a(String str, long j, Context context) {
        if (context != null) {
            return b(context).getLong(str, j);
        }
        d.b(f22909a, "get: context is null");
        return j;
    }

    public static SharedPreferences b(Context context) {
        synchronized (f.class) {
            try {
                if (context == null) {
                    d.b(f22909a, "getInstance: context is null");
                    return null;
                }
                if (f22911c == null) {
                    f22911c = context.createDeviceProtectedStorageContext().getSharedPreferences(f22910b, 0);
                }
                return f22911c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int a(String str, int i, Context context) {
        if (context == null) {
            d.b(f22909a, "get: context is null");
            return i;
        }
        return b(context).getInt(str, i);
    }

    public static String a(String str, String str2, Context context) {
        if (context == null) {
            d.b(f22909a, "get: context is null");
            return str2;
        }
        return b(context).getString(str, str2);
    }

    public static void b(String str, long j, Context context) {
        if (context == null) {
            d.b(f22909a, "put: context is null");
        } else {
            b(context).edit().putLong(str, j).apply();
        }
    }

    public static void a(String str, Context context) {
        if (context == null) {
            d.b(f22909a, "remove: context is null");
        } else {
            b(context).edit().remove(str).apply();
        }
    }

    public static void b(String str, int i, Context context) {
        if (context == null) {
            d.b(f22909a, "put: context is null");
        } else {
            b(context).edit().putInt(str, i).apply();
        }
    }

    public static void a(Context context) {
        if (context == null) {
            d.b(f22909a, "clear: context is null");
        } else {
            b(context).edit().clear().apply();
        }
    }

    public static void b(String str, String str2, Context context) {
        if (context == null) {
            d.b(f22909a, "put: context is null");
        } else {
            b(context).edit().putString(str, str2).apply();
        }
    }
}
