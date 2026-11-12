package r2;

import o53.c2;
import o53.d0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr2/q;", "Lr2/p;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q extends p {
    @Override // r2.p
    public final void a() {
        c2 c2Var;
        n nVar = this.f149467a;
        if (nVar == null || (c2Var = nVar.f149460g) == null) {
            return;
        }
        c2Var.c(null);
        nVar.f149460g = null;
    }

    @Override // r2.p
    public final void b() {
        s2.f fVar;
        if (this.f149468b == o.Uninitialized) {
            b2.e.c("ToolbarRequester is not initialized.");
        }
        n nVar = this.f149467a;
        if (nVar == null || !nVar.getIsAttached()) {
            return;
        }
        c2 c2Var = nVar.f149460g;
        if ((c2Var == null || !c2Var.isActive()) && (fVar = (s2.f) h5.i.a(nVar, s2.g.f156003b)) != null) {
            nVar.f149460g = ge1.b.T(nVar.getCoroutineScope(), null, d0.UNDISPATCHED, new m(nVar, fVar, null), 1);
        }
    }
}
