package l43;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f110014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z33.n f110015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f110016c;

    public g0(l0 l0Var, z33.n nVar, d dVar) {
        this.f110014a = l0Var;
        this.f110015b = nVar;
        this.f110016c = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        l0 l0Var = this.f110014a;
        o0 o0VarA = l0Var.a(l0Var.f110046a.f110087c);
        List<u23.c> listL = o0VarA != null ? l0Var.f110046a.f110085a.f110055e.l(o0VarA, this.f110015b, this.f110016c) : null;
        return listL == null ? p13.j0.f134944a : listL;
    }
}
