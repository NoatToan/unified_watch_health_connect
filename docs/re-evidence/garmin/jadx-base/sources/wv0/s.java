package wv0;

import b82.b2;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e2.i0;
import e2.k0;
import f5.z0;
import h5.e0;
import i3.e5;
import i3.i7;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import l72.j0;
import o4.d0;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import v62.k5;
import v62.s6;
import vd0.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class s {
    /* JADX WARN: Code duplicated, block: B:110:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0141  */
    /* JADX WARN: Code duplicated, block: B:112:0x0146  */
    /* JADX WARN: Code duplicated, block: B:122:0x016d  */
    /* JADX WARN: Code duplicated, block: B:127:0x017a  */
    public static final void a(String str, Integer num, String str2, i53.c cVar, Integer num2, mc mcVar, e23.l lVar, e23.a aVar, e23.a aVar2, e23.l lVar2, p3.m mVar, int i14, int i15) {
        int i16;
        i53.c cVar2;
        Integer num3;
        mc mcVar2;
        e23.a aVar3;
        int i17;
        o0 o0Var;
        int iIntValue;
        boolean z14;
        str.getClass();
        aVar2.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(1728629930);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(num) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.k(1) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.k(25) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(str2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            cVar2 = cVar;
            i16 |= o0VarE.B(cVar2) ? 131072 : 65536;
        } else {
            cVar2 = cVar;
        }
        if ((1572864 & i14) == 0) {
            num3 = num2;
            i16 |= o0VarE.B(num3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            num3 = num2;
        }
        if ((12582912 & i14) == 0) {
            mcVar2 = mcVar;
            i16 |= o0VarE.B(mcVar2) ? 8388608 : 4194304;
        } else {
            mcVar2 = mcVar;
        }
        if ((100663296 & i14) == 0) {
            i16 |= o0VarE.r(lVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            aVar3 = aVar;
            i16 |= o0VarE.r(aVar3) ? 536870912 : 268435456;
        } else {
            aVar3 = aVar;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.r(aVar2) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.r(lVar2) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 19) == 18) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            int i18 = i16 & 112;
            boolean z15 = i18 == 32;
            int i19 = i16;
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (z15) {
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
                objQ = e5.o(iIntValue, o0VarE);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 1;
                    }
                    objQ = e5.o(iIntValue, o0VarE);
                }
            }
            n1 n1Var = (n1) objQ;
            boolean zK = o0VarE.k(n1Var.getIntValue()) | (i18 == 32);
            Object objQ2 = o0VarE.q();
            if (zK) {
                int intValue = n1Var.getIntValue();
                if (num == null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ2 = hb.a.n(z14, o0VarE);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    int intValue2 = n1Var.getIntValue();
                    if (num == null && num.intValue() == intValue2) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    objQ2 = hb.a.n(z14, o0VarE);
                }
            }
            o0Var = o0VarE;
            l72.w.f111301a.e(z3.f.c(-130547952, new f0((Object) aVar2, (Object) lVar2, (Object) n1Var, (p1) objQ2, 3), o0VarE), null, aVar2, mcVar2, false, null, z3.f.c(1460724735, new bv0.e(str, n1Var, str2, cVar2, num3, lVar, aVar3), o0VarE), o0Var, ((i17 << 6) & 896) | 12582918 | ((i19 >> 12) & 7168), 114);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k11.j(str, num, str2, cVar, num2, mcVar, lVar, aVar, aVar2, lVar2, i14, i15, 3);
        }
    }

    public static final void b(String str, int i14, Integer num, h4.r rVar, e23.l lVar, p3.m mVar, int i15) {
        o0 o0Var;
        o0 o0VarE = mVar.E(2099933665);
        int i16 = i15 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(1) ? 256 : 128) | (o0VarE.B(num) ? 2048 : 1024) | (o0VarE.B(rVar) ? 16384 : 8192);
        if ((i15 & 196608) == 0) {
            i16 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            h4.r.a aVar = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            o0Var = o0VarE;
            mh.c(str, c2.l.A(aVar, eVar.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var, i16 & 14, 0, 131068);
            bVar.getClass();
            int i17 = i16 >> 3;
            c(c2.l.y(aVar, eVar.f97920e).then(rVar), 1, num, i14, lVar, o0Var, ((i16 << 6) & 7168) | (i17 & 1008) | (i17 & 57344));
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.f0(str, i14, num, rVar, lVar, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:112:0x025a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0281  */
    /* JADX WARN: Code duplicated, block: B:117:0x0288  */
    /* JADX WARN: Code duplicated, block: B:118:0x028e  */
    /* JADX WARN: Code duplicated, block: B:121:0x029d  */
    /* JADX WARN: Code duplicated, block: B:123:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:126:0x0301  */
    /* JADX WARN: Code duplicated, block: B:129:0x030d  */
    /* JADX WARN: Code duplicated, block: B:130:0x030f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0314  */
    /* JADX WARN: Code duplicated, block: B:135:0x031a  */
    /* JADX WARN: Code duplicated, block: B:141:0x032a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x0330  */
    /* JADX WARN: Code duplicated, block: B:147:0x035f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0364  */
    /* JADX WARN: Code duplicated, block: B:152:0x0375  */
    /* JADX WARN: Code duplicated, block: B:153:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:155:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:157:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x013b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0142  */
    /* JADX WARN: Code duplicated, block: B:78:0x0146  */
    /* JADX WARN: Code duplicated, block: B:83:0x0161  */
    /* JADX WARN: Code duplicated, block: B:86:0x0181  */
    /* JADX WARN: Code duplicated, block: B:89:0x0191  */
    /* JADX WARN: Code duplicated, block: B:90:0x0193  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ae A[PHI: r27
      0x01ae: PHI (r27v6 h5.g$a$g) = (r27v0 h5.g$a$g), (r27v7 h5.g$a$g) binds: [B:98:0x01ac, B:96:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void c(h4.r rVar, int i14, Integer num, int i15, e23.l lVar, p3.m mVar, int i16) {
        int i17;
        Integer num2;
        int i18;
        e23.l lVar2;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        j92.b bVar;
        j92.e eVar;
        float f14;
        h4.r.a aVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        j92.c cVar2;
        Object objQ;
        p3.m.a.C2565a c2565a;
        int i19;
        boolean z14;
        int i24;
        h5.g.a.C1623g c1623g;
        boolean z15;
        boolean z16;
        Object objQ2;
        t62.b bVar2;
        int i25;
        float f15;
        h5.g.a.C1623g c1623g2;
        Object objQ3;
        z0 z0VarD;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        j92.f fVar2;
        Object objQ4;
        boolean z17;
        boolean z18;
        Object objQ5;
        boolean z19;
        float f16;
        o0 o0VarE = mVar.E(-517395334);
        p3.c<?> cVar3 = o0VarE.f135177b;
        if ((i16 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i17 |= o0VarE.B(num) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= o0VarE.k(i15) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i17 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i16 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            boolean z24 = i15 > i14;
            boolean z25 = num == null || i15 < num.intValue();
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g3 = h5.g.a.f81809f;
            b4.c(c1623g3, i2VarA2, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar3;
            } else {
                cVar = cVar3;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                b0 b0Var = b0.f22601a;
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                float f17 = eVar.f97920e;
                f14 = eVar.f97917b;
                c2.j.i iVarI = c2.j.i(f17);
                h4.g.b bVar4 = h4.d.a.f81534l;
                aVar = h4.r.S;
                s2VarA = q2.a(iVarI, bVar4, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar, o0VarE);
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
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g3, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                bVar.getClass();
                cVar2 = j92.b.f97901d;
                h4.r rVarQ = x2.q(aVar, cVar2.f97905d);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = kg.f.b(o0VarE);
                }
                a2.j jVar = (a2.j) objQ;
                i19 = 57344 & i17;
                if (i19 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                i24 = (i17 & 7168) ^ 3072;
                if (i24 > 2048 || !o0VarE.k(i15)) {
                    c1623g = c1623g3;
                    if ((i17 & 3072) != 2048) {
                        z15 = false;
                    }
                    z16 = z15 | z14;
                    objQ2 = o0VarE.q();
                    if (z16 || objQ2 == c2565a) {
                        objQ2 = new au0.m(lVar, i15, 20);
                        o0VarE.K(objQ2);
                    }
                    h4.r rVarB = u1.w.b(rVarQ, jVar, null, z24, null, null, (e23.a) objQ2, 24);
                    s62.a.f157643a.getClass();
                    bVar2 = t62.b.f162798a;
                    i25 = i17;
                    u4.d dVarA = k5.a(bVar2);
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_decrease_value);
                    long jS = hb.a.s(o0VarE);
                    if (z24) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.5f;
                    }
                    c1623g2 = c1623g;
                    i7.b(dVarA, strQ, rVarB, d0.c(f15, jS, 14), o0VarE, 0, 0);
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarR = x2.r(aVar, 60, 46);
                    bVar.getClass();
                    h4.r rVarB2 = l4.k.b(rVarR, k2.i.a(f14));
                    long jE = d92.b.a(o0VarE).j().e();
                    bVar.getClass();
                    h4.r rVarB3 = u1.q.b(1, jE, rVarB2, k2.i.a(f14));
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new wp.b(17);
                        o0VarE.K(objQ3);
                    }
                    h4.r rVarC4 = p5.v.c((e23.l) objQ3, rVarB3, true);
                    z0VarD = c2.q.d(h4.d.a.f81528f, false);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarC4, o0VarE);
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
                    b4.c(eVar2, z0VarD, o0VarE);
                    b4.c(c1623g2, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    String strValueOf = String.valueOf(i15);
                    fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    mh.c(strValueOf, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                    bVar.getClass();
                    h4.r rVarQ2 = x2.q(aVar, cVar2.f97905d);
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a) {
                        objQ4 = kg.f.b(o0VarE);
                    }
                    a2.j jVar2 = (a2.j) objQ4;
                    if (i19 == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i18 = i15;
                    z18 = ((i24 <= 2048 && o0VarE.k(i18)) || (i25 & 3072) == 2048) | z17;
                    objQ5 = o0VarE.q();
                    if (!z18 || objQ5 == c2565a) {
                        lVar2 = lVar;
                        objQ5 = new au0.m(lVar2, i18, 21);
                        o0VarE.K(objQ5);
                    } else {
                        lVar2 = lVar;
                    }
                    z19 = z25;
                    h4.r rVarB4 = u1.w.b(rVarQ2, jVar2, null, z19, null, null, (e23.a) objQ5, 24);
                    u4.d dVarA2 = s6.a(bVar2);
                    String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_increase_value);
                    long jS2 = hb.a.s(o0VarE);
                    if (z19) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.5f;
                    }
                    i7.b(dVarA2, strQ2, rVarB4, d0.c(f16, jS2, 14), o0VarE, 0, 0);
                    o0VarE.g0(true);
                    if (num != null) {
                        o0VarE.C(1725239776);
                        num2 = num;
                        String strP = gl1.y.P(R.string.lbl_enter_interval, new Object[]{Integer.valueOf(i14), num2}, o0VarE);
                        fVar2.getClass();
                        x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                        bVar.getClass();
                        mh.c(strP, c2.l.C(aVar, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        num2 = num;
                        o0VarE.C(1725482258);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                } else {
                    c1623g = c1623g3;
                }
                z15 = true;
                z16 = z15 | z14;
                objQ2 = o0VarE.q();
                if (z16) {
                    objQ2 = new au0.m(lVar, i15, 20);
                    o0VarE.K(objQ2);
                } else {
                    objQ2 = new au0.m(lVar, i15, 20);
                    o0VarE.K(objQ2);
                }
                h4.r rVarB5 = u1.w.b(rVarQ, jVar, null, z24, null, null, (e23.a) objQ2, 24);
                s62.a.f157643a.getClass();
                bVar2 = t62.b.f162798a;
                i25 = i17;
                u4.d dVarA3 = k5.a(bVar2);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_decrease_value);
                long jS3 = hb.a.s(o0VarE);
                if (z24) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.5f;
                }
                c1623g2 = c1623g;
                i7.b(dVarA3, strQ3, rVarB5, d0.c(f15, jS3, 14), o0VarE, 0, 0);
                g6.f.a aVar5 = g6.f.f75994b;
                h4.r rVarR2 = x2.r(aVar, 60, 46);
                bVar.getClass();
                h4.r rVarB6 = l4.k.b(rVarR2, k2.i.a(f14));
                long jE2 = d92.b.a(o0VarE).j().e();
                bVar.getClass();
                h4.r rVarB7 = u1.q.b(1, jE2, rVarB6, k2.i.a(f14));
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new wp.b(17);
                    o0VarE.K(objQ3);
                }
                h4.r rVarC5 = p5.v.c((e23.l) objQ3, rVarB7, true);
                z0VarD = c2.q.d(h4.d.a.f81528f, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC5, o0VarE);
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
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g2, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar2 = c2.u.f22885a;
                String strValueOf2 = String.valueOf(i15);
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                mh.c(strValueOf2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                bVar.getClass();
                h4.r rVarQ3 = x2.q(aVar, cVar2.f97905d);
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = kg.f.b(o0VarE);
                }
                a2.j jVar3 = (a2.j) objQ4;
                if (i19 == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i18 = i15;
                z18 = ((i24 <= 2048 && o0VarE.k(i18)) || (i25 & 3072) == 2048) | z17;
                objQ5 = o0VarE.q();
                if (z18) {
                    lVar2 = lVar;
                    objQ5 = new au0.m(lVar2, i18, 21);
                    o0VarE.K(objQ5);
                } else {
                    lVar2 = lVar;
                    objQ5 = new au0.m(lVar2, i18, 21);
                    o0VarE.K(objQ5);
                }
                z19 = z25;
                h4.r rVarB8 = u1.w.b(rVarQ3, jVar3, null, z19, null, null, (e23.a) objQ5, 24);
                u4.d dVarA4 = s6.a(bVar2);
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_increase_value);
                long jS4 = hb.a.s(o0VarE);
                if (z19) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.5f;
                }
                i7.b(dVarA4, strQ4, rVarB8, d0.c(f16, jS4, 14), o0VarE, 0, 0);
                o0VarE.g0(true);
                if (num != null) {
                    o0VarE.C(1725239776);
                    num2 = num;
                    String strP2 = gl1.y.P(R.string.lbl_enter_interval, new Object[]{Integer.valueOf(i14), num2}, o0VarE);
                    fVar2.getClass();
                    x0 x0VarF2 = d92.c.f(j92.f.f97933j, o0VarE);
                    bVar.getClass();
                    mh.c(strP2, c2.l.C(aVar, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    num2 = num;
                    o0VarE.C(1725482258);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var2 = b0.f22601a;
            d92.b.f58623a.getClass();
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            float f18 = eVar.f97920e;
            f14 = eVar.f97917b;
            c2.j.i iVarI2 = c2.j.i(f18);
            h4.g.b bVar5 = h4.d.a.f81534l;
            aVar = h4.r.S;
            s2VarA = q2.a(iVarI2, bVar5, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar, o0VarE);
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
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g3, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            bVar.getClass();
            cVar2 = j92.b.f97901d;
            h4.r rVarQ4 = x2.q(aVar, cVar2.f97905d);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = kg.f.b(o0VarE);
            }
            a2.j jVar4 = (a2.j) objQ;
            i19 = 57344 & i17;
            if (i19 == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            i24 = (i17 & 7168) ^ 3072;
            if (i24 > 2048) {
                c1623g = c1623g3;
                if ((i17 & 3072) != 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            } else {
                c1623g = c1623g3;
                if ((i17 & 3072) != 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            z16 = z15 | z14;
            objQ2 = o0VarE.q();
            if (z16) {
                objQ2 = new au0.m(lVar, i15, 20);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new au0.m(lVar, i15, 20);
                o0VarE.K(objQ2);
            }
            h4.r rVarB9 = u1.w.b(rVarQ4, jVar4, null, z24, null, null, (e23.a) objQ2, 24);
            s62.a.f157643a.getClass();
            bVar2 = t62.b.f162798a;
            i25 = i17;
            u4.d dVarA5 = k5.a(bVar2);
            String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_decrease_value);
            long jS5 = hb.a.s(o0VarE);
            if (z24) {
                f15 = 1.0f;
            } else {
                f15 = 0.5f;
            }
            c1623g2 = c1623g;
            i7.b(dVarA5, strQ5, rVarB9, d0.c(f15, jS5, 14), o0VarE, 0, 0);
            g6.f.a aVar6 = g6.f.f75994b;
            h4.r rVarR3 = x2.r(aVar, 60, 46);
            bVar.getClass();
            h4.r rVarB10 = l4.k.b(rVarR3, k2.i.a(f14));
            long jE3 = d92.b.a(o0VarE).j().e();
            bVar.getClass();
            h4.r rVarB11 = u1.q.b(1, jE3, rVarB10, k2.i.a(f14));
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new wp.b(17);
                o0VarE.K(objQ3);
            }
            h4.r rVarC6 = p5.v.c((e23.l) objQ3, rVarB11, true);
            z0VarD = c2.q.d(h4.d.a.f81528f, false);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarC6, o0VarE);
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
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g2, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar3 = c2.u.f22885a;
            String strValueOf3 = String.valueOf(i15);
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(strValueOf3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            bVar.getClass();
            h4.r rVarQ5 = x2.q(aVar, cVar2.f97905d);
            objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = kg.f.b(o0VarE);
            }
            a2.j jVar5 = (a2.j) objQ4;
            if (i19 == 16384) {
                z17 = true;
            } else {
                z17 = false;
            }
            i18 = i15;
            z18 = ((i24 <= 2048 && o0VarE.k(i18)) || (i25 & 3072) == 2048) | z17;
            objQ5 = o0VarE.q();
            if (z18) {
                lVar2 = lVar;
                objQ5 = new au0.m(lVar2, i18, 21);
                o0VarE.K(objQ5);
            } else {
                lVar2 = lVar;
                objQ5 = new au0.m(lVar2, i18, 21);
                o0VarE.K(objQ5);
            }
            z19 = z25;
            h4.r rVarB12 = u1.w.b(rVarQ5, jVar5, null, z19, null, null, (e23.a) objQ5, 24);
            u4.d dVarA6 = s6.a(bVar2);
            String strQ6 = gl1.y.Q(o0VarE, R.string.lbl_increase_value);
            long jS6 = hb.a.s(o0VarE);
            if (z19) {
                f16 = 1.0f;
            } else {
                f16 = 0.5f;
            }
            i7.b(dVarA6, strQ6, rVarB12, d0.c(f16, jS6, 14), o0VarE, 0, 0);
            o0VarE.g0(true);
            if (num != null) {
                o0VarE.C(1725239776);
                num2 = num;
                String strP3 = gl1.y.P(R.string.lbl_enter_interval, new Object[]{Integer.valueOf(i14), num2}, o0VarE);
                fVar2.getClass();
                x0 x0VarF3 = d92.c.f(j92.f.f97933j, o0VarE);
                bVar.getClass();
                mh.c(strP3, c2.l.C(aVar, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF3, o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                num2 = num;
                o0VarE.C(1725482258);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            num2 = num;
            i18 = i15;
            lVar2 = lVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b2(rVar, i14, num2, i18, lVar2, i16, 3);
        }
    }

    public static final void d(String str, int i14, Integer num, e23.l lVar, String str2, i53.c cVar, Integer num2, e23.l lVar2, e23.a aVar, p3.m mVar, int i15) {
        float f14;
        boolean z14;
        boolean z15;
        o0 o0VarE = mVar.E(1024289044);
        int i16 = i15 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(1) ? 256 : 128) | (o0VarE.B(num) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.B(str2) ? 131072 : 65536) | (o0VarE.B(cVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(num2) ? 8388608 : 4194304) | (o0VarE.r(lVar2) ? 67108864 : 33554432) | (o0VarE.r(aVar) ? 536870912 : 268435456);
        if (o0VarE.n(i16 & 1, (306783379 & i16) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar2, 1.0f), am.j.A(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarE, 0.0f, eVar.f97920e, 1);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b(str, i14, num, b0.f22601a.b(aVar2, h4.d.a.f81537o), lVar, o0VarE, (i16 & 8190) | ((i16 << 3) & 458752));
            o0VarE = o0VarE;
            if (str2 == null || cVar == null || cVar.isEmpty() || num2 == null || lVar2 == null) {
                f14 = 1.0f;
                z14 = false;
                z15 = true;
                o0VarE.C(138831480);
                o0VarE.g0(false);
            } else {
                o0VarE.C(138595074);
                f14 = 1.0f;
                z14 = false;
                z15 = true;
                f(str2, cVar, num2.intValue(), lVar2, o0VarE, (i16 >> 15) & 8190);
                o0VarE.g0(false);
            }
            if (aVar == null) {
                o0VarE.C(138867408);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(138867409);
                l72.f0 f0Var = l72.f0.f110999a;
                h4.r rVarF = x2.f(aVar2, f14);
                bVar.getClass();
                float f15 = r21.f97920e;
                bVar.getClass();
                float f16 = r21.f97920e;
                bVar.getClass();
                f0Var.b(gl1.y.Q(o0VarE, R.string.pregnancy_delete_entry), c2.l.C(rVarF, f16, f15, eVar.f97920e, 0.0f, 8), false, aVar, o0VarE, 0, 4);
                o0VarE.g0(z14);
            }
            o0VarE.g0(z15);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.o(str, i14, num, lVar, str2, cVar, num2, lVar2, aVar, i15);
        }
    }

    public static final void e(t2 t2Var, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        boolean z15;
        o0 o0VarE = mVar.E(1163986387);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 32 : 16;
        } else {
            z15 = z14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            l72.f0 f0Var = l72.f0.f110999a;
            int i16 = i15 << 3;
            f0Var.k(gl1.y.Q(o0VarE, R.string.common_cancel), null, false, aVar, o0VarE, i16 & 7168, 6);
            h4.r rVarA = t2Var.a(h4.r.S, 1.0f, true);
            String strQ = gl1.y.Q(o0VarE, R.string.lte_add_details);
            d6.h.f57752b.getClass();
            int i17 = d6.h.f57755e;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            g02.c.a(strQ, rVarA, 0L, d6.h.a(i17), 0, false, 0, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), 0.0d, o0VarE, 0, 372);
            o0VarE = o0VarE;
            f0Var.k(gl1.y.Q(o0VarE, R.string.lbl_common_save), null, z15, aVar2, o0VarE, (i16 & 896) | (i15 & 7168), 2);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i((Object) t2Var, z14, (e23.a) aVar, (e23.a) aVar2, i14, 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0144  */
    public static final void f(String str, i53.c<String> cVar, int i14, e23.l<? super Integer, Unit> lVar, p3.m mVar, int i15) {
        o0 o0VarE = mVar.E(-193215525);
        int i16 = (i15 & 6) == 0 ? (o0VarE.B(str) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.B(cVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.k(i14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            h4.r.a aVar = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            float f14 = eVar.f97920e;
            bVar.getClass();
            mh.c(str, c2.l.C(rVarA, 0.0f, f14, 0.0f, eVar.f97918c, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i16 & 14, 0, 131068);
            o0VarE = o0VarE;
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            int i17 = 0;
            for (String str2 : cVar) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    p13.x.q();
                    throw null;
                }
                arrayList.add(new j0(str2, null, null, false, i17 == i14, 14, null));
                i17 = i18;
            }
            i53.c cVarE = i53.a.e(arrayList);
            f82.d dVar = new f82.d();
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            boolean z14 = (i16 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new r(lVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new r(lVar);
                    o0VarE.K(objQ);
                }
            }
            e82.a.b(cVarE, dVar, i0VarA, null, null, (e23.p) objQ, o0VarE, 0, 24);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(str, cVar, i14, lVar, i15);
        }
    }
}
