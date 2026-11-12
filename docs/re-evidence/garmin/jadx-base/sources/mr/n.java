package mr;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmr/n;", "Lmr/k;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends k {
    @Override // mr.k, mr.d
    public final List<nr.k> a(r0 r0Var) {
        ArrayList arrayList;
        ps.p pVar;
        List<x1> listI;
        List<nr.k> listA = super.a(r0Var);
        if (r0Var == null || (pVar = r0Var.f120297g) == null || (listI = pVar.i()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : listI) {
                if (((x1) obj).a2() == qs.x.DOWNHILL_RUN) {
                    arrayList.add(obj);
                }
            }
        }
        boolean z14 = arrayList == null || arrayList.isEmpty();
        if (listA.contains(nr.k.RUNS) && z14) {
            nr.k kVar = nr.k.SKI_RUNS_LAPS;
            ArrayList arrayList2 = new ArrayList(p13.y.r(listA, 10));
            for (Object obj2 : listA) {
                nr.k kVar2 = (nr.k) obj2;
                kVar2.getClass();
                if (kVar2 == nr.k.RUNS) {
                    obj2 = kVar;
                }
                arrayList2.add(obj2);
            }
            return arrayList2;
        }
        nr.k kVar3 = nr.k.SKI_RUNS_SPLITS;
        ArrayList arrayList3 = new ArrayList(p13.y.r(listA, 10));
        for (Object obj3 : listA) {
            nr.k kVar4 = (nr.k) obj3;
            kVar4.getClass();
            if (kVar4 == nr.k.RUNS) {
                obj3 = kVar3;
            }
            arrayList3.add(obj3);
        }
        return arrayList3;
    }
}
