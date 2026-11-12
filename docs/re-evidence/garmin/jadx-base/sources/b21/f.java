package b21;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.p f14655b;

    public /* synthetic */ f(u21.p pVar, int i14) {
        this.f14654a = i14;
        this.f14655b = pVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f14654a) {
            case 0:
                this.f14655b.A4();
                break;
            case 1:
                this.f14655b.A4();
                break;
            case 2:
                u21.p pVar = this.f14655b;
                ge1.b.T(androidx.lifecycle.v1.a(pVar), null, null, new u21.r(pVar, null), 3);
                break;
            default:
                this.f14655b.A4();
                break;
        }
        return Unit.INSTANCE;
    }
}
