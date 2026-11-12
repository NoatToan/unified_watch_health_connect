package c62;

import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class d0 extends p005kotlin.jvm.internal.a implements e23.a<Unit> {
    public d0(Object obj) {
        super(0, obj, WorkoutDetailsActivity.class, "onNavigateUp", "onNavigateUp()Z", 8);
    }

    @Override // e23.a
    public final Unit invoke() {
        ((WorkoutDetailsActivity) this.receiver).onNavigateUp();
        return Unit.INSTANCE;
    }
}
