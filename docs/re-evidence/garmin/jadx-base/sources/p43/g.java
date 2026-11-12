package p43;

/* JADX INFO: loaded from: classes3.dex */
public class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f135834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t43.p f135835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t43.i f135836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t43.i f135837d;

    public g(l1 l1Var, t43.p pVar, t43.i iVar, t43.i iVar2) {
        this.f135834a = l1Var;
        this.f135835b = pVar;
        this.f135836c = iVar;
        this.f135837d = iVar2;
    }

    @Override // e23.a
    public final Object invoke() {
        h hVar = h.f135849a;
        t43.p pVar = this.f135835b;
        pVar.getClass();
        t43.i iVar = this.f135836c;
        iVar.getClass();
        t43.k kVarW0 = pVar.w0(iVar);
        hVar.getClass();
        return Boolean.valueOf(h.i(this.f135834a, pVar, kVarW0, this.f135837d));
    }
}
