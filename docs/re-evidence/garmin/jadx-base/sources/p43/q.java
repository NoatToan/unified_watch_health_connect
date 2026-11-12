package p43;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends i1<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u23.h f135903a;

    public q(u23.h hVar) {
        hVar.getClass();
        this.f135903a = hVar;
    }

    @Override // p43.i1
    public final q a(i1 i1Var) {
        q qVar = (q) i1Var;
        if (qVar == null) {
            return this;
        }
        u23.h nVar = qVar.f135903a;
        u23.h hVar = this.f135903a;
        hVar.getClass();
        nVar.getClass();
        if (!hVar.isEmpty()) {
            nVar = nVar.isEmpty() ? hVar : new u23.n(hVar, nVar);
        }
        return new q(nVar);
    }

    @Override // p43.i1
    public final k23.d<? extends q> b() {
        return p005kotlin.jvm.internal.s0.f105811a.b(q.class);
    }

    @Override // p43.i1
    public final q c(i1 i1Var) {
        if (p005kotlin.jvm.internal.s.g((q) i1Var, this)) {
            return this;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return p005kotlin.jvm.internal.s.g(((q) obj).f135903a, this.f135903a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f135903a.hashCode();
    }
}
