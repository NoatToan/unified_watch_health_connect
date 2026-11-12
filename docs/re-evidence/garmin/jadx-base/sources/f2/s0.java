package f2;

import g2.h1;
import g2.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf2/s0;", "Lg2/h1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s0 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f68303a;

    public s0(p0 p0Var) {
        this.f68303a = p0Var;
    }

    @Override // g2.h1
    public final int a() {
        p0 p0Var = this.f68303a;
        return p0Var.i().getF68342s() + p0Var.i().b();
    }

    @Override // g2.h1
    public final Object b(int i14, l1.a aVar) {
        p0.a aVar2 = p0.f68259w;
        Object objJ = this.f68303a.j(i14, 0, aVar);
        return objJ == u13.a.COROUTINE_SUSPENDED ? objJ : Unit.INSTANCE;
    }

    @Override // g2.h1
    public final float c() {
        p0 p0Var = this.f68303a;
        int iG = p0Var.g();
        int iH = p0Var.h();
        return p0Var.c() ? (iG * 500) + iH + 100 : (iG * 500) + iH;
    }

    @Override // g2.h1
    public final p5.d d() {
        return new p5.d(-1, -1);
    }

    @Override // g2.h1
    public final int e() {
        p0 p0Var = this.f68303a;
        return (int) (p0Var.i().getF68341r() == b2.Vertical ? p0Var.i().a() & 4294967295L : p0Var.i().a() >> 32);
    }

    @Override // g2.h1
    public final float f() {
        p0 p0Var = this.f68303a;
        return (p0Var.g() * 500) + p0Var.h();
    }
}
