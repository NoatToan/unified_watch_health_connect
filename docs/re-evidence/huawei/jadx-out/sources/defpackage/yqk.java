package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes20.dex */
public class yqk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SharedPreferences f53764b;

    public static void b(String str, String str2, Context context) {
        d(context).edit().putString(str, str2).apply();
    }

    public static void c(String str, long j, Context context) {
        d(context).edit().putLong(str, j).apply();
    }

    public static void e(String str, int i, Context context) {
        d(context).edit().putInt(str, i).apply();
    }

    public static String e(String str, String str2, Context context) {
        return d(context).getString(str, str2);
    }

    public static long b(String str, long j, Context context) {
        return d(context).getLong(str, j);
    }

    public static int c(String str, int i, Context context) {
        return d(context).getInt(str, i);
    }

    public static SharedPreferences d(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (yqk.class) {
            if (f53764b == null) {
                f53764b = context.createDeviceProtectedStorageContext().getSharedPreferences("ucs.sdk", 0);
            }
            sharedPreferences = f53764b;
        }
        return sharedPreferences;
    }
}
