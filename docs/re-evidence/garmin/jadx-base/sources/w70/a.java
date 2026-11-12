package w70;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f183433b;

    public /* synthetic */ a(g gVar, int i14) {
        this.f183432a = i14;
        this.f183433b = gVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f183432a) {
            case 0:
                this.f183433b.y4(true);
                break;
            default:
                this.f183433b.f183492e.k(null, Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
