package lw1;

import ak0.o;
import c2.b0;
import c2.c3;
import c2.j0;
import c2.q1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c80.s0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import cw1.o1;
import h4.r;
import h5.e0;
import i3.d0;
import i3.e5;
import i3.fe;
import i3.hb;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import kotlin.t1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.a2;
import zd0.g1;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:55:0x0168  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:89:0x0285  */
    public static final void a(ArrayList arrayList, e23.l lVar, m mVar, int i14) {
        int i15;
        boolean z14;
        o0 o0VarE = mVar.E(-1272910996);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = 2;
        int i17 = (i14 & 6) == 0 ? (o0VarE.r(arrayList) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.r(lVar) ? 32 : 16;
        }
        boolean z15 = false;
        boolean z16 = true;
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (arrayList.isEmpty()) {
                o0VarE.C(-1022793066);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1024898617);
                int i18 = ((double) ((g6.c) o0VarE.A(t1.f91490h)).getF75992b()) > 1.5d ? 1 : 2;
                o0VarE.C(798228562);
                for (List list : h0.i1(arrayList, i18, i18, true)) {
                    int size = list.size();
                    m.a aVar = m.f135153a;
                    if (size == z16) {
                        o0VarE.C(1381536830);
                        r.a aVar2 = r.S;
                        r rVarF = x2.f(aVar2, 1.0f);
                        d92.b.f58623a.getClass();
                        j92.b bVar = d92.b.f58625c;
                        bVar.getClass();
                        j92.e eVar = j92.b.f97899b;
                        r rVarA = c2.l.A(rVarF, eVar.f97920e, 0.0f, 2);
                        bVar.getClass();
                        r rVarC = c2.l.C(rVarA, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                        c2.j jVar = c2.j.f22691a;
                        bVar.getClass();
                        float f14 = eVar.f97920e;
                        jVar.getClass();
                        c2.j.i iVarI = c2.j.i(f14);
                        h4.d.f81522a.getClass();
                        s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, o0VarE, 0);
                        x1 x1Var2 = n.f135158a;
                        int iHashCode = Long.hashCode(o0VarE.U);
                        i2 i2VarA0 = o0VarE.a0();
                        r rVarC2 = h4.k.c(rVarC, o0VarE);
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
                        b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                        u2 u2Var = u2.f22900a;
                        r rVarA2 = u2Var.a(aVar2, 1.0f, true);
                        g gVar = (g) h0.b0(list);
                        boolean z17 = (i17 & 112) == 32;
                        Object objQ = o0VarE.q();
                        if (z17) {
                            objQ = new k11.n(lVar, 17);
                            o0VarE.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new k11.n(lVar, 17);
                                o0VarE.K(objQ);
                            }
                        }
                        z15 = false;
                        mw1.c.b(rVarA2, gVar, (e23.l) objQ, o0VarE, 0);
                        i15 = 2;
                        if (i18 == 2) {
                            o0VarE.C(-192852923);
                            z14 = true;
                            c2.l.f(u2Var.a(aVar2, 1.0f, true), o0VarE);
                            o0VarE.g0(false);
                        } else {
                            z14 = true;
                            o0VarE.C(-192762589);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z14);
                        o0VarE.g0(false);
                    } else if (size != i16) {
                        o0VarE.C(1382270817);
                        o0VarE.g0(z15);
                        i15 = i16;
                        z14 = z16;
                    } else {
                        o0VarE.C(1380554254);
                        r.a aVar4 = r.S;
                        r rVarO = c2.l.o(x2.f(aVar4, 1.0f), q1.Max);
                        d92.b.f58623a.getClass();
                        j92.b bVar3 = d92.b.f58625c;
                        bVar3.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        r rVarA3 = c2.l.A(rVarO, eVar2.f97920e, 0.0f, i16);
                        bVar3.getClass();
                        r rVarC3 = c2.l.C(rVarA3, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                        c2.j jVar2 = c2.j.f22691a;
                        bVar3.getClass();
                        float f15 = eVar2.f97920e;
                        jVar2.getClass();
                        c2.j.i iVarI2 = c2.j.i(f15);
                        h4.d.f81522a.getClass();
                        s2 s2VarA2 = q2.a(iVarI2, h4.d.a.f81533k, o0VarE, 0);
                        x1 x1Var3 = n.f135158a;
                        int iHashCode2 = Long.hashCode(o0VarE.U);
                        i2 i2VarA1 = o0VarE.a0();
                        r rVarC4 = h4.k.c(rVarC3, o0VarE);
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
                        b4.c(h5.g.a.f81810g, s2VarA2, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                        h5.g.a.b bVar4 = h5.g.a.f81813j;
                        if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                        }
                        b4.c(h5.g.a.f81807d, rVarC4, o0VarE);
                        u2 u2Var2 = u2.f22900a;
                        r rVarC5 = x2.c(u2Var2.a(aVar4, 1.0f, true), 1.0f);
                        g gVar2 = (g) h0.b0(list);
                        int i19 = i17 & 112;
                        boolean z18 = i19 == 32;
                        Object objQ2 = o0VarE.q();
                        if (z18) {
                            objQ2 = new k11.n(lVar, 15);
                            o0VarE.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new k11.n(lVar, 15);
                                o0VarE.K(objQ2);
                            }
                        }
                        mw1.c.b(rVarC5, gVar2, (e23.l) objQ2, o0VarE, 0);
                        r rVarC6 = x2.c(u2Var2.a(aVar4, 1.0f, true), 1.0f);
                        g gVar3 = (g) h0.m0(list);
                        boolean z19 = i19 == 32;
                        Object objQ3 = o0VarE.q();
                        if (z19) {
                            objQ3 = new k11.n(lVar, 16);
                            o0VarE.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new k11.n(lVar, 16);
                                o0VarE.K(objQ3);
                            }
                        }
                        mw1.c.b(rVarC6, gVar3, (e23.l) objQ3, o0VarE, 0);
                        o0VarE.g0(true);
                        o0VarE.g0(false);
                        z15 = false;
                        i15 = 2;
                        z14 = true;
                    }
                    i16 = i15;
                    z16 = z14;
                }
                o0VarE.g0(z15);
                r.a aVar6 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                e5.t(aVar6, j92.b.f97899b.f97920e, o0VarE, z15);
            }
            x1 x1Var4 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(arrayList, lVar, i14);
        }
    }

    public static final void b(String str, int i14, List list, boolean z14, e23.l lVar, e23.a aVar, e23.a aVar2, m mVar, int i15) {
        o0 o0Var;
        int i16;
        ArrayList arrayList;
        e23.a aVar3 = aVar2;
        o0 o0VarE = mVar.E(908131113);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i15 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i17 & 1, (i17 & 599187) != 599186)) {
            x1 x1Var = n.f135158a;
            r rVarB = a2.b(x2.d(r.S, 1.0f), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarB, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((g) obj).f115120b) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!((g) obj2).f115120b) {
                    arrayList3.add(obj2);
                }
            }
            ub1.l lVarU = g1.u((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null), s0.FIND_PLAN, new i(z14), 4);
            if (lVarU == null) {
                o0VarE.C(1107957371);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1107957372);
                r.a aVar5 = r.S;
                r rVarF = x2.f(aVar5, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA2 = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                x1 x1Var2 = n.f135158a;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC2 = h4.k.c(rVarF, o0VarE);
                h5.g.V.getClass();
                e0.a aVar6 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA2, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                b0 b0Var2 = b0.f22601a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                lVarU.a(c2.l.y(aVar5, j92.b.f97899b.f97920e), o0VarE, 0);
                o0VarE.g0(true);
                Unit unit = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            r.a aVar7 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            r rVarA = c2.l.A(aVar7, f14, 0.0f, 2);
            bVar3.getClass();
            r rVarC3 = c2.l.C(rVarA, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarE, R.string.what_kind_of_plan_to_set_up);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            if (str == null) {
                o0Var.C(1108515092);
                o0Var.g0(false);
            } else {
                o0Var.C(1108515093);
                bVar3.getClass();
                r rVarA2 = c2.l.A(aVar7, f15, 0.0f, 2);
                bVar3.getClass();
                mw1.e.a(c2.l.C(rVarA2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), str, aVar, o0Var, (i17 >> 9) & 896);
                Unit unit2 = Unit.INSTANCE;
                o0Var.g0(false);
            }
            if (arrayList3.isEmpty()) {
                arrayList = arrayList3;
                o0Var.C(1108940847);
                o0Var.g0(false);
            } else {
                o0Var.C(1108839942);
                arrayList = arrayList3;
                a(arrayList, lVar, o0Var, (i17 >> 9) & 112);
                o0Var.g0(false);
            }
            if (arrayList2.isEmpty()) {
                o0Var.C(1109556879);
                o0Var.g0(false);
            } else {
                o0Var.C(1109006226);
                if (arrayList.isEmpty()) {
                    o0Var.C(1109456687);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1109197744);
                    bVar3.getClass();
                    r rVarA3 = c2.l.A(aVar7, f15, 0.0f, 2);
                    String strQ2 = gl1.y.Q(o0Var, R.string.following_plans_require_gc_plus);
                    fVar.getClass();
                    mh.c(strQ2, rVarA3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0Var), o0Var, 0, 0, 131068);
                    o0Var = o0Var;
                    o0Var.g0(false);
                }
                a(arrayList2, lVar, o0Var, (i17 >> 9) & 112);
                o0Var.g0(false);
            }
            if (i14 > 0) {
                o0Var.C(1109661473);
                if (str == null && list.isEmpty()) {
                    o0Var.C(1109856339);
                    bVar3.getClass();
                    c2.l.f(x2.h(aVar7, f15), o0Var);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1109944751);
                    o0Var.g0(false);
                }
                bVar3.getClass();
                i16 = i14;
                aVar3 = aVar2;
                mw1.a.a(i16, (i17 & 112) | ((i17 >> 12) & 896), aVar3, c2.l.C(aVar7, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), o0Var);
                o0Var.g0(false);
            } else {
                i16 = i14;
                aVar3 = aVar2;
                o0Var.C(1110197711);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            x1 x1Var3 = n.f135158a;
        } else {
            o0Var = o0VarE;
            i16 = i14;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(str, i16, list, z14, lVar, aVar, aVar3, i15);
        }
    }

    public static final void c(fe feVar, boolean z14, String str, int i14, List list, boolean z15, e23.l lVar, e23.a aVar, e23.a aVar2, e23.a aVar3, m mVar, int i15) {
        feVar.getClass();
        list.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1294271799);
        int i16 = i15 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.r(list) ? 16384 : 8192) | (o0VarE.h(z15) ? 131072 : 65536) | (o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar) ? 8388608 : 4194304) | (o0VarE.r(aVar2) ? 67108864 : 33554432) | (o0VarE.r(aVar3) ? 536870912 : 268435456);
        if (o0VarE.n(i16 & 1, (306783379 & i16) != 306783378)) {
            x1 x1Var = n.f135158a;
            hb.f88319a.getClass();
            c3 c3VarA = hb.a(o0VarE);
            d0.f87812a.getClass();
            z02.d.a(false, z3.f.c(-1683952732, new ll1.g(aVar3, 2), o0VarE), z3.f.c(953906307, new o(feVar, 26), o0VarE), null, new j0(c3VarA, d0.a(o0VarE)), z3.f.c(277548832, new c82.c(z14, str, i14, list, z15, lVar, aVar, aVar2), o0VarE), o0VarE, 197040, 9);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o1(feVar, z14, str, i14, list, z15, lVar, aVar, aVar2, aVar3, i15);
        }
    }
}
