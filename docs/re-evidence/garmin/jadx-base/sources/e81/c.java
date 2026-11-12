package e81;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e11.f0;
import f72.n0;
import gl1.y;
import h4.r;
import j70.x;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import yz1.d;
import yz1.z;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:57:0x0104  */
    public static final void a(r rVar, x71.a aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strP;
        String strQ;
        o0 o0VarE = mVar.E(-297688688);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ2 = y.Q(o0VarE, R.string.lbl_endurance_score);
            String strQ3 = y.Q(o0VarE, R.string.no_data_label);
            x.a aVar2 = x.f97667d;
            Integer num = aVar != null ? aVar.f189422e : null;
            aVar2.getClass();
            x xVarA = x.a.a(num);
            o0VarE.C(1683992810);
            Integer num2 = aVar != null ? aVar.f189419b : null;
            n61.b bVar = aVar != null ? aVar.f189421d : null;
            if (num2 == null || bVar == null) {
                strP = null;
            } else {
                int iIntValue = num2.intValue();
                l3.f23124b.getClass();
                String str = l3.f23131i.format(Integer.valueOf(iIntValue));
                String strQ4 = y.Q(o0VarE, bVar.f123819b);
                if (xVarA == null) {
                    o0VarE.C(610564748);
                    o0VarE.g0(false);
                    strQ = null;
                } else {
                    o0VarE.C(610564749);
                    strQ = y.Q(o0VarE, xVarA.f97673b);
                    o0VarE.g0(false);
                }
                if (strQ == null) {
                    strQ = "";
                }
                strP = oi0.c.P(p13.x.k(str, strQ4, strQ));
            }
            o0VarE.g0(false);
            if (strP != null) {
                strQ3 = strP;
            }
            d dVar = aVar != null ? aVar.f189418a : null;
            s62.a.f157643a.getClass();
            u4.d dVarA = n0.a(t62.c.f162799a);
            e eVarC = f.c(817401549, new f0(strQ3, aVar, xVarA), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new cy1.a(context, 5);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new cy1.a(context, 5);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            yz1.y.c(rVar, dVar, strQ2, null, dVarA, null, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC, (e23.a) objQ, (aVar == null || s.g(aVar.f189423f, Boolean.FALSE)) ? z.EMPTY : z.VALID_DATA, y.Q(o0VarE, R.string.endurance_score_card_no_data_state_message), null, null, o0Var, i15 & 14, 24576, 802792);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(rVar, aVar, i14, 27);
        }
    }
}
