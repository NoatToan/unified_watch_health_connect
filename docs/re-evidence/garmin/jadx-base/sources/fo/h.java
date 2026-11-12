package fo;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d f72371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f72372c;

    public /* synthetic */ h(e23.a aVar, zc.d dVar, int i14) {
        this.f72370a = i14;
        this.f72372c = aVar;
        this.f72371b = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f72370a) {
            case 0:
                this.f72372c.invoke();
                this.f72371b.e();
                break;
            case 1:
                this.f72371b.e();
                this.f72372c.invoke();
                break;
            case 2:
                this.f72371b.e();
                this.f72372c.invoke();
                break;
            case 3:
                this.f72371b.e();
                this.f72372c.invoke();
                break;
            case 4:
                this.f72371b.e();
                this.f72372c.invoke();
                break;
            case 5:
                this.f72371b.e();
                this.f72372c.invoke();
                break;
            default:
                this.f72372c.invoke();
                zc.d dVar = this.f72371b;
                if (dVar != null) {
                    dVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(zc.d dVar, e23.a aVar, int i14) {
        this.f72370a = i14;
        this.f72371b = dVar;
        this.f72372c = aVar;
    }
}
