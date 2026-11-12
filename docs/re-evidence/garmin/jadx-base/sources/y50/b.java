package y50;

import com.garmin.android.apps.connectmobile.courses.presentation.setup.CourseParametersActivity;
import e23.l;
import e23.p;
import k23.g;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import z3.f;
import z50.i;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseParametersActivity f194487b;

    public /* synthetic */ b(CourseParametersActivity courseParametersActivity, int i14) {
        this.f194486a = i14;
        this.f194487b = courseParametersActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f194486a;
        CourseParametersActivity courseParametersActivity = this.f194487b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                CourseParametersActivity.a aVar = CourseParametersActivity.f33102c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(1338843444, new b(courseParametersActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                CourseParametersActivity.a aVar2 = CourseParametersActivity.f33102c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    a60.b bVar = (a60.b) s9.c.c(((c) courseParametersActivity.f33104b.getValue()).f194489b, mVar2).getF182175a();
                    boolean zR = mVar2.r(courseParametersActivity);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new CourseParametersActivity.b(courseParametersActivity);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new CourseParametersActivity.b(courseParametersActivity);
                            mVar2.K(objQ);
                        }
                    }
                    i.a(bVar, (l) ((g) objQ), mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
