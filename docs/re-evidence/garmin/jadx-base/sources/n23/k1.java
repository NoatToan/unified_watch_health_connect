package n23;

/* JADX INFO: loaded from: classes3.dex */
public class k1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1.d f122519a;

    public k1(h1.d dVar) {
        this.f122519a = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = h1.d.f122491j;
        h1.d dVar = this.f122519a;
        t23.t0 setter = dVar.F().e().getSetter();
        if (setter != null) {
            return setter;
        }
        t23.r0 r0VarE = dVar.F().e();
        u23.h.f168226x0.getClass();
        u23.h.a.C3153a c3153a = u23.h.a.f168228b;
        return b43.h.d(r0VarE, c3153a, c3153a);
    }
}
