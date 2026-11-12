package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$refreshForRoundConditionEdited$1", f = "WorkoutEditCreateViewModel.kt", l = {1752}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.j0 f48927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f48928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, r rVar, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f48927b = j0Var;
        this.f48928c = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f48927b, this.f48928c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48926a;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = this.f48927b;
            if (j0Var == null) {
                return Unit.INSTANCE;
            }
            r rVar = this.f48928c;
            q qVar = (q) v52.d.c(rVar.f49286m);
            l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVarB = l52.w.b(qVar.f49250f);
            l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar = rVar.f49279f;
            if (bVar == null) {
                return Unit.INSTANCE;
            }
            rVar.f49279f = null;
            l52.e.b bVarN3 = ((l52.m) eVarB).n3(bVar);
            if (bVarN3 == null) {
                return Unit.INSTANCE;
            }
            bVarN3.h(j0Var);
            if (j0Var.f48227l == m52.a.f116649e) {
                l52.o.f(bVarN3, new e52.b(14, rVar, qVar.f49245a));
            }
            r53.j<v52.c<q>> jVar = rVar.f49285l;
            q qVarL = q.L(qVar, eVarB, null, null, null, null, null, false, 33554399);
            this.f48926a = 1;
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
