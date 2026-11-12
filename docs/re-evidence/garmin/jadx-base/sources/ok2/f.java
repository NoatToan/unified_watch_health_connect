package ok2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f132674b;

    public /* synthetic */ f(g gVar, int i14) {
        this.f132673a = i14;
        this.f132674b = gVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f132673a;
        g gVar = this.f132674b;
        switch (i14) {
            case 0:
                g gVar2 = this.f132674b;
                return new zk2.a(gVar2.f132683b, gVar2, gVar2.f132682a, gVar2.f132687f, false, null, 48, null);
            case 1:
                return new cz2.j(false, new cl2.g(gVar.f132683b.a()));
            default:
                g.b bVar = g.f132677s;
                if (gVar.B() != null) {
                    g.J(gVar, "checkDownloadQueue()", null, false, 6);
                }
                return Unit.INSTANCE;
        }
    }
}
