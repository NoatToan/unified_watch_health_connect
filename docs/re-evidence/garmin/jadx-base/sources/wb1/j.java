package wb1;

import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c80.s0;
import c80.y0;
import h4.r;
import h5.e0;
import i3.e5;
import i3.i7;
import i3.mh;
import i3.ve;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import o4.d0;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s;
import p13.t0;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import ta0.g0;
import u1.a2;
import u1.w;
import v62.h1;
import v62.k1;
import w51.j0;
import zd0.q0;

/* JADX INFO: loaded from: classes9.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:80:0x02ae  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, Map map, List list, Map map2, e23.l lVar, e23.l lVar2, p3.m mVar, int i14) {
        r rVar2;
        o0 o0Var;
        Object obj;
        char c14;
        boolean z14;
        o0 o0Var2;
        Object obj2;
        String str;
        char c15;
        Object obj3;
        boolean z15;
        o0 o0Var3;
        o0 o0VarE = mVar.E(864869846);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | 6 | (o0VarE.r(map) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.r(map2) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            r.a aVar = r.S;
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                obj = objQ;
                c2 c2VarN = p0.n(Boolean.FALSE);
                o0VarE.K(c2VarN);
                obj = c2VarN;
            }
            obj = objQ;
            p1 p1Var = (p1) obj;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (list.isEmpty()) {
                c14 = 2;
                z14 = true;
                o0VarE.C(73935766);
                o0VarE.g0(false);
                o0Var2 = o0VarE;
            } else {
                o0VarE.C(72688388);
                r rVarE = u1.n.e(aVar, d92.b.a(o0VarE).c().e(), m1.f128891a);
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    obj3 = objQ2;
                    j0 j0Var = new j0(p1Var, 11);
                    o0VarE.K(j0Var);
                    obj3 = j0Var;
                }
                obj3 = objQ2;
                c(48, w.d(rVarE, false, null, null, (e23.a) obj3, 15), "Rejected Promos", o0VarE, ((Boolean) p1Var.getF182175a()).booleanValue());
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    c14 = 2;
                    z15 = false;
                    z14 = true;
                    o0VarE.C(73925846);
                    o0VarE.g0(false);
                    o0Var3 = o0VarE;
                } else {
                    o0VarE.C(73084010);
                    bVar.getClass();
                    r rVarA = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
                    d92.b.f58624b.getClass();
                    c14 = 2;
                    mh.c("Tap a rejected promo for more details.", rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, 6, 0, 131068);
                    o0 o0Var4 = o0VarE;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        y0 y0Var = (y0) it.next();
                        r.a aVar3 = r.S;
                        d92.b.f58623a.getClass();
                        j92.b bVar3 = d92.b.f58625c;
                        bVar3.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        r rVarA2 = c2.l.A(aVar3, eVar2.f97920e, 0.0f, 2);
                        c2.j jVar2 = c2.j.f22691a;
                        bVar3.getClass();
                        float f15 = eVar2.f97918c;
                        jVar2.getClass();
                        c2.j.i iVarI2 = c2.j.i(f15);
                        h4.d.f81522a.getClass();
                        z zVarA2 = y.a(iVarI2, h4.d.a.f81536n, o0Var4, 0);
                        x1 x1Var2 = p3.n.f135158a;
                        int iHashCode2 = Long.hashCode(o0Var4.U);
                        i2 i2VarA1 = o0Var4.a0();
                        r rVarC2 = h4.k.c(rVarA2, o0Var4);
                        h5.g.V.getClass();
                        e0.a aVar4 = h5.g.a.f81805b;
                        if (cVar == null) {
                            p0.l();
                            throw null;
                        }
                        o0Var4.z();
                        if (o0Var4.T) {
                            o0Var4.M(aVar4);
                        } else {
                            o0Var4.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA2, o0Var4);
                        b4.c(h5.g.a.f81809f, i2VarA1, o0Var4);
                        h5.g.a.b bVar4 = h5.g.a.f81813j;
                        if (o0Var4.T || !s.g(o0Var4.q(), Integer.valueOf(iHashCode2))) {
                            v.h.A(iHashCode2, o0Var4, iHashCode2, bVar4);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, o0Var4);
                        b0 b0Var2 = b0.f22601a;
                        boolean zR = o0Var4.r(y0Var) | ((i15 & 458752) == 131072);
                        Object objQ3 = o0Var4.q();
                        if (zR || objQ3 == p3.m.a.f135155b) {
                            objQ3 = new vv0.n(20, lVar2, y0Var);
                            o0Var4.K(objQ3);
                        }
                        k.a(null, y0Var, (e23.a) objQ3, o0Var4, 64, 1);
                        o0Var4.g0(true);
                    }
                    z15 = false;
                    z14 = true;
                    o0Var4.g0(false);
                    o0Var3 = o0Var4;
                }
                o0Var3.g0(z15);
                o0Var2 = o0Var3;
            }
            o0Var2.C(-690349371);
            w13.c cVar2 = s0.E;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
            while (bVarN.hasNext()) {
                s0 s0Var = (s0) bVarN.next();
                if (s0Var != s0.HIDDEN) {
                    List list2 = (List) map.get(s0Var);
                    if (list2 == null) {
                        list2 = p13.j0.f134944a;
                    }
                    if (list2.isEmpty()) {
                        c15 = c14;
                    } else {
                        Object obj4 = map2.get(s0Var);
                        obj4.getClass();
                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                        r.a aVar5 = r.S;
                        r rVarE2 = u1.n.e(aVar5, am.j.c(d92.b.f58623a, o0Var2), m1.f128891a);
                        boolean zK = o0Var2.k(s0Var.ordinal());
                        Object objQ4 = o0Var2.q();
                        if (zK || objQ4 == p3.m.a.f135155b) {
                            vv0.n nVar = new vv0.n(21, lVar, s0Var);
                            o0Var2.K(nVar);
                            obj2 = nVar;
                        } else {
                            obj2 = objQ4;
                        }
                        r rVarD = w.d(rVarE2, false, null, null, (e23.a) obj2, 15);
                        switch (s0.b.f25585a[s0Var.ordinal()]) {
                            case 1:
                                str = "Home";
                                break;
                            case 2:
                                str = "Challenges Leaderboard";
                                break;
                            case 3:
                                str = "Find a Workout";
                                break;
                            case 4:
                                str = "Activity Reports";
                                break;
                            case 5:
                                str = "Activity Details";
                                break;
                            case 6:
                                str = "Trail Details";
                                break;
                            case 7:
                                str = "";
                                break;
                            case 8:
                                str = "Profile Frame List";
                                break;
                            case 9:
                                str = "Garmin Coach Plan";
                                break;
                            case 10:
                                str = "Live Track Main";
                                break;
                            case 11:
                                str = "What's New";
                                break;
                            case 12:
                                str = "Profile";
                                break;
                            case 13:
                                str = "Sleep";
                                break;
                            case 14:
                                str = "Hydration";
                                break;
                            case 15:
                                str = "Weight";
                                break;
                            case 16:
                                str = "Calories Burned";
                                break;
                            case 17:
                                str = "Nutrition";
                                break;
                            case 18:
                                str = "MCT Genesis";
                                break;
                            case 19:
                                str = "MCT Report";
                                break;
                            case 20:
                                str = "News Feed";
                                break;
                            case 21:
                                str = "Find Plan";
                                break;
                            case 22:
                                str = "Home Maintenance";
                                break;
                            case 23:
                                str = "Training Status";
                                break;
                            case 24:
                                str = "Training Readiness";
                                break;
                            case 25:
                                str = "VO2 Max";
                                break;
                            default:
                                u0.r();
                                return;
                        }
                        c(0, rVarD, str, o0Var2, zBooleanValue);
                        if (zBooleanValue) {
                            c15 = 2;
                            o0Var2.C(1411165993);
                            o0Var2.g0(false);
                        } else {
                            o0Var2.C(1410676844);
                            j92.b bVar5 = d92.b.f58625c;
                            bVar5.getClass();
                            j92.e eVar3 = j92.b.f97899b;
                            char c16 = 2;
                            r rVarA3 = c2.l.A(aVar5, eVar3.f97920e, 0.0f, 2);
                            bVar5.getClass();
                            r rVarA4 = c2.l.A(rVarA3, 0.0f, eVar3.f97919d, z14 ? 1 : 0);
                            c2.j jVar3 = c2.j.f22691a;
                            bVar5.getClass();
                            float f16 = eVar3.f97918c;
                            jVar3.getClass();
                            c2.j.i iVarI3 = c2.j.i(f16);
                            h4.d.f81522a.getClass();
                            z zVarA3 = y.a(iVarI3, h4.d.a.f81536n, o0Var2, 0);
                            x1 x1Var3 = p3.n.f135158a;
                            int iHashCode3 = Long.hashCode(o0Var2.U);
                            i2 i2VarA2 = o0Var2.a0();
                            r rVarC3 = h4.k.c(rVarA4, o0Var2);
                            h5.g.V.getClass();
                            e0.a aVar6 = h5.g.a.f81805b;
                            if (cVar == null) {
                                p0.l();
                                throw null;
                            }
                            o0Var2.z();
                            if (o0Var2.T) {
                                o0Var2.M(aVar6);
                            } else {
                                o0Var2.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA3, o0Var2);
                            b4.c(h5.g.a.f81809f, i2VarA2, o0Var2);
                            h5.g.a.b bVar6 = h5.g.a.f81813j;
                            if (o0Var2.T || !s.g(o0Var2.q(), Integer.valueOf(iHashCode3))) {
                                v.h.A(iHashCode3, o0Var2, iHashCode3, bVar6);
                            }
                            b4.c(h5.g.a.f81807d, rVarC3, o0Var2);
                            b0 b0Var3 = b0.f22601a;
                            o0Var2.C(-1129211459);
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                k.a(null, (y0) it3.next(), null, o0Var2, 64, 5);
                                c16 = c16;
                            }
                            c15 = c16;
                            z14 = true;
                            e5.u(o0Var2, false, true, false);
                        }
                    }
                } else {
                    c15 = c14;
                }
                c14 = c15;
            }
            o0Var2.g0(false);
            o0Var2.g0(z14);
            x1 x1Var4 = p3.n.f135158a;
            rVar2 = aVar;
            o0Var = o0Var2;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0((Object) rVar2, (Object) map, (Object) list, (Object) map2, lVar, lVar2, i14, 11);
        }
    }

    public static final void b(r rVar, lc.y yVar, p3.m mVar, int i14) {
        o0 o0Var;
        r rVar2;
        yVar.getClass();
        o0 o0VarE = mVar.E(-1525789003);
        int i15 = i14 | 6 | (o0VarE.r(yVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            r.a aVar = r.S;
            x1 x1Var = p3.n.f135158a;
            q0 q0Var = (q0) KoinJavaComponent.get$default(q0.class, null, null, 6, null);
            Map<s0, List<y0>> mapM = q0Var.m();
            List<y0> listO = q0Var.o();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                w13.c cVar = s0.E;
                ArrayList arrayListK = n23.j.k(cVar);
                p13.c.b bVar = new p13.c.b();
                while (bVar.hasNext()) {
                    Object next = bVar.next();
                    if (((s0) next) != s0.HIDDEN) {
                        arrayListK.add(next);
                    }
                }
                int iA = t0.a(p13.y.r(arrayListK, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
                for (Object obj : arrayListK) {
                    List<y0> list = mapM.get((s0) obj);
                    if (list == null) {
                        list = p13.j0.f134944a;
                    }
                    linkedHashMap.put(obj, Boolean.valueOf(list.isEmpty()));
                }
                objQ = p0.n(linkedHashMap);
                o0VarE.K(objQ);
            }
            r rVarB = a2.b(u1.n.e(aVar, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a), a2.a(o0VarE), true);
            d92.b.f58625c.getClass();
            r rVarC = c2.l.C(rVarB, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            d0.f128823b.getClass();
            long j8 = d0.f128831j;
            z3.e eVarC = z3.f.c(-1354628422, new w21.d((Object) mapM, (Object) listO, (Object) yVar, (p1) objQ, 5), o0VarE);
            o0Var = o0VarE;
            rVar2 = aVar;
            ve.a(rVarC, null, j8, 0L, 0.0f, 0.0f, null, eVarC, o0Var, 12583296, 122);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(rVar2, yVar, i14, 0);
        }
    }

    public static final void c(int i14, r rVar, String str, p3.m mVar, boolean z14) {
        String str2;
        u4.d dVarA;
        o0 o0VarE = mVar.E(-1516528115);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        if ((i14 & 48) == 0) {
            str2 = str;
            i15 |= o0VarE.B(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        int i16 = i15 | (o0VarE.h(z14) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            r rVarF = x2.f(rVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            r rVarZ = c2.l.z(rVarF, f14, eVar.f97917b);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f15 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f15);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarZ, o0VarE);
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
            if (z14) {
                s62.a.f157643a.getClass();
                dVarA = h1.a(t62.b.f162798a);
            } else {
                s62.a.f157643a.getClass();
                dVarA = k1.a(t62.b.f162798a);
            }
            r.a aVar2 = r.S;
            bVar.getClass();
            i7.b(dVarA, null, x2.q(aVar2, j92.b.f97901d.f97903b), am.j.d(o0VarE), o0VarE, 48, 0);
            d92.b.f58624b.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, (i16 >> 3) & 14, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(rVar, str, z14, i14, 28);
        }
    }
}
