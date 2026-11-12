package aq;

import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectFragment$onDragDropSwipeListener$1$onDrop$1", f = "EditExercisesMultiSelectFragment.kt", l = {76}, m = "invokeSuspend", v = 2)
public final class r0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f12171b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(n0 n0Var, t13.d<? super r0> dVar) {
        super(2, dVar);
        this.f12171b = n0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r0(this.f12171b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12170a;
        n0 n0Var = this.f12171b;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = n0.f12063j;
            EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = n0Var.u6();
            this.f12170a = 1;
            if (editExercisesMultiSelectViewModelU6.C4(this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        int i16 = n0.f12063j;
        n0Var.u6().y4();
        return Unit.INSTANCE;
    }
}
