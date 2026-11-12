package c22;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc22/w;", "Lc22/d2;", "Lc22/x;", "repo", "<init>", "(Lc22/x;)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f23304a;

    public w(x xVar) {
        xVar.getClass();
        this.f23304a = xVar;
    }

    @Override // c22.d2
    public final boolean a(u0 u0Var) {
        u0Var.getClass();
        return this.f23304a.b(u0Var);
    }

    @Override // c22.d2
    public final Object b(u0 u0Var, t13.d<? super Boolean> dVar) {
        return this.f23304a.c(u0Var, (v13.c) dVar);
    }

    @Override // c22.d2
    public final Object c(v13.i iVar) {
        Object objD = this.f23304a.d(iVar);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
    }

    @Override // c22.d2
    public final boolean isInitialized() {
        return this.f23304a.e();
    }
}
