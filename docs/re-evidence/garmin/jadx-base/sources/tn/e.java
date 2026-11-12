package tn;

import com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotActivity;
import gl1.y;
import lc.m0;
import lc.v0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f165461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HealthSnapshotActivity f165462c;

    public /* synthetic */ e(String str, HealthSnapshotActivity healthSnapshotActivity, int i14) {
        this.f165460a = i14;
        this.f165461b = str;
        this.f165462c = healthSnapshotActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f165460a;
        HealthSnapshotActivity healthSnapshotActivity = this.f165462c;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                HealthSnapshotActivity.a aVar = HealthSnapshotActivity.f29015d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(555214579, new e(this.f165461b, healthSnapshotActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                HealthSnapshotActivity.a aVar2 = HealthSnapshotActivity.f29015d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    m0 m0VarI = y.I(new v0[0], mVar2);
                    boolean zR = mVar2.r(healthSnapshotActivity) | mVar2.r(m0VarI);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new d(healthSnapshotActivity, m0VarI, i15);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new d(healthSnapshotActivity, m0VarI, i15);
                            mVar2.K(objQ);
                        }
                    }
                    nc.y.b(m0VarI, this.f165461b, null, null, null, null, null, null, (e23.l) objQ, mVar2, 0, 1020);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
