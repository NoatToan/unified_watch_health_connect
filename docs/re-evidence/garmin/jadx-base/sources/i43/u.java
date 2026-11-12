package i43;

import ds.e0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p43.a2;
import p43.w1;
import t23.a1;
import t23.r0;
import t23.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f91071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f91072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f91073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f91074e;

    public u(l lVar, a2 a2Var) {
        lVar.getClass();
        a2Var.getClass();
        this.f91071b = lVar;
        o13.m.b(new s(a2Var));
        w1 w1VarG = a2Var.g();
        w1VarG.getClass();
        this.f91072c = a2.e(dh.b.U(w1VarG));
        this.f91074e = o13.m.b(new t(this));
    }

    @Override // i43.l
    public final Collection<? extends r0> a(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return h(this.f91071b.a(fVar, bVar));
    }

    @Override // i43.l
    public final Set<x33.f> b() {
        return this.f91071b.b();
    }

    @Override // i43.l
    public final Collection<? extends x0> c(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return h(this.f91071b.c(fVar, bVar));
    }

    @Override // i43.l
    public final Set<x33.f> d() {
        return this.f91071b.d();
    }

    @Override // i43.l
    public final Set<x33.f> e() {
        return this.f91071b.e();
    }

    @Override // i43.o
    public final t23.h f(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        t23.h hVarF = this.f91071b.f(fVar, bVar);
        if (hVarF != null) {
            return (t23.h) i(hVarF);
        }
        return null;
    }

    @Override // i43.o
    public final Collection<t23.l> g(d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        lVar.getClass();
        return (Collection) this.f91074e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends t23.l> Collection<D> h(Collection<? extends D> collection) {
        if (this.f91072c.f135795a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((t23.l) it.next()));
        }
        return linkedHashSet;
    }

    public final <D extends t23.l> D i(D d14) {
        a2 a2Var = this.f91072c;
        if (a2Var.f135795a.e()) {
            return d14;
        }
        if (this.f91073d == null) {
            this.f91073d = new HashMap();
        }
        HashMap map = this.f91073d;
        map.getClass();
        Object objB = map.get(d14);
        if (objB == null) {
            if (!(d14 instanceof a1)) {
                e0.t(d14, "Unknown descriptor in scope: ");
                return null;
            }
            objB = ((a1) d14).b(a2Var);
            if (objB == null) {
                p6.b.o("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ", d14, " substitution fails");
                return null;
            }
            map.put(d14, objB);
        }
        return (D) objB;
    }
}
