package fn1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km1.r f72201b;

    public /* synthetic */ g(km1.r rVar, int i14, int i15) {
        this.f72200a = i15;
        this.f72201b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f72200a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                m.e(this.f72201b, mVar, p0.t(1));
                break;
            default:
                g8.i.h(this.f72201b, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
