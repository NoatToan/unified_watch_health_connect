package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class g8s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f18737a;

    public static j7s a(Context context) {
        if (y0t.i()) {
            f18737a = 1;
            return new c8s(context);
        }
        if (t6s.h(context)) {
            f18737a = 2;
            return new t6s(context);
        }
        if (o8s.j(context)) {
            f18737a = 4;
            return new o8s(context);
        }
        if (xas.c(context)) {
            f18737a = 5;
            return new xas(context);
        }
        if (y7s.b(context)) {
            f18737a = 3;
            return new p7s(context);
        }
        f18737a = 0;
        return new uas();
    }
}
