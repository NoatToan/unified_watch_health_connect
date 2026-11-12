package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class yls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static vks f40312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static yks f40313b;

    public static void a(Context context) {
        c("onSendMsg");
        if (g(context)) {
            ims.g(context, System.currentTimeMillis(), d(context));
        }
    }

    public static void b(Context context, gws gwsVar) {
        if (g(context)) {
            if (f40312a == null) {
                f40312a = new vks(context);
            }
            if (f40313b == null) {
                f40313b = new yks(context);
            }
            vks vksVar = f40312a;
            gwsVar.l(vksVar, vksVar);
            yks yksVar = f40313b;
            gwsVar.z(yksVar, yksVar);
            c("startStats");
        }
    }

    public static void c(String str) {
        tks.b("Push-PowerStats", str);
    }

    public static boolean d(Context context) {
        return lzs.q(context);
    }

    public static void e(Context context) {
        c("onReceiveMsg");
        if (g(context)) {
            ims.k(context, System.currentTimeMillis(), d(context));
        }
    }

    public static void f(Context context, gws gwsVar) {
        vks vksVar = f40312a;
        if (vksVar != null) {
            gwsVar.k(vksVar);
            f40312a = null;
        }
        yks yksVar = f40313b;
        if (yksVar != null) {
            gwsVar.y(yksVar);
            f40313b = null;
        }
        c("stopStats");
    }

    public static boolean g(Context context) {
        return tks.c(context);
    }

    public static void h(Context context) {
        c("onPing");
        if (g(context)) {
            ims.l(context, System.currentTimeMillis(), d(context));
        }
    }

    public static void i(Context context) {
        c("onPong");
        if (g(context)) {
            ims.m(context, System.currentTimeMillis(), d(context));
        }
    }
}
