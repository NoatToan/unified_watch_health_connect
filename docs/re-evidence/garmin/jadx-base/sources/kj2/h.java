package kj2;

import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import f5.g0;
import f5.z0;
import h4.r;
import h5.e0;
import i3.mh;
import i3.v2;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.t1;
import o13.p;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.q;
import u1.u;
import u1.w;
import u1.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:100:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:103:0x0358  */
    /* JADX WARN: Code duplicated, block: B:105:0x035f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0363  */
    /* JADX WARN: Code duplicated, block: B:111:0x037e  */
    /* JADX WARN: Code duplicated, block: B:116:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:119:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:122:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:125:0x0476  */
    /* JADX WARN: Code duplicated, block: B:127:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:129:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:130:0x04be  */
    /* JADX WARN: Code duplicated, block: B:135:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:138:0x050d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0519  */
    /* JADX WARN: Code duplicated, block: B:143:0x052d  */
    /* JADX WARN: Code duplicated, block: B:144:0x054b  */
    /* JADX WARN: Code duplicated, block: B:146:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:148:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:150:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:90:0x0233  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:96:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:99:0x02e8  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, List list, String str, p pVar, nj2.a.b bVar, l lVar, m mVar, int i14) {
        o0 o0Var;
        nj2.a.b bVar2;
        String str2;
        Object obj;
        h5.g.a.f fVar;
        String strQ;
        r.a aVar;
        Object obj2;
        Object objQ;
        Object objQ2;
        long jB;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        Object objQ3;
        boolean z14;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        boolean z15;
        int i15;
        int i16;
        String strJ;
        Number number;
        String strQ2;
        Object next;
        String upperCase;
        String upperCase2;
        rVar.getClass();
        list.getClass();
        bVar.getClass();
        int i17 = bVar.f126290c;
        o0 o0VarE = mVar.E(2125556175);
        p3.c<?> cVar = o0VarE.f135177b;
        int i18 = i14 | (o0VarE.r(list) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(pVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i18 & 1, (74899 & i18) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            Object objQ4 = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ4 == c2565a) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var = (p1) objQ4;
            Object obj3 = pVar.f128594a;
            B b14 = pVar.f128595b;
            boolean zH = o0VarE.h(!((Boolean) obj3).booleanValue());
            Object objQ5 = o0VarE.q();
            if (zH || objQ5 == c2565a) {
                objQ5 = hb.a.n(!((Boolean) obj3).booleanValue(), o0VarE);
            }
            p1 p1Var2 = (p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                n4.g.f123559b.getClass();
                objQ6 = p0.n(n4.g.a(0L));
                o0VarE.K(objQ6);
            }
            p1 p1Var3 = (p1) objQ6;
            if (str != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String str3 = (String) ((p) next).f128594a;
                    if (str3 != null) {
                        upperCase = str3.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    } else {
                        upperCase = null;
                    }
                    upperCase2 = str.toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                } while (!s.g(upperCase, upperCase2));
                p pVar2 = (p) next;
                str2 = pVar2 != null ? (String) pVar2.f128595b : null;
            } else {
                str2 = "---";
            }
            Object objQ7 = o0VarE.q();
            m.a.C2565a c2565a2 = m.a.f135155b;
            if (objQ7 == c2565a2) {
                objQ7 = p0.n(!list.isEmpty() ? (String) ((p) list.get(0)).f128595b : "---");
                o0VarE.K(objQ7);
            }
            p1 p1Var4 = (p1) objQ7;
            if (str2 == null || str2.length() == 0) {
                p1Var4.setValue(!list.isEmpty() ? (String) ((p) list.get(0)).f128595b : "---");
            }
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            float f16 = eVar.f97917b;
            bVar3.getClass();
            float f17 = eVar.f97920e;
            bVar3.getClass();
            r rVarC3 = c2.l.C(rVar, f14, eVar.f97920e, f17, 0.0f, 8);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC4 = h4.k.c(rVarC3, o0VarE);
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
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarE.T) {
                obj = obj3;
            } else {
                obj = obj3;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC4, o0VarE);
                b0 b0Var = b0.f22601a;
                o0VarE.C(-598961760);
                strQ = gl1.y.Q(o0VarE, i17);
                aVar = r.S;
                r rVarF = x2.f(aVar, 1.0f);
                bVar3.getClass();
                r rVarC5 = c2.l.C(rVarF, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                if (bVar.f126288a) {
                    strQ = tn.k.g(strQ, " *");
                }
                j92.f.f97924a.getClass();
                obj2 = obj;
                mh.c(strQ, rVarC5, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 0, 0, 131064);
                Unit unit = Unit.INSTANCE;
                o0VarE.g0(false);
                objQ = o0VarE.q();
                if (objQ == c2565a2) {
                    objQ = new kb0.k(p1Var, 9);
                    o0VarE.K(objQ);
                }
                r rVarF2 = x2.f(w.d(aVar, false, null, null, (e23.a) objQ, 15), 1.0f);
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a2) {
                    objQ2 = new v2(p1Var3, 27);
                    o0VarE.K(objQ2);
                }
                r rVarF3 = g0.f(rVarF2, (l) objQ2);
                float f18 = 1;
                g6.f.a aVar3 = g6.f.f75994b;
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0VarE.C(-1387158098);
                    jB = d92.b.a(o0VarE).f().f();
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1387073778);
                    jB = d92.b.a(o0VarE).f().b();
                    o0VarE.g0(false);
                }
                u uVarA = u1.n.a(f18, jB);
                bVar3.getClass();
                r rVarE = u1.n.e(q.c(uVarA.f167683a, rVarF3, uVarA.f167684b, k2.i.a(f16)), p6.b.b(o0VarE), m1.f128891a);
                bVar3.getClass();
                bVar3.getClass();
                bVar3.getClass();
                bVar3.getClass();
                r rVarB = c2.l.B(rVarE, f16, f15, f16, f15);
                z0VarD = c2.q.d(h4.d.a.f81527e, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarB, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                }
                b4.c(fVar, rVarC, o0VarE);
                c2.u uVar = c2.u.f22885a;
                bVar3.getClass();
                r rVarC6 = c2.l.C(aVar, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
                if (str != null || str.length() == 0) {
                    str2 = (String) p1Var4.getF182175a();
                }
                mh.c(str2 != null ? str2 : "---", rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, o0VarE, 0, 0, 131068);
                o0VarE.g0(true);
                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a2) {
                    objQ3 = new kb0.k(p1Var, 10);
                    o0VarE.K(objQ3);
                }
                i3.u.a(zBooleanValue, (e23.a) objQ3, x2.u(x2.o(aVar, 0.0f, 0.0f, 0.0f, 328, 7), ((g6.c) o0VarE.A(t1.f91490h)).d1(Float.intBitsToFloat((int) (((n4.g) p1Var3.getF182175a()).f123561a >> 32)))), 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-584881110, new fb0.b((Object) list, lVar, (Object) p1Var4, (Object) p1Var, 20), o0VarE), o0VarE, 48, 48, 2040);
                o0Var = o0VarE;
                if (((Boolean) obj2).booleanValue()) {
                    bVar2 = bVar;
                    z14 = true;
                    o0Var.C(-1384328387);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-1385556855);
                    h4.g.b bVar5 = h4.d.a.f81534l;
                    bVar3.getClass();
                    r rVarF4 = x2.f(c2.l.C(aVar, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 1.0f);
                    s2VarA = q2.a(c2.j.f22692b, bVar5, o0Var, 48);
                    iHashCode2 = Long.hashCode(o0Var.U);
                    i2VarA1 = o0Var.a0();
                    rVarC2 = h4.k.c(rVarF4, o0Var);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar2, s2VarA, o0Var);
                    b4.c(c1623g, i2VarA1, o0Var);
                    if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar4);
                    }
                    b4.c(fVar, rVarC2, o0Var);
                    u2 u2Var = u2.f22900a;
                    t4.d dVarA = n5.c.a(R.drawable.icon_danger, o0Var, 0);
                    bVar3.getClass();
                    y0.a(dVarA, "", x2.q(aVar, j92.b.f97901d.f97903b), null, null, 0.0f, null, o0Var, 48, 120);
                    bVar2 = bVar;
                    if (bVar2 == nj2.a.b.ADDRESS_LINE_1) {
                        i15 = 32610931;
                        i16 = R.string.cm_address;
                        z15 = false;
                    } else {
                        z15 = false;
                        i15 = 1663622502;
                        i16 = i17;
                    }
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var, i15, i16, o0Var, z15);
                    number = (Number) b14;
                    if (number.intValue() == R.string.cm_please_enter_a_valid) {
                        o0Var.C(32822599);
                        String strQ3 = gl1.y.Q(o0Var, R.string.cm_please_enter_a_valid);
                        String lowerCase = strJ.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        strQ2 = d53.u.v(strQ3, "{0}", lowerCase, false);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1663631721);
                        strQ2 = gl1.y.Q(o0Var, number.intValue());
                        o0Var.g0(false);
                    }
                    bVar3.getClass();
                    mh.c(strQ2, c2.l.C(aVar, eVar.f97917b, 0.0f, 0.0f, 0.0f, 14), d92.b.a(o0Var).k().e(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, o0Var, 0, 0, 262136);
                    o0Var = o0Var;
                    z14 = true;
                    o0Var.g0(true);
                    o0Var.g0(false);
                }
                o0Var.g0(z14);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC4, o0VarE);
            b0 b0Var2 = b0.f22601a;
            o0VarE.C(-598961760);
            strQ = gl1.y.Q(o0VarE, i17);
            aVar = r.S;
            r rVarF5 = x2.f(aVar, 1.0f);
            bVar3.getClass();
            r rVarC7 = c2.l.C(rVarF5, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            if (bVar.f126288a) {
                strQ = tn.k.g(strQ, " *");
            }
            j92.f.f97924a.getClass();
            obj2 = obj;
            mh.c(strQ, rVarC7, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 0, 0, 131064);
            Unit unit2 = Unit.INSTANCE;
            o0VarE.g0(false);
            objQ = o0VarE.q();
            if (objQ == c2565a2) {
                objQ = new kb0.k(p1Var, 9);
                o0VarE.K(objQ);
            }
            r rVarF6 = x2.f(w.d(aVar, false, null, null, (e23.a) objQ, 15), 1.0f);
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = new v2(p1Var3, 27);
                o0VarE.K(objQ2);
            }
            r rVarF7 = g0.f(rVarF6, (l) objQ2);
            float f19 = 1;
            g6.f.a aVar4 = g6.f.f75994b;
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-1387158098);
                jB = d92.b.a(o0VarE).f().f();
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1387073778);
                jB = d92.b.a(o0VarE).f().b();
                o0VarE.g0(false);
            }
            u uVarA2 = u1.n.a(f19, jB);
            bVar3.getClass();
            r rVarE2 = u1.n.e(q.c(uVarA2.f167683a, rVarF7, uVarA2.f167684b, k2.i.a(f16)), p6.b.b(o0VarE), m1.f128891a);
            bVar3.getClass();
            bVar3.getClass();
            bVar3.getClass();
            bVar3.getClass();
            r rVarB2 = c2.l.B(rVarE2, f16, f15, f16, f15);
            z0VarD = c2.q.d(h4.d.a.f81527e, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarB2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            bVar3.getClass();
            r rVarC8 = c2.l.C(aVar, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
            if (str != null) {
                str2 = (String) p1Var4.getF182175a();
            } else {
                str2 = (String) p1Var4.getF182175a();
            }
            mh.c(str2 != null ? str2 : "---", rVarC8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, o0VarE, 0, 0, 131068);
            o0VarE.g0(true);
            boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a2) {
                objQ3 = new kb0.k(p1Var, 10);
                o0VarE.K(objQ3);
            }
            i3.u.a(zBooleanValue2, (e23.a) objQ3, x2.u(x2.o(aVar, 0.0f, 0.0f, 0.0f, 328, 7), ((g6.c) o0VarE.A(t1.f91490h)).d1(Float.intBitsToFloat((int) (((n4.g) p1Var3.getF182175a()).f123561a >> 32)))), 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-584881110, new fb0.b((Object) list, lVar, (Object) p1Var4, (Object) p1Var, 20), o0VarE), o0VarE, 48, 48, 2040);
            o0Var = o0VarE;
            if (((Boolean) obj2).booleanValue()) {
                o0Var.C(-1385556855);
                h4.g.b bVar6 = h4.d.a.f81534l;
                bVar3.getClass();
                r rVarF8 = x2.f(c2.l.C(aVar, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 1.0f);
                s2VarA = q2.a(c2.j.f22692b, bVar6, o0Var, 48);
                iHashCode2 = Long.hashCode(o0Var.U);
                i2VarA1 = o0Var.a0();
                rVarC2 = h4.k.c(rVarF8, o0Var);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                b4.c(eVar2, s2VarA, o0Var);
                b4.c(c1623g, i2VarA1, o0Var);
                if (o0Var.T) {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar4);
                } else {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar4);
                }
                b4.c(fVar, rVarC2, o0Var);
                u2 u2Var2 = u2.f22900a;
                t4.d dVarA2 = n5.c.a(R.drawable.icon_danger, o0Var, 0);
                bVar3.getClass();
                y0.a(dVarA2, "", x2.q(aVar, j92.b.f97901d.f97903b), null, null, 0.0f, null, o0Var, 48, 120);
                bVar2 = bVar;
                if (bVar2 == nj2.a.b.ADDRESS_LINE_1) {
                    i15 = 32610931;
                    i16 = R.string.cm_address;
                    z15 = false;
                } else {
                    z15 = false;
                    i15 = 1663622502;
                    i16 = i17;
                }
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var, i15, i16, o0Var, z15);
                number = (Number) b14;
                if (number.intValue() == R.string.cm_please_enter_a_valid) {
                    o0Var.C(32822599);
                    String strQ4 = gl1.y.Q(o0Var, R.string.cm_please_enter_a_valid);
                    String lowerCase2 = strJ.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    strQ2 = d53.u.v(strQ4, "{0}", lowerCase2, false);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1663631721);
                    strQ2 = gl1.y.Q(o0Var, number.intValue());
                    o0Var.g0(false);
                }
                bVar3.getClass();
                mh.c(strQ2, c2.l.C(aVar, eVar.f97917b, 0.0f, 0.0f, 0.0f, 14), d92.b.a(o0Var).k().e(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, o0Var, 0, 0, 262136);
                o0Var = o0Var;
                z14 = true;
                o0Var.g0(true);
                o0Var.g0(false);
            } else {
                bVar2 = bVar;
                z14 = true;
                o0Var.C(-1384328387);
                o0Var.g0(false);
            }
            o0Var.g0(z14);
        } else {
            o0Var = o0VarE;
            bVar2 = bVar;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.j(rVar, list, str, pVar, bVar2, lVar, i14, 18);
        }
    }
}
