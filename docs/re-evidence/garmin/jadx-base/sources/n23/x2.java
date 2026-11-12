package n23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class x2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f122659a;

    public x2(f2 f2Var) {
        this.f122659a = f2Var;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = f2.b.f122443u;
        f2 f2Var = this.f122659a;
        Collection<t23.k> collectionH = f2Var.H();
        ArrayList arrayList = new ArrayList(p13.y.r(collectionH, 10));
        Iterator<T> it = collectionH.iterator();
        while (it.hasNext()) {
            arrayList.add(new t0(f2Var, (t23.k) it.next()));
        }
        return arrayList;
    }
}
