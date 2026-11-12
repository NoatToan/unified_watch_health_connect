package y50;

import com.garmin.android.apps.connectmobile.courses.model.i;
import com.garmin.android.apps.connectmobile.courses.presentation.setup.CourseDrawingMethodActivity;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseDrawingMethodActivity f194483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f194484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f194485d;

    public /* synthetic */ a(CourseDrawingMethodActivity courseDrawingMethodActivity, i iVar, int i14, int i15) {
        this.f194482a = i15;
        this.f194483b = courseDrawingMethodActivity;
        this.f194484c = iVar;
        this.f194485d = i14;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f194482a;
        int i15 = this.f194485d;
        i iVar = this.f194484c;
        CourseDrawingMethodActivity courseDrawingMethodActivity = this.f194483b;
        int i16 = 1;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                CourseDrawingMethodActivity.a aVar = CourseDrawingMethodActivity.f33101a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(-364499456, new a(courseDrawingMethodActivity, iVar, i15, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                CourseDrawingMethodActivity.a aVar2 = CourseDrawingMethodActivity.f33101a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    boolean zR = mVar.r(courseDrawingMethodActivity) | mVar.k(iVar.ordinal());
                    Object objQ = mVar.q();
                    m.a aVar3 = m.f135153a;
                    if (zR) {
                        objQ = new xr.a(9, courseDrawingMethodActivity, iVar);
                        mVar.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new xr.a(9, courseDrawingMethodActivity, iVar);
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    boolean zR2 = mVar.r(courseDrawingMethodActivity) | mVar.k(iVar.ordinal()) | mVar.k(i15);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        objQ2 = new a83.a(courseDrawingMethodActivity, iVar, i15, 17);
                        mVar.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new a83.a(courseDrawingMethodActivity, iVar, i15, 17);
                            mVar.K(objQ2);
                        }
                    }
                    z50.f.a(aVar4, (e23.a) objQ2, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
