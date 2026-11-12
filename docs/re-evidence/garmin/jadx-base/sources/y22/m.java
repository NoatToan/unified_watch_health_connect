package y22;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f194264b;

    public /* synthetic */ m(j jVar, int i14) {
        this.f194263a = i14;
        this.f194264b = jVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f194263a) {
            case 0:
                this.f194264b.W0();
                break;
            case 1:
                this.f194264b.g3();
                break;
            case 2:
                this.f194264b.l4();
                break;
            default:
                this.f194264b.g3();
                break;
        }
        return Unit.INSTANCE;
    }
}
