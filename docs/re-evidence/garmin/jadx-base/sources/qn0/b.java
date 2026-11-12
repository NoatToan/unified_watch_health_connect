package qn0;

import com.garmin.android.apps.connectmobile.healthstatus.presentation.HealthStatusActivity;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b63.o f145788b;

    public /* synthetic */ b(b63.o oVar) {
        this.f145787a = 0;
        this.f145788b = oVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f145787a;
        b63.o oVar = this.f145788b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                int i15 = HealthStatusActivity.f36640a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    o72.t.c(oVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                num.getClass();
                o72.t.c(oVar, mVar, p0.t(1));
                break;
            default:
                num.getClass();
                w51.v.c(oVar, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(b63.o oVar, int i14, int i15) {
        this.f145787a = i15;
        this.f145788b = oVar;
    }
}
