package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class ms {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f42332b;

    public static String e(Context context) {
        mv mvVarC = mv.c();
        return mvVarC.b(context.getApplicationContext(), mvVarC.e);
    }

    public static final boolean e() {
        Context context = null;
        try {
            if (f42332b == null) {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]);
                f42332b = method;
                method.setAccessible(true);
            }
            context = (Context) f42332b.invoke(null, new Object[0]);
        } catch (Exception e) {
            Log.e("OpenIdHelper", "ActivityThread:currentApplication --> " + e.toString());
        }
        if (context == null) {
            return false;
        }
        return mv.c().d(context, false);
    }
}
