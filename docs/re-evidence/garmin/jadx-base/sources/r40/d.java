package r40;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f150270b;

    public /* synthetic */ d(e eVar, int i14) {
        this.f150269a = i14;
        this.f150270b = eVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f150269a) {
            case 0:
                c60.b bVar = this.f150270b.f150272h;
                if (bVar != null) {
                    bVar.invoke();
                }
                break;
            default:
                bb0.d dVar = this.f150270b.f150273i;
                if (dVar != null) {
                    dVar.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
