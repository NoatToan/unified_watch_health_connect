package w23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements t23.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<t23.i0> f181662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181663b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(List<? extends t23.i0> list, String str) {
        list.getClass();
        str.getClass();
        this.f181662a = list;
        this.f181663b = str;
        list.size();
        p13.h0.g1(list).size();
    }

    @Override // t23.i0
    @o13.e
    public final List<t23.h0> a(x33.c cVar) {
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<t23.i0> it = this.f181662a.iterator();
        while (it.hasNext()) {
            oi0.c.m(it.next(), cVar, arrayList);
        }
        return p13.h0.b1(arrayList);
    }

    @Override // t23.m0
    public final boolean b(x33.c cVar) {
        cVar.getClass();
        List<t23.i0> list = this.f181662a;
        if (list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!oi0.c.M((t23.i0) it.next(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // t23.m0
    public final void c(x33.c cVar, ArrayList arrayList) {
        cVar.getClass();
        Iterator<t23.i0> it = this.f181662a.iterator();
        while (it.hasNext()) {
            oi0.c.m(it.next(), cVar, arrayList);
        }
    }

    @Override // t23.i0
    public final Collection<x33.c> j(x33.c cVar, e23.l<? super x33.f, Boolean> lVar) {
        cVar.getClass();
        lVar.getClass();
        HashSet hashSet = new HashSet();
        Iterator<t23.i0> it = this.f181662a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().j(cVar, lVar));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f181663b;
    }
}
