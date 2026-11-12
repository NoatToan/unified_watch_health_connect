package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$exitReorderMode$1", f = "WorkoutEditCreateViewModel.kt", l = {1823}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f49392b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r rVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f49392b = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f49392b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f49391a;
        if (i14 == 0) {
            o13.r.b(obj);
            r rVar = this.f49392b;
            q qVar = (q) v52.d.c(rVar.f49286m);
            r53.j<v52.c<q>> jVar = rVar.f49285l;
            l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar = rVar.f49289p;
            if (iVar == null) {
                iVar = qVar.f49250f;
            }
            q qVarL = q.L(qVar, iVar, null, null, null, null, null, false, 16777183);
            this.f49391a = 1;
            if (v52.d.a(jVar, qVarL, this) == aVar) {
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
