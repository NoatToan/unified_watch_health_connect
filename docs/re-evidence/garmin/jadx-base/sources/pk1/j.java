package pk1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f138296b;

    public /* synthetic */ j(k kVar, int i14, int i15) {
        this.f138295a = i15;
        this.f138296b = kVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f138295a;
        k kVar = this.f138296b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        k.a aVar = k.f138297g;
        switch (i14) {
            case 0:
                kVar.g(mVar, p0.t(1));
                break;
            case 1:
                kVar.j(mVar, p0.t(1));
                break;
            default:
                kVar.k(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
