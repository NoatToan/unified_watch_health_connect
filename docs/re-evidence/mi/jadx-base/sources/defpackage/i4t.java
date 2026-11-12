package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class i4t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static byte[] f20791b;
    public static byte[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20792a;

    public i4t(String str) {
        this.f20792a = m0t.d(TextUtils.isDigitsOnly(str) ? "SPUtil" : str);
    }

    public static int a(Context context, String str, String str2, int i) {
        try {
            return context.getSharedPreferences(str, 0).getInt(str2, i);
        } catch (Throwable th) {
            m2t.r(th, "csp", "giv");
            return i;
        }
    }

    public static long b(Context context, String str, String str2, long j) {
        try {
            return context.getSharedPreferences(str, 0).getLong(str2, j);
        } catch (Throwable th) {
            m2t.r(th, "csp", "glv");
            return j;
        }
    }

    public static SharedPreferences.Editor c(Context context, String str) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return context.getSharedPreferences(str, 0).edit();
                }
            } catch (Throwable th) {
                j2t.e(th, "sp", "ge");
            }
        }
        return null;
    }

    public static String d(Context context, String str, String str2) {
        if (context == null) {
            return "";
        }
        try {
            return p0t.g(q(context, p0t.x(context.getSharedPreferences(str, 0).getString(str2, ""))));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void e(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
            editorEdit.putString(str2, p0t.D(n(context, p0t.n(str3))));
            f(editorEdit);
        } catch (Throwable unused) {
        }
    }

    public static void f(SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        try {
            editor.apply();
        } catch (Throwable th) {
            j2t.e(th, "sp", "cm");
        }
    }

    public static void g(SharedPreferences.Editor editor, String str) {
        if (editor != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                editor.remove(str);
            } catch (Throwable th) {
                j2t.e(th, "sp", "rk");
            }
        }
    }

    public static void h(SharedPreferences.Editor editor, String str, int i) {
        try {
            editor.putInt(str, i);
        } catch (Throwable th) {
            m2t.r(th, "csp", "putPrefsInt");
        }
    }

    public static void i(SharedPreferences.Editor editor, String str, long j) {
        if (editor == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            editor.putLong(str, j);
        } catch (Throwable th) {
            m2t.r(th, "csp", "plv");
        }
    }

    public static void j(SharedPreferences.Editor editor, String str, String str2) {
        if (editor != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    editor.putString(str, str2);
                }
            } catch (Throwable th) {
                j2t.e(th, "sp", "ps");
            }
        }
    }

    public static void k(SharedPreferences.Editor editor, String str, boolean z) {
        try {
            editor.putBoolean(str, z);
        } catch (Throwable th) {
            m2t.r(th, "csp", "setPrefsStr");
        }
    }

    public static boolean l(Context context, String str, String str2, boolean z) {
        try {
            return context.getSharedPreferences(str, 0).getBoolean(str2, z);
        } catch (Throwable th) {
            m2t.r(th, "csp", "gbv");
            return z;
        }
    }

    public static byte[] m(Context context) {
        if (context == null) {
            return new byte[0];
        }
        byte[] bArr = f20791b;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        byte[] bytes = e0t.k(context).getBytes();
        f20791b = bytes;
        return bytes;
    }

    public static byte[] n(Context context, byte[] bArr) {
        try {
            return j0t.h(m(context), bArr, p(context));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    public static String o(Context context, String str, String str2, String str3) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Throwable th) {
            m2t.r(th, "csp", "gsv");
            return str3;
        }
    }

    public static byte[] p(Context context) {
        byte[] bArr = c;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(m(context), 0, m(context).length / 2);
        c = bArrCopyOfRange;
        return bArrCopyOfRange;
    }

    public static byte[] q(Context context, byte[] bArr) {
        try {
            return j0t.e(m(context), bArr, p(context));
        } catch (Exception unused) {
            return new byte[0];
        }
    }
}
