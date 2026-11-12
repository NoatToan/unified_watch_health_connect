package ff2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f71156b;

    public /* synthetic */ h(i iVar, int i14) {
        this.f71155a = i14;
        this.f71156b = iVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f71155a) {
            case 0:
                this.f71156b.b().debug("handleFailedCaching: Finished clearing all data");
                break;
            default:
                this.f71156b.b().debug("Finished clearing out cache");
                break;
        }
        return Unit.INSTANCE;
    }
}
