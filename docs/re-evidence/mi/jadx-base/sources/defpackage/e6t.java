package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.j1;
import com.xiaomi.fitness.settingitem.BaseSettingRequestHelper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class e6t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f16334a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f16335b = false;
    public static WeakReference<z5t> c = null;
    public static int d = 20;
    public static int e = 10;
    public static int f;

    @Deprecated
    public static synchronized void b(int i, boolean z) {
        f16334a = i;
        f16335b = z;
    }

    public static synchronized void c(int i, boolean z, int i2, int i3) {
        try {
            f16334a = i;
            f16335b = z;
            if (i2 < 10 || i2 > 100) {
                i2 = 20;
            }
            d = i2;
            if (i2 / 5 > e) {
                e = i2 / 5;
            }
            f = i3;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void d(Context context) {
        j1.h().b(new a(context, 2));
    }

    public static synchronized void e(d6t d6tVar, Context context) {
        j1.h().b(new a(context, d6tVar));
    }

    public static class a extends f7t {
        public int d;
        public Context e;
        public d6t g;

        public a(Context context, d6t d6tVar) {
            this(context, 1);
            this.g = d6tVar;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            int i = this.d;
            if (i == 1) {
                try {
                    synchronized (e6t.class) {
                        try {
                            String string = Long.toString(System.currentTimeMillis());
                            z5t z5tVarE = h6t.e(e6t.c);
                            h6t.f(this.e, z5tVarE, k2t.f, e6t.f16334a, 2097152, "6");
                            if (z5tVarE.e == null) {
                                z5tVarE.e = new l4t(new n4t(new o4t(new n4t())));
                            }
                            b6t.b(string, this.g.b(), z5tVarE);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    m2t.r(th2, "ofm", "aple");
                    return;
                }
            }
            if (i == 2) {
                try {
                    z5t z5tVarE2 = h6t.e(e6t.c);
                    h6t.f(this.e, z5tVarE2, k2t.f, e6t.f16334a, 2097152, "6");
                    z5tVarE2.h = BaseSettingRequestHelper.UPDATE_SETTING_INTERVAL;
                    if (z5tVarE2.g == null) {
                        l4t l4tVar = new l4t(new n4t(new o4t()));
                        Context context = this.e;
                        p6t p6tVar = new p6t();
                        String str = new String(t1t.c());
                        f1t.a(this.e);
                        z5tVarE2.g = new l6t(new k6t(context, p6tVar, l4tVar, str, e0t.k(this.e), h0t.N(), h0t.G(), h0t.D(this.e), h0t.m(), Build.MANUFACTURER, Build.DEVICE, h0t.R(), e0t.g(this.e), Build.MODEL, e0t.i(this.e), e0t.e(this.e), h0t.B(this.e), h0t.n(this.e), String.valueOf(Build.VERSION.SDK_INT), f1t.b()));
                    }
                    if (TextUtils.isEmpty(z5tVarE2.i)) {
                        z5tVarE2.i = "fKey";
                    }
                    Context context2 = this.e;
                    z5tVarE2.f = new u6t(context2, z5tVarE2.h, z5tVarE2.i, new s6t(context2, e6t.f16335b, e6t.e * 1024, e6t.d * 1024, "offLocKey", e6t.f * 1024));
                    b6t.a(z5tVarE2);
                } catch (Throwable th3) {
                    m2t.r(th3, "ofm", "uold");
                }
            }
        }

        public a(Context context, int i) {
            this.e = context;
            this.d = i;
        }
    }
}
