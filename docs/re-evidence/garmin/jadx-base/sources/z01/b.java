package z01;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import g02.f1;
import g02.t0;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import j53.l;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.x3;
import p5.v;
import s5.x0;
import ta0.g0;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final void a(r rVar, Float f14, long j8, long j14, Float f15, m mVar, int i14) {
        int i15;
        long j15;
        long j16;
        float fFloatValue;
        boolean z14;
        i53.f fVarA;
        i53.f fVarB;
        d0 d0VarA;
        o0 o0VarE = mVar.E(-890047093);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(f14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            j15 = j8;
            i15 |= o0VarE.l(j15) ? 256 : 128;
        } else {
            j15 = j8;
        }
        if ((i14 & 3072) == 0) {
            j16 = j14;
            i15 |= o0VarE.l(j16) ? 2048 : 1024;
        } else {
            j16 = j14;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(f15) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            int i16 = i15;
            x3 x3VarB = s1.f.b(f14 != null ? f14.floatValue() : 0.0f, null, "AnimatedAmount", o0VarE, 3072, 22);
            if (f15 != null) {
                fFloatValue = f15.floatValue();
            } else {
                fFloatValue = f14 != null ? f14.floatValue() : 1.0f;
            }
            x3 x3VarB2 = s1.f.b(fFloatValue, null, "AnimatedGoal", o0VarE, 3072, 22);
            if (((Number) x3VarB.getF182175a()).floatValue() <= 0.0f) {
                fVarB = l.b();
                z14 = false;
            } else {
                if (s.e(f15, 0.0f)) {
                    long j17 = j16;
                    z14 = false;
                    fVarA = i53.a.a(new t0(((Number) x3VarB.getF182175a()).floatValue(), j17, null));
                } else {
                    z14 = false;
                    fVarA = ((Number) x3VarB.getF182175a()).floatValue() > ((Number) x3VarB2.getF182175a()).floatValue() ? i53.a.a(new t0(((Number) x3VarB2.getF182175a()).floatValue(), j15, null), new t0(((Number) x3VarB.getF182175a()).floatValue() - ((Number) x3VarB2.getF182175a()).floatValue(), j14, null)) : i53.a.a(new t0(((Number) x3VarB.getF182175a()).floatValue(), j8, null));
                }
                fVarB = fVarA;
            }
            if (((Number) x3VarB2.getF182175a()).floatValue() != 0.0f && ((Number) x3VarB.getF182175a()).floatValue() >= ((Number) x3VarB2.getF182175a()).floatValue()) {
                o0VarE.C(1736623835);
                o0VarE.g0(z14);
                d0VarA = null;
            } else {
                o0VarE.C(1736572809);
                d92.b.f58623a.getClass();
                long jG = d92.b.a(o0VarE).e().g();
                o0VarE.g0(z14);
                d0VarA = d0.a(jG);
            }
            f1.i(rVar, d0VarA, fVarB, ((Number) x3VarB2.getF182175a()).floatValue(), 0.0f, 0.0f, 0.0f, o0VarE, i16 & 14, 112);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.x1(rVar, f14, j8, j14, f15, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0361  */
    /* JADX WARN: Code duplicated, block: B:54:0x017b  */
    /* JADX WARN: Code duplicated, block: B:56:0x019e  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x020f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0216  */
    /* JADX WARN: Code duplicated, block: B:77:0x0263  */
    /* JADX WARN: Code duplicated, block: B:79:0x0267  */
    /* JADX WARN: Code duplicated, block: B:81:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:83:0x02af  */
    /* JADX WARN: Code duplicated, block: B:84:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:92:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:94:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:96:0x0307  */
    /* JADX WARN: Code duplicated, block: B:98:0x030e  */
    public static final void b(r rVar, String str, String str2, z3.e eVar, a aVar, b92.a aVar2, m mVar, int i14) {
        r rVar2;
        r rVar3;
        e0.a aVar3;
        g.a.f fVar;
        r.a aVar4;
        h4.g.b bVar;
        e0.a aVar5;
        String str3;
        m.a aVar6;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        boolean zB;
        Object objQ;
        boolean z14;
        boolean z15;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        boolean z16;
        boolean zB2;
        Object objQ2;
        str.getClass();
        o0 o0VarE = mVar.E(1240517490);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | 6 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.B(aVar) ? 16384 : 8192) | (o0VarE.B(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar3 = r.S;
            } else {
                o0VarE.e();
                rVar3 = rVar;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            float fA = c22.b.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            boolean z17 = fA > 1.3f;
            boolean z18 = fA > 1.65f;
            j jVar = j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97917b;
            float f15 = eVar2.f97918c;
            jVar.getClass();
            j.i iVarI = j.i(f14);
            h4.d.f81522a.getClass();
            h4.g.a aVar7 = h4.d.a.f81536n;
            z zVarA2 = y.a(iVarI, aVar7, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC3 = k.c(rVar3, o0VarE);
            g.V.getClass();
            e0.a aVar8 = g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            r rVar4 = rVar3;
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            g.a.e eVar3 = g.a.f81810g;
            b4.c(eVar3, zVarA2, o0VarE);
            g.a.C1623g c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            g.a.b bVar3 = g.a.f81813j;
            if (o0VarE.T) {
                aVar3 = aVar8;
            } else {
                aVar3 = aVar8;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                b0 b0Var = b0.f22601a;
                aVar4 = r.S;
                r rVarF = x2.f(aVar4, 1.0f);
                bVar2.getClass();
                j.i iVarI2 = j.i(f15);
                bVar2.getClass();
                j.i iVarI3 = j.i(eVar2.f97916a);
                bVar = h4.d.a.f81534l;
                aVar5 = aVar3;
                c2.t0.a(rVarF, iVarI2, iVarI3, bVar, 0, 0, z3.f.c(-658451507, new l72.d(aVar2, z17, str, str2), o0VarE), o0VarE, 1575942, 48);
                str3 = aVar2.f16961a.get("value");
                aVar6 = m.f135153a;
                if (z18) {
                    r rVarC4 = c2.l.C(ds.e0.g(o0VarE, 1753886123, aVar4, 1.0f, bVar2), 0.0f, eVar2.f97917b, 0.0f, 0.0f, 13);
                    bVar2.getClass();
                    zVarA = y.a(j.i(f15), aVar7, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarC4, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar5);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar3, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    eVar.invoke(x2.f(aVar4, 1.0f), o0VarE, 54);
                    if (aVar == null) {
                        o0VarE.C(817874525);
                        z14 = false;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(817874526);
                        String str4 = aVar.f200728b;
                        x0 x0Var = aVar.f200729c;
                        zB = o0VarE.B(str3);
                        objQ = o0VarE.q();
                        if (zB) {
                            objQ = new y01.k(str3, 20);
                            o0VarE.K(objQ);
                        } else {
                            aVar6.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new y01.k(str3, 20);
                                o0VarE.K(objQ);
                            }
                        }
                        r rVarC5 = v.c((e23.l) objQ, aVar4, false);
                        d6.h.f57752b.getClass();
                        z14 = false;
                        mh.c(str4, rVarC5, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 130044);
                        o0VarE = o0VarE;
                        Unit unit = Unit.INSTANCE;
                        o0VarE.g0(false);
                    }
                    z15 = true;
                    o0VarE.g0(true);
                    o0VarE.g0(z14);
                } else {
                    r rVarG = ds.e0.g(o0VarE, 1752966911, aVar4, 1.0f, bVar2);
                    s2VarA = q2.a(j.i(eVar2.f97920e), bVar, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(rVarG, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar5);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar3, s2VarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    z15 = true;
                    eVar.invoke(u2.f22900a.a(aVar4, 1.0f, true), o0VarE, 48);
                    if (aVar == null) {
                        o0VarE.C(1328752246);
                        z16 = false;
                        o0VarE.g0(false);
                    } else {
                        z16 = false;
                        o0VarE.C(1328752247);
                        String str5 = aVar.f200728b;
                        x0 x0Var2 = aVar.f200729c;
                        r rVarU = x2.u(aVar4, aVar.f200727a);
                        zB2 = o0VarE.B(str3);
                        objQ2 = o0VarE.q();
                        if (zB2) {
                            objQ2 = new y01.k(str3, 19);
                            o0VarE.K(objQ2);
                        } else {
                            aVar6.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new y01.k(str3, 19);
                                o0VarE.K(objQ2);
                            }
                        }
                        r rVarC6 = v.c((e23.l) objQ2, rVarU, false);
                        d6.h.f57752b.getClass();
                        mh.c(str5, rVarC6, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0Var2, o0VarE, 0, 0, 130044);
                        o0VarE = o0VarE;
                        Unit unit2 = Unit.INSTANCE;
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    o0VarE.g0(z16);
                }
                o0VarE.g0(z15);
                rVar2 = rVar4;
            }
            h.A(iHashCode3, o0VarE, iHashCode3, bVar3);
            fVar = g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var2 = b0.f22601a;
            aVar4 = r.S;
            r rVarF2 = x2.f(aVar4, 1.0f);
            bVar2.getClass();
            j.i iVarI4 = j.i(f15);
            bVar2.getClass();
            j.i iVarI5 = j.i(eVar2.f97916a);
            bVar = h4.d.a.f81534l;
            aVar5 = aVar3;
            c2.t0.a(rVarF2, iVarI4, iVarI5, bVar, 0, 0, z3.f.c(-658451507, new l72.d(aVar2, z17, str, str2), o0VarE), o0VarE, 1575942, 48);
            str3 = aVar2.f16961a.get("value");
            aVar6 = m.f135153a;
            if (z18) {
                r rVarG2 = ds.e0.g(o0VarE, 1752966911, aVar4, 1.0f, bVar2);
                s2VarA = q2.a(j.i(eVar2.f97920e), bVar, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarG2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                } else {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarE);
                z15 = true;
                eVar.invoke(u2.f22900a.a(aVar4, 1.0f, true), o0VarE, 48);
                if (aVar == null) {
                    o0VarE.C(1328752246);
                    z16 = false;
                    o0VarE.g0(false);
                } else {
                    z16 = false;
                    o0VarE.C(1328752247);
                    String str6 = aVar.f200728b;
                    x0 x0Var3 = aVar.f200729c;
                    r rVarU2 = x2.u(aVar4, aVar.f200727a);
                    zB2 = o0VarE.B(str3);
                    objQ2 = o0VarE.q();
                    if (zB2) {
                        aVar6.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new y01.k(str3, 19);
                            o0VarE.K(objQ2);
                        }
                    } else {
                        objQ2 = new y01.k(str3, 19);
                        o0VarE.K(objQ2);
                    }
                    r rVarC7 = v.c((e23.l) objQ2, rVarU2, false);
                    d6.h.f57752b.getClass();
                    mh.c(str6, rVarC7, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0Var3, o0VarE, 0, 0, 130044);
                    o0VarE = o0VarE;
                    Unit unit3 = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(z16);
            } else {
                r rVarC8 = c2.l.C(ds.e0.g(o0VarE, 1753886123, aVar4, 1.0f, bVar2), 0.0f, eVar2.f97917b, 0.0f, 0.0f, 13);
                bVar2.getClass();
                zVarA = y.a(j.i(f15), aVar7, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarC8, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar3);
                } else {
                    h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                eVar.invoke(x2.f(aVar4, 1.0f), o0VarE, 54);
                if (aVar == null) {
                    o0VarE.C(817874525);
                    z14 = false;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(817874526);
                    String str7 = aVar.f200728b;
                    x0 x0Var4 = aVar.f200729c;
                    zB = o0VarE.B(str3);
                    objQ = o0VarE.q();
                    if (zB) {
                        aVar6.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new y01.k(str3, 20);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new y01.k(str3, 20);
                        o0VarE.K(objQ);
                    }
                    r rVarC9 = v.c((e23.l) objQ, aVar4, false);
                    d6.h.f57752b.getClass();
                    z14 = false;
                    mh.c(str7, rVarC9, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0Var4, o0VarE, 0, 0, 130044);
                    o0VarE = o0VarE;
                    Unit unit4 = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                z15 = true;
                o0VarE.g0(true);
                o0VarE.g0(z14);
            }
            o0VarE.g0(z15);
            rVar2 = rVar4;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(rVar2, str, str2, eVar, aVar, aVar2, i14, 25);
        }
    }
}
