package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class aie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Class f1055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f1056b;
    public static Method c;

    static {
        try {
            f1055a = Class.forName("android.os.SystemProperties");
        } catch (Exception unused) {
            f1055a = null;
        }
        Class cls = f1055a;
        if (cls != null) {
            try {
                Method method = cls.getMethod("get", String.class, String.class);
                f1056b = method;
                method.setAccessible(true);
            } catch (Exception unused2) {
            }
            try {
                Method method2 = f1055a.getMethod("getInt", String.class, Integer.TYPE);
                c = method2;
                method2.setAccessible(true);
            } catch (Exception unused3) {
            }
        }
    }

    public static String a(String str, String str2) {
        Method method = f1056b;
        if (method != null) {
            try {
                return (String) method.invoke(null, str, str2);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("key: ");
                sb.append(str);
                sb.append(" detail:");
                sb.append(e);
            }
        }
        return str2;
    }
}
