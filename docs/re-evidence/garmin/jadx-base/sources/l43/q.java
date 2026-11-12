package l43;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t23.i0 f110099a;

    public q(t23.i0 i0Var) {
        i0Var.getClass();
        this.f110099a = i0Var;
    }

    @Override // l43.j
    public final i a(x33.b bVar) {
        i iVarA;
        for (t23.h0 h0Var : oi0.c.R(this.f110099a, bVar.f188591a)) {
            if ((h0Var instanceof r) && (iVarA = ((r) h0Var).D0().a(bVar)) != null) {
                return iVarA;
            }
        }
        return null;
    }
}
