package f21;

import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class q {
    public static final void a(g21.b bVar, v21.e eVar, p3.m mVar, int i14) {
        int i15;
        int i16;
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(1165412132);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String strD = v21.e.d(eVar, bVar.f75380b, null, 6);
            String strD2 = v21.e.d(eVar, bVar.f75379a, null, 6);
            String strD3 = v21.e.d(eVar, bVar.f75381c, null, 6);
            String strC = eVar.c(bVar.f75382d);
            String strQ = gl1.y.Q(o0VarE, R.string.avg_daily_protein);
            String strQ2 = gl1.y.Q(o0VarE, R.string.avg_daily_fat);
            String strQ3 = gl1.y.Q(o0VarE, R.string.avg_daily_carbs);
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.Fd);
            String strH = eVar.H(eVar.N(strQ), strD, true);
            String strH2 = eVar.H(eVar.N(strQ2), strD2, true);
            String strH3 = eVar.H(eVar.N(strQ3), strD3, true);
            String strH4 = eVar.H(eVar.N(strW), strC, false);
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            l72.x0 x0Var = l72.x0.f111346a;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarY = c2.l.y(aVar, eVar2.f97920e);
            z3.e eVarC = z3.f.c(-2033174861, new b(strD, 2, strQ, strH, strD2, strQ2, strH2), o0VarE);
            int i17 = (l72.x0.f111348c << 6) | 48;
            x0Var.e(rVarY, eVarC, o0VarE, i17, 0);
            bVar3.getClass();
            x0Var.e(c2.l.y(aVar, eVar2.f97920e), z3.f.c(708147946, new b(strD3, 3, strQ3, strH3, strC, strW, strH4), o0VarE), o0VarE, i17, 0);
            i16 = 1;
            o0VarE.g0(true);
        } else {
            i16 = 1;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f2.o(bVar, eVar, i14, i16);
        }
    }
}
