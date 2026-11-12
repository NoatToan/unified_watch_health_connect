package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public class y47 {
    public static void a(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static int b(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    public static int c(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Drawable drawable, Drawable.Callback callback, byp bypVar) {
        if (drawable != 0) {
            drawable.setCallback(callback);
            if (drawable instanceof ayp) {
                ((ayp) drawable).i(bypVar);
            }
        }
    }

    public static void e(Drawable drawable, p47 p47Var) {
        if (drawable == null || p47Var == null) {
            return;
        }
        p47Var.a(drawable);
    }
}
