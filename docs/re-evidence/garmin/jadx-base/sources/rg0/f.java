package rg0;

import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152536a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f152537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f152538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f152539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f152540e;

    public /* synthetic */ f(e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4) {
        this.f152537b = aVar;
        this.f152538c = aVar2;
        this.f152539d = aVar3;
        this.f152540e = aVar4;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (this.f152536a) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.d.a(false, z3.f.c(-324301078, new p40.r(this.f152537b, 23), mVar), null, null, null, z3.f.c(772779366, new ds.g(this.f152538c, this.f152539d, this.f152540e, 2), mVar), mVar, 196656, 29);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                g.a(this.f152537b, this.f152538c, this.f152539d, this.f152540e, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, int i14) {
        this.f152537b = aVar;
        this.f152538c = aVar2;
        this.f152539d = aVar3;
        this.f152540e = aVar4;
    }
}
