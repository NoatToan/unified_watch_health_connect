package n43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class f0 extends z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t23.h0 f123628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s33.m f123629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f123630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x33.c f123631j;

    public f0(t23.h0 h0Var, s33.m mVar, u33.d dVar, u33.a aVar, v vVar, l43.n nVar, String str, e23.a<? extends Collection<x33.f>> aVar2) {
        h0Var.getClass();
        mVar.getClass();
        dVar.getClass();
        aVar.getClass();
        nVar.getClass();
        str.getClass();
        aVar2.getClass();
        s33.v vVar2 = mVar.f156742g;
        vVar2.getClass();
        u33.h hVar = new u33.h(vVar2);
        u33.j.a aVar3 = u33.j.f168343b;
        s33.y yVar = mVar.f156743h;
        yVar.getClass();
        aVar3.getClass();
        u33.j jVarA = u33.j.a.a(yVar);
        jVarA.getClass();
        l43.p pVar = new l43.p(nVar, dVar, h0Var, hVar, jVarA, aVar, vVar, null, p13.j0.f134944a);
        List<s33.j> list = mVar.f156739d;
        list.getClass();
        List<s33.o> list2 = mVar.f156740e;
        list2.getClass();
        List<s33.t> list3 = mVar.f156741f;
        list3.getClass();
        super(pVar, list, list2, list3, aVar2);
        this.f123628g = h0Var;
        this.f123629h = mVar;
        this.f123630i = str;
        this.f123631j = h0Var.c();
    }

    @Override // n43.z, i43.m, i43.o
    public final t23.h f(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        a33.a.a(this.f123696b.f110085a.f110059i, bVar, this.f123628g, fVar);
        return super.f(fVar, bVar);
    }

    @Override // i43.m, i43.o
    public final Collection g(i43.d dVar, e23.l lVar) {
        dVar.getClass();
        lVar.getClass();
        List listI = i(dVar, lVar, b33.b.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<v23.b> iterable = this.f123696b.f110085a.f110061k;
        ArrayList arrayList = new ArrayList();
        Iterator<v23.b> it = iterable.iterator();
        while (it.hasNext()) {
            p13.d0.v(arrayList, it.next().c(this.f123631j));
        }
        return p13.h0.C0(listI, arrayList);
    }

    @Override // n43.z
    public final void h(e23.l lVar, ArrayList arrayList) {
        lVar.getClass();
    }

    @Override // n43.z
    public final x33.b l(x33.f fVar) {
        fVar.getClass();
        return new x33.b(this.f123631j, fVar);
    }

    @Override // n43.z
    public final Set<x33.f> n() {
        return p13.l0.f134950a;
    }

    @Override // n43.z
    public final Set<x33.f> o() {
        return p13.l0.f134950a;
    }

    @Override // n43.z
    public final Set<x33.f> p() {
        return p13.l0.f134950a;
    }

    @Override // n43.z
    public final boolean q(x33.f fVar) {
        fVar.getClass();
        if (m().contains(fVar)) {
            return true;
        }
        Iterable<v23.b> iterable = this.f123696b.f110085a.f110061k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<v23.b> it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next().a(this.f123631j, fVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f123630i;
    }
}
