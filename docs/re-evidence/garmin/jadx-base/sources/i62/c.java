package i62;

import androidx.lifecycle.y0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.msn.MSNWorkoutExerciseViewModel$fetchMSNWorkoutExercise$1", f = "MSNWorkoutExerciseViewModel.kt", l = {39}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f91831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0<fw.m<com.garmin.android.apps.connectmobile.workouts.data.model.o>> f91832c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.msn.MSNWorkoutExerciseViewModel$fetchMSNWorkoutExercise$1$1", f = "MSNWorkoutExerciseViewModel.kt", l = {40}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f91833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f91834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y0<fw.m<com.garmin.android.apps.connectmobile.workouts.data.model.o>> f91835c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, y0<fw.m<com.garmin.android.apps.connectmobile.workouts.data.model.o>> y0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f91834b = eVar;
            this.f91835c = y0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f91834b, this.f91835c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f91833a;
            if (i14 == 0) {
                r.b(obj);
                this.f91833a = 1;
                if (e.x4(this.f91834b, this.f91835c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, y0<fw.m<com.garmin.android.apps.connectmobile.workouts.data.model.o>> y0Var, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f91831b = eVar;
        this.f91832c = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f91831b, this.f91832c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f91830a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f91831b, this.f91832c, null);
            this.f91830a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
