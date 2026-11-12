package f21;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import ew1.r1;
import l72.x0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static final void a(g21.a aVar, v21.e eVar, p3.m mVar, int i14) {
        String strJ;
        double dB;
        Double d14 = aVar.f75370b;
        eVar.getClass();
        Context context = eVar.f175324a;
        p3.o0 o0VarE = mVar.E(1864559157);
        int i15 = (o0VarE.B(aVar) ? 4 : 2) | i14 | (o0VarE.r(eVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String strC = eVar.c(aVar.f75369a);
            if (d14 == null || d14.doubleValue() < 0.0d) {
                strJ = eVar.f175327d;
            } else {
                l3.a aVar2 = l3.f23124b;
                double dDoubleValue = d14.doubleValue();
                aVar2.getClass();
                strJ = k42.b.j(context, k42.b.c(l3.a.P1(dDoubleValue)), true, l3.f23130h);
            }
            Double d15 = aVar.f75371c;
            if (d15 == null || p005kotlin.jvm.internal.s.c(d15, 0.0d)) {
                l3.a aVar3 = l3.f23124b;
                double dDoubleValue2 = d14 != null ? d14.doubleValue() : 0.0d;
                aVar3.getClass();
                dB = k42.b.b(l3.a.P1(dDoubleValue2));
            } else {
                dB = d15.doubleValue();
            }
            Double dValueOf = Double.valueOf(dB);
            String string = context.getString(R.string.no_value);
            string.getClass();
            l3.f23124b.getClass();
            String strD = k42.b.d(dValueOf, string, l3.f23130h);
            String strG = eVar.g(aVar.f75372d);
            String strQ = gl1.y.Q(o0VarE, R.string.avg_daily_calories);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_avg_weight);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_avg_bmi);
            String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_avg_body_fat);
            String strH = eVar.H(eVar.N(strQ), strC, false);
            String strH2 = eVar.H(eVar.N(strQ2), strJ, true);
            String strH3 = eVar.H(eVar.N(strQ3), strD, true);
            String strH4 = eVar.H(eVar.N(strQ4), strG, true);
            h4.r.a aVar4 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar4, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            x0 x0Var = x0.f111346a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarY = c2.l.y(aVar4, eVar2.f97920e);
            z3.e eVarC = z3.f.c(1884850886, new b(strC, 0, strQ, strH, strJ, strQ2, strH2), o0VarE);
            int i16 = (x0.f111348c << 6) | 48;
            x0Var.e(rVarY, eVarC, o0VarE, i16, 0);
            bVar2.getClass();
            x0Var.e(c2.l.y(aVar4, eVar2.f97920e), z3.f.c(731476399, new b(strD, 1, strQ3, strH3, strG, strQ4, strH4), o0VarE), o0VarE, i16, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r1(aVar, eVar, i14, 7);
        }
    }
}
