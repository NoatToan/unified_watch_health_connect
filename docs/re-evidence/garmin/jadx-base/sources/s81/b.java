package s81;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import f72.h2;
import gl1.y;
import h4.r;
import j70.x;
import mg2.o;
import n81.e;
import oi0.c;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import q81.k;
import yz1.d;
import yz1.z;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:57:0x011b  */
    public static final void a(r rVar, e eVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strQ;
        String strP;
        o0 o0VarE = mVar.E(827941294);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Integer num = eVar != null ? eVar.f124941b : null;
            x.a aVar = x.f97667d;
            Integer num2 = eVar != null ? eVar.f124943d : null;
            aVar.getClass();
            x xVarA = x.a.a(num2);
            String strQ2 = y.Q(o0VarE, R.string.lbl_hill_score);
            k.f143328e.getClass();
            k kVarB = k.a.b(num);
            String strQ3 = y.Q(o0VarE, kVarB != null ? kVarB.f143337b : R.string.no_data_label);
            String strQ4 = y.Q(o0VarE, R.string.no_data_label);
            if (num == null) {
                o0VarE.C(-797499149);
                o0VarE.g0(false);
                strP = null;
            } else {
                o0VarE.C(-797499148);
                int iIntValue = num.intValue();
                l3.f23124b.getClass();
                String str = l3.f23131i.format(Integer.valueOf(iIntValue));
                if (xVarA == null) {
                    o0VarE.C(-1277366956);
                    o0VarE.g0(false);
                    strQ = null;
                } else {
                    o0VarE.C(-1277366955);
                    strQ = y.Q(o0VarE, xVarA.f97673b);
                    o0VarE.g0(false);
                }
                if (strQ == null) {
                    strQ = "";
                }
                strP = c.P(p13.x.k(str, strQ3, strQ));
                o0VarE.g0(false);
            }
            if (strP != null) {
                strQ4 = strP;
            }
            d dVar = eVar != null ? eVar.f124940a : null;
            s62.a.f157643a.getClass();
            u4.d dVarA = h2.a(t62.c.f162799a);
            z3.e eVarC = f.c(189946001, new ob0.e(strQ4, num, eVar, strQ3, xVarA, 26), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new s70.r(context, 8);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new s70.r(context, 8);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            yz1.y.c(rVar, dVar, strQ2, null, dVarA, null, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC, (e23.a) objQ, (eVar == null || s.g(eVar.f124944e, Boolean.FALSE)) ? z.EMPTY : z.VALID_DATA, y.Q(o0VarE, R.string.hillscore_card_no_data_state_message), null, null, o0Var, i16 & 14, 24576, 802792);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(rVar, (Object) eVar, i14, 29);
        }
    }
}
