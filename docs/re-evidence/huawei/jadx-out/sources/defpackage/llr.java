package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class llr {
    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(str));
    }

    public static String e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(str2));
        }
        return str;
    }
}
