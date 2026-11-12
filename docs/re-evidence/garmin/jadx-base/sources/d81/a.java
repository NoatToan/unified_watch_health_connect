package d81;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: d81.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1242a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((g81.x) t14).f76417a, ((g81.x) t7).f76417a);
        }
    }

    public static final void a(g81.x xVar, p3.m mVar, int i14) {
        o0 o0Var;
        xVar.getClass();
        o0 o0VarE = mVar.E(-296782602);
        int i15 = (o0VarE.r(xVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF = x2.f(aVar, 1.0f);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar2.getClass();
            h4.r rVarZ = c2.l.z(rVarF, eVar.f97920e, f14);
            String upperCase = xVar.f76418b.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58624b.getClass();
            mh.c(upperCase, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            o0Var.C(1425248897);
            Iterator<g81.l> it = xVar.f76419c.iterator();
            while (it.hasNext()) {
                b(it.next(), o0Var, 0);
            }
            o0Var.g0(false);
            o0Var.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c62.m1(xVar, i14, 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x01fc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v5, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r4v13, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r4v9, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static final void b(g81.l lVar, p3.m mVar, int i14) {
        ?? r14;
        ?? r15;
        lVar.getClass();
        c3 c3Var = lVar.f76361a;
        o0 o0VarE = mVar.E(-1432559620);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(lVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String strP = gl1.y.P(R.string.string_space_string_pattern, new Object[]{gl1.d.T(c3Var, o0VarE, 0), lVar.f76362b}, o0VarE);
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97919d;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarE, eVar.f97920e, f14);
            boolean zB = o0VarE.B(strP);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = new cq.t(strP, 10);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new cq.t(strP, 10);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarB = p5.v.b(rVarZ, (e23.l) objQ);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            h4.r rVarA = u2Var.a(aVar, 0.66f, true);
            String strT = gl1.d.T(c3Var, o0VarE, 0);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97931h;
            mh.c(strT, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            h4.r rVarA2 = u2Var.a(aVar, 0.34f, true);
            String str = lVar.f76362b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(x0Var, o0VarE);
            w5.f0.f182097b.getClass();
            w5.f0 f0Var = w5.f0.f182105j;
            d6.h.f57752b.getClass();
            mh.c(str, rVarA2, 0L, null, 0L, f0Var, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 1572864, 0, 129980);
            o0 o0Var = o0VarE;
            o0Var.g0(true);
            List<g81.l> list = lVar.f76363c;
            if (list == null) {
                o0Var.C(1707556360);
                o0Var.g0(false);
                r15 = o0Var;
            } else {
                ?? r16 = 0;
                o0Var.C(1707556361);
                Iterator it = list.iterator();
                ?? r17 = o0Var;
                while (it.hasNext()) {
                    g81.l lVar2 = (g81.l) it.next();
                    String strP2 = gl1.y.P(R.string.string_space_string_pattern, new Object[]{gl1.d.T(lVar2.f76361a, r17, r16), lVar2.f76362b}, r17);
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarE2 = u1.n.e(x2.f(aVar4, 1.0f), am.j.A(d92.b.f58623a, r17), m1.f128891a);
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f15 = eVar2.f97919d;
                    bVar3.getClass();
                    h4.r rVarZ2 = c2.l.z(rVarE2, eVar2.f97920e, f15);
                    boolean zB2 = r17.B(strP2);
                    Object objQ2 = r17.q();
                    if (zB2) {
                        objQ2 = new cq.t(strP2, 11);
                        r17.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new cq.t(strP2, 11);
                            r17.K(objQ2);
                        }
                    }
                    h4.r rVarB2 = p5.v.b(rVarZ2, (e23.l) objQ2);
                    c2.j.f22691a.getClass();
                    c2.j.C0343j c0343j2 = c2.j.f22692b;
                    h4.d.f81522a.getClass();
                    s2 s2VarA2 = q2.a(c0343j2, h4.d.a.f81533k, r17, r16);
                    x1 x1Var2 = p3.n.f135158a;
                    int iHashCode2 = Long.hashCode(r17.U);
                    i2 i2VarA1 = r17.a0();
                    h4.r rVarC2 = h4.k.c(rVarB2, r17);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    r17.z();
                    if (r17.T) {
                        r17.M(aVar5);
                    } else {
                        r17.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA2, r17);
                    b4.c(h5.g.a.f81809f, i2VarA1, r17);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (r17.T || !p005kotlin.jvm.internal.s.g(r17.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, r17, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, r17);
                    u2 u2Var2 = u2.f22900a;
                    h4.r rVarA3 = u2Var2.a(aVar4, 0.66f, true);
                    bVar3.getClass();
                    h4.r rVarC3 = c2.l.C(rVarA3, eVar2.f97919d, 0.0f, 0.0f, 0.0f, 14);
                    String strT2 = gl1.d.T(lVar2.f76361a, r17, r16);
                    j92.f fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    x0 x0Var2 = j92.f.f97932i;
                    ?? r24 = r17;
                    mh.c(strT2, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, r17), r24, 0, 0, 131068);
                    h4.r rVarA4 = u2Var2.a(aVar4, 0.34f, true);
                    String str2 = lVar2.f76362b;
                    fVar2.getClass();
                    x0 x0VarF = d92.c.f(x0Var2, r24);
                    d6.h.f57752b.getClass();
                    mh.c(str2, rVarA4, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarF, r24, 0, 0, 130044);
                    ?? r18 = r24;
                    r18.g0(true);
                    r16 = 0;
                    it = it;
                    r17 = r18;
                }
                r17.g0(r16);
                Unit unit = Unit.INSTANCE;
                r15 = r17;
            }
            x1 x1Var3 = p3.n.f135158a;
            r14 = r15;
        } else {
            o0 o0Var2 = o0VarE;
            o0Var2.e();
            r14 = o0Var2;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c62.m1(lVar, i14, 26);
        }
    }

    public static final void c(i53.c<g81.x> cVar, p3.m mVar, int i14) {
        cVar.getClass();
        o0 o0VarE = mVar.E(-766245564);
        int i15 = 4;
        int i16 = (o0VarE.r(cVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.C(894820035);
            Iterator it = p13.h0.N0(cVar, new C1242a()).iterator();
            while (it.hasNext()) {
                a((g81.x) it.next(), o0VarE, 0);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.p(cVar, i14, i15);
        }
    }
}
