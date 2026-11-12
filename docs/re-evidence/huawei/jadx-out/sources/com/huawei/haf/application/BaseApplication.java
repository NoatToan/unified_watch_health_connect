package com.huawei.haf.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes.dex */
public class BaseApplication extends Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Application f5789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f5790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ActivityStatusMonitor f5791c;
    private static String d;
    private static int e;

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        e(this);
    }

    static void e(Application application) {
        f5789a = application;
        f5790b = application.getPackageName();
        a(application);
        String strD = d();
        String strI = i();
        int iC = c();
        ReleaseLogUtil.c("HAF_BaseApplication", "appType=", strD, ", verName=", strI, ", verCode=", Integer.valueOf(iC), ", procName=", g());
    }

    public static Context b() {
        return f5789a;
    }

    public static String d() {
        return f5790b;
    }

    public static String i() {
        return d;
    }

    public static int c() {
        return e;
    }

    public static Application f() {
        return f5789a;
    }

    public static String g() {
        return ProcessUtil.c();
    }

    public static Activity j() {
        ActivityStatusMonitor activityStatusMonitor = f5791c;
        if (activityStatusMonitor != null) {
            return activityStatusMonitor.e();
        }
        return null;
    }

    public static Activity[] e() {
        ActivityStatusMonitor activityStatusMonitor = f5791c;
        if (activityStatusMonitor != null) {
            return activityStatusMonitor.d();
        }
        return null;
    }

    public static void a() {
        ActivityStatusMonitor activityStatusMonitor = f5791c;
        if (activityStatusMonitor != null) {
            activityStatusMonitor.c();
        }
    }

    public static boolean h() {
        ActivityStatusMonitor activityStatusMonitor = f5791c;
        if (activityStatusMonitor != null) {
            return activityStatusMonitor.f();
        }
        return false;
    }

    public static boolean d(long j) {
        ActivityStatusMonitor activityStatusMonitor = f5791c;
        if (activityStatusMonitor != null) {
            return activityStatusMonitor.e(j);
        }
        return true;
    }

    public static boolean b(long j) {
        ActivityStatusMonitor activityStatusMonitor = f5791c;
        if (activityStatusMonitor != null) {
            return activityStatusMonitor.c(j);
        }
        return false;
    }

    public static int d(String str) {
        if (f5791c == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        return f5791c.b(str);
    }

    public static void e(Application application, boolean z) {
        if (f5791c == null) {
            f5791c = z ? new ActivityMonitor(application) : new ActivityStatusMonitor(true);
        }
    }

    private static void a(Application application) {
        PackageInfo packageInfo;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(f5790b, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            LogUtil.e("HAF_BaseApplication", "initVersionInfo() ex=", LogUtil.c(e2));
            packageInfo = null;
        }
        d = c(packageInfo);
        e = d(packageInfo);
    }

    private static String c(PackageInfo packageInfo) {
        String str = packageInfo != null ? packageInfo.versionName : null;
        return TextUtils.isEmpty(str) ? "1.0.0.0" : str;
    }

    private static int d(PackageInfo packageInfo) {
        int i = packageInfo != null ? packageInfo.versionCode : 0;
        if (i < 1) {
            return 1;
        }
        return i;
    }
}
