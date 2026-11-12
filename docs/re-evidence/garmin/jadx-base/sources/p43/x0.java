package p43;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f135940c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(v0 v0Var, k1 k1Var) {
        super(v0Var);
        v0Var.getClass();
        k1Var.getClass();
        this.f135940c = k1Var;
    }

    @Override // p43.y, p43.n0
    public final k1 E0() {
        return this.f135940c;
    }

    @Override // p43.y
    public final y Q0(v0 v0Var) {
        return new x0(v0Var, this.f135940c);
    }
}
