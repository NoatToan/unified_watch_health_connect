package ne1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import l71.g;
import mg2.o;
import o4.d0;
import o70.t;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import w2.a0;
import yz1.d;
import yz1.z;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:85:0x0160  */
    /* JADX WARN: Code duplicated, block: B:90:0x0194  */
    public static final void a(r rVar, ee1.c cVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        long jH;
        z zVar;
        Double d14;
        Double d15;
        Double d16;
        Double d17;
        Double d18;
        Double d19;
        o0 o0VarE = mVar.E(-1529819815);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            a10.a aVar = new a10.a(context);
            String strQ = y.Q(o0VarE, R.string.lbl_sleep_avg);
            String strQ2 = y.Q(o0VarE, R.string.respiration_lbl_awake_avg_short);
            String strB = (cVar == null || (d19 = cVar.f63922b) == null) ? null : aVar.b(d19.doubleValue());
            String strB2 = (cVar == null || (d18 = cVar.f63923c) == null) ? null : aVar.b(d18.doubleValue());
            String strB3 = (cVar == null || (d17 = cVar.f63924d) == null) ? null : aVar.b(d17.doubleValue());
            String strC = (cVar == null || (d16 = cVar.f63922b) == null) ? null : aVar.c(d16.doubleValue());
            String strC2 = (cVar == null || (d15 = cVar.f63923c) == null) ? null : aVar.c(d15.doubleValue());
            String strC3 = (cVar == null || (d14 = cVar.f63924d) == null) ? null : aVar.c(d14.doubleValue());
            String strQ3 = y.Q(o0VarE, R.string.lbl_sleep_average);
            String strQ4 = y.Q(o0VarE, R.string.lbl_awake_average);
            String strQ5 = y.Q(o0VarE, R.string.no_value);
            String strP = "";
            if (cVar != null) {
                if (strC == null) {
                    strC = "";
                }
                strP = oi0.c.P(x.k(strC, strB3 != null ? oi0.c.P(x.k(strQ4, strC3)) : "", strB2 != null ? oi0.c.P(x.k(strQ3, strC2)) : ""));
            }
            t tVar = t.Y;
            String strD = tVar.d(a0.s(o0VarE), null);
            d dVar = cVar != null ? cVar.f63921a : null;
            u4.d dVarB = t.b(tVar);
            d0 d0VarE = tVar.e(null, o0VarE, 1);
            if (d0VarE == null) {
                o0VarE.C(-1277963136);
                jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
            } else {
                o0VarE.C(-1277965120);
                o0VarE.g0(false);
                jH = d0VarE.f128833a;
            }
            if (cVar == null) {
                zVar = z.EMPTY;
            } else {
                zVar = (cVar.f63922b == null && cVar.f63923c == null && cVar.f63924d == null) ? z.EMPTY : z.VALID_DATA;
                if (zVar == null) {
                    zVar = z.EMPTY;
                }
            }
            String strQ6 = y.Q(o0VarE, R.string.respiration_card_no_data_state_message);
            d0 d0VarA = d0.a(jH);
            e eVarC = f.c(59054550, new b(strP, strB, strQ5, strB3, strQ2, strB2, strQ, 0, (byte) 0), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new g(context, 11);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new g(context, 11);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            yz1.y.c(rVar, dVar, strD, null, dVarB, d0VarA, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC, (e23.a) objQ, zVar, strQ6, null, null, o0Var, i15 & 14, 24576, 802760);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(rVar, (Object) cVar, i14, 3);
        }
    }
}
