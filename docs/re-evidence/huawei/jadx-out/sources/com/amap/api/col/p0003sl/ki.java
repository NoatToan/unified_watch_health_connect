package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ki {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static byte[] f2957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static byte[] f2958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f2959c;

    public ki(String str) {
        this.f2959c = it.b(TextUtils.isDigitsOnly(str) ? "SPUtil" : str);
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
            editorEdit.putString(str2, iy.g(a(context, iy.a(str3))));
            a(editorEdit);
        } catch (Throwable unused) {
        }
    }

    public static byte[] a(Context context, byte[] bArr) {
        try {
            return iq.b(a(context), bArr, b(context));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    public static byte[] b(Context context, byte[] bArr) {
        try {
            return iq.a(a(context), bArr, b(context));
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    private static byte[] a(Context context) {
        if (context == null) {
            return new byte[0];
        }
        byte[] bArr = f2957a;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        byte[] bytes = il.f(context).getBytes();
        f2957a = bytes;
        return bytes;
    }

    private static byte[] b(Context context) {
        byte[] bArr = f2958b;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(a(context), 0, a(context).length / 2);
        f2958b = bArrCopyOfRange;
        return bArrCopyOfRange;
    }

    public static String a(Context context, String str, String str2) {
        if (context == null) {
            return "";
        }
        try {
            return iy.a(b(context, iy.d(context.getSharedPreferences(str, 0).getString(str2, ""))));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static SharedPreferences.Editor a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return context.getSharedPreferences(str, 0).edit();
        } catch (Throwable th) {
            js.a(th, "sp", "ge");
            return null;
        }
    }

    public static void a(SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        try {
            editor.apply();
        } catch (Throwable th) {
            js.a(th, "sp", "cm");
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, boolean z) {
        try {
            editor.putBoolean(str, z);
        } catch (Throwable th) {
            jv.c(th, "csp", "setPrefsStr");
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, int i) {
        try {
            editor.putInt(str, i);
        } catch (Throwable th) {
            jv.c(th, "csp", "putPrefsInt");
        }
    }

    public static boolean a(Context context, String str, String str2, boolean z) {
        try {
            return context.getSharedPreferences(str, 0).getBoolean(str2, z);
        } catch (Throwable th) {
            jv.c(th, "csp", "gbv");
            return z;
        }
    }

    public static int a(Context context, String str, String str2, int i) {
        try {
            return context.getSharedPreferences(str, 0).getInt(str2, i);
        } catch (Throwable th) {
            jv.c(th, "csp", "giv");
            return i;
        }
    }

    public static long a(Context context, String str, String str2, long j) {
        try {
            return context.getSharedPreferences(str, 0).getLong(str2, j);
        } catch (Throwable th) {
            jv.c(th, "csp", "glv");
            return j;
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, long j) {
        if (editor == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            editor.putLong(str, j);
        } catch (Throwable th) {
            jv.c(th, "csp", "plv");
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, String str2) {
        if (editor != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    editor.putString(str, str2);
                }
            } catch (Throwable th) {
                js.a(th, "sp", "ps");
            }
        }
    }

    public static String b(Context context, String str, String str2, String str3) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Throwable th) {
            jv.c(th, "csp", "gsv");
            return str3;
        }
    }

    public static void a(SharedPreferences.Editor editor, String str) {
        if (editor != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                editor.remove(str);
            } catch (Throwable th) {
                js.a(th, "sp", "rk");
            }
        }
    }
}
