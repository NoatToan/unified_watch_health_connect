package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes20.dex */
public class xeq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Method f52793a;
    private static final Method aa;
    private static final Method ac;
    private static final Method ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Object f52794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f52795c;
    private static final Method d;
    private static final Method e;
    private static final Method f;
    private static final Method g;
    private static final Method h;
    private static xeq i = new xeq();
    private static final Method j;
    private static final Method k;
    private static final Method l;
    private static final Method m;
    private static final Method n;
    private static final Method o;
    private static final Method p;
    private static final Method q;
    private static final Method r;
    private static final Method s;
    private static final Method t;
    private static final Method u;
    private static final Method v;
    private static final Method w;
    private static final Method x;
    private static final Method y;
    private static final Method z;

    static {
        Class<?> cls;
        if (Build.VERSION.SDK_INT < 28) {
            f = null;
            g = null;
            h = null;
            j = null;
            m = null;
            l = null;
            n = null;
            o = null;
            k = null;
            r = null;
            s = null;
            p = null;
            t = null;
            q = null;
            w = null;
            u = null;
            v = null;
            x = null;
            y = null;
            ad = null;
            aa = null;
            ac = null;
            z = null;
            f52795c = null;
            e = null;
            d = null;
            f52793a = null;
            return;
        }
        try {
            cls = Class.forName("huawei.android.widget.effect.engine.HwBlurEngine$BlurType");
        } catch (ClassNotFoundException unused) {
            Log.e("HwBlurEngine", "BlurType class not found");
            cls = null;
        }
        f = xeh.c("getInstance", (Class[]) null, "huawei.android.widget.effect.engine.HwBlurEngine");
        g = xeh.c("getInstance", new Class[]{View.class, cls}, "huawei.android.widget.effect.engine.HwBlurEngine");
        h = xeh.c("isEnable", (Class[]) null, "huawei.android.widget.effect.engine.HwBlurEngine");
        Class cls2 = Boolean.TYPE;
        j = xeh.c("setGlobalEnable", new Class[]{cls2}, "huawei.android.widget.effect.engine.HwBlurEngine");
        m = xeh.c("setEnable", new Class[]{cls2}, "huawei.android.widget.effect.engine.HwBlurEngine");
        l = xeh.c("onAttachedToWindow", (Class[]) null, "huawei.android.widget.effect.engine.HwBlurEngine");
        n = xeh.c("onDetachedFromWindow", (Class[]) null, "huawei.android.widget.effect.engine.HwBlurEngine");
        o = xeh.c("draw", new Class[]{Canvas.class}, "huawei.android.widget.effect.engine.HwBlurEngine");
        k = xeh.c("draw", new Class[]{Canvas.class, View.class}, "huawei.android.widget.effect.engine.HwBlurEngine");
        r = xeh.c("setBlurEnable", new Class[]{cls2}, "huawei.android.widget.effect.engine.HwBlurEngine");
        s = xeh.c("isBlurEnable", (Class[]) null, "huawei.android.widget.effect.engine.HwBlurEngine");
        p = xeh.c("isShowHwBlur", (Class[]) null, "huawei.android.widget.effect.engine.HwBlurEngine");
        t = xeh.c("isShowHwBlur", new Class[]{View.class}, "huawei.android.widget.effect.engine.HwBlurEngine");
        q = xeh.c("onWindowVisibilityChanged", new Class[]{View.class, cls2, cls2}, "huawei.android.widget.effect.engine.HwBlurEngine");
        w = xeh.c("onWindowVisibilityChanged", new Class[]{View.class, cls2}, "huawei.android.widget.effect.engine.HwBlurEngine");
        u = xeh.c("onWindowFocusChanged", new Class[]{View.class, cls2, cls2}, "huawei.android.widget.effect.engine.HwBlurEngine");
        Class cls3 = Integer.TYPE;
        v = xeh.c("blur", new Class[]{View.class, cls3, cls3}, "huawei.android.widget.effect.engine.HwBlurEngine");
        x = xeh.c("blur", new Class[]{Bitmap.class, cls3, cls3}, "huawei.android.widget.effect.engine.HwBlurEngine");
        y = xeh.c("addBlurTargetView", new Class[]{View.class, cls}, "huawei.android.widget.effect.engine.HwBlurEngine");
        ad = xeh.c("removeBlurTargetView", new Class[]{View.class}, "huawei.android.widget.effect.engine.HwBlurEngine");
        aa = xeh.c("isDrawingViewSelf", (Class[]) null, "huawei.android.widget.effect.engine.HwBlurEngine");
        ac = xeh.c("setTargetViewCornerRadius", new Class[]{View.class, cls3}, "huawei.android.widget.effect.engine.HwBlurEngine");
        z = xeh.c("setTargetViewBlurEnable", new Class[]{View.class, cls2}, "huawei.android.widget.effect.engine.HwBlurEngine");
        f52795c = xeh.c("setTargetViewOverlayColor", new Class[]{View.class, cls3}, "huawei.android.widget.effect.engine.HwBlurEngine");
        e = xeh.c("isShowBlur", new Class[]{Context.class}, "huawei.android.widget.effect.engine.HwBlurEngine");
        d = xeh.c("isThemeSupportedBlurEffect", new Class[]{Context.class}, "huawei.android.widget.effect.engine.HwBlurEngine");
        f52793a = xeh.c("isSettingEnabledBlurEffect", new Class[]{Context.class}, "huawei.android.widget.effect.engine.HwBlurEngine");
    }

    private static Object d(int i2) {
        try {
            Object[] enumConstants = Class.forName("huawei.android.widget.effect.engine.HwBlurEngine$BlurType").getEnumConstants();
            int i3 = i2 - 1;
            if (enumConstants == null || i3 < 0 || i3 >= enumConstants.length) {
                return null;
            }
            return enumConstants[i3];
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void b(View view) {
        Method method;
        Object obj = f52794b;
        if (obj == null || (method = ad) == null) {
            return;
        }
        xeh.c(obj, method, new Object[]{view});
    }

    public boolean b() {
        Method method;
        Object obj = f52794b;
        if (obj == null || (method = p) == null) {
            return false;
        }
        return c(xeh.c(obj, method));
    }

    public void c(View view, int i2) {
        Method method;
        if (f52794b == null || (method = y) == null) {
            return;
        }
        xeh.c(f52794b, method, new Object[]{view, d(i2)});
    }

    public void d(View view, boolean z2) {
        Method method;
        Object obj = f52794b;
        if (obj == null || (method = z) == null) {
            return;
        }
        xeh.c(obj, method, new Object[]{view, Boolean.valueOf(z2)});
    }

    public void e(View view, int i2) {
        Method method;
        Object obj = f52794b;
        if (obj == null || (method = f52795c) == null) {
            return;
        }
        xeh.c(obj, method, new Object[]{view, Integer.valueOf(i2)});
    }

    public void c(Canvas canvas, View view) {
        Method method;
        Object obj = f52794b;
        if (obj == null || (method = k) == null) {
            return;
        }
        xeh.c(obj, method, new Object[]{canvas, view});
    }

    public boolean c(View view) {
        Method method;
        Object obj = f52794b;
        if (obj == null || (method = t) == null) {
            return false;
        }
        return c(xeh.c(obj, method, new Object[]{view}));
    }

    private static boolean c(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public static xeq c() {
        xeq xeqVar;
        synchronized (xeq.class) {
            Method method = f;
            if (method != null && f52794b == null) {
                f52794b = xeh.d(method);
            }
            xeqVar = i;
        }
        return xeqVar;
    }
}
