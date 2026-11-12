package v42;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import gl1.y;
import h4.r;
import o4.d0;
import o42.e;
import o70.t;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import tz1.h;
import yz1.d;
import yz1.z;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:164:0x026e  */
    /* JADX WARN: Code duplicated, block: B:178:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:192:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ed  */
    public static final void a(r rVar, e eVar, l<? super Double, String> lVar, l<? super Double, String> lVar2, l<? super Double, String> lVar3, l<? super Double, String> lVar4, m mVar, int i14) {
        int i15;
        o0 o0Var;
        boolean z14;
        String strInvoke;
        Double d14;
        String strP;
        z zVar;
        Double d15;
        String strInvoke2;
        String strInvoke3;
        String strInvoke4;
        Double d16;
        Double d17;
        String strInvoke5;
        o0 o0VarE = mVar.E(-1897191210);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar4) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.lbl_body_weight);
            String strQ2 = y.Q(o0VarE, R.string.no_value);
            String strQ3 = y.Q(o0VarE, R.string.no_data_label);
            String str = (eVar == null || (d17 = eVar.f129083b) == null || (strInvoke5 = lVar.invoke(d17)) == null) ? strQ2 : strInvoke5;
            if (eVar == null) {
                z14 = false;
            } else {
                Double d18 = eVar.f129088g;
                if (d18 != null && d18.doubleValue() > 0.0d && (d16 = eVar.f129089h) != null && d16.doubleValue() > 0.0d) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            if (z14) {
                o0VarE.C(-1748018111);
                Double d19 = eVar.f129089h;
                if (d19 == null || (strInvoke3 = lVar2.invoke(d19)) == null) {
                    strInvoke3 = strQ2;
                }
                Double d24 = eVar.f129088g;
                if (d24 == null || (strInvoke4 = lVar2.invoke(d24)) == null) {
                    strInvoke4 = strQ2;
                }
                strInvoke = y.P(R.string.string_short_dash_line_string_pattern, new Object[]{strInvoke3, strInvoke4}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1747709041);
                o0VarE.g0(false);
                if (eVar == null || (d14 = eVar.f129086e) == null || (strInvoke = lVar2.invoke(d14)) == null) {
                    strInvoke = strQ2;
                }
            }
            String strP2 = y.P(R.string.lbl_goal_colon_value, new Object[]{strInvoke}, o0VarE);
            String str2 = (eVar == null || (d15 = eVar.f129084c) == null || (strInvoke2 = lVar3.invoke(Double.valueOf(d15.doubleValue()))) == null) ? null : strInvoke2;
            k42.b bVar = k42.b.f102880a;
            Double d25 = eVar != null ? eVar.f129087f : null;
            bVar.getClass();
            String strG = k42.b.g(d25);
            String str3 = strG == null ? strQ2 : strG;
            String strQ4 = y.Q(o0VarE, R.string.lbl_weight_characteristic_bmi);
            String strB = eVar != null ? j0.b(new DateTime(eVar.f129085d), LocalDateTime.now().getYear() != new LocalDateTime(eVar != null ? Long.valueOf(eVar.f129085d) : null).getYear() ? "MMM d, yyyy" : "MMM d", null) : null;
            if (strB == null) {
                o0VarE.C(-1746805795);
                o0VarE.g0(false);
                strP = null;
            } else {
                o0VarE.C(-1746805794);
                strP = y.P(R.string.lbl_updated_date, new Object[]{strB}, o0VarE);
                o0VarE.g0(false);
            }
            if (strP == null) {
                strP = "";
            }
            String str4 = strP;
            String strInvoke6 = lVar4.invoke(eVar != null ? eVar.f129083b : null);
            String strInvoke7 = lVar4.invoke(eVar != null ? eVar.f129086e : null);
            o0VarE.C(-2134547484);
            String strP3 = ((eVar != null ? eVar.f129083b : null) == null || (eVar != null ? eVar.f129086e : null) == null || (eVar != null ? eVar.f129084c : null) == null) ? null : oi0.c.P(x.k(strInvoke6, y.P(R.string.lbl_goal_value, new Object[]{strInvoke7}, o0VarE), y.Q(o0VarE, R.string.lbl_delta_elevation), str2, strQ4, str3, str4));
            o0VarE.g0(false);
            String str5 = strP3 == null ? strQ3 : strP3;
            d dVar = eVar != null ? eVar.f129082a : null;
            t tVar = t.Q0;
            u4.d dVarB = t.b(tVar);
            d0 d0VarE = tVar.e(null, o0VarE, 1);
            String strP4 = y.P(R.string.lbl_add_feature_button, new Object[]{strQ}, o0VarE);
            boolean zR = o0VarE.r(context);
            int i16 = i15;
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new h(context, 7);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new h(context, 7);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            z3.e eVarC = f.c(-1843231879, new ne1.b(str5, str, strP2, str2, str3, strQ4, str4, 2, (byte) 0), o0VarE);
            boolean zR2 = o0VarE.r(context) | ((i16 & 112) == 32 || ((i16 & 64) != 0 && o0VarE.r(eVar)));
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new ug2.h(20, context, eVar);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new ug2.h(20, context, eVar);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar3 = (e23.a) objQ2;
            if (eVar == null || eVar.f129083b == null || (zVar = z.VALID_DATA) == null) {
                zVar = z.EMPTY;
            }
            z zVar2 = zVar;
            String strQ5 = y.Q(o0VarE, R.string.weight_card_no_data_state_message);
            String strQ6 = y.Q(o0VarE, R.string.lbl_add_weigh_in);
            boolean zR3 = o0VarE.r(context);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new h(context, 8);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new h(context, 8);
                    o0VarE.K(objQ3);
                }
            }
            o0Var = o0VarE;
            yz1.y.c(rVar, dVar, strQ, strQ, dVarB, d0VarE, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strP4, null, null, aVar2, eVarC, aVar3, zVar2, strQ5, strQ6, (e23.a) objQ3, o0Var, i16 & 14, 24576, 6976);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(rVar, eVar, lVar, lVar2, lVar3, lVar4, i14, 15);
        }
    }
}
