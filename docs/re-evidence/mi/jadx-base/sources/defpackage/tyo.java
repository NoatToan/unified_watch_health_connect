package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes9.dex */
public final class tyo extends hfl {
    public static hfl c;
    public static a d;
    public static Handler e;

    public static class a extends HandlerThread {
        public a(String str) {
            super("TSMSchedulers-" + str, 10);
        }
    }

    static {
        a aVar = new a("0");
        d = aVar;
        aVar.start();
        e = new Handler(d.getLooper());
        c = ua1.a(d.getLooper());
    }

    public static void f(Runnable runnable) {
        e.post(runnable);
    }

    public static void g() {
        e.removeCallbacksAndMessages(null);
        d.interrupt();
    }
}
