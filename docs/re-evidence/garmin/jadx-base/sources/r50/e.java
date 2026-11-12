package r50;

import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity.c;
import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity.d;
import p005kotlin.Unit;
import p3.l0;
import p3.p1;
import p3.x1;
import r53.a2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoursePointListActivity f150418b;

    public /* synthetic */ e(CoursePointListActivity coursePointListActivity, int i14) {
        this.f150417a = i14;
        this.f150418b = coursePointListActivity;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f150417a;
        int i15 = 2;
        CoursePointListActivity coursePointListActivity = this.f150418b;
        switch (i14) {
            case 0:
                CoursePointListActivity.a aVar = CoursePointListActivity.f33079c;
                coursePointListActivity.ea(new t50.b.f((String) obj, (Integer) obj2));
                break;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                CoursePointListActivity.a aVar2 = CoursePointListActivity.f33079c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(891543415, new e(coursePointListActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                CoursePointListActivity.a aVar3 = CoursePointListActivity.f33079c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p1 p1VarC = s9.c.c(coursePointListActivity.da().f150433l, mVar2);
                    t50.e eVar = (t50.e) p1VarC.getF182175a();
                    a2 a2Var = coursePointListActivity.da().f150435n;
                    boolean zR = mVar2.r(coursePointListActivity);
                    Object objQ = mVar2.q();
                    p3.m.a aVar4 = p3.m.f135153a;
                    if (zR) {
                        objQ = new CoursePointListActivity.b(coursePointListActivity);
                        mVar2.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new CoursePointListActivity.b(coursePointListActivity);
                            mVar2.K(objQ);
                        }
                    }
                    s50.c.a(eVar, a2Var, (e23.l) ((k23.g) objQ), mVar2, 0);
                    Boolean boolValueOf = Boolean.valueOf(((t50.e) p1VarC.getF182175a()).f162541a);
                    boolean zB = mVar2.B(p1VarC) | mVar2.r(coursePointListActivity);
                    Object objQ2 = mVar2.q();
                    if (zB) {
                        objQ2 = coursePointListActivity.new c(p1VarC, null);
                        mVar2.K(objQ2);
                    } else {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = coursePointListActivity.new c(p1VarC, null);
                            mVar2.K(objQ2);
                        }
                    }
                    l0.e((e23.p) objQ2, boolValueOf, mVar2);
                    Unit unit = Unit.INSTANCE;
                    boolean zR2 = mVar2.r(coursePointListActivity);
                    Object objQ3 = mVar2.q();
                    if (zR2) {
                        objQ3 = coursePointListActivity.new d(null);
                        mVar2.K(objQ3);
                    } else {
                        aVar4.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = coursePointListActivity.new d(null);
                            mVar2.K(objQ3);
                        }
                    }
                    l0.e((e23.p) objQ3, unit, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            default:
                CoursePointListActivity.a aVar5 = CoursePointListActivity.f33079c;
                androidx.fragment.app.v supportFragmentManager = coursePointListActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                c60.e.c(supportFragmentManager);
                coursePointListActivity.ea(new t50.b.f((String) obj, (Integer) obj2));
                break;
        }
        return Unit.INSTANCE;
    }
}
