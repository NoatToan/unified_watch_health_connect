package mr;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmr/n0;", "Lmr/k;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n0 extends k {
    @Override // mr.k, mr.d
    public final List<nr.k> a(r0 r0Var) {
        List<nr.k> listA = super.a(r0Var != null ? r0.a(r0Var, null, 95) : null);
        nr.k kVar = nr.k.LAPS;
        if (!listA.contains(kVar)) {
            return listA;
        }
        ps.r rVar = r0Var != null ? r0Var.f120292b : null;
        boolean zD = fr.a.d(rVar != null ? rVar.t() : null, qs.x.PACE_PRO_SPLIT);
        boolean zD2 = fr.a.d(rVar != null ? rVar.t() : null, qs.x.PACK_WEIGHT);
        boolean z14 = false;
        if (r0Var != null && r0Var.f120295e) {
            z14 = true;
        }
        if (zD && z14 && !zD2 && fr.a.c(rVar) == null) {
            kVar = nr.k.LAPS_COMPARISON;
        } else if (z14 && (zD || zD2 || fr.a.c(rVar) != null)) {
            kVar = nr.k.LAPS_MULTI_VIEW;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
        for (Object obj : listA) {
            nr.k kVar2 = (nr.k) obj;
            kVar2.getClass();
            if (kVar2 == nr.k.LAPS) {
                obj = kVar;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
