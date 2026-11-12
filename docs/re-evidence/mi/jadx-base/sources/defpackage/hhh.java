package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.template.ILogger;

/* JADX INFO: loaded from: classes.dex */
public class hhh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f20070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f20071b;

    public static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (Exception unused) {
            kb.c.error(ILogger.defaultTag, "Get package info error.");
            return null;
        }
    }

    public static boolean b(Context context) {
        PackageInfo packageInfoA = a(context);
        if (packageInfoA != null) {
            String str = packageInfoA.versionName;
            int i = packageInfoA.versionCode;
            SharedPreferences sharedPreferences = context.getSharedPreferences("SP_AROUTER_CACHE", 0);
            if (str.equals(sharedPreferences.getString("LAST_VERSION_NAME", null)) && i == sharedPreferences.getInt("LAST_VERSION_CODE", -1)) {
                return false;
            }
            f20070a = str;
            f20071b = i;
        }
        return true;
    }

    public static void c(Context context) {
        if (TextUtils.isEmpty(f20070a) || f20071b == 0) {
            return;
        }
        context.getSharedPreferences("SP_AROUTER_CACHE", 0).edit().putString("LAST_VERSION_NAME", f20070a).putInt("LAST_VERSION_CODE", f20071b).apply();
    }
}
