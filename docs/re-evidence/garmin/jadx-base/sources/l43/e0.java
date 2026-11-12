package l43;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f110004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z33.n f110005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f110006c;

    public e0(l0 l0Var, z33.n nVar, d dVar) {
        this.f110004a = l0Var;
        this.f110005b = nVar;
        this.f110006c = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        l0 l0Var = this.f110004a;
        o0 o0VarA = l0Var.a(l0Var.f110046a.f110087c);
        List listB1 = o0VarA != null ? p13.h0.b1(l0Var.f110046a.f110085a.f110055e.a(o0VarA, this.f110005b, this.f110006c)) : null;
        return listB1 == null ? p13.j0.f134944a : listB1;
    }
}
