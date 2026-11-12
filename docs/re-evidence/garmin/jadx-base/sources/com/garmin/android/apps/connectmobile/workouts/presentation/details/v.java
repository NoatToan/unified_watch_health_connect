package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import androidx.lifecycle.t1;
import androidx.lifecycle.w0;
import c62.f2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$sendWorkoutToTargetedDevice$1", f = "WorkoutDetailsViewModel.kt", l = {1618}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f48819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f48821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0<g3<Long>> f48822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f48823e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(f fVar, w0<g3<Long>> w0Var, Long l14, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f48821c = fVar;
        this.f48822d = w0Var;
        this.f48823e = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f48821c, this.f48822d, this.f48823e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Long l14;
        w0 w0VarC5;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48820b;
        f fVar = this.f48821c;
        w0<g3<Long>> w0Var = this.f48822d;
        if (i14 == 0) {
            o13.r.b(obj);
            if (fVar.f48605r == null) {
                w0Var.j(g3.a.a(g3.f35298f, "Null workout DTO", null, null, null, 14));
                return Unit.INSTANCE;
            }
            Long lS4 = this.f48823e;
            if (lS4 == null) {
                lS4 = fVar.S4();
            }
            if (lS4 == null || lS4.longValue() < 1) {
                w0Var.j(g3.a.a(g3.f35298f, "No valid unit ID", null, null, null, 14));
                return Unit.INSTANCE;
            }
            WorkoutDetailsDTO workoutDetailsDTO = fVar.f48605r;
            if ((workoutDetailsDTO != null ? workoutDetailsDTO.f48044e : null) == m52.k.f116758r) {
                long jLongValue = lS4.longValue();
                this.f48819a = lS4;
                this.f48820b = 1;
                Object objB4 = f.B4(fVar, jLongValue, this);
                if (objB4 == aVar) {
                    return aVar;
                }
                l14 = lS4;
                obj = objB4;
            } else {
                l14 = lS4;
                w0VarC5 = fVar.c5(lS4.longValue(), false);
            }
            w0Var.n(t1.a(w0VarC5, new a12.a(new f2(0, l14), 28)), new f.p(new androidx.lifecycle.k(w0Var, 3)));
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        l14 = this.f48819a;
        o13.r.b(obj);
        w0VarC5 = fVar.c5(l14.longValue(), ((Boolean) obj).booleanValue());
        w0Var.n(t1.a(w0VarC5, new a12.a(new f2(0, l14), 28)), new f.p(new androidx.lifecycle.k(w0Var, 3)));
        return Unit.INSTANCE;
    }
}
