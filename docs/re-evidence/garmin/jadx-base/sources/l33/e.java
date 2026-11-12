package l33;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements i43.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f109721f = {p005kotlin.jvm.internal.s0.f105811a.h(new p005kotlin.jvm.internal.i0(e.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k33.i f109722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f109723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f109724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o43.j f109725e;

    public e(k33.i iVar, o33.r rVar, e0 e0Var) {
        iVar.getClass();
        rVar.getClass();
        e0Var.getClass();
        this.f109722b = iVar;
        this.f109723c = e0Var;
        this.f109724d = new h0(iVar, rVar, e0Var);
        this.f109725e = iVar.f102785a.f102751a.g(new d(this));
    }

    @Override // i43.l
    public final Collection<t23.r0> a(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        i(fVar, bVar);
        i43.l[] lVarArrH = h();
        this.f109724d.getClass();
        Collection<t23.r0> collectionA = p13.j0.f134944a;
        for (i43.l lVar : lVarArrH) {
            collectionA = y43.a.a(collectionA, lVar.a(fVar, bVar));
        }
        return collectionA == null ? p13.l0.f134950a : collectionA;
    }

    @Override // i43.l
    public final Set<x33.f> b() {
        i43.l[] lVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (i43.l lVar : lVarArrH) {
            p13.d0.v(linkedHashSet, lVar.b());
        }
        linkedHashSet.addAll(this.f109724d.b());
        return linkedHashSet;
    }

    @Override // i43.l
    public final Collection<t23.x0> c(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        i(fVar, bVar);
        i43.l[] lVarArrH = h();
        Collection<t23.x0> collectionC = this.f109724d.c(fVar, bVar);
        for (i43.l lVar : lVarArrH) {
            collectionC = y43.a.a(collectionC, lVar.c(fVar, bVar));
        }
        return collectionC == null ? p13.l0.f134950a : collectionC;
    }

    @Override // i43.l
    public final Set<x33.f> d() {
        i43.l[] lVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (i43.l lVar : lVarArrH) {
            p13.d0.v(linkedHashSet, lVar.d());
        }
        linkedHashSet.addAll(this.f109724d.d());
        return linkedHashSet;
    }

    @Override // i43.l
    public final Set<x33.f> e() {
        i43.l[] lVarArrH = h();
        lVarArrH.getClass();
        HashSet hashSetA = i43.n.a(lVarArrH.length == 0 ? p13.j0.f134944a : new p13.t(lVarArrH));
        if (hashSetA == null) {
            return null;
        }
        hashSetA.addAll(this.f109724d.e());
        return hashSetA;
    }

    @Override // i43.o
    public final t23.h f(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        i(fVar, bVar);
        h0 h0Var = this.f109724d;
        h0Var.getClass();
        t23.h hVar = null;
        t23.e eVarV = h0Var.v(fVar, null);
        if (eVarV != null) {
            return eVarV;
        }
        for (i43.l lVar : h()) {
            t23.h hVarF = lVar.f(fVar, bVar);
            if (hVarF != null) {
                if (!(hVarF instanceof t23.i) || !((t23.z) hVarF).O()) {
                    return hVarF;
                }
                if (hVar == null) {
                    hVar = hVarF;
                }
            }
        }
        return hVar;
    }

    @Override // i43.o
    public final Collection<t23.l> g(i43.d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        lVar.getClass();
        i43.l[] lVarArrH = h();
        Collection<t23.l> collectionG = this.f109724d.g(dVar, lVar);
        for (i43.l lVar2 : lVarArrH) {
            collectionG = y43.a.a(collectionG, lVar2.g(dVar, lVar));
        }
        return collectionG == null ? p13.l0.f134950a : collectionG;
    }

    public final i43.l[] h() {
        return (i43.l[]) gl1.d.B(this.f109725e, f109721f[0]);
    }

    public final void i(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        a33.a.a(this.f109722b.f102785a.f102764n, bVar, this.f109723c, fVar);
    }

    public final String toString() {
        return "scope for " + this.f109723c;
    }
}
