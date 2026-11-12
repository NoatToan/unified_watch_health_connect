package et1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f65697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ je2.b f65698c;

    public /* synthetic */ l1(e23.l lVar, je2.b bVar, int i14) {
        this.f65696a = i14;
        this.f65697b = lVar;
        this.f65698c = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f65696a) {
            case 0:
                this.f65697b.invoke(this.f65698c);
                break;
            default:
                this.f65697b.invoke(this.f65698c);
                break;
        }
        return Unit.INSTANCE;
    }
}
