package f21;

import c2.x2;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class t {
    public static final void a(v21.e eVar, g21.o oVar, e23.a<Unit> aVar, boolean z14, p3.m mVar, int i14) {
        eVar.getClass();
        oVar.getClass();
        j23.g<b63.v> gVar = oVar.f75467e;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(993937386);
        int i15 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.r(oVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            float f15 = eVar2.f97920e;
            h4.r rVarC = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f14, 7);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            l22.a aVarS = w2.a0.s(o0VarE);
            b11.c.a aVar4 = b11.c.f14245d;
            String str = oVar.f75464b;
            boolean z15 = oVar.f75465c;
            aVar4.getClass();
            String strB = b11.c.a.b(str, aVarS, z15);
            bVar.getClass();
            y01.a.a(aVar2, strB, z14, c2.l.C(aVar2, 0.0f, eVar2.f97919d, 0.0f, 0.0f, 13), aVar, o0VarE, ((i15 >> 3) & 896) | 6 | ((i15 << 6) & 57344), 0);
            if (gVar != null) {
                o0VarE.C(-1058598272);
                bVar.getClass();
                h4.r rVarA = c2.l.A(aVar2, f15, 0.0f, 2);
                String strZ = eVar.z((b63.v) gVar.getStart(), (b63.v) gVar.b());
                d92.b.f58624b.getClass();
                mh.c(strZ, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1058340414);
                o0VarE.g0(false);
            }
            bVar.getClass();
            c2.l.f(x2.h(aVar2, eVar2.f97919d), o0VarE);
            bVar.getClass();
            h4.r rVarA2 = c2.l.A(aVar2, f15, 0.0f, 2);
            g21.f0 f0Var = oVar.f75468f;
            g21.u uVar = oVar.f75469g;
            d92.b.f58624b.getClass();
            y01.m.a(rVarA2, eVar, f0Var, d92.c.b(j92.f.f97933j, o0VarE), uVar, o0VarE, (i15 << 3) & 112, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g(eVar, oVar, aVar, z14, i14, 10);
        }
    }
}
