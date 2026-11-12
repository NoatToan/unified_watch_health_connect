package defpackage;

import android.view.View;
import android.view.Window;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class amr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f1224a;

    static {
        try {
            Class cls = Integer.TYPE;
            f1224a = gbk.f(Window.class, "setExtraFlags", cls, cls);
        } catch (Exception unused) {
            f1224a = null;
        }
    }

    public static boolean a(Window window, int i) {
        boolean z = false;
        if (f1224a == null) {
            return false;
        }
        if (i == 0) {
            window.clearFlags(Integer.MIN_VALUE);
        } else {
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            if (i == 1) {
                decorView.setSystemUiVisibility(8208);
            } else {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8209));
            }
        }
        if (i == 0) {
            window.clearFlags(67108864);
        } else {
            window.setFlags(67108864, 67108864);
        }
        try {
            if (i == 0) {
                f1224a.invoke(window, 0, 17);
            } else {
                f1224a.invoke(window, Integer.valueOf(i == 1 ? 17 : 1), 17);
            }
            z = true;
            return true;
        } catch (Exception unused) {
            return z;
        }
    }
}
