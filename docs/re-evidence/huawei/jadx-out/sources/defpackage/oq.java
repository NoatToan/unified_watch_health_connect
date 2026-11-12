package defpackage;

import com.alipay.sdk.interior.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class oq {
    public static Log.ISdkLogCallback e;

    public static void a(String str, String str2) {
        e(e(str, str2));
    }

    public static void b(String str, String str2) {
        e(e(str, str2));
    }

    public static void c(String str, String str2) {
        e(e(str, str2));
    }

    public static void d(String str, String str2) {
        e(e(str, str2));
    }

    public static void e(String str) {
        try {
            Log.ISdkLogCallback iSdkLogCallback = e;
            if (iSdkLogCallback != null) {
                iSdkLogCallback.onLogLine(String.format("[AlipaySDK] %s %s", new SimpleDateFormat("hh:mm:ss.SSS", Locale.getDefault()).format(new Date()), str));
            }
        } catch (Throwable unused) {
        }
    }

    public static String e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void b(String str, String str2, Throwable th) {
        e(e(str, str2) + " " + e(th));
    }

    public static void c(Throwable th) {
        if (th == null) {
            return;
        }
        try {
            e(e(th));
        } catch (Throwable unused) {
        }
    }

    public static String e(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return String.format("[%s][%s]", str, str2);
    }
}
