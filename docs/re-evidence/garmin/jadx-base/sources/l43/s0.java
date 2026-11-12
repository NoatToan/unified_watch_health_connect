package l43;

/* JADX INFO: loaded from: classes3.dex */
public class s0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f110104a;

    public s0(x0 x0Var) {
        this.f110104a = x0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        p pVar = this.f110104a.f110120a;
        x33.b bVarA = m0.a(pVar.f110086b, iIntValue);
        boolean z14 = bVarA.f188593c;
        n nVar = pVar.f110085a;
        if (!z14) {
            return t23.u.b(nVar.f110052b, bVarA);
        }
        l lVar = nVar.f110070t;
        l.b bVar = l.f110040c;
        lVar.getClass();
        return (t23.e) lVar.f110043b.invoke(new l.a(bVarA, null));
    }
}
