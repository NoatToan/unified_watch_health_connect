package gt1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f78983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pt1.p f78984c;

    public /* synthetic */ m(e23.l lVar, pt1.p pVar, int i14) {
        this.f78982a = i14;
        this.f78983b = lVar;
        this.f78984c = pVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f78982a) {
            case 0:
                this.f78983b.invoke(Long.valueOf(this.f78984c.f140929a));
                break;
            default:
                this.f78983b.invoke(Long.valueOf(this.f78984c.f140929a));
                break;
        }
        return Unit.INSTANCE;
    }
}
