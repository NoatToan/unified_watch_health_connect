package com.alipay.apmobilesecuritysdk.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.alipay.apmobilesecuritysdk.e.h;
import defpackage.li;
import defpackage.ll;
import defpackage.ln;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    private static ll b(Context context, String str, String str2, String str3) {
        String packageName;
        try {
            packageName = context.getPackageName();
        } catch (Throwable unused) {
            packageName = "";
        }
        return new ll(Build.MODEL, packageName, "APPSecuritySDK-ALIPAYSDK", "3.4.0.202506100708", str, str2, str3);
    }

    private static boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }

    public static void a(Throwable th) {
        synchronized (a.class) {
            ln.c(th);
        }
    }

    public static void a(String str) {
        synchronized (a.class) {
            ln.c(str);
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        synchronized (a.class) {
            ln.c(context.getFilesDir().getAbsolutePath() + "/log/ap", a(), b(context, str, str2, str3).toString());
        }
    }

    public static void a(Context context, com.alipay.sdk.m.j0.a aVar) {
        if (a(context) && h.c(context)) {
            new li(context.getFilesDir().getAbsolutePath() + "/log/ap", aVar).a(context);
        }
    }

    private static String a() {
        return new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log";
    }
}
