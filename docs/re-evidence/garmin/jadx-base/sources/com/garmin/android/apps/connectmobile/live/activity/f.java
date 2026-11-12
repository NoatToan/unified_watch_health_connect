package com.garmin.android.apps.connectmobile.live.activity;

import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import ns.a2;
import ns.b0;
import ns.d0;
import ns.e2;
import ns.h2;
import ns.s1;
import ns.u1;
import ns.v1;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/live/activity/f;", "Lah2/d;", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements ah2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f38409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ns.h f38412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ns.p f38413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e2 f38414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f38415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s1 f38416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u1 f38417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f38418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b0 f38419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v1 f38420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h2 f38421m;

    public f(l22.b bVar) {
        bVar.getClass();
        this.f38409a = bVar;
        this.f38410b = bVar.getString(R.string.no_value);
        this.f38411c = bVar.getString(R.string.no_duration_value);
        this.f38412d = new ns.h(bVar, null, 2, null);
        this.f38413e = new ns.p(bVar, false, false, null, null, 30, null);
        this.f38414f = new e2(bVar, false, null, 6, null);
        this.f38415g = new a2(bVar, null, 2, null);
        this.f38416h = new s1(bVar, null, 2, null);
        this.f38417i = new u1(bVar, u1.a.Total, null, 4, null);
        this.f38418j = new d0(bVar, null, 2, null);
        this.f38419k = new b0(bVar, null, 2, null);
        this.f38420l = new v1(bVar, null, 2, null);
        this.f38421m = new h2(bVar, null, 2, null);
    }

    @Override // ah2.h
    public final String A(Float f14, boolean z14, boolean z15) {
        return o(f14, z14, z15);
    }

    @Override // ah2.h
    public final String a(Float f14, boolean z14) {
        return r(f14, z14);
    }

    @Override // ah2.h
    public final String c(Float f14) {
        String strC = u00.b.c(this.f38417i, Integer.valueOf((int) f14.floatValue()), 0, 6);
        return strC == null ? this.f38410b : strC;
    }

    @Override // ah2.h
    public final String d(Float f14) {
        String strC = u00.b.c(this.f38415g, f14 != null ? Integer.valueOf((int) f14.floatValue()) : null, 64, 4);
        return strC == null ? this.f38410b : strC;
    }

    @Override // ah2.h
    public final String e(Float f14) {
        String str = this.f38410b;
        if (f14 == null) {
            return str;
        }
        double dFloatValue = f14.floatValue();
        l3.f23124b.getClass();
        return l3.a.E0(this.f38409a, dFloatValue, true, str);
    }

    @Override // ah2.h
    public final String f(Float f14) {
        return f14 != null ? s.a(this, f14.floatValue()) : this.f38410b;
    }

    @Override // ah2.h
    public final String g(Float f14) {
        String strC = u00.b.c(this.f38418j, f14 != null ? Integer.valueOf((int) f14.floatValue()) : null, 72, 4);
        return strC == null ? this.f38410b : strC;
    }

    @Override // ah2.h
    public final String i(Float f14) {
        return f14 != null ? s.a(this, f14.floatValue()) : this.f38411c;
    }

    @Override // ah2.h
    public final String j(boolean z14, Integer num) {
        if (num == null) {
            return this.f38410b;
        }
        l3.a aVar = l3.f23124b;
        double dIntValue = num.intValue();
        m3 m3Var = z14 ? m3.METER : m3.FOOT;
        aVar.getClass();
        return l3.a.R(this.f38409a, dIntValue, m3Var, l3.f23131i, true, this.f38410b);
    }

    @Override // ah2.h
    public final String k(Float f14) {
        String strC = u00.b.c(this.f38421m, f14 != null ? Integer.valueOf((int) f14.floatValue()) : null, 72, 4);
        return strC == null ? this.f38410b : strC;
    }

    @Override // ah2.h
    public final String l(Float f14) {
        String strC = u00.b.c(this.f38419k, Double.valueOf(f14.floatValue()), 0, 6);
        return strC == null ? this.f38410b : strC;
    }

    @Override // ah2.h
    public final String m(Float f14) {
        String strC = u00.b.c(this.f38416h, f14 != null ? Integer.valueOf((int) f14.floatValue()) : null, 64, 4);
        return strC == null ? this.f38410b : strC;
    }

    @Override // ah2.h
    public final String n(Float f14) {
        if (f14 == null) {
            return this.f38411c;
        }
        return l3.f23124b.K0(((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c(), ((double) f14.floatValue()) / 1000.0d, true, this.f38410b);
    }

    @Override // ah2.h
    public final String o(Float f14, boolean z14, boolean z15) {
        Double dValueOf;
        double d14;
        if (f14 != null) {
            double dFloatValue = f14.floatValue();
            if (dFloatValue > 0.0d) {
                if (z15) {
                    l3.f23124b.getClass();
                    d14 = 1609.344d;
                } else {
                    l3.f23124b.getClass();
                    d14 = 1000.0d;
                }
                if (d14 > 0.0d) {
                    dFloatValue = d14 / (dFloatValue / 1000.0d);
                }
            }
            dValueOf = Double.valueOf(dFloatValue);
        } else {
            dValueOf = null;
        }
        if (dValueOf == null) {
            return this.f38411c;
        }
        return l3.f23124b.I1(dValueOf.doubleValue(), this.f38410b, this.f38409a, false, z14, true);
    }

    @Override // ah2.h
    public final String p(Float f14) {
        String strC = u00.b.c(this.f38412d, f14 != null ? Double.valueOf(f14.floatValue()) : null, 80, 4);
        return strC == null ? this.f38410b : strC;
    }

    @Override // ah2.h
    public final String q(Float f14) {
        return this.f38409a.a(R.string.avg_hr_value, s(f14));
    }

    @Override // ah2.h
    public final String r(Float f14, boolean z14) {
        Double dValueOf = f14 != null ? Double.valueOf(f14.floatValue()) : null;
        e2 e2Var = this.f38414f;
        String strC = u00.b.c(e2Var, dValueOf, 1, 4);
        return strC == null ? e5.g(e2Var.d(8), StringUtils.SPACE, e2Var.k(null)) : strC;
    }

    @Override // ah2.h
    public final String s(Float f14) {
        if (f14 == null) {
            return this.f38410b;
        }
        return l3.a.l0(l3.f23124b, this.f38409a, f14.floatValue(), false);
    }

    @Override // ah2.h
    public final String t(Float f14) {
        String strC = u00.b.c(this.f38413e, f14 != null ? Double.valueOf(f14.floatValue()) : null, 0, 6);
        return strC == null ? this.f38410b : strC;
    }

    @Override // ah2.h
    public final String u(Float f14) {
        return f14 != null ? s.a(this, f14.floatValue()) : this.f38411c;
    }

    @Override // ah2.h
    public final String v(Float f14) {
        return f14 != null ? s.a(this, f14.floatValue()) : this.f38411c;
    }

    @Override // ah2.h
    public final String w(Float f14) {
        String strC = u00.b.c(this.f38420l, Integer.valueOf((int) f14.floatValue()), 72, 4);
        return strC == null ? this.f38410b : strC;
    }

    @Override // ah2.h
    public final String x(Float f14) {
        String str = this.f38410b;
        if (f14 == null) {
            return str;
        }
        double dFloatValue = f14.floatValue();
        l3.f23124b.getClass();
        return l3.a.E0(this.f38409a, dFloatValue, true, str);
    }

    @Override // ah2.h
    public final String y(Float f14, ah2.h.b bVar, ah2.h.a aVar, boolean z14) {
        bVar.getClass();
        aVar.getClass();
        return new t(this.f38409a).y(f14, bVar, aVar, true);
    }

    @Override // ah2.h
    public final String z(Float f14, boolean z14) {
        l3.a aVar = l3.f23124b;
        double dFloatValue = f14.floatValue();
        m3 m3Var = z14 ? m3.METER : m3.FOOT;
        aVar.getClass();
        return l3.a.R(this.f38409a, dFloatValue, m3Var, l3.f23131i, true, this.f38410b);
    }
}
