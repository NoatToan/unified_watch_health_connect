package w51;

import com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PendingActivitiesActivity f182252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f182253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pending.activities.presentation.a f182254d;

    public /* synthetic */ e(PendingActivitiesActivity pendingActivitiesActivity, boolean z14, com.garmin.android.apps.connectmobile.pending.activities.presentation.a aVar, int i14) {
        this.f182251a = i14;
        this.f182252b = pendingActivitiesActivity;
        this.f182253c = z14;
        this.f182254d = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f182251a;
        boolean z14 = this.f182253c;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                PendingActivitiesActivity.a aVar = PendingActivitiesActivity.f39793d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1222843364, new e(this.f182252b, z14, this.f182254d, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                PendingActivitiesActivity.a aVar2 = PendingActivitiesActivity.f39793d;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    lc.m0 m0VarI = gl1.y.I(new lc.v0[0], mVar2);
                    PendingActivitiesActivity pendingActivitiesActivity = this.f182252b;
                    pendingActivitiesActivity.f39795b = m0VarI;
                    boolean zR = mVar2.r(m0VarI) | mVar2.r(pendingActivitiesActivity);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = new vv0.n(11, m0VarI, pendingActivitiesActivity);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new vv0.n(11, m0VarI, pendingActivitiesActivity);
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    boolean zH = mVar2.h(z14) | mVar2.r(pendingActivitiesActivity);
                    Object objQ2 = mVar2.q();
                    if (zH) {
                        objQ2 = new b50.o(z14, pendingActivitiesActivity, 15);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new b50.o(z14, pendingActivitiesActivity, 15);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ2;
                    boolean zH2 = mVar2.h(z14) | mVar2.r(pendingActivitiesActivity);
                    Object objQ3 = mVar2.q();
                    if (zH2) {
                        objQ3 = new ap2.f(z14, pendingActivitiesActivity, 23);
                        mVar2.K(objQ3);
                    } else {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ap2.f(z14, pendingActivitiesActivity, 23);
                            mVar2.K(objQ3);
                        }
                    }
                    e23.p pVar = (e23.p) objQ3;
                    boolean zB = mVar2.B(aVar4) | mVar2.r(m0VarI) | mVar2.B(aVar5) | mVar2.r(pendingActivitiesActivity) | mVar2.B(pVar);
                    Object objQ4 = mVar2.q();
                    if (zB) {
                        ug2.q qVar = new ug2.q(aVar4, aVar5, pVar, m0VarI, pendingActivitiesActivity, 9);
                        m0VarI = m0VarI;
                        mVar2.K(qVar);
                        objQ4 = qVar;
                    } else {
                        aVar3.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            ug2.q qVar2 = new ug2.q(aVar4, aVar5, pVar, m0VarI, pendingActivitiesActivity, 9);
                            m0VarI = m0VarI;
                            mVar2.K(qVar2);
                            objQ4 = qVar2;
                        }
                    }
                    nc.y.a(m0VarI, this.f182254d, null, null, null, null, null, null, null, (e23.l) objQ4, mVar2, 0, 2044);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
