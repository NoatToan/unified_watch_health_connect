package n43;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f123632a;

    public g(n nVar) {
        this.f123632a = nVar;
    }

    @Override // e23.a
    public final Object invoke() {
        n nVar = this.f123632a;
        t23.a0 a0Var = nVar.f123658j;
        t23.a0 a0Var2 = t23.a0.SEALED;
        if (a0Var != a0Var2) {
            return p13.j0.f134944a;
        }
        List<Integer> list = nVar.f123654f.f156542w;
        list.getClass();
        if (list.isEmpty()) {
            b43.b.f15718a.getClass();
            if (nVar.f123658j != a0Var2) {
                return p13.j0.f134944a;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            t23.l lVar = nVar.f123666r;
            if (lVar instanceof t23.h0) {
                b43.b.a(nVar, linkedHashSet, ((t23.h0) lVar).i(), false);
            }
            i43.l lVarB0 = nVar.b0();
            lVarB0.getClass();
            b43.b.a(nVar, linkedHashSet, lVarB0, true);
            return p13.h0.N0(linkedHashSet, new b43.a());
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            l43.p pVar = nVar.f123661m;
            l43.n nVar2 = pVar.f110085a;
            u33.d dVar = pVar.f110086b;
            num.getClass();
            x33.b bVarA = l43.m0.a(dVar, num.intValue());
            l43.l lVar2 = nVar2.f110070t;
            l43.l.b bVar = l43.l.f110040c;
            lVar2.getClass();
            t23.e eVar = (t23.e) lVar2.f110043b.invoke(new l43.l.a(bVarA, null));
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }
}
