package aq;

import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiEditFragment$deleteSetsConfirmed$1", f = "EditExercisesMultiEditFragment.kt", l = {202}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f11899b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f11899b = c0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(this.f11899b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11898a;
        c0 c0Var = this.f11899b;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = c0.f11852i;
            EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = c0Var.u6();
            ArrayList arrayList = c0Var.v6().f11990a;
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((x) it.next()).f12285a));
            }
            r13.d dVar = r13.d.f149430a;
            dVar.getClass();
            List listN0 = p13.h0.N0(arrayList2, dVar);
            this.f11898a = 1;
            if (editExercisesMultiSelectViewModelU6.D4(listN0, this) == aVar) {
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
