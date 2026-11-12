package l43;

/* JADX INFO: loaded from: classes3.dex */
public class k0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f110037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s33.o f110038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n43.g0 f110039c;

    public k0(l0 l0Var, s33.o oVar, n43.g0 g0Var) {
        this.f110037a = l0Var;
        this.f110038b = oVar;
        this.f110039c = g0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        l0 l0Var = this.f110037a;
        o0 o0VarA = l0Var.a(l0Var.f110046a.f110087c);
        o0VarA.getClass();
        e<u23.c, d43.g<?>> eVar = l0Var.f110046a.f110085a.f110055e;
        p43.n0 returnType = this.f110039c.getReturnType();
        returnType.getClass();
        return eVar.e(o0VarA, this.f110038b, returnType);
    }
}
