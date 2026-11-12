package tr1;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import o4.d0;
import o70.t;
import or1.d;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import yz.k;
import yz1.z;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:71:0x0137  */
    public static final void a(r rVar, d dVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strJ;
        o0 o0VarE = mVar.E(-1411928331);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Integer num = dVar != null ? dVar.f133414b : null;
            String strQ = y.Q(o0VarE, R.string.title_stress);
            String strQ2 = y.Q(o0VarE, R.string.no_data_label);
            boolean z14 = (num != null ? num.intValue() : 0) > 0;
            if (z14) {
                o0VarE.C(346552863);
                o0VarE.g0(false);
                strJ = String.valueOf(num);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 346553403, R.string.no_value, o0VarE, false);
            }
            String str = strJ;
            int i16 = dVar != null ? dVar.f133415c : 0;
            int i17 = dVar != null ? dVar.f133416d : 0;
            int i18 = dVar != null ? dVar.f133417e : 0;
            int i19 = dVar != null ? dVar.f133418f : 0;
            i53.c cVarA = sr1.b.a(dVar != null ? dVar.f133420h : null, dVar != null ? dVar.f133419g : null, o0VarE);
            String formattedValue = new k(DateFormat.is24HourFormat(context)).getFormattedValue(0.0f);
            if (z14) {
                o0VarE.C(-2141024186);
                strQ2 = oi0.c.P(x.k(String.valueOf(num), y.P(R.string.lbl_view_your_feature_details, new Object[]{strQ}, o0VarE)));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2140826065);
                o0VarE.g0(false);
            }
            String str2 = strQ2;
            yz1.d dVar2 = dVar != null ? dVar.f133413a : null;
            t tVar = t.I0;
            u4.d dVarB = t.b(tVar);
            d0 d0VarE = tVar.e(null, o0VarE, 1);
            e eVarC = f.c(-1007723534, new b(str2, i16, i17, i18, i19, str, cVarA, formattedValue), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new s70.r(context, 24);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new s70.r(context, 24);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            yz1.y.c(rVar, dVar2, strQ, strQ, dVarB, d0VarE, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC, (e23.a) objQ, (dVar == null || !dVar.f133421i) ? z.EMPTY : z.VALID_DATA, y.Q(o0VarE, R.string.stress_card_no_data_state_message), null, null, o0Var, i15 & 14, 24576, 802752);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(rVar, dVar, i14, 18);
        }
    }
}
