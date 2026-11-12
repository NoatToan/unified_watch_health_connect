package f4;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lf4/n0;", "Lf4/f;", "parentSnapshot", "Lkotlin/Function1;", "", "", "specifiedReadObserver", "", "mergeParentObservers", "ownsParentSnapshot", "<init>", "(Lf4/f;Le23/l;ZZ)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n0 extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f68796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f68797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f68798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e23.l<Object, Unit> f68799i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f68800j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(f fVar, e23.l<Object, Unit> lVar, boolean z14, boolean z15) {
        e23.l<Object, Unit> f68799i;
        super(0L, j.f68752f, (p005kotlin.jvm.internal.j) null);
        f21.g0 g0Var = l.f68773a;
        j.f68751e.getClass();
        this.f68796f = fVar;
        this.f68797g = z14;
        this.f68798h = z15;
        this.f68799i = l.j(lVar, z14, (fVar == null || (f68799i = fVar.getF68733f()) == null) ? l.f68782j.f68707f : f68799i);
        this.f68800j = z3.k.a();
    }

    @Override // f4.f
    public final void c() {
        f fVar;
        this.f68738c = true;
        if (!this.f68798h || (fVar = this.f68796f) == null) {
            return;
        }
        fVar.c();
    }

    @Override // f4.f
    /* JADX INFO: renamed from: d */
    public final j getF68736a() {
        return v().getF68736a();
    }

    @Override // f4.f
    /* JADX INFO: renamed from: e, reason: from getter */
    public final e23.l getF68733f() {
        return this.f68799i;
    }

    @Override // f4.f
    public final boolean f() {
        return v().f();
    }

    @Override // f4.f
    /* JADX INFO: renamed from: g */
    public final long getF68737b() {
        return v().getF68737b();
    }

    @Override // f4.f
    public final e23.l<Object, Unit> i() {
        return null;
    }

    @Override // f4.f
    public final void k() {
        t.g();
        throw null;
    }

    @Override // f4.f
    public final void l() {
        t.g();
        throw null;
    }

    @Override // f4.f
    public final void m() {
        v().m();
    }

    @Override // f4.f
    public final void n(g0 g0Var) {
        v().n(g0Var);
    }

    @Override // f4.f
    public final f u(e23.l<Object, Unit> lVar) {
        e23.l<Object, Unit> lVarJ = l.j(lVar, true, this.f68799i);
        return !this.f68797g ? l.f(v().u(null), lVarJ, true) : v().u(lVarJ);
    }

    public final f v() {
        f fVar = this.f68796f;
        return fVar == null ? l.f68782j : fVar;
    }
}
