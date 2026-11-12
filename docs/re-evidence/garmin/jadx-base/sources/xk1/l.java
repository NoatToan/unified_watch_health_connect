package xk1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f191262b;

    public /* synthetic */ l(n nVar, int i14, int i15) {
        this.f191261a = i15;
        this.f191262b = nVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f191261a;
        n nVar = this.f191262b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i15 = n.f191265j;
        switch (i14) {
            case 0:
                nVar.h(mVar, p0.t(1));
                break;
            case 1:
                nVar.g(mVar, p0.t(1));
                break;
            case 2:
                nVar.k(mVar, p0.t(1));
                break;
            case 3:
                nVar.j(mVar, p0.t(1));
                break;
            default:
                nVar.i(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
