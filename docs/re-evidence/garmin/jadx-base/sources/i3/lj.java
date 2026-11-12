package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li3/lj;", "Li3/ij;", "", "initialIsVisible", "isPersistent", "Lu1/l1;", "mutatorMutex", "<init>", "(ZZLu1/l1;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lj implements ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f88922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1.l1 f88923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1.t0<Boolean> f88924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o53.k f88925d;

    public lj(boolean z14, boolean z15, u1.l1 l1Var) {
        this.f88922a = z15;
        this.f88923b = l1Var;
        this.f88924c = new s1.t0<>(Boolean.valueOf(z14));
    }

    @Override // i3.ij
    public final void a() {
        o53.k kVar = this.f88925d;
        if (kVar != null) {
            kVar.u(null);
        }
    }

    @Override // i3.ij
    public final Object b(u1.k1 k1Var, v13.i iVar) {
        Object objB = this.f88923b.b(k1Var, new jj(this, new kj(this, null), k1Var, null), iVar);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    @Override // i3.ij
    public final void dismiss() {
        o53.k kVar;
        this.f88924c.f(Boolean.FALSE);
        if (!this.f88922a || (kVar = this.f88925d) == null) {
            return;
        }
        kVar.u(null);
    }

    @Override // i3.ij
    public final s1.t0<Boolean> getTransition() {
        return this.f88924c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i3.ij
    public final boolean isVisible() {
        s1.t0<Boolean> t0Var = this.f88924c;
        return ((Boolean) t0Var.f155742b.getF182175a()).booleanValue() || ((Boolean) t0Var.f155743c.getF182175a()).booleanValue();
    }
}
