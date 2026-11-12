package defpackage;

import android.util.Log;
import com.huawei.wisesecurity.ucs.common.log.ILogUcs;
import java.text.MessageFormat;

/* JADX INFO: loaded from: classes20.dex */
public class yqi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ILogUcs f53762c = new yqm();

    public static void b(String str, String str2, Object... objArr) {
        ILogUcs iLogUcs = f53762c;
        if (iLogUcs != null) {
            iLogUcs.w(d(str), d(str, str2, objArr));
        }
    }

    public static void d(ILogUcs iLogUcs) {
        if (iLogUcs != null) {
            f53762c = iLogUcs;
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        ILogUcs iLogUcs = f53762c;
        if (iLogUcs != null) {
            iLogUcs.i(d(str), d(str, str2, objArr));
        }
    }

    private static String d(String str) {
        return "UCS-" + str;
    }

    private static String d(String str, String str2, Object... objArr) {
        try {
            return MessageFormat.format(str2, objArr);
        } catch (Throwable th) {
            Log.e(str, "log error : " + th.getMessage());
            return "return default";
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        ILogUcs iLogUcs = f53762c;
        if (iLogUcs != null) {
            iLogUcs.e(d(str), d(str, str2, objArr));
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        ILogUcs iLogUcs = f53762c;
        if (iLogUcs != null) {
            iLogUcs.d(d(str), d(str, str2, objArr));
        }
    }
}
