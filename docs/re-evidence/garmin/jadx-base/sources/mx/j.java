package mx;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import o4.d0;
import o70.t;
import org.apache.commons.lang3.StringUtils;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import yz1.z;
import z72.l;

/* JADX INFO: loaded from: classes7.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:83:0x01a3  */
    public static final void a(r rVar, gx.a aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strP;
        String strP2;
        boolean z14;
        z zVar;
        Integer num;
        Integer num2;
        Integer num3;
        String strValueOf;
        Integer num4;
        r rVar2 = rVar;
        rVar2.getClass();
        o0 o0VarE = mVar.E(-1434487189);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.gcm_body_battery_lbl_body_battery);
            int iIntValue = (aVar == null || (num4 = aVar.f80002b) == null) ? 0 : num4.intValue();
            String strQ2 = y.Q(o0VarE, R.string.no_value);
            if ((aVar != null ? aVar.f80003c : null) == null) {
                o0VarE.C(117106341);
                o0VarE.g0(false);
                strP = null;
            } else {
                o0VarE.C(117106342);
                strP = y.P(R.string.lbl_string_with_positive_sign, new Object[]{aVar.f80003c}, o0VarE);
                o0VarE.g0(false);
            }
            String str = strP == null ? strQ2 : strP;
            if ((aVar != null ? aVar.f80004d : null) == null) {
                o0VarE.C(117247205);
                o0VarE.g0(false);
                strP2 = null;
            } else {
                o0VarE.C(117247206);
                strP2 = y.P(R.string.lbl_string_with_negative_sign, new Object[]{aVar.f80004d}, o0VarE);
                o0VarE.g0(false);
            }
            String str2 = strP2 == null ? strQ2 : strP2;
            String str3 = (aVar == null || (num3 = aVar.f80002b) == null || (strValueOf = String.valueOf(num3.intValue())) == null) ? strQ2 : strValueOf;
            f02.e.f67730a.getClass();
            long jC = f02.e.c(o0VarE);
            int i16 = i15;
            i53.f fVarA = i53.a.a(new l(0.25f, jC, null), new l(0.25f, jC, null), new l(0.25f, jC, null), new l(0.25f, jC, null));
            String strQ3 = y.Q(o0VarE, R.string.no_data_label);
            if (iIntValue > 0) {
                o0VarE.C(118010457);
                strQ3 = oi0.c.P(x.k(y.P(R.string.msg_value_out_of_100, new Object[]{str3}, o0VarE), vb.h.h((aVar == null || (num2 = aVar.f80003c) == null) ? 0 : num2.intValue(), y.Q(o0VarE, R.string.gcm_body_battery_lbl_charged), StringUtils.SPACE), vb.h.h((aVar == null || (num = aVar.f80004d) == null) ? 0 : num.intValue(), y.Q(o0VarE, R.string.gcm_body_battery_lbl_drained), StringUtils.SPACE)));
                z14 = false;
                o0VarE.g0(false);
            } else {
                z14 = false;
                o0VarE.C(118384441);
                o0VarE.g0(false);
            }
            String str4 = strQ3;
            yz1.d dVar = aVar != null ? aVar.f80001a : null;
            t tVar = t.f130065i;
            u4.d dVarB = t.b(tVar);
            d0 d0VarE = tVar.e(null, o0VarE, 1);
            z3.e eVarC = z3.f.c(-988857240, new ka0.e(str4, fVarA, iIntValue, str3, str, str2), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new l71.g(context, 8);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new l71.g(context, 8);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            if (aVar == null) {
                zVar = z.EMPTY;
            } else {
                Integer num5 = aVar.f80002b;
                if (num5 != null && num5.intValue() >= 0) {
                    z14 = true;
                }
                zVar = (z14 || aVar.f80005e) ? z.VALID_DATA : z.EMPTY;
            }
            o0Var = o0VarE;
            yz1.d dVar2 = dVar;
            rVar2 = rVar;
            yz1.y.c(rVar2, dVar2, strQ, null, dVarB, d0VarE, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC, aVar2, zVar, y.Q(o0VarE, R.string.body_battery_card_no_data_state_message), null, null, o0Var, i16 & 14, 24576, 802760);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar2, aVar, i14, 1);
        }
    }
}
