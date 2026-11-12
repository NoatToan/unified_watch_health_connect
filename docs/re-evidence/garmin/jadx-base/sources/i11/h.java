package i11;

import a42.a0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import et1.b2;
import h4.r;
import h5.e0;
import hq.f0;
import i3.i7;
import i3.mh;
import o4.d0;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p5.v;
import r1.c0;
import s5.x0;
import u1.m0;
import v62.h1;
import v62.k1;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, String str, String str2, String str3, p3.m mVar, int i14) {
        o0 o0Var;
        r rVar2;
        long jG;
        boolean z14;
        str.getClass();
        o0 o0VarE = mVar.E(-575985105);
        int i15 = i14 | 6 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.B(str3) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar2 = r.S;
            } else {
                o0VarE.e();
                rVar2 = rVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new b2(p1Var, 29);
                o0VarE.K(objQ2);
            }
            r rVarB = m4.e.b(rVar2, (e23.l) objQ2);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(529106165);
                d92.b.f58623a.getClass();
                jG = d92.b.a(o0VarE).e().g();
                o0VarE.g0(false);
            } else {
                o0VarE.C(529106746);
                o0VarE.g0(false);
                d0.f128823b.getClass();
                jG = d0.f128831j;
            }
            r rVarA = m0.a(u1.n.e(rVarB, jG, m1.f128891a), true, null);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new f(0);
                o0VarE.K(objQ3);
            }
            r rVarC = v.c((e23.l) objQ3, rVarA, true);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            r rVarZ = c2.l.z(rVarC, eVar.f97918c, f14);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            s2 s2VarF = hb.a.f(jVar, eVar.f97920e, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarZ, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarF, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            r.a aVar2 = r.S;
            r rVarA2 = u2Var.a(aVar2, 0.6f, true);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97932i;
            rVar = rVar2;
            mh.c(str, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131068);
            r rVarA3 = u2Var.a(aVar2, 0.4f, true);
            boolean z15 = (((i15 & 7168) ^ 3072) > 2048 && o0VarE.B(str3)) || (i15 & 3072) == 2048;
            Object objQ4 = o0VarE.q();
            if (z15 || objQ4 == c2565a) {
                z14 = false;
                objQ4 = new g(str3, 0);
                o0VarE.K(objQ4);
            } else {
                z14 = false;
            }
            r rVarC3 = v.c((e23.l) objQ4, rVarA3, z14);
            fVar.getClass();
            mh.c(str2, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i15 >> 6) & 14, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        r rVar3 = rVar;
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(rVar3, str, str2, str3, i14, 18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(String str, String str2, String str3, z3.e eVar, p3.m mVar, int i14) {
        u4.d dVarA;
        str.getClass();
        o0 o0VarE = mVar.E(403063054);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ2;
            r.a aVar = r.S;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new gp.e(p1Var, 28);
                o0VarE.K(objQ3);
            }
            r rVarD = wz1.i.d(aVar, jVar, (e23.a) objQ3);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarD, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                s62.a.f157643a.getClass();
                dVarA = k1.a(t62.b.f162798a);
            } else {
                s62.a.f157643a.getClass();
                dVarA = h1.a(t62.b.f162798a);
            }
            c(null, dVarA, str, str2, str3, o0VarE, (i15 << 6) & 65408, 1);
            c0.c(b0Var, ((Boolean) p1Var.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(1014800220, new aa2.k(eVar, 3), o0VarE), o0VarE, 1572870, 30);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(str, str2, str3, eVar, i14, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:105:0x0302  */
    /* JADX WARN: Code duplicated, block: B:107:0x0308  */
    /* JADX WARN: Code duplicated, block: B:109:0x030e  */
    /* JADX WARN: Code duplicated, block: B:112:0x031a  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x0166  */
    /* JADX WARN: Code duplicated, block: B:70:0x016f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x022e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(r rVar, u4.d dVar, String str, String str2, String str3, p3.m mVar, int i14, int i15) {
        u4.d dVar2;
        boolean z14;
        r rVar2;
        u4.d dVar3;
        p2 p2VarI0;
        r rVar3;
        u4.d dVar4;
        Object objQ;
        p3.m.a.C2565a c2565a;
        p1 p1Var;
        Object objQ2;
        long jG;
        Object objQ3;
        j92.b bVar;
        j92.e eVar;
        h4.g.b bVar2;
        s2 s2VarF;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar;
        h5.g.a.e eVar2;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar3;
        r rVar4;
        h5.g.a.f fVar;
        u2 u2Var;
        r.a aVar2;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        u4.d dVar5;
        boolean z15;
        boolean z16;
        Object objQ4;
        int i16;
        int i17;
        int i18;
        str.getClass();
        o0 o0VarE = mVar.E(-1136235014);
        p3.c<?> cVar = o0VarE.f135177b;
        int i19 = i14 | 6;
        int i24 = i15 & 2;
        if (i24 == 0) {
            if ((i14 & 48) == 0) {
                dVar2 = dVar;
                i19 |= o0VarE.B(dVar2) ? 32 : 16;
            }
            if ((i14 & 384) != 0) {
                if (o0VarE.B(str)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i19 |= i18;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.B(str2)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i19 |= i17;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.B(str3)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i19 |= i16;
            }
            if ((i19 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i19 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    r.a aVar3 = r.S;
                    if (i24 != 0) {
                        dVar2 = null;
                    }
                    rVar3 = aVar3;
                } else {
                    o0VarE.e();
                    rVar3 = rVar;
                }
                dVar4 = dVar2;
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1Var = (p1) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new b2(p1Var, 28);
                    o0VarE.K(objQ2);
                }
                r rVarB = m4.e.b(rVar3, (e23.l) objQ2);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(-1000143264);
                    d92.b.f58623a.getClass();
                    jG = d92.b.a(o0VarE).e().g();
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1000142683);
                    o0VarE.g0(false);
                    d0.f128823b.getClass();
                    jG = d0.f128831j;
                }
                r rVarA = m0.a(u1.n.e(rVarB, jG, m1.f128891a), true, null);
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new f0(29);
                    o0VarE.K(objQ3);
                }
                r rVarC3 = v.c((e23.l) objQ3, rVarA, true);
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar.getClass();
                r rVarZ = c2.l.z(rVarC3, eVar.f97918c, f14);
                h4.d.f81522a.getClass();
                bVar2 = h4.d.a.f81534l;
                c2.j jVar = c2.j.f22691a;
                bVar.getClass();
                s2VarF = hb.a.f(jVar, eVar.f97920e, bVar2, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarZ, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, s2VarF, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar3 = h5.g.a.f81813j;
                rVar4 = rVar3;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                u2Var = u2.f22900a;
                aVar2 = r.S;
                r rVarA2 = u2Var.a(aVar2, 0.6f, true);
                s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarA2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarE);
                if (dVar4 != null) {
                    o0VarE.C(762435664);
                    long jB = d92.b.a(o0VarE).f().b();
                    bVar.getClass();
                    z15 = false;
                    i7.b(dVar4, null, x2.q(aVar2, j92.b.f97901d.f97903b), jB, o0VarE, ((i19 >> 3) & 14) | 48, 0);
                    dVar5 = dVar4;
                    o0VarE.g0(false);
                } else {
                    dVar5 = dVar4;
                    z15 = false;
                    o0VarE.C(762704248);
                    bVar.getClass();
                    c2.l.f(x2.u(aVar2, j92.b.f97901d.f97903b), o0VarE);
                    o0VarE.g0(false);
                }
                bVar.getClass();
                c2.l.f(x2.u(aVar2, eVar.f97917b), o0VarE);
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0Var = j92.f.f97932i;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i19 >> 6) & 14, 0, 131070);
                o0VarE.g0(true);
                r rVarA3 = u2Var.a(aVar2, 0.4f, true);
                z16 = ((((57344 & i19) ^ 24576) > 16384 || !o0VarE.B(str3)) && (i19 & 24576) != 16384) ? z15 : true;
                objQ4 = o0VarE.q();
                if (z16 || objQ4 == c2565a) {
                    objQ4 = new gp.j(str3, 29);
                    o0VarE.K(objQ4);
                }
                r rVarC4 = v.c((e23.l) objQ4, rVarA3, z15);
                fVar2.getClass();
                mh.c(str2, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i19 >> 9) & 14, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                rVar2 = rVar4;
                dVar3 = dVar5;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                dVar3 = dVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a0(rVar2, (Object) dVar3, (Object) str, (Object) str2, (Object) str3, i14, i15, 12);
            }
        }
        i19 = i14 | 54;
        dVar2 = dVar;
        if ((i14 & 384) != 0) {
            if (o0VarE.B(str)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i19 |= i18;
        }
        if ((i14 & 3072) == 0) {
            if (o0VarE.B(str2)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i19 |= i17;
        }
        if ((i14 & 24576) == 0) {
            if (o0VarE.B(str3)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i19 |= i16;
        }
        if ((i19 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i19 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                r.a aVar4 = r.S;
                if (i24 != 0) {
                    dVar2 = null;
                }
                rVar3 = aVar4;
            } else {
                r.a aVar5 = r.S;
                if (i24 != 0) {
                    dVar2 = null;
                }
                rVar3 = aVar5;
            }
            dVar4 = dVar2;
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1Var = (p1) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new b2(p1Var, 28);
                o0VarE.K(objQ2);
            }
            r rVarB2 = m4.e.b(rVar3, (e23.l) objQ2);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-1000143264);
                d92.b.f58623a.getClass();
                jG = d92.b.a(o0VarE).e().g();
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1000142683);
                o0VarE.g0(false);
                d0.f128823b.getClass();
                jG = d0.f128831j;
            }
            r rVarA4 = m0.a(u1.n.e(rVarB2, jG, m1.f128891a), true, null);
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new f0(29);
                o0VarE.K(objQ3);
            }
            r rVarC5 = v.c((e23.l) objQ3, rVarA4, true);
            d92.b.f58623a.getClass();
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            float f15 = eVar.f97920e;
            bVar.getClass();
            r rVarZ2 = c2.l.z(rVarC5, eVar.f97918c, f15);
            h4.d.f81522a.getClass();
            bVar2 = h4.d.a.f81534l;
            c2.j jVar2 = c2.j.f22691a;
            bVar.getClass();
            s2VarF = hb.a.f(jVar2, eVar.f97920e, bVar2, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarZ2, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarF, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar3 = h5.g.a.f81813j;
            rVar4 = rVar3;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2Var = u2.f22900a;
            aVar2 = r.S;
            r rVarA5 = u2Var.a(aVar2, 0.6f, true);
            s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarA5, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            if (dVar4 != null) {
                o0VarE.C(762435664);
                long jB2 = d92.b.a(o0VarE).f().b();
                bVar.getClass();
                z15 = false;
                i7.b(dVar4, null, x2.q(aVar2, j92.b.f97901d.f97903b), jB2, o0VarE, ((i19 >> 3) & 14) | 48, 0);
                dVar5 = dVar4;
                o0VarE.g0(false);
            } else {
                dVar5 = dVar4;
                z15 = false;
                o0VarE.C(762704248);
                bVar.getClass();
                c2.l.f(x2.u(aVar2, j92.b.f97901d.f97903b), o0VarE);
                o0VarE.g0(false);
            }
            bVar.getClass();
            c2.l.f(x2.u(aVar2, eVar.f97917b), o0VarE);
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            x0 x0Var2 = j92.f.f97932i;
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, o0VarE), o0VarE, (i19 >> 6) & 14, 0, 131070);
            o0VarE.g0(true);
            r rVarA6 = u2Var.a(aVar2, 0.4f, true);
            if (((57344 & i19) ^ 24576) > 16384) {
            }
            objQ4 = o0VarE.q();
            if (z16) {
                objQ4 = new gp.j(str3, 29);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new gp.j(str3, 29);
                o0VarE.K(objQ4);
            }
            r rVarC6 = v.c((e23.l) objQ4, rVarA6, z15);
            fVar3.getClass();
            mh.c(str2, rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, o0VarE), o0VarE, (i19 >> 9) & 14, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            rVar2 = rVar4;
            dVar3 = dVar5;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            dVar3 = dVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(rVar2, (Object) dVar3, (Object) str, (Object) str2, (Object) str3, i14, i15, 12);
        }
    }
}
