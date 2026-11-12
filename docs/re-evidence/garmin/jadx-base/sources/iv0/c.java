package iv0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f95079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pu0.b f95080c;

    public /* synthetic */ c(e23.l lVar, pu0.b bVar, int i14) {
        this.f95078a = i14;
        this.f95079b = lVar;
        this.f95080c = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f95078a) {
            case 0:
                this.f95079b.invoke(this.f95080c);
                break;
            case 1:
                e23.l lVar = this.f95079b;
                if (lVar != null) {
                    lVar.invoke(this.f95080c);
                }
                break;
            case 2:
                this.f95079b.invoke(this.f95080c);
                break;
            case 3:
                this.f95079b.invoke(this.f95080c);
                break;
            case 4:
                this.f95079b.invoke(this.f95080c);
                break;
            case 5:
                this.f95079b.invoke(this.f95080c);
                break;
            default:
                this.f95079b.invoke(this.f95080c);
                break;
        }
        return Unit.INSTANCE;
    }
}
