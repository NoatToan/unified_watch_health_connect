package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class iy {
    public static int a = 1000;
    public static boolean b = false;
    public static int c = 20;
    public static int d = 0;
    private static WeakReference<iu> e = null;
    private static int f = 10;

    @Deprecated
    public static synchronized void a(int i, boolean z) {
        a = i;
        b = z;
    }

    public static class a implements Runnable {
        private int a;
        private Context b;
        private ix c;

        public a(Context context, int i) {
            this.b = context;
            this.a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.a;
            if (i == 1) {
                try {
                    synchronized (iy.class) {
                        try {
                            String string = Long.toString(System.currentTimeMillis());
                            iu iuVarA = jb.a(iy.e);
                            jb.a(this.b, iuVarA, hl.i, iy.a, 2097152, "6");
                            if (iuVarA.e == null) {
                                iuVarA.e = new id(new Cif(new ig(new Cif())));
                            }
                            iv.a(string, this.c.a(), iuVarA);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    hn.c(th2, "ofm", "aple");
                    return;
                }
            }
            if (i == 2) {
                try {
                    iu iuVarA2 = jb.a(iy.e);
                    jb.a(this.b, iuVarA2, hl.i, iy.a, 2097152, "6");
                    iuVarA2.h = 14400000;
                    if (iuVarA2.g == null) {
                        iuVarA2.g = new jf(new je(this.b, new jj(), new id(new Cif(new ig())), new String(hj.a(10)), gj.f(this.b), gn.u(this.b), gn.m(this.b), gn.h(this.b), gn.a(), Build.MANUFACTURER, Build.DEVICE, gn.x(this.b), gj.c(this.b), Build.MODEL, gj.d(this.b), gj.b(this.b)));
                    }
                    if (TextUtils.isEmpty(iuVarA2.i)) {
                        iuVarA2.i = "fKey";
                    }
                    Context context = this.b;
                    iuVarA2.f = new jn(context, iuVarA2.h, iuVarA2.i, new jl(context, iy.b, iy.f * 1024, iy.c * 1024, "offLocKey", iy.d * 1024));
                    iv.a(iuVarA2);
                } catch (Throwable th3) {
                    hn.c(th3, "ofm", "uold");
                }
            }
        }

        public a(Context context, ix ixVar) {
            this(context, 1);
            this.c = ixVar;
        }
    }

    public static synchronized void a(ix ixVar, Context context) {
        hn.d().submit(new a(context, ixVar));
    }

    public static void a(Context context) {
        hn.d().submit(new a(context, 2));
    }
}
