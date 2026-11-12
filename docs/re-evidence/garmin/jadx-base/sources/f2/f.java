package f2;

import g2.r1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf2/f;", "Lg2/e;", "Lf2/h0;", "Lg2/t;", "cacheWindow", "<init>", "(Lg2/t;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends g2.e implements h0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h f68198o;

    public f(g2.t tVar) {
        super(tVar, false, 2, null);
        this.f68198o = new h();
    }

    @Override // f2.h0
    public final void a(r1 r1Var, int i14) {
        int f75319a = r1Var.getF75319a();
        for (int i15 = 0; i15 < f75319a; i15++) {
            r1Var.a(i14 + i15);
        }
    }

    @Override // f2.h0
    public final void b(p0.c cVar, z zVar) {
        h hVar = this.f68198o;
        hVar.f68203a = zVar;
        hVar.f68204b = cVar;
        k(hVar);
    }

    @Override // f2.h0
    public final void d(p0.c cVar, float f14, y yVar) {
        h hVar = this.f68198o;
        hVar.f68203a = yVar;
        hVar.f68204b = cVar;
        j(hVar, f14);
    }
}
