package mr;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmr/f;", "Lmr/k;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends k {
    @Override // mr.k, mr.d
    public final List<nr.k> a(r0 r0Var) {
        List<jr.u> listA;
        ArrayList arrayList = null;
        jr.d dVar = r0Var != null ? r0Var.f120291a : null;
        ps.r rVar = r0Var != null ? r0Var.f120292b : null;
        if (dVar != null && (listA = dVar.a()) != null) {
            arrayList = new ArrayList();
            for (Object obj : listA) {
                jr.u uVar = (jr.u) obj;
                boolean z14 = r0Var.f120294d;
                ps.p pVar = r0Var.f120297g;
                boolean z15 = p005kotlin.jvm.internal.s.g(r0Var.f120296f, Boolean.TRUE) || !r0Var.f120295e;
                if (uVar.d() == jr.v.LAPS ? l.b(rVar) || l.c(pVar, z15) : l.a(uVar, rVar, z14, pVar, z15)) {
                    arrayList.add(obj);
                }
            }
        }
        List<nr.k> listB0 = g8.i.b0(arrayList);
        if (listB0 == null) {
            listB0 = p13.j0.f134944a;
        }
        if (listB0.contains(nr.k.LAPS)) {
            if (rVar != null && oe2.f.D(rVar)) {
                nr.k kVar = nr.k.INTERVALS;
                ArrayList arrayList2 = new ArrayList(p13.y.r(listB0, 10));
                for (Object obj2 : listB0) {
                    nr.k kVar2 = (nr.k) obj2;
                    kVar2.getClass();
                    if (kVar2 == nr.k.LAPS) {
                        obj2 = kVar;
                    }
                    arrayList2.add(obj2);
                }
                return arrayList2;
            }
        }
        return listB0;
    }
}
