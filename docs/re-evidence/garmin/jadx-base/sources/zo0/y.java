package zo0;

import c80.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.v0;
import zd0.g1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzo0/y;", "Lzo0/p;", "Lzo0/q;", "navigator", "Lzd0/g1;", "promosProvider", "<init>", "(Lzo0/q;Lzd0/g1;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f206206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f206207b;

    public y(q qVar, g1 g1Var) {
        qVar.getClass();
        g1Var.getClass();
        this.f206206a = qVar;
        this.f206207b = g1Var;
    }

    @Override // zo0.p
    public final v0 b(n nVar) {
        if (!(nVar instanceof n.m)) {
            return null;
        }
        n.m mVar = (n.m) nVar;
        return this.f206206a.U1(mVar.f206189a, mVar.f206190b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zo0.p
    public final Object c(t13.d<? super n> dVar) {
        o13.p pVarV = this.f206207b.v(s0.HOME, new z81.b(6));
        if (pVarV != null) {
            return new n.m((String) pVarV.f128594a, (ub1.k) pVarV.f128595b);
        }
        return null;
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        return Unit.INSTANCE;
    }
}
