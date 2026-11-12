package bt1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f21103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f21104c;

    public /* synthetic */ d(e23.l lVar, u uVar, int i14) {
        this.f21102a = i14;
        this.f21103b = lVar;
        this.f21104c = uVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f21102a) {
            case 0:
                u uVar = this.f21104c;
                this.f21103b.invoke(new qs1.n(uVar.e().f96796a, uVar.e().f96797b, null, 4, null));
                break;
            default:
                u uVar2 = this.f21104c;
                this.f21103b.invoke(new qs1.n(uVar2.e().f96796a, uVar2.e().f96797b, null, 4, null));
                break;
        }
        return Unit.INSTANCE;
    }
}
