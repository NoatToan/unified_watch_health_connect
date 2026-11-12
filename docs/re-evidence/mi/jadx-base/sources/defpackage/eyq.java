package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class eyq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f17201a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f17201a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f17201a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f17201a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean b(View view) {
        return c.A(view) == 1;
    }

    public static void c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
