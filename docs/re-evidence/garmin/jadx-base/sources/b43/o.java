package b43;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements e23.l<t23.b, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t23.l f15731a;

    public o(t23.l lVar) {
        this.f15731a = lVar;
    }

    @Override // e23.l
    public final Boolean invoke(t23.b bVar) {
        return Boolean.valueOf(bVar.d() == this.f15731a);
    }
}
