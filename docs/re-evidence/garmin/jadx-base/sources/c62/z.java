package c62;

import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class z extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
    public z(Object obj) {
        super(0, obj, WorkoutDetailsActivity.class, "onLaunch", "onLaunch()V", 0);
    }

    @Override // e23.a
    public final Unit invoke() {
        ((WorkoutDetailsActivity) this.receiver).ia();
        return Unit.INSTANCE;
    }
}
