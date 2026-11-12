package o62;

import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkoutStepEditActivity f129814b;

    public /* synthetic */ z(WorkoutStepEditActivity workoutStepEditActivity, int i14) {
        this.f129813a = i14;
        this.f129814b = workoutStepEditActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f129813a;
        WorkoutStepEditActivity workoutStepEditActivity = this.f129814b;
        int i15 = 0;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                WorkoutStepEditActivity.a aVar = WorkoutStepEditActivity.f49573h;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.f0(workoutStepEditActivity.da(), workoutStepEditActivity.ca(), mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                WorkoutStepEditActivity.a aVar2 = WorkoutStepEditActivity.f49573h;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-551021259, new z(workoutStepEditActivity, i15), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
