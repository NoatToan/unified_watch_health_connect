package q42;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f142691b;

    public /* synthetic */ w(y yVar, int i14) {
        this.f142690a = i14;
        this.f142691b = yVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f142690a) {
            case 0:
                this.f142691b.A4(null);
                break;
            case 1:
                this.f142691b.y4();
                break;
            case 2:
                this.f142691b.y4();
                break;
            default:
                this.f142691b.y4();
                break;
        }
        return Unit.INSTANCE;
    }
}
