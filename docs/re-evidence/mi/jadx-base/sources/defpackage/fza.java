package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class fza implements dza {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class<?> f18389b;
    public static boolean c;
    public static Method d;
    public static boolean e;
    public static Method f;
    public static boolean g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f18390a;

    public fza(View view) {
        this.f18390a = view;
    }

    public static dza b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = d;
        if (method != null) {
            try {
                return new fza((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return null;
    }

    public static void c() {
        if (e) {
            return;
        }
        try {
            d();
            Method declaredMethod = f18389b.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            d = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        e = true;
    }

    public static void d() {
        if (c) {
            return;
        }
        try {
            f18389b = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException unused) {
        }
        c = true;
    }

    public static void e() {
        if (g) {
            return;
        }
        try {
            d();
            Method declaredMethod = f18389b.getDeclaredMethod("removeGhost", View.class);
            f = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        g = true;
    }

    public static void f(View view) {
        e();
        Method method = f;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    @Override // defpackage.dza
    public void a(ViewGroup viewGroup, View view) {
    }

    @Override // defpackage.dza
    public void setVisibility(int i) {
        this.f18390a.setVisibility(i);
    }
}
