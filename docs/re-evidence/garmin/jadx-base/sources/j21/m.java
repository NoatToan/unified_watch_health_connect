package j21;

import b21.s0;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.g0;
import e2.f0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p005kotlin.Unit;
import yc.z0;

/* JADX INFO: loaded from: classes9.dex */
public final class m {
    public static final void a(f0 f0Var, boolean z14, c3 c3Var, c3 c3Var2, zc.d<g01.n> dVar, v21.e eVar, e23.l<? super b11.a, Unit> lVar, e23.l<? super b11.a, Unit> lVar2, e23.l<? super b11.a, Unit> lVar3) {
        f0Var.getClass();
        eVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        List<g01.n> list = dVar.c().f196336d;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((g01.n) obj).a())) {
                arrayList.add(obj);
            }
        }
        f0.f(f0Var, arrayList.size(), new g0(5, arrayList), new z3.e(917851684, true, new s0(dVar, eVar, z14, c3Var, c3Var2, lVar, lVar2, lVar3)), 4);
        if (dVar.d().f196387c instanceof z0.b) {
            b.f96637a.getClass();
            f0.b(f0Var, null, b.f96638b, 3);
        }
    }

    public static void b(f0 f0Var, zc.d dVar, v21.e eVar, e23.l lVar, e23.l lVar2) {
        a(f0Var, false, c22.i.b(R.string.delete_custom_food), c22.i.b(R.string.delete_food_this_cannot_be_undone), dVar, eVar, lVar, lVar2, new j02.r(8));
    }
}
