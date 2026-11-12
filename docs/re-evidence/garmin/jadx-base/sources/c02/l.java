package c02;

import a03.t0;
import c2.b0;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.p;
import h4.r;
import h5.e0;
import java.util.List;
import o4.d0;
import o4.f0;
import o4.m1;
import o4.w;
import o4.z0;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<d0> f22395a = x.k(d0.a(f0.d(4283605206L)), d0.a(f0.d(4286146989L)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<d0> f22396b = x.k(d0.a(f0.d(4293231675L)), d0.a(f0.d(4293631551L)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<d0> f22397c = x.k(d0.a(f0.d(4283871607L)), d0.a(f0.d(4285856331L)));

    /* JADX WARN: Code duplicated, block: B:35:0x00da  */
    public static final void a(r rVar, b bVar, List list, p3.m mVar, int i14) {
        r rVar2;
        boolean z14;
        r.a aVar;
        b bVar2 = bVar;
        o0 o0VarE = mVar.E(1049665212);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | 6 | (o0VarE.B(bVar2) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            r.a aVar2 = r.S;
            x1 x1Var = p3.n.f135158a;
            z0 z0VarI = w.a.i(w.f129023a, list, 0.0f, 14);
            long jB = tn.k.b(d92.b.f58623a, o0VarE);
            r rVarG = c2.l.g(aVar2, 1.0f);
            k2.h hVar = k2.i.f102406a;
            g6.f.a aVar3 = g6.f.f75994b;
            r rVarY = c2.l.y(u1.n.e(l4.k.b(rVarG, hVar), jB, m1.f128891a), 2);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            boolean z15 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new b41.a(bVar2, 10);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new b41.a(bVar2, 10);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = x2.d(v.b(aVar2, (e23.l) objQ), 1.0f);
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarC2 = uVar.c(u1.q.c(eVar2.f97917b, rVarD, z0VarI, hVar), h4.d.a.f81528f);
            bVar4.getClass();
            r rVarY2 = c2.l.y(rVarC2, eVar2.f97918c);
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22696f, h4.d.a.f81537o, o0VarE, 54);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarY2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var = b0.f22601a;
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC4 = h4.k.c(aVar2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar3);
            }
            b4.c(fVar, rVarC4, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar2 = bVar;
            String strJ = bVar != null ? bVar2.f22352a : null;
            if (strJ == null) {
                z14 = false;
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1801918589, R.string.no_value, o0VarE, false);
            } else {
                z14 = false;
                o0VarE.C(1801918124);
                o0VarE.g0(false);
            }
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
            u2Var.getClass();
            p pVar = f5.b.f68892a;
            g02.c.a(strJ, u2Var.d(aVar2, pVar), 0L, null, 0, false, 1, x0VarB, 0.0d, o0VarE, 1572864, 316);
            if (g22.n.d(bVar2 != null ? bVar2.f22354c : null)) {
                o0VarE.C(25190953);
                String str = bVar2 != null ? bVar2.f22354c : null;
                if (str == null) {
                    str = "";
                }
                fVar2.getClass();
                x0 x0VarB2 = d92.c.b(j92.f.f97932i, o0VarE);
                d6.p.f57793b.getClass();
                int i16 = d6.p.f57796e;
                bVar4.getClass();
                aVar = aVar2;
                g02.c.a(str, u2Var.d(c2.l.C(aVar2, eVar2.f97917b, 0.0f, 0.0f, 0.0f, 14), pVar), 0L, null, i16, false, 1, x0VarB2, 0.0d, o0VarE, 1597440, 300);
                o0VarE.g0(false);
            } else {
                aVar = aVar2;
                o0VarE.C(25636454);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            String str2 = bVar2 != null ? bVar2.f22353b : null;
            String str3 = str2 == null ? "" : str2;
            fVar2.getClass();
            g02.c.a(str3, null, 0L, null, 0, false, 1, d92.c.f(j92.f.f97933j, o0VarE), 0.0d, o0VarE, 1572864, 318);
            o0VarE.g0(true);
            o0VarE.g0(true);
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.e(rVar2, bVar2, list, i14, 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(o13.u uVar, r rVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-837851252);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (o0VarE.B(uVar) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar2 = u.f22885a;
            r rVarF = x2.f(r.S, 1.0f);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = k.f22394a;
                o0VarE.K(objQ);
            }
            f5.z0 z0Var = (f5.z0) objQ;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarF, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0Var, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            a(null, (b) uVar.f128605a, f22395a, o0VarE, 0);
            a(null, (b) uVar.f128606b, f22396b, o0VarE, 0);
            a(null, (b) uVar.f128607c, f22397c, o0VarE, 0);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t0(uVar, rVar, i14, 25);
        }
    }
}
