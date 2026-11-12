package c62;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class s0 extends p005kotlin.jvm.internal.q implements e23.l<g3<? extends o13.p<? extends Long, ? extends String>>, Unit> {
    public s0(Object obj) {
        super(1, obj, WorkoutDetailsActivity.class, "handleSendWorkoutUiResource", "handleSendWorkoutUiResource(Lcom/garmin/android/apps/connectmobile/UIResource;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(g3<? extends o13.p<? extends Long, ? extends String>> g3Var) {
        g3<? extends o13.p<? extends Long, ? extends String>> g3Var2 = g3Var;
        g3Var2.getClass();
        WorkoutDetailsActivity.ca((WorkoutDetailsActivity) this.receiver, g3Var2);
        return Unit.INSTANCE;
    }
}
