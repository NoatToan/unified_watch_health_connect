package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes30.dex */
public class grc {
    private static SharedPreferences d;

    public static SharedPreferences d(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (grc.class) {
            if (d == null) {
                d = context.createDeviceProtectedStorageContext().getSharedPreferences("WearLbsAuth", 0);
            }
            sharedPreferences = d;
        }
        return sharedPreferences;
    }

    public static void d(String str, long j, Context context) {
        d(context).edit().putLong(str, j).apply();
    }

    public static long e(String str, long j, Context context) {
        return d(context).getLong(str, j);
    }

    public static void d(String str, String str2, Context context) {
        d(context).edit().putString(str, str2).apply();
    }

    public static String a(String str, String str2, Context context) {
        return d(context).getString(str, str2);
    }
}
