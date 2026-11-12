package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
public final class x {
    public static byte[] a;
    public static byte[] b;
    private String c;

    public x(String str) {
        this.c = r.a(TextUtils.isDigitsOnly(str) ? "SPUtil" : str);
    }

    public static int a(Context context, String str, String str2, int i) {
        try {
            return context.getSharedPreferences(str, 0).getInt(str2, i);
        } catch (Throwable th) {
            ab.b(th, "csp", "giv");
            return i;
        }
    }

    public static void a(SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        editor.apply();
    }

    public static void a(SharedPreferences.Editor editor, String str, int i) {
        try {
            editor.putInt(str, i);
        } catch (Throwable th) {
            ab.b(th, "csp", "putPrefsInt");
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, boolean z) {
        try {
            editor.putBoolean(str, z);
        } catch (Throwable th) {
            ab.b(th, "csp", "setPrefsStr");
        }
    }

    public static boolean a(Context context, String str, String str2, boolean z) {
        try {
            return context.getSharedPreferences(str, 0).getBoolean(str2, z);
        } catch (Throwable th) {
            ab.b(th, "csp", "glv");
            return z;
        }
    }

    private static byte[] a(Context context) {
        if (context == null) {
            return new byte[0];
        }
        byte[] bArr = a;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        byte[] bytes = k.f(context).getBytes();
        a = bytes;
        return bytes;
    }

    private static byte[] a(Context context, byte[] bArr) {
        try {
            return o.b(a(context), bArr, b(context));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    private static byte[] b(Context context) {
        byte[] bArr = b;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        int i = 0;
        if (Build.VERSION.SDK_INT < 9) {
            b = new byte[a(context).length / 2];
            while (true) {
                byte[] bArr2 = b;
                if (i >= bArr2.length) {
                    break;
                }
                bArr2[i] = a(context)[i];
                i++;
            }
        } else {
            b = Arrays.copyOfRange(a(context), 0, a(context).length / 2);
        }
        return b;
    }

    private static byte[] b(Context context, byte[] bArr) {
        try {
            return o.a(a(context), bArr, b(context));
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static SharedPreferences.Editor c(Context context, String str) {
        return context.getSharedPreferences(str, 0).edit();
    }

    public final void a(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.c, 0).edit();
            editorEdit.putString(str, u.g(a(context, u.a(str2))));
            if (Build.VERSION.SDK_INT >= 9) {
                editorEdit.apply();
            } else {
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(Context context, String str, boolean z) {
        a(context, str, Boolean.toString(z));
    }

    public final boolean a(Context context, String str) {
        try {
            return Boolean.parseBoolean(b(context, str));
        } catch (Throwable unused) {
            return true;
        }
    }

    public final String b(Context context, String str) {
        if (context == null) {
            return "";
        }
        try {
            return u.a(b(context, u.d(context.getSharedPreferences(this.c, 0).getString(str, ""))));
        } catch (Throwable unused) {
            return "";
        }
    }
}
