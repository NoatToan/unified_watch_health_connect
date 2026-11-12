package com.huawei.hms.maps.utils;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.maps.mal;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class LogM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static StringBuffer f14307a = new StringBuffer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f14308b = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f14309c = Log.isLoggable("HmsMapSite", 2);
    private static final boolean d = Log.isLoggable("HmsMapSite", 3);
    private static final boolean e = Log.isLoggable("HmsMapSite", 4);
    private static final boolean f = Log.isLoggable("HmsMapSite", 5);
    private static final boolean g = Log.isLoggable("HmsMapSite", 6);

    public static void d(String str, String str2) {
        if (d) {
            d(str, str2, (Throwable) null, false);
        }
    }

    public static void e(String str, String str2) {
        if (g) {
            e(str, str2, (Throwable) null, false);
        }
    }

    public static void i(String str, String str2) {
        if (e) {
            i(str, str2, (Throwable) null, false);
        }
    }

    public static void w(String str, String str2) {
        if (f) {
            w(str, str2, (Throwable) null, false);
        }
    }

    public static void d(String str, String str2, String str3) {
        if (d) {
            d(str, str2, str3, (Throwable) null);
        }
    }

    public static void e(String str, String str2, String str3) {
        if (g) {
            e(str, str2, str3, (Throwable) null);
        }
    }

    public static void i(String str, String str2, String str3) {
        if (e) {
            i(str, str2, str3, (Throwable) null);
        }
    }

    public static void w(String str, String str2, String str3) {
        if (f) {
            w(str, str2, str3, (Throwable) null);
        }
    }

    public static void d(String str, String str2, String str3, Throwable th) {
        if (d) {
            String strA = a(str);
            if (th == null) {
                mal.a(strA, str2, str3);
            } else {
                mal.a(strA, str2, str3, th);
            }
        }
    }

    public static void e(String str, String str2, String str3, Throwable th) {
        if (g) {
            String strA = a(str);
            if (th == null) {
                mal.b(strA, str2, str3);
                getLogMsg(str2, str3);
            } else {
                mal.b(strA, str2, str3, th);
                getLogMsg(str2, str3);
                System.lineSeparator();
                Log.getStackTraceString(mal.a(th));
            }
        }
    }

    public static void i(String str, String str2, String str3, Throwable th) {
        if (e) {
            String strA = a(str);
            if (th == null) {
                mal.c(strA, str2, str3);
            } else {
                mal.c(strA, str2, str3, th);
            }
        }
    }

    public static void w(String str, String str2, String str3, Throwable th) {
        if (f) {
            String strA = a(str);
            if (th == null) {
                mal.d(strA, str2, str3);
            } else {
                mal.d(strA, str2, str3, th);
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (d) {
            d(str, str2, th, false);
        }
    }

    public static void e(String str, String str2, Throwable th, boolean z) {
        if (g) {
            String strA = a(str);
            if (th == null) {
                mal.b(strA, str2, z);
            } else {
                mal.b(strA, str2, th, z);
            }
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (e) {
            i(str, str2, th, false);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (f) {
            w(str, str2, th, false);
        }
    }

    public static void d(String str, String str2, Throwable th, boolean z) {
        if (d) {
            String strA = a(str);
            if (th == null) {
                mal.a(strA, str2, z);
            } else {
                mal.a(strA, str2, th, z);
            }
        }
    }

    public static void e(String str, String str2, boolean z) {
        if (g) {
            e(str, str2, (Throwable) null, z);
        }
    }

    public static void i(String str, String str2, Throwable th, boolean z) {
        if (e) {
            String strA = a(str);
            if (th == null) {
                mal.c(strA, str2, z);
            } else {
                mal.c(strA, str2, th, z);
            }
        }
    }

    public static void w(String str, String str2, Throwable th, boolean z) {
        if (f) {
            String strA = a(str);
            if (th == null) {
                mal.d(strA, str2, z);
            } else {
                mal.d(strA, str2, th, z);
            }
        }
    }

    public static void d(String str, String str2, boolean z) {
        if (d) {
            d(str, str2, (Throwable) null, z);
        }
    }

    public static void i(String str, String str2, boolean z) {
        if (e) {
            i(str, str2, (Throwable) null, z);
        }
    }

    public static void w(String str, String str2, boolean z) {
        if (f) {
            w(str, str2, (Throwable) null, z);
        }
    }

    public static void v(String str, String str2) {
        if (f14309c) {
            mal.b(a(str), str2);
        }
    }

    public static String getLogMsg(String str, String str2) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(mal.a(str2));
        }
        return sb.toString();
    }

    private static String a(String str) {
        if (str == null) {
            return "HmsMapKit";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return "HmsMapKit_" + str + "_" + (stackTrace.length > 5 ? stackTrace[5].getLineNumber() : 0);
    }
}
