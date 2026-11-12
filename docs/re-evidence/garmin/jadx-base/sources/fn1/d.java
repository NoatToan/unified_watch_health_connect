package fn1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km1.c f72187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f72188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f72189d;

    public /* synthetic */ d(km1.c cVar, e23.a aVar, int i14, int i15) {
        this.f72186a = i15;
        this.f72187b = cVar;
        this.f72188c = aVar;
        this.f72189d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f72186a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                m.f(this.f72187b, this.f72188c, mVar, p0.t(this.f72189d | 1));
                break;
            case 1:
                kn1.k.c(this.f72187b, this.f72188c, mVar, p0.t(this.f72189d | 1));
                break;
            case 2:
                kn1.k.e(this.f72187b, this.f72188c, mVar, p0.t(this.f72189d | 1));
                break;
            case 3:
                kn1.k.h(this.f72187b, this.f72188c, mVar, p0.t(this.f72189d | 1));
                break;
            case 4:
                kn1.k.d(this.f72187b, this.f72188c, mVar, p0.t(this.f72189d | 1));
                break;
            case 5:
                kn1.k.i(this.f72187b, this.f72188c, mVar, p0.t(this.f72189d | 1));
                break;
            case 6:
                kn1.k.b(this.f72187b, this.f72188c, mVar, p0.t(this.f72189d | 1));
                break;
            case 7:
                kn1.k.a(this.f72187b, this.f72188c, mVar, p0.t(this.f72189d | 1));
                break;
            default:
                kn1.k.g(this.f72187b, this.f72188c, mVar, p0.t(this.f72189d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
