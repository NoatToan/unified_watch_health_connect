package f71;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e32.o;
import f02.s;
import f72.b3;
import gl1.y;
import h4.r;
import lc.u0;
import o4.g1;
import org.joda.time.DateTime;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import p3.y3;
import q4.k;
import yz1.z;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f69448a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f69448a = 8;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    public static final void a(r rVar, d71.i iVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strL;
        String strJ;
        z zVar;
        o0 o0VarE = mVar.E(212287025);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 32 : 16;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context context = (Context) o0VarE.A(y3Var);
            Integer num = iVar != null ? iVar.f58162k : null;
            if (num == null) {
                o0VarE.C(2051069061);
                o0VarE.g0(false);
                strL = null;
            } else {
                strL = u0.l(o0VarE, 2051069062, num, o0VarE, false);
            }
            if (strL == null) {
                strL = "";
            }
            String str = strL;
            String strQ = y.Q(o0VarE, R.string.lbl_load_focus_lf);
            DateTime dateTimeNow = DateTime.now();
            DateTime dateTimeMinusDays = dateTimeNow.minusDays(o.f62808k.f62819a - 1);
            pi0.e eVar = new pi0.e((Context) o0VarE.A(y3Var));
            dateTimeMinusDays.getClass();
            qi0.a aVar = qi0.a.NO_YEAR_ABBREV_MONTH_DAY;
            String strA = eVar.a(dateTimeMinusDays, aVar);
            String strA2 = new pi0.e((Context) o0VarE.A(y3Var)).a(dateTimeNow, aVar);
            String strP = y.P(R.string.string_line_string_pattern, new Object[]{strA, strA2}, o0VarE);
            o0VarE.C(2144393639);
            if (iVar != null) {
                Integer num2 = iVar.f58159h;
                Integer num3 = iVar.f58156e;
                Integer num4 = iVar.f58153b;
                if ((num4 == null || num3 == null || num2 == null || iVar.f58162k == null) ? false : true) {
                    o0VarE.C(296202970);
                    strJ = oi0.c.P(x.k(str, y.Q(o0VarE, R.string.activity_anaerobic_label), String.valueOf(num4), y.Q(o0VarE, R.string.activities_high_aerobic_title), String.valueOf(num3), y.Q(o0VarE, R.string.activities_low_aerobic_title), String.valueOf(num2), y.P(R.string.msg_date_range, new Object[]{strA, strA2}, o0VarE)));
                    o0VarE.g0(false);
                } else {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 296773215, R.string.load_focus_card_no_data_state_message, o0VarE, false);
                }
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 296773215, R.string.load_focus_card_no_data_state_message, o0VarE, false);
            }
            String str2 = strJ;
            o0VarE.g0(false);
            yz1.d dVar = iVar != null ? iVar.f58152a : null;
            s62.a.f157643a.getClass();
            u4.d dVarA = b3.a(t62.c.f162799a);
            z3.e eVarC = z3.f.c(-1729271250, new d50.i(str2, iVar, strP, str, 22), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new cy1.a(context, 10);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new cy1.a(context, 10);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            if (iVar == null) {
                zVar = z.EMPTY;
            } else {
                zVar = !(iVar.f58153b != null && iVar.f58156e != null && iVar.f58159h != null && iVar.f58162k != null) ? z.EMPTY : z.VALID_DATA;
            }
            o0Var = o0VarE;
            yz1.y.c(rVar, dVar, strQ, null, dVarA, null, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC, aVar2, zVar, y.Q(o0VarE, R.string.load_focus_card_no_data_state_message), null, null, o0Var, i16 & 14, 24576, 802792);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f2.o(rVar, iVar, i14, 7);
        }
    }

    public static final m92.z b(m mVar) {
        long j8;
        x1 x1Var = n.f135158a;
        s.f67747a.getClass();
        d92.b.f58623a.getClass();
        if (d92.b.d(mVar)) {
            gl.c.f77766a.getClass();
            j8 = gl.c.f77767b.f77779f;
        } else {
            gl.c.f77766a.getClass();
            j8 = gl.c.f77767b.f77787j;
        }
        long j14 = j8;
        g1.f128855a.getClass();
        return new m92.z(j14, f69448a, new k(4.0f, 0.0f, 0, 0, g1.a.a(0.0f, new float[]{6.0f, 6.0f}), 14, null), null);
    }
}
