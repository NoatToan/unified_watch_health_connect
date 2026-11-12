package o4;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/a0;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f128803a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f128804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f128805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f128806d;

    private a0() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(Canvas canvas, boolean z14) {
        Method method;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            b0.f128810a.getClass();
            if (z14) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f128806d) {
            try {
                if (i14 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f128804b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f128805c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f128804b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f128805c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f128804b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f128805c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f128806d = true;
        }
        if (z14) {
            try {
                Method method4 = f128804b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z14 || (method = f128805c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }
}
