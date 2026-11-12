package aq;

import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectFragment$onDragDropSwipeListener$1$onSwipe$1", f = "EditExercisesMultiSelectFragment.kt", l = {68}, m = "invokeSuspend", v = 2)
public final class s0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f12194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12195c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(n0 n0Var, int i14, t13.d<? super s0> dVar) {
        super(2, dVar);
        this.f12194b = n0Var;
        this.f12195c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s0(this.f12194b, this.f12195c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12193a;
        n0 n0Var = this.f12194b;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = n0.f12063j;
            EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = n0Var.u6();
            this.f12193a = 1;
            int i16 = this.f12195c;
            if (i16 < 0 || i16 >= editExercisesMultiSelectViewModelU6.f29803o.size()) {
                vb.h.x(am.j.h(i16, "Invalid index found: "));
                return null;
            }
            ArrayList arrayListD1 = p13.h0.d1(editExercisesMultiSelectViewModelU6.f29803o);
            arrayListD1.remove(i16);
            editExercisesMultiSelectViewModelU6.f29803o = arrayListD1;
            x53.c cVar = o53.s0.f129406a;
            Object objE0 = ge1.b.e0(u53.o.f168762a, new a1(editExercisesMultiSelectViewModelU6, null), this);
            if (objE0 != obj2) {
                objE0 = Unit.INSTANCE;
            }
            if (objE0 == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        int i17 = n0.f12063j;
        n0Var.u6().y4();
        return Unit.INSTANCE;
    }
}
