package ta0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class i1 {
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    public static final void a(ca0.u0 u0Var, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(353237848);
        int i15 = (o0VarE.r(u0Var) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new s70.r(context, 20);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new s70.r(context, 20);
                    o0VarE.K(objQ);
                }
            }
            b(u0Var, (e23.a) objQ, o0VarE, i15 & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s5.a(u0Var, i14, 23);
        }
    }

    public static final void b(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-1871741451);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_next);
            String strQ2 = gl1.y.Q(o0VarE, R.string.startup_shop_garmin);
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            i.f163361a.getClass();
            da0.p.a("device_discovery_more_from_garmin_screen", strQ, aVar, false, strQ2, aVar2, false, false, cVar, null, i.f163362b, o0VarE, ((i15 << 6) & 896) | 6 | ((i15 << 12) & 458752), 102236160, 196552);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.l(aVar, aVar2, i14, 12, (byte) 0);
        }
    }
}
