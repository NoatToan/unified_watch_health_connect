package com.garmin.android.apps.connectmobile;

import com.google.maps.android.BuildConfig;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/i2;", "", "<init>", "()V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36769a = new a(null);

    public static final void a(a2 a2Var, String str, String str2) {
        f36769a.getClass();
        a.b(a2Var, str, str2);
    }

    public static final void b(Exception exc) {
        f36769a.getClass();
        a2 a2Var = a2.GENERAL;
        a2Var.getClass();
        gt2.c.b(a2Var.f28756a).debug(a.m("GarminAnalyticsUtil", exc.toString()));
    }

    public static final void c(String str) {
        f36769a.getClass();
        a.a(a2.GENERAL, str);
    }

    public static final void d(String str, String str2) {
        a aVar = f36769a;
        aVar.getClass();
        a.c(aVar, str, str2);
    }

    public static final void e(a2 a2Var, String str, Exception exc) {
        f36769a.getClass();
        a.g(a2Var, str, exc);
    }

    public static final void f(a2 a2Var, String str, String str2) {
        f36769a.getClass();
        a.f(a2Var, str, str2);
    }

    public static final void g(Exception exc, String str) {
        a aVar = f36769a;
        aVar.getClass();
        a.i(aVar, str, exc);
    }

    public static final void h(String str) {
        a aVar = f36769a;
        aVar.getClass();
        a.h(aVar, str);
    }

    public static final void i(String str, String str2) {
        a aVar = f36769a;
        aVar.getClass();
        a.j(aVar, str, str2);
    }

    public static final void j(String str, String str2) {
        a aVar = f36769a;
        aVar.getClass();
        a.l(aVar, str, str2);
    }

    public static final void k(a2 a2Var, String str, String str2) {
        f36769a.getClass();
        a.n(a2Var, str, str2);
    }

    public static final void l(String str, String str2) {
        f36769a.getClass();
        a.n(a2.GENERAL, str, str2);
    }

    public static final void m(a2 a2Var, String str, String str2) {
        f36769a.getClass();
        a.p(a2Var, str, str2);
    }

    public static final void n(String str, String str2) {
        f36769a.getClass();
        a.p(a2.GENERAL, str, str2);
    }

    public static final void o(String str, Throwable th3) {
        f36769a.getClass();
        a2 a2Var = a2.GENERAL;
        a2Var.getClass();
        gt2.c.b(a2Var.f28756a).warn(a.m(str, th3.toString()));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/i2$a;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(a2 a2Var, String str) {
            a2Var.getClass();
            gt2.c.b(a2Var.f28756a).debug(str);
        }

        public static void b(a2 a2Var, String str, String str2) {
            a2Var.getClass();
            gt2.c.b(a2Var.f28756a).debug(m(str, str2));
        }

        public static /* synthetic */ void c(a aVar, String str, String str2) {
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            b(a2Var, str, str2);
        }

        public static void d(a2 a2Var, Exception exc) {
            a2Var.getClass();
            gt2.c.b(a2Var.f28756a).error(exc.toString());
        }

        public static void e(a2 a2Var, String str) {
            a2Var.getClass();
            gt2.c.b(a2Var.f28756a).error(str);
        }

        public static void f(a2 a2Var, String str, String str2) {
            a2Var.getClass();
            gt2.c.b(a2Var.f28756a).error(m(str, str2));
        }

        public static void g(a2 a2Var, String str, Throwable th3) {
            a2Var.getClass();
            gt2.c.b(a2Var.f28756a).error(m(str, th3 != null ? th3.toString() : null));
        }

        public static /* synthetic */ void h(a aVar, String str) {
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            e(a2Var, str);
        }

        public static /* synthetic */ void i(a aVar, String str, Exception exc) {
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            g(a2Var, str, exc);
        }

        public static /* synthetic */ void j(a aVar, String str, String str2) {
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            f(a2Var, str, str2);
        }

        public static void k(a2 a2Var, String str, String str2) {
            a2Var.getClass();
            gt2.c.b(a2Var.f28756a).info(m(str, str2));
        }

        public static /* synthetic */ void l(a aVar, String str, String str2) {
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            k(a2Var, str, str2);
        }

        public static String m(String str, String str2) {
            if (str != null) {
                return e5.g(str, " - ", str2);
            }
            return str2 == null ? BuildConfig.TRAVIS : str2;
        }

        public static void n(a2 a2Var, String str, String str2) {
            a2Var.getClass();
            gt2.c.b(a2Var.f28756a).trace(m(str, str2));
        }

        public static void o(a2 a2Var, String str) {
            a2Var.getClass();
            gt2.c.b(a2Var.f28756a).warn(str);
        }

        public static void p(a2 a2Var, String str, String str2) {
            a2Var.getClass();
            gt2.c.b(a2Var.f28756a).warn(m(str, str2));
        }

        public static /* synthetic */ void q(a aVar, String str) {
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            o(a2Var, str);
        }

        private a() {
        }
    }
}
