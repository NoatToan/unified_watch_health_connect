package al2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f3797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f3798c;

    public /* synthetic */ g(m mVar, l lVar, int i14) {
        this.f3796a = i14;
        this.f3797b = mVar;
        this.f3798c = lVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f3796a;
        l lVar = this.f3798c;
        m mVar = this.f3797b;
        switch (i14) {
            case 0:
                mVar.u(lVar);
                break;
            default:
                sk2.c.a aVar = sk2.c.f159932o;
                mVar.u(lVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
