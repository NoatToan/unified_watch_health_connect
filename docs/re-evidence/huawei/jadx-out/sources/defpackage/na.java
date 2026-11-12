package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class na {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f42800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f42801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Object f42802c;
    public static Class<?> d;
    public static Method e;
    public static Method j;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            d = cls;
            f42802c = cls.newInstance();
            e = d.getMethod("getUDID", Context.class);
            f42801b = d.getMethod("getOAID", Context.class);
            f42800a = d.getMethod("getVAID", Context.class);
            j = d.getMethod("getAAID", Context.class);
        } catch (Exception e2) {
            Log.e("IdentifierManager", "reflect exception!", e2);
        }
    }

    public static String a(Context context) {
        return e(context, f42801b);
    }

    public static boolean d() {
        return (d == null || f42802c == null) ? false : true;
    }

    public static String e(Context context, Method method) {
        Object obj = f42802c;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception e2) {
            Log.e("IdentifierManager", "invoke exception!", e2);
            return null;
        }
    }
}
