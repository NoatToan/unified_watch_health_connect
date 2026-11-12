package mx;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import p13.h0;
import p13.w;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import yz1.k;
import z72.l;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:65:0x0130  */
    public static final void a(r rVar, gx.a aVar, m mVar, int i14) {
        int i15;
        String strJ;
        yz1.i iVar;
        Integer num;
        String strValueOf;
        Integer num2;
        o0 o0VarE = mVar.E(-1169857044);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            int iIntValue = (aVar == null || (num2 = aVar.f80002b) == null) ? 0 : num2.intValue();
            String strQ = (aVar == null || (num = aVar.f80002b) == null || (strValueOf = String.valueOf(num.intValue())) == null) ? y.Q(o0VarE, R.string.no_value) : strValueOf;
            f02.e.f67730a.getClass();
            long jC = f02.e.c(o0VarE);
            i53.f fVarA = i53.a.a(new l(0.25f, jC, null), new l(0.25f, jC, null), new l(0.25f, jC, null), new l(0.25f, jC, null));
            String strQ2 = y.Q(o0VarE, R.string.gcm_body_battery_lbl_body_battery);
            if (iIntValue > 0) {
                o0VarE.C(-1845668544);
                strJ = h0.k0(w.c(y.P(R.string.msg_value_out_of_100, new Object[]{strQ}, o0VarE)), ". ", null, null, null, 62);
                o0VarE.g0(false);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1845516365, R.string.no_data_label, o0VarE, false);
            }
            String str = strJ;
            yz1.d dVar = aVar != null ? aVar.f80001a : null;
            if (aVar == null) {
                iVar = yz1.i.EMPTY;
            } else {
                Integer num3 = aVar.f80002b;
                iVar = !(num3 != null && num3.intValue() >= 0) ? yz1.i.EMPTY : yz1.i.VALID_DATA;
            }
            yz1.i iVar2 = iVar;
            u4.d dVarB = o70.i.b(o70.i.f129999g);
            String strQ3 = y.Q(o0VarE, R.string.lbl_body_battery_no_data_track_info);
            z3.e eVarC = z3.f.c(-738597698, new a42.m(strQ2, str, fVarA, iIntValue, strQ), o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new l71.g(context, 5);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new l71.g(context, 5);
                    o0VarE.K(objQ);
                }
            }
            k.b(rVar, dVar, dVarB, eVarC, (e23.a) objQ, strQ3, iVar2, o0VarE, (i15 & 14) | 3072);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar, aVar, i14, 0);
        }
    }
}
