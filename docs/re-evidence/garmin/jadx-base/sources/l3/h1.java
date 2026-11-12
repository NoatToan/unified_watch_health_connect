package l3;

import c2.k3;
import c2.n3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ll3/h1;", "Lc2/k3;", "initialInsets", "<init>", "(Lc2/k3;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h1 implements k3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.c2 f109266b;

    public h1(k3 k3Var, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            c2.n0 n0Var = n3.f22788a;
            k3Var = new c2.n0(0, 0, 0, 0);
        }
        this(k3Var);
    }

    @Override // c2.k3
    public final int a(g6.c cVar) {
        return ((k3) this.f109266b.getF182175a()).a(cVar);
    }

    @Override // c2.k3
    public final int b(g6.c cVar, g6.o oVar) {
        return ((k3) this.f109266b.getF182175a()).b(cVar, oVar);
    }

    @Override // c2.k3
    public final int c(g6.c cVar) {
        return ((k3) this.f109266b.getF182175a()).c(cVar);
    }

    @Override // c2.k3
    public final int d(g6.c cVar, g6.o oVar) {
        return ((k3) this.f109266b.getF182175a()).d(cVar, oVar);
    }

    public h1(k3 k3Var) {
        this.f109266b = p3.p0.n(k3Var);
    }

    public h1() {
        this(null, 1, null);
    }
}
