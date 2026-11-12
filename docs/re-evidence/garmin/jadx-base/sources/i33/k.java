package i33;

import java.util.Map;
import p13.k0;
import p13.t0;
import u23.p;

/* JADX INFO: loaded from: classes3.dex */
public class k implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f90807a;

    public k(l lVar) {
        this.f90807a = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    @Override // e23.a
    public final Object invoke() {
        d43.k kVar;
        p pVar;
        k23.l<Object>[] lVarArr = l.f90808h;
        f fVar = f.f90799a;
        o33.b bVar = this.f90807a.f90791d;
        fVar.getClass();
        Map mapB = null;
        o33.l lVar = bVar instanceof o33.l ? (o33.l) bVar : null;
        if (lVar == null || (pVar = (p) f.f90801c.get(lVar.c().b())) == null) {
            kVar = null;
        } else {
            x33.b.a aVar = x33.b.f188590d;
            x33.c cVar = kotlin.reflect.jvm.internal.impl.builtins.f.a.f105897w;
            aVar.getClass();
            kVar = new d43.k(x33.b.a.b(cVar), x33.f.e(pVar.name()));
        }
        if (kVar != null) {
            d.f90793a.getClass();
            mapB = t0.b(new o13.p(d.f90796d, kVar));
        }
        if (mapB != null) {
            return mapB;
        }
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        return k0Var;
    }
}
