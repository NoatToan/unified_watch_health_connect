package aq;

import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiEditFragment$doneEditMultiSets$1", f = "EditExercisesMultiEditFragment.kt", l = {99}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f11923b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(c0 c0Var, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f11923b = c0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f11923b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11922a;
        c0 c0Var = this.f11923b;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = c0.f11852i;
            EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = c0Var.u6();
            ArrayList arrayList = c0Var.v6().f11990a;
            this.f11922a = 1;
            if (editExercisesMultiSelectViewModelU6.z4(arrayList, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        int i16 = c0.f11852i;
        c0Var.u6().y4();
        c0Var.requireActivity().getOnBackPressedDispatcher().d();
        return Unit.INSTANCE;
    }
}
