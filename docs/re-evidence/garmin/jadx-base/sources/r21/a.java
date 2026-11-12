package r21;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.google.firebase.perf.util.Constants;
import h5.e0;
import i3.mc;
import i3.v5;
import java.util.ArrayList;
import l72.w;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final void a(mc mcVar, l01.a aVar, e23.l<? super l01.a, Unit> lVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        mcVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(345748747);
        int i15 = i14 | (o0VarE.B(mcVar) ? 4 : 2) | (o0VarE.k(aVar == null ? -1 : aVar.ordinal()) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            w wVar = w.f111301a;
            b.f149476a.getClass();
            wVar.e(b.f149477b, z3.f.c(1133252042, new p40.r(aVar2, 18), o0VarE), aVar2, mcVar, true, null, z3.f.c(226854240, new o72.b(20, aVar, lVar), o0VarE), o0VarE, ((i15 >> 3) & 896) | 12607542 | ((i15 << 9) & 7168), 96);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qy0.d((Object) mcVar, (Object) aVar, (e23.l) lVar, (e23.a) aVar2, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    public static final void b(h4.r rVar, l01.a aVar, e23.l lVar, p3.m mVar, int i14) {
        h4.r rVar2;
        o0 o0VarE = mVar.E(1783224466);
        int i15 = 256;
        int i16 = i14 | 6 | (o0VarE.k(aVar == null ? -1 : aVar.ordinal()) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        boolean z14 = false;
        boolean z15 = true;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            rVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            b.f149476a.getClass();
            z3.e eVar = b.f149478c;
            h4.r rVarB = a2.b(x2.f(rVar2, 1.0f), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            v5.a(0.0f, 0, 3, d92.b.a(o0VarE).j().c(), null, o0VarE);
            o0VarE.C(347545365);
            w13.c cVar = l01.a.f107835h;
            ArrayList<l01.a> arrayListK = n23.j.k(cVar);
            p13.c.b bVar2 = new p13.c.b();
            while (bVar2.hasNext()) {
                Object next = bVar2.next();
                if (((l01.a) next) != l01.a.UNKNOWN) {
                    arrayListK.add(next);
                }
            }
            for (l01.a aVar3 : arrayListK) {
                boolean z16 = aVar3 == aVar ? z15 : z14;
                l72.p2 p2Var = l72.p2.f111205a;
                String strQ = gl1.y.Q(o0VarE, aVar3.f107837b);
                String strQ2 = gl1.y.Q(o0VarE, aVar3.f107838c);
                boolean z17 = z15;
                z3.e eVar2 = z16 ? eVar : null;
                boolean zK = ((i16 & 896) == i15 ? z17 : z14) | o0VarE.k(aVar3.ordinal());
                Object objQ = o0VarE.q();
                if (zK) {
                    objQ = new qn0.f(17, lVar, aVar3);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new qn0.f(17, lVar, aVar3);
                        o0VarE.K(objQ);
                    }
                }
                o0 o0Var = o0VarE;
                p2Var.h(strQ, strQ2, null, null, null, false, z16, null, eVar2, null, (e23.a) objQ, o0Var, 0, 0, Constants.FROZEN_FRAME_TIME);
                z14 = z14;
                o0VarE = o0Var;
                i15 = i15;
                z15 = true;
                i16 = i16;
            }
            o0VarE.g0(z14);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new pp.g(rVar2, aVar, lVar, i14, 15);
        }
    }
}
