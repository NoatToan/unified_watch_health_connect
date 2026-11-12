package jy0;

import c2.x2;
import c22.x0;
import com.google.firebase.perf.util.Constants;
import i3.mh;
import l72.p2;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 {
    /* JADX WARN: Code duplicated, block: B:46:0x0182  */
    public static final void a(sy0.m mVar, e23.l lVar, p3.m mVar2, int i14) {
        o0 o0Var;
        lVar.getClass();
        o0 o0VarE = mVar2.E(653843371);
        int i15 = (o0VarE.k(mVar == null ? -1 : mVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            bVar2.getClass();
            h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, f14);
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.Ba);
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
            d6.h.f57752b.getClass();
            mh.c(strW, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            o0Var = o0VarE;
            o0Var.C(-1961167012);
            w13.c cVar = sy0.m.f161255h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                sy0.m mVar3 = (sy0.m) bVarN.next();
                p2 p2Var = p2.f111205a;
                String strQ = gl1.y.Q(o0Var, mVar3.f161257b);
                String strT = gl1.d.T(mVar3.f161258c, o0Var, 0);
                boolean z14 = mVar3 == mVar;
                z3.e eVarC = z3.f.c(658268258, new i20.b(25, mVar3, mVar), o0Var);
                boolean zK = ((i15 & 112) == 32) | o0Var.k(mVar3.ordinal());
                Object objQ = o0Var.q();
                if (zK) {
                    objQ = new i91.c(29, lVar, mVar3);
                    o0Var.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new i91.c(29, lVar, mVar3);
                        o0Var.K(objQ);
                    }
                }
                o0 o0Var2 = o0Var;
                p2Var.h(strQ, strT, null, null, null, false, z14, null, eVarC, null, (e23.a) objQ, o0Var2, 100663296, 0, Constants.FROZEN_FRAME_TIME);
                o0Var = o0Var2;
            }
            o0Var.g0(false);
            o0Var.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i20.b(mVar, lVar, i14, 26);
        }
    }
}
