package qx1;

import c2.b0;
import c2.s2;
import c2.u2;
import c2.z;
import h4.r;
import h5.e0;
import i3.mh;
import i3.p7;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import p5.v;
import qw0.y;

/* JADX INFO: loaded from: classes10.dex */
public final class q {
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x010a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0111  */
    /* JADX WARN: Code duplicated, block: B:64:0x0115  */
    /* JADX WARN: Code duplicated, block: B:67:0x012a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0138  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:73:0x0175  */
    /* JADX WARN: Code duplicated, block: B:76:0x019f  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:87:0x0236  */
    /* JADX WARN: Code duplicated, block: B:88:0x0264  */
    /* JADX WARN: Code duplicated, block: B:90:0x0274  */
    /* JADX WARN: Code duplicated, block: B:92:0x0278  */
    /* JADX WARN: Code duplicated, block: B:94:0x027e  */
    /* JADX WARN: Code duplicated, block: B:97:0x028a  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void a(dy1.h hVar, e23.p<? super String, ? super Boolean, Unit> pVar, e23.l<? super String, Unit> lVar, p3.m mVar, int i14, int i15) {
        int i16;
        e23.p pVar2;
        int i17;
        e23.l<? super String, Unit> lVar2;
        int i18;
        int i19;
        boolean z14;
        o0 o0Var;
        e23.p pVar3;
        e23.l<? super String, Unit> lVar3;
        p2 p2VarI0;
        p3.m.a aVar;
        e23.p pVar4;
        r.a aVar2;
        boolean z15;
        Object objQ;
        s2 s2VarF;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar3;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        e23.l<? super String, Unit> lVar4;
        Object objQ2;
        Object objQ3;
        hVar.getClass();
        o0 o0VarE = mVar.E(1458611395);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(hVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i24 = i15 & 2;
        if (i24 == 0) {
            if ((i14 & 48) == 0) {
                pVar2 = pVar;
                i16 |= o0VarE.r(pVar2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    lVar2 = lVar;
                    if (o0VarE.r(lVar2)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                i19 = 0;
                if ((i16 & 147) != 146) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    aVar = p3.m.f135153a;
                    if (i24 != 0) {
                        objQ3 = o0VarE.q();
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new p(0);
                            o0VarE.K(objQ3);
                        }
                        pVar4 = (e23.p) objQ3;
                    } else {
                        pVar4 = pVar2;
                    }
                    if (i17 != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new qv1.l(6);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                    }
                    x1 x1Var = p3.n.f135158a;
                    aVar2 = r.S;
                    if ((i16 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objQ = o0VarE.q();
                    if (z15) {
                        objQ = new y(hVar, 1);
                        o0VarE.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new y(hVar, 1);
                            o0VarE.K(objQ);
                        }
                    }
                    r rVarE = u1.n.e(v.c((e23.l) objQ, aVar2, true), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    r rVarY = c2.l.y(rVarE, eVar2.f97920e);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar3 = h4.d.a.f81534l;
                    c2.j jVar = c2.j.f22691a;
                    bVar2.getClass();
                    s2VarF = hb.a.f(jVar, eVar2.f97920e, bVar3, o0VarE, 48);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarY, o0VarE);
                    h5.g.V.getClass();
                    aVar3 = h5.g.a.f81805b;
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    eVar = h5.g.a.f81810g;
                    b4.c(eVar, s2VarF, o0VarE);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    u2 u2Var = u2.f22900a;
                    if (hVar.f61560e) {
                        o0VarE.C(135742365);
                        y3 y3Var = p7.f89282d;
                        g6.f.f75994b.getClass();
                        p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(-1814284828, new q72.f(10, hVar, pVar4), o0VarE), o0VarE, 56);
                        i19 = 0;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(136393923);
                        o0VarE.g0(false);
                    }
                    r rVarA = u2Var.a(aVar2, 1.0f, true);
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, i19);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarA, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    b0 b0Var = b0.f22601a;
                    String str = hVar.f61563h;
                    j92.f fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    e23.p pVar5 = pVar4;
                    lVar4 = lVar2;
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
                    String str2 = hVar.f61564i;
                    fVar2.getClass();
                    mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                    o0Var = o0VarE;
                    o0Var.g0(true);
                    if (hVar.f61562g) {
                        o0Var.C(136777238);
                        y3 y3Var2 = p7.f89282d;
                        g6.f.f75994b.getClass();
                        p3.v.a(y3Var2.c(g6.f.a(g6.f.f75996d)), z3.f.c(-711822067, new g(lVar4, hVar, 2), o0Var), o0Var, 56);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(137312515);
                        o0Var.g0(false);
                    }
                    o0Var.g0(true);
                    pVar3 = pVar5;
                    lVar3 = lVar4;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    pVar3 = pVar2;
                    lVar3 = lVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new an1.d(hVar, pVar3, lVar3, i14, i15, 22);
                }
            }
            i16 |= 384;
            lVar2 = lVar;
            i19 = 0;
            if ((i16 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                aVar = p3.m.f135153a;
                if (i24 != 0) {
                    objQ3 = o0VarE.q();
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new p(0);
                        o0VarE.K(objQ3);
                    }
                    pVar4 = (e23.p) objQ3;
                } else {
                    pVar4 = pVar2;
                }
                if (i17 != 0) {
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new qv1.l(6);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                }
                x1 x1Var2 = p3.n.f135158a;
                aVar2 = r.S;
                if ((i16 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ = o0VarE.q();
                if (z15) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new y(hVar, 1);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new y(hVar, 1);
                    o0VarE.K(objQ);
                }
                r rVarE2 = u1.n.e(v.c((e23.l) objQ, aVar2, true), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar3 = j92.b.f97899b;
                r rVarY2 = c2.l.y(rVarE2, eVar3.f97920e);
                h4.d.f81522a.getClass();
                h4.g.b bVar5 = h4.d.a.f81534l;
                c2.j jVar2 = c2.j.f22691a;
                bVar4.getClass();
                s2VarF = hb.a.f(jVar2, eVar3.f97920e, bVar5, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarY2, o0VarE);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, s2VarF, o0VarE);
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
                u2 u2Var2 = u2.f22900a;
                if (hVar.f61560e) {
                    o0VarE.C(135742365);
                    y3 y3Var3 = p7.f89282d;
                    g6.f.f75994b.getClass();
                    p3.v.a(y3Var3.c(g6.f.a(g6.f.f75996d)), z3.f.c(-1814284828, new q72.f(10, hVar, pVar4), o0VarE), o0VarE, 56);
                    i19 = 0;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(136393923);
                    o0VarE.g0(false);
                }
                r rVarA2 = u2Var2.a(aVar2, 1.0f, true);
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, i19);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarA2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var2 = b0.f22601a;
                String str3 = hVar.f61563h;
                j92.f fVar3 = d92.b.f58624b;
                fVar3.getClass();
                e23.p pVar6 = pVar4;
                lVar4 = lVar2;
                mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
                String str4 = hVar.f61564i;
                fVar3.getClass();
                mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                o0Var = o0VarE;
                o0Var.g0(true);
                if (hVar.f61562g) {
                    o0Var.C(136777238);
                    y3 y3Var4 = p7.f89282d;
                    g6.f.f75994b.getClass();
                    p3.v.a(y3Var4.c(g6.f.a(g6.f.f75996d)), z3.f.c(-711822067, new g(lVar4, hVar, 2), o0Var), o0Var, 56);
                    o0Var.g0(false);
                } else {
                    o0Var.C(137312515);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                pVar3 = pVar6;
                lVar3 = lVar4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                pVar3 = pVar2;
                lVar3 = lVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new an1.d(hVar, pVar3, lVar3, i14, i15, 22);
            }
        }
        i16 |= 48;
        pVar2 = pVar;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                lVar2 = lVar;
                if (o0VarE.r(lVar2)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            i19 = 0;
            if ((i16 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                aVar = p3.m.f135153a;
                if (i24 != 0) {
                    objQ3 = o0VarE.q();
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new p(0);
                        o0VarE.K(objQ3);
                    }
                    pVar4 = (e23.p) objQ3;
                } else {
                    pVar4 = pVar2;
                }
                if (i17 != 0) {
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new qv1.l(6);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                }
                x1 x1Var3 = p3.n.f135158a;
                aVar2 = r.S;
                if ((i16 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ = o0VarE.q();
                if (z15) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new y(hVar, 1);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new y(hVar, 1);
                    o0VarE.K(objQ);
                }
                r rVarE3 = u1.n.e(v.c((e23.l) objQ, aVar2, true), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
                j92.b bVar6 = d92.b.f58625c;
                bVar6.getClass();
                j92.e eVar4 = j92.b.f97899b;
                r rVarY3 = c2.l.y(rVarE3, eVar4.f97920e);
                h4.d.f81522a.getClass();
                h4.g.b bVar7 = h4.d.a.f81534l;
                c2.j jVar3 = c2.j.f22691a;
                bVar6.getClass();
                s2VarF = hb.a.f(jVar3, eVar4.f97920e, bVar7, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarY3, o0VarE);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, s2VarF, o0VarE);
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
                u2 u2Var3 = u2.f22900a;
                if (hVar.f61560e) {
                    o0VarE.C(135742365);
                    y3 y3Var5 = p7.f89282d;
                    g6.f.f75994b.getClass();
                    p3.v.a(y3Var5.c(g6.f.a(g6.f.f75996d)), z3.f.c(-1814284828, new q72.f(10, hVar, pVar4), o0VarE), o0VarE, 56);
                    i19 = 0;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(136393923);
                    o0VarE.g0(false);
                }
                r rVarA3 = u2Var3.a(aVar2, 1.0f, true);
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, i19);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarA3, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var3 = b0.f22601a;
                String str5 = hVar.f61563h;
                j92.f fVar4 = d92.b.f58624b;
                fVar4.getClass();
                e23.p pVar7 = pVar4;
                lVar4 = lVar2;
                mh.c(str5, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
                String str6 = hVar.f61564i;
                fVar4.getClass();
                mh.c(str6, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                o0Var = o0VarE;
                o0Var.g0(true);
                if (hVar.f61562g) {
                    o0Var.C(136777238);
                    y3 y3Var6 = p7.f89282d;
                    g6.f.f75994b.getClass();
                    p3.v.a(y3Var6.c(g6.f.a(g6.f.f75996d)), z3.f.c(-711822067, new g(lVar4, hVar, 2), o0Var), o0Var, 56);
                    o0Var.g0(false);
                } else {
                    o0Var.C(137312515);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                pVar3 = pVar7;
                lVar3 = lVar4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                pVar3 = pVar2;
                lVar3 = lVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new an1.d(hVar, pVar3, lVar3, i14, i15, 22);
            }
        }
        i16 |= 384;
        lVar2 = lVar;
        i19 = 0;
        if ((i16 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            aVar = p3.m.f135153a;
            if (i24 != 0) {
                objQ3 = o0VarE.q();
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new p(0);
                    o0VarE.K(objQ3);
                }
                pVar4 = (e23.p) objQ3;
            } else {
                pVar4 = pVar2;
            }
            if (i17 != 0) {
                objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new qv1.l(6);
                    o0VarE.K(objQ2);
                }
                lVar2 = (e23.l) objQ2;
            }
            x1 x1Var4 = p3.n.f135158a;
            aVar2 = r.S;
            if ((i16 & 14) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            objQ = o0VarE.q();
            if (z15) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new y(hVar, 1);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new y(hVar, 1);
                o0VarE.K(objQ);
            }
            r rVarE4 = u1.n.e(v.c((e23.l) objQ, aVar2, true), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar8 = d92.b.f58625c;
            bVar8.getClass();
            j92.e eVar5 = j92.b.f97899b;
            r rVarY4 = c2.l.y(rVarE4, eVar5.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar9 = h4.d.a.f81534l;
            c2.j jVar4 = c2.j.f22691a;
            bVar8.getClass();
            s2VarF = hb.a.f(jVar4, eVar5.f97920e, bVar9, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarY4, o0VarE);
            h5.g.V.getClass();
            aVar3 = h5.g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarF, o0VarE);
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
            u2 u2Var4 = u2.f22900a;
            if (hVar.f61560e) {
                o0VarE.C(135742365);
                y3 y3Var7 = p7.f89282d;
                g6.f.f75994b.getClass();
                p3.v.a(y3Var7.c(g6.f.a(g6.f.f75996d)), z3.f.c(-1814284828, new q72.f(10, hVar, pVar4), o0VarE), o0VarE, 56);
                i19 = 0;
                o0VarE.g0(false);
            } else {
                o0VarE.C(136393923);
                o0VarE.g0(false);
            }
            r rVarA4 = u2Var4.a(aVar2, 1.0f, true);
            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, i19);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarA4, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var4 = b0.f22601a;
            String str7 = hVar.f61563h;
            j92.f fVar5 = d92.b.f58624b;
            fVar5.getClass();
            e23.p pVar8 = pVar4;
            lVar4 = lVar2;
            mh.c(str7, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
            String str8 = hVar.f61564i;
            fVar5.getClass();
            mh.c(str8, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
            if (hVar.f61562g) {
                o0Var.C(136777238);
                y3 y3Var8 = p7.f89282d;
                g6.f.f75994b.getClass();
                p3.v.a(y3Var8.c(g6.f.a(g6.f.f75996d)), z3.f.c(-711822067, new g(lVar4, hVar, 2), o0Var), o0Var, 56);
                o0Var.g0(false);
            } else {
                o0Var.C(137312515);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            pVar3 = pVar8;
            lVar3 = lVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            pVar3 = pVar2;
            lVar3 = lVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(hVar, pVar3, lVar3, i14, i15, 22);
        }
    }
}
