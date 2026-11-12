package h2;

import g2.h1;
import g2.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh2/g;", "Lg2/h1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f80902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f80903b;

    public g(j0 j0Var, boolean z14) {
        this.f80902a = j0Var;
        this.f80903b = z14;
    }

    @Override // g2.h1
    public final int a() {
        j0 j0Var = this.f80902a;
        return j0Var.n().getF80847d() + j0Var.n().b();
    }

    @Override // g2.h1
    public final Object b(int i14, l1.a aVar) {
        Object objW = j0.w(this.f80902a, i14, aVar);
        return objW == u13.a.COROUTINE_SUSPENDED ? objW : Unit.INSTANCE;
    }

    @Override // g2.h1
    public final float c() {
        j0 j0Var = this.f80902a;
        return o0.a(j0Var.n(), j0Var.o());
    }

    @Override // g2.h1
    public final p5.d d() {
        boolean z14 = this.f80903b;
        j0 j0Var = this.f80902a;
        return z14 ? new p5.d(j0Var.o(), 1) : new p5.d(1, j0Var.o());
    }

    @Override // g2.h1
    public final int e() {
        j0 j0Var = this.f80902a;
        return (int) (j0Var.n().getF80848e() == b2.Vertical ? j0Var.n().a() & 4294967295L : j0Var.n().a() >> 32);
    }

    @Override // g2.h1
    public final float f() {
        return gl.b.p(this.f80902a);
    }
}
