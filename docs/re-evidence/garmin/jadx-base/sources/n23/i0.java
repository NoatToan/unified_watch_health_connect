package n23;

/* JADX INFO: loaded from: classes3.dex */
public class i0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f122500a;

    public i0(p0 p0Var) {
        this.f122500a = p0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        p0 p0Var = this.f122500a;
        p43.n0 returnType = p0Var.e().getReturnType();
        returnType.getClass();
        return new b53.l(returnType, new f0(p0Var));
    }
}
