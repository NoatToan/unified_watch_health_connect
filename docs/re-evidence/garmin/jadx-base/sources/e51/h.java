package e51;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import cq.t;
import e23.l;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import i3.v5;
import o4.m1;
import o51.i;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import t21.u;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f63063a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f63063a = 2;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0176  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Throwable] */
    public static final void a(i iVar, r rVar, p<? super t41.h, ? super Integer, Unit> pVar, m mVar, int i14, int i15) {
        r rVar2;
        int i16;
        p<? super t41.h, ? super Integer, Unit> pVar2;
        int i17;
        r rVar3;
        p<? super t41.h, ? super Integer, Unit> pVar3;
        long jB;
        iVar.getClass();
        o0 o0VarE = mVar.E(1761729174);
        int i18 = i14 | (o0VarE.B(iVar) ? 4 : 2);
        int i19 = i15 & 2;
        if (i19 != 0) {
            i16 = i18 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = i18 | (o0VarE.B(rVar2) ? 32 : 16);
        }
        int i24 = i15 & 4;
        if (i24 != 0) {
            i17 = i16 | 384;
            pVar2 = pVar;
        } else {
            pVar2 = pVar;
            i17 = i16 | (o0VarE.r(pVar2) ? 256 : 128);
        }
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            r rVar4 = i19 != 0 ? r.S : rVar2;
            l lVar = null;
            if (i24 != 0) {
                pVar2 = null;
            }
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(rVar4, 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            c(0, null, iVar.f129269a, o0VarE);
            d92.b.f58623a.getClass();
            p<? super t41.h, ? super Integer, Unit> pVar4 = pVar2;
            v5.a(f63063a, 48, 1, d92.b.a(o0VarE).j().c(), null, o0VarE);
            o0VarE.C(308317691);
            int i25 = 0;
            for (i53.c<o51.h> cVar : iVar.f129270b) {
                int i26 = i25 + 1;
                if (i25 < 0) {
                    ?? r18 = lVar;
                    x.q();
                    throw r18;
                }
                i53.c<o51.h> cVar2 = cVar;
                i53.c<t41.h> cVar3 = iVar.f129269a;
                if (i25 % 2 == 0) {
                    o0VarE.C(-219832925);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarE).c().b();
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-219757502);
                    jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
                }
                if (pVar4 == null) {
                    o0VarE.C(-219622405);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-219622404);
                    boolean zK = ((i17 & 14) == 4) | ((i17 & 896) == 256) | o0VarE.k(i25);
                    Object objQ = o0VarE.q();
                    if (zK) {
                        objQ = new ct2.e(iVar, pVar4, i25, 2);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ct2.e(iVar, pVar4, i25, 2);
                            o0VarE.K(objQ);
                        }
                    }
                    lVar = (l) objQ;
                    o0VarE.g0(false);
                }
                b(cVar3, cVar2, jB, null, lVar, o0VarE, 0);
                d92.b.f58623a.getClass();
                v5.a(0.0f, 0, 3, d92.b.a(o0VarE).j().c(), null, o0VarE);
                i25 = i26;
                lVar = null;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
            pVar3 = pVar4;
            rVar3 = rVar4;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            pVar3 = pVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(iVar, rVar3, (p) pVar3, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0138  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r7v2, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r7v5, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void b(i53.c cVar, i53.c cVar2, long j8, r rVar, l lVar, m mVar, int i14) {
        r rVar2;
        ?? r14;
        boolean z14;
        x0 x0VarB;
        t41.h hVar;
        o0 o0VarE = mVar.E(-2062331408);
        i53.c cVar3 = cVar2;
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.B(cVar3) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128) | 3072 | (o0VarE.r(lVar) ? 16384 : 8192);
        ?? r15 = 0;
        boolean z15 = true;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            r.a aVar = r.S;
            x1 x1Var = n.f135158a;
            boolean z16 = lVar != null;
            r rVarE = u1.n.e(x2.f(aVar, 1.0f), j8, m1.f128891a);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = c2.l.A(rVarE, j92.b.f97899b.f97920e, 0.0f, 2);
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarA, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(-857032406);
            int i16 = 0;
            for (Object obj : cVar3) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    x.q();
                    throw null;
                }
                o51.h hVar2 = (o51.h) obj;
                ?? r16 = (z16 && (hVar = (t41.h) h0.e0(i16, cVar)) != null && hVar.f162313c == z15) ? z15 : r15;
                r rVarA2 = u2Var.a(r.S, 1.0f, z15);
                int i18 = ((i15 & 57344) == 16384 ? 1 : r15) | (o0VarE.k(i16) ? 1 : 0);
                Object objQ = o0VarE.q();
                m.a aVar3 = m.f135153a;
                if (i18 == 0) {
                    aVar3.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new g(lVar, i16, (int) r15);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new g(lVar, i16, (int) r15);
                    o0VarE.K(objQ);
                }
                r rVarA3 = wz1.i.a((l) objQ, rVarA2, r16);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarA4 = c2.l.A(rVarA3, 0.0f, j92.b.f97899b.f97920e, 1);
                boolean z17 = i16 != cVar3.size() - 1;
                Object objQ2 = o0VarE.q();
                aVar3.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = new dv0.n(25);
                    o0VarE.K(objQ2);
                }
                r rVarA5 = wz1.i.a((l) objQ2, rVarA4, z17);
                boolean zB = o0VarE.B(hVar2);
                Object objQ3 = o0VarE.q();
                if (zB || objQ3 == c2565a) {
                    z14 = false;
                    objQ3 = new e(hVar2, 0);
                    o0VarE.K(objQ3);
                } else {
                    z14 = false;
                }
                r rVarC2 = v.c((l) objQ3, rVarA5, z14);
                String str = hVar2.f129266a;
                if (z16 && r16 == 0) {
                    o0VarE.C(189464602);
                    d92.b.f58624b.getClass();
                    x0VarB = d92.c.f(j92.f.f97932i, o0VarE);
                    o0VarE.g0(z14);
                } else {
                    o0VarE.C(189390140);
                    d92.b.f58624b.getClass();
                    x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                    o0VarE.g0(z14);
                }
                o0 o0Var = o0VarE;
                g02.c.a(str, rVarC2, 0L, null, 0, false, 2, x0VarB, 0.0d, o0Var, 1572864, 316);
                cVar3 = cVar2;
                r15 = z14;
                o0VarE = o0Var;
                i16 = i17;
                aVar = aVar;
                z15 = true;
            }
            ?? r17 = o0VarE;
            r17.g0(r15);
            r17.g0(true);
            x1 x1Var2 = n.f135158a;
            rVar2 = aVar;
            r14 = r17;
        } else {
            o0 o0Var2 = o0VarE;
            o0Var2.e();
            rVar2 = rVar;
            r14 = o0Var2;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.e(cVar, cVar2, j8, rVar2, lVar, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r3v6, types: [c2.u2] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static final void c(int i14, r rVar, i53.c cVar, m mVar) {
        int i15;
        o0 o0VarE = mVar.E(-600968545);
        int i16 = (o0VarE.B(cVar) ? 4 : 2) | i14 | 48;
        boolean z14 = false;
        ?? r14 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            r.a aVar = r.S;
            x1 x1Var = n.f135158a;
            boolean z15 = ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).orientation == 2;
            float f14 = 1.0f;
            r rVarE = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            float f15 = 0.0f;
            r rVarA = c2.l.A(rVarE, j92.b.f97899b.f97920e, 0.0f, 2);
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarA, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(-361584824);
            int i17 = 0;
            ?? r15 = u2Var;
            for (Object obj : cVar) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    x.q();
                    throw null;
                }
                t41.h hVar = (t41.h) obj;
                String strQ = gl1.y.Q(o0VarE, z15 ? hVar.f162312b : hVar.f162311a);
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                hVar.getClass();
                context.getClass();
                String string = context.getString(z15 ? hVar.f162312b : hVar.f162311a);
                string.getClass();
                if (t41.h.a.f162314a[hVar.ordinal()] == r14) {
                    string = oi0.c.A(context, new u(14), string);
                }
                r rVarA2 = r15.a(r.S, f14, r14);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarA3 = c2.l.A(rVarA2, f15, j92.b.f97899b.f97918c, r14);
                ?? r16 = i17 != cVar.size() - r14 ? r14 : z14;
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new dv0.n(24);
                    o0VarE.K(objQ);
                }
                r rVarA4 = wz1.i.a((l) objQ, rVarA3, r16);
                boolean zB = o0VarE.B(string);
                Object objQ2 = o0VarE.q();
                if (zB || objQ2 == c2565a) {
                    objQ2 = new t(string, 16);
                    o0VarE.K(objQ2);
                }
                r rVarC2 = v.c((l) objQ2, rVarA4, z14);
                d92.b.f58624b.getClass();
                g02.c.a(strQ, rVarC2, 0L, null, 0, false, 2, d92.c.e(d92.c.b(j92.f.f97932i, o0VarE)), 0.0d, o0VarE, 1572864, 316);
                z14 = z14;
                i17 = i18;
                f14 = f14;
                f15 = f15;
                r15 = r15;
                r14 = 1;
                aVar = aVar;
            }
            rVar = aVar;
            o0VarE.g0(z14);
            i15 = 1;
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            i15 = 1;
            o0VarE.e();
        }
        r rVar2 = rVar;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(cVar, rVar2, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [int] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v6, types: [c2.u2] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static final void d(int i14, r rVar, i53.c cVar, m mVar) {
        ?? r14;
        cVar.getClass();
        o0 o0VarE = mVar.E(340020392);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14 | 48;
        boolean z14 = false;
        ?? r15 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            r.a aVar = r.S;
            x1 x1Var = n.f135158a;
            float f14 = 1.0f;
            r rVarE = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            float f15 = 0.0f;
            r rVarA = c2.l.A(rVarE, j92.b.f97899b.f97920e, 0.0f, 2);
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarA, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(1364932996);
            int i16 = 0;
            ?? r16 = u2Var;
            for (Object obj : cVar) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    x.q();
                    throw null;
                }
                o51.h hVar = (o51.h) obj;
                r rVarA2 = r16.a(r.S, f14, r15);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarA3 = c2.l.A(rVarA2, f15, j92.b.f97899b.f97920e, r15);
                ?? r17 = i16 != cVar.size() - r15 ? r15 : z14;
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new dv0.n(23);
                    o0VarE.K(objQ);
                }
                r rVarA4 = wz1.i.a((l) objQ, rVarA3, r17);
                boolean zB = o0VarE.B(hVar);
                Object objQ2 = o0VarE.q();
                if (zB || objQ2 == c2565a) {
                    objQ2 = new e(hVar, r15);
                    o0VarE.K(objQ2);
                }
                r rVarC2 = v.c((l) objQ2, rVarA4, z14);
                String str = hVar.f129266a;
                d92.b.f58624b.getClass();
                g02.c.a(str, rVarC2, 0L, null, 0, false, 1, d92.c.e(j92.f.f97932i), 0.0d, o0VarE, 1572864, 316);
                z14 = z14;
                i16 = i17;
                r16 = r16;
                f15 = f15;
                f14 = f14;
                r15 = 1;
                aVar = aVar;
            }
            rVar = aVar;
            boolean z15 = z14;
            o0VarE.g0(z15);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
            r14 = z15;
        } else {
            r14 = 0;
            o0VarE.e();
        }
        r rVar2 = rVar;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(cVar, rVar2, i14, (int) r14);
        }
    }
}
