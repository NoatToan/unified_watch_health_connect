package u23;

import c53.c0;
import java.util.Iterator;
import java.util.List;
import p13.h0;
import p13.u;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h> f168237a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(h... hVarArr) {
        this((List<? extends h>) u.i0(hVarArr));
        hVarArr.getClass();
    }

    @Override // u23.h
    public final boolean I3(x33.c cVar) {
        cVar.getClass();
        Iterator it = h0.M(this.f168237a).f134939a.iterator();
        while (it.hasNext()) {
            if (((h) it.next()).I3(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // u23.h
    public final boolean isEmpty() {
        List<h> list = this.f168237a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((h) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<c> iterator() {
        return new c53.h.a(c0.k(h0.M(this.f168237a), m.f168236a));
    }

    @Override // u23.h
    public final c z(x33.c cVar) {
        cVar.getClass();
        return (c) c0.j(c0.p(h0.M(this.f168237a), new l(cVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(List<? extends h> list) {
        list.getClass();
        this.f168237a = list;
    }
}
