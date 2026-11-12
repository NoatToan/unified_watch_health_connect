package l43;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f110036a;

    public k(l lVar) {
        this.f110036a = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        i iVarA;
        Object next;
        u33.d dVar;
        u33.a aVar;
        p pVar;
        t23.h0 h0Var;
        l.a aVar2 = (l.a) obj;
        l.b bVar = l.f110040c;
        aVar2.getClass();
        l lVar = this.f110036a;
        lVar.getClass();
        x33.b bVar2 = aVar2.f110044a;
        n nVar = lVar.f110042a;
        Iterator<v23.b> it = nVar.f110061k.iterator();
        while (it.hasNext()) {
            t23.e eVarB = it.next().b(bVar2);
            if (eVarB != null) {
                return eVarB;
            }
        }
        if (!l.f110041d.contains(bVar2) && ((iVarA = aVar2.f110045b) != null || (iVarA = nVar.f110054d.a(bVar2)) != null)) {
            u33.d dVar2 = iVarA.f110023a;
            s33.c cVar = iVarA.f110024b;
            u33.a aVar3 = iVarA.f110025c;
            t23.y0 y0Var = iVarA.f110026d;
            x33.b bVarE = bVar2.e();
            if (bVarE != null) {
                t23.e eVar = (t23.e) lVar.f110043b.invoke(new l.a(bVarE, null));
                n43.n nVar2 = eVar instanceof n43.n ? (n43.n) eVar : null;
                if (nVar2 != null) {
                    if (nVar2.E0().m().contains(bVar2.f())) {
                        pVar = nVar2.f123661m;
                        dVar = dVar2;
                        aVar = aVar3;
                        return new n43.n(pVar, cVar, dVar, aVar, y0Var);
                    }
                }
            } else {
                Iterator it3 = oi0.c.R(nVar.f110056f, bVar2.f188591a).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    h0Var = (t23.h0) next;
                    if (!(h0Var instanceof r)) {
                        break;
                    }
                } while (!((n43.z) ((u) ((r) h0Var)).i()).m().contains(bVar2.f()));
                t23.h0 h0Var2 = (t23.h0) next;
                if (h0Var2 != null) {
                    s33.v vVar = cVar.C;
                    vVar.getClass();
                    u33.h hVar = new u33.h(vVar);
                    u33.j.a aVar4 = u33.j.f168343b;
                    s33.y yVar = cVar.E;
                    yVar.getClass();
                    aVar4.getClass();
                    u33.j jVarA = u33.j.a.a(yVar);
                    jVarA.getClass();
                    dVar = dVar2;
                    aVar = aVar3;
                    pVar = new p(nVar, dVar, h0Var2, hVar, jVarA, aVar, null, null, p13.j0.f134944a);
                    return new n43.n(pVar, cVar, dVar, aVar, y0Var);
                }
            }
        }
        return null;
    }
}
