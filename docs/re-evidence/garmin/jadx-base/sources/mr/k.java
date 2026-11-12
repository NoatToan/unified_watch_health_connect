package mr;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmr/k;", "Lmr/d;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class k implements d {
    @Override // mr.d
    public List<nr.k> a(r0 r0Var) {
        ArrayList arrayList;
        jr.d dVar;
        List<jr.u> listA;
        if (r0Var == null || (dVar = r0Var.f120291a) == null || (listA = dVar.a()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : listA) {
                if (l.a((jr.u) obj, r0Var.f120292b, r0Var.f120294d, r0Var.f120297g, p005kotlin.jvm.internal.s.g(r0Var.f120296f, Boolean.TRUE))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayListB0 = g8.i.b0(arrayList);
        return arrayListB0 == null ? p13.j0.f134944a : arrayListB0;
    }
}
