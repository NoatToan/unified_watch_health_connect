package aq;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exercises", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/repcounting/model/c;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesViewModel$getExercisesList$2", f = "EditExercisesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v1 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.repcounting.model.c, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f12269b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(x1 x1Var, t13.d<? super v1> dVar) {
        super(2, dVar);
        this.f12269b = x1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v1 v1Var = new v1(this.f12269b, dVar);
        v1Var.f12268a = obj;
        return v1Var;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.repcounting.model.c cVar, t13.d<? super Unit> dVar) {
        return ((v1) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) this.f12268a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f12269b.f12292c.m(cVar);
        return Unit.INSTANCE;
    }
}
