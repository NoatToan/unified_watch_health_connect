package n43;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p13.c1;
import p43.n0;
import t23.r0;
import t23.x0;

/* JADX INFO: loaded from: classes3.dex */
public class q implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n.c f123687a;

    public q(n.c cVar) {
        this.f123687a = cVar;
    }

    @Override // e23.a
    public final Object invoke() {
        n.c cVar = this.f123687a;
        cVar.getClass();
        HashSet hashSet = new HashSet();
        n nVar = n.this;
        n.b bVar = nVar.f123663o;
        l43.p pVar = nVar.f123661m;
        s33.c cVar2 = nVar.f123654f;
        Iterator<n0> it = bVar.b().iterator();
        while (it.hasNext()) {
            for (t23.l lVar : i43.o.a.a(it.next().i(), null, 3)) {
                if ((lVar instanceof x0) || (lVar instanceof r0)) {
                    hashSet.add(((t23.b) lVar).getName());
                }
            }
        }
        List<s33.j> list = cVar2.f156538q;
        list.getClass();
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            hashSet.add(x33.f.d(pVar.f110086b.getString(((s33.j) it3.next()).f156685f)));
        }
        List<s33.o> list2 = cVar2.f156539r;
        list2.getClass();
        Iterator<T> it4 = list2.iterator();
        while (it4.hasNext()) {
            hashSet.add(x33.f.d(pVar.f110086b.getString(((s33.o) it4.next()).f156771f)));
        }
        return c1.h(hashSet, hashSet);
    }
}
