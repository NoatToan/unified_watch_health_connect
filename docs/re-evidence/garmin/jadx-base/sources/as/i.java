package as;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f12648c;

    public /* synthetic */ i(boolean z14, e23.a aVar, int i14) {
        this.f12646a = i14;
        this.f12647b = z14;
        this.f12648c = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        e23.a aVar;
        e23.a aVar2;
        switch (this.f12646a) {
            case 0:
                if (this.f12647b && (aVar = this.f12648c) != null) {
                    aVar.invoke();
                }
                break;
            case 1:
                if (this.f12647b) {
                    this.f12648c.invoke();
                }
                break;
            case 2:
                if (!this.f12647b && (aVar2 = this.f12648c) != null) {
                    aVar2.invoke();
                }
                break;
            default:
                if (this.f12647b) {
                    this.f12648c.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
