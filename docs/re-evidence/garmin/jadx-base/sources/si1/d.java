package si1;

import c2.k3;
import c2.q3;
import c2.x2;
import c22.b2;
import f5.z0;
import h5.e0;
import java.util.ArrayList;
import java.util.Arrays;
import l72.u0;
import o4.d0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import sg0.q0;
import u1.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:43:0x0181  */
    public static final void a(int i14, e23.a aVar, h4.r rVar, p3.m mVar) {
        o0 o0Var;
        rVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(192026668);
        int i15 = ((i14 & 6) == 0 ? i14 | (o0VarE.B(rVar) ? 4 : 2) : i14) | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            b2.f23009a.getClass();
            double[] dArrD = b2.d();
            ArrayList arrayList = new ArrayList(100);
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 100; i16 < i18; i18 = 100) {
                double d14 = dArrD[i16];
                int i19 = i17 + 1;
                Float fValueOf = Float.valueOf(i17 / i18);
                d0.f128823b.getClass();
                arrayList.add(new o13.p(fValueOf, d0.a(d0.c((float) d14, d0.f128824c, 14))));
                i16++;
                i17 = i19;
            }
            o13.p[] pVarArr = (o13.p[]) arrayList.toArray(new o13.p[0]);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            t4.d dVarA = n5.c.a(2131233005, o0VarE, 0);
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarF = x2.f(aVar3, 1.0f);
            o4.w.a aVar4 = o4.w.f129023a;
            h4.r rVarC2 = uVar.c(wz1.i.f(rVarF, o4.w.a.j(aVar4, (o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length))), h4.d.a.f81525c);
            f5.k.f68985a.getClass();
            y0.a(dVarA, null, rVarC2, null, f5.k.a.f68990e, 0.0f, null, o0VarE, 24624, 104);
            h4.r rVarC3 = uVar.c(aVar3, h4.d.a.f81526d);
            int i24 = k3.f22728a;
            h4.r rVarG = c2.l.G(rVarC3, q3.c(o0VarE));
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar2.getClass();
            h4.r rVarC4 = c2.l.C(rVarG, 0.0f, f14, eVar.f97918c, 0.0f, 9);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new q0(aVar, 2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new q0(aVar, 2);
                    o0VarE.K(objQ);
                }
            }
            u0.a(rVarC4, null, null, null, (e23.a) objQ, o0VarE, 0, 14);
            o0Var = o0VarE;
            h4.r rVarF2 = x2.f(aVar3, 1.0f);
            bVar2.getClass();
            h4.r rVarC5 = uVar.c(x2.h(rVarF2, eVar.f97921f), h4.d.a.f81531i);
            d0.f128823b.getClass();
            c2.l.f(u1.n.d(rVarC5, o4.w.a.i(aVar4, x.k(d0.a(d0.f128831j), d0.a(d92.b.a(o0Var).c().c())), 0.0f, 14), null, 6), o0Var);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.g(rVar, aVar, i14, 6, (byte) 0);
        }
    }
}
