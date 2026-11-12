package mr;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmr/q0;", "Lmr/k;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 extends k {
    @Override // mr.k, mr.d
    public final List<nr.k> a(r0 r0Var) {
        List<nr.k> listA = super.a(r0Var);
        if (oe2.f.E(r0Var != null ? r0Var.f120292b : null)) {
            return listA;
        }
        nr.k kVar = nr.k.LAPS;
        listA.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
        for (Object obj : listA) {
            nr.k kVar2 = (nr.k) obj;
            kVar2.getClass();
            if (kVar2 == nr.k.WAVES) {
                obj = kVar;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
