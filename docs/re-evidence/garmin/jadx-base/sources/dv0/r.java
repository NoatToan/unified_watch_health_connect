package dv0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import cw1.p0;
import gl1.y;
import o4.e0;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class r {
    /* JADX WARN: Code duplicated, block: B:20:0x0083  */
    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 97783282);
        int i15 = (o0VarP.r(aVar) ? 4 : 2) | i14;
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            g82.c cVar = g82.c.f76436a;
            g6.f.a aVar3 = g6.f.f75994b;
            g82.c.C1532c c1532c = new g82.c.C1532c(R.drawable.live_track, x2.q(h4.r.S, 128), null, null, e0.a.a(e0.f128843b, n5.a.a(o0VarP, R.color.gcm_dialog_icon_action)), 12, null);
            String strQ = y.Q(o0VarP, R.string.lbl_welcome_livetrack_plus);
            String strQ2 = y.Q(o0VarP, R.string.msg_livetrack_personalized_url);
            String strQ3 = y.Q(o0VarP, R.string.lbl_setup_livetrack_profile);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarP.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (z14) {
                objQ = new p0(aVar, 19);
                o0VarP.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p0(aVar, 19);
                    o0VarP.K(objQ);
                }
            }
            e23.a aVar5 = (e23.a) objQ;
            String strQ4 = y.Q(o0VarP, R.string.lbl_dismiss);
            Object objQ2 = o0VarP.q();
            aVar4.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new p0(aVar2, 20);
                o0VarP.K(objQ2);
            }
            e23.a aVar6 = (e23.a) objQ2;
            Object objQ3 = o0VarP.q();
            aVar4.getClass();
            if (objQ3 == c2565a) {
                objQ3 = new p0(aVar2, 21);
                o0VarP.K(objQ3);
            }
            cVar.c(c1532c, strQ, strQ2, 0, strQ3, aVar5, strQ4, aVar6, false, (e23.a) objQ3, o0VarP, 100663296, 8);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 11);
        }
    }
}
