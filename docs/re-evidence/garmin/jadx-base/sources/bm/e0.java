package bm;

import am.x0;
import am.z0;
import android.content.Context;
import c22.b1;
import c22.b2;
import c22.l3;
import c22.m3;
import i3.e5;
import java.text.DecimalFormat;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lbm/e0;", "", "", "distanceInMeters", "", "intPart", "decimalPart", "Lc22/m3;", "selectedUnit", "userPrefUnits", "<init>", "(DIILc22/m3;Lc22/m3;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f18788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m3 f18791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m3 f18792e;

    /* JADX WARN: Illegal instructions before constructor call */
    public e0(double d14, int i14, int i15, m3 m3Var, m3 m3Var2, int i16, p005kotlin.jvm.internal.j jVar) {
        m3 m3Var3;
        m3 m3Var4;
        i14 = (i16 & 2) != 0 ? 0 : i14;
        i15 = (i16 & 4) != 0 ? 0 : i15;
        m3Var = (i16 & 8) != 0 ? ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? m3.KILOMETER : m3.MILE : m3Var;
        if ((i16 & 16) != 0) {
            m3Var4 = m3Var;
            m3Var3 = m3Var4;
        } else {
            m3Var3 = m3Var2;
            m3Var4 = m3Var;
        }
        this(d14, i14, i15, m3Var4, m3Var3);
    }

    public final double a() {
        int i14 = this.f18790c;
        String strH = i14 < 10 ? am.j.h(i14, "0") : String.valueOf(i14);
        return b1.b(this.f18789b + b2.f23010b + strH);
    }

    public final String b(Context context, x0 x0Var, boolean z14) {
        String string;
        if (context != null && x0Var != null) {
            String str = x0Var.f4358a;
            z0 z0Var = z0.f4390a;
            if (z0.b(x0.I0, str)) {
                l3.a aVar = l3.f23124b;
                double d14 = this.f18788a;
                m3 m3Var = m3.METER;
                aVar.getClass();
                return l3.a.O(context, d14, m3Var, l3.f23131i, z14);
            }
        }
        m3 m3Var2 = this.f18792e;
        if (!z14) {
            l3.a aVar2 = l3.f23124b;
            double d15 = this.f18788a;
            DecimalFormat decimalFormat = l3.f23137o;
            aVar2.getClass();
            return l3.a.N(d15, m3Var2, decimalFormat);
        }
        l3.a aVar3 = l3.f23124b;
        double d16 = this.f18788a;
        DecimalFormat decimalFormat2 = l3.f23137o;
        aVar3.getClass();
        String strN = l3.a.N(d16, m3Var2, decimalFormat2);
        if (context == null || (string = context.getString(m3Var2.f23164e)) == null) {
            string = "";
        }
        return e5.g(strN, StringUtils.SPACE, string);
    }

    public final Integer[] c() {
        m3 m3Var = this.f18791d;
        m3 m3Var2 = this.f18792e;
        if (m3Var == m3Var2) {
            return new Integer[]{Integer.valueOf(this.f18789b), Integer.valueOf(this.f18790c), Integer.valueOf(m3Var2.f23164e)};
        }
        l3.a aVar = l3.f23124b;
        double d14 = this.f18788a;
        DecimalFormat decimalFormat = l3.f23137o;
        aVar.getClass();
        String strN = l3.a.N(d14, m3Var2, decimalFormat);
        int i14 = m3Var2.f23164e;
        int iG = d53.w.G(b2.f23010b, 0, 6, strN);
        return iG > 0 ? new Integer[]{Integer.valueOf(b1.c(strN.substring(0, iG))), Integer.valueOf(b1.c(strN.substring(iG + 1))), Integer.valueOf(i14)} : new Integer[]{Integer.valueOf(b1.c(strN)), 0, Integer.valueOf(i14)};
    }

    public final void d(m3 m3Var) {
        m3Var.getClass();
        this.f18791d = m3Var;
        l3.a aVar = l3.f23124b;
        double d14 = this.f18788a;
        DecimalFormat decimalFormat = l3.f23129g;
        aVar.getClass();
        String strR = l3.a.R(null, d14, m3Var, decimalFormat, false, null);
        int iG = d53.w.G(b2.f23010b, 0, 6, strR);
        if (iG > 0) {
            this.f18789b = b1.c(strR.substring(0, iG));
            this.f18790c = b1.c(strR.substring(iG + 1));
        } else {
            this.f18789b = b1.c(strR);
            this.f18790c = 0;
        }
    }

    public final void e(double d14, m3 m3Var) {
        m3Var.getClass();
        this.f18788a = d14;
        d(m3Var);
    }

    public final void f(m3 m3Var) {
        String str;
        m3Var.getClass();
        this.f18791d = m3Var;
        if (m3Var == m3.MILE) {
            DecimalFormat decimalFormat = l3.f23129g;
            l3.a aVar = l3.f23124b;
            double dA = a();
            aVar.getClass();
            str = decimalFormat.format(dA / 1.609344d);
            str.getClass();
        } else {
            DecimalFormat decimalFormat2 = l3.f23129g;
            l3.a aVar2 = l3.f23124b;
            double dA2 = a();
            aVar2.getClass();
            str = decimalFormat2.format(dA2 * 1.609344d);
            str.getClass();
        }
        int iG = d53.w.G(b2.f23010b, 0, 6, str);
        if (iG > 0) {
            this.f18789b = b1.c(str.substring(0, iG));
            this.f18790c = b1.c(str.substring(iG + 1));
        } else {
            this.f18789b = b1.c(str);
            this.f18790c = 0;
        }
    }

    public e0(double d14, int i14, int i15, m3 m3Var, m3 m3Var2) {
        m3Var.getClass();
        m3Var2.getClass();
        this.f18788a = d14;
        this.f18789b = i14;
        this.f18790c = i15;
        this.f18791d = m3Var;
        this.f18792e = m3Var2;
        d(m3Var);
    }
}
