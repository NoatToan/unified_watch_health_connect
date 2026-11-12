package in1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km1.c f94548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sm1.s f94549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f94550d;

    public /* synthetic */ q(km1.c cVar, sm1.s sVar, int i14, int i15) {
        this.f94547a = i15;
        this.f94548b = cVar;
        this.f94549c = sVar;
        this.f94550d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f94547a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                s.q(this.f94548b, this.f94549c, mVar, p0.t(this.f94550d | 1));
                break;
            default:
                kn1.n.a(this.f94548b, this.f94549c, mVar, p0.t(this.f94550d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
