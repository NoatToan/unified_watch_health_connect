package jv0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.q;
import c.w;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import gl1.y;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import wd2.g2;

/* JADX INFO: loaded from: classes9.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(gv0.d dVar, l<? super e23.a<Unit>, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        String str;
        String strJ;
        g2.a aVar3;
        dVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1649388517);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            g.h hVar = new g.h();
            boolean zR = o0VarE.r(dVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new bv0.n(dVar, 18);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new bv0.n(dVar, 18);
                    o0VarE.K(objQ);
                }
            }
            q qVarC = w.c(hVar, (l) objQ, o0VarE, 0);
            ou0.f fVar = (ou0.f) ((g3) s9.c.c(dVar.f79204w, o0VarE).getF182175a()).f35301b;
            String strP = null;
            g2 g2Var = fVar != null ? fVar.f133985c : null;
            boolean z14 = (g2Var == null || (g2Var instanceof g2.c)) ? false : true;
            g2.b bVar = g2.b.f184481a;
            if (s.g(g2Var, bVar)) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 219459475, R.string.lbl_strava_for_garmin, o0VarE, false);
            } else {
                if (g2Var instanceof g2.a) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 219462330, R.string.lbl_enable_strava_for_garmin, o0VarE, false);
                } else {
                    o0VarE.C(-1786534440);
                    o0VarE.g0(false);
                    str = null;
                }
                if (s.g(g2Var, bVar)) {
                    strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 219467940, R.string.lbl_on, o0VarE, false);
                } else if (g2Var instanceof g2.a) {
                    o0VarE.C(-1786343851);
                    aVar3 = (g2.a) g2Var;
                    if (aVar3.f184479a && aVar3.f184480b) {
                        o0VarE.C(-1786258973);
                        strP = y.P(R.string.string_space_bullet_string_pattern, new Object[]{y.Q(o0VarE, R.string.lbl_on), y.Q(o0VarE, R.string.lbl_consent_required)}, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1786011655);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1785949160);
                    o0VarE.g0(false);
                }
                gl1.d.b(y.Q(o0VarE, R.string.lbl_feature_tour_strava_beacon), aVar2, false, null, null, null, z3.f.c(-765916777, new cv0.h(aVar, z14, str, strP, lVar, context, qVarC), o0VarE), o0VarE, ((i15 >> 6) & 112) | 1572864, 60);
            }
            str = strJ;
            if (s.g(g2Var, bVar)) {
                strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 219467940, R.string.lbl_on, o0VarE, false);
            } else if (g2Var instanceof g2.a) {
                o0VarE.C(-1786343851);
                aVar3 = (g2.a) g2Var;
                if (aVar3.f184479a) {
                    o0VarE.C(-1786011655);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1786011655);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1785949160);
                o0VarE.g0(false);
            }
            gl1.d.b(y.Q(o0VarE, R.string.lbl_feature_tour_strava_beacon), aVar2, false, null, null, null, z3.f.c(-765916777, new cv0.h(aVar, z14, str, strP, lVar, context, qVarC), o0VarE), o0VarE, ((i15 >> 6) & 112) | 1572864, 60);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(dVar, lVar, aVar, aVar2, i14, 3);
        }
    }
}
