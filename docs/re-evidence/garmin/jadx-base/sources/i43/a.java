package i43;

import java.util.Collection;
import java.util.Set;
import t23.r0;
import t23.x0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements l {
    @Override // i43.l
    public Collection<r0> a(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return i().a(fVar, bVar);
    }

    @Override // i43.l
    public final Set<x33.f> b() {
        return i().b();
    }

    @Override // i43.l
    public Collection<x0> c(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return i().c(fVar, bVar);
    }

    @Override // i43.l
    public final Set<x33.f> d() {
        return i().d();
    }

    @Override // i43.l
    public final Set<x33.f> e() {
        return i().e();
    }

    @Override // i43.o
    public final t23.h f(x33.f fVar, b33.b bVar) {
        fVar.getClass();
        bVar.getClass();
        return i().f(fVar, bVar);
    }

    @Override // i43.o
    public Collection<t23.l> g(d dVar, e23.l<? super x33.f, Boolean> lVar) {
        dVar.getClass();
        lVar.getClass();
        return i().g(dVar, lVar);
    }

    public final l h() {
        if (!(i() instanceof a)) {
            return i();
        }
        l lVarI = i();
        lVarI.getClass();
        return ((a) lVarI).h();
    }

    public abstract l i();
}
