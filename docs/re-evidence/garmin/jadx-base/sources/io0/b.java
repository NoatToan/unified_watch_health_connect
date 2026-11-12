package io0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import et.p;
import gl1.y;
import h4.r;
import hy.h;
import o4.d0;
import o70.t;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import w2.a0;
import yz1.z;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0169  */
    public static final void a(r rVar, go0.e.a aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        String str;
        String str2;
        String strP;
        Long l14;
        Long l15;
        r rVar2 = rVar;
        o0 o0VarE = mVar.E(-1022328221);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            l22.a aVarS = a0.s(o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.lbl_heart_rate_cap);
            String strQ2 = y.Q(o0VarE, R.string.lbl_resting_heart_rate);
            String strQ3 = y.Q(o0VarE, R.string.no_value);
            String strQ4 = y.Q(o0VarE, R.string.no_data_label);
            boolean zR = o0VarE.r(aVarS) | o0VarE.B(strQ3);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zR) {
                objQ = new h(23, aVarS, strQ3);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new h(23, aVarS, strQ3);
                    o0VarE.K(objQ);
                }
            }
            l lVar = (l) objQ;
            if (aVar == null || (l15 = aVar.f78190b) == null || (str = (String) lVar.invoke(Long.valueOf(l15.longValue()))) == null) {
                str = strQ3;
            }
            if (aVar == null || (l14 = aVar.f78191c) == null || (str2 = (String) lVar.invoke(Long.valueOf(l14.longValue()))) == null) {
                str2 = strQ3;
            }
            if (!s.g(str, strQ3)) {
                oi0.b bVar = new oi0.b(aVarS, str);
                bVar.b();
                String str3 = bVar.f132238b;
                if (aVar == null || aVar.f78191c == null) {
                    strP = "";
                } else {
                    oi0.b bVar2 = new oi0.b(aVarS, str2);
                    bVar2.b();
                    strP = oi0.c.P(x.k(strQ2, bVar2.f132238b));
                }
                strQ4 = oi0.c.P(x.k(str3, strP));
            }
            String str4 = strQ4;
            yz1.d dVar = aVar != null ? aVar.f78189a : null;
            t.a aVar3 = t.f130062f;
            t tVar = t.f130077v;
            String str5 = tVar.f130082a;
            aVar3.getClass();
            u4.d dVarC = t.a.c(str5);
            d0 d0VarE = tVar.e(null, o0VarE, 1);
            r.a aVar4 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = c2.l.A(aVar4, 0.0f, eVar.f97920e, 1);
            bVar3.getClass();
            r rVarA2 = c2.l.A(aVar4, eVar.f97920e, 0.0f, 2);
            z3.e eVarC = f.c(-467467808, new p(str4, str, aVar, str2, strQ2, 28), o0VarE);
            boolean zR2 = o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new ho0.a(context, 6);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new ho0.a(context, 6);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            rVar2 = rVar;
            yz1.y.c(rVar2, dVar, strQ, null, dVarC, d0VarE, 0.0f, 0, null, 0.0f, null, rVarA, rVarA2, null, eVarC, (e23.a) objQ2, (aVar == null || !aVar.f78198j) ? z.EMPTY : z.VALID_DATA, y.Q(o0VarE, R.string.heart_rate_no_data_state_message), null, null, o0Var, i16 & 14, 24576, 796616);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(rVar2, aVar, i14, 2);
        }
    }
}
