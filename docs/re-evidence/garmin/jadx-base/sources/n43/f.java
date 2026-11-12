package n43;

/* JADX INFO: loaded from: classes3.dex */
public class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f123627a;

    public f(n nVar) {
        this.f123627a = nVar;
    }

    @Override // e23.a
    public final Object invoke() {
        n nVar = this.f123627a;
        s33.c cVar = nVar.f123654f;
        if ((cVar.f156524c & 4) == 4) {
            t23.h hVarF = nVar.E0().f(x33.f.d(nVar.f123661m.f110086b.getString(cVar.f156527f)), b33.b.FROM_DESERIALIZATION);
            if (hVarF instanceof t23.e) {
                return (t23.e) hVarF;
            }
        }
        return null;
    }
}
