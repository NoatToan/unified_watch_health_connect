package wg2;

import androidx.lifecycle.n0;
import c2.c3;
import c2.j0;
import c2.k3;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import da0.b0;
import da0.c0;
import e23.p;
import h4.r;
import h5.e0;
import i3.hb;
import i3.kb;
import i3.nj;
import i3.p7;
import i3.s7;
import mg2.w;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes11.dex */
public final class l {
    public static final void a(int i14, e23.a aVar, String str, p3.m mVar, u4.d dVar) {
        int i15;
        e23.a aVar2;
        String str2;
        u4.d dVar2;
        o0 o0VarE = mVar.E(-155780981);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            if (dVar == null) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new b0(i14, 5, aVar, str, dVar);
                    return;
                }
                return;
            }
            aVar2 = aVar;
            str2 = str;
            dVar2 = dVar;
            y3 y3Var = p7.f89282d;
            g6.f.f75994b.getClass();
            v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(-2132890677, new c0(aVar2, dVar2, str2, 5), o0VarE), o0VarE, 56);
        } else {
            aVar2 = aVar;
            str2 = str;
            dVar2 = dVar;
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new b0(i14, 6, aVar2, str2, dVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    public static final void b(r rVar, e23.a aVar, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        o0 o0Var;
        r rVar2;
        o0 o0VarP = fb1.c.p(aVar2, aVar3, mVar, 724135532);
        int i15 = i14 | 6 | (o0VarP.r(aVar) ? 32 : 16) | (o0VarP.r(aVar2) ? 256 : 128) | (o0VarP.r(aVar3) ? 2048 : 1024);
        if (o0VarP.n(i15 & 1, (i15 & 1171) != 1170)) {
            r.a aVar4 = r.S;
            x1 x1Var = n.f135158a;
            n0 n0Var = (n0) o0VarP.A(s9.j.f158018a);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarP.r(n0Var) | ((i15 & 896) == 256);
            Object objQ = o0VarP.q();
            if (zR) {
                objQ = new k(n0Var, aVar2, null);
                o0VarP.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k(n0Var, aVar2, null);
                    o0VarP.K(objQ);
                }
            }
            l0.e((p) objQ, unit, o0VarP);
            s7.f89624a.getClass();
            long jC = d0.c(0.0f, s7.a(o0VarP).f88497n, 14);
            hb.f88319a.getClass();
            c3 c3VarA = hb.a(o0VarP);
            i3.d0.f87812a.getClass();
            j0 j0Var = new j0(c3VarA, i3.d0.a(o0VarP));
            rVar2 = aVar4;
            o0Var = o0VarP;
            kb.a(null, z3.f.c(1127905576, new w51.n0(aVar3, 5), o0VarP), null, null, null, 0, jC, 0L, j0Var, z3.f.c(-1232942339, new vv0.e(12, aVar4, aVar), o0VarP), o0Var, 805306416, PsExtractor.PRIVATE_STREAM_1);
        } else {
            o0Var = o0VarP;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ds.h(rVar2, aVar, aVar2, aVar3, i14, 1);
        }
    }

    public static final void c(u4.d dVar, e23.a aVar, k3 k3Var, p3.m mVar, int i14) {
        k3 k3Var2;
        k3 k3VarA;
        int i15;
        o0 o0VarE = mVar.E(-305013469);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(dVar) ? 4 : 2) | 48 | (o0VarE.r(aVar) ? 256 : 128) | 1024;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                nj.f89109a.getClass();
                k3VarA = nj.a(o0VarE);
                i15 = i16 & (-7169);
            } else {
                o0VarE.e();
                i15 = i16 & (-7169);
                k3VarA = k3Var;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            r rVarG = c2.l.G(x2.f(aVar2, 1.0f), k3VarA);
            w.f118432a.getClass();
            r rVarB = x2.b(rVarG, 0.0f, w.f118433b, 1);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22698h, bVar, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
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
            r rVarA = u2.f22900a.a(aVar2, 1.0f, true);
            s2 s2VarA2 = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarA, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            a(i15 & 910, aVar, null, o0VarE, dVar);
            o0VarE.g0(true);
            o0VarE.g0(true);
            k3Var2 = k3VarA;
        } else {
            o0VarE.e();
            k3Var2 = k3Var;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.b(dVar, aVar, k3Var2, i14, 14);
        }
    }
}
