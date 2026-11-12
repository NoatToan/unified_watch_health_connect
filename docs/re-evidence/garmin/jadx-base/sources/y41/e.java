package y41;

import a2.j;
import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import ds.e0;
import e23.l;
import g6.o;
import h4.r;
import i3.mh;
import java.util.ArrayList;
import kg.f;
import kotlin.t1;
import l4.k;
import m92.h0;
import n92.g;
import n92.i;
import o13.p;
import o4.d0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p008y1.y0;
import p13.u;
import p13.y;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import p5.v;
import s5.s0;
import s5.x0;
import u1.w;
import v.h;
import w5.q;
import w52.k0;
import xn.t;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    /* JADX WARN: Code duplicated, block: B:64:0x0134  */
    /* JADX WARN: Code duplicated, block: B:73:0x0159  */
    public static final void a(o51.b bVar, r rVar, e23.a<Unit> aVar, m mVar, int i14, int i15) {
        e23.a<Unit> aVar2;
        int i16;
        e23.a<Unit> aVar3;
        e23.a<Unit> aVar4;
        l lVar;
        bVar.getClass();
        o0 o0VarE = mVar.E(-1647301144);
        int i17 = i14 | (o0VarE.B(bVar) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16);
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 = i17 | 384;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i16 = i17 | (o0VarE.r(aVar2) ? 256 : 128);
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            m.a aVar5 = m.f135153a;
            if (i18 != 0) {
                Object objQ = o0VarE.q();
                aVar5.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new xh0.d(26);
                    o0VarE.K(objQ);
                }
                aVar4 = (e23.a) objQ;
            } else {
                aVar4 = aVar2;
            }
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            long jF = d92.b.a(o0VarE).e().f();
            i53.c<h0.e.a> cVar = bVar.f129210c;
            boolean z14 = cVar == null || cVar.isEmpty();
            o0VarE.C(1786542308);
            i53.c<p<Float, Integer>> cVar2 = bVar.f129209b;
            ArrayList arrayList = new ArrayList(y.r(cVar2, 10));
            for (p<Float, Integer> pVar : cVar2) {
                arrayList.add(new p(pVar.f128594a, d0.a(n5.a.a(o0VarE, pVar.f128595b.intValue()))));
            }
            o0VarE.g0(false);
            long jD = e0.d(d92.b.f58623a, o0VarE);
            if (z14) {
                o0VarE.C(-451080058);
                o0VarE.g0(false);
                lVar = null;
            } else {
                o0VarE.C(-451592116);
                boolean zL = ((i16 & 14) == 4) | o0VarE.l(jF);
                Object objQ2 = o0VarE.q();
                if (zL) {
                    objQ2 = new d(bVar, jF);
                    o0VarE.K(objQ2);
                } else {
                    aVar5.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new d(bVar, jF);
                        o0VarE.K(objQ2);
                    }
                }
                lVar = (l) objQ2;
                o0VarE.g0(false);
            }
            l lVar2 = lVar;
            int i19 = i16 & 14;
            boolean zR = o0VarE.r(arrayList) | (i19 == 4);
            Object objQ3 = o0VarE.q();
            if (zR) {
                objQ3 = new x9.b(16, arrayList, bVar);
                o0VarE.K(objQ3);
            } else {
                aVar5.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new x9.b(16, arrayList, bVar);
                    o0VarE.K(objQ3);
                }
            }
            l lVar3 = (l) objQ3;
            boolean zL2 = (i19 == 4) | o0VarE.l(jD);
            Object objQ4 = o0VarE.q();
            if (zL2) {
                objQ4 = new d(jD, bVar);
                o0VarE.K(objQ4);
            } else {
                aVar5.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new d(jD, bVar);
                    o0VarE.K(objQ4);
                }
            }
            l lVar4 = (l) objQ4;
            Object objQ5 = o0VarE.q();
            aVar5.getClass();
            if (objQ5 == m.a.f135155b) {
                objQ5 = f.b(o0VarE);
            }
            r rVarB = w.b(rVar, (j) objQ5, null, false, null, null, aVar4, 28);
            i53.c cVarE = i53.a.e(u.C(new l[]{lVar2, lVar3, lVar4}));
            a.f194468a.getClass();
            z3.e eVar = a.f194469b;
            y3 y3Var = t1.f91493k;
            q.b bVar2 = (q.b) o0VarE.A(y3Var);
            y3 y3Var2 = t1.f91490h;
            g6.d dVar = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f);
            y3 y3Var3 = t1.f91496n;
            s0 s0Var = new s0(bVar2, dVar, (o) o0VarE.A(y3Var3), 0, 8, null);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97935l;
            x0 x0VarB = d92.c.b(x0Var, o0VarE);
            d0.f128823b.getClass();
            g gVar = new g(d0.f128831j, s0Var, x0VarB, null, 8, null);
            n92.j jVar = new n92.j(new d02.g(), Float.valueOf(bVar.f129214g), Float.valueOf(bVar.f129213f), 0, 8, null);
            n92.j jVar2 = new n92.j(new d02.b(), bVar.f129217j, bVar.f129216i, 0, 8, null);
            i53.c<String> cVar3 = bVar.f129211d;
            s0 s0Var2 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
            fVar.getClass();
            m92.r.a(rVarB, cVarE, eVar, null, false, "", 0.0f, 0.0f, new n92.a(jVar, jVar2, gVar, new i(cVar3, false, false, s0Var2, d92.c.f(x0Var, o0VarE), null, 0.0f, 0.0f, 230, null)), z3.f.c(-1775685757, new b51.b(bVar, 2, (byte) 0), o0VarE), z3.f.c(1136856759, new t(bVar, 5), o0VarE), o0VarE, 805503360, 6, 216);
            x1 x1Var2 = n.f135158a;
            aVar3 = aVar4;
        } else {
            o0VarE.e();
            aVar3 = aVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(i14, i15, bVar, rVar, aVar3, 11);
        }
    }

    public static final void b(o51.a aVar, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1645384949);
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarE = u1.n.e(k.b(aVar2, k2.i.a(eVar.f97918c)), d92.b.a(o0VarE).c().g(), m1.f128891a);
            bVar.getClass();
            r rVarY = c2.l.y(rVarE, eVar.f97918c);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String str = aVar.f129205b;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131070);
            o0 o0Var2 = o0VarE;
            bVar.getClass();
            c2.l.f(x2.q(aVar2, eVar.f97917b), o0Var2);
            String str2 = aVar.f129207d;
            if (str2 == null) {
                o0Var2.C(1572160139);
                o0Var2.g0(false);
            } else {
                o0Var2.C(1572160140);
                fVar.getClass();
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0Var2), o0Var2, 0, 0, 131070);
                o0Var2 = o0Var2;
                o0Var2.g0(false);
            }
            String str3 = aVar.f129206c;
            fVar.getClass();
            o0 o0Var3 = o0Var2;
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0Var2), o0Var3, 0, 0, 131070);
            o0Var = o0Var3;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vy0.e(aVar, i14, 27);
        }
    }

    public static final void c(int i14, r rVar, m mVar, boolean z14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(14840508);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(rVar, 1.0f);
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97919d;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strP = gl1.y.P(R.string.chart_distance_title, new Object[]{gl1.y.Q(o0VarE, z14 ? R.string.lbl_km : R.string.lbl_mile)}, o0VarE);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new y0(18);
                o0VarE.K(objQ);
            }
            String strB = oi0.c.B(strP, (l) objQ, o0VarE);
            r.a aVar2 = r.S;
            h4.g.a aVar3 = h4.d.a.f81537o;
            r rVarB = b0Var.b(aVar2, aVar3);
            boolean zB = o0VarE.B(strB);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new y01.k(strB, 3);
                o0VarE.K(objQ2);
            }
            r rVarC2 = v.c((l) objQ2, rVarB, false);
            d92.b.f58624b.getClass();
            mh.c(strP, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            z41.d.a(b0Var.b(aVar2, aVar3), o0Var, 0);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f10.c(z14, rVar, i14);
        }
    }
}
