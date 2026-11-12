package l33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class m0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f109789a;

    public m0(u0 u0Var) {
        this.f109789a = u0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        x33.f fVar = (x33.f) obj;
        k23.l<Object>[] lVarArr = u0.f109809m;
        fVar.getClass();
        u0 u0Var = this.f109789a;
        u0 u0Var2 = u0Var.f109811c;
        if (u0Var2 != null) {
            return (Collection) ((o43.e.k) u0Var2.f109814f).invoke(fVar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<o33.o> it = u0Var.f109813e.invoke().c(fVar).iterator();
        while (it.hasNext()) {
            j33.e eVarT = u0Var.t(it.next());
            if (u0Var.r(eVarT)) {
                u0Var.f109810b.f102785a.f102757g.getClass();
                arrayList.add(eVarT);
            }
        }
        u0Var.j(arrayList, fVar);
        return arrayList;
    }
}
