package fx0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.maps.android.compose.u;
import cr.w;
import gl1.y;
import h4.r;
import o13.p;
import o4.d0;
import o70.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import ww0.q;

/* JADX INFO: loaded from: classes9.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:118:0x031f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0356  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, String str, u4.d dVar, bx0.d.e eVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        String string;
        String strP;
        String strK0;
        long jH;
        boolean z14;
        String string2;
        String string3;
        Integer num = eVar.f21678d;
        Integer num2 = eVar.f21676b;
        rVar.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(-2003360003);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(dVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            tb1.b bVar = (tb1.b) KoinJavaComponent.get$default(tb1.b.class, null, null, 6, null);
            f02.e.f67730a.getClass();
            long jC = f02.e.c(o0VarE);
            gl.c.f77766a.getClass();
            long jD = gl.c.a(o0VarE).d();
            int iIntValue = num2 != null ? num2.intValue() : -1;
            int iIntValue2 = num != null ? num.intValue() : -1;
            context.getClass();
            if (iIntValue < 1 || iIntValue2 < q.FIRST.f187646a) {
                string = context.getString(R.string.no_value);
                string.getClass();
            } else if (iIntValue >= 295.0f) {
                string = fb1.c.n("42+", context.getString(R.string.pregnancy_week_abbreviation));
            } else {
                int i16 = iIntValue - 1;
                p pVar = new p(Integer.valueOf(i16 / 7), Integer.valueOf((i16 % 7) + 1));
                int iIntValue3 = ((Number) pVar.f128594a).intValue();
                int iIntValue4 = ((Number) pVar.f128595b).intValue();
                if (iIntValue3 == 0) {
                    string = context.getString(R.string.mct_num_days_label, String.valueOf(iIntValue4));
                    string.getClass();
                } else {
                    string = context.getResources().getString(R.string.pregnancy_week_day_short, String.valueOf(iIntValue3), String.valueOf(iIntValue4));
                    string.getClass();
                }
            }
            boolean z15 = (num2 != null ? s.h(num2.intValue(), 294) : -1) > 0;
            q qVar = eVar.f21680f;
            Integer numValueOf = qVar != null ? Integer.valueOf(qVar.f187647b) : null;
            if (numValueOf == null) {
                o0VarE.C(768438728);
                o0VarE.g0(false);
                strP = null;
            } else {
                o0VarE.C(768438729);
                strP = y.P(R.string.msg_num_trimester, new Object[]{y.Q(o0VarE, numValueOf.intValue())}, o0VarE);
                o0VarE.g0(false);
            }
            String str2 = "";
            if (strP == null) {
                strP = "";
            }
            int iIntValue5 = num2 != null ? num2.intValue() : -1;
            int i17 = i15;
            int iIntValue6 = num != 0 ? num.intValue() : -1;
            String str3 = string;
            if (iIntValue5 < 1 || iIntValue6 < q.FIRST.f187646a) {
                z15 = z15;
                strK0 = "";
            } else if (iIntValue5 >= 295.0f) {
                strK0 = fb1.c.n("42+ ", context.getString(R.string.pregnancy_weeks));
                z15 = z15;
            } else {
                int i18 = iIntValue5 - 1;
                p pVar2 = new p(Integer.valueOf(i18 / 7), Integer.valueOf((i18 % 7) + 1));
                int iIntValue7 = ((Number) pVar2.f128594a).intValue();
                int iIntValue8 = ((Number) pVar2.f128595b).intValue();
                if (iIntValue8 == 1) {
                    string2 = context.getResources().getString(R.string.mct_next_phase_day);
                } else {
                    string2 = iIntValue8 > 1 ? context.getResources().getString(R.string.mct_next_phase_days, String.valueOf(iIntValue8)) : "";
                }
                string2.getClass();
                if (iIntValue7 == 1) {
                    string3 = context.getResources().getString(R.string.msg_week_singular_desc, String.valueOf(iIntValue7));
                } else {
                    string3 = iIntValue7 > 1 ? context.getResources().getString(R.string.msg_week_plural_desc, String.valueOf(iIntValue7)) : "";
                }
                string3.getClass();
                strK0 = h0.k0(x.k(string3, string2), ", ", null, null, null, 62);
            }
            if (z15) {
                o0VarE.C(768980547);
                o0VarE.g0(false);
            } else {
                o0VarE.C(768753999);
                Integer num3 = eVar.f21679e;
                if (num3 == null) {
                    o0VarE.C(768753998);
                    z14 = false;
                    o0VarE.g0(false);
                    str2 = null;
                } else {
                    z14 = false;
                    o0VarE.C(768753999);
                    String strP2 = oi0.c.P(x.k(y.Q(o0VarE, R.string.pregnancy_baby_size), y.Q(o0VarE, num3.intValue())));
                    o0VarE.g0(false);
                    str2 = strP2;
                }
                o0VarE.g0(z14);
            }
            String strP3 = oi0.c.P(x.k(strP, strK0, str2));
            String strQ = y.Q(o0VarE, R.string.msg_log_details);
            yz1.d dVar2 = eVar.f21675a;
            d0 d0VarE = t.P0.e(null, o0VarE, 1);
            if (d0VarE == null) {
                o0VarE.C(-1083560508);
                jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
            } else {
                o0VarE.C(-1083562523);
                o0VarE.g0(false);
                jH = d0VarE.f128833a;
            }
            d0 d0VarA = d0.a(jH);
            d92.b.f58623a.getClass();
            d0 d0VarA2 = d0.a(d92.b.a(o0VarE).f().a());
            boolean zR = o0VarE.r(context) | o0VarE.r(bVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new i(context, bVar, 0);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i(context, bVar, 0);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            z3.e eVarC = z3.f.c(603877050, new w(strP3, str3, z15, eVar, context, bVar, jD, jC), o0VarE);
            boolean zR2 = o0VarE.r(context) | o0VarE.r(bVar);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new i(context, bVar, 1);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new i(context, bVar, 1);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            yz1.y.c(rVar, dVar2, str, null, dVar, d0VarA, 0.0f, R.drawable.ic_gcm_add_16, d0VarA2, 0.0f, strQ, null, null, aVar2, eVarC, (e23.a) objQ2, null, null, null, null, o0Var, (i17 & 14) | ((i17 << 3) & 896) | (57344 & (i17 << 6)), 24576, 989768);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(rVar, str, dVar, eVar, i14, 27);
        }
    }
}
