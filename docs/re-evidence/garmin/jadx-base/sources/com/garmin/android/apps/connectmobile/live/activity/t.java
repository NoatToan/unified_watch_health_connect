package com.garmin.android.apps.connectmobile.live.activity;

import android.content.Context;
import c22.l3;
import c22.m3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import lc.u0;
import ns.a2;
import ns.b0;
import ns.d0;
import ns.h2;
import ns.s1;
import ns.u1;
import ns.v1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/live/activity/t;", "Lah2/j;", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements ah2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f38458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2 f38461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s1 f38462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u1 f38463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d0 f38464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f38465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v1 f38466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h2 f38467j;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f38469b;

        static {
            int[] iArr = new int[ah2.h.b.values().length];
            try {
                iArr[ah2.h.b.METERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ah2.h.b.KILO_METERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ah2.h.b.MILES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38468a = iArr;
            int[] iArr2 = new int[ah2.h.a.values().length];
            try {
                iArr2[ah2.h.a.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ah2.h.a.TWO_DECIMALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f38469b = iArr2;
        }
    }

    public t(l22.b bVar) {
        bVar.getClass();
        this.f38458a = bVar;
        this.f38459b = bVar.getString(R.string.no_value);
        this.f38460c = bVar.getString(R.string.no_duration_value);
        this.f38461d = new a2(bVar, null, 2, null);
        this.f38462e = new s1(bVar, null, 2, null);
        this.f38463f = new u1(bVar, u1.a.Total, null, 4, null);
        this.f38464g = new d0(bVar, null, 2, null);
        this.f38465h = new b0(bVar, null, 2, null);
        this.f38466i = new v1(bVar, null, 2, null);
        this.f38467j = new h2(bVar, null, 2, null);
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
        String strC = u00.b.c(this.f38463f, Integer.valueOf((int) f14.floatValue()), 0, 6);
        return strC == null ? this.f38459b : strC;
    }

    @Override // ah2.h
    public final String d(Float f14) {
        String strC = u00.b.c(this.f38461d, f14 != null ? Integer.valueOf((int) f14.floatValue()) : null, 0, 6);
        return strC == null ? this.f38459b : strC;
    }

    @Override // ah2.h
    public final String e(Float f14) {
        String str = this.f38459b;
        if (f14 == null) {
            return str;
        }
        double dFloatValue = f14.floatValue();
        l3.f23124b.getClass();
        return l3.a.E0(this.f38458a, dFloatValue, false, str);
    }

    @Override // ah2.h
    public final String g(Float f14) {
        String strC = u00.b.c(this.f38464g, Integer.valueOf((int) f14.floatValue()), 0, 6);
        return strC == null ? this.f38459b : strC;
    }

    @Override // ah2.h
    public final String i(Float f14) {
        return f14 != null ? s.a(this, f14.floatValue()) : this.f38460c;
    }

    @Override // ah2.h
    public final String j(boolean z14, Integer num) {
        l3.a aVar = l3.f23124b;
        double dIntValue = num.intValue();
        m3 m3Var = z14 ? m3.METER : m3.FOOT;
        aVar.getClass();
        return l3.a.N(dIntValue, m3Var, l3.f23131i);
    }

    @Override // ah2.h
    public final String k(Float f14) {
        String strC = u00.b.c(this.f38467j, Integer.valueOf((int) f14.floatValue()), 24, 4);
        return strC == null ? this.f38459b : strC;
    }

    @Override // ah2.h
    public final String l(Float f14) {
        String strC = u00.b.c(this.f38465h, Double.valueOf(f14.floatValue()), 16, 4);
        return strC == null ? this.f38459b : strC;
    }

    @Override // ah2.h
    public final String m(Float f14) {
        String strC = u00.b.c(this.f38462e, f14 != null ? Integer.valueOf((int) f14.floatValue()) : null, 0, 6);
        return strC == null ? this.f38459b : strC;
    }

    @Override // ah2.h
    public final String n(Float f14) {
        if (f14 == null) {
            return this.f38460c;
        }
        return l3.f23124b.K0(((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c(), ((double) f14.floatValue()) / 1000.0d, false, this.f38459b);
    }

    @Override // ah2.h
    public final String o(Float f14, boolean z14, boolean z15) {
        double d14;
        String strI1;
        if (f14 != null) {
            double dFloatValue = f14.floatValue();
            if (dFloatValue <= 0.0d) {
                strI1 = null;
            } else {
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
                strI1 = l3.f23124b.I1(dFloatValue, this.f38459b, this.f38458a, false, z14, false);
            }
            if (strI1 != null) {
                return strI1;
            }
        }
        return this.f38460c;
    }

    @Override // ah2.h
    public final String p(Float f14) {
        if (f14 == null) {
            return this.f38459b;
        }
        return l3.a.H(l3.f23124b, this.f38458a, f14.floatValue(), false);
    }

    @Override // ah2.h
    public final String q(Float f14) {
        return s(f14);
    }

    @Override // ah2.h
    public final String r(Float f14, boolean z14) {
        if (f14 == null) {
            return this.f38459b;
        }
        double dFloatValue = f14.floatValue();
        l22.b bVar = this.f38458a;
        if (z14) {
            l3.a aVar = l3.f23124b;
            q3 q3Var = q3.KILOMETER_PER_HOUR;
            DecimalFormat decimalFormat = l3.f23138p;
            aVar.getClass();
            return l3.a.O0(bVar, dFloatValue, q3Var, decimalFormat, false, "--");
        }
        l3.a aVar2 = l3.f23124b;
        q3 q3Var2 = q3.MILE_PER_HOUR;
        DecimalFormat decimalFormat2 = l3.f23138p;
        aVar2.getClass();
        return l3.a.O0(bVar, dFloatValue, q3Var2, decimalFormat2, false, "--");
    }

    @Override // ah2.h
    public final String s(Float f14) {
        if (f14 == null) {
            return this.f38459b;
        }
        return l3.a.l0(l3.f23124b, this.f38458a, f14.floatValue(), false);
    }

    @Override // ah2.h
    public final String u(Float f14) {
        return f14 != null ? s.a(this, f14.floatValue()) : this.f38460c;
    }

    @Override // ah2.h
    public final String v(Float f14) {
        return f14 != null ? s.a(this, f14.floatValue()) : this.f38460c;
    }

    @Override // ah2.h
    public final String w(Float f14) {
        String strC = u00.b.c(this.f38466i, Integer.valueOf((int) f14.floatValue()), 0, 6);
        return strC == null ? this.f38459b : strC;
    }

    @Override // ah2.h
    public final String x(Float f14) {
        String str = this.f38459b;
        if (f14 == null) {
            return str;
        }
        double dFloatValue = f14.floatValue();
        l3.f23124b.getClass();
        return l3.a.E0(this.f38458a, dFloatValue, false, str);
    }

    @Override // ah2.h
    public final String y(Float f14, ah2.h.b bVar, ah2.h.a aVar, boolean z14) {
        m3 m3Var;
        DecimalFormat decimalFormat;
        bVar.getClass();
        aVar.getClass();
        if (f14 == null) {
            return this.f38459b;
        }
        float fFloatValue = f14.floatValue();
        l3.a aVar2 = l3.f23124b;
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
        double d14 = fFloatValue;
        int i14 = a.f38468a[bVar.ordinal()];
        if (i14 == 1) {
            m3Var = m3.METER;
        } else if (i14 == 2) {
            m3Var = m3.KILOMETER;
        } else {
            if (i14 != 3) {
                u0.r();
                return null;
            }
            m3Var = m3.MILE;
        }
        m3 m3Var2 = m3Var;
        int i15 = a.f38469b[aVar.ordinal()];
        if (i15 == 1) {
            aVar2.getClass();
            decimalFormat = l3.f23131i;
        } else {
            if (i15 != 2) {
                u0.r();
                return null;
            }
            decimalFormat = l3.f23137o;
        }
        DecimalFormat decimalFormat2 = decimalFormat;
        aVar2.getClass();
        return l3.a.O(contextC, d14, m3Var2, decimalFormat2, z14);
    }

    @Override // ah2.h
    public final String z(Float f14, boolean z14) {
        l3.a aVar = l3.f23124b;
        double dFloatValue = f14.floatValue();
        m3 m3Var = z14 ? m3.METER : m3.FOOT;
        aVar.getClass();
        return l3.a.N(dFloatValue, m3Var, l3.f23131i);
    }
}
