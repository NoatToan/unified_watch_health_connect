package com.alipay.sdk.util;

import com.alipay.sdk.interior.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Log.ISdkLogCallback f5877a;

    public static void a(String str) {
        try {
            Log.ISdkLogCallback iSdkLogCallback = f5877a;
            if (iSdkLogCallback != null) {
                iSdkLogCallback.a(String.format("[AlipaySDK] %s %s", new SimpleDateFormat("hh:mm:ss.SSS", Locale.getDefault()).format(new Date()), str));
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(String str, String str2) {
        a(i(str, str2));
    }

    public static void c(String str, String str2, Throwable th) {
        a(i(str, str2) + " " + e(th));
    }

    public static void d(Throwable th) {
        if (th == null) {
            return;
        }
        try {
            a(e(th));
        } catch (Throwable unused) {
        }
    }

    public static String e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void f(String str, String str2) {
        a(i(str, str2));
    }

    public static void g(String str, String str2) {
        a(i(str, str2));
    }

    public static void h(String str, String str2) {
        a(i(str, str2));
    }

    public static String i(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return String.format("[%s][%s]", str, str2);
    }
}
