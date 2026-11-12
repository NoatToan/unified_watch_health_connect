package com.liulishuo.filedownloader.util;

import android.util.Log;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadLog {
    public static boolean NEED_LOG = false;
    private static final String a = "FileDownloader.";

    private static String a(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append((obj instanceof Class ? (Class) obj : obj.getClass()).getSimpleName());
        return sb.toString();
    }

    private static void b(int i, Object obj, String str, Object... objArr) {
        c(i, obj, null, str, objArr);
    }

    private static void c(int i, Object obj, Throwable th, String str, Object... objArr) {
        if ((i >= 5) || NEED_LOG) {
            Log.println(i, a(obj), FileDownloadUtils.formatString(str, objArr));
            if (th != null) {
                th.printStackTrace();
            }
        }
    }

    public static void d(Object obj, String str, Object... objArr) {
        b(3, obj, str, objArr);
    }

    public static void e(Object obj, Throwable th, String str, Object... objArr) {
        c(6, obj, th, str, objArr);
    }

    public static void i(Object obj, String str, Object... objArr) {
        b(4, obj, str, objArr);
    }

    public static void v(Object obj, String str, Object... objArr) {
        b(2, obj, str, objArr);
    }

    public static void w(Object obj, String str, Object... objArr) {
        b(5, obj, str, objArr);
    }

    public static void e(Object obj, String str, Object... objArr) {
        b(6, obj, str, objArr);
    }
}
