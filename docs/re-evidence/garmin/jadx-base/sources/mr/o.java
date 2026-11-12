package mr;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmr/o;", "Lmr/k;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends k {
    @Override // mr.k, mr.d
    public final List<nr.k> a(r0 r0Var) {
        List<nr.k> listA = super.a(r0Var);
        nr.k kVar = nr.k.RUNS;
        if (listA.contains(kVar)) {
            if (oe2.f.E(r0Var != null ? r0Var.f120292b : null)) {
                nr.k kVar2 = nr.k.SKI_RUNS_SPLITS;
                ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
                for (Object obj : listA) {
                    nr.k kVar3 = (nr.k) obj;
                    kVar3.getClass();
                    if (kVar3 == nr.k.RUNS) {
                        obj = kVar2;
                    }
                    arrayList.add(obj);
                }
                return arrayList;
            }
        }
        if (listA.contains(kVar)) {
            if (!oe2.f.E(r0Var != null ? r0Var.f120292b : null)) {
                nr.k kVar4 = nr.k.SKI_RUNS_LAPS;
                ArrayList arrayList2 = new ArrayList(p13.y.r(listA, 10));
                for (Object obj2 : listA) {
                    nr.k kVar5 = (nr.k) obj2;
                    kVar5.getClass();
                    if (kVar5 == nr.k.RUNS) {
                        obj2 = kVar4;
                    }
                    arrayList2.add(obj2);
                }
                return arrayList2;
            }
        }
        return listA;
    }
}
