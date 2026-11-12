package aq;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesViewModel$getExercisesList$1", f = "EditExercisesViewModel.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class u1 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.repcounting.model.c>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f12257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Throwable f12258c;

    public u1(t13.d<? super u1> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.repcounting.model.c> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        u1 u1Var = new u1(dVar);
        u1Var.f12257b = jVar;
        u1Var.f12258c = th3;
        return u1Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = this.f12257b;
        Throwable th3 = this.f12258c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12256a;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.g(a2Var, "Error getting exercise list", th3);
            this.f12257b = null;
            this.f12258c = null;
            this.f12256a = 1;
            if (jVar.emit(null, this) == aVar) {
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
