package d50;

import ew1.b3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f57528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg0.k f57529c;

    public /* synthetic */ g(e23.l lVar, fg0.k kVar, int i14) {
        this.f57527a = i14;
        this.f57528b = lVar;
        this.f57529c = kVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f57527a;
        fg0.k kVar = this.f57529c;
        e23.l lVar = this.f57528b;
        switch (i14) {
            case 0:
                lVar.invoke(kVar);
                break;
            default:
                b3.a aVar = b3.f66335d;
                lVar.invoke(kVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
