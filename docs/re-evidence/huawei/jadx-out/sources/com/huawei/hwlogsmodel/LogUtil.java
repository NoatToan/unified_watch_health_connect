package com.huawei.hwlogsmodel;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.hwlogsmodel.common.LogConfig;
import health.compact.a.BuildConfigProperties;
import health.compact.a.BuildTypeConfig;
import health.compact.a.LogAllowListConfig;
import health.compact.a.ProcessUtil;
import health.compact.a.StrLogImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LogUtil {
    private static StrLogImpl j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<LogConfig> f17642b = new ArrayList(2);
    private static long d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f17641a = new Object();
    private static String e = Integer.toString(BaseApplication.c());
    private static String g = e + "|";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static LogConfig f17643c = new LogConfig.b(null).b();

    static {
        j = null;
        Log.d("LogUtil", "LOGPRE_TIME_FORMAT yyyyMMdd-HH:mm:ss:SSS|");
        j = new StrLogImpl();
    }

    private LogUtil() {
    }

    public static void e(Context context, LogConfig logConfig) {
        if (j == null) {
            return;
        }
        f17642b.add(logConfig);
        a(context, logConfig);
    }

    private static void a(Context context, LogConfig logConfig) {
        logConfig.e(context);
        BuildTypeConfig.e(BuildConfigProperties.d());
        f();
        LogConfig.c(new LogConfig.Model() { // from class: com.huawei.hwlogsmodel.LogUtil.1
            @Override // com.huawei.hwlogsmodel.common.LogConfig.Model
            public void clearLogCache() {
                LogUtil.d();
            }
        });
        LogConfig.d(false);
        d(2, false, "R_LogUtil", "APP_VERSION:", e, ", BUILD_TYPE: ", BuildConfigProperties.d(), ", LOG_LEVEL: ", Integer.valueOf(health.compact.a.LogConfig.e()));
    }

    public static List<LogConfig> c() {
        return f17642b;
    }

    public static void d() {
        j.c();
        Log.i("LogUtil", "clearLogCache start in process:" + ProcessUtil.c() + " pid:" + Process.myPid());
        LogConfig.e(new File(b().n()));
        Log.i("LogUtil", "clearLogCache end in process:" + ProcessUtil.c() + " pid:" + Process.myPid());
    }

    public static void a() {
        synchronized (f17641a) {
            j.d();
            d("LogUtil", "blockForAnalyze");
            j.e(false);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.huawei.hwlogsmodel.LogUtil.3
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.h();
                }
            }, 300000L);
        }
    }

    public static void h() {
        synchronized (f17641a) {
            d("LogUtil", "unBlockForAnalyze");
            j.e(true);
        }
    }

    public static long a(int i, long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - j2 >= i) {
            return jElapsedRealtime;
        }
        return -1L;
    }

    public static boolean e() {
        return LogConfig.f();
    }

    public static void g(String str, Object... objArr) {
        d(0, false, str, objArr);
    }

    public static void d(String str, Object... objArr) {
        d(1, false, str, objArr);
    }

    public static void a(String str, Object... objArr) {
        if (b(str)) {
            d(2, false, str, objArr);
        }
    }

    private static void d(String str, String str2) {
        d(2, true, str, str2);
    }

    private static void d(int i, boolean z, String str, Object... objArr) {
        if (LogAllowListConfig.d(i, str)) {
            j.c(i, str, g, objArr, z);
        }
    }

    public static void j(String str, Object... objArr) {
        if (b(str)) {
            d(3, false, str, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        if (b(str)) {
            d(4, false, str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        if (b(str)) {
            d(6, false, str, objArr);
            if (!LogConfig.b() || g()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                sb.append(obj);
            }
            SharedPreferences.Editor editorEdit = BaseApplication.b().getSharedPreferences("error_monitor_upload_log_name", 0).edit();
            String str2 = System.currentTimeMillis() + ";" + str + ";" + ((CharSequence) sb) + ";" + BaseApplication.g();
            if (editorEdit != null) {
                editorEdit.putString("error_monitor_upload_log_key", str2);
                editorEdit.commit();
            }
            Intent intent = new Intent();
            intent.putExtra("taskMsg", str2);
            intent.setPackage(BaseApplication.d());
            intent.setAction("com.huawei.health.action.UPLOAD_EXCEPTION_LOG");
            BaseApplication.b().sendBroadcast(intent, SecurityConstant.e);
        }
    }

    private static boolean g() {
        if (SystemClock.elapsedRealtime() - d < 300000) {
            return true;
        }
        d = SystemClock.elapsedRealtime();
        return false;
    }

    public static void a(int i, String str, Bundle bundle, boolean z, Object... objArr) {
        e(str, objArr);
    }

    public static void f() {
        if (LogConfig.f() || (LogConfig.b() && LogConfig.d() && !health.compact.a.LogConfig.d() && !BuildConfigProperties.a("FORCE_ALL_LOG", false))) {
            LogAllowListConfig.d();
            LogAllowListConfig.e();
            g = e + "|R|";
            return;
        }
        LogAllowListConfig.a();
        LogAllowListConfig.c();
        g = e + "|";
    }

    public static void c(String str, Object... objArr) {
        d(4, false, str, objArr);
    }

    public static void h(String str, Object... objArr) {
        d(2, false, str, objArr);
    }

    public static void i(String str, Object... objArr) {
        d(3, false, str, objArr);
    }

    private static boolean b(String str) {
        if (e() || (LogConfig.b() && LogConfig.d() && !health.compact.a.LogConfig.d() && !BuildConfigProperties.a("FORCE_ALL_LOG", false))) {
            return !TextUtils.isEmpty(str) && str.startsWith("R_");
        }
        return true;
    }

    public static LogConfig b() {
        if (!e() && !LogConfig.b()) {
            return f17643c;
        }
        try {
            String strC = ProcessUtil.c();
            for (LogConfig logConfig : f17642b) {
                if (TextUtils.equals(strC, logConfig.m())) {
                    return logConfig;
                }
            }
            return f17643c;
        } catch (OutOfMemoryError e2) {
            e("LogUtil", "acquireLogConfig OutOfMemoryError:", e2.getMessage());
            return f17643c;
        }
    }

    public static LogConfig d(String str) {
        for (LogConfig logConfig : f17642b) {
            if (TextUtils.equals(ProcessUtil.c() + "_" + str, logConfig.m())) {
                return logConfig;
            }
        }
        return f17643c;
    }
}
