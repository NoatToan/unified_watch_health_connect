package e2;

import g2.r1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le2/i;", "Lg2/e;", "Le2/d0;", "Lg2/t;", "cacheWindow", "<init>", "(Lg2/t;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends g2.e implements d0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h f62431o;

    public i(g2.t tVar) {
        super(tVar, false, 2, null);
        this.f62431o = new h();
    }

    @Override // e2.d0
    public final void a(r1 r1Var, int i14) {
        int f75319a = r1Var.getF75319a() == -1 ? 2 : r1Var.getF75319a();
        for (int i15 = 0; i15 < f75319a; i15++) {
            r1Var.a(i14 + i15);
        }
    }

    @Override // e2.d0
    public final void c(i0.c cVar, x xVar) {
        h hVar = this.f62431o;
        hVar.f62427a = xVar;
        hVar.f62428b = cVar;
        k(hVar);
    }

    @Override // e2.d0
    public final void e(i0.c cVar, float f14, v vVar) {
        h hVar = this.f62431o;
        hVar.f62427a = vVar;
        hVar.f62428b = cVar;
        j(hVar, f14);
    }
}
