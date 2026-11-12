package w02;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f181111b;

    public /* synthetic */ k(r rVar, int i14) {
        this.f181110a = i14;
        this.f181111b = rVar;
    }

    @Override // e23.a
    public final Object invoke() {
        float size;
        switch (this.f181110a) {
            case 0:
                return this.f181111b.g();
            case 1:
                return Boolean.valueOf(this.f181111b.f181127f.getF182175a() != 0);
            case 2:
                return Float.valueOf(r.f(this.f181111b.f181122a.j()) * 0.5f);
            case 3:
                return this.f181111b.f181122a.j();
            case 4:
                r rVar = this.f181111b;
                e2.n nVarD = rVar.d();
                return Float.valueOf(nVarD != null ? (r.f(rVar.f181122a.j()) - nVarD.getF62574p()) - 1.0f : 0.0f);
            default:
                e2.n nVarD2 = this.f181111b.d();
                if (nVarD2 != null) {
                    size = (nVarD2.getF62575q() + nVarD2.getF62574p()) - 1.0f;
                } else {
                    size = 0.0f;
                }
                return Float.valueOf(size);
        }
    }
}
