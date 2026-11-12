package ry0;

import com.garmin.android.apps.connectmobile.multidayactivities.presentation.list.MultiDayActivitiesListActivity;
import e23.p;
import g02.s0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.n;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155069a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiDayActivitiesListActivity f155070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f155071c;

    public /* synthetic */ e(MultiDayActivitiesListActivity multiDayActivitiesListActivity, p1 p1Var) {
        this.f155070b = multiDayActivitiesListActivity;
        this.f155071c = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f155069a;
        p1 p1Var = this.f155071c;
        MultiDayActivitiesListActivity multiDayActivitiesListActivity = this.f155070b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                MultiDayActivitiesListActivity.a aVar = MultiDayActivitiesListActivity.f39318c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    s0.a(null, ((Boolean) p1Var.getF182175a()) == null || s.g((Boolean) p1Var.getF182175a(), Boolean.FALSE), z3.f.c(1890061846, new e(multiDayActivitiesListActivity, p1Var), mVar), mVar, 384, 1);
                } else {
                    mVar.e();
                }
                break;
            default:
                MultiDayActivitiesListActivity.a aVar2 = MultiDayActivitiesListActivity.f39318c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    if (s.g((Boolean) p1Var.getF182175a(), Boolean.TRUE)) {
                        mVar.C(-188745718);
                        j jVar = (j) multiDayActivitiesListActivity.f39320b.getValue();
                        boolean zR = mVar.r(multiDayActivitiesListActivity);
                        Object objQ = mVar.q();
                        if (zR) {
                            objQ = new ro0.g(multiDayActivitiesListActivity, 7);
                            mVar.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new ro0.g(multiDayActivitiesListActivity, 7);
                                mVar.K(objQ);
                            }
                        }
                        i.a(jVar, (e23.a) objQ, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(-188528532);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(p1 p1Var, MultiDayActivitiesListActivity multiDayActivitiesListActivity) {
        this.f155071c = p1Var;
        this.f155070b = multiDayActivitiesListActivity;
    }
}
