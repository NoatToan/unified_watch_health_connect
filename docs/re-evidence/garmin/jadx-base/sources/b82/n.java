package b82;

import android.annotation.SuppressLint;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class n {
    /* JADX WARN: Code duplicated, block: B:102:0x023a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0291  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:108:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:71:0x011c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0148  */
    /* JADX WARN: Code duplicated, block: B:76:0x014f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0153  */
    /* JADX WARN: Code duplicated, block: B:80:0x0160  */
    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0176  */
    /* JADX WARN: Code duplicated, block: B:86:0x0181  */
    /* JADX WARN: Code duplicated, block: B:88:0x0191  */
    /* JADX WARN: Code duplicated, block: B:90:0x0197  */
    /* JADX WARN: Code duplicated, block: B:98:0x022d  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ModifierParameter"})
    public static final void a(e23.p<? super p3.m, ? super Integer, Unit> pVar, String str, String str2, h4.r rVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        int i18;
        boolean z14;
        h4.r rVar3;
        e23.p<? super p3.m, ? super Integer, Unit> pVar4;
        p3.o0 o0Var;
        p2 p2VarI0;
        h4.r rVar4;
        h4.g.a aVar;
        h4.r.a aVar2;
        float f14;
        c2.z zVarA;
        int i19;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar3;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        h5.g.a.f fVar;
        Object objQ;
        c2.z zVarA2;
        h4.r rVar5;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        int i24;
        e23.p<? super p3.m, ? super Integer, Unit> pVar5;
        h4.r.a aVar4;
        int i25;
        boolean z15;
        p3.o0 o0Var2;
        boolean z16;
        float f15;
        h4.r.a aVar5;
        e23.p<? super p3.m, ? super Integer, Unit> pVar6;
        str2.getClass();
        p3.o0 o0VarE = mVar.E(-542069414);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str2) ? 256 : 128;
        }
        int i26 = i15 & 8;
        if (i26 == 0) {
            if ((i14 & 3072) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 2048 : 1024;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    pVar3 = pVar2;
                    if (o0VarE.r(pVar3)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i16 |= i18;
                }
                if ((i16 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i26 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        pVar3 = null;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    c2.j.f22691a.getClass();
                    c2.j.c cVar2 = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    aVar = h4.d.a.f81537o;
                    aVar2 = h4.r.S;
                    f14 = 16;
                    g6.f.a aVar6 = g6.f.f75994b;
                    h4.r rVarThen = c2.l.y(aVar2, f14).then(rVar4);
                    zVarA = c2.y.a(cVar2, aVar, o0VarE, 54);
                    i19 = i16;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarThen, o0VarE);
                    h5.g.V.getClass();
                    aVar3 = h5.g.a.f81805b;
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, o0VarE);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new b71.o(3);
                        o0VarE.K(objQ);
                    }
                    h4.r rVarC3 = p5.v.c((e23.l) objQ, aVar2, true);
                    zVarA2 = c2.y.a(c2.j.f22694d, aVar, o0VarE, 48);
                    rVar5 = rVar4;
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarC3, o0VarE);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    if (pVar == null) {
                        o0VarE.C(1930965075);
                        i24 = 0;
                        o0VarE.g0(false);
                    } else {
                        i24 = 0;
                        o0VarE.C(-2015920786);
                        e5.q(i19 & 14, pVar, o0VarE, false);
                        Unit unit = Unit.INSTANCE;
                    }
                    if (str != null || str.length() == 0) {
                        boolean z17 = i24;
                        p3.o0 o0Var3 = o0VarE;
                        pVar5 = pVar3;
                        aVar4 = aVar2;
                        i25 = i19;
                        z15 = true;
                        o0Var3.C(1931552092);
                        o0Var3.g0(z17);
                        z16 = z17;
                        o0Var2 = o0Var3;
                    } else {
                        o0VarE.C(1931031230);
                        float f16 = pVar == null ? i24 : f14;
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                        d6.h.f57752b.getClass();
                        aVar4 = aVar2;
                        boolean z18 = i24;
                        pVar5 = pVar3;
                        i25 = i19;
                        z15 = true;
                        mh.c(str, b0Var.b(c2.l.C(x2.f(aVar2, 1.0f), 0.0f, f16, 0.0f, 0.0f, 13), aVar), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, (i19 >> 3) & 14, 0, 130044);
                        p3.o0 o0Var4 = o0VarE;
                        o0Var4.g0(z18);
                        z16 = z18;
                        o0Var2 = o0Var4;
                    }
                    if (str != null || str.length() == 0) {
                        f15 = f14;
                    } else {
                        f15 = 8;
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF = d92.c.f(j92.f.f97932i, o0Var2);
                    d6.h.f57752b.getClass();
                    aVar5 = aVar4;
                    mh.c(str2, c2.l.C(aVar4, 0.0f, f15, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0Var2, (i25 >> 6) & 14, 0, 130044);
                    o0Var2.g0(z15);
                    if (pVar5 != null) {
                        o0Var2.C(1694828117);
                        c2.l.f(x2.h(aVar5, 24), o0Var2);
                        pVar6 = pVar5;
                        e5.q((i25 >> 12) & 14, pVar6, o0Var2, z16);
                    } else {
                        pVar6 = pVar5;
                        o0Var2.C(1694917490);
                        o0Var2.g0(z16);
                    }
                    o0Var2.g0(z15);
                    pVar4 = pVar6;
                    rVar3 = rVar5;
                    o0Var = o0Var2;
                } else {
                    p3.o0 o0Var5 = o0VarE;
                    o0Var5.e();
                    rVar3 = rVar2;
                    pVar4 = pVar3;
                    o0Var = o0Var5;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a42.a0(pVar, str, str2, rVar3, pVar4, i14, i15, 3);
                }
            }
            i16 |= 24576;
            pVar3 = pVar2;
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i26 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    pVar3 = null;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                c2.j.f22691a.getClass();
                c2.j.c cVar3 = c2.j.f22696f;
                h4.d.f81522a.getClass();
                aVar = h4.d.a.f81537o;
                aVar2 = h4.r.S;
                f14 = 16;
                g6.f.a aVar7 = g6.f.f75994b;
                h4.r rVarThen2 = c2.l.y(aVar2, f14).then(rVar4);
                zVarA = c2.y.a(cVar3, aVar, o0VarE, 54);
                i19 = i16;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarThen2, o0VarE);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new b71.o(3);
                    o0VarE.K(objQ);
                }
                h4.r rVarC4 = p5.v.c((e23.l) objQ, aVar2, true);
                zVarA2 = c2.y.a(c2.j.f22694d, aVar, o0VarE, 48);
                rVar5 = rVar4;
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC4, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                if (pVar == null) {
                    o0VarE.C(1930965075);
                    i24 = 0;
                    o0VarE.g0(false);
                } else {
                    i24 = 0;
                    o0VarE.C(-2015920786);
                    e5.q(i19 & 14, pVar, o0VarE, false);
                    Unit unit2 = Unit.INSTANCE;
                }
                if (str != null) {
                    boolean z19 = i24;
                    p3.o0 o0Var6 = o0VarE;
                    pVar5 = pVar3;
                    aVar4 = aVar2;
                    i25 = i19;
                    z15 = true;
                    o0Var6.C(1931552092);
                    o0Var6.g0(z19);
                    z16 = z19;
                    o0Var2 = o0Var6;
                } else {
                    boolean z110 = i24;
                    p3.o0 o0Var7 = o0VarE;
                    pVar5 = pVar3;
                    aVar4 = aVar2;
                    i25 = i19;
                    z15 = true;
                    o0Var7.C(1931552092);
                    o0Var7.g0(z110);
                    z16 = z110;
                    o0Var2 = o0Var7;
                }
                if (str != null) {
                    f15 = f14;
                } else {
                    f15 = f14;
                }
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarF2 = d92.c.f(j92.f.f97932i, o0Var2);
                d6.h.f57752b.getClass();
                aVar5 = aVar4;
                mh.c(str2, c2.l.C(aVar4, 0.0f, f15, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF2, o0Var2, (i25 >> 6) & 14, 0, 130044);
                o0Var2.g0(z15);
                if (pVar5 != null) {
                    o0Var2.C(1694828117);
                    c2.l.f(x2.h(aVar5, 24), o0Var2);
                    pVar6 = pVar5;
                    e5.q((i25 >> 12) & 14, pVar6, o0Var2, z16);
                } else {
                    pVar6 = pVar5;
                    o0Var2.C(1694917490);
                    o0Var2.g0(z16);
                }
                o0Var2.g0(z15);
                pVar4 = pVar6;
                rVar3 = rVar5;
                o0Var = o0Var2;
            } else {
                p3.o0 o0Var8 = o0VarE;
                o0Var8.e();
                rVar3 = rVar2;
                pVar4 = pVar3;
                o0Var = o0Var8;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a42.a0(pVar, str, str2, rVar3, pVar4, i14, i15, 3);
            }
        }
        i16 |= 3072;
        rVar2 = rVar;
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                pVar3 = pVar2;
                if (o0VarE.r(pVar3)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i26 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    pVar3 = null;
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                c2.j.f22691a.getClass();
                c2.j.c cVar4 = c2.j.f22696f;
                h4.d.f81522a.getClass();
                aVar = h4.d.a.f81537o;
                aVar2 = h4.r.S;
                f14 = 16;
                g6.f.a aVar8 = g6.f.f75994b;
                h4.r rVarThen3 = c2.l.y(aVar2, f14).then(rVar4);
                zVarA = c2.y.a(cVar4, aVar, o0VarE, 54);
                i19 = i16;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarThen3, o0VarE);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var3 = c2.b0.f22601a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new b71.o(3);
                    o0VarE.K(objQ);
                }
                h4.r rVarC5 = p5.v.c((e23.l) objQ, aVar2, true);
                zVarA2 = c2.y.a(c2.j.f22694d, aVar, o0VarE, 48);
                rVar5 = rVar4;
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC5, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                if (pVar == null) {
                    o0VarE.C(1930965075);
                    i24 = 0;
                    o0VarE.g0(false);
                } else {
                    i24 = 0;
                    o0VarE.C(-2015920786);
                    e5.q(i19 & 14, pVar, o0VarE, false);
                    Unit unit3 = Unit.INSTANCE;
                }
                if (str != null) {
                    boolean z111 = i24;
                    p3.o0 o0Var9 = o0VarE;
                    pVar5 = pVar3;
                    aVar4 = aVar2;
                    i25 = i19;
                    z15 = true;
                    o0Var9.C(1931552092);
                    o0Var9.g0(z111);
                    z16 = z111;
                    o0Var2 = o0Var9;
                } else {
                    boolean z112 = i24;
                    p3.o0 o0Var10 = o0VarE;
                    pVar5 = pVar3;
                    aVar4 = aVar2;
                    i25 = i19;
                    z15 = true;
                    o0Var10.C(1931552092);
                    o0Var10.g0(z112);
                    z16 = z112;
                    o0Var2 = o0Var10;
                }
                if (str != null) {
                    f15 = f14;
                } else {
                    f15 = f14;
                }
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarF3 = d92.c.f(j92.f.f97932i, o0Var2);
                d6.h.f57752b.getClass();
                aVar5 = aVar4;
                mh.c(str2, c2.l.C(aVar4, 0.0f, f15, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF3, o0Var2, (i25 >> 6) & 14, 0, 130044);
                o0Var2.g0(z15);
                if (pVar5 != null) {
                    o0Var2.C(1694828117);
                    c2.l.f(x2.h(aVar5, 24), o0Var2);
                    pVar6 = pVar5;
                    e5.q((i25 >> 12) & 14, pVar6, o0Var2, z16);
                } else {
                    pVar6 = pVar5;
                    o0Var2.C(1694917490);
                    o0Var2.g0(z16);
                }
                o0Var2.g0(z15);
                pVar4 = pVar6;
                rVar3 = rVar5;
                o0Var = o0Var2;
            } else {
                p3.o0 o0Var11 = o0VarE;
                o0Var11.e();
                rVar3 = rVar2;
                pVar4 = pVar3;
                o0Var = o0Var11;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a42.a0(pVar, str, str2, rVar3, pVar4, i14, i15, 3);
            }
        }
        i16 |= 24576;
        pVar3 = pVar2;
        if ((i16 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i26 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i17 != 0) {
                pVar3 = null;
            }
            p3.x1 x1Var4 = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.c cVar5 = c2.j.f22696f;
            h4.d.f81522a.getClass();
            aVar = h4.d.a.f81537o;
            aVar2 = h4.r.S;
            f14 = 16;
            g6.f.a aVar9 = g6.f.f75994b;
            h4.r rVarThen4 = c2.l.y(aVar2, f14).then(rVar4);
            zVarA = c2.y.a(cVar5, aVar, o0VarE, 54);
            i19 = i16;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarThen4, o0VarE);
            h5.g.V.getClass();
            aVar3 = h5.g.a.f81805b;
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var4 = c2.b0.f22601a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new b71.o(3);
                o0VarE.K(objQ);
            }
            h4.r rVarC6 = p5.v.c((e23.l) objQ, aVar2, true);
            zVarA2 = c2.y.a(c2.j.f22694d, aVar, o0VarE, 48);
            rVar5 = rVar4;
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarC6, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            if (pVar == null) {
                o0VarE.C(1930965075);
                i24 = 0;
                o0VarE.g0(false);
            } else {
                i24 = 0;
                o0VarE.C(-2015920786);
                e5.q(i19 & 14, pVar, o0VarE, false);
                Unit unit4 = Unit.INSTANCE;
            }
            if (str != null) {
                boolean z113 = i24;
                p3.o0 o0Var12 = o0VarE;
                pVar5 = pVar3;
                aVar4 = aVar2;
                i25 = i19;
                z15 = true;
                o0Var12.C(1931552092);
                o0Var12.g0(z113);
                z16 = z113;
                o0Var2 = o0Var12;
            } else {
                boolean z114 = i24;
                p3.o0 o0Var13 = o0VarE;
                pVar5 = pVar3;
                aVar4 = aVar2;
                i25 = i19;
                z15 = true;
                o0Var13.C(1931552092);
                o0Var13.g0(z114);
                z16 = z114;
                o0Var2 = o0Var13;
            }
            if (str != null) {
                f15 = f14;
            } else {
                f15 = f14;
            }
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF4 = d92.c.f(j92.f.f97932i, o0Var2);
            d6.h.f57752b.getClass();
            aVar5 = aVar4;
            mh.c(str2, c2.l.C(aVar4, 0.0f, f15, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF4, o0Var2, (i25 >> 6) & 14, 0, 130044);
            o0Var2.g0(z15);
            if (pVar5 != null) {
                o0Var2.C(1694828117);
                c2.l.f(x2.h(aVar5, 24), o0Var2);
                pVar6 = pVar5;
                e5.q((i25 >> 12) & 14, pVar6, o0Var2, z16);
            } else {
                pVar6 = pVar5;
                o0Var2.C(1694917490);
                o0Var2.g0(z16);
            }
            o0Var2.g0(z15);
            pVar4 = pVar6;
            rVar3 = rVar5;
            o0Var = o0Var2;
        } else {
            p3.o0 o0Var14 = o0VarE;
            o0Var14.e();
            rVar3 = rVar2;
            pVar4 = pVar3;
            o0Var = o0Var14;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.a0(pVar, str, str2, rVar3, pVar4, i14, i15, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0137  */
    /* JADX WARN: Code duplicated, block: B:104:0x0143  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f3 A[ADDED_TO_REGION] */
    @SuppressLint({"ModifierParameter"})
    public static final void b(e23.p<? super p3.m, ? super Integer, Unit> pVar, String str, String str2, h4.r rVar, String str3, e23.a<Unit> aVar, String str4, e23.a<Unit> aVar2, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        String str5;
        int i18;
        int i19;
        e23.a<Unit> aVar3;
        int i24;
        int i25;
        boolean z14;
        h4.r rVar3;
        String str6;
        e23.a<Unit> aVar4;
        p2 p2VarI0;
        h4.r rVar4;
        String str7;
        int i26;
        int i27;
        str2.getClass();
        p3.o0 o0VarE = mVar.E(-414107909);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str2) ? 256 : 128;
        }
        int i28 = i15 & 8;
        if (i28 == 0) {
            if ((i14 & 3072) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.B(str3)) {
                    i27 = 16384;
                } else {
                    i27 = 8192;
                }
                i16 |= i27;
            }
            if ((196608 & i14) == 0) {
                if (o0VarE.r(aVar)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i16 |= i26;
            }
            i17 = i15 & 64;
            if (i17 != 0) {
                if ((1572864 & i14) == 0) {
                    str5 = str4;
                    if (o0VarE.B(str5)) {
                        i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i18 = 524288;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 128;
                if (i19 != 0) {
                    if ((12582912 & i14) == 0) {
                        aVar3 = aVar2;
                        if (o0VarE.r(aVar3)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i16 |= i24;
                    }
                    i25 = i16;
                    if ((4793491 & i25) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i25 & 1, z14)) {
                        if (i28 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        z3.e eVarC = null;
                        if (i17 != 0) {
                            str7 = null;
                        } else {
                            str7 = str5;
                        }
                        if (i19 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar3;
                        }
                        p3.x1 x1Var = p3.n.f135158a;
                        if ((str3 != null || str3.length() == 0) && (str7 == null || str7.length() == 0)) {
                            o0VarE.C(-1541766101);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-1542118881);
                            eVarC = z3.f.c(1461743467, new m(str7, aVar3, str3, aVar, 0), o0VarE);
                            o0VarE.g0(false);
                        }
                        rVar3 = rVar4;
                        a(pVar, str, str2, rVar3, eVarC, o0VarE, i25 & 8190, 0);
                        str6 = str7;
                    } else {
                        o0VarE.e();
                        rVar3 = rVar2;
                        str6 = str5;
                    }
                    aVar4 = aVar3;
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new l(pVar, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 1);
                    }
                }
                i16 |= 12582912;
                aVar3 = aVar2;
                i25 = i16;
                if ((4793491 & i25) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i25 & 1, z14)) {
                    if (i28 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    z3.e eVarC2 = null;
                    if (i17 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar3;
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    if (str3 != null) {
                        o0VarE.C(-1541766101);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1541766101);
                        o0VarE.g0(false);
                    }
                    rVar3 = rVar4;
                    a(pVar, str, str2, rVar3, eVarC2, o0VarE, i25 & 8190, 0);
                    str6 = str7;
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    str6 = str5;
                }
                aVar4 = aVar3;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new l(pVar, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 1);
                }
            }
            i16 |= 1572864;
            str5 = str4;
            i19 = i15 & 128;
            if (i19 != 0) {
                if ((12582912 & i14) == 0) {
                    aVar3 = aVar2;
                    if (o0VarE.r(aVar3)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i16 |= i24;
                }
                i25 = i16;
                if ((4793491 & i25) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i25 & 1, z14)) {
                    if (i28 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    z3.e eVarC3 = null;
                    if (i17 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar3;
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                    if (str3 != null) {
                        o0VarE.C(-1541766101);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1541766101);
                        o0VarE.g0(false);
                    }
                    rVar3 = rVar4;
                    a(pVar, str, str2, rVar3, eVarC3, o0VarE, i25 & 8190, 0);
                    str6 = str7;
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    str6 = str5;
                }
                aVar4 = aVar3;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new l(pVar, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 1);
                }
            }
            i16 |= 12582912;
            aVar3 = aVar2;
            i25 = i16;
            if ((4793491 & i25) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i25 & 1, z14)) {
                if (i28 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                z3.e eVarC4 = null;
                if (i17 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i19 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar3;
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                if (str3 != null) {
                    o0VarE.C(-1541766101);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1541766101);
                    o0VarE.g0(false);
                }
                rVar3 = rVar4;
                a(pVar, str, str2, rVar3, eVarC4, o0VarE, i25 & 8190, 0);
                str6 = str7;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                str6 = str5;
            }
            aVar4 = aVar3;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new l(pVar, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 1);
            }
        }
        i16 |= 3072;
        rVar2 = rVar;
        if ((i14 & 24576) == 0) {
            if (o0VarE.B(str3)) {
                i27 = 16384;
            } else {
                i27 = 8192;
            }
            i16 |= i27;
        }
        if ((196608 & i14) == 0) {
            if (o0VarE.r(aVar)) {
                i26 = 131072;
            } else {
                i26 = 65536;
            }
            i16 |= i26;
        }
        i17 = i15 & 64;
        if (i17 != 0) {
            if ((1572864 & i14) == 0) {
                str5 = str4;
                if (o0VarE.B(str5)) {
                    i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
            i19 = i15 & 128;
            if (i19 != 0) {
                if ((12582912 & i14) == 0) {
                    aVar3 = aVar2;
                    if (o0VarE.r(aVar3)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i16 |= i24;
                }
                i25 = i16;
                if ((4793491 & i25) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i25 & 1, z14)) {
                    if (i28 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    z3.e eVarC5 = null;
                    if (i17 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar3;
                    }
                    p3.x1 x1Var5 = p3.n.f135158a;
                    if (str3 != null) {
                        o0VarE.C(-1541766101);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1541766101);
                        o0VarE.g0(false);
                    }
                    rVar3 = rVar4;
                    a(pVar, str, str2, rVar3, eVarC5, o0VarE, i25 & 8190, 0);
                    str6 = str7;
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    str6 = str5;
                }
                aVar4 = aVar3;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new l(pVar, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 1);
                }
            }
            i16 |= 12582912;
            aVar3 = aVar2;
            i25 = i16;
            if ((4793491 & i25) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i25 & 1, z14)) {
                if (i28 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                z3.e eVarC6 = null;
                if (i17 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i19 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar3;
                }
                p3.x1 x1Var6 = p3.n.f135158a;
                if (str3 != null) {
                    o0VarE.C(-1541766101);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1541766101);
                    o0VarE.g0(false);
                }
                rVar3 = rVar4;
                a(pVar, str, str2, rVar3, eVarC6, o0VarE, i25 & 8190, 0);
                str6 = str7;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                str6 = str5;
            }
            aVar4 = aVar3;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new l(pVar, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 1);
            }
        }
        i16 |= 1572864;
        str5 = str4;
        i19 = i15 & 128;
        if (i19 != 0) {
            if ((12582912 & i14) == 0) {
                aVar3 = aVar2;
                if (o0VarE.r(aVar3)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i16 |= i24;
            }
            i25 = i16;
            if ((4793491 & i25) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i25 & 1, z14)) {
                if (i28 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                z3.e eVarC7 = null;
                if (i17 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i19 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar3;
                }
                p3.x1 x1Var7 = p3.n.f135158a;
                if (str3 != null) {
                    o0VarE.C(-1541766101);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1541766101);
                    o0VarE.g0(false);
                }
                rVar3 = rVar4;
                a(pVar, str, str2, rVar3, eVarC7, o0VarE, i25 & 8190, 0);
                str6 = str7;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                str6 = str5;
            }
            aVar4 = aVar3;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new l(pVar, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 1);
            }
        }
        i16 |= 12582912;
        aVar3 = aVar2;
        i25 = i16;
        if ((4793491 & i25) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i25 & 1, z14)) {
            if (i28 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            z3.e eVarC8 = null;
            if (i17 != 0) {
                str7 = null;
            } else {
                str7 = str5;
            }
            if (i19 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar3;
            }
            p3.x1 x1Var8 = p3.n.f135158a;
            if (str3 != null) {
                o0VarE.C(-1541766101);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1541766101);
                o0VarE.g0(false);
            }
            rVar3 = rVar4;
            a(pVar, str, str2, rVar3, eVarC8, o0VarE, i25 & 8190, 0);
            str6 = str7;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            str6 = str5;
        }
        aVar4 = aVar3;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(pVar, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x009a, please report this as an issue */
    @SuppressLint({"ModifierParameter"})
    public static final void c(u4.d dVar, String str, String str2, h4.r rVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14, int i15) {
        int i16;
        String str3;
        int i17;
        h4.r rVar2;
        int i18;
        int i19;
        int i24;
        boolean z14;
        u4.d dVar2;
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        String str4;
        h4.r rVar3;
        p2 p2VarI0;
        String str5;
        h4.r rVar4;
        int i25;
        str2.getClass();
        p3.o0 o0VarE = mVar.E(-1257762873);
        int i26 = i15 & 1;
        if (i26 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i27 = i15 & 2;
        if (i27 == 0) {
            if ((i14 & 48) == 0) {
                str3 = str;
                i16 |= o0VarE.B(str3) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if (o0VarE.B(str2)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i16 |= i25;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    rVar2 = rVar;
                    if (o0VarE.B(rVar2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 16;
                if (i19 != 0) {
                    if ((i14 & 24576) == 0) {
                        if (o0VarE.r(pVar)) {
                            i24 = 16384;
                        } else {
                            i24 = 8192;
                        }
                        i16 |= i24;
                    }
                    if ((i16 & 9363) != 9362) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i16 & 1, z14)) {
                        if (i26 != 0) {
                            dVar2 = null;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i27 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i17 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        e23.p<? super p3.m, ? super Integer, Unit> pVar3 = i19 == 0 ? pVar : null;
                        p3.x1 x1Var = p3.n.f135158a;
                        a(e(dVar2, o0VarE), str5, str2, rVar4, pVar3, o0VarE, i16 & 65520, 0);
                        str4 = str5;
                        rVar3 = rVar4;
                        pVar2 = pVar3;
                    } else {
                        o0VarE.e();
                        dVar2 = dVar;
                        pVar2 = pVar;
                        str4 = str3;
                        rVar3 = rVar2;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new a42.a0(dVar2, str4, str2, rVar3, pVar2, i14, i15, 2);
                    }
                }
                i16 |= 24576;
                if ((i16 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i26 != 0) {
                        dVar2 = null;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i17 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i19 == 0) {
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    a(e(dVar2, o0VarE), str5, str2, rVar4, pVar3, o0VarE, i16 & 65520, 0);
                    str4 = str5;
                    rVar3 = rVar4;
                    pVar2 = pVar3;
                } else {
                    o0VarE.e();
                    dVar2 = dVar;
                    pVar2 = pVar;
                    str4 = str3;
                    rVar3 = rVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a42.a0(dVar2, str4, str2, rVar3, pVar2, i14, i15, 2);
                }
            }
            i16 |= 3072;
            rVar2 = rVar;
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((i14 & 24576) == 0) {
                    if (o0VarE.r(pVar)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i16 |= i24;
                }
                if ((i16 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i26 != 0) {
                        dVar2 = null;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i17 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i19 == 0) {
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                    a(e(dVar2, o0VarE), str5, str2, rVar4, pVar3, o0VarE, i16 & 65520, 0);
                    str4 = str5;
                    rVar3 = rVar4;
                    pVar2 = pVar3;
                } else {
                    o0VarE.e();
                    dVar2 = dVar;
                    pVar2 = pVar;
                    str4 = str3;
                    rVar3 = rVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a42.a0(dVar2, str4, str2, rVar3, pVar2, i14, i15, 2);
                }
            }
            i16 |= 24576;
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i26 != 0) {
                    dVar2 = null;
                } else {
                    dVar2 = dVar;
                }
                if (i27 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i17 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i19 == 0) {
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                a(e(dVar2, o0VarE), str5, str2, rVar4, pVar3, o0VarE, i16 & 65520, 0);
                str4 = str5;
                rVar3 = rVar4;
                pVar2 = pVar3;
            } else {
                o0VarE.e();
                dVar2 = dVar;
                pVar2 = pVar;
                str4 = str3;
                rVar3 = rVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a42.a0(dVar2, str4, str2, rVar3, pVar2, i14, i15, 2);
            }
        }
        i16 |= 48;
        str3 = str;
        if ((i14 & 384) == 0) {
            if (o0VarE.B(str2)) {
                i25 = 256;
            } else {
                i25 = 128;
            }
            i16 |= i25;
        }
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                rVar2 = rVar;
                if (o0VarE.B(rVar2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((i14 & 24576) == 0) {
                    if (o0VarE.r(pVar)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i16 |= i24;
                }
                if ((i16 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i26 != 0) {
                        dVar2 = null;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i27 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    if (i17 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i19 == 0) {
                    }
                    p3.x1 x1Var5 = p3.n.f135158a;
                    a(e(dVar2, o0VarE), str5, str2, rVar4, pVar3, o0VarE, i16 & 65520, 0);
                    str4 = str5;
                    rVar3 = rVar4;
                    pVar2 = pVar3;
                } else {
                    o0VarE.e();
                    dVar2 = dVar;
                    pVar2 = pVar;
                    str4 = str3;
                    rVar3 = rVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a42.a0(dVar2, str4, str2, rVar3, pVar2, i14, i15, 2);
                }
            }
            i16 |= 24576;
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i26 != 0) {
                    dVar2 = null;
                } else {
                    dVar2 = dVar;
                }
                if (i27 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i17 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i19 == 0) {
                }
                p3.x1 x1Var6 = p3.n.f135158a;
                a(e(dVar2, o0VarE), str5, str2, rVar4, pVar3, o0VarE, i16 & 65520, 0);
                str4 = str5;
                rVar3 = rVar4;
                pVar2 = pVar3;
            } else {
                o0VarE.e();
                dVar2 = dVar;
                pVar2 = pVar;
                str4 = str3;
                rVar3 = rVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a42.a0(dVar2, str4, str2, rVar3, pVar2, i14, i15, 2);
            }
        }
        i16 |= 3072;
        rVar2 = rVar;
        i19 = i15 & 16;
        if (i19 != 0) {
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(pVar)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i16 |= i24;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i26 != 0) {
                    dVar2 = null;
                } else {
                    dVar2 = dVar;
                }
                if (i27 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i17 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i19 == 0) {
                }
                p3.x1 x1Var7 = p3.n.f135158a;
                a(e(dVar2, o0VarE), str5, str2, rVar4, pVar3, o0VarE, i16 & 65520, 0);
                str4 = str5;
                rVar3 = rVar4;
                pVar2 = pVar3;
            } else {
                o0VarE.e();
                dVar2 = dVar;
                pVar2 = pVar;
                str4 = str3;
                rVar3 = rVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a42.a0(dVar2, str4, str2, rVar3, pVar2, i14, i15, 2);
            }
        }
        i16 |= 24576;
        if ((i16 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i26 != 0) {
                dVar2 = null;
            } else {
                dVar2 = dVar;
            }
            if (i27 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            if (i17 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i19 == 0) {
            }
            p3.x1 x1Var8 = p3.n.f135158a;
            a(e(dVar2, o0VarE), str5, str2, rVar4, pVar3, o0VarE, i16 & 65520, 0);
            str4 = str5;
            rVar3 = rVar4;
            pVar2 = pVar3;
        } else {
            o0VarE.e();
            dVar2 = dVar;
            pVar2 = pVar;
            str4 = str3;
            rVar3 = rVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.a0(dVar2, str4, str2, rVar3, pVar2, i14, i15, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b  */
    @SuppressLint({"ModifierParameter"})
    public static final void d(u4.d dVar, String str, String str2, h4.r rVar, String str3, e23.a<Unit> aVar, String str4, e23.a<Unit> aVar2, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        e23.a<Unit> aVar3;
        int i17;
        String str5;
        int i18;
        int i19;
        int i24;
        boolean z14;
        p3.o0 o0Var;
        u4.d dVar2;
        h4.r rVar3;
        String str6;
        e23.a<Unit> aVar4;
        p2 p2VarI0;
        u4.d dVar3;
        h4.r rVar4;
        String str7;
        e23.a<Unit> aVar5;
        int i25;
        int i26;
        str2.getClass();
        p3.o0 o0VarE = mVar.E(1501648552);
        int i27 = i15 & 1;
        if (i27 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str2) ? 256 : 128;
        }
        int i28 = i15 & 8;
        if (i28 == 0) {
            if ((i14 & 3072) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.B(str3)) {
                    i26 = 16384;
                } else {
                    i26 = 8192;
                }
                i16 |= i26;
            }
            if ((196608 & i14) == 0) {
                aVar3 = aVar;
                if (o0VarE.r(aVar3)) {
                    i25 = 131072;
                } else {
                    i25 = 65536;
                }
                i16 |= i25;
            } else {
                aVar3 = aVar;
            }
            i17 = i15 & 64;
            if (i17 != 0) {
                if ((1572864 & i14) == 0) {
                    str5 = str4;
                    if (o0VarE.B(str5)) {
                        i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i18 = 524288;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 128;
                if (i19 != 0) {
                    if ((12582912 & i14) == 0) {
                        if (o0VarE.r(aVar2)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i16 |= i24;
                    }
                    if ((i16 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i16 & 1, z14)) {
                        if (i27 != 0) {
                            dVar3 = null;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i28 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i17 != 0) {
                            str7 = null;
                        } else {
                            str7 = str5;
                        }
                        if (i19 != 0) {
                            aVar5 = null;
                        } else {
                            aVar5 = aVar2;
                        }
                        p3.x1 x1Var = p3.n.f135158a;
                        o0Var = o0VarE;
                        b(e(dVar3, o0VarE), str, str2, rVar4, str3, aVar3, str7, aVar5, o0Var, i16 & 33554416, 0);
                        dVar2 = dVar3;
                        rVar3 = rVar4;
                        str6 = str7;
                        aVar4 = aVar5;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        dVar2 = dVar;
                        rVar3 = rVar2;
                        str6 = str5;
                        aVar4 = aVar2;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new l(dVar2, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 0);
                    }
                }
                i16 |= 12582912;
                if ((i16 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i27 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i28 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i19 != 0) {
                        aVar5 = null;
                    } else {
                        aVar5 = aVar2;
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    o0Var = o0VarE;
                    b(e(dVar3, o0VarE), str, str2, rVar4, str3, aVar3, str7, aVar5, o0Var, i16 & 33554416, 0);
                    dVar2 = dVar3;
                    rVar3 = rVar4;
                    str6 = str7;
                    aVar4 = aVar5;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    dVar2 = dVar;
                    rVar3 = rVar2;
                    str6 = str5;
                    aVar4 = aVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new l(dVar2, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 0);
                }
            }
            i16 |= 1572864;
            str5 = str4;
            i19 = i15 & 128;
            if (i19 != 0) {
                if ((12582912 & i14) == 0) {
                    if (o0VarE.r(aVar2)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i16 |= i24;
                }
                if ((i16 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i27 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i28 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i19 != 0) {
                        aVar5 = null;
                    } else {
                        aVar5 = aVar2;
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                    o0Var = o0VarE;
                    b(e(dVar3, o0VarE), str, str2, rVar4, str3, aVar3, str7, aVar5, o0Var, i16 & 33554416, 0);
                    dVar2 = dVar3;
                    rVar3 = rVar4;
                    str6 = str7;
                    aVar4 = aVar5;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    dVar2 = dVar;
                    rVar3 = rVar2;
                    str6 = str5;
                    aVar4 = aVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new l(dVar2, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 0);
                }
            }
            i16 |= 12582912;
            if ((i16 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i27 != 0) {
                    dVar3 = null;
                } else {
                    dVar3 = dVar;
                }
                if (i28 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i19 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar2;
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                o0Var = o0VarE;
                b(e(dVar3, o0VarE), str, str2, rVar4, str3, aVar3, str7, aVar5, o0Var, i16 & 33554416, 0);
                dVar2 = dVar3;
                rVar3 = rVar4;
                str6 = str7;
                aVar4 = aVar5;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                dVar2 = dVar;
                rVar3 = rVar2;
                str6 = str5;
                aVar4 = aVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new l(dVar2, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 0);
            }
        }
        i16 |= 3072;
        rVar2 = rVar;
        if ((i14 & 24576) == 0) {
            if (o0VarE.B(str3)) {
                i26 = 16384;
            } else {
                i26 = 8192;
            }
            i16 |= i26;
        }
        if ((196608 & i14) == 0) {
            aVar3 = aVar;
            if (o0VarE.r(aVar3)) {
                i25 = 131072;
            } else {
                i25 = 65536;
            }
            i16 |= i25;
        } else {
            aVar3 = aVar;
        }
        i17 = i15 & 64;
        if (i17 != 0) {
            if ((1572864 & i14) == 0) {
                str5 = str4;
                if (o0VarE.B(str5)) {
                    i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
            i19 = i15 & 128;
            if (i19 != 0) {
                if ((12582912 & i14) == 0) {
                    if (o0VarE.r(aVar2)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i16 |= i24;
                }
                if ((i16 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i27 != 0) {
                        dVar3 = null;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i28 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i19 != 0) {
                        aVar5 = null;
                    } else {
                        aVar5 = aVar2;
                    }
                    p3.x1 x1Var5 = p3.n.f135158a;
                    o0Var = o0VarE;
                    b(e(dVar3, o0VarE), str, str2, rVar4, str3, aVar3, str7, aVar5, o0Var, i16 & 33554416, 0);
                    dVar2 = dVar3;
                    rVar3 = rVar4;
                    str6 = str7;
                    aVar4 = aVar5;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    dVar2 = dVar;
                    rVar3 = rVar2;
                    str6 = str5;
                    aVar4 = aVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new l(dVar2, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 0);
                }
            }
            i16 |= 12582912;
            if ((i16 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i27 != 0) {
                    dVar3 = null;
                } else {
                    dVar3 = dVar;
                }
                if (i28 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i19 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar2;
                }
                p3.x1 x1Var6 = p3.n.f135158a;
                o0Var = o0VarE;
                b(e(dVar3, o0VarE), str, str2, rVar4, str3, aVar3, str7, aVar5, o0Var, i16 & 33554416, 0);
                dVar2 = dVar3;
                rVar3 = rVar4;
                str6 = str7;
                aVar4 = aVar5;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                dVar2 = dVar;
                rVar3 = rVar2;
                str6 = str5;
                aVar4 = aVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new l(dVar2, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 0);
            }
        }
        i16 |= 1572864;
        str5 = str4;
        i19 = i15 & 128;
        if (i19 != 0) {
            if ((12582912 & i14) == 0) {
                if (o0VarE.r(aVar2)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i16 |= i24;
            }
            if ((i16 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i27 != 0) {
                    dVar3 = null;
                } else {
                    dVar3 = dVar;
                }
                if (i28 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i19 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar2;
                }
                p3.x1 x1Var7 = p3.n.f135158a;
                o0Var = o0VarE;
                b(e(dVar3, o0VarE), str, str2, rVar4, str3, aVar3, str7, aVar5, o0Var, i16 & 33554416, 0);
                dVar2 = dVar3;
                rVar3 = rVar4;
                str6 = str7;
                aVar4 = aVar5;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                dVar2 = dVar;
                rVar3 = rVar2;
                str6 = str5;
                aVar4 = aVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new l(dVar2, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 0);
            }
        }
        i16 |= 12582912;
        if ((i16 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i27 != 0) {
                dVar3 = null;
            } else {
                dVar3 = dVar;
            }
            if (i28 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i17 != 0) {
                str7 = null;
            } else {
                str7 = str5;
            }
            if (i19 != 0) {
                aVar5 = null;
            } else {
                aVar5 = aVar2;
            }
            p3.x1 x1Var8 = p3.n.f135158a;
            o0Var = o0VarE;
            b(e(dVar3, o0VarE), str, str2, rVar4, str3, aVar3, str7, aVar5, o0Var, i16 & 33554416, 0);
            dVar2 = dVar3;
            rVar3 = rVar4;
            str6 = str7;
            aVar4 = aVar5;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            dVar2 = dVar;
            rVar3 = rVar2;
            str6 = str5;
            aVar4 = aVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(dVar2, str, str2, rVar3, str3, aVar, str6, aVar4, i14, i15, 0);
        }
    }

    public static final z3.e e(u4.d dVar, p3.m mVar) {
        mVar.C(37058010);
        p3.x1 x1Var = p3.n.f135158a;
        if (dVar == null) {
            mVar.f();
            return null;
        }
        z3.e eVarC = z3.f.c(-55340195, new k(dVar, 0), mVar);
        mVar.f();
        return eVarC;
    }
}
