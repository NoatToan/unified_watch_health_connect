package wv0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f187394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f187395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f187396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f187397e;

    public /* synthetic */ g(i53.c cVar, e23.l lVar, e23.a aVar, int i14, int i15) {
        this.f187393a = i15;
        this.f187394b = cVar;
        this.f187395c = lVar;
        this.f187396d = aVar;
        this.f187397e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f187393a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                i.b(this.f187394b, this.f187395c, this.f187396d, mVar, p0.t(this.f187397e | 1));
                break;
            default:
                i.g(this.f187394b, this.f187395c, this.f187396d, mVar, p0.t(this.f187397e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
