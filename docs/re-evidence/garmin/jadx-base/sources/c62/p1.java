package c62;

import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$createWorkout$response$1", f = "WorkoutDetailsViewModel.kt", l = {1029}, m = "invokeSuspend", v = 2)
public final class p1 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends WorkoutDetailsDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WorkoutDetailsDTO f24854c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, WorkoutDetailsDTO workoutDetailsDTO, t13.d<? super p1> dVar) {
        super(2, dVar);
        this.f24853b = fVar;
        this.f24854c = workoutDetailsDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p1(this.f24853b, this.f24854c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends WorkoutDetailsDTO>> dVar) {
        return ((p1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f24852a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        l52.y yVar = this.f24853b.f48588b;
        this.f24852a = 1;
        Object objV = yVar.v(this.f24854c, this);
        return objV == aVar ? aVar : objV;
    }
}
