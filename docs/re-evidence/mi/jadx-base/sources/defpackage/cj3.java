package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class cj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f5393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f5394b;
    public static boolean c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f5393a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                f5394b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            c = true;
        }
        if (z) {
            try {
                Method method2 = f5393a;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        if (z || (method = f5394b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}
