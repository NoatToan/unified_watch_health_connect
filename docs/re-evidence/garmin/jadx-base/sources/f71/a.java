package f71;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import d71.j;
import f2.o;
import gl1.y;
import h4.r;
import o4.d0;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import yz1.z;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:79:0x01c5  */
    public static final void a(r rVar, j.a aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        Object objZ0;
        Object objZ1;
        String strP;
        boolean z14;
        Object objValueOf;
        r rVar2 = rVar;
        Double d14 = aVar.f58166d;
        o0 o0VarE = mVar.E(420290268);
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
            Integer num = aVar.f58167e;
            String strQ = y.Q(o0VarE, num != null ? num.intValue() : R.string.lbl_no_status);
            String strQ2 = y.Q(o0VarE, R.string.lbl_training_load);
            String strQ3 = y.Q(o0VarE, R.string.lbl_acute_chronic_load);
            String strQ4 = y.Q(o0VarE, R.string.load_ratio_title);
            Object objQ = y.Q(o0VarE, R.string.no_value);
            String strQ5 = y.Q(o0VarE, R.string.no_data_label);
            Integer num2 = aVar.f58164b;
            Integer num3 = aVar.f58165c;
            String strP2 = null;
            if (num == null) {
                o0VarE.C(1038580225);
                z14 = false;
                o0VarE.g0(false);
                strP = null;
            } else {
                o0VarE.C(1038580226);
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    l3.f23124b.getClass();
                    objZ0 = l3.a.Z0(iIntValue);
                } else {
                    objZ0 = objQ;
                }
                if (num3 != null) {
                    int iIntValue2 = num3.intValue();
                    l3.f23124b.getClass();
                    objZ1 = l3.a.Z0(iIntValue2);
                } else {
                    objZ1 = objQ;
                }
                strP = y.P(R.string.value_slash_value, new Object[]{objZ0, objZ1}, o0VarE);
                z14 = false;
                o0VarE.g0(false);
            }
            if (strP == null) {
                o0VarE.C(172059212);
                strP = y.P(R.string.value_slash_value, new Object[]{objQ, objQ}, o0VarE);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(172049261);
                o0VarE.g0(z14);
            }
            if (d14 == 0 || (objValueOf = String.valueOf(d14.doubleValue())) == null) {
                objValueOf = objQ;
            }
            Object obj = num2 == null ? objQ : num2;
            if (num3 != null) {
                objQ = num3;
            }
            String strP3 = y.P(R.string.lbl_value1_to_value2, new Object[]{obj, objQ}, o0VarE);
            String strQ6 = y.Q(o0VarE, R.string.lbl_acute_chronic_load);
            String str = strP;
            o0VarE.C(172078171);
            if (num != null && num2 != null && num3 != null && objValueOf != null) {
                if (strP3 == null) {
                    strP3 = "";
                }
                if (strQ6 == null) {
                    strQ6 = "";
                }
                if (d14 == 0) {
                    o0VarE.C(-1426740448);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1426740447);
                    strP2 = y.P(R.string.string_space_string_pattern, new Object[]{Double.valueOf(d14.doubleValue()), strQ4}, o0VarE);
                    o0VarE.g0(false);
                }
                strP2 = oi0.c.P(x.k(strQ, strP3, strQ6, strP2 != null ? strP2 : ""));
            }
            o0VarE.g0(false);
            String str2 = strP2 == null ? strQ5 : strP2;
            yz1.d dVar = aVar.f58163a;
            s62.a.f157643a.getClass();
            u4.d dVarA = f72.a.a(t62.c.f162799a);
            d92.b.f58623a.getClass();
            d0 d0VarA = d0.a(d92.b.a(o0VarE).f().b());
            z3.e eVarC = z3.f.c(441093887, new a42.c(str2, strQ, str, strQ3, objValueOf, strQ4, 21), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new cy1.a(context, 8);
                o0VarE.K(objQ2);
            } else {
                m.f135153a.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new cy1.a(context, 8);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            rVar2 = rVar;
            yz1.y.c(rVar2, dVar, strQ2, null, dVarA, d0VarA, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC, (e23.a) objQ2, !aVar.f58168f ? z.EMPTY : z.VALID_DATA, y.Q(o0VarE, R.string.training_load_card_no_data_state_message), null, null, o0Var, i15 & 14, 24576, 802760);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(rVar2, aVar, i14, 5);
        }
    }
}
