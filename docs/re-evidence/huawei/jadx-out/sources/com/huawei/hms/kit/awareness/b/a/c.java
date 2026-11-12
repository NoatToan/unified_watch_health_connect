package com.huawei.hms.kit.awareness.b.a;

import android.util.Log;
import java.text.MessageFormat;

/* JADX INFO: loaded from: classes34.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13884a = "LogsUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f13885b = "HMS-Awa";

    public static void a(String str, String str2, Object... objArr) {
    }

    public static void d(String str, String str2, Object... objArr) {
        Log.e(f13885b, a(str, a(str2, objArr)));
    }

    public static void c(String str, String str2, Object... objArr) {
        Log.w(f13885b, a(str, a(str2, objArr)));
    }

    public static void b(String str, String str2, Object... objArr) {
        Log.i(f13885b, a(str, a(str2, objArr)));
    }

    private static String a(String str, Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            try {
                return MessageFormat.format(str, objArr);
            } catch (IllegalArgumentException e) {
                d(f13884a, e.getMessage(), new Object[0]);
            }
        }
        return str;
    }

    private static String a(String str, String str2) {
        return "[" + str + "] " + str2;
    }

    private c() {
    }
}
