package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class y7s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f39908a = false;

    public static void a(Class<?> cls, Context context) {
        if (f39908a) {
            return;
        }
        try {
            f39908a = true;
            cls.getDeclaredMethod("InitEntry", Context.class).invoke(cls, context);
        } catch (Throwable th) {
            x9s.o("mdid:load lib error " + th);
        }
    }

    public static boolean b(Context context) {
        try {
            Class<?> clsC = odt.c(context, "com.bun.miitmdid.core.JLibrary");
            if (clsC == null) {
                return false;
            }
            a(clsC, context);
            return true;
        } catch (Throwable th) {
            x9s.o("mdid:check error " + th);
            return false;
        }
    }
}
