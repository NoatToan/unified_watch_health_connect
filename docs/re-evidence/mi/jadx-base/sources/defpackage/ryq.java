package defpackage;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class ryq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f33076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f33077b;

    public void a(View view) {
        throw null;
    }

    public float b(View view) {
        throw null;
    }

    public void c(View view) {
        throw null;
    }

    public void d(View view, Matrix matrix) {
        throw null;
    }

    public void e(View view, int i, int i2, int i3, int i4) {
        throw null;
    }

    public void f(View view, float f) {
        throw null;
    }

    public void g(View view, int i) {
        if (!f33077b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f33076a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f33077b = true;
        }
        Field field = f33076a;
        if (field != null) {
            try {
                f33076a.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }

    public void i(View view, Matrix matrix) {
        throw null;
    }
}
