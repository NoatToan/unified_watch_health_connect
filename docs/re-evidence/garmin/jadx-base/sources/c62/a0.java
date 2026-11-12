package c62;

import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class a0 extends p005kotlin.jvm.internal.q implements e23.l<com.garmin.android.apps.connectmobile.workouts.presentation.details.d, Unit> {
    public a0(Object obj) {
        super(1, obj, WorkoutDetailsActivity.class, "handleActionState", "handleActionState(Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/WorkoutDetailsActionState;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(com.garmin.android.apps.connectmobile.workouts.presentation.details.d dVar) {
        com.garmin.android.apps.connectmobile.workouts.presentation.details.d dVar2 = dVar;
        dVar2.getClass();
        ((WorkoutDetailsActivity) this.receiver).fa(dVar2);
        return Unit.INSTANCE;
    }
}
