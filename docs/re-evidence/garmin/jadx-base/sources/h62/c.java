package h62;

import com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkoutListActivity f82210b;

    public /* synthetic */ c(WorkoutListActivity workoutListActivity, int i14) {
        this.f82209a = i14;
        this.f82210b = workoutListActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f82209a;
        WorkoutListActivity workoutListActivity = this.f82210b;
        switch (i14) {
            case 0:
                WorkoutListActivity.a aVar = WorkoutListActivity.f49414i;
                return Boolean.valueOf(workoutListActivity.getIntent().getBooleanExtra("extra.from.calender", false));
            default:
                WorkoutListActivity.a aVar2 = WorkoutListActivity.f49414i;
                workoutListActivity.finish();
                return Unit.INSTANCE;
        }
    }
}
