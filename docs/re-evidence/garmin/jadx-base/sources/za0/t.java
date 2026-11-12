package za0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.n0;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p3.l0;
import p3.o0;
import p3.p2;
import p3.x1;
import r53.b2;

/* JADX INFO: loaded from: classes8.dex */
public final class t {
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:51:0x0104  */
    public static final void a(i iVar, boolean z14, a4.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1488331751);
        int i15 = i14 | (o0VarE.r(iVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            n0 n0Var = (n0) o0VarE.A(s9.j.f158018a);
            b2 b2Var = iVar.f203253h;
            int i16 = i15 & 896;
            boolean zR = o0VarE.r(iVar) | (i16 == 256);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new r(iVar, aVar, null);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new r(iVar, aVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((e23.p) objQ, b2Var, o0VarE);
            boolean zR2 = o0VarE.r(iVar) | o0VarE.r(context) | o0VarE.r(n0Var);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new wn2.f(n0Var, 28, iVar, context);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new wn2.f(n0Var, 28, iVar, context);
                    o0VarE.K(objQ2);
                }
            }
            l0.a(n0Var, (e23.l) objQ2, o0VarE);
            String strQ = y.Q(o0VarE, R.string.lbl_notification_access);
            u4.d dVar = r90.a.f151345c.f151354b;
            String strQ2 = y.Q(o0VarE, R.string.smart_notifications_permission_explanation);
            String strQ3 = y.Q(o0VarE, R.string.lbl_allow_notification_access);
            boolean z15 = i16 == 256;
            Object objQ3 = o0VarE.q();
            if (z15) {
                objQ3 = new c(aVar, 3);
                o0VarE.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new c(aVar, 3);
                    o0VarE.K(objQ3);
                }
            }
            e23.a aVar4 = (e23.a) objQ3;
            boolean zR3 = o0VarE.r(iVar);
            Object objQ4 = o0VarE.q();
            if (zR3) {
                objQ4 = new yr.o0(iVar, 14);
                o0VarE.K(objQ4);
            } else {
                aVar3.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new yr.o0(iVar, 14);
                    o0VarE.K(objQ4);
                }
            }
            h.a("permissions_notifications_screen", strQ, dVar, strQ2, strQ3, z14, aVar4, (e23.a) objQ4, aVar2, o0VarE, ((i15 << 12) & 458752) | 390 | ((i15 << 15) & 234881024));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x72.m(iVar, z14, aVar, aVar2, i14, 6);
        }
    }
}
