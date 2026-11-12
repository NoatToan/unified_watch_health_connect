package ps2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l implements cs2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f140493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f140494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f140495c;

    public /* synthetic */ l(n nVar, h hVar, int i14) {
        this.f140493a = nVar;
        this.f140494b = hVar;
        this.f140495c = i14;
    }

    @Override // cs2.a
    public final void accept(Object obj) {
        int i14;
        n nVar = this.f140493a;
        hs2.d dVar = nVar.f140499b;
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        h hVar = this.f140494b;
        if (!zBooleanValue) {
            if (dVar.q() == hs2.g.DISCONNECTED || (i14 = this.f140495c) <= 0) {
                hVar.accept(bool);
                return;
            } else {
                dVar.y(new l(nVar, hVar, i14 - 1));
                return;
            }
        }
        js2.d.a aVar = js2.d.f100659h;
        js2.c cVar = js2.c.UNKNOWN;
        aVar.getClass();
        nVar.f140513p = js2.d.a.b(null, cVar);
        nVar.e();
        hVar.accept(bool);
    }
}
