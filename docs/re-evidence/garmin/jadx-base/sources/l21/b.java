package l21;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import et1.u;
import gl1.y;
import h5.e0;
import java.util.Map;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.h1;
import yc.v2;
import yc.z0;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:56:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x012e  */
    public static final void a(m21.e eVar, v21.e eVar2, h4.r rVar, e23.a aVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.a aVar2, e23.a aVar3, e23.l lVar4, p3.m mVar, int i14) {
        o0 o0Var;
        zc.d dVarA;
        int i15;
        eVar.getClass();
        eVar2.getClass();
        o0 o0VarE = mVar.E(-180507060);
        int i16 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.r(eVar2) ? 32 : 16) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536) | (o0VarE.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar2) ? 8388608 : 4194304) | (o0VarE.r(aVar3) ? 67108864 : 33554432) | (o0VarE.r(lVar4) ? 536870912 : 268435456);
        if (o0VarE.n(i16 & 1, (306783379 & i16) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            Map<k21.a, r53.i<v2<g01.n>>> map = eVar.f116098o;
            k21.a aVar4 = k21.a.ALL;
            r53.i<v2<g01.n>> iVar = map.get(aVar4);
            if (iVar == null) {
                o0VarE.C(-186255205);
                o0VarE.g0(false);
                dVarA = null;
            } else {
                o0VarE.C(-1668576218);
                dVarA = zc.g.a(iVar, o0VarE);
                o0VarE.g0(false);
            }
            Boolean bool = eVar.f116097n.get(aVar4);
            int i17 = i16 & 7168;
            boolean zR = o0VarE.r(eVar) | o0VarE.r(dVarA) | (i17 == 2048);
            Object objQ = o0VarE.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (zR) {
                objQ = new a(eVar, dVarA, aVar, null);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(eVar, dVarA, aVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((e23.p) objQ, bool, o0VarE);
            if (dVarA != null) {
                o0VarE.C(-185827125);
                boolean z14 = dVarA.d().f196385a instanceof z0.b;
                m3.s sVarE = m3.l.e(o0VarE);
                boolean zR2 = (i17 == 2048) | o0VarE.r(dVarA);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    i15 = 1;
                    objQ2 = new fo.h(dVarA, aVar, 1);
                    o0VarE.K(objQ2);
                } else {
                    aVar5.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        i15 = 1;
                        objQ2 = new fo.h(dVarA, aVar, 1);
                        o0VarE.K(objQ2);
                    } else {
                        i15 = 1;
                    }
                }
                m3.l.b(z14, (e23.a) objQ2, rVar, sVarE, null, z3.f.c(1473339200, new p003ji0.e(z14, sVarE, i15), o0VarE), z3.f.c(2019731841, new u(dVarA, eVar, aVar2, aVar3, lVar, lVar4, eVar2, lVar2, lVar3), o0VarE), o0VarE, 1769856, 16);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(-180219690);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.j(eVar, eVar2, rVar, aVar, lVar, lVar2, lVar3, aVar2, aVar3, lVar4, i14, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(f01.j jVar, e23.l lVar, h4.r rVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1547904971);
        int i15 = (o0VarE.k(jVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            h4.r rVarY = x2.y(rVar, gVar, 2);
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            String strQ = y.Q(o0VarE, R.string.lbl_sort);
            s62.a.f157643a.getClass();
            u4.d dVarA = h1.a(t62.b.f162798a);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new kb0.k(p1Var, 28);
                o0VarE.K(objQ2);
            }
            j21.t.b(24576, (e23.a) objQ2, null, strQ, o0VarE, dVarA, false);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new kb0.k(p1Var, 29);
                o0VarE.K(objQ3);
            }
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            i3.u.a(zBooleanValue, (e23.a) objQ3, null, 0L, null, null, k2.i.a(j92.b.f97899b.f97919d), ds.e0.w(o0VarE), 0.0f, 0.0f, z3.f.c(251147702, new gw1.e(lVar, 20, p1Var, jVar), o0VarE), o0VarE, 48, 48, 1852);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.m(jVar, lVar, rVar, i14);
        }
    }
}
