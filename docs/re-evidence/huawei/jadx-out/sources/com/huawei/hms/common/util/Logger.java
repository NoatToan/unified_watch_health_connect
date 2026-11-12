package com.huawei.hms.common.util;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f13096a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f13097b = "Logger";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f13098c = "|";
    private static final int d = 8;
    private static final int e = 20;
    private static final String f = "dynamic-api_";

    public static void w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }

    public static void w(String str, String str2, Throwable th) {
        Log.w(a(str), a(str2, 5), a(th));
    }

    public static void w(String str, Object obj) {
        println(5, str, obj);
    }

    public static void v(String str, String str2, Object... objArr) {
        println(2, str, str2, objArr);
    }

    public static void v(String str, Object obj) {
        println(2, str, obj);
    }

    public static void println(int i, String str, String str2, Object... objArr) {
        if (i < 3) {
            return;
        }
        if (str2 == null) {
            Log.w(f13097b, "format is null, not log");
            return;
        }
        try {
            if (isLoggable(i)) {
                a(i, str, format(str2, objArr));
            }
        } catch (IllegalFormatException e2) {
            w(f13097b, "log format error" + str2, e2);
        }
    }

    public static void println(int i, String str, Object obj) {
        if (i >= 3 && isLoggable(i)) {
            a(i, str, obj == null ? Constants.NULL : obj.toString());
        }
    }

    public static boolean isLoggable(int i) {
        return Log.isLoggable(f, i);
    }

    public static void i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static void i(String str, Object obj) {
        println(4, str, obj);
    }

    public static String format(String str, Object... objArr) {
        return str == null ? "" : String.format(Locale.ROOT, str, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e(a(str), a(str2, 5), a(th));
    }

    public static void e(String str, Object obj) {
        println(6, str, obj);
    }

    public static class b extends Throwable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f13099a = 7129050843360571879L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f13100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Throwable f13101c;
        private Throwable d;

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th = this.d;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.f13100b == null) {
                return name;
            }
            String str = name + ": ";
            if (this.f13100b.startsWith(str)) {
                return this.f13100b;
            }
            return str + this.f13100b;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f13100b;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            Throwable th = this.f13101c;
            if (th == this) {
                return null;
            }
            return th;
        }

        public void a(String str) {
            this.f13100b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Throwable th) {
            this.f13101c = th;
        }

        private b(Throwable th) {
            this.d = th;
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        println(3, str, str2, objArr);
    }

    public static void d(String str, Object obj) {
        println(3, str, obj);
    }

    public static String anonymizeMessage(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 1) {
                charArray[i] = '*';
            }
        }
        return new String(charArray);
    }

    private static Throwable a(Throwable th) {
        if (isLoggable(3)) {
            return th;
        }
        if (th == null) {
            return null;
        }
        int i = ((th instanceof IOException) || (th instanceof JSONException)) ? 8 : 20;
        b bVar = new b(th);
        StackTraceElement[] stackTrace = bVar.getStackTrace();
        if (stackTrace.length > i) {
            bVar.setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i));
        } else {
            bVar.setStackTrace(stackTrace);
        }
        bVar.a(anonymizeMessage(th.getMessage()));
        Throwable cause = th.getCause();
        b bVar2 = bVar;
        while (cause != null) {
            b bVar3 = new b(cause);
            bVar3.a(anonymizeMessage(cause.getMessage()));
            bVar2.a(bVar3);
            cause = cause.getCause();
            bVar2 = bVar3;
        }
        return bVar;
    }

    private static String a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return a(i);
        }
        return a(i) + "|" + str;
    }

    private static String a(String str) {
        return f + str;
    }

    private static String a(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= i) {
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return Process.myPid() + com.huawei.openalliance.ad.constant.Constants.LINK + Process.myTid() + "|" + stackTraceElement.getFileName() + "|" + stackTraceElement.getClassName() + "|" + stackTraceElement.getMethodName() + "|" + stackTraceElement.getLineNumber();
    }

    private static int a(int i, String str, String str2) {
        return Log.println(i, a(str), a(str2, 7));
    }
}
