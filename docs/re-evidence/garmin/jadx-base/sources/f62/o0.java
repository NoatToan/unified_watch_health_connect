package f62;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesViewModel$updateAudioNote$1", f = "WorkoutEditNotesViewModel.kt", l = {53}, m = "invokeSuspend", v = 2)
public final class o0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f69295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.a f69296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.h0 f69297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.h0 h0Var, t13.d<? super o0> dVar) {
        super(2, dVar);
        this.f69296b = aVar;
        this.f69297c = h0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o0(this.f69296b, this.f69297c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f69295a;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2 = this.f69296b;
            if (aVar2 == null) {
                aVar2 = new com.garmin.android.apps.connectmobile.workouts.data.model.a(null, null, null, 7, null);
            }
            p2 p2Var = this.f69297c.f49001c;
            this.f69295a = 1;
            p2Var.k(null, aVar2);
            if (Unit.INSTANCE == aVar) {
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
