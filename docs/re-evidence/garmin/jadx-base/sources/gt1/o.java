package gt1;

import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.mh;
import l72.v2;
import o4.m1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    /* JADX WARN: Code duplicated, block: B:35:0x00fb  */
    public static final void a(h4.r rVar, us1.h hVar, p3.m mVar, int i14) {
        hVar.getClass();
        int i15 = hVar.f172408b;
        o0 o0VarE = mVar.E(-1756721287);
        int i16 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.k(hVar.ordinal()) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(v2.a(l4.k.b(rVar, j92.h.f97941a.f87991b), hVar == us1.h.HARD, new fx0.a(18), o0VarE, 0), n5.a.a(o0VarE, hVar.f172409c), m1.f128891a);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarE, f14, eVar.f97917b);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            String strP = y.P(R.string.difficulty_content_description, new Object[]{y.Q(o0VarE, i15)}, o0VarE);
            h4.r.a aVar2 = h4.r.S;
            boolean zB = o0VarE.B(strP);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new gp.j(strP, 5);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gp.j(strP, 5);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarC2 = p5.v.c((e23.l) objQ, aVar2, false);
            String strG = g22.n.g(y.Q(o0VarE, i15));
            d92.b.f58624b.getClass();
            mh.c(strG, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97935l, n5.a.a(o0VarE, R.color.gray_15_static), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131068);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g80.e(rVar, hVar, i14, 3);
        }
    }
}
