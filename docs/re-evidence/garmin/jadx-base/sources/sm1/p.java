package sm1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f160142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pm1.g f160143c;

    public /* synthetic */ p(s sVar, pm1.g gVar, int i14) {
        this.f160141a = i14;
        this.f160142b = sVar;
        this.f160143c = gVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f160141a) {
            case 0:
                this.f160142b.E4(false);
                this.f160143c.l();
                break;
            default:
                this.f160142b.G4(false);
                this.f160143c.i();
                break;
        }
        return Unit.INSTANCE;
    }
}
