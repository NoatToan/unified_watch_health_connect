package b53;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p13.y;
import p43.n0;

/* JADX INFO: loaded from: classes3.dex */
public class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t23.e f16124a;

    public j(t23.e eVar) {
        this.f16124a = eVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        k23.l<Object>[] lVarArr = l.f16126f;
        ((p) obj).getClass();
        Collection<n0> collectionB = this.f16124a.h().b();
        collectionB.getClass();
        Collection<n0> collection = collectionB;
        ArrayList arrayList = new ArrayList(y.r(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new l((n0) it.next(), null, 2, null));
        }
        return arrayList;
    }
}
