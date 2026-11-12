package c42;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f24391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zd0.k.a f24392c;

    public /* synthetic */ f0(zd0.k.a aVar, e23.l lVar) {
        this.f24390a = 2;
        this.f24392c = aVar;
        this.f24391b = lVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f24390a) {
            case 0:
                this.f24391b.invoke(this.f24392c);
                break;
            case 1:
                this.f24391b.invoke(this.f24392c);
                break;
            default:
                zd0.k.a aVar = this.f24392c;
                if (aVar != null) {
                    this.f24391b.invoke(aVar);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f0(e23.l lVar, zd0.k.a aVar, int i14) {
        this.f24390a = i14;
        this.f24391b = lVar;
        this.f24392c = aVar;
    }
}
