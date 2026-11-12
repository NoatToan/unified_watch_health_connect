package cw1;

import c2.x2;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56196a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f56198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f56199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f56200e;

    public /* synthetic */ s1(int i14, int i15, e23.l lVar, e23.a aVar) {
        this.f56197b = i14;
        this.f56198c = i15;
        this.f56199d = lVar;
        this.f56200e = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56196a) {
            case 0:
                ((Integer) obj2).getClass();
                v1.c(this.f56197b, this.f56199d, this.f56200e, (p3.m) obj, p3.p0.t(this.f56198c | 1));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    ub0.k.b(x2.f(h4.r.S, 1.0f), this.f56197b, this.f56198c, this.f56199d, this.f56200e, mVar, 6);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s1(int i14, e23.l lVar, e23.a aVar, int i15) {
        this.f56197b = i14;
        this.f56199d = lVar;
        this.f56200e = aVar;
        this.f56198c = i15;
    }
}
