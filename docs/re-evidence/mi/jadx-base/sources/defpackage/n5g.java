package defpackage;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import java.lang.reflect.Method;
import miuix.core.util.SystemProperties;

/* JADX INFO: loaded from: classes3.dex */
public class n5g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f27567a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f27568b;
    public static Boolean c;
    public static Method d;
    public static Method e;
    public static Method f;
    public static Method g;
    public static Method h;

    static {
        if (Build.VERSION.SDK_INT < 33 || !f27567a) {
            f27568b = Boolean.FALSE;
        } else {
            f27568b = Boolean.valueOf(SystemProperties.get("persist.sys.background_blur_supported", "false"));
        }
    }

    public static boolean a(View view, int i, int i2) {
        if (!f27568b.booleanValue() || !e(view.getContext())) {
            return false;
        }
        try {
            if (f == null) {
                Class cls = Integer.TYPE;
                f = View.class.getMethod("addMiBackgroundBlendColor", cls, cls);
            }
            f.invoke(view, Integer.valueOf(i), Integer.valueOf(i2));
            return true;
        } catch (Exception unused) {
            f = null;
            return false;
        }
    }

    public static boolean b(View view) {
        if (!f27568b.booleanValue()) {
            return false;
        }
        try {
            if (g == null) {
                g = View.class.getMethod("clearMiBackgroundBlendColor", new Class[0]);
            }
            g.invoke(view, new Object[0]);
            return true;
        } catch (Exception unused) {
            g = null;
            return false;
        }
    }

    public static boolean c(View view) {
        if (i(view, 0)) {
            return j(view, 0);
        }
        return false;
    }

    public static synchronized void d() {
        c = null;
    }

    public static synchronized boolean e(Context context) {
        try {
            if (!f27568b.booleanValue()) {
                return false;
            }
            if (context == null) {
                return false;
            }
            if (c == null) {
                c = Boolean.valueOf(Settings.Secure.getInt(context.getContentResolver(), "background_blur_enable", 0) == 1);
            }
            return c.booleanValue();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean f() {
        return f27568b.booleanValue();
    }

    public static boolean g(View view, int i, int i2) {
        if (!f27568b.booleanValue() || !e(view.getContext())) {
            return false;
        }
        if (i > 400) {
            i = 400;
        }
        try {
            if (d == null) {
                d = View.class.getMethod("setMiBackgroundBlurMode", Integer.TYPE);
            }
            if (e == null) {
                e = View.class.getMethod("setMiBackgroundBlurRadius", Integer.TYPE);
            }
            d.invoke(view, 1);
            e.invoke(view, Integer.valueOf(i));
            return j(view, i2);
        } catch (Exception unused) {
            d = null;
            e = null;
            return false;
        }
    }

    public static boolean h(View view, int i, boolean z) {
        return g(view, i, z ? 2 : 1);
    }

    public static boolean i(View view, int i) {
        if (!f27568b.booleanValue()) {
            return false;
        }
        try {
            if (d == null) {
                d = View.class.getMethod("setMiBackgroundBlurMode", Integer.TYPE);
            }
            d.invoke(view, Integer.valueOf(i));
            return true;
        } catch (Exception unused) {
            d = null;
            return false;
        }
    }

    public static boolean j(View view, int i) {
        if (!f27568b.booleanValue()) {
            return false;
        }
        try {
            if (h == null) {
                h = View.class.getMethod("setMiViewBlurMode", Integer.TYPE);
            }
            h.invoke(view, Integer.valueOf(i));
            return true;
        } catch (Exception unused) {
            h = null;
            return false;
        }
    }
}
