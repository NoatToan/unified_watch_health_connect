package q33;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements l43.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f142519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f142520b;

    public p(v vVar, o oVar) {
        vVar.getClass();
        oVar.getClass();
        this.f142519a = vVar;
        this.f142520b = oVar;
    }

    @Override // l43.j
    public final l43.i a(x33.b bVar) {
        o oVar = this.f142520b;
        x xVarA = w.a(this.f142519a, bVar, oVar.c().f110053c.a());
        if (xVarA == null) {
            return null;
        }
        xVarA.d().equals(bVar);
        return oVar.f(xVarA);
    }
}
