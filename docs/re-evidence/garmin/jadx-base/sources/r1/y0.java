package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls1/t1$b;", "Lr1/r0;", "Ls1/f0;", "", "invoke", "(Ls1/t1$b;)Ls1/f0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class y0 extends p005kotlin.jvm.internal.w implements e23.l<s1.t1.b<r0>, s1.f0<Float>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u1 f149315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f149316b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(u1 u1Var, w1 w1Var) {
        super(1);
        this.f149315a = u1Var;
        this.f149316b = w1Var;
    }

    @Override // e23.l
    public final s1.f0<Float> invoke(s1.t1.b<r0> bVar) {
        s1.f0<Float> f0Var;
        s1.f0<Float> f0Var2;
        s1.t1.b<r0> bVar2 = bVar;
        r0 r0Var = r0.PreEnter;
        r0 r0Var2 = r0.Visible;
        if (bVar2.a(r0Var, r0Var2)) {
            e2 e2Var = this.f149315a.getF149295c().f149184d;
            return (e2Var == null || (f0Var2 = e2Var.f149079c) == null) ? u0.f149281b : f0Var2;
        }
        if (!bVar2.a(r0Var2, r0.PostExit)) {
            return u0.f149281b;
        }
        e2 e2Var2 = this.f149316b.getF149312d().f149184d;
        return (e2Var2 == null || (f0Var = e2Var2.f149079c) == null) ? u0.f149281b : f0Var;
    }
}
