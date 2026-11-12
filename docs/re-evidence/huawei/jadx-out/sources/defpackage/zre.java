package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes20.dex */
public final class zre {
    public static <T> T c(T t) {
        t.getClass();
        return t;
    }

    public static <T> T c(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static String c(String str, Object obj) {
        c(str, obj);
        e(!TextUtils.isEmpty(str), obj);
        return str;
    }

    public static String a(String str, Object obj) {
        if (str != null) {
            c(str, obj);
        }
        return str;
    }

    public static void e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }
}
