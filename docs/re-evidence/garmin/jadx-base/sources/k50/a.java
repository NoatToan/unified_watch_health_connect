package k50;

import com.garmin.android.apps.connectmobile.courses.presentation.map.CourseMapActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.map.CourseMapActivity.c;
import e23.l;
import e23.p;
import k23.g;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;
import r53.a2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseMapActivity f102916b;

    public /* synthetic */ a(CourseMapActivity courseMapActivity, int i14) {
        this.f102915a = i14;
        this.f102916b = courseMapActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x007e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f102915a;
        CourseMapActivity courseMapActivity = this.f102916b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                CourseMapActivity.a aVar = CourseMapActivity.f33059b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-133941787, new a(courseMapActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                CourseMapActivity.a aVar2 = CourseMapActivity.f33059b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    p1 p1VarC = s9.c.c(courseMapActivity.ca().f102926b, mVar2);
                    m50.c cVar = (m50.c) p1VarC.getF182175a();
                    a2 a2Var = courseMapActivity.ca().f102928d;
                    boolean zR = mVar2.r(courseMapActivity);
                    Object objQ = mVar2.q();
                    m.a aVar3 = m.f135153a;
                    if (zR) {
                        objQ = new CourseMapActivity.b(courseMapActivity);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new CourseMapActivity.b(courseMapActivity);
                            mVar2.K(objQ);
                        }
                    }
                    l50.b.a(cVar, a2Var, (l) ((g) objQ), mVar2, 0);
                    Boolean boolValueOf = Boolean.valueOf(((m50.c) p1VarC.getF182175a()).f116644a);
                    boolean zB = mVar2.B(p1VarC) | mVar2.r(courseMapActivity);
                    Object objQ2 = mVar2.q();
                    if (zB) {
                        objQ2 = courseMapActivity.new c(p1VarC, null);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = courseMapActivity.new c(p1VarC, null);
                            mVar2.K(objQ2);
                        }
                    }
                    l0.e((p) objQ2, boolValueOf, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
