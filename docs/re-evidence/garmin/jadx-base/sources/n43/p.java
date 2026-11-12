package n43;

import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n.c f123685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f123686b;

    public p(n.c cVar, n nVar) {
        this.f123685a = cVar;
        this.f123686b = nVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        x33.f fVar = (x33.f) obj;
        fVar.getClass();
        n.c cVar = this.f123685a;
        s33.h hVar = (s33.h) cVar.f123680a.get(fVar);
        if (hVar == null) {
            return null;
        }
        n nVar = this.f123686b;
        return w23.s.E0(nVar.f123661m.f110085a.f110051a, nVar, fVar, cVar.f123682c, new a(nVar.f123661m.f110085a.f110051a, new r(nVar, hVar)), y0.f162076a);
    }
}
