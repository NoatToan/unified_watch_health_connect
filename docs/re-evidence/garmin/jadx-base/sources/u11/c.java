package u11;

import com.garmin.android.apps.connectmobile.R;
import ds.g;
import gl1.y;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import t70.a1;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-826583805);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16) | (o0VarE.r(aVar3) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            g82.c cVar = g82.c.f76436a;
            String strP = y.P(R.string.hand_alignment_camera_permission_title, new Object[]{y.Q(o0VarE, R.string.connect)}, o0VarE);
            String strQ = y.Q(o0VarE, R.string.msg_camera_permission_required);
            String strQ2 = y.Q(o0VarE, R.string.lbl_allow_access);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            m.a aVar4 = m.f135153a;
            if (z14) {
                objQ = new a1(aVar, 26);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a1(aVar, 26);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar5 = (e23.a) objQ;
            String strQ3 = y.Q(o0VarE, R.string.common_do_not_allow);
            boolean z15 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new a1(aVar2, 27);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new a1(aVar2, 27);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar6 = (e23.a) objQ2;
            boolean z16 = (i15 & 896) == 256;
            Object objQ3 = o0VarE.q();
            if (z16) {
                objQ3 = new a1(aVar3, 28);
                o0VarE.K(objQ3);
            } else {
                aVar4.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new a1(aVar3, 28);
                    o0VarE.K(objQ3);
                }
            }
            cVar.c(null, strP, strQ, 0, strQ2, aVar5, strQ3, aVar6, false, (e23.a) objQ3, o0VarE, 100663296, 9);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(aVar, aVar2, aVar3, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    public static final void b(e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(744209203);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16) | (o0VarE.r(aVar3) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            g82.c cVar = g82.c.f76436a;
            String strQ = y.Q(o0VarE, R.string.lbl_camera_access_needed);
            String strQ2 = y.Q(o0VarE, R.string.msg_camera_access_needed);
            String strQ3 = y.Q(o0VarE, R.string.lbl_settings);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            m.a aVar4 = m.f135153a;
            if (z14) {
                objQ = new a1(aVar, 29);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a1(aVar, 29);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar5 = (e23.a) objQ;
            String strQ4 = y.Q(o0VarE, R.string.lbl_cancel);
            boolean z15 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new b(aVar2, 0);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new b(aVar2, 0);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar6 = (e23.a) objQ2;
            boolean z16 = (i15 & 896) == 256;
            Object objQ3 = o0VarE.q();
            if (z16) {
                objQ3 = new b(aVar3, 1);
                o0VarE.K(objQ3);
            } else {
                aVar4.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new b(aVar3, 1);
                    o0VarE.K(objQ3);
                }
            }
            cVar.c(null, strQ, strQ2, 0, strQ3, aVar5, strQ4, aVar6, false, (e23.a) objQ3, o0VarE, 100663296, 9);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(aVar, aVar2, aVar3, i14, 4);
        }
    }
}
