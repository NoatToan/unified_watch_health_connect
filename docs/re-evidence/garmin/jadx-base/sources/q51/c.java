package q51;

import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f142879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f142880c;

    public /* synthetic */ c(l lVar, e eVar, int i14) {
        this.f142878a = i14;
        this.f142879b = lVar;
        this.f142880c = eVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f142878a) {
            case 0:
                this.f142879b.invoke(Long.valueOf(this.f142880c.f142881a));
                break;
            default:
                this.f142879b.invoke(Long.valueOf(this.f142880c.f142881a));
                break;
        }
        return Unit.INSTANCE;
    }
}
