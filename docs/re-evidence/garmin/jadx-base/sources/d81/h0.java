package d81;

import b82.g1;
import b82.k1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import g81.n0;
import i3.e5;
import i3.i7;
import i3.mh;
import m92.p0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n1;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.x0;
import u62.f3;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 {
    public static final void a(h4.r rVar, u4.d dVar, p3.m mVar, int i14) {
        int i15;
        h4.r rVar2;
        u4.d dVar2;
        rVar.getClass();
        o0 o0VarE = mVar.E(-1570664478);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            rVar2 = rVar;
            dVar2 = dVar;
            b82.n.c(dVar2, gl1.y.Q(o0VarE, R.string.msg_no_data_available), gl1.y.Q(o0VarE, R.string.lbl_no_stamina_data_available), rVar2, null, o0VarE, ((i15 >> 3) & 14) | ((i15 << 9) & 7168), 16);
        } else {
            rVar2 = rVar;
            dVar2 = dVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(rVar2, dVar2, i14, 20);
        }
    }

    public static final void b(g81.f fVar, u4.d dVar, int i14, p0 p0Var, e23.l lVar, e23.a aVar, p3.m mVar, int i15) {
        u4.d dVar2;
        h2.b bVar;
        int i16 = i14;
        lVar.getClass();
        o0 o0VarE = mVar.E(-503390931);
        int i17 = i15 | (o0VarE.r(fVar) ? 4 : 2) | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.k(i16) ? 256 : 128) | (o0VarE.r(p0Var) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = e5.o(i16, o0VarE);
            }
            n1 n1Var = (n1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new d4.h(5);
                o0VarE.K(objQ3);
            }
            h2.b bVarB = h2.o0.b(i16, (e23.a) objQ3, o0VarE, ((i17 >> 6) & 14) | 384, 2);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarD = x2.d(aVar2, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            if (fVar == null || (fVar.f76320a == null && fVar.f76321b == null)) {
                i16 = i14;
                o0VarE.C(-2082277701);
                h4.r rVarF = x2.f(aVar2, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                dVar2 = dVar;
                a(c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97919d, 0.0f, 0.0f, 13), dVar2, o0VarE, i17 & 112);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2084032425);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                g6.f.a aVar4 = g6.f.f75994b;
                h4.r rVarX = x2.x(x2.j(c2.l.y(aVar2, j92.b.f97899b.f97920e), 32, 0.0f, 2), null, 3);
                i53.f fVarA = i53.a.a(new g1(gl1.y.Q(o0VarE, R.string.lbl_time), null, null, null, 14, null), new g1(gl1.y.Q(o0VarE, R.string.lbl_distance), null, null, null, 14, null));
                int intValue = n1Var.getIntValue();
                boolean zR = ((i17 & 57344) == 16384) | o0VarE.r(b0Var) | o0VarE.B(bVarB);
                Object objQ4 = o0VarE.q();
                if (zR || objQ4 == c2565a) {
                    bVar = bVarB;
                    b0 b0Var3 = new b0(lVar, b0Var, bVar, n1Var, 1);
                    o0VarE.K(b0Var3);
                    objQ4 = b0Var3;
                } else {
                    bVar = bVarB;
                }
                k1.a(fVarA, intValue, rVarX, null, 0.0f, (e23.l) objQ4, o0VarE, 3072, 16);
                h2.b bVar3 = bVar;
                h2.u.a(bVar3, x2.f(aVar2, 1.0f), null, null, 0, 0.0f, null, null, false, null, null, null, null, z3.f.c(817939675, new aa2.r(fVar, 15, p0Var, aVar), o0VarE), o0VarE, 100663344, 24576, 16124);
                o0VarE = o0VarE;
                Integer numValueOf = Integer.valueOf(i14);
                boolean zB = o0VarE.B(bVar3) | ((i17 & 896) == 256);
                Object objQ5 = o0VarE.q();
                if (zB || objQ5 == c2565a) {
                    i16 = i14;
                    objQ5 = new g0(bVar3, i16, n1Var, null);
                    o0VarE.K(objQ5);
                } else {
                    i16 = i14;
                }
                l0.e((e23.p) objQ5, numValueOf, o0VarE);
                o0VarE.g0(false);
                dVar2 = dVar;
            }
            o0VarE.g0(true);
        } else {
            dVar2 = dVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.a0(fVar, dVar2, i16, p0Var, lVar, aVar, i15, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:41:0x0126  */
    /* JADX WARN: Code duplicated, block: B:43:0x012d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0131  */
    /* JADX WARN: Code duplicated, block: B:49:0x014c  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0209  */
    /* JADX WARN: Code duplicated, block: B:63:0x0210  */
    /* JADX WARN: Code duplicated, block: B:65:0x0216  */
    /* JADX WARN: Code duplicated, block: B:70:0x0234  */
    /* JADX WARN: Code duplicated, block: B:75:0x0271  */
    /* JADX WARN: Code duplicated, block: B:77:0x0283  */
    /* JADX WARN: Code duplicated, block: B:79:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:81:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:83:0x032d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0337  */
    /* JADX WARN: Code duplicated, block: B:87:0x034f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0353  */
    /* JADX WARN: Code duplicated, block: B:91:0x0357  */
    public static final void c(n0 n0Var, p0 p0Var, e23.a aVar, p3.m mVar, int i14) {
        p0 p0Var2;
        int i15;
        h5.g.a.f fVar;
        g81.o0 o0Var;
        g81.e eVar;
        c3 c3Var;
        float f14;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        j92.f fVar2;
        int i16;
        boolean z14;
        Object objQ;
        z0 z0VarD;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        float f15;
        boolean z15;
        h4.r.a aVar2;
        float f16;
        o0 o0VarE = mVar.E(1701625429);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.r(n0Var) ? 4 : 2) | (o0VarE.r(p0Var) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarD = x2.d(aVar3, 1.0f);
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f17 = eVar2.f97918c;
            float f18 = eVar2.f97920e;
            float f19 = eVar2.f97919d;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f17);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                i15 = i17;
            } else {
                i15 = i17;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                if (n0Var != null) {
                    o0Var = n0Var.f76379c;
                    eVar = n0Var.f76380d;
                    c3Var = n0Var.f76378b;
                    o0VarE.C(679805381);
                    h4.r rVarF = x2.f(aVar3, 1.0f);
                    bVar.getClass();
                    bVar.getClass();
                    bVar.getClass();
                    if (c3Var != null) {
                        bVar.getClass();
                        f14 = f18;
                    } else {
                        f14 = 0;
                        g6.f.a aVar5 = g6.f.f75994b;
                    }
                    h4.r rVarB = c2.l.B(rVarF, f19, f18, f19, f14);
                    s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81533k, o0VarE, 6);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarB, o0VarE);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar3, s2VarA, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    u2 u2Var = u2.f22900a;
                    String strT = gl1.d.T(n0Var.f76377a, o0VarE, 0);
                    fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    i16 = i15;
                    mh.c(strT, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, 0, 0, 131070);
                    o0VarE = o0VarE;
                    if ((i16 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objQ = o0VarE.q();
                    if (z14) {
                        objQ = new cw1.p0(aVar, 14);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new cw1.p0(aVar, 14);
                            o0VarE.K(objQ);
                        }
                    }
                    h4.r rVarD2 = u1.w.d(aVar3, false, null, null, (e23.a) objQ, 15);
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarD2, o0VarE);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar3, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    bVar.getClass();
                    i7.a(n5.c.a(R.drawable.help, o0VarE, 0), gl1.y.Q(o0VarE, R.string.lbl_help), x2.q(aVar3, j92.b.f97901d.f97905d), am.j.d(o0VarE), o0VarE, 0, 0);
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                    if (c3Var == null) {
                        o0VarE.C(680991750);
                        o0VarE.g0(false);
                        aVar2 = aVar3;
                        z15 = false;
                        f15 = f19;
                    } else {
                        o0VarE.C(680991751);
                        String strT2 = gl1.d.T(c3Var, o0VarE, 0);
                        fVar2.getClass();
                        x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
                        bVar.getClass();
                        f15 = f19;
                        h4.r rVarA = c2.l.A(aVar3, f15, 0.0f, 2);
                        bVar.getClass();
                        z15 = false;
                        aVar2 = aVar3;
                        mh.c(strT2, c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                        o0VarE = o0VarE;
                        Unit unit = Unit.INSTANCE;
                        o0VarE.g0(false);
                    }
                    if (eVar == null) {
                        o0VarE.C(681409661);
                        o0VarE.g0(z15);
                        p0Var2 = p0Var;
                        f16 = 1.0f;
                    } else {
                        o0VarE.C(681409662);
                        f16 = 1.0f;
                        g6.f.a aVar6 = g6.f.f75994b;
                        h4.r rVarH = x2.h(x2.f(aVar2, 1.0f), 350);
                        bVar.getClass();
                        p0Var2 = p0Var;
                        c81.m.b(c2.l.A(rVarH, f15, 0.0f, 2), eVar, p0Var2, o0VarE, (i16 << 3) & 896);
                        Unit unit2 = Unit.INSTANCE;
                        o0VarE.g0(z15);
                    }
                    if (o0Var == null) {
                        o0VarE.C(681830858);
                        o0VarE.g0(z15);
                    } else {
                        o0VarE.C(681830859);
                        i0.a(x2.f(aVar2, f16), o0Var, o0VarE, 6);
                        Unit unit3 = Unit.INSTANCE;
                        o0VarE.g0(z15);
                    }
                    o0VarE.g0(z15);
                } else {
                    p0Var2 = p0Var;
                    h4.r rVarC4 = c2.l.C(ds.e0.g(o0VarE, 682061964, aVar3, 1.0f, bVar), 0.0f, eVar2.f97919d, 0.0f, 0.0f, 13);
                    s62.a.f157643a.getClass();
                    a(rVarC4, f3.a(t62.a.f162797a), o0VarE, 0);
                    o0VarE.g0(false);
                    Unit unit4 = Unit.INSTANCE;
                }
                o0VarE.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            if (n0Var != null) {
                o0Var = n0Var.f76379c;
                eVar = n0Var.f76380d;
                c3Var = n0Var.f76378b;
                o0VarE.C(679805381);
                h4.r rVarF2 = x2.f(aVar3, 1.0f);
                bVar.getClass();
                bVar.getClass();
                bVar.getClass();
                if (c3Var != null) {
                    bVar.getClass();
                    f14 = f18;
                } else {
                    f14 = 0;
                    g6.f.a aVar7 = g6.f.f75994b;
                }
                h4.r rVarB2 = c2.l.B(rVarF2, f19, f18, f19, f14);
                s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81533k, o0VarE, 6);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarB2, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var2 = u2.f22900a;
                String strT3 = gl1.d.T(n0Var.f76377a, o0VarE, 0);
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                i16 = i15;
                mh.c(strT3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                if ((i16 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ = o0VarE.q();
                if (z14) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new cw1.p0(aVar, 14);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new cw1.p0(aVar, 14);
                    o0VarE.K(objQ);
                }
                h4.r rVarD3 = u1.w.d(aVar3, false, null, null, (e23.a) objQ, 15);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarD3, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar2 = c2.u.f22885a;
                bVar.getClass();
                i7.a(n5.c.a(R.drawable.help, o0VarE, 0), gl1.y.Q(o0VarE, R.string.lbl_help), x2.q(aVar3, j92.b.f97901d.f97905d), am.j.d(o0VarE), o0VarE, 0, 0);
                o0VarE.g0(true);
                o0VarE.g0(true);
                if (c3Var == null) {
                    o0VarE.C(680991750);
                    o0VarE.g0(false);
                    aVar2 = aVar3;
                    z15 = false;
                    f15 = f19;
                } else {
                    o0VarE.C(680991751);
                    String strT4 = gl1.d.T(c3Var, o0VarE, 0);
                    fVar2.getClass();
                    x0 x0VarF2 = d92.c.f(j92.f.f97932i, o0VarE);
                    bVar.getClass();
                    f15 = f19;
                    h4.r rVarA2 = c2.l.A(aVar3, f15, 0.0f, 2);
                    bVar.getClass();
                    z15 = false;
                    aVar2 = aVar3;
                    mh.c(strT4, c2.l.C(rVarA2, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    Unit unit5 = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                if (eVar == null) {
                    o0VarE.C(681409661);
                    o0VarE.g0(z15);
                    p0Var2 = p0Var;
                    f16 = 1.0f;
                } else {
                    o0VarE.C(681409662);
                    f16 = 1.0f;
                    g6.f.a aVar8 = g6.f.f75994b;
                    h4.r rVarH2 = x2.h(x2.f(aVar2, 1.0f), 350);
                    bVar.getClass();
                    p0Var2 = p0Var;
                    c81.m.b(c2.l.A(rVarH2, f15, 0.0f, 2), eVar, p0Var2, o0VarE, (i16 << 3) & 896);
                    Unit unit6 = Unit.INSTANCE;
                    o0VarE.g0(z15);
                }
                if (o0Var == null) {
                    o0VarE.C(681830858);
                    o0VarE.g0(z15);
                } else {
                    o0VarE.C(681830859);
                    i0.a(x2.f(aVar2, f16), o0Var, o0VarE, 6);
                    Unit unit7 = Unit.INSTANCE;
                    o0VarE.g0(z15);
                }
                o0VarE.g0(z15);
            } else {
                p0Var2 = p0Var;
                h4.r rVarC5 = c2.l.C(ds.e0.g(o0VarE, 682061964, aVar3, 1.0f, bVar), 0.0f, eVar2.f97919d, 0.0f, 0.0f, 13);
                s62.a.f157643a.getClass();
                a(rVarC5, f3.a(t62.a.f162797a), o0VarE, 0);
                o0VarE.g0(false);
                Unit unit8 = Unit.INSTANCE;
            }
            o0VarE.g0(true);
        } else {
            p0Var2 = p0Var;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c50.f(n0Var, p0Var2, aVar, i14, 22);
        }
    }
}
