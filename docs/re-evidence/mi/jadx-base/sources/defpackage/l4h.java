package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class l4h {
    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(Object... objArr) {
        return Objects.hash(objArr);
    }

    public static <T> T c(T t) {
        t.getClass();
        return t;
    }

    public static <T> T d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String e(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
