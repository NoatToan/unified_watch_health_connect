package cu1;

import com.garmin.android.apps.connectmobile.training.atp.dashboard.RescheduleWorkoutActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RescheduleWorkoutActivity f55705b;

    public /* synthetic */ s(RescheduleWorkoutActivity rescheduleWorkoutActivity, int i14) {
        this.f55704a = i14;
        this.f55705b = rescheduleWorkoutActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f55704a;
        RescheduleWorkoutActivity rescheduleWorkoutActivity = this.f55705b;
        switch (i14) {
            case 0:
                RescheduleWorkoutActivity.a aVar = RescheduleWorkoutActivity.f45357n;
                rescheduleWorkoutActivity.finish();
                break;
            case 1:
                RescheduleWorkoutActivity.a aVar2 = RescheduleWorkoutActivity.f45357n;
                rescheduleWorkoutActivity.ca();
                break;
            default:
                RescheduleWorkoutActivity.a aVar3 = RescheduleWorkoutActivity.f45357n;
                rescheduleWorkoutActivity.da();
                break;
        }
        return Unit.INSTANCE;
    }
}
