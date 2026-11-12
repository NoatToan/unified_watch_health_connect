package p43;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f135865a;

    public l(n nVar) {
        this.f135865a = nVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Collection<n0> collectionB;
        m1 m1Var = (m1) obj;
        m1Var.getClass();
        this.f135865a.getClass();
        n nVar = m1Var instanceof n ? (n) m1Var : null;
        if (nVar != null) {
            collectionB = p13.h0.C0(nVar.f135889b.invoke().f135890a, nVar.g(false));
        } else {
            collectionB = m1Var.b();
            collectionB.getClass();
        }
        return collectionB;
    }
}
