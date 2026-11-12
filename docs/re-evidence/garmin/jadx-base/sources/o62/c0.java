package o62;

import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity$handleEvent$3$1", f = "WorkoutStepEditActivity.kt", l = {241}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f129651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkoutStepEditActivity f129652b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(WorkoutStepEditActivity workoutStepEditActivity, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f129652b = workoutStepEditActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f129652b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f129651a;
        if (i14 == 0) {
            o13.r.b(obj);
            WorkoutStepEditActivity.a aVar2 = WorkoutStepEditActivity.f49573h;
            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa = this.f129652b.da();
            this.f129651a = 1;
            if (jVarDa.N4(this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
