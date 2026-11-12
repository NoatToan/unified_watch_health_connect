package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class lh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static int f3049a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f3050b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static int f3051c = 20;
    static int d = 0;
    private static WeakReference<ld> e = null;
    private static int f = 10;

    @Deprecated
    public static void a(int i, boolean z) {
        synchronized (lh.class) {
            f3049a = i;
            f3050b = z;
        }
    }

    public static void a(int i, boolean z, int i2, int i3) {
        synchronized (lh.class) {
            f3049a = i;
            f3050b = z;
            if (i2 < 10 || i2 > 100) {
                i2 = 20;
            }
            f3051c = i2;
            if (i2 / 5 > f) {
                f = i2 / 5;
            }
            d = i3;
        }
    }

    static final class a extends mb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f3053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private lg f3054c;

        a(Context context, int i) {
            this.f3053b = context;
            this.f3052a = i;
        }

        a(Context context, lg lgVar) {
            this(context, 1);
            this.f3054c = lgVar;
        }

        @Override // com.amap.api.col.p0003sl.mb
        public final void runTask() {
            ld ldVar;
            int i = this.f3052a;
            if (i == 1) {
                try {
                    synchronized (lh.class) {
                        String string = Long.toString(System.currentTimeMillis());
                        ld ldVarA = lk.a(lh.e);
                        lk.a(this.f3053b, ldVarA, jt.i, lh.f3049a, 2097152, "6");
                        if (ldVarA.e == null) {
                            ldVarA.e = new kl(new kn(new ko(new kn())));
                        }
                        le.a(string, this.f3054c.a(), ldVarA);
                    }
                    return;
                } catch (Throwable th) {
                    jv.c(th, "ofm", "aple");
                    return;
                }
            }
            if (i != 2) {
                return;
            }
            try {
                ld ldVarA2 = lk.a(lh.e);
                lk.a(this.f3053b, ldVarA2, jt.i, lh.f3049a, 2097152, "6");
                ldVarA2.h = 14400000;
                if (ldVarA2.g == null) {
                    try {
                        kl klVar = new kl(new kn(new ko()));
                        Context context = this.f3053b;
                        ls lsVar = new ls();
                        String str = new String(jg.a());
                        String strF = il.f(this.f3053b);
                        String strK = ip.k();
                        String strH = ip.h();
                        String strF2 = ip.f(this.f3053b);
                        String strA = ip.a();
                        String str2 = Build.MANUFACTURER;
                        String str3 = Build.DEVICE;
                        String strN = ip.n();
                        String strC = il.c(this.f3053b);
                        String str4 = Build.MODEL;
                        String strD = il.d(this.f3053b);
                        String strB = il.b(this.f3053b);
                        String strE = ip.e(this.f3053b);
                        String strA2 = ip.a(this.f3053b);
                        int i2 = Build.VERSION.SDK_INT;
                        ja.a(this.f3053b);
                        ldVar = ldVarA2;
                        ldVar.g = new lo(new ln(context, lsVar, klVar, str, strF, strK, strH, strF2, strA, str2, str3, strN, strC, str4, strD, strB, strE, strA2, String.valueOf(i2), ja.a()));
                    } catch (Throwable th2) {
                        th = th2;
                        jv.c(th, "ofm", "uold");
                    }
                } else {
                    ldVar = ldVarA2;
                }
                if (TextUtils.isEmpty(ldVar.i)) {
                    ldVar.i = "fKey";
                }
                try {
                    ldVar.f = new lw(this.f3053b, ldVar.h, ldVar.i, new lu(this.f3053b, lh.f3050b, lh.f * 1024, lh.f3051c * 1024, "offLocKey", lh.d * 1024));
                    le.a(ldVar);
                } catch (Throwable th3) {
                    th = th3;
                    jv.c(th, "ofm", "uold");
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void a(lg lgVar, Context context) {
        synchronized (lh.class) {
            ma.a().a(new a(context, lgVar));
        }
    }

    public static void a(Context context) {
        ma.a().a(new a(context, 2));
    }
}
