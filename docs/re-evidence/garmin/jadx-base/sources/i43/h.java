package i43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import p13.j0;
import t23.c1;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f91054b;

    public h(l lVar) {
        lVar.getClass();
        this.f91054b = lVar;
    }

    @Override // i43.m, i43.l
    public final Set<x33.f> b() {
        return this.f91054b.b();
    }

    @Override // i43.m, i43.l
    public final Set<x33.f> d() {
        return this.f91054b.d();
    }

    @Override // i43.m, i43.l
    public final Set<x33.f> e() {
        return this.f91054b.e();
    }

    @Override // i43.m, i43.o
    public final t23.h f(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        t23.h hVarF = this.f91054b.f(fVar, bVar);
        if (hVarF != null) {
            t23.e eVar = hVarF instanceof t23.e ? (t23.e) hVarF : null;
            if (eVar != null) {
                return eVar;
            }
            if (hVarF instanceof c1) {
                return (c1) hVarF;
            }
        }
        return null;
    }

    @Override // i43.m, i43.o
    public final Collection g(d dVar, e23.l lVar) {
        Collection collection;
        dVar.getClass();
        lVar.getClass();
        d.f91028c.getClass();
        int i14 = d.f91036k & dVar.f91045b;
        d dVar2 = i14 == 0 ? null : new d(i14, dVar.f91044a);
        if (dVar2 == null) {
            collection = j0.f134944a;
        } else {
            Collection<t23.l> collectionG = this.f91054b.g(dVar2, lVar);
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionG) {
                if (obj instanceof t23.i) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    public final String toString() {
        return "Classes from " + this.f91054b;
    }
}
