package g43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k33.i;
import p13.d0;
import w23.n0;
import x33.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<e> f75849b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends e> list) {
        list.getClass();
        this.f75849b = list;
    }

    @Override // g43.e
    public final n0 a(t23.e eVar, n0 n0Var, i iVar) {
        n0Var.getClass();
        iVar.getClass();
        Iterator<T> it = this.f75849b.iterator();
        while (it.hasNext()) {
            n0Var = ((e) it.next()).a(eVar, n0Var, iVar);
        }
        return n0Var;
    }

    @Override // g43.e
    public final void b(t23.e eVar, f fVar, ArrayList arrayList, i iVar) {
        eVar.getClass();
        fVar.getClass();
        iVar.getClass();
        Iterator<T> it = this.f75849b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b(eVar, fVar, arrayList, iVar);
        }
    }

    @Override // g43.e
    public final ArrayList c(t23.e eVar, i iVar) {
        eVar.getClass();
        iVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f75849b.iterator();
        while (it.hasNext()) {
            d0.v(arrayList, ((e) it.next()).c(eVar, iVar));
        }
        return arrayList;
    }

    @Override // g43.e
    public final void d(t23.e eVar, f fVar, ArrayList arrayList, i iVar) {
        eVar.getClass();
        fVar.getClass();
        iVar.getClass();
        Iterator<T> it = this.f75849b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).d(eVar, fVar, arrayList, iVar);
        }
    }

    @Override // g43.e
    public final void e(t23.e eVar, f fVar, q13.b bVar, i iVar) {
        eVar.getClass();
        fVar.getClass();
        iVar.getClass();
        Iterator<T> it = this.f75849b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).e(eVar, fVar, bVar, iVar);
        }
    }

    @Override // g43.e
    public final ArrayList f(t23.e eVar, i iVar) {
        eVar.getClass();
        iVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f75849b.iterator();
        while (it.hasNext()) {
            d0.v(arrayList, ((e) it.next()).f(eVar, iVar));
        }
        return arrayList;
    }

    @Override // g43.e
    public final void g(t23.e eVar, ArrayList arrayList, i iVar) {
        eVar.getClass();
        iVar.getClass();
        Iterator<T> it = this.f75849b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).g(eVar, arrayList, iVar);
        }
    }

    @Override // g43.e
    public final ArrayList h(t23.e eVar, i iVar) {
        eVar.getClass();
        iVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f75849b.iterator();
        while (it.hasNext()) {
            d0.v(arrayList, ((e) it.next()).h(eVar, iVar));
        }
        return arrayList;
    }
}
