package l43;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f110008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s33.o f110010c;

    public f0(l0 l0Var, boolean z14, s33.o oVar) {
        this.f110008a = l0Var;
        this.f110009b = z14;
        this.f110010c = oVar;
    }

    @Override // e23.a
    public final Object invoke() {
        List listB1;
        l0 l0Var = this.f110008a;
        o0 o0VarA = l0Var.a(l0Var.f110046a.f110087c);
        if (o0VarA != null) {
            n nVar = l0Var.f110046a.f110085a;
            boolean z14 = this.f110009b;
            s33.o oVar = this.f110010c;
            listB1 = z14 ? p13.h0.b1(nVar.f110055e.g(o0VarA, oVar)) : p13.h0.b1(nVar.f110055e.d(o0VarA, oVar));
        } else {
            listB1 = null;
        }
        return listB1 == null ? p13.j0.f134944a : listB1;
    }
}
