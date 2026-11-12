package f4;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf4/m0;", "Lf4/a;", "parentSnapshot", "Lkotlin/Function1;", "", "", "specifiedReadObserver", "specifiedWriteObserver", "", "mergeParentObservers", "ownsParentSnapshot", "<init>", "(Lf4/a;Le23/l;Le23/l;ZZ)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m0 extends a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f68790p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f68791q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f68792r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e23.l<Object, Unit> f68793s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e23.l<Object, Unit> f68794t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f68795u;

    /* JADX WARN: Illegal instructions before constructor call */
    public m0(a aVar, e23.l<Object, Unit> lVar, e23.l<Object, Unit> lVar2, boolean z14, boolean z15) {
        e23.l<Object, Unit> lVarI;
        e23.l<Object, Unit> lVarY;
        f21.g0 g0Var = l.f68773a;
        j.f68751e.getClass();
        super(0L, j.f68752f, l.j(lVar, z14, (aVar == null || (lVarY = aVar.getF68793s()) == null) ? l.f68782j.f68707f : lVarY), l.k(lVar2, (aVar == null || (lVarI = aVar.i()) == null) ? l.f68782j.f68708g : lVarI));
        this.f68790p = aVar;
        this.f68791q = z14;
        this.f68792r = z15;
        this.f68793s = this.f68707f;
        this.f68794t = this.f68708g;
        this.f68795u = z3.k.a();
    }

    @Override // f4.a
    public final void B(u0<g0> u0Var) {
        t.g();
        throw null;
    }

    @Override // f4.a
    public final a C(e23.l<Object, Unit> lVar, e23.l<Object, Unit> lVar2) {
        e23.l<Object, Unit> lVarJ = l.j(lVar, true, this.f68793s);
        e23.l<Object, Unit> lVarK = l.k(lVar2, this.f68794t);
        return !this.f68791q ? new m0(D().C(null, lVarK), lVarJ, lVarK, false, true) : D().C(lVarJ, lVarK);
    }

    public final a D() {
        a aVar = this.f68790p;
        return aVar == null ? l.f68782j : aVar;
    }

    @Override // f4.a, f4.f
    public final void c() {
        a aVar;
        this.f68738c = true;
        if (!this.f68792r || (aVar = this.f68790p) == null) {
            return;
        }
        aVar.c();
    }

    @Override // f4.f
    /* JADX INFO: renamed from: d */
    public final j getF68736a() {
        return D().getF68736a();
    }

    @Override // f4.a, f4.f
    /* JADX INFO: renamed from: e, reason: from getter */
    public final e23.l getF68733f() {
        return this.f68793s;
    }

    @Override // f4.a, f4.f
    public final boolean f() {
        return D().f();
    }

    @Override // f4.f
    /* JADX INFO: renamed from: g */
    public final long getF68737b() {
        return D().getF68737b();
    }

    @Override // f4.a, f4.f
    /* JADX INFO: renamed from: h */
    public final int getF68709h() {
        return D().getF68709h();
    }

    @Override // f4.a, f4.f
    public final e23.l<Object, Unit> i() {
        return this.f68794t;
    }

    @Override // f4.a, f4.f
    public final void k() {
        t.g();
        throw null;
    }

    @Override // f4.a, f4.f
    public final void l() {
        t.g();
        throw null;
    }

    @Override // f4.a, f4.f
    public final void m() {
        D().m();
    }

    @Override // f4.a, f4.f
    public final void n(g0 g0Var) {
        D().n(g0Var);
    }

    @Override // f4.f
    public final void r(j jVar) {
        t.g();
        throw null;
    }

    @Override // f4.f
    public final void s(long j8) {
        t.g();
        throw null;
    }

    @Override // f4.a, f4.f
    public final void t(int i14) {
        D().t(i14);
    }

    @Override // f4.a, f4.f
    public final f u(e23.l<Object, Unit> lVar) {
        e23.l<Object, Unit> lVarJ = l.j(lVar, true, this.f68793s);
        return !this.f68791q ? l.f(D().u(null), lVarJ, true) : D().u(lVarJ);
    }

    @Override // f4.a
    public final g w() {
        return D().w();
    }

    @Override // f4.a
    public final u0<g0> x() {
        return D().x();
    }

    @Override // f4.a
    /* JADX INFO: renamed from: y */
    public final e23.l<Object, Unit> getF68793s() {
        return this.f68793s;
    }
}
