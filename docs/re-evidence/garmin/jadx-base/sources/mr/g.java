package mr;

import am.x0;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import ps.o1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmr/g;", "Lmr/k;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends k {
    @Override // mr.k, mr.d
    public final List<nr.k> a(r0 r0Var) {
        Boolean boolValueOf;
        x0 x0VarH;
        List<nr.k> listA = super.a(r0Var != null ? r0.a(r0Var, null, 95) : null);
        nr.k kVar = nr.k.LAPS;
        if (!listA.contains(kVar)) {
            return listA;
        }
        ps.r rVar = r0Var != null ? r0Var.f120292b : null;
        List<o1> listT = rVar != null ? rVar.t() : null;
        if (rVar == null || (x0VarH = rVar.h()) == null) {
            boolValueOf = null;
        } else {
            cq.y.f55115a.getClass();
            boolValueOf = Boolean.valueOf(cq.y.a.c(x0VarH) && fr.a.d(listT, qs.x.CLIMB_PRO_CYCLING_CLIMB, qs.x.CLIMB_PRO_CYCLING_CLIMB_SECTION));
        }
        if (fr.a.d(rVar != null ? rVar.t() : null, qs.x.POWER_GUIDE_SPLIT)) {
            kVar = nr.k.LAPS_COMPARISON;
        } else if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE) && oe2.f.E(rVar)) {
            kVar = nr.k.SPLITS;
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
