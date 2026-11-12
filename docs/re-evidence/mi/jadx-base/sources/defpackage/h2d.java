package defpackage;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class h2d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Object f19607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class<?> f19608b;
    public static Method c;
    public static Method d;
    public static Method e;
    public static Method f;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f19608b = cls;
            f19607a = cls.newInstance();
            c = f19608b.getMethod("getUDID", Context.class);
            d = f19608b.getMethod("getOAID", Context.class);
            e = f19608b.getMethod("getVAID", Context.class);
            f = f19608b.getMethod("getAAID", Context.class);
        } catch (Exception unused) {
        }
    }

    public static String a(Context context) {
        return c(context, d);
    }

    public static String b(Context context) {
        return c(context, e);
    }

    public static String c(Context context, Method method) {
        Object obj = f19607a;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
