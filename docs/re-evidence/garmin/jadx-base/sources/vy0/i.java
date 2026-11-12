package vy0;

import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.i7;
import i3.mh;
import l72.c1;
import l72.y0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.d3;

/* JADX INFO: loaded from: classes9.dex */
public final class i {
    public static final void a(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1128424885);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            s62.a.f157643a.getClass();
            u4.d dVarA = d3.a(t62.b.f162798a);
            d92.b.f58623a.getClass();
            long jD = d92.b.a(o0VarE).f().d();
            h4.r.a aVar = h4.r.S;
            d92.b.f58625c.getClass();
            i7.b(dVarA, null, x2.q(aVar, j92.b.f97901d.f97904c), jD, o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vp1.a(i14, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(com.garmin.android.apps.connectmobile.userprofile.model.g gVar, p3.m mVar, int i14) {
        o0 o0Var;
        p1 p1Var;
        gVar.getClass();
        String str = gVar.f46858b;
        o0 o0VarE = mVar.E(-530388040);
        int i15 = 2;
        int i16 = ((i14 & 8) == 0 ? o0VarE.B(gVar) : o0VarE.r(gVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            l72.p2.f111205a.h(gl1.y.Q(o0VarE, R.string.lbl_account_administrator), str == null ? "" : str, null, null, null, false, false, z3.f.c(1157229835, new mh1.g(gVar, i15), o0VarE), z3.f.c(292976427, new sk0.c(p1Var2, 10), o0VarE), null, null, o0VarE, 113246208, 0, 1660);
            o0Var = o0VarE;
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0Var.C(395865622);
                c1 c1Var = c1.f110940a;
                String strQ = gl1.y.Q(o0Var, R.string.lbl_account_administrator);
                String strP = gl1.y.P(R.string.msg_account_administrator, new Object[]{str == null ? "" : str}, o0Var);
                String strQ2 = gl1.y.Q(o0Var, R.string.lbl_ok);
                Object objQ2 = o0Var.q();
                if (objQ2 == c2565a) {
                    p1Var = p1Var2;
                    objQ2 = new vd0.c(p1Var, 21);
                    o0Var.K(objQ2);
                } else {
                    p1Var = p1Var2;
                }
                e23.a<Unit> aVar = (e23.a) objQ2;
                Object objQ3 = o0Var.q();
                if (objQ3 == c2565a) {
                    objQ3 = new vd0.c(p1Var, 22);
                    o0Var.K(objQ3);
                }
                c1Var.a(true, strQ, strP, null, null, strQ2, false, false, aVar, null, (e23.a) objQ3, o0Var, 100663302, 6, 728);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(396346122);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(gVar, i14, 28);
        }
    }

    public static final void c(final c2.a0 a0Var, final String str, long j8, String str2, String str3, String str4, final e23.p pVar, final e23.p pVar2, boolean z14, final e23.a aVar, p3.m mVar, final int i14, final int i15) {
        final String str5;
        int i16;
        String str6;
        int i17;
        int i18;
        boolean z15;
        int i19;
        o0 o0Var;
        final String str7;
        final String str8;
        final String str9;
        final boolean z16;
        String str10;
        float f14;
        float f15;
        a0Var.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1968929548);
        final long jD = j8;
        int i24 = i14 | (o0VarE.B(str) ? 32 : 16) | (((i15 & 2) == 0 && o0VarE.l(jD)) ? 256 : 128);
        int i25 = i15 & 4;
        if (i25 != 0) {
            i16 = i24 | 3072;
            str5 = str2;
        } else {
            str5 = str2;
            i16 = i24 | (o0VarE.B(str5) ? 2048 : 1024);
        }
        int i26 = i15 & 8;
        if (i26 != 0) {
            i17 = i16 | 24576;
            str6 = str3;
        } else {
            str6 = str3;
            i17 = i16 | (o0VarE.B(str6) ? 16384 : 8192);
        }
        int i27 = 196608 | i17;
        int i28 = i15 & 32;
        if (i28 != 0) {
            i18 = i17 | 1769472;
        } else {
            i18 = i27 | (o0VarE.B(str4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        if ((i14 & 12582912) == 0) {
            i18 |= o0VarE.r(pVar) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i18 |= o0VarE.r(pVar2) ? 67108864 : 33554432;
        }
        int i29 = i15 & 256;
        if (i29 != 0) {
            i19 = i18 | C.ENCODING_PCM_32BIT;
            z15 = z14;
        } else {
            z15 = z14;
            i19 = i18 | (o0VarE.h(z15) ? 536870912 : 268435456);
        }
        int i30 = o0VarE.r(aVar) ? 4 : 2;
        if (o0VarE.n(i19 & 1, ((i19 & 306783377) == 306783376 && (i30 & 3) == 2) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if ((i15 & 2) != 0) {
                    jD = ds.e0.d(d92.b.f58623a, o0VarE);
                    i19 &= -897;
                }
                if (i25 != 0) {
                    str5 = null;
                }
                if (i26 != 0) {
                    str6 = null;
                }
                String str11 = i28 == 0 ? str4 : null;
                if (i29 != 0) {
                    str10 = str11;
                    z15 = true;
                } else {
                    str10 = str11;
                }
            } else {
                o0VarE.e();
                if ((i15 & 2) != 0) {
                    i19 &= -897;
                }
                str10 = str4;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            if (pVar != null) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f14 = j92.b.f97899b.f97920e;
            } else {
                f14 = 0;
                g6.f.a aVar2 = g6.f.f75994b;
            }
            if (pVar2 != null) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f15 = j92.b.f97899b.f97920e;
            } else {
                f15 = 0;
                g6.f.a aVar3 = g6.f.f75994b;
            }
            final float f16 = f14;
            final long j14 = jD;
            final float f17 = f15;
            final String str12 = str6;
            String str13 = str5;
            int i34 = i19 >> 18;
            boolean z17 = z15;
            l72.p2.f111205a.f(null, z3.f.c(727636556, new e23.q() { // from class: vy0.g
                /* JADX WARN: Code duplicated, block: B:23:0x007a  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    t2 t2Var = (t2) obj;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    t2Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                    }
                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        x1 x1Var2 = p3.n.f135158a;
                        e23.p pVar3 = pVar;
                        if (pVar3 == null) {
                            mVar2.C(1006174034);
                            mVar2.f();
                        } else {
                            v.h.D(mVar2, 171004559, pVar3, mVar2, 0);
                            Unit unit = Unit.INSTANCE;
                        }
                        h4.r.a aVar4 = h4.r.S;
                        h4.r rVarC = c2.l.C(t2Var.a(aVar4, 1.0f, true), f16, 0.0f, f17, 0.0f, 10);
                        String str14 = str12;
                        boolean zB = mVar2.B(str14);
                        Object objQ = mVar2.q();
                        if (zB) {
                            objQ = new u91.c(str14, 12);
                            mVar2.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new u91.c(str14, 12);
                                mVar2.K(objQ);
                            }
                        }
                        h4.r rVarC2 = p5.v.c((e23.l) objQ, rVarC, false);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC3 = h4.k.c(rVarC2, mVar2);
                        h5.g.V.getClass();
                        h5.e0.a aVar5 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar5);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar = h5.g.a.f81810g;
                        b4.c(eVar, zVarA, mVar2);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        h5.g.a.f fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC3, mVar2);
                        c2.b0 b0Var = c2.b0.f22601a;
                        h4.r rVarF = x2.f(aVar4, 1.0f);
                        s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar2, 48);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        h4.r rVarC4 = h4.k.c(rVarF, mVar2);
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar5);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, s2VarA, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC4, mVar2);
                        u2 u2Var = u2.f22900a;
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(str, null, j14, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, mVar2, 0, 0, 131066);
                        p3.m mVar3 = mVar2;
                        mVar3.C(1486257062);
                        mVar3.f();
                        mVar3.y();
                        String str15 = str5;
                        if (str15 == null) {
                            mVar3.C(1805589795);
                            mVar3.f();
                        } else {
                            mVar3.C(1805589796);
                            mh.c(str15, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar3), mVar3, 0, 0, 131070);
                            mVar3 = mVar3;
                            Unit unit2 = Unit.INSTANCE;
                            mVar3.f();
                        }
                        mVar3.y();
                        e23.p pVar4 = pVar2;
                        if (pVar4 == null) {
                            mVar3.C(1007478514);
                            mVar3.f();
                        } else {
                            v.h.D(mVar3, 171046639, pVar4, mVar3, 0);
                            Unit unit3 = Unit.INSTANCE;
                        }
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), null, z17, false, null, aVar, o0VarE, (i34 & 7168) | 48 | (3670016 & (i30 << 18)), 53);
            if (str10 == null) {
                o0VarE.C(-9686470);
                o0VarE.g0(false);
                o0Var = o0VarE;
            } else {
                o0VarE.C(-9686469);
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarA = c2.l.A(rVarF, eVar.f97920e, 0.0f, 2);
                bVar.getClass();
                h4.r rVarC = c2.l.C(rVarA, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                d92.b.f58624b.getClass();
                mh.c(str10, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, i34 & 14, 0, 131068);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
            str9 = str12;
            z16 = z17;
            str7 = str10;
            str8 = str13;
            jD = j14;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str7 = str4;
            str8 = str5;
            str9 = str6;
            z16 = z15;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: vy0.h
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i.c(a0Var, str, jD, str8, str9, str7, pVar, pVar2, z16, aVar, (p3.m) obj, p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void d(float f14, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1709138744);
        int i15 = (o0VarE.i(f14) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c2.l.f(x2.h(h4.r.S, f14), o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.o0(f14, i14, 7);
        }
    }

    public static final z3.e e(ty0.j jVar, boolean z14, p3.m mVar, int i14) {
        mVar.C(860929442);
        x1 x1Var = p3.n.f135158a;
        z3.e eVarC = null;
        if (jVar == null) {
            mVar.f();
            return null;
        }
        u4.d dVarK = jVar.k(z14);
        o4.d0 d0VarO = jVar.o(mVar);
        if (dVarK != null) {
            mVar.C(-1595389038);
            eVarC = z3.f.c(1716370560, new b82.r(dVarK, d0VarO), mVar);
            mVar.f();
        } else {
            mVar.C(-1595122996);
            mVar.f();
        }
        mVar.f();
        return eVarC;
    }
}
