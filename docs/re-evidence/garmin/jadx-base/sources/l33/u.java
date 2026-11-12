package l33;

/* JADX INFO: loaded from: classes3.dex */
public class u implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t23.x0 f109807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f109808b;

    public u(t23.x0 x0Var, a0 a0Var) {
        this.f109807a = x0Var;
        this.f109808b = a0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        x33.f fVar = (x33.f) obj;
        int i14 = a0.f109693v;
        fVar.getClass();
        t23.x0 x0Var = this.f109807a;
        if (p005kotlin.jvm.internal.s.g(x0Var.getName(), fVar)) {
            return p13.w.c(x0Var);
        }
        a0 a0Var = this.f109808b;
        return p13.h0.C0(a0Var.N(fVar), a0Var.O(fVar));
    }
}
