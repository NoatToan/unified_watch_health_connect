package tz1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.p;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import i3.tb;
import oz1.s;
import oz1.u;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import yz1.k;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    public static final void a(r rVar, rz1.h hVar, m mVar, int i14) {
        int i15;
        String strJ;
        o0 o0VarE = mVar.E(-1223568265);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(hVar) : o0VarE.r(hVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.training_readiness);
            o0VarE.C(971942950);
            Float f14 = hVar != null ? hVar.f155231b : null;
            u uVar = hVar != null ? hVar.f155232c : null;
            s sVar = hVar != null ? hVar.f155233d : null;
            if (f14 == null || uVar == null || sVar == null) {
                strJ = null;
            } else {
                float fFloatValue = f14.floatValue();
                l3.f23124b.getClass();
                strJ = oi0.c.P(x.k(l3.f23131i.format(Float.valueOf(fFloatValue)), y.Q(o0VarE, uVar.f134640c), y.Q(o0VarE, sVar.f134618c)));
            }
            o0VarE.g0(false);
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 971952514, R.string.no_data_label, o0VarE, false);
            } else {
                o0VarE.C(971942997);
                o0VarE.g0(false);
            }
            Float f15 = hVar != null ? p005kotlin.jvm.internal.s.g(hVar.f155234e, Boolean.TRUE) : false ? hVar.f155231b : null;
            boolean zB = o0VarE.B(strQ) | o0VarE.B(strJ);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new cn1.j(strQ, strJ, 16);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new cn1.j(strQ, strJ, 16);
                    o0VarE.K(objQ);
                }
            }
            sz1.e.a(f15, hVar != null ? hVar.f155232c : null, k.d(o0VarE), 3.0f, v.c((l) objQ, rVar, false), z3.f.c(1863071755, new a(1, f15), o0VarE), o0VarE, 199680);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar, hVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x009f  */
    public static final void b(r rVar, rz1.h hVar, m mVar, int i14) {
        int i15;
        r rVar2;
        o0 o0VarE = mVar.E(984651883);
        int i16 = 4;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(hVar) : o0VarE.r(hVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean z14 = (hVar != null ? hVar.f155232c : null) == u.RECENT_DIVE;
            yz1.d dVar = hVar != null ? hVar.f155230a : null;
            yz1.i iVar = (hVar == null || p005kotlin.jvm.internal.s.g(hVar.f155236g, Boolean.FALSE)) ? yz1.i.EMPTY : yz1.i.VALID_DATA;
            u4.d dVarB = o70.i.b(o70.i.f130003k);
            String strQ = y.Q(o0VarE, R.string.lbl_training_readiness_no_data_info);
            z3.e eVarC = z3.f.c(1631962813, new tb(z14, hVar, i16), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new s70.r(context, 26);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new s70.r(context, 26);
                    o0VarE.K(objQ);
                }
            }
            rVar2 = rVar;
            k.b(rVar2, dVar, dVarB, eVarC, (e23.a) objQ, strQ, iVar, o0VarE, (i15 & 14) | 3072);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar2, hVar, i14, 0);
        }
    }

    public static final void c(r rVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(-868617633);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = y.Q(o0VarE, R.string.recent_dives);
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97935l;
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131070);
            c2.l.f(b0Var.a(r.S, 1.0f, true), o0VarE);
            String strQ2 = y.Q(o0VarE, R.string.post_dive_do_not_exercise);
            d6.h.f57752b.getClass();
            d6.h hVarA = d6.h.a(d6.h.f57755e);
            fVar.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 130046);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(rVar, i14, 4, (byte) 0);
        }
    }
}
