package uk0;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gg1.o0;
import h5.e0;
import i3.mh;
import l72.v2;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.y1;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, e eVar, o0 o0Var, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var2;
        boolean z14;
        eVar.getClass();
        o0Var.getClass();
        p3.o0 o0VarE = mVar.E(1246731730);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(o0Var.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            long jB = am.j.B(d92.b.f58623a, o0VarE);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            h4.r rVarE = u1.n.e(rVar, jB, k2.i.a(j92.b.f97900c.f97911c));
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new y1(13);
                o0VarE.K(objQ);
            }
            h4.r rVarA = v2.a(p5.v.c((e23.l) objQ, rVarE, true), aVar != null, new ak0.p(aVar, 24), o0VarE, 0);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            h4.r.a aVar3 = h4.r.S;
            bVar.getClass();
            j92.e eVar3 = j92.b.f97899b;
            h4.r rVarY = c2.l.y(aVar3, eVar3.f97920e);
            c2.j.f22691a.getClass();
            int i16 = i15;
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarY, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            q.a(h4.p.b(aVar3, -2.0f), eVar.getIcon(), eVar.d(o0VarE), 0.0f, eVar.a(o0VarE), eVar.b(o0VarE), o0VarE, 0, 8);
            i53.c cVarG = eVar.g(o0VarE);
            if (cVarG.isEmpty()) {
                cVarG = null;
            }
            if (cVarG == null) {
                o0VarE.C(-2039191444);
                z14 = false;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2039191443);
                bVar.getClass();
                c2.l.f(x2.h(aVar3, eVar3.f97917b), o0VarE);
                boolean zB = o0VarE.B(cVarG);
                Object objQ2 = o0VarE.q();
                if (zB || objQ2 == c2565a) {
                    objQ2 = new m92.q(cVarG, 3);
                    o0VarE.K(objQ2);
                }
                z14 = false;
                h4.r rVarC3 = p5.v.c((e23.l) objQ2, aVar3, false);
                i.f171830a.getClass();
                String strK0 = h0.k0(cVarG, " • ", null, null, null, 62);
                d92.b.f58624b.getClass();
                mh.c(strK0, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                Unit unit = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            i.f171830a.getClass();
            Double dC = eVar.c((b63.o) i.g(o0VarE).getF182175a());
            if (dC == null) {
                o0VarE.C(-2038653966);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-2038653965);
                bVar.getClass();
                c2.l.f(x2.h(aVar3, eVar3.f97919d), o0VarE);
                Unit unit2 = Unit.INSTANCE;
                o0VarE.g0(z14);
            }
            o0Var2 = o0Var;
            s.a(null, dC, eVar.f(o0Var2, o0VarE, ((i16 >> 6) & 14) | (i16 & 112)), o0VarE, 0, 1);
            if (eVar.getF171825n()) {
                o0VarE.C(-2038328217);
                bVar.getClass();
                c2.l.f(x2.h(aVar3, eVar3.f97918c), o0VarE);
                es1.c.a(h4.p.b(aVar3, -1.0f), sn.a.g(gl1.y.Q(o0VarE, R.string.lbl_gear_retired)), 0L, 0L, o0VarE, 0, 12);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-2037915948);
                o0VarE.g0(z14);
            }
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0Var2 = o0Var;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c((Object) rVar, (Object) eVar, (Object) o0Var2, (Object) aVar, i14, 3);
        }
    }
}
