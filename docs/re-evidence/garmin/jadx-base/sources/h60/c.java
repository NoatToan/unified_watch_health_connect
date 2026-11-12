package h60;

import androidx.lifecycle.w1;
import com.garmin.android.apps.connectmobile.criticalswimspeed.summary.CriticalSwimSpeedReportsActivity;
import e23.p;
import fe2.z;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CriticalSwimSpeedReportsActivity f82154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1 f82155c;

    public /* synthetic */ c(CriticalSwimSpeedReportsActivity criticalSwimSpeedReportsActivity, w1 w1Var, int i14) {
        this.f82153a = i14;
        this.f82154b = criticalSwimSpeedReportsActivity;
        this.f82155c = w1Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82153a;
        w1 w1Var = this.f82155c;
        CriticalSwimSpeedReportsActivity criticalSwimSpeedReportsActivity = this.f82154b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                CriticalSwimSpeedReportsActivity.a aVar = CriticalSwimSpeedReportsActivity.f33109a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1843842114, new c(criticalSwimSpeedReportsActivity, w1Var, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                CriticalSwimSpeedReportsActivity.a aVar2 = CriticalSwimSpeedReportsActivity.f33109a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    h hVar = (h) w1Var.getValue();
                    boolean zR = mVar2.r(criticalSwimSpeedReportsActivity);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new z(criticalSwimSpeedReportsActivity, 29);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new z(criticalSwimSpeedReportsActivity, 29);
                            mVar2.K(objQ);
                        }
                    }
                    g.a(hVar, (e23.a) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
