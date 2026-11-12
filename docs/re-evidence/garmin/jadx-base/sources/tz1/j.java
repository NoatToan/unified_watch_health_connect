package tz1;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import f72.hd;
import gl1.y;
import h4.r;
import o4.d0;
import o70.t;
import oz1.s;
import oz1.u;
import p005kotlin.Unit;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import t21.l;
import t21.l0;
import yz1.z;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    public static final void a(r rVar, rz1.h hVar, e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strJ;
        long jH;
        rVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(2048064560);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(hVar) : o0VarE.r(hVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.training_readiness);
            o0VarE.C(1095029687);
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
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1095039995, R.string.no_data_label, o0VarE, false);
            } else {
                o0VarE.C(1095029734);
                o0VarE.g0(false);
            }
            yz1.d dVar = hVar != null ? hVar.f155230a : null;
            s62.a.f157643a.getClass();
            u4.d dVarA = hd.a(t62.c.f162799a);
            d0 d0VarE = t.L0.e(null, o0VarE, 1);
            if (d0VarE == null) {
                o0VarE.C(1095050295);
                jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
            } else {
                o0VarE.C(1095048094);
                o0VarE.g0(false);
                jH = d0VarE.f128833a;
            }
            o0Var = o0VarE;
            yz1.y.c(rVar, dVar, strQ, null, dVarA, d0.a(jH), 0.0f, 0, null, 0.0f, null, null, null, null, z3.f.c(129280467, new l(26, strJ, hVar), o0VarE), aVar, (hVar == null || p005kotlin.jvm.internal.s.g(hVar.f155236g, Boolean.FALSE)) ? z.EMPTY : z.VALID_DATA, hVar != null ? p005kotlin.jvm.internal.s.g(hVar.f155238i, Boolean.TRUE) : false ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -412024316, R.string.check_back_later_message, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -411940337, R.string.training_readiness_card_no_data_state_message, o0VarE, false), null, null, o0Var, i15 & 14, ((i15 << 9) & 458752) | 24576, 802760);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(rVar, hVar, aVar, i14);
        }
    }
}
