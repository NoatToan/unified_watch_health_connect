package v01;

import android.content.Context;
import com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.PhotoCategory;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(Context context, y22.x xVar, String str, q1 q1Var, v13.c cVar) throws Throwable {
        k kVar;
        List<f01.d> list;
        f01.d dVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f174446b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f174446b = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(cVar);
            }
        } else {
            kVar = new k(cVar);
        }
        Object objE0 = kVar.f174445a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f174446b;
        if (i15 == 0) {
            o13.r.b(objE0);
            PhotoCategory photoCategory = PhotoCategory.RECIPE;
            kVar.f174446b = 1;
            objE0 = ge1.b.e0(q1Var.f174513b, new r1(q1Var, context, xVar, photoCategory, str, null), kVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.b) {
            f01.e eVar = (f01.e) ((v2.b) v2Var).f47386a;
            return ((eVar == null || (list = eVar.f67688a) == null || (dVar = (f01.d) p13.h0.d0(list)) == null) ? null : dVar.f67684a) == null ? q01.b.C2663b.f141983a : q01.b.c.f141984a;
        }
        if (v2Var instanceof v2.a) {
            return q01.b.C2663b.f141983a;
        }
        lc.u0.r();
        return null;
    }
}
