package p43;

import java.util.Collection;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f135861a;

    public k(n nVar) {
        this.f135861a = nVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        n.a aVar = (n.a) obj;
        aVar.getClass();
        n nVar = this.f135861a;
        t23.b1 b1VarH = nVar.h();
        Collection<n0> collection = aVar.f135890a;
        b1VarH.a(nVar, collection, new l(nVar), new m(nVar));
        if (collection.isEmpty()) {
            n0 n0VarF = nVar.f();
            List listC = n0VarF != null ? p13.w.c(n0VarF) : null;
            if (listC == null) {
                listC = p13.j0.f134944a;
            }
            collection = listC;
        }
        List<n0> listB1 = collection instanceof List ? (List) collection : null;
        if (listB1 == null) {
            listB1 = p13.h0.b1(collection);
        }
        List<n0> listJ = nVar.j(listB1);
        listJ.getClass();
        aVar.f135891b = listJ;
        return Unit.INSTANCE;
    }
}
