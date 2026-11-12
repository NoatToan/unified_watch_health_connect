package ky0;

import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity.c;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiDayActivitiesDetailActivity f107757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f107758c;

    public /* synthetic */ x(MultiDayActivitiesDetailActivity multiDayActivitiesDetailActivity, o13.l lVar, int i14) {
        this.f107756a = i14;
        this.f107757b = multiDayActivitiesDetailActivity;
        this.f107758c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x008a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f107756a;
        ?? r14 = this.f107758c;
        MultiDayActivitiesDetailActivity multiDayActivitiesDetailActivity = this.f107757b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                MultiDayActivitiesDetailActivity.a aVar = MultiDayActivitiesDetailActivity.f39233a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(-1996416246, new x(multiDayActivitiesDetailActivity, r14, i15), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                MultiDayActivitiesDetailActivity.a aVar2 = MultiDayActivitiesDetailActivity.f39233a;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    p3.p1 p1VarC = s9.c.c(((w0) r14.getValue()).f107613r1, mVar2);
                    Boolean bool = (Boolean) p1VarC.getF182175a();
                    bool.booleanValue();
                    boolean zR = mVar2.r(multiDayActivitiesDetailActivity) | mVar2.B(p1VarC);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = multiDayActivitiesDetailActivity.new c(p1VarC, null);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = multiDayActivitiesDetailActivity.new c(p1VarC, null);
                            mVar2.K(objQ);
                        }
                    }
                    p3.l0.e((e23.p) objQ, bool, mVar2);
                    lc.m0 m0VarI = gl1.y.I(new lc.v0[0], mVar2);
                    com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.a.c cVar = com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.a.c.INSTANCE;
                    boolean zR2 = mVar2.r(r14) | mVar2.r(multiDayActivitiesDetailActivity) | mVar2.r(m0VarI);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new k62.k(multiDayActivitiesDetailActivity, 11, m0VarI, (Object) r14);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new k62.k(multiDayActivitiesDetailActivity, 11, m0VarI, (Object) r14);
                            mVar2.K(objQ2);
                        }
                    }
                    nc.y.a(m0VarI, cVar, null, null, null, null, null, null, null, (e23.l) objQ2, mVar2, 48, 2044);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
