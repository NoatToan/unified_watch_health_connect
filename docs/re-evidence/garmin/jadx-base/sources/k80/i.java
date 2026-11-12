package k80;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f103353b;

    public /* synthetic */ i(l lVar, int i14) {
        this.f103352a = i14;
        this.f103353b = lVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f103352a) {
            case 0:
                g gVar = this.f103353b.f103364a;
                if (gVar != null) {
                    gVar.onCancel();
                }
                break;
            default:
                g gVar2 = this.f103353b.f103364a;
                if (gVar2 != null) {
                    gVar2.onCancel();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
