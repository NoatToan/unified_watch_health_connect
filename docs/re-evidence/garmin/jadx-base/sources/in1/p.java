package in1;

import c2.t2;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f94544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f94545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f94546d;

    public /* synthetic */ p(t2 t2Var, double d14, int i14, int i15) {
        this.f94543a = i15;
        this.f94544b = t2Var;
        this.f94545c = d14;
        this.f94546d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f94543a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                s.b(this.f94544b, this.f94545c, mVar, p0.t(this.f94546d | 1));
                break;
            case 1:
                s.g(this.f94544b, this.f94545c, mVar, p0.t(this.f94546d | 1));
                break;
            default:
                s.c(this.f94544b, this.f94545c, mVar, p0.t(this.f94546d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
