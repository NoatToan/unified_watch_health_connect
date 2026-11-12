package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes7.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f11176a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f11177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f11178c;

    @SuppressLint({"NewApi"})
    public float a(View view2) {
        if (f11176a) {
            try {
                return view2.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f11176a = false;
            }
        }
        return view2.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void b(float f14, View view2) {
        if (f11176a) {
            try {
                view2.setTransitionAlpha(f14);
                return;
            } catch (NoSuchMethodError unused) {
                f11176a = false;
            }
        }
        view2.setAlpha(f14);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void c(int i14, View view2) {
        if (!f11178c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f11177b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f11178c = true;
        }
        Field field = f11177b;
        if (field != null) {
            try {
                f11177b.setInt(view2, i14 | (field.getInt(view2) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
