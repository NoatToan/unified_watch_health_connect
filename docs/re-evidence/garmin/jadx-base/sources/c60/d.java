package c60;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f24620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f24621c;

    public /* synthetic */ d(a aVar, e23.a aVar2, int i14) {
        this.f24619a = i14;
        this.f24620b = aVar;
        this.f24621c = aVar2;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f24619a) {
            case 0:
                this.f24620b.invoke();
                this.f24621c.invoke();
                break;
            default:
                this.f24620b.invoke();
                this.f24621c.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
