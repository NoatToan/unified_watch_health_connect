package ky0;

import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107759a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f107760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiDayActivitiesDetailActivity f107761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f107762d;

    public /* synthetic */ y(MultiDayActivitiesDetailActivity multiDayActivitiesDetailActivity, lc.m0 m0Var, o13.l lVar) {
        this.f107761c = multiDayActivitiesDetailActivity;
        this.f107762d = m0Var;
        this.f107760b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:18:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e7  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, o13.l] */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f107759a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).getClass();
                MultiDayActivitiesDetailActivity.a aVar2 = MultiDayActivitiesDetailActivity.f39233a;
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                p3.x1 x1Var = p3.n.f135158a;
                w0 w0Var = (w0) this.f107760b.getValue();
                MultiDayActivitiesDetailActivity multiDayActivitiesDetailActivity = this.f107761c;
                boolean zR = mVar.r(multiDayActivitiesDetailActivity);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new jx0.e(multiDayActivitiesDetailActivity, 27);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new jx0.e(multiDayActivitiesDetailActivity, 27);
                        mVar.K(objQ);
                    }
                }
                e23.a aVar3 = (e23.a) objQ;
                lc.m0 m0Var = this.f107762d;
                boolean zR2 = mVar.r(m0Var);
                Object objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new k62.j(m0Var, 4);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new k62.j(m0Var, 4);
                        mVar.K(objQ2);
                    }
                }
                e23.a aVar4 = (e23.a) objQ2;
                boolean zR3 = mVar.r(m0Var);
                Object objQ3 = mVar.q();
                if (zR3) {
                    objQ3 = new k62.j(m0Var, 5);
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new k62.j(m0Var, 5);
                        mVar.K(objQ3);
                    }
                }
                s0.a(w0Var, aVar3, aVar4, (e23.a) objQ3, mVar, 0);
                break;
            default:
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                MultiDayActivitiesDetailActivity.a aVar5 = MultiDayActivitiesDetailActivity.f39233a;
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                ?? r14 = this.f107760b;
                p3.p1 p1VarC = s9.c.c(((w0) r14.getValue()).B1, mVar2);
                Object objQ4 = mVar2.q();
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = p3.p0.n(null);
                    mVar2.K(objQ4);
                }
                p3.p1 p1Var = (p3.p1) objQ4;
                MultiDayActivitiesDetailActivity multiDayActivitiesDetailActivity2 = this.f107761c;
                lc.m0 m0Var2 = this.f107762d;
                z02.d.a(false, z3.f.c(-384277417, new jj2.c(multiDayActivitiesDetailActivity2, (Object) r14, m0Var2, p1Var, 16), mVar2), null, null, null, z3.f.c(-1263399845, new ix.h(multiDayActivitiesDetailActivity2, (Object) r14, m0Var2, p1Var, p1VarC, 14), mVar2), mVar2, 196656, 29);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ y(o13.l lVar, MultiDayActivitiesDetailActivity multiDayActivitiesDetailActivity, lc.m0 m0Var) {
        this.f107760b = lVar;
        this.f107761c = multiDayActivitiesDetailActivity;
        this.f107762d = m0Var;
    }
}
