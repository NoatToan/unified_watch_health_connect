package com.xiaomi.onetrack.f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.xiaomi.onetrack.util.j;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f13873a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f13874b = null;
    private static int c = 0;
    private static String d = null;
    private static String e = null;
    private static long f = 0;
    private static volatile boolean g = false;

    public static void a(Context context) {
        if (g) {
            return;
        }
        synchronized (a.class) {
            try {
                if (g) {
                    return;
                }
                f13873a = context;
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(f13873a.getPackageName(), 0);
                    c = packageInfo.versionCode;
                    d = packageInfo.versionName;
                    f = packageInfo.lastUpdateTime;
                    e = f13873a.getPackageName();
                } catch (PackageManager.NameNotFoundException e2) {
                    e2.printStackTrace();
                }
                g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean b(Context context, String str) {
        PackageInfo packageInfoA = a(context, str, 0);
        return (packageInfoA == null || packageInfoA.applicationInfo == null) ? false : true;
    }

    public static String c(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationInfo(str, 0).loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static int d() {
        return c;
    }

    public static String e() {
        return e;
    }

    public static long f() {
        return f;
    }

    public static Context b() {
        return f13873a;
    }

    public static String c() {
        return d;
    }

    public static boolean a(ApplicationInfo applicationInfo) {
        return (applicationInfo.flags & 1) != 0;
    }

    public static boolean a(Context context, String str) {
        try {
            return a(a(context, str, 0).applicationInfo);
        } catch (Exception unused) {
            return false;
        }
    }

    public static PackageInfo a(Context context, String str, int i) {
        try {
            return context.getPackageManager().getPackageInfo(str, i);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Context a() {
        if (j.d(f13873a)) {
            Context context = f13874b;
            if (context != null) {
                return context;
            }
            synchronized (a.class) {
                try {
                    if (f13874b == null) {
                        f13874b = j.a(f13873a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f13874b;
        }
        return f13873a;
    }
}
