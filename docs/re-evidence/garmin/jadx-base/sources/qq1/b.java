package qq1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b50.o;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import gl1.y;
import h4.r;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import yz1.a0;
import yz1.k;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:74:0x0174  */
    public static final void a(r rVar, a0.a aVar, boolean z14, m mVar, int i14) {
        int i15;
        String strP;
        o0 o0VarE = mVar.E(-1916458299);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Double d14 = aVar != null ? aVar.f200239b : null;
            Double d15 = aVar != null ? aVar.f200240c : null;
            String strQ = y.Q(o0VarE, R.string.no_data_label);
            String strQ2 = y.Q(o0VarE, R.string.no_value);
            String strJ = z14 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -208463986, R.string.pushes_card_no_data_state_message, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -208379697, R.string.steps_card_no_data_state_message, o0VarE, false);
            boolean zB = o0VarE.B(strQ2);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zB) {
                objQ = new o60.b(strQ2, 12);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new o60.b(strQ2, 12);
                    o0VarE.K(objQ);
                }
            }
            l lVar = (l) objQ;
            if (z14) {
                o0VarE.C(-208059622);
                strP = y.P(R.string.lbl_pushes_number, new Object[]{lVar.invoke(d14)}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-207955493);
                strP = y.P(R.string.lbl_steps_number, new Object[]{lVar.invoke(d14)}, o0VarE);
                o0VarE.g0(false);
            }
            if (d14 == null || d15 == null) {
                o0VarE.C(-207542945);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-207770857);
                strQ = oi0.c.P(x.k(strP, y.P(R.string.msg_percent_of_goal_met, new Object[]{Integer.valueOf((int) (((double) 100) * (d14.doubleValue() / d15.doubleValue())))}, o0VarE)));
                o0VarE.g0(false);
            }
            yz1.d dVar = aVar != null ? aVar.f200238a : null;
            yz1.i iVar = (aVar == null || aVar.f200239b == null) ? yz1.i.EMPTY : yz1.i.VALID_DATA;
            u4.d dVarB = o70.i.b(o70.i.f130002j);
            z3.e eVarC = z3.f.c(-1091767373, new mw0.h(d14, d15, lVar, strQ), o0VarE);
            boolean zR = ((i15 & 896) == 256) | o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new o(z14, context, 11);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new o(z14, context, 11);
                    o0VarE.K(objQ2);
                }
            }
            k.b(rVar, dVar, dVarB, eVarC, (e23.a) objQ2, strJ, iVar, o0VarE, (i15 & 14) | 3072);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(rVar, aVar, z14, i14, 17);
        }
    }
}
