package bv1;

import c2.x2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.e3;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    public static final void a(List<av1.b> list, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-597895395);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            hw1.d.a(null, z3.f.c(-757575652, new a31.a(list, 1), o0VarE), o0VarE, 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a31.b(list, i14, 6);
        }
    }

    public static final void b(av1.b bVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-557502317);
        int i15 = (o0VarE.r(bVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            e3 e3Var = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            ActivityListItemDTO activityListItemDTO = bVar.f13243a;
            boolean z14 = bVar.f13244b;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new bv0.b(8);
                o0VarE.K(objQ);
            }
            e3Var.v(3078, activityListItemDTO, (e23.a) objQ, rVarF, o0VarE, z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a61.d(bVar, i14, 23);
        }
    }
}
