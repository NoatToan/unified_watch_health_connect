package k11;

import c2.x2;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102220a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f102221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f102222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f102223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f102224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f102225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o13.h f102226g;

    public /* synthetic */ l(boolean z14, boolean z15, boolean z16, int i14, e23.l lVar, e23.a aVar) {
        this.f102221b = z14;
        this.f102222c = z15;
        this.f102223d = z16;
        this.f102224e = i14;
        this.f102225f = lVar;
        this.f102226g = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f102220a;
        o13.h hVar = this.f102226g;
        switch (i14) {
            case 0:
                ((Integer) obj2).intValue();
                m.d(this.f102221b, this.f102222c, this.f102223d, this.f102225f, (e23.l) hVar, (p3.m) obj, p0.t(this.f102224e | 1));
                break;
            default:
                e23.a aVar = (e23.a) hVar;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    ub0.k.d(x2.f(h4.r.S, 1.0f), this.f102221b, this.f102222c, this.f102223d, this.f102224e, this.f102225f, aVar, mVar, 6);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ l(boolean z14, boolean z15, boolean z16, e23.l lVar, e23.l lVar2, int i14) {
        this.f102221b = z14;
        this.f102222c = z15;
        this.f102223d = z16;
        this.f102225f = lVar;
        this.f102226g = lVar2;
        this.f102224e = i14;
    }
}
