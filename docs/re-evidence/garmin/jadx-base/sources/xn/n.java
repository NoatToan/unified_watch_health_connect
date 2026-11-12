package xn;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f191616b;

    public /* synthetic */ n(p pVar, int i14, int i15) {
        this.f191615a = i15;
        this.f191616b = pVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f191615a;
        p pVar = this.f191616b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i15 = p.f191619g;
        switch (i14) {
            case 0:
                pVar.i(mVar, p0.t(1));
                break;
            case 1:
                pVar.h(mVar, p0.t(1));
                break;
            case 2:
                pVar.g(mVar, p0.t(1));
                break;
            default:
                pVar.j(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
