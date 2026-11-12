package u53;

import o53.h0;
import o53.k0;
import o53.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu53/q;", "Lo53/z;", "Lo53/k0;", "dispatcher", "", "name", "<init>", "(Lo53/z;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends o53.z implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f168765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.z f168766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f168767c;

    /* JADX WARN: Multi-variable type inference failed */
    public q(o53.z zVar, String str) {
        k0 k0Var = zVar instanceof k0 ? (k0) zVar : null;
        this.f168765a = k0Var == null ? h0.f129344a : k0Var;
        this.f168766b = zVar;
        this.f168767c = str;
    }

    @Override // o53.k0
    public final void C(long j8, o53.k kVar) {
        this.f168765a.C(j8, kVar);
    }

    @Override // o53.z
    public final void dispatch(t13.g gVar, Runnable runnable) {
        this.f168766b.dispatch(gVar, runnable);
    }

    @Override // o53.z
    public final void dispatchYield(t13.g gVar, Runnable runnable) {
        this.f168766b.dispatchYield(gVar, runnable);
    }

    @Override // o53.z
    public final boolean isDispatchNeeded(t13.g gVar) {
        return this.f168766b.isDispatchNeeded(gVar);
    }

    @Override // o53.k0
    public final u0 j(long j8, Runnable runnable, t13.g gVar) {
        return this.f168765a.j(j8, runnable, gVar);
    }

    @Override // o53.z
    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF168767c() {
        return this.f168767c;
    }
}
