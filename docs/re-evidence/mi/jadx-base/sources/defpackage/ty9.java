package defpackage;

import android.content.Context;
import miuix.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes3.dex */
public class ty9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f35180a = false;

    static {
        try {
            Class.forName("android.view.animation.TranslateWithClipAnimation");
            f35180a = true;
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void a(AppCompatActivity appCompatActivity) {
    }

    public static void b(AppCompatActivity appCompatActivity) {
        appCompatActivity.overridePendingTransition(mgi.i, mgi.j);
    }

    public static void c(AppCompatActivity appCompatActivity) {
        appCompatActivity.overridePendingTransition(mgi.o, mgi.p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(AppCompatActivity appCompatActivity) {
        if (appCompatActivity instanceof irc) {
            return ((irc) appCompatActivity).b();
        }
        if (appCompatActivity.getApplication() instanceof irc) {
            return ((irc) appCompatActivity.getApplication()).b();
        }
        return false;
    }

    public static boolean e(Context context) {
        return zlr.n(context);
    }

    public static boolean f() {
        return f35180a;
    }

    public static void g(AppCompatActivity appCompatActivity, int i) {
        appCompatActivity.getWindow().getDecorView().setTag(vsi.P, Integer.valueOf(i));
    }

    public static int h(AppCompatActivity appCompatActivity) {
        Object tag = appCompatActivity.getWindow().getDecorView().getTag(vsi.P);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public static void i(AppCompatActivity appCompatActivity, boolean z) {
        if (f35180a) {
            if (!z) {
                appCompatActivity.overridePendingTransition(mgi.c, mgi.d);
                return;
            }
            if (d(appCompatActivity)) {
                if (e(appCompatActivity)) {
                    appCompatActivity.overridePendingTransition(mgi.f, mgi.l);
                    return;
                } else {
                    appCompatActivity.overridePendingTransition(mgi.g, mgi.m);
                    return;
                }
            }
            if (e(appCompatActivity)) {
                appCompatActivity.overridePendingTransition(mgi.e, mgi.f26159k);
            } else {
                appCompatActivity.overridePendingTransition(mgi.h, mgi.n);
            }
        }
    }

    public static void j(AppCompatActivity appCompatActivity) {
        if (f35180a) {
            i(appCompatActivity, appCompatActivity.isInFloatingWindowMode());
        } else {
            appCompatActivity.executeOpenEnterAnimation();
        }
    }

    public static void k(AppCompatActivity appCompatActivity) {
        if (f35180a) {
            if (!appCompatActivity.isInFloatingWindowMode()) {
                appCompatActivity.overridePendingTransition(mgi.c, mgi.d);
                return;
            }
            if (d(appCompatActivity)) {
                if (e(appCompatActivity)) {
                    appCompatActivity.overridePendingTransition(mgi.f, mgi.l);
                    return;
                } else {
                    appCompatActivity.overridePendingTransition(mgi.g, mgi.m);
                    return;
                }
            }
            if (e(appCompatActivity)) {
                appCompatActivity.overridePendingTransition(mgi.e, mgi.f26159k);
            } else {
                appCompatActivity.overridePendingTransition(mgi.h, mgi.n);
            }
        }
    }
}
