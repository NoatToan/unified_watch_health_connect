package zr;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import nr.g0;
import nr.u;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.w;
import xn.t;
import zo1.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    public static final void a(u.b bVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(302804292);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar2.getClass();
            float f15 = eVar.f97920e;
            bVar2.getClass();
            r rVarC = c2.l.C(aVar, f14, eVar.f97918c, f15, 0.0f, 8);
            z3.e eVarC = z3.f.c(797980946, new t(bVar, 23), o0VarE);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new yr.o0(bVar, 25);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new yr.o0(bVar, 25);
                    o0VarE.K(objQ);
                }
            }
            l72.l.c(eVarC, null, rVarC, null, false, (e23.a) objQ, o0VarE, 6, 26);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new yr.d(bVar, i14, 27);
        }
    }

    public static final void b(ArrayList arrayList, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-956527395);
        int i15 = (o0VarE.r(arrayList) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                if (uVar instanceof u.c) {
                    o0VarE.C(-1779576379);
                    r rVarF = x2.f(r.S, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
                    x1 x1Var2 = n.f135158a;
                    int iHashCode = Long.hashCode(o0VarE.U);
                    i2 i2VarA0 = o0VarE.a0();
                    r rVarC = h4.k.c(rVarF, o0VarE);
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
                    b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    u2 u2Var = u2.f22900a;
                    c(uVar, null, o0VarE, 0, 2);
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                } else if (uVar instanceof u.b) {
                    o0VarE.C(-1779281476);
                    a((u.b) uVar, o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    if (!(uVar instanceof u.a)) {
                        throw kg.f.h(o0VarE, -1442880647, false);
                    }
                    o0VarE.C(-1779189189);
                    d((u.a) uVar, o0VarE, 0);
                    o0VarE.g0(false);
                }
            }
            x1 x1Var3 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bp0.b(arrayList, i14, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x02de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v5, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v6, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v7, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r15v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r9v13, types: [p3.m] */
    public static final void c(u uVar, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        e23.a<Unit> aVar2;
        int i16;
        e23.a<Unit> aVar3;
        ?? r14;
        e0.a aVar4;
        h5.g.a.f fVar;
        h5.g.a.C1623g c1623g;
        j92.e eVar;
        h5.g.a.b bVar;
        ?? r15;
        r.a aVar5;
        o0 o0Var;
        r.a aVar6;
        ?? r16;
        boolean z14;
        o0 o0VarE = mVar.E(-33232346);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.B(uVar) ? 4 : 2);
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 = i17 | 48;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i16 = i17 | (o0VarE.r(aVar2) ? 32 : 16);
        }
        int i19 = i16;
        if (o0VarE.n(i19 & 1, (i19 & 19) != 18)) {
            if (i18 != 0) {
                aVar2 = null;
            }
            x1 x1Var = n.f135158a;
            r.a aVar7 = r.S;
            r rVarF = x2.f(aVar7, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarY = c2.l.y(rVarF, eVar2.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar3 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar8 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarA0, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            g0 f127361d = uVar.getF127361d();
            u4.d dVar = f127361d != null ? f127361d.f127181c : null;
            if (dVar != null) {
                long j8 = zl.a.b(o0VarE, 891464767, o0VarE).f63508c;
                gl.c.f77766a.getClass();
                long jG = gl.c.a(o0VarE).g();
                bVar2.getClass();
                eVar = eVar2;
                bVar = bVar4;
                aVar4 = aVar8;
                fVar = fVar2;
                c1623g = c1623g2;
                r15 = 0;
                aVar5 = aVar7;
                g02.i.a(null, dVar, j8, jG, j92.b.f97901d.f97906e, 0.0f, null, o0VarE, 0, 225);
                o0VarE.g0(false);
                o0Var = o0VarE;
            } else {
                aVar4 = aVar8;
                fVar = fVar2;
                c1623g = c1623g2;
                eVar = eVar2;
                bVar = bVar4;
                r15 = 0;
                aVar5 = aVar7;
                o0VarE.C(891746526);
                wf.f.a aVar9 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                g0 f127361d2 = uVar.getF127361d();
                aVar9.f184930c = f127361d2 != null ? f127361d2.f127179a : null;
                wf.g.a(aVar9);
                wf.f fVarA = aVar9.a();
                t4.d dVarA = n5.c.a(2131231969, o0VarE, 0);
                t4.d dVarA2 = n5.c.a(2131231969, o0VarE, 0);
                bVar2.getClass();
                jf.r.b(fVarA, null, x2.q(aVar5, j92.b.f97901d.f97906e), dVarA, dVarA2, null, null, null, null, null, null, null, o0VarE, 48, 0, 32736);
                o0 o0Var2 = o0VarE;
                o0Var2.g0(false);
                o0Var = o0Var2;
            }
            bVar2.getClass();
            r.a aVar10 = aVar5;
            r rVarC2 = c2.l.C(aVar10, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0Var, r15);
            int iHashCode2 = Long.hashCode(o0Var.U);
            i2 i2VarA1 = o0Var.a0();
            r rVarC3 = h4.k.c(rVarC2, o0Var);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar4);
            } else {
                o0Var.c();
            }
            b4.c(eVar3, zVarA, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0Var);
            b0 b0Var = b0.f22601a;
            String f127358a = uVar.getF127358a();
            if (f127358a == null) {
                f127358a = "";
            }
            String str = f127358a;
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            o0 o0Var3 = o0Var;
            mh.c(str, null, com.nimbusds.jose.shaded.gson.internal.a.d(o0Var), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0Var3, 0, 0, 131066);
            ?? r17 = o0Var3;
            String f127359b = uVar.getF127359b();
            if (f127359b == null) {
                r17.C(-1746732059);
                r17.g0(r15);
                aVar6 = aVar10;
                r16 = r17;
            } else {
                r17.C(-1746732058);
                bVar2.getClass();
                r rVarC4 = c2.l.C(aVar10, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
                aVar6 = aVar10;
                fVar3.getClass();
                mh.c(f127359b, rVarC4, vb.h.g(r17), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, r17, 0, 0, 131064);
                ?? r18 = r17;
                Unit unit = Unit.INSTANCE;
                r18.g0(r15);
                r16 = r18;
            }
            r16.g0(true);
            u4.d f127360c = uVar.getF127360c();
            if (f127360c == null) {
                r16.C(892795596);
                r16.g0(r15);
                z14 = true;
                aVar3 = aVar2;
            } else {
                r16.C(892795597);
                c2.l.f(u2Var.a(aVar6, 1.0f, true), r16);
                long jD = d92.b.a(r16).f().d();
                aVar3 = aVar2;
                ?? r19 = aVar3 != null ? 1 : r15;
                ?? r110 = (i19 & 112) == 32 ? 1 : r15;
                Object objQ = r16.q();
                if (r110 == 0) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new y0(aVar3, 5);
                        r16.K(objQ);
                    }
                } else {
                    objQ = new y0(aVar3, 5);
                    r16.K(objQ);
                }
                i7.b(f127360c, null, w.d(aVar6, r19, null, null, (e23.a) objQ, 14), jD, r16, 48, 0);
                Unit unit2 = Unit.INSTANCE;
                r16.g0(r15);
                z14 = true;
            }
            r16.g0(z14);
            r14 = r16;
        } else {
            o0VarE.e();
            aVar3 = aVar2;
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(uVar, (e23.a) aVar3, i14, i15);
        }
    }

    public static final void d(u.a aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(570484457);
        int i15 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(r.S, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            c(aVar, aVar.f127366i, o0VarE, i15 & 14, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new yr.d(aVar, i14, 28);
        }
    }
}
