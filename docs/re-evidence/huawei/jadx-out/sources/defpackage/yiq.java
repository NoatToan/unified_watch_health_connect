package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes46.dex */
public class yiq {
    public static <T> T c(T t, Object obj) {
        if (t != null) {
            return t;
        }
        yit.b("ServicePreconditions", String.valueOf(obj));
        throw new IllegalStateException(String.valueOf(5));
    }

    public static String e(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        yit.b("ServicePreconditions", String.valueOf(obj));
        throw new IllegalArgumentException(String.valueOf(obj));
    }
}
