package l43;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u33.d f110071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u33.a f110072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<x33.b, t23.y0> f110073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f110074d;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(s33.n nVar, u33.d dVar, u33.a aVar, e23.l<? super x33.b, ? extends t23.y0> lVar) {
        nVar.getClass();
        dVar.getClass();
        aVar.getClass();
        lVar.getClass();
        this.f110071a = dVar;
        this.f110072b = aVar;
        this.f110073c = lVar;
        List<s33.c> list = nVar.f156759g;
        list.getClass();
        int iA = p13.t0.a(p13.y.r(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj : list) {
            linkedHashMap.put(m0.a(this.f110071a, ((s33.c) obj).f156526e), obj);
        }
        this.f110074d = linkedHashMap;
    }

    @Override // l43.j
    public final i a(x33.b bVar) {
        s33.c cVar = (s33.c) this.f110074d.get(bVar);
        if (cVar == null) {
            return null;
        }
        return new i(this.f110071a, cVar, this.f110072b, this.f110073c.invoke(bVar));
    }
}
