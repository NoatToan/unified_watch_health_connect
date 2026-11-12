package com.loc;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public class az {
    public static int a = 1000;
    public static boolean b = false;
    public static int c = 20;
    public static int d = 0;
    private static WeakReference<aw> e = null;
    private static int f = 10;

    public static class a implements Runnable {
        private int a;
        private Context b;
        private ay c;

        public a(Context context, int i) {
            this.b = context;
            this.a = i;
        }

        public a(Context context, ay ayVar) {
            this(context, 1);
            this.c = ayVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.a;
            if (i == 1) {
                try {
                    synchronized (az.class) {
                        try {
                            String string = Long.toString(System.currentTimeMillis());
                            aw awVarA = bc.a(az.e);
                            bc.a(this.b, awVarA, z.i, az.a, 2097152, "6");
                            if (awVarA.e == null) {
                                awVarA.e = new aj(new al(new an(new al())));
                            }
                            ax.a(string, this.c.a(), awVarA);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    ab.b(th2, "ofm", "aple");
                    return;
                }
            }
            if (i == 2) {
                try {
                    aw awVarA2 = bc.a(az.e);
                    bc.a(this.b, awVarA2, z.i, az.a, 2097152, "6");
                    awVarA2.h = 14400000;
                    if (awVarA2.g == null) {
                        awVarA2.g = new bg(new bf(this.b, new bk(), new aj(new al(new an())), new String(v.a(10)), k.f(this.b), n.w(this.b), n.m(this.b), n.h(this.b), n.a(), Build.MANUFACTURER, Build.DEVICE, n.z(this.b), k.c(this.b), Build.MODEL, k.d(this.b), k.b(this.b)));
                    }
                    if (TextUtils.isEmpty(awVarA2.i)) {
                        awVarA2.i = "fKey";
                    }
                    Context context = this.b;
                    awVarA2.f = new bo(context, awVarA2.h, awVarA2.i, new bm(context, az.b, az.f * 1024, az.c * 1024, "offLocKey", az.d * 1024));
                    ax.a(awVarA2);
                } catch (Throwable th3) {
                    ab.b(th3, "ofm", "uold");
                }
            }
        }
    }

    public static synchronized void a(int i, boolean z, int i2, int i3) {
        a = i;
        b = z;
        if (i2 < 10 || i2 > 100) {
            i2 = 20;
        }
        c = i2;
        if (i2 / 5 > f) {
            f = i2 / 5;
        }
        d = i3;
    }

    public static void a(Context context) {
        ab.d().submit(new a(context, 2));
    }

    public static synchronized void a(ay ayVar, Context context) {
        ab.d().submit(new a(context, ayVar));
    }
}
