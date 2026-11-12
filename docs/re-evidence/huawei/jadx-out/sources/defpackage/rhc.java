package defpackage;

import android.content.Context;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class rhc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f47326b;

    public static void c(Context context, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f47326b = false;
        d();
        if (z) {
            sio.c();
        }
        f47326b = true;
        LogUtil.a("HomeFragmentPreLoader", "preInitCardManager cost: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private static void d() {
        if (fua.b()) {
            tbf.d();
        } else {
            fsb.e();
        }
    }

    public static void d(Context context) {
        LogUtil.a("HomeFragmentPreLoader", "checkCardManagerInited");
        if (f47326b) {
            LogUtil.a("HomeFragmentPreLoader", "async init completed");
        } else {
            c(context);
        }
    }

    private static void c(Context context) {
        d();
        sio.c();
    }
}
