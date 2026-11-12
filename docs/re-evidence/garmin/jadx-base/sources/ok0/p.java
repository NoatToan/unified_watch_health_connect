package ok0;

import am.x0;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132507a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f132508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f132509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f132510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f132511e;

    public /* synthetic */ p(n nVar, x0 x0Var, p1 p1Var, e23.a aVar) {
        this.f132508b = nVar;
        this.f132509c = x0Var;
        this.f132510d = p1Var;
        this.f132511e = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f132507a) {
            case 0:
                ((Integer) obj2).getClass();
                s.d(this.f132508b, this.f132509c, this.f132510d, this.f132511e, (p3.m) obj, p0.t(1));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    s.d(this.f132508b, this.f132509c, this.f132510d, this.f132511e, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ p(n nVar, x0 x0Var, p1 p1Var, e23.a aVar, int i14) {
        this.f132508b = nVar;
        this.f132509c = x0Var;
        this.f132510d = p1Var;
        this.f132511e = aVar;
    }
}
