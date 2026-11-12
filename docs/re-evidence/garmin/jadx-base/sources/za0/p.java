package za0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f203272b;

    public /* synthetic */ p(h4.r rVar, int i14, int i15) {
        this.f203271a = i15;
        this.f203272b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f203271a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                q.a(this.f203272b, mVar, p0.t(7));
                break;
            default:
                zs1.d.a(this.f203272b, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
