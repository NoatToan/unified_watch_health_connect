package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$viewPredefinedMultisportWorkoutCopy$1", f = "WorkoutDetailsViewModel.kt", l = {1813}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f48839b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(f fVar, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f48839b = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f48839b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        c62.c f24790m;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48838a;
        if (i14 == 0) {
            o13.r.b(obj);
            f fVar = this.f48839b;
            e eVar = (e) v52.d.b(fVar.Z);
            if (eVar == null || (f24790m = eVar.getF24790m()) == null) {
                return Unit.INSTANCE;
            }
            long j8 = f24790m.f24691b;
            q53.w<v52.c<? extends d>> wVar = fVar.f48598k0;
            d.w wVar2 = new d.w(j8);
            this.f48838a = 1;
            if (v52.d.d(wVar, wVar2, this) == aVar) {
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
