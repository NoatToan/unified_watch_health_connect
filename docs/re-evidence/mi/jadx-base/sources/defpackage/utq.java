package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class utq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f36127a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f36128b;
    public static boolean c;

    public static int a(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f36128b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            c = true;
        }
        Method method = f36128b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    public static rtq b(ViewGroup viewGroup) {
        return new qtq(viewGroup);
    }

    @RequiresApi(18)
    @SuppressLint({"NewApi"})
    public static void c(ViewGroup viewGroup, boolean z) {
        if (f36127a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f36127a = false;
            }
        }
    }

    public static void d(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            c(viewGroup, z);
        }
    }
}
