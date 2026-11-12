package n23;

/* JADX INFO: loaded from: classes3.dex */
public class i1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1.c f122501a;

    public i1(h1.c cVar) {
        this.f122501a = cVar;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = h1.c.f122488j;
        h1.c cVar = this.f122501a;
        w23.o0 getter = cVar.F().e().getGetter();
        if (getter != null) {
            return getter;
        }
        t23.r0 r0VarE = cVar.F().e();
        u23.h.f168226x0.getClass();
        return b43.h.c(u23.h.a.f168228b, r0VarE);
    }
}
