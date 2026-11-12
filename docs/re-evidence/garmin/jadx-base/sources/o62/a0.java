package o62;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkoutStepEditActivity f129644b;

    public /* synthetic */ a0(WorkoutStepEditActivity workoutStepEditActivity, int i14) {
        this.f129643a = i14;
        this.f129644b = workoutStepEditActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f129643a;
        WorkoutStepEditActivity workoutStepEditActivity = this.f129644b;
        switch (i15) {
            case 0:
                WorkoutStepEditActivity.a aVar = WorkoutStepEditActivity.f49573h;
                ge1.b.T(o53.f0.w(workoutStepEditActivity), null, null, new c0(workoutStepEditActivity, null), 3);
                break;
            default:
                WorkoutStepEditActivity.a aVar2 = WorkoutStepEditActivity.f49573h;
                workoutStepEditActivity.setResult(2);
                workoutStepEditActivity.finish();
                break;
        }
    }
}
