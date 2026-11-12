package d81;

import c2.t0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import f72.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class s {
    public static final void a(g81.p pVar, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        o0 o0VarE = mVar.E(-757587030);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if ((pVar != null ? pVar.f76389a : null) != null) {
                o0VarE.C(-843075112);
                a81.c.a aVar3 = a81.c.f1953c;
                Integer num = pVar.f76391c;
                aVar3.getClass();
                if (num == null || num.intValue() >= a81.c.EARLY_ONBOARDING_FIRST_OUTPUT.f1956a) {
                    o0VarE.C(-842549755);
                    h4.r rVarF = x2.f(aVar, 1.0f);
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(o0VarE.U);
                    i2 i2VarA1 = o0VarE.a0();
                    h4.r rVarC2 = h4.k.c(rVarF, o0VarE);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarQ = x2.q(aVar, 225);
                    d92.b.f58623a.getClass();
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    b(uVar.c(c2.l.A(rVarQ, 0.0f, eVar2.f97920e, 1), h4.d.a.f81528f), pVar.f76396h, o0VarE, 0);
                    o0VarE.g0(true);
                    h4.r rVarB = b0Var.b(x2.d(aVar, 0.75f), h4.d.a.f81537o);
                    bVar2.getClass();
                    c(c2.l.C(rVarB, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7), pVar, o0VarE, (i16 << 3) & 112);
                    List<g81.l> list = pVar.f76392d;
                    if (list == null) {
                        o0VarE.C(-841771780);
                        z14 = false;
                        o0VarE.g0(false);
                    } else {
                        z14 = false;
                        o0VarE.C(-841771779);
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            a.b((g81.l) it.next(), o0VarE, 0);
                        }
                        o0VarE.g0(false);
                        Unit unit = Unit.INSTANCE;
                    }
                    o0VarE.g0(z14);
                } else {
                    o0VarE.C(-842998387);
                    h4.r rVarF2 = x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC3 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                    s62.a.f157643a.getClass();
                    b82.n.c(n0.a(t62.c.f162799a), gl1.y.Q(o0VarE, R.string.msg_not_enough_data), gl1.y.Q(o0VarE, R.string.lbl_endurance_score_feedback_early_onboarding), rVarC3, null, o0VarE, 0, 16);
                    o0VarE.g0(false);
                    Unit unit2 = Unit.INSTANCE;
                    z14 = false;
                }
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-841638789);
                h4.r rVarF3 = x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC4 = c2.l.C(rVarF3, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                s62.a.f157643a.getClass();
                b82.n.c(n0.a(t62.c.f162799a), gl1.y.Q(o0VarE, R.string.common_no_data), gl1.y.Q(o0VarE, R.string.msg_top_contributors_empty_state), rVarC4, null, o0VarE, 0, 16);
                o0VarE.g0(false);
            }
            i15 = 1;
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            i15 = 1;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(pVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0067 A[SYNTHETIC] */
    public static final void b(h4.r rVar, g81.m mVar, p3.m mVar2, int i14) {
        h4.r rVar2;
        Collection collectionN0;
        Iterator it;
        Object next;
        g81.m.b bVar;
        o0 o0VarE = mVar2.E(1210941909);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(mVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            boolean zB = o0VarE.B(mVar);
            Object objQ = o0VarE.q();
            if (zB) {
                collectionN0 = p13.h0.N0(mVar.f76368c, new g81.n());
                it = collectionN0.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((g81.m.b) next).f76372d);
                bVar = (g81.m.b) next;
                if (bVar != null) {
                    collectionN0 = p13.h0.D0(p13.h0.y0(collectionN0, bVar), bVar);
                }
                objQ = collectionN0;
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    collectionN0 = p13.h0.N0(mVar.f76368c, new g81.n());
                    it = collectionN0.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((g81.m.b) next).f76372d);
                    bVar = (g81.m.b) next;
                    if (bVar != null) {
                        collectionN0 = p13.h0.D0(p13.h0.y0(collectionN0, bVar), bVar);
                    }
                    objQ = collectionN0;
                    o0VarE.K(objQ);
                }
            }
            List<g81.m.b> list = (List) objQ;
            o0VarE.C(-220955626);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            for (g81.m.b bVar2 : list) {
                arrayList.add(new z72.l(bVar2.f76370b, n5.a.a(o0VarE, bVar2.f76371c), null));
            }
            o0VarE.g0(false);
            g6.f.a aVar = g6.f.f75994b;
            rVar2 = rVar;
            z72.k.c(rVar2, i53.a.j(arrayList), null, null, 8, 2.0f, z3.f.c(-1150173129, new a71.n(mVar, 20), o0VarE), o0VarE, (i15 & 14) | 14352384, 28);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(rVar2, mVar, i14, 1);
        }
    }

    public static final void c(h4.r rVar, g81.p pVar, p3.m mVar, int i14) {
        int i15;
        h4.r rVar2;
        o0 o0VarE = mVar.E(-1865424105);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97919d;
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            jVar.getClass();
            c2.j.i iVarJ = c2.j.j(f14, aVar);
            bVar.getClass();
            rVar2 = rVar;
            t0.a(rVar2, iVarJ, c2.j.i(eVar.f97918c), null, 0, 0, z3.f.c(591022994, new a71.n(pVar, 21), o0VarE), o0VarE, (i15 & 14) | 1572864, 56);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(rVar2, pVar, i14, 19);
        }
    }
}
