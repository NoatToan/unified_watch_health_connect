package jy0;

import c2.x2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ew1.v1;
import i3.mh;
import i3.ye;
import l72.c1;
import l72.p2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, sy0.m mVar, boolean z14, boolean z15, boolean z16, e23.a aVar, e23.a aVar2, e23.l lVar, p3.m mVar2, int i14) {
        int i15;
        o0 o0Var;
        String strJ;
        p3.m.a.C2565a c2565a;
        p1 p1Var;
        boolean z17;
        boolean z18;
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar2.E(234284820);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(mVar == null ? -1 : mVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z15) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z16) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 8388608 : 4194304;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 4793491) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarD = x2.d(aVar3, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar4, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            float f15 = eVar.f97918c;
            h4.r rVarC2 = c2.l.C(aVar3, 0.0f, f14, 0.0f, 0.0f, 13);
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.U9);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
            d6.h.f57752b.getClass();
            int i17 = d6.h.f57755e;
            mh.c(strW, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            bVar2.getClass();
            float f16 = eVar.f97918c;
            bVar2.getClass();
            h4.r rVarC3 = c2.l.C(aVar3, 0.0f, f16, 0.0f, eVar.f97921f, 5);
            String strW2 = gl1.d.W(x0.V9);
            fVar.getClass();
            mh.c(strW2, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 130044);
            p2 p2Var = p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, R.string.title_course);
            if (str == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 869960560, R.string.pacepro_lbl_select_course, o0VarE, false);
            } else {
                o0VarE.C(869959878);
                o0VarE.g0(false);
                strJ = str;
            }
            e.f101684a.getClass();
            z3.e eVar2 = e.f101685b;
            boolean z19 = (i16 & 458752) == 131072;
            Object objQ2 = o0VarE.q();
            if (z19 || objQ2 == c2565a2) {
                objQ2 = new j22.d(aVar, 14);
                o0VarE.K(objQ2);
            }
            p2Var.h(strQ, strJ, null, null, null, false, false, null, eVar2, null, (e23.a) objQ2, o0VarE, 100663296, 0, 764);
            bVar2.getClass();
            h4.r rVarA = c2.l.A(aVar3, 0.0f, f15, 1);
            String strW3 = gl1.d.W(x0.L9);
            fVar.getClass();
            s5.x0 x0Var = j92.f.f97933j;
            mh.c(strW3, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            String strQ2 = gl1.y.Q(o0VarE, R.string.account_privacy);
            String strQ3 = gl1.y.Q(o0VarE, mVar.f161257b);
            z3.e eVar3 = e.f101686c;
            boolean z24 = (i16 & 3670016) == 1048576;
            Object objQ3 = o0VarE.q();
            if (z24 || objQ3 == c2565a2) {
                objQ3 = new j22.d(aVar2, 15);
                o0VarE.K(objQ3);
            }
            p2Var.h(strQ2, strQ3, null, null, null, false, false, null, eVar3, null, (e23.a) objQ3, o0VarE, 100663296, 0, 764);
            o0Var = o0VarE;
            if (z15) {
                o0Var.C(1200389697);
                p1Var = p1Var2;
                c2565a = c2565a2;
                p2Var.h(gl1.y.Q(o0Var, R.string.title_live_track), gl1.d.W(x0.f23725ya), null, null, null, false, false, null, z3.f.c(-1742061098, new a0(0, lVar, p1Var, z14, z16), o0Var), null, null, o0Var, 100663296, 0, 1788);
                if (z16) {
                    o0Var = o0Var;
                    z17 = true;
                    z18 = false;
                    o0Var.C(1201366724);
                    o0Var.g0(false);
                } else {
                    o0Var = o0Var;
                    o0Var.C(1201052043);
                    bVar2.getClass();
                    z17 = true;
                    h4.r rVarA2 = c2.l.A(aVar3, 0.0f, f15, 1);
                    String strW4 = gl1.d.W(x0.f23708xa);
                    fVar.getClass();
                    mh.c(strW4, rVarA2, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0Var), o0Var, 0, 0, 130044);
                    o0Var = o0Var;
                    z18 = false;
                    o0Var.g0(false);
                }
                o0Var.g0(z18);
            } else {
                c2565a = c2565a2;
                p1Var = p1Var2;
                z17 = true;
                z18 = false;
                o0Var.C(1201376644);
                o0Var.g0(false);
            }
            o0Var.g0(z17);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(261004729);
                c1 c1Var = c1.f110940a;
                String strW5 = gl1.d.W(x0.f23394eb);
                String strW6 = gl1.d.W(x0.f23411fb);
                String strQ4 = gl1.y.Q(o0Var, R.string.lbl_common_continue);
                if ((i16 & 29360128) != 8388608) {
                    z17 = z18;
                }
                Object objQ4 = o0Var.q();
                if (z17 || objQ4 == c2565a) {
                    objQ4 = new v1(lVar, p1Var, 6);
                    o0Var.K(objQ4);
                }
                e23.a<Unit> aVar6 = (e23.a) objQ4;
                String strQ5 = gl1.y.Q(o0Var, R.string.lbl_cancel);
                Object objQ5 = o0Var.q();
                if (objQ5 == c2565a) {
                    objQ5 = new jt1.h(p1Var, 17);
                    o0Var.K(objQ5);
                }
                o0 o0Var2 = o0Var;
                c1Var.a(false, strW5, strW6, null, null, strQ4, false, false, aVar6, strQ5, (e23.a) objQ5, o0Var2, 0, 6, 217);
                o0Var = o0Var2;
                o0Var.g0(z18);
            } else {
                o0Var.C(261547694);
                o0Var.g0(z18);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ye(str, mVar, z14, z15, z16, aVar, aVar2, lVar, i14);
        }
    }
}
