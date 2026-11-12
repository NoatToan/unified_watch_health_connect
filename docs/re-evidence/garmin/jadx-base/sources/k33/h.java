package k33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l33.e0;
import p13.j0;
import p13.w;
import t23.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f102783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o43.a<x33.c, e0> f102784b;

    public h(c cVar) {
        cVar.getClass();
        i iVar = new i(cVar, n.a.f102796a, new o13.i(null));
        this.f102783a = iVar;
        this.f102784b = iVar.f102785a.f102751a.c();
    }

    @Override // t23.i0
    @o13.e
    public final List<e0> a(x33.c cVar) {
        cVar.getClass();
        return w.c(d(cVar));
    }

    @Override // t23.m0
    public final boolean b(x33.c cVar) {
        cVar.getClass();
        this.f102783a.f102785a.f102752b.b(cVar);
        return false;
    }

    @Override // t23.m0
    public final void c(x33.c cVar, ArrayList arrayList) {
        cVar.getClass();
        arrayList.add(d(cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e0 d(x33.c cVar) throws Throwable {
        g gVar = new g(this, this.f102783a.f102785a.f102752b.b(cVar));
        o43.e.b bVar = (o43.e.b) this.f102784b;
        bVar.getClass();
        V vInvoke = bVar.invoke(new o43.e.C2474e(cVar, gVar));
        if (vInvoke != 0) {
            return (e0) vInvoke;
        }
        o43.e.b.a(3);
        throw null;
    }

    @Override // t23.i0
    public final Collection j(x33.c cVar, e23.l lVar) {
        cVar.getClass();
        lVar.getClass();
        List<x33.c> listInvoke = d(cVar).f109731k.invoke();
        return listInvoke == null ? j0.f134944a : listInvoke;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f102783a.f102785a.f102765o;
    }
}
