package w23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class s0 extends i43.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t23.c0 f181711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x33.c f181712c;

    public s0(t23.c0 c0Var, x33.c cVar) {
        c0Var.getClass();
        cVar.getClass();
        this.f181711b = c0Var;
        this.f181712c = cVar;
    }

    @Override // i43.m, i43.l
    public final Set<x33.f> e() {
        return p13.l0.f134950a;
    }

    @Override // i43.m, i43.o
    public final Collection<t23.l> g(i43.d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        lVar.getClass();
        i43.d.f91028c.getClass();
        if (!dVar.a(i43.d.f91032g)) {
            return p13.j0.f134944a;
        }
        x33.c cVar = this.f181712c;
        if (cVar.f188596a.c() && dVar.f91044a.contains(i43.c.b.f91027a)) {
            return p13.j0.f134944a;
        }
        t23.c0 c0Var = this.f181711b;
        Collection<x33.c> collectionJ = c0Var.j(cVar, lVar);
        ArrayList arrayList = new ArrayList(collectionJ.size());
        Iterator<x33.c> it = collectionJ.iterator();
        while (it.hasNext()) {
            x33.f fVarG = it.next().f188596a.g();
            if (lVar.invoke(fVarG).booleanValue()) {
                t23.n0 n0Var = null;
                if (!fVarG.f188606b) {
                    t23.n0 n0VarD0 = c0Var.d0(cVar.a(fVarG));
                    if (!n0VarD0.isEmpty()) {
                        n0Var = n0VarD0;
                    }
                }
                if (n0Var != null) {
                    arrayList.add(n0Var);
                }
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "subpackages of " + this.f181712c + " from " + this.f181711b;
    }
}
