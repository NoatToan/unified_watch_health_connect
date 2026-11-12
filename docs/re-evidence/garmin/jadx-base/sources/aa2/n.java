package aa2;

import lc.m0;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2349a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f2350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f2351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f2352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f2353e;

    public /* synthetic */ n(u uVar, m0 m0Var, e23.a aVar, e23.l lVar) {
        this.f2350b = uVar;
        this.f2351c = m0Var;
        this.f2352d = aVar;
        this.f2353e = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2349a) {
            case 0:
                ((Integer) obj2).getClass();
                s.c(this.f2350b, this.f2351c, this.f2352d, this.f2353e, (p3.m) obj, p0.t(1));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    s.c(this.f2350b, this.f2351c, this.f2352d, this.f2353e, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n(u uVar, m0 m0Var, e23.a aVar, e23.l lVar, int i14) {
        this.f2350b = uVar;
        this.f2351c = m0Var;
        this.f2352d = aVar;
        this.f2353e = lVar;
    }
}
