package yr;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nr.i0 f198847b;

    public /* synthetic */ a(nr.i0 i0Var, int i14) {
        this.f198846a = i14;
        this.f198847b = i0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f198846a) {
            case 0:
                e23.a<Unit> aVar = this.f198847b.f127204j;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            default:
                e23.a<Unit> aVar2 = this.f198847b.f127204j;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
