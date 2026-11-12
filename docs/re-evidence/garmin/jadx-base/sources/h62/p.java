package h62;

import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListViewModel$resetWorkoutType$1", f = "WorkoutListViewModel.kt", l = {125}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f82277b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f82277b = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f82277b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f82276a;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = this.f82277b.f82261m;
            j0 j0Var = j0.f134944a;
            this.f82276a = 1;
            p2Var.setValue(j0Var);
            if (Unit.INSTANCE == aVar) {
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
