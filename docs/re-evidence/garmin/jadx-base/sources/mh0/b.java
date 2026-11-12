package mh0;

import a11.g0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import dh0.f;
import f72.w0;
import g22.k;
import gl1.y;
import h4.r;
import ih0.i;
import l71.g;
import lc.u0;
import mg2.o;
import o4.d0;
import oi0.c;
import org.joda.time.LocalDate;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import p3.y3;
import pi0.e;
import yz1.d;
import yz1.z;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:104:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:87:0x0163  */
    public static final void a(r rVar, hh0.a aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strB;
        String strD;
        String strP;
        z zVar;
        boolean z14;
        String strL;
        f fVar;
        String str;
        Double d14;
        r rVar2 = rVar;
        o0 o0VarE = mVar.E(516299808);
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
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context context = (Context) o0VarE.A(y3Var);
            String strQ = y.Q(o0VarE, R.string.lbl_fitness_age);
            String strQ2 = y.Q(o0VarE, R.string.no_value);
            String strQ3 = y.Q(o0VarE, R.string.no_data_label);
            i iVar = new i(context);
            String strB2 = iVar.b(aVar != null ? aVar.f83732b : null);
            int i16 = aVar != null ? aVar.f83734d : 0;
            String strP2 = y.P(R.string.lbl_your_age, new Object[]{i16 > 0 ? Integer.valueOf(i16) : strQ2}, o0VarE);
            if (aVar == null || (d14 = aVar.f83733c) == null) {
                strB = null;
            } else {
                double dDoubleValue = d14.doubleValue();
                if (dDoubleValue > 0.0d) {
                    strB = iVar.b(Double.valueOf(dDoubleValue));
                } else {
                    strB = null;
                }
            }
            String strQ4 = y.Q(o0VarE, R.string.workout_target);
            LocalDate localDateW = (aVar == null || (str = aVar.f83735e) == null) ? null : k.w(str, "yyyy-MM-dd'T'HH:mm:ss.S");
            if (localDateW == null) {
                o0VarE.C(810680875);
                o0VarE.g0(false);
                strD = null;
            } else {
                o0VarE.C(810680876);
                strD = new e((Context) o0VarE.A(y3Var)).d(localDateW, qi0.a.NO_YEAR_ABBREV_MONTH_DAY);
                o0VarE.g0(false);
            }
            if (strD == null) {
                o0VarE.C(810864829);
                o0VarE.g0(false);
                strP = null;
            } else {
                o0VarE.C(810864830);
                strP = y.P(R.string.lbl_updated_date, new Object[]{strD}, o0VarE);
                o0VarE.g0(false);
            }
            if (aVar != null && aVar.f83732b != null) {
                if (i16 <= 0) {
                    strP2 = "";
                }
                strQ3 = c.P(x.k(strB2, strP2, strB != null ? c.P(x.k(strQ4, strB)) : "", strP != null ? strP : ""));
            }
            String str2 = strQ3;
            d dVar = aVar != null ? aVar.f83731a : null;
            s62.a.f157643a.getClass();
            u4.d dVarA = w0.a(t62.c.f162799a);
            long jD = hb.a.d(d92.b.f58623a, o0VarE);
            if (aVar == null) {
                zVar = z.EMPTY;
            } else {
                zVar = (aVar.f83732b == null || aVar.f83736f || aVar.f83737g != null) ? z.EMPTY : z.VALID_DATA;
                if (zVar == null) {
                    zVar = z.EMPTY;
                }
            }
            Integer numValueOf = (aVar == null || (fVar = aVar.f83737g) == null) ? null : Integer.valueOf(fVar.f59585b);
            if (numValueOf == null) {
                o0VarE.C(813895234);
                o0VarE.g0(false);
                z14 = false;
                strL = null;
            } else {
                z14 = false;
                strL = u0.l(o0VarE, 813895235, numValueOf, o0VarE, false);
            }
            if (strL == null) {
                strL = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2051953622, R.string.fitness_age_score_card_no_data_state_message, o0VarE, z14);
            } else {
                o0VarE.C(-2051956908);
                o0VarE.g0(z14);
            }
            String str3 = strL;
            d0 d0VarA = d0.a(jD);
            z3.e eVarC = z3.f.c(-1768202429, new g0(str2, i16, strP, strB2, strQ2, strB, strQ4), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new g(context, 4);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new g(context, 4);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            rVar2 = rVar;
            yz1.y.c(rVar2, dVar, strQ, strQ, dVarA, d0VarA, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC, (e23.a) objQ, zVar, str3, null, null, o0Var, i15 & 14, 24576, 802752);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(rVar2, (Object) aVar, i14, 1);
        }
    }
}
