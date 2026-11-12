package j82;

import c2.j;
import c2.q;
import c2.q2;
import c2.s2;
import c2.t0;
import c2.u;
import c2.u2;
import c2.x2;
import e23.l;
import e23.p;
import f5.z0;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import i3.s5;
import k2.i;
import l4.k;
import l72.v2;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    public static final void a(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(280592061);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarU = x2.u(x2.h(aVar, f14), 16);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a02.a(j8, 29);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a02.a(j8, 29);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = k.d(rVarU, (l) objQ);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            q.a(u.f22885a.c(u1.n.e(k.b(x2.q(aVar, 8), i.f102406a), j8, m1.f128891a), h4.d.a.f81528f), o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 12);
        }
    }

    public static final void b(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(403606137);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            r rVarQ = x2.q(r.S, f14);
            k2.h hVar = i.f102406a;
            r rVarB = k.b(rVarQ, hVar);
            u1.u uVarA = u1.n.a(w(f14), j8);
            q.a(u1.q.c(uVarA.f167683a, rVarB, uVarA.f167684b, hVar), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 4);
        }
    }

    public static final void c(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(924360529);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            q.a(u1.n.e(k.b(x2.q(r.S, f14), i.f102406a), j8, m1.f128891a), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    public static final void d(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-112217348);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            r rVarU = x2.u(x2.h(r.S, f14), 16);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a02.a(j8, 25);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a02.a(j8, 25);
                    o0VarE.K(objQ);
                }
            }
            q.a(k.d(rVarU, (l) objQ), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 5);
        }
    }

    public static final void e(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(38782865);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            q.a(u1.q.a(k.g(x2.q(r.S, f14), 45.0f), u1.n.a(w(f14), j8)), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 13);
        }
    }

    public static final void f(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1173589609);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            q.a(u1.n.e(k.g(x2.q(r.S, f14), 45.0f), j8, m1.f128891a), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    public static final void g(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(827103907);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            r rVarU = x2.u(x2.h(r.S, f14), 16);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a02.a(j8, 28);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a02.a(j8, 28);
                    o0VarE.K(objQ);
                }
            }
            q.a(k.d(rVarU, (l) objQ), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 10);
        }
    }

    public static final void h(i53.c<f> cVar, r rVar, j.e eVar, m mVar, int i14, int i15) {
        r rVar2;
        j.e eVar2;
        cVar.getClass();
        o0 o0VarE = mVar.E(-1206167897);
        int i16 = 2;
        int i17 = i14 | (o0VarE.B(cVar) ? 4 : 2);
        int i18 = i15 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i14 & 48) == 0) {
            i17 |= o0VarE.B(rVar) ? 32 : 16;
        }
        int i19 = i17 | 384;
        if (o0VarE.n(i19 & 1, (i19 & 147) != 146)) {
            r rVar3 = i18 != 0 ? r.S : rVar;
            j.f22691a.getClass();
            eVar2 = j.f22696f;
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            t0.a(c2.l.A(rVarF, 0.0f, j92.b.f97899b.f97917b, 1).then(rVar3), eVar2, null, null, 0, 0, z3.f.c(309231372, new d82.c(cVar, i16), o0VarE), o0VarE, 1572912, 60);
            rVar2 = rVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            eVar2 = eVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(cVar, rVar2, eVar2, i14, i15, 12);
        }
    }

    public static final void i(f fVar, r rVar, m mVar, int i14, int i15) {
        r rVar2;
        int i16;
        o0 o0Var;
        fVar.getClass();
        o0 o0VarE = mVar.E(1123877456);
        int i17 = i14 | (o0VarE.B(fVar) ? 4 : 2);
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 = i17 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = i17 | (o0VarE.B(rVar2) ? 32 : 16);
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            r rVar3 = i18 != 0 ? r.S : rVar2;
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar.getClass();
            r rVarThen = v2.b(c2.l.z(aVar, f14, eVar.f97918c), fVar.f97719c, new b82.i(11), o0VarE, 0).then(rVar3);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            j.f22691a.getClass();
            s2 s2VarA = q2.a(j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarThen, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            n(fVar.f97718b, 0.0f, o0VarE, 0, 2);
            r rVar4 = rVar3;
            String str = fVar.f97717a;
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
            bVar.getClass();
            mh.c(str, c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
            rVar2 = rVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(fVar, rVar2, i14, i15, 9);
        }
    }

    public static final void j(int i14, p pVar, r rVar, m mVar) {
        int i15;
        pVar.getClass();
        o0 o0VarE = mVar.E(-1145113249);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            j.f22691a.getClass();
            j.c cVar = j.f22696f;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarY = c2.l.y(aVar, j92.b.f97899b.f97918c);
            long j8 = d92.b.a(o0VarE).e().f63500e;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            float f15 = 4;
            t0.a(rVar.then(u1.n.e(k.b(v2.c(rVarY, j8, 0.25f, f14, f15, f15, 0, o0VarE, 1797504, 0), i.a(f14)), ds.e0.w(o0VarE), m1.f128891a)), cVar, null, null, 0, 0, z3.f.c(1591220292, new ba2.i(pVar, 3), o0VarE), o0VarE, 1572912, 60);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(pVar, rVar, i14, 8);
        }
    }

    public static final void k(int i14, r rVar, i53.c cVar, m mVar) {
        cVar.getClass();
        o0 o0VarE = mVar.E(731465226);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            j((i15 & 112) | 6, z3.f.c(1533663316, new b82.p(cVar, 9), o0VarE), rVar, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e51.f(cVar, rVar, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    public static final void l(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-2073366869);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            r rVarU = x2.u(x2.h(r.S, f14), 16);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a02.a(j8, 26);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a02.a(j8, 26);
                    o0VarE.K(objQ);
                }
            }
            q.a(k.d(rVarU, (l) objQ), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    public static final void m(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-195371529);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            r rVarQ = x2.q(r.S, f14);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a02.a(j8, 24);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a02.a(j8, 24);
                    o0VarE.K(objQ);
                }
            }
            q.a(k.d(rVarQ, (l) objQ), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 1);
        }
    }

    public static final void n(g gVar, float f14, m mVar, int i14, int i15) {
        gVar.getClass();
        o0 o0VarE = mVar.E(-506049154);
        int i16 = (o0VarE.B(gVar) ? 4 : 2) | i14 | (((i15 & 2) == 0 && o0VarE.i(f14)) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
                if ((i15 & 2) != 0) {
                    i16 &= -113;
                }
            } else if ((i15 & 2) != 0) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f14 = j92.b.f97901d.f97903b;
                i16 &= -113;
            }
            float f15 = f14;
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            if (gVar instanceof g.a) {
                o0VarE.C(-981927639);
                c(((g.a) gVar).f97720a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.n) {
                o0VarE.C(-981925143);
                r(((g.n) gVar).f97733a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.b) {
                o0VarE.C(-981922515);
                a(((g.b) gVar).f97721a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.c) {
                o0VarE.C(-981919697);
                b(((g.c) gVar).f97722a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.e) {
                o0VarE.C(-981916883);
                d(((g.e) gVar).f97724a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.f) {
                o0VarE.C(-981914230);
                f(((g.f) gVar).f97725a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.C1863g) {
                o0VarE.C(-981911472);
                e(((g.C1863g) gVar).f97726a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.h) {
                o0VarE.C(-981908627);
                g(((g.h) gVar).f97727a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.j) {
                o0VarE.C(-981905875);
                l(((g.j) gVar).f97729a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.k) {
                o0VarE.C(-981903156);
                m(((g.k) gVar).f97730a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.l) {
                o0VarE.C(-981900468);
                o(((g.l) gVar).f97731a, f15, false, o0VarE, i16 & 112, 4);
                o0VarE.g0(false);
            } else if (gVar instanceof g.m) {
                o0VarE.C(-981897517);
                o(((g.m) gVar).f97732a, f15, false, o0VarE, (i16 & 112) | 384, 0);
                o0VarE.g0(false);
            } else if (gVar instanceof g.o) {
                o0VarE.C(-981894579);
                p(((g.o) gVar).f97734a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.p) {
                o0VarE.C(-981891761);
                q(((g.p) gVar).f97735a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.q) {
                o0VarE.C(-981888881);
                t(((g.q) gVar).f97736a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.r) {
                o0VarE.C(-981885803);
                s(((g.r) gVar).f97737a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.s) {
                o0VarE.C(-981882803);
                v(((g.s) gVar).f97738a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.t) {
                o0VarE.C(-981879853);
                u(((g.t) gVar).f97739a, f15, o0VarE, i16 & 112);
                o0VarE.g0(false);
            } else if (gVar instanceof g.d) {
                o0VarE.C(-373416081);
                e5.q(0, ((g.d) gVar).f97723a, o0VarE, false);
            } else {
                if (!(gVar instanceof g.i)) {
                    throw kg.f.h(o0VarE, -981927706, false);
                }
                o0VarE.C(-373329312);
                o0VarE.g0(false);
            }
            f14 = f15;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.q(gVar, f14, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    public static final void o(final long j8, final float f14, boolean z14, m mVar, final int i14, final int i15) {
        int i16;
        final boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objQ;
        o0 o0VarE = mVar.E(1703819578);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.i(f14) ? 32 : 16;
        }
        int i17 = i15 & 4;
        if (i17 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= o0VarE.h(z14) ? 256 : 128;
        }
        int i18 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if (i17 != 0) {
                    z16 = true;
                }
                o0VarE.h0();
                x1 x1Var = n.f135158a;
                r rVarQ = x2.q(r.S, f14);
                if ((i16 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z17 | ((i16 & 896) == 256);
                objQ = o0VarE.q();
                if (z18) {
                    objQ = new b(j8, z16, i18);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new b(j8, z16, i18);
                        o0VarE.K(objQ);
                    }
                }
                q.a(k.d(rVarQ, (l) objQ), o0VarE, 0);
                z15 = z16;
            } else {
                o0VarE.e();
            }
            z16 = z14;
            o0VarE.h0();
            x1 x1Var2 = n.f135158a;
            r rVarQ2 = x2.q(r.S, f14);
            if ((i16 & 14) == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z17 | ((i16 & 896) == 256);
            objQ = o0VarE.q();
            if (z18) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new b(j8, z16, i18);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new b(j8, z16, i18);
                o0VarE.K(objQ);
            }
            q.a(k.d(rVarQ2, (l) objQ), o0VarE, 0);
            z15 = z16;
        } else {
            o0VarE.e();
            z15 = z14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: j82.c
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e.o(j8, f14, z15, (m) obj, p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    public static final void p(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1792232208);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarQ = x2.q(aVar, f14);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a02.a(j8, 27);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a02.a(j8, 27);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = k.d(rVarQ, (l) objQ);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarD, o0VarE);
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            g6.f.a aVar3 = g6.f.f75994b;
            q.a(uVar.c(u1.n.e(x2.q(aVar, 8), j8, m1.f128891a), h4.d.a.f81528f), o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 9);
        }
    }

    public static final void q(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1390841356);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            q.a(u1.q.a(x2.q(r.S, f14), u1.n.a(w(f14), j8)), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 8);
        }
    }

    public static final void r(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-422343388);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            q.a(u1.n.e(x2.q(r.S, f14), j8, m1.f128891a), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    public static final void s(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(153040575);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            r rVarQ = x2.q(r.S, f14);
            boolean z15 = (i15 & 14) == 4;
            if ((((i15 & 112) ^ 48) <= 32 || !o0VarE.i(f14)) && (i15 & 48) != 32) {
                z14 = false;
            }
            boolean z16 = z15 | z14;
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new s5(j8, f14, 3);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new s5(j8, f14, 3);
                    o0VarE.K(objQ);
                }
            }
            u1.n.b(rVarQ, (l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    public static final void t(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1139181545);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            r rVarQ = x2.q(r.S, f14);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new d(j8, 0);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new d(j8, 0);
                    o0VarE.K(objQ);
                }
            }
            u1.n.b(rVarQ, (l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    public static final void u(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1331344294);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            r rVarQ = x2.q(r.S, f14);
            boolean z15 = (i15 & 14) == 4;
            if ((((i15 & 112) ^ 48) <= 32 || !o0VarE.i(f14)) && (i15 & 48) != 32) {
                z14 = false;
            }
            boolean z16 = z15 | z14;
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new s5(j8, f14, i16);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new s5(j8, f14, i16);
                    o0VarE.K(objQ);
                }
            }
            u1.n.b(rVarQ, (l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    public static final void v(long j8, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1068339650);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            r rVarQ = x2.q(r.S, f14);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new d(j8, 1);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new d(j8, 1);
                    o0VarE.K(objQ);
                }
            }
            u1.n.b(rVarQ, (l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(j8, f14, i14, 0);
        }
    }

    public static final float w(float f14) {
        d92.b.f58623a.getClass();
        j92.b bVar = d92.b.f58625c;
        bVar.getClass();
        j92.c cVar = j92.b.f97901d;
        if (g6.f.c(f14, cVar.f97903b)) {
            return 2;
        }
        bVar.getClass();
        return g6.f.c(f14, cVar.f97902a) ? 1 : 2;
    }

    public static final f x(f fVar, long j8) {
        return new f(fVar.f97717a, new g.a(j8, null), fVar.f97719c);
    }

    public static final f y(f fVar, long j8) {
        return new f(fVar.f97717a, new g.l(j8, null), fVar.f97719c);
    }
}
