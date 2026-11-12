package o60;

import a51.h;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import g02.q0;
import g22.k;
import gl1.y;
import h4.r;
import kh0.d;
import l71.g;
import o4.d0;
import org.joda.time.DateTime;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import pi0.e;
import u62.w4;
import yz1.z;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:78:0x017c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ad  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, m60.a aVar, l lVar, d dVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        char c14;
        String strA;
        String str;
        String strP;
        z zVar;
        Double d14;
        String str2;
        DateTime dateTimeQ;
        o0 o0VarE = mVar.E(1661557979);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(dVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.lbl_css);
            String strQ2 = y.Q(o0VarE, R.string.lbl_pace);
            String strQ3 = y.Q(o0VarE, R.string.no_data_label);
            if (aVar == null || (str2 = aVar.f116872b) == null || (dateTimeQ = k.q(str2, "yyyy-MM-dd'T'HH:mm:ss.SSS", null)) == null) {
                c14 = 2;
                strA = null;
            } else {
                c14 = 2;
                strA = new e(context).a(dateTimeQ, qi0.a.NO_YEAR_ABBREV_MONTH_DAY);
            }
            if (strA == null) {
                o0VarE.C(-23611710);
                o0VarE.g0(false);
                str = null;
            } else {
                o0VarE.C(-23611709);
                String strP2 = y.P(R.string.lbl_updated_date, new Object[]{strA}, o0VarE);
                o0VarE.g0(false);
                str = strP2;
            }
            o0VarE.C(-970588378);
            Double d15 = aVar != null ? aVar.f116873c : null;
            if (d15 == null || str == null) {
                strP = null;
            } else {
                double dDoubleValue = d15.doubleValue();
                String[] strArr = new String[3];
                strArr[0] = strQ2;
                strArr[1] = dVar.invoke(Double.valueOf(dDoubleValue), o0VarE, Integer.valueOf((i15 >> 6) & 112));
                strArr[c14] = str;
                strP = oi0.c.P(x.k(strArr));
            }
            o0VarE.g0(false);
            String str3 = strP == null ? strQ3 : strP;
            String strJ = (aVar == null || (d14 = aVar.f116873c) == null) ? null : (String) lVar.invoke(d14);
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -970577567, R.string.no_value, o0VarE, false);
            } else {
                o0VarE.C(-970579055);
                o0VarE.g0(false);
            }
            String str4 = strJ;
            yz1.d dVar2 = aVar != null ? aVar.f116871a : null;
            s62.a.f157643a.getClass();
            u4.d dVarA = w4.a(t62.a.f162797a);
            d92.b.f58623a.getClass();
            d0 d0VarA = d0.a(d92.b.a(o0VarE).f().b());
            String strP3 = y.P(R.string.lbl_add_feature_button, new Object[]{strQ}, o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zR) {
                objQ = new g(context, 13);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new g(context, 13);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            z3.e eVarC = f.c(1040310718, new h(str3, str, str4, strQ2, 4, (byte) 0), o0VarE);
            boolean zR2 = o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new g(context, 14);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new g(context, 14);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar4 = (e23.a) objQ2;
            if (aVar == null || aVar.f116873c == null || (zVar = z.VALID_DATA) == null) {
                zVar = z.EMPTY;
            }
            o0Var = o0VarE;
            yz1.y.c(rVar, dVar2, strQ, null, dVarA, d0VarA, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strP3, null, null, aVar3, eVarC, aVar4, zVar, y.Q(o0VarE, R.string.css_card_no_data_state_message), null, null, o0Var, i15 & 14, 24576, 793416);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(rVar, aVar, lVar, dVar, i14, 24);
        }
    }
}
