package yr;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nr.w f198895b;

    public /* synthetic */ r(nr.w wVar) {
        this.f198894a = 0;
        this.f198895b = wVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f198894a;
        nr.w wVar = this.f198895b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    s.a(wVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                num.getClass();
                s.b(wVar, mVar, p3.p0.t(1));
                break;
            default:
                num.getClass();
                s.a(wVar, mVar, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ r(nr.w wVar, int i14, int i15) {
        this.f198894a = i15;
        this.f198895b = wVar;
    }
}
