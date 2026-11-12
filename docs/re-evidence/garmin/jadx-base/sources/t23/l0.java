package t23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection<h0> f162028a;

    /* JADX WARN: Multi-variable type inference failed */
    public l0(Collection<? extends h0> collection) {
        collection.getClass();
        this.f162028a = collection;
    }

    @Override // t23.i0
    @o13.e
    public final List<h0> a(x33.c cVar) {
        cVar.getClass();
        Collection<h0> collection = this.f162028a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (p005kotlin.jvm.internal.s.g(((h0) obj).c(), cVar)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // t23.m0
    public final boolean b(x33.c cVar) {
        cVar.getClass();
        Collection<h0> collection = this.f162028a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (p005kotlin.jvm.internal.s.g(((h0) it.next()).c(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // t23.m0
    public final void c(x33.c cVar, ArrayList arrayList) {
        cVar.getClass();
        for (Object obj : this.f162028a) {
            if (p005kotlin.jvm.internal.s.g(((h0) obj).c(), cVar)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // t23.i0
    public final Collection<x33.c> j(x33.c cVar, e23.l<? super x33.f, Boolean> lVar) {
        cVar.getClass();
        lVar.getClass();
        return c53.c0.s(c53.c0.h(c53.c0.o(new p13.g0(this.f162028a), j0.f162026a), new k0(cVar)));
    }
}
