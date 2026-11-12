package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.view.Window;
import android.view.WindowManager;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class tc8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ez6 f34562b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Point f34561a = new Point(-1, -1);
    public static final ConcurrentHashMap<Integer, rkr> c = new ConcurrentHashMap<>();
    public static final Object d = new Object();
    public static final Object e = new Object();
    public static final Object f = new Object();
    public static volatile Boolean g = null;
    public static volatile int h = -1;
    public static volatile int i = -1;
    public static volatile int j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile int f34563k = -1;

    public static void A(Configuration configuration, rkr rkrVar) {
        a(configuration);
        int i2 = configuration.densityDpi;
        float f2 = i2 / 160.0f;
        float f3 = (f34562b.d * 1.0f) / i2;
        rkrVar.e = f2;
        float f4 = f2 * f3;
        rkrVar.c.set(s6g.c(f4, configuration.screenWidthDp), s6g.c(f4, configuration.screenHeightDp));
        rkrVar.d.set(Math.round(configuration.screenWidthDp * f3), Math.round(configuration.screenHeightDp * f3));
        Point point = rkrVar.d;
        rkrVar.f = ssk.c(point.x, point.y);
        rkrVar.f32648a = false;
    }

    public static void a(Configuration configuration) {
        if (f34562b == null) {
            f34562b = new ez6(configuration);
        }
    }

    public static rkr b(Context context) {
        return c(context, true);
    }

    public static rkr c(Context context, boolean z) {
        int iHashCode = context.getResources().hashCode();
        ConcurrentHashMap<Integer, rkr> concurrentHashMap = c;
        rkr rkrVar = concurrentHashMap.get(Integer.valueOf(iHashCode));
        if (rkrVar == null) {
            rkrVar = new rkr();
            if (z) {
                concurrentHashMap.put(Integer.valueOf(iHashCode), rkrVar);
            }
        }
        return rkrVar;
    }

    public static int d(Context context, boolean z) {
        if (j == -1) {
            synchronized (f) {
                try {
                    if (j == -1) {
                        j = s6g.h(context);
                        f34563k = (int) (j / (context.getResources().getConfiguration().densityDpi / 160.0f));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z ? f34563k : j;
    }

    public static int e(Context context) {
        Point pointF = f(context);
        return Math.min(pointF.x, pointF.y);
    }

    public static Point f(Context context) {
        Point point = f34561a;
        if (p(point)) {
            w(zlr.h(context), context);
        }
        return point;
    }

    public static int g(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        a(configuration);
        return (int) (configuration.smallestScreenWidthDp * ((f34562b.d * 1.0f) / configuration.densityDpi));
    }

    public static int h(Context context, boolean z) {
        if (h == -1) {
            synchronized (e) {
                try {
                    if (h == -1) {
                        h = s6g.k(context);
                        i = (int) (h / (context.getResources().getConfiguration().densityDpi / 160.0f));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z ? i : h;
    }

    public static rkr i(Context context) {
        return k(context, null, false);
    }

    public static rkr j(Context context, Configuration configuration) {
        return k(context, configuration, false);
    }

    public static rkr k(Context context, Configuration configuration, boolean z) {
        rkr rkrVarB = b(context);
        x(context, rkrVarB, configuration, z);
        return rkrVarB;
    }

    public static Point l(Context context) {
        rkr rkrVarB = b(context);
        if (rkrVarB.f32648a) {
            z(context, rkrVarB);
        }
        return rkrVarB.c;
    }

    public static void m(Application application) {
        f34562b = new ez6(application.getResources().getConfiguration());
    }

    public static boolean n(Context context) {
        return pgl.b(b(context).g);
    }

    public static boolean o(Context context) {
        if (g == null) {
            synchronized (d) {
                try {
                    if (g == null) {
                        g = Boolean.valueOf(s6g.n(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g.booleanValue();
    }

    public static boolean p(Point point) {
        return point.x == -1 && point.y == -1;
    }

    public static void q(Context context) {
        Point point = f34561a;
        synchronized (point) {
            r(point);
        }
        synchronized (d) {
            g = null;
        }
        synchronized (f) {
            j = -1;
            f34563k = -1;
        }
        synchronized (e) {
            h = -1;
            i = -1;
        }
    }

    public static void r(Point point) {
        if (point.x == -1 && point.y == -1) {
            return;
        }
        point.x = -1;
        point.y = -1;
    }

    public static void s(rkr rkrVar) {
        rkrVar.f32649b = true;
        rkrVar.f32648a = true;
    }

    public static synchronized void t(Context context) {
        s(b(context));
    }

    public static void u(Context context) {
        c.remove(Integer.valueOf(context.getResources().hashCode()));
    }

    public static void v(ez6 ez6Var) {
        f34562b = ez6Var;
    }

    public static void w(WindowManager windowManager, Context context) {
        Point point = f34561a;
        synchronized (point) {
            zlr.d(windowManager, context, point);
        }
    }

    public static void x(Context context, rkr rkrVar, Configuration configuration, boolean z) {
        Window window;
        boolean z2;
        if (rkrVar == null) {
            return;
        }
        if (rkrVar.f32648a || z) {
            if (configuration != null) {
                A(configuration, rkrVar);
            } else {
                z(context, rkrVar);
            }
            if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null) {
                if (window.getAttributes().width < 0 || rkrVar.c.x == window.getAttributes().width) {
                    z2 = false;
                } else {
                    rkrVar.c.x = window.getAttributes().width;
                    z2 = true;
                }
                if (window.getAttributes().height >= 0 && rkrVar.c.y != window.getAttributes().height) {
                    rkrVar.c.y = window.getAttributes().height;
                } else if (z2) {
                }
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                float f2 = configuration.densityDpi / 160.0f;
                rkrVar.d.set(s6g.t(f2, rkrVar.c.x), s6g.t(f2, rkrVar.c.y));
                Point point = rkrVar.d;
                rkrVar.f = ssk.c(point.x, point.y);
            }
        }
        if (rkrVar.f32649b || z) {
            y(context, rkrVar);
        }
    }

    public static void y(Context context, rkr rkrVar) {
        if (rkrVar.f32648a) {
            z(context, rkrVar);
        }
        pgl.a(context, rkrVar, f(context));
        rkrVar.f32649b = false;
    }

    public static void z(Context context, rkr rkrVar) {
        zlr.j(context, rkrVar.c);
        float f2 = context.getResources().getConfiguration().densityDpi / 160.0f;
        rkrVar.e = f2;
        rkrVar.d.set(s6g.t(f2, rkrVar.c.x), s6g.t(f2, rkrVar.c.y));
        Point point = rkrVar.d;
        rkrVar.f = ssk.c(point.x, point.y);
        rkrVar.f32648a = false;
    }
}
