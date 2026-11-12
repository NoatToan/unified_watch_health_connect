package l72;

import i3.mh;
import java.util.List;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class z2 {
    /* JADX WARN: Code duplicated, block: B:63:0x018a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0268  */
    public static final void a(List list, h4.r rVar, g6.f fVar, float f14, e23.a aVar, e23.l lVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        float f15;
        boolean z14;
        long jB;
        boolean z15;
        list.getClass();
        aVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(2018061548);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16) | 3072 | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        boolean z16 = true;
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            float f16 = 8;
            g6.f.a aVar2 = g6.f.f75994b;
            p3.x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long jF = d92.b.a(o0VarE).e().f();
            long jB2 = p6.b.b(o0VarE);
            h4.r rVarE = u1.n.e(c2.l.o(rVar, c2.q1.Max), jB2, k2.i.a(f16));
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            c2.s2 s2VarA = c2.q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            long j8 = jB2;
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u2 u2Var = c2.u2.f22900a;
            int size = ((Number) aVar.invoke()).intValue() < 0 ? 0 : ((Number) aVar.invoke()).intValue() >= list.size() ? list.size() - 1 : ((Number) aVar.invoke()).intValue();
            o0VarE.C(-244006181);
            int i16 = 0;
            for (Object obj : list) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    p13.x.q();
                    throw null;
                }
                b82.g1 g1Var = (b82.g1) obj;
                boolean z17 = size == i16 ? z16 : false;
                h4.r rVarU = fVar != 0 ? c2.x2.u(h4.r.S, fVar.f75997a) : u2Var.a(h4.r.S, 1.0f, true);
                g6.f.a aVar4 = g6.f.f75994b;
                h4.r rVarY = c2.l.y(c2.l.o(rVarU, c2.q1.Max), 2);
                boolean zK = ((458752 & i15) == 131072) | o0VarE.k(i16);
                Object objQ = o0VarE.q();
                p3.m.a aVar5 = p3.m.f135153a;
                if (zK) {
                    objQ = new au0.m(lVar, i16, 13);
                    o0VarE.K(objQ);
                } else {
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new au0.m(lVar, i16, 13);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarB = h4.p.b(u1.n.e(u1.w.d(rVarY, false, null, null, (e23.a) objQ, 15), z17 ? jF : j8, k2.i.a(f16)), z17 ? 1.0f : 0.0f);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                p3.x1 x1Var2 = p3.n.f135158a;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                p3.i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarB, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar6 = h5.g.a.f81805b;
                if (cVar == 0) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                c2.u uVar = c2.u.f22885a;
                if (z17) {
                    o0VarE.C(-812828439);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).k().f63527d;
                    z14 = false;
                } else {
                    z14 = false;
                    o0VarE.C(-812827387);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).k().b();
                }
                o0VarE.g0(z14);
                h4.r.a aVar7 = h4.r.S;
                boolean zH = o0VarE.h(z17) | o0VarE.r(g1Var);
                Object objQ2 = o0VarE.q();
                if (zH) {
                    z15 = true;
                    objQ2 = new b82.j1(z17, g1Var, 1);
                    o0VarE.K(objQ2);
                } else {
                    aVar5.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        z15 = true;
                        objQ2 = new b82.j1(z17, g1Var, 1);
                        o0VarE.K(objQ2);
                    } else {
                        z15 = true;
                    }
                }
                h4.r rVarY2 = c2.l.y(p5.v.c((e23.l) objQ2, aVar7, false), 6);
                String str = z17 ? g1Var.f16582a : g1Var.f16583b;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                boolean z18 = z15;
                p3.o0 o0Var2 = o0VarE;
                mh.c(str, rVarY2, jB, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97932i), o0Var2, 0, 0, 131064);
                o0Var2.g0(z18);
                f16 = f16;
                size = size;
                z16 = z18;
                o0VarE = o0Var2;
                i16 = i17;
                cVar = cVar;
                u2Var = u2Var;
                j8 = j8;
            }
            o0Var = o0VarE;
            f15 = f16;
            o0Var.g0(false);
            o0Var.g0(z16);
            p3.x1 x1Var3 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            f15 = f14;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g02.o0(list, rVar, fVar, f15, aVar, lVar, i14);
        }
    }
}
