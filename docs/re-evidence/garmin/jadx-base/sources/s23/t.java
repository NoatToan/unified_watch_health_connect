package s23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p43.n0;

/* JADX INFO: loaded from: classes3.dex */
public class t implements z43.b.InterfaceC3774b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f156288a;

    public t(u uVar) {
        this.f156288a = uVar;
    }

    @Override // z43.b.InterfaceC3774b
    public final Iterable a(Object obj) {
        k23.l<Object>[] lVarArr = u.f156289i;
        Collection<n0> collectionB = ((t23.e) obj).h().b();
        collectionB.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionB.iterator();
        while (it.hasNext()) {
            t23.h hVarT = ((n0) it.next()).F0().t();
            t23.e eVarF = null;
            t23.h hVarA = hVarT != null ? hVarT.a() : null;
            t23.e eVar = hVarA instanceof t23.e ? (t23.e) hVarA : null;
            if (eVar != null && (eVarF = this.f156288a.f(eVar)) == null) {
                eVarF = eVar;
            }
            if (eVarF != null) {
                arrayList.add(eVarF);
            }
        }
        return arrayList;
    }
}
