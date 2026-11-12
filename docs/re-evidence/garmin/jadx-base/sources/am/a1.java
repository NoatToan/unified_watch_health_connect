package am;

import com.garmin.android.apps.connectmobile.activities.ActivityTypesActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityTypesActivity f3852c;

    public /* synthetic */ a1(String str, ActivityTypesActivity activityTypesActivity, int i14) {
        this.f3850a = i14;
        this.f3851b = str;
        this.f3852c = activityTypesActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f3850a;
        ActivityTypesActivity activityTypesActivity = this.f3852c;
        String str = this.f3851b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ActivityTypesActivity.a aVar = ActivityTypesActivity.f28779c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-244848915, new a1(str, activityTypesActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ActivityTypesActivity.a aVar2 = ActivityTypesActivity.f28779c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    boolean zR = mVar2.r(activityTypesActivity);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new ActivityTypesActivity.c(activityTypesActivity);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ActivityTypesActivity.c(activityTypesActivity);
                            mVar2.K(objQ);
                        }
                    }
                    p1.d(str, null, (e23.a) ((k23.g) objQ), mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
