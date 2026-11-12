package c62;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity$handleSendWorkoutUiResource$1", f = "WorkoutDetailsActivity.kt", l = {755}, m = "invokeSuspend", v = 2)
public final class p0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkoutDetailsActivity f24850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(WorkoutDetailsActivity workoutDetailsActivity, String str, t13.d<? super p0> dVar) {
        super(2, dVar);
        this.f24850b = workoutDetailsActivity;
        this.f24851c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p0(this.f24850b, this.f24851c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f24849a;
        if (i14 == 0) {
            o13.r.b(obj);
            e53.c.a aVar2 = e53.c.f63094b;
            long jE = e53.e.e(2000, e53.f.MILLISECONDS);
            this.f24849a = 1;
            if (o53.m0.c(jE, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        WorkoutDetailsActivity workoutDetailsActivity = this.f24850b;
        workoutDetailsActivity.ea().Z4();
        String str = this.f24851c;
        if (str != null) {
            r22.q0.b bVar = r22.q0.f149800b;
            View viewFindViewById = workoutDetailsActivity.findViewById(R.id.composable_container);
            viewFindViewById.getClass();
            r22.q0.b.c(bVar, viewFindViewById, str, null, 12).show();
        }
        return Unit.INSTANCE;
    }
}
