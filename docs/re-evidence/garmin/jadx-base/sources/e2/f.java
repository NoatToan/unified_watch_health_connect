package e2;

import g2.h1;
import g2.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.b2;
import p3.p0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le2/f;", "Lg2/h1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3.d0 f62417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f62418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f62419c;

    public f(i0 i0Var, boolean z14) {
        this.f62418b = i0Var;
        this.f62419c = z14;
        this.f62417a = p0.f(new ct1.c(i0Var, 1));
    }

    @Override // g2.h1
    public final int a() {
        i0 i0Var = this.f62418b;
        return i0Var.j().getF62557q() + i0Var.j().b();
    }

    @Override // g2.h1
    public final Object b(int i14, l1.a aVar) {
        i0.a aVar2 = i0.f62432x;
        Object objL = this.f62418b.l(i14, 0, aVar);
        return objL == u13.a.COROUTINE_SUSPENDED ? objL : Unit.INSTANCE;
    }

    @Override // g2.h1
    public final float c() {
        i0 i0Var = this.f62418b;
        int iH = i0Var.h();
        int i14 = i0Var.i();
        return i0Var.c() ? (iH * 500) + i14 + 100 : (iH * 500) + i14;
    }

    @Override // g2.h1
    public final p5.d d() {
        boolean z14 = this.f62419c;
        p3.d0 d0Var = this.f62417a;
        return z14 ? new p5.d(((Number) d0Var.getF182175a()).intValue(), 1) : new p5.d(1, ((Number) d0Var.getF182175a()).intValue());
    }

    @Override // g2.h1
    public final int e() {
        i0 i0Var = this.f62418b;
        return (int) (i0Var.j().getF62556p() == b2.Vertical ? i0Var.j().a() & 4294967295L : i0Var.j().a() >> 32);
    }

    @Override // g2.h1
    public final float f() {
        i0 i0Var = this.f62418b;
        return (i0Var.h() * 500) + i0Var.i();
    }
}
