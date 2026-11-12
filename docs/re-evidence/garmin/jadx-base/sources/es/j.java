package es;

import c2.b0;
import c2.q;
import c2.q1;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import ds.n;
import e23.l;
import f5.g0;
import f5.z0;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import nr.l0;
import nr.p0;
import o53.f0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;
import p3.b4;
import p3.i2;
import p3.m;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;
import r22.p;
import s5.x0;
import u1.w;
import u1.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class j {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, final p0 p0Var, n nVar, boolean z14, float f14, e23.a aVar, m mVar, int i14) {
        final n nVar2;
        o0 o0Var;
        r rVar2;
        is.n nVar3;
        p0Var.getClass();
        List<l0> list = p0Var.f127285d;
        p0.a aVar2 = p0Var.f127286e;
        aVar.getClass();
        o0 o0VarE = mVar.E(1719937340);
        int i15 = i14 | 6 | (o0VarE.r(p0Var) ? 32 : 16) | (o0VarE.k(nVar == null ? -1 : nVar.ordinal()) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.i(f14) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar2 = r.S;
            } else {
                o0VarE.e();
                rVar2 = rVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            p0.a.c cVar = (p0.a.c) aVar2;
            jr.h hVar = cVar.f127293e;
            final boolean f100059a = hVar.getF100059a();
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                n4.d.f123545e.getClass();
                objQ = p3.p0.n(n4.d.f123546f);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            List<fs.e> listA = hVar.a();
            ArrayList<fs.f> arrayList = new ArrayList(y.r(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(((fs.e) it.next()).a((n4.d) p1Var.getF182175a(), false));
            }
            final long jB = (f100059a ? j92.a.a() : j92.a.b()).k().b();
            l0 l0Var = (l0) h0.e0(0, list);
            p pVar = l0Var != null ? l0Var.f127250a : null;
            l0 l0Var2 = (l0) h0.e0(1, list);
            p pVar2 = l0Var2 != null ? l0Var2.f127250a : null;
            l0 l0Var3 = (l0) h0.e0(2, list);
            p pVar3 = l0Var3 != null ? l0Var3.f127250a : null;
            final String str = cVar.f127289a;
            String str2 = cVar.f127292d;
            final p pVar4 = pVar3;
            if (str2 == null || str2.equals("Unknown")) {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            y3 y3Var = t1.f91490h;
            final p pVar5 = pVar2;
            final String str3 = str2;
            is.n nVar4 = new is.n(((g6.c) o0VarE.A(y3Var)).getF75991a() * f14, 1.0f);
            r rVarD = x2.d(rVar2, 1.0f);
            Object objQ2 = o0VarE.q();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new a11.m(p1Var, 23);
                o0VarE.K(objQ2);
            }
            r rVarF = g0.f(rVarD, (l) objQ2);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ3;
            boolean z15 = (i15 & 458752) == 131072;
            Object objQ4 = o0VarE.q();
            if (z15 || objQ4 == c2565a) {
                objQ4 = new e52.c(aVar, 11);
                o0VarE.K(objQ4);
            }
            r rVarB = w.b(rVarF, jVar, null, false, null, null, (e23.a) objQ4, 28);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            final p pVar6 = pVar;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            boolean z16 = false;
            nVar2 = nVar;
            v.a(y3Var.c(nVar4), z3.f.c(-1028876874, new e23.p() { // from class: es.i
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    h5.g.a.b bVar2;
                    m mVar2 = (m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var3 = p3.n.f135158a;
                        r.a aVar4 = r.S;
                        r rVarD2 = x2.d(aVar4, 1.0f);
                        n nVar5 = n.f61012i;
                        n nVar6 = nVar2;
                        float f15 = nVar6 == nVar5 ? 88 : 0;
                        g6.f.a aVar5 = g6.f.f75994b;
                        float f16 = f15;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        r rVarC2 = c2.l.C(rVarD2, eVar.f97920e, 0.0f, 0.0f, f16, 6);
                        c2.j.f22691a.getClass();
                        c2.j.g gVar = c2.j.f22698h;
                        h4.d.f81522a.getClass();
                        z zVarA = c2.y.a(gVar, h4.d.a.f81536n, mVar2, 6);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        r rVarC3 = h4.k.c(rVarC2, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar6 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar2 = h5.g.a.f81810g;
                        b4.c(eVar2, zVarA, mVar2);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX, mVar2);
                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                        }
                        h5.g.a.f fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC3, mVar2);
                        b0 b0Var = b0.f22601a;
                        r rVarF2 = x2.f(aVar4, 1.0f);
                        s2 s2VarA = q2.a(gVar, h4.d.a.f81533k, mVar2, 6);
                        int iHashCode3 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        r rVarC4 = h4.k.c(rVarF2, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, s2VarA, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar2, iHashCode3, bVar3);
                        }
                        b4.c(fVar, rVarC4, mVar2);
                        u2 u2Var = u2.f22900a;
                        p0 p0Var2 = p0Var;
                        String str4 = p0Var2.f127282a;
                        Integer num = p0Var2.f127284c;
                        long jB2 = f0.B(15);
                        r rVarC5 = c2.l.C(u2Var.a(aVar4, 1.0f, true), 0.0f, nVar6 == nVar5 ? 64 : eVar.f97920e, eVar.f97920e, 0.0f, 9);
                        float f17 = eVar.f97917b;
                        g6.q qVarA = g6.q.a(jB2);
                        String str5 = str3;
                        long j8 = jB;
                        ds.s.a(rVarC5, str4, str5, num, j8, qVarA, f17, mVar2, 196608, 0);
                        y0.a(n5.c.a(f100059a ? R.drawable.garmin_logo_tag_vertical_white : R.drawable.garmin_logo_tag_vertical, mVar2, 0), null, c2.l.C(aVar4, 0.0f, nVar6 == nVar5 ? 64 : eVar.f97922g, 0.0f, 0.0f, 13), null, null, 0.0f, null, mVar2, 48, 120);
                        mVar2.y();
                        r rVarO = c2.l.o(x2.f(aVar4, 1.0f), q1.Min);
                        s2 s2VarA2 = q2.a(c2.j.f22693c, h4.d.a.f81535m, mVar2, 54);
                        int iHashCode4 = Long.hashCode(mVar2.getU());
                        i2 i2VarX3 = mVar2.x();
                        r rVarC6 = h4.k.c(rVarO, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, s2VarA2, mVar2);
                        b4.c(c1623g, i2VarX3, mVar2);
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                            bVar2 = bVar3;
                            v.h.z(iHashCode4, mVar2, iHashCode4, bVar2);
                        } else {
                            bVar2 = bVar3;
                        }
                        b4.c(fVar, rVarC6, mVar2);
                        r rVarC7 = c2.l.C(aVar4, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11);
                        z zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81538p, mVar2, 48);
                        int iHashCode5 = Long.hashCode(mVar2.getU());
                        i2 i2VarX4 = mVar2.x();
                        r rVarC8 = h4.k.c(rVarC7, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, zVarA2, mVar2);
                        b4.c(c1623g, i2VarX4, mVar2);
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode5))) {
                            v.h.z(iHashCode5, mVar2, iHashCode5, bVar2);
                        }
                        b4.c(fVar, rVarC8, mVar2);
                        p pVar7 = pVar6;
                        String strH = pVar7 != null ? pVar7.f149774a : null;
                        if (strH == null) {
                            strH = sn.a.h(mVar2, 2021911029, R.string.no_value, mVar2);
                        } else {
                            mVar2.C(2021910409);
                            mVar2.f();
                        }
                        ds.b0.a(null, strH, j8, pVar7 != null ? pVar7.f149776c : null, pVar7 != null ? pVar7.f149775b : null, 22, false, true, mVar2, 12779520, 65);
                        p pVar8 = pVar5;
                        String strH2 = pVar8 != null ? pVar8.f149774a : null;
                        if (strH2 == null) {
                            strH2 = sn.a.h(mVar2, 2021924245, R.string.no_value, mVar2);
                        } else {
                            mVar2.C(2021923594);
                            mVar2.f();
                        }
                        ds.b0.a(c2.l.C(aVar4, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), strH2, j8, pVar8 != null ? pVar8.f149776c : null, pVar8 != null ? pVar8.f149775b : null, 22, false, true, mVar2, 12779520, 64);
                        p pVar9 = pVar4;
                        String strH3 = pVar9 != null ? pVar9.f149774a : null;
                        if (strH3 == null) {
                            strH3 = sn.a.h(mVar2, 2021940341, R.string.no_value, mVar2);
                        } else {
                            mVar2.C(2021939721);
                            mVar2.f();
                        }
                        ds.b0.a(c2.l.C(aVar4, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), strH3, j8, pVar9 != null ? pVar9.f149776c : null, pVar9 != null ? pVar9.f149775b : null, 22, false, true, mVar2, 12779520, 64);
                        String str6 = p0Var2.f127283b;
                        String str7 = str;
                        String strConcat = str6.concat(str7 != null ? " @ ".concat(str7) : "");
                        ds.w.f61056a.getClass();
                        mh.c(strConcat, c2.l.C(aVar4, 0.0f, eVar.f97918c, 0.0f, eVar.f97920e, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(ds.w.f61059d, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar2, 0, 0, 131068);
                        mVar2.y();
                        mVar2.y();
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 56);
            if (arrayList.isEmpty() || z14) {
                o0Var = o0VarE;
                nVar3 = nVar4;
                o0Var.C(-1752508052);
                o0Var.g0(false);
            } else {
                o0VarE.C(-1752826143);
                for (fs.f fVar : arrayList) {
                    o0VarE.N(1872739659, fVar.f73386a);
                    Object objQ5 = o0VarE.q();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new e51.c(20);
                        o0VarE.K(objQ5);
                    }
                    boolean z17 = z16;
                    o0 o0Var2 = o0VarE;
                    fs.d.a(fVar, false, (e23.a) objQ5, null, null, null, o0Var2, 432, 56);
                    o0Var2.g0(z17);
                    z16 = z17;
                    nVar4 = nVar4;
                    o0VarE = o0Var2;
                }
                o0Var = o0VarE;
                nVar3 = nVar4;
                o0Var.g0(z16);
            }
            v.a(t1.f91490h.c(nVar3), z3.f.c(1221391327, new b(f100059a, uVar, nVar2, 4), o0Var), o0Var, 56);
            o0Var.g0(true);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            nVar2 = nVar;
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(rVar2, p0Var, nVar2, z14, f14, aVar, i14, 4);
        }
    }
}
