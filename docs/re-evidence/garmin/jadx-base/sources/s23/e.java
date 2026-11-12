package s23;

import java.util.List;
import p13.l0;
import t23.c0;
import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f156252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o43.n f156253b;

    public e(g gVar, o43.n nVar) {
        this.f156252a = gVar;
        this.f156253b = nVar;
    }

    @Override // e23.a
    public final Object invoke() {
        g.a aVar = g.f156255d;
        g gVar = this.f156252a;
        e23.l<c0, t23.l> lVar = gVar.f156261b;
        c0 c0Var = gVar.f156260a;
        t23.l lVarInvoke = lVar.invoke(c0Var);
        x33.f fVar = g.f156258g;
        t23.a0 a0Var = t23.a0.ABSTRACT;
        t23.f fVar2 = t23.f.INTERFACE;
        List listC = p13.w.c(c0Var.e().e());
        y0.a aVar2 = y0.f162076a;
        o43.n nVar = this.f156253b;
        w23.m mVar = new w23.m(lVarInvoke, fVar, a0Var, fVar2, listC, aVar2, false, nVar);
        mVar.E0(new a(nVar, mVar), l0.f134950a, null);
        return mVar;
    }
}
