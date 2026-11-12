package l62;

import com.garmin.android.apps.connectmobile.workouts.presentation.reschedule.RescheduleSTPWorkoutActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RescheduleSTPWorkoutActivity f110552b;

    public /* synthetic */ e(RescheduleSTPWorkoutActivity rescheduleSTPWorkoutActivity, int i14) {
        this.f110551a = i14;
        this.f110552b = rescheduleSTPWorkoutActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f110551a;
        RescheduleSTPWorkoutActivity rescheduleSTPWorkoutActivity = this.f110552b;
        switch (i14) {
            case 0:
                RescheduleSTPWorkoutActivity.a aVar = RescheduleSTPWorkoutActivity.f49530b;
                rescheduleSTPWorkoutActivity.onBackPressed();
                break;
            default:
                RescheduleSTPWorkoutActivity.a aVar2 = RescheduleSTPWorkoutActivity.f49530b;
                rescheduleSTPWorkoutActivity.setResult(-1);
                rescheduleSTPWorkoutActivity.finish();
                break;
        }
        return Unit.INSTANCE;
    }
}
