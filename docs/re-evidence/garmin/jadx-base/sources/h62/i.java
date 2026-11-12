package h62;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f82234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WorkoutDTO f82235c;

    public /* synthetic */ i(e23.l lVar, WorkoutDTO workoutDTO, int i14) {
        this.f82233a = i14;
        this.f82234b = lVar;
        this.f82235c = workoutDTO;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f82233a) {
            case 0:
                this.f82234b.invoke(this.f82235c);
                break;
            default:
                this.f82234b.invoke(this.f82235c);
                break;
        }
        return Unit.INSTANCE;
    }
}
