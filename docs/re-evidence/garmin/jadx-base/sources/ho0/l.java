package ho0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qo0.a f84732b;

    public /* synthetic */ l(qo0.a aVar, int i14) {
        this.f84731a = i14;
        this.f84732b = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f84731a) {
            case 0:
                this.f84732b.x4(null);
                break;
            case 1:
                this.f84732b.y4();
                break;
            case 2:
                this.f84732b.y4();
                break;
            default:
                this.f84732b.y4();
                break;
        }
        return Unit.INSTANCE;
    }
}
