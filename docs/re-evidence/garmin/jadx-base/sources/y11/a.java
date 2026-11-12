package y11;

import com.garmin.android.apps.connectmobile.R;
import e23.l;
import fb1.c;
import gl1.y;
import java.util.LinkedHashMap;
import l72.c1;
import p005kotlin.Unit;
import p008y1.y0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import wv0.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarP = c.p(aVar, aVar2, mVar, 1176497418);
        int i15 = (o0VarP.r(aVar) ? 4 : 2) | i14 | (o0VarP.r(aVar2) ? 32 : 16);
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarP, R.string.calories_install_mfp_title);
            String strP = y.P(R.string.calories_message_install_mfp_android, new Object[]{y.Q(o0VarP, R.string.lbl_play_store)}, o0VarP);
            c1 c1Var = c1.f110940a;
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            Object objQ = o0VarP.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new y0(4);
                o0VarP.K(objQ);
            }
            String strB = oi0.c.B(strQ, (l) objQ, o0VarP);
            LinkedHashMap linkedHashMap = c0235a.f16962a;
            linkedHashMap.put("title", strB);
            Object objQ2 = o0VarP.q();
            if (objQ2 == c2565a) {
                objQ2 = new y0(5);
                o0VarP.K(objQ2);
            }
            linkedHashMap.put("text", oi0.c.B(strP, (l) objQ2, o0VarP));
            b92.a aVarB = c0235a.b();
            String strQ2 = y.Q(o0VarP, R.string.lbl_play_store);
            String strQ3 = y.Q(o0VarP, R.string.lbl_cancel);
            boolean z14 = (i15 & 112) == 32;
            Object objQ3 = o0VarP.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new v(aVar2, 24);
                o0VarP.K(objQ3);
            }
            e23.a<Unit> aVar3 = (e23.a) objQ3;
            boolean z15 = (i15 & 14) == 4;
            Object objQ4 = o0VarP.q();
            if (z15 || objQ4 == c2565a) {
                objQ4 = new v(aVar, 25);
                o0VarP.K(objQ4);
            }
            e23.a<Unit> aVar4 = (e23.a) objQ4;
            int i16 = b92.a.f16960b;
            o0Var = o0VarP;
            c1Var.a(false, strQ, strP, null, aVarB, strQ2, false, false, aVar3, strQ3, aVar4, o0Var, 6, 0, 200);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar2, i14, 22);
        }
    }
}
