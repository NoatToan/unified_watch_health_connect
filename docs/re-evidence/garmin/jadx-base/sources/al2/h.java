package al2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f3800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f3801c;

    public /* synthetic */ h(m mVar, n nVar, int i14) {
        this.f3799a = i14;
        this.f3800b = mVar;
        this.f3801c = nVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f3799a;
        n nVar = this.f3801c;
        m mVar = this.f3800b;
        switch (i14) {
            case 0:
                mVar.B(nVar);
                break;
            default:
                sk2.c.a aVar = sk2.c.f159932o;
                mVar.B(nVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
