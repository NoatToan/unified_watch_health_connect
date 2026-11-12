package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class lsh {
    public static String a(Context context) {
        return b(context).getString("token", null);
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences("PermissionTokenManager.healthdata", 0);
    }

    public static void c(Context context, String str) {
        b(context).edit().putString("token", str).commit();
    }
}
