package ba1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f16974b;

    public /* synthetic */ c(d dVar, int i14) {
        this.f16973a = i14;
        this.f16974b = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f16973a) {
            case 0:
                this.f16974b.f16983i.a();
                break;
            default:
                this.f16974b.J4(false);
                break;
        }
        return Unit.INSTANCE;
    }
}
