package ku1;

import a11.g0;
import b21.l0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import h4.r;
import h5.e0;
import i3.mh;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final class n {
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    public static final void a(r rVar, u4.d dVar, String str, String str2, String str3, String str4, e23.a aVar, p3.m mVar, int i14) {
        r rVar2;
        r.a aVar2;
        dVar.getClass();
        str2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1151284057);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | 6 | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024) | (o0VarE.B(str3) ? 16384 : 8192) | (o0VarE.B(str4) ? 131072 : 65536) | (o0VarE.r(aVar) ? 1048576 : 524288);
        if (o0VarE.n(i15 & 1, (i15 & 599187) != 599186)) {
            r.a aVar3 = r.S;
            x1 x1Var = p3.n.f135158a;
            r rVarE = u1.n.e(aVar3, am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            boolean z14 = (i15 & 3670016) == 1048576;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a(aVar, 2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(aVar, 2);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = w.d(rVarE, false, null, null, (e23.a) objQ, 15);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            r rVarY = c2.l.y(rVarD, j92.b.f97899b.f97920e);
            c2.j jVar = c2.j.f22691a;
            g6.f.a aVar4 = g6.f.f75994b;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(12);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            long j8 = d92.b.a(o0VarE).f().f63508c;
            long jE = d92.b.a(o0VarE).e().e();
            bVar.getClass();
            g02.i.a(null, dVar, j8, jE, j92.b.f97901d.f97906e, 0.0f, null, o0VarE, i15 & 112, 225);
            r rVarF = x2.f(aVar3, 1.0f);
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarF, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            if (str == null) {
                o0VarE.C(1896310124);
                o0VarE.g0(false);
                aVar2 = aVar3;
            } else {
                o0VarE.C(1896310125);
                d92.b.f58624b.getClass();
                aVar2 = aVar3;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                Unit unit = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            d92.b.f58624b.getClass();
            int i16 = i15 >> 9;
            o0 o0Var = o0VarE;
            g02.e0.a(str2, str3, str4, null, false, false, true, null, null, null, null, d92.c.b(j92.f.f97931h, o0VarE), o0Var, (i16 & 14) | 1597440 | (i16 & 112) | (i16 & 896), 0, 1960);
            o0VarE = o0Var;
            o0VarE.g0(true);
            o0VarE.g0(true);
            rVar2 = aVar2;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(rVar2, dVar, str, str2, str3, str4, aVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    public static final void b(r rVar, u4.d dVar, String str, String str2, String str3, e23.a aVar, p3.m mVar, int i14) {
        r rVar2;
        r.a aVar2;
        dVar.getClass();
        str2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(199583493);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | 6 | (o0VarE.B(dVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        int i16 = i15 | (o0VarE.B(str2) ? 2048 : 1024) | (o0VarE.B(str3) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (i16 & 74899) != 74898)) {
            r.a aVar3 = r.S;
            x1 x1Var = p3.n.f135158a;
            r rVarE = u1.n.e(aVar3, am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            boolean z14 = (i16 & 458752) == 131072;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a(aVar, 3);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(aVar, 3);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = w.d(rVarE, false, null, null, (e23.a) objQ, 15);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            r rVarY = c2.l.y(rVarD, j92.b.f97899b.f97920e);
            c2.j jVar = c2.j.f22691a;
            g6.f.a aVar4 = g6.f.f75994b;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(12);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            long j8 = d92.b.a(o0VarE).f().f63508c;
            long jE = d92.b.a(o0VarE).e().e();
            bVar.getClass();
            g02.i.a(null, dVar, j8, jE, j92.b.f97901d.f97906e, 0.0f, null, o0VarE, i16 & 112, 225);
            r rVarF = x2.f(aVar3, 1.0f);
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarF, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            if (str == null) {
                o0VarE.C(-1872391991);
                o0VarE.g0(false);
                aVar2 = aVar3;
            } else {
                o0VarE.C(-1872391990);
                d92.b.f58624b.getClass();
                aVar2 = aVar3;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                Unit unit = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            d92.b.f58624b.getClass();
            int i17 = i16 >> 9;
            o0 o0Var = o0VarE;
            g02.e0.a(str2, str3, null, null, false, false, true, null, null, null, null, d92.c.b(j92.f.f97931h, o0VarE), o0Var, (i17 & 14) | 1597440 | (i17 & 112), 0, 1964);
            o0VarE = o0Var;
            o0VarE.g0(true);
            o0VarE.g0(true);
            rVar2 = aVar2;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(rVar2, (Object) dVar, str, str2, str3, (Object) aVar, i14, 25);
        }
    }
}
