package n43;

import java.util.Iterator;
import java.util.List;
import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f123621a;

    public d(n nVar) {
        this.f123621a = nVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Object next;
        n nVar = this.f123621a;
        if (nVar.f123660l.a()) {
            y0.a aVar = y0.f162076a;
            if (aVar == null) {
                b43.h.a(21);
                throw null;
            }
            b43.h.a aVar2 = new b43.h.a(nVar, aVar, false);
            aVar2.M0(nVar.p());
            return aVar2;
        }
        List<s33.e> list = nVar.f123654f.f156537p;
        list.getClass();
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (u33.b.f168308n.d(((s33.e) next).f156591d).booleanValue());
        s33.e eVar = (s33.e) next;
        if (eVar != null) {
            return nVar.f123661m.f110093i.e(eVar, true);
        }
        return null;
    }
}
