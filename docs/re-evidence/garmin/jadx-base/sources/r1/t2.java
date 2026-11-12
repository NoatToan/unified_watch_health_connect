package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls1/t1$b;", "Lr1/r0;", "Ls1/f0;", "Lo4/d0;", "invoke", "(Ls1/t1$b;)Ls1/f0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class t2 extends p005kotlin.jvm.internal.w implements e23.l<s1.t1.b<r0>, s1.f0<o4.d0>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2 f149277a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(v2 v2Var) {
        super(1);
        this.f149277a = v2Var;
    }

    @Override // e23.l
    public final s1.f0<o4.d0> invoke(s1.t1.b<r0> bVar) {
        s1.f0<o4.d0> f0Var;
        s1.f0<o4.d0> f0Var2;
        s1.t1.b<r0> bVar2 = bVar;
        r0 r0Var = r0.PreEnter;
        r0 r0Var2 = r0.Visible;
        boolean zA = bVar2.a(r0Var, r0Var2);
        v2 v2Var = this.f149277a;
        if (zA) {
            r2 r2Var = v2Var.f149297b.getF149295c().f149185e;
            return (r2Var == null || (f0Var2 = r2Var.f149224c) == null) ? u0.f149282c : f0Var2;
        }
        if (!bVar2.a(r0Var2, r0.PostExit)) {
            return u0.f149282c;
        }
        r2 r2Var2 = v2Var.f149298c.getF149312d().f149185e;
        return (r2Var2 == null || (f0Var = r2Var2.f149224c) == null) ? u0.f149282c : f0Var;
    }
}
