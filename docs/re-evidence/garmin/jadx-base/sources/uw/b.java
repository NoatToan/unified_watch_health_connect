package uw;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import kotlin.t1;
import o4.d0;
import o4.f0;
import o70.t;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import tz1.h;
import yw.c;
import yz1.d;
import yz1.z;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:102:0x0221  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:97:0x0205  */
    public static final void a(r rVar, kw.a aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strJ;
        long jB;
        String strP;
        Long l14;
        Integer num;
        r rVar2 = rVar;
        o0 o0VarE = mVar.E(-1199732500);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        int i17 = i15;
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.lbl_blood_pressure);
            yw.b bVar = new yw.b(context);
            String strB = bVar.b(aVar != null ? aVar.f106818b : null);
            if (strB.equals(y.Q(o0VarE, R.string.no_value))) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1891683081, R.string.lbl_no_status, o0VarE, false);
            } else {
                o0VarE.C(-1891681539);
                o0VarE.g0(false);
                strJ = strB;
            }
            if (aVar == null || (num = aVar.f106819c) == null) {
                d0.f128823b.getClass();
                jB = d0.f128832k;
            } else {
                jB = f0.b(context.getColor(num.intValue()));
            }
            String strA = bVar.a(aVar != null ? aVar.f106820d : null, aVar != null ? aVar.f106821e : null, c.NO_SPACES);
            String strU = (aVar == null || (l14 = aVar.f106822f) == null) ? null : j0.u(((long) new DateTime(l14.longValue(), DateTimeZone.getDefault()).getMillisOfDay()) / 60000);
            i53.c<kw.c> cVar = aVar != null ? aVar.f106823g : null;
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zR) {
                objQ = new h(context, i16);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new h(context, i16);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            o0VarE.C(-1891649138);
            Double d14 = aVar != null ? aVar.f106820d : null;
            Double d15 = aVar != null ? aVar.f106821e : null;
            if (d14 == null || d15 == null || strU == null) {
                strP = null;
            } else {
                double dDoubleValue = d15.doubleValue();
                double dDoubleValue2 = d14.doubleValue();
                l3.f23124b.getClass();
                String str = l3.f23131i.format(dDoubleValue2);
                str.getClass();
                String str2 = l3.f23131i.format(dDoubleValue);
                str2.getClass();
                strP = oi0.c.P(x.k(strJ, y.P(R.string.msg_systolic_over_diastolic, new Object[]{str, str2}, o0VarE), y.P(R.string.lbl_updated_date, new Object[]{strU}, o0VarE)));
            }
            o0VarE.g0(false);
            if (strP == null) {
                strP = strJ;
            }
            String strP2 = y.P(R.string.msg_view_last_7_day_feature_trend, new Object[]{strQ}, o0VarE);
            d dVar = aVar != null ? aVar.f106817a : null;
            t tVar = t.f130064h;
            u4.d dVarB = t.b(tVar);
            d0 d0VarE = tVar.e(null, o0VarE, 1);
            String strP3 = y.P(R.string.lbl_add_feature_button, new Object[]{strQ}, o0VarE);
            i53.c<kw.c> cVar2 = aVar != null ? aVar.f106823g : null;
            z zVar = (cVar2 == null || cVar2.isEmpty()) ? z.EMPTY : z.VALID_DATA;
            String strQ2 = y.Q(o0VarE, R.string.blood_pressure_card_no_data_state_message);
            String strQ3 = y.Q(o0VarE, R.string.lbl_add_reading);
            boolean zR2 = o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new h(context, 3);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new h(context, 3);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar4 = (e23.a) objQ2;
            e eVarC = f.c(113478928, new es.a(aVar, strP, strU, strB, strJ, jB, strA), o0VarE);
            e eVarC2 = f.c(236382865, new tb0.h(cVar, 17, context, strP2), o0VarE);
            boolean zR3 = o0VarE.r(context);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new h(context, 4);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new h(context, 4);
                    o0VarE.K(objQ3);
                }
            }
            e23.a aVar5 = (e23.a) objQ3;
            boolean zR4 = o0VarE.r(context);
            Object objQ4 = o0VarE.q();
            if (zR4) {
                objQ4 = new h(context, 5);
                o0VarE.K(objQ4);
            } else {
                aVar2.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new h(context, 5);
                    o0VarE.K(objQ4);
                }
            }
            o0Var = o0VarE;
            z zVar2 = zVar;
            rVar2 = rVar;
            yz1.y.d(rVar2, dVar, strQ, null, dVarB, d0VarE, 0.0f, R.drawable.ic_gcm_add_16, null, 0.0f, strP3, aVar4, false, 0L, null, eVarC, eVarC2, aVar3, aVar5, aVar3, zVar2, strQ2, strQ3, (e23.a) objQ4, o0Var, i17 & 14, 1769472, 0, 29512);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(rVar2, aVar, i14, 24);
        }
    }

    public static final float b(m mVar) {
        float f14;
        x1 x1Var = n.f135158a;
        if (((g6.c) mVar.A(t1.f91490h)).getF75992b() > 1.5f) {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            f14 = j92.b.f97901d.f97906e * 3;
            g6.f.a aVar = g6.f.f75994b;
        } else {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            f14 = j92.b.f97901d.f97903b * 3;
            g6.f.a aVar2 = g6.f.f75994b;
        }
        return f14 / 4;
    }
}
