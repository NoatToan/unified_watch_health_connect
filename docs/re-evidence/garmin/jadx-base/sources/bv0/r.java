package bv0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gv0.d f21364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f21365c;

    public /* synthetic */ r(gv0.d dVar, e23.a aVar, int i14) {
        this.f21363a = i14;
        this.f21364b = dVar;
        this.f21365c = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f21363a) {
            case 0:
                this.f21364b.R4();
                this.f21365c.invoke();
                break;
            case 1:
                this.f21364b.f5();
                this.f21365c.invoke();
                break;
            default:
                if (!this.f21364b.J0) {
                    this.f21365c.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
