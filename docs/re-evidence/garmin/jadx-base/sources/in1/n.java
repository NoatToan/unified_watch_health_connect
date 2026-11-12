package in1;

import c2.t2;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f94537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f94538c;

    public /* synthetic */ n(t2 t2Var, int i14, int i15) {
        this.f94536a = i15;
        this.f94537b = t2Var;
        this.f94538c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f94536a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                s.o(this.f94537b, mVar, p0.t(this.f94538c | 1));
                break;
            default:
                lh0.n.d(this.f94537b, mVar, p0.t(this.f94538c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
