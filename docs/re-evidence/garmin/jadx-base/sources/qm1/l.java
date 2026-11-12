package qm1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m92.h0;
import o4.f0;
import o70.t;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
public final class l {
    public static final u4.d a(k kVar) {
        t.b bVar = (kVar == null || !kVar.f145627h) ? t.b.f130095j : t.b.f130096k;
        t.a aVar = t.f130062f;
        String str = bVar.f130098a;
        aVar.getClass();
        u4.d dVarC = t.a.c(str);
        return dVarC == null ? t.b(t.Z) : dVarC;
    }

    public static final o b(k kVar) {
        if (d(kVar)) {
            return o.MANUAL;
        }
        return (kVar == null || !kVar.f145627h) ? o.SLEEP_LEGACY : o.SLEEP_SCORE;
    }

    public static final o70.n c(k kVar) {
        if (kVar == null || !kVar.f145623d.isEmpty() || kVar.f145628i) {
            return (kVar != null && kVar.f145623d.isEmpty() && kVar.f145628i) ? o70.n.EMPTY : o70.n.VALID_DATA;
        }
        return o70.n.GENESIS;
    }

    public static final boolean d(k kVar) {
        i53.c<n> cVar;
        if (kVar == null || (cVar = kVar.f145623d) == null || cVar.isEmpty()) {
            return false;
        }
        Iterator<n> it = cVar.iterator();
        while (it.hasNext()) {
            if (it.next().f145636a == rl1.k.MANUAL) {
                return true;
            }
        }
        return false;
    }

    public static final String e(k kVar, l22.a aVar) {
        t.b bVar = (kVar == null || !kVar.f145627h) ? t.b.f130095j : t.b.f130096k;
        t.a aVar2 = t.f130062f;
        String str = bVar.f130098a;
        aVar2.getClass();
        String strE = t.a.e(str, aVar);
        return strE == null ? t.Z.d(aVar, null) : strE;
    }

    public static final i53.c f(Context context, List list, boolean z14) {
        list.getClass();
        context.getClass();
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            n nVar = (n) obj;
            arrayList.add(new h0.e.c(new h0.e.a(i14, oc.b.r(nVar.f145636a, z14, true)), f0.b(context.getColor(nVar.f145636a.f153448b)), Float.valueOf(nVar.f145637b), null));
            i14 = i15;
        }
        return i53.a.e(arrayList);
    }
}
