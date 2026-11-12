package c62;

import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class b0 extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
    public b0(Object obj) {
        super(0, obj, WorkoutDetailsActivity.class, "displayFailedMessage", "displayFailedMessage()V", 0);
    }

    @Override // e23.a
    public final Unit invoke() {
        WorkoutDetailsActivity workoutDetailsActivity = (WorkoutDetailsActivity) this.receiver;
        WorkoutDetailsActivity.a aVar = WorkoutDetailsActivity.f48482f;
        workoutDetailsActivity.displayFailedMessage();
        return Unit.INSTANCE;
    }
}
