package o72;

import i3.e5;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class y1 {
    /* JADX WARN: Code duplicated, block: B:35:0x018f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0245  */
    /* JADX WARN: Code duplicated, block: B:45:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x039d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0446  */
    public static final void a(p3.m mVar, int i14) {
        int i15;
        char c14;
        p3.o0 o0VarE = mVar.E(78258441);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            Random random = new Random();
            ArrayList arrayList = new ArrayList();
            for (int i16 = 0; i16 < 10; i16++) {
                arrayList.add(o4.d0.a(o4.f0.c(random.nextInt(256), random.nextInt(256), random.nextInt(256))));
            }
            o0VarE.C(-2103020647);
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            int i17 = 0;
            while (true) {
                int i18 = 4;
                if (!it.hasNext()) {
                    o0VarE.g0(false);
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarD = c2.l.D(u1.a2.b(c2.x2.d(aVar, 1.0f), u1.a2.a(o0VarE), true));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    p3.x1 x1Var2 = p3.n.f135158a;
                    int iHashCode = Long.hashCode(o0VarE.U);
                    p3.i2 i2VarA0 = o0VarE.a0();
                    h4.r rVarC = h4.k.c(rVarD, o0VarE);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b == null) {
                        p3.p0.l();
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
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    j92.f fVar = d92.b.f58624b;
                    fVar.getClass();
                    s5.x0 x0Var = j92.f.f97930g;
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    float f15 = eVar.f97916a;
                    float f16 = eVar.f97917b;
                    bVar2.getClass();
                    mh.c("Gallery Pager (> 5 items)", c2.l.C(aVar, f14, eVar.f97920e, 0.0f, 0.0f, 12), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 6, 0, 131068);
                    boolean zR = o0VarE.r(arrayList2);
                    Object objQ = o0VarE.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = new d62.n(4, arrayList2);
                        o0VarE.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new d62.n(4, arrayList2);
                            o0VarE.K(objQ);
                        }
                    }
                    h2.b bVarB = h2.o0.b(0, (e23.a) objQ, o0VarE, 0, 3);
                    bVar2.getClass();
                    m82.d.b(c2.l.y(aVar, f15), i53.a.j(arrayList2), 0.0f, null, 0.0f, null, null, null, bVarB, 0, true, null, o0VarE, 807075840, 6, 2204);
                    bVar2.getClass();
                    c2.l.f(c2.l.y(aVar, f16), o0VarE);
                    fVar.getClass();
                    bVar2.getClass();
                    mh.c("Gallery Pager (2...5 items)", c2.l.C(aVar, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 6, 0, 131068);
                    i53.f fVarJ = i53.a.j(p13.h0.S0(arrayList2, 5));
                    boolean zB = o0VarE.B(fVarJ);
                    Object objQ2 = o0VarE.q();
                    if (zB) {
                        objQ2 = new ak0.w(fVarJ, 4);
                        o0VarE.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ak0.w(fVarJ, 4);
                            o0VarE.K(objQ2);
                        }
                    }
                    h2.b bVarB2 = h2.o0.b(0, (e23.a) objQ2, o0VarE, 0, 3);
                    bVar2.getClass();
                    m82.d.b(c2.l.y(aVar, f15), i53.a.j(fVarJ), 0.0f, null, 0.0f, null, null, null, bVarB2, 0, false, null, o0VarE, 807075840, 0, 3228);
                    fVar.getClass();
                    bVar2.getClass();
                    mh.c("Gallery Pager with inital page 2", c2.l.C(aVar, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 6, 0, 131068);
                    boolean zB2 = o0VarE.B(fVarJ);
                    Object objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new ak0.w(fVarJ, 5);
                        o0VarE.K(objQ3);
                    } else {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ak0.w(fVarJ, 5);
                            o0VarE.K(objQ3);
                        }
                    }
                    h2.b bVarB3 = h2.o0.b(1, (e23.a) objQ3, o0VarE, 6, 2);
                    bVar2.getClass();
                    m82.d.b(c2.l.y(aVar, f15), i53.a.j(fVarJ), 0.0f, null, 0.0f, null, null, null, bVarB3, 0, false, null, o0VarE, 807075840, 0, 3228);
                    bVar2.getClass();
                    c2.l.f(c2.l.y(aVar, f16), o0VarE);
                    fVar.getClass();
                    bVar2.getClass();
                    mh.c("Gallery Pager (1 item)", c2.l.C(aVar, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 6, 0, 131068);
                    i53.f fVarJ2 = i53.a.j(p13.h0.S0(arrayList2, 1));
                    boolean zB3 = o0VarE.B(fVarJ2);
                    Object objQ4 = o0VarE.q();
                    if (zB3) {
                        objQ4 = new ak0.w(fVarJ2, 6);
                        o0VarE.K(objQ4);
                    } else {
                        aVar3.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new ak0.w(fVarJ2, 6);
                            o0VarE.K(objQ4);
                        }
                    }
                    h2.b bVarB4 = h2.o0.b(0, (e23.a) objQ4, o0VarE, 0, 3);
                    bVar2.getClass();
                    m82.d.b(c2.l.y(aVar, f15), fVarJ2, 0.0f, null, 0.0f, null, null, null, bVarB4, 0, false, null, o0VarE, 807075840, 0, 3228);
                    bVar2.getClass();
                    c2.l.f(c2.l.y(aVar, f16), o0VarE);
                    fVar.getClass();
                    bVar2.getClass();
                    mh.c("Set a bigger content padding and page spacing", c2.l.C(aVar, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 6, 0, 131068);
                    bVar2.getClass();
                    c2.l.f(c2.l.y(aVar, f16), o0VarE);
                    boolean zR2 = o0VarE.r(arrayList2);
                    Object objQ5 = o0VarE.q();
                    if (zR2) {
                        objQ5 = new d62.n(5, arrayList2);
                        o0VarE.K(objQ5);
                    } else {
                        aVar3.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new d62.n(5, arrayList2);
                            o0VarE.K(objQ5);
                        }
                    }
                    h2.b bVarB5 = h2.o0.b(0, (e23.a) objQ5, o0VarE, 0, 3);
                    bVar2.getClass();
                    h4.r rVarY = c2.l.y(aVar, f15);
                    i53.f fVarJ3 = i53.a.j(arrayList2);
                    bVar2.getClass();
                    float f17 = eVar.f97920e;
                    Object objQ6 = o0VarE.q();
                    aVar3.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ6 == c2565a) {
                        objQ6 = new b1(28);
                        o0VarE.K(objQ6);
                    }
                    m82.d.b(rVarY, fVarJ3, 0.0f, (e23.p) objQ6, f17, null, null, null, bVarB5, 0, false, null, o0VarE, 1772544, 0, 3716);
                    bVar2.getClass();
                    c2.l.f(c2.l.y(aVar, f16), o0VarE);
                    fVar.getClass();
                    bVar2.getClass();
                    mh.c("Set onPageChangeCallback", c2.l.C(aVar, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 6, 0, 131068);
                    bVar2.getClass();
                    c2.l.f(c2.l.y(aVar, f16), o0VarE);
                    Object objQ7 = o0VarE.q();
                    if (objQ7 == c2565a) {
                        i15 = 0;
                        objQ7 = e5.o(0, o0VarE);
                    } else {
                        i15 = 0;
                    }
                    p3.n1 n1Var = (p3.n1) objQ7;
                    boolean zR3 = o0VarE.r(arrayList2);
                    Object objQ8 = o0VarE.q();
                    if (zR3 || objQ8 == c2565a) {
                        objQ8 = new d62.n(6, arrayList2);
                        o0VarE.K(objQ8);
                    }
                    h2.b bVarB6 = h2.o0.b(i15, (e23.a) objQ8, o0VarE, i15, 3);
                    bVar2.getClass();
                    h4.r rVarY2 = c2.l.y(aVar, f15);
                    i53.f fVarJ4 = i53.a.j(arrayList2);
                    Object objQ9 = o0VarE.q();
                    if (objQ9 == c2565a) {
                        c14 = 29;
                        objQ9 = new a11.h0(n1Var, 29);
                        o0VarE.K(objQ9);
                    } else {
                        c14 = 29;
                    }
                    m82.d.b(rVarY2, fVarJ4, 0.0f, null, 0.0f, null, null, (e23.l) objQ9, bVarB6, 0, false, null, o0VarE, 14352384, 0, 3612);
                    bVar2.getClass();
                    c2.l.f(c2.l.y(aVar, f16), o0VarE);
                    String str = "Current page: " + (n1Var.getIntValue() + 1);
                    fVar.getClass();
                    bVar2.getClass();
                    mh.c(str, c2.l.C(aVar, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    bVar2.getClass();
                    c2.l.f(c2.l.y(aVar, f16), o0VarE);
                    o0VarE.g0(true);
                    break;
                }
                Object next = it.next();
                int i19 = i17 + 1;
                if (i17 < 0) {
                    p13.x.q();
                    throw null;
                }
                arrayList2.add(z3.f.c(347802224, new d70.h(((o4.d0) next).f128833a, i17, i18), o0VarE));
                i17 = i19;
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b1(i14, 29);
        }
    }
}
