package aq;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Laq/o0;", "Lb/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0 extends b.s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f12131d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectFragment$getOnBackPressedCallback$1$handleOnBackPressed$1", f = "EditExercisesMultiSelectFragment.kt", l = {328}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n0 f12133b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n0 n0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f12133b = n0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f12133b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f12132a;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = n0.f12063j;
                EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = this.f12133b.u6();
                this.f12132a = 1;
                if (editExercisesMultiSelectViewModelU6.x4(this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(n0 n0Var) {
        super(true);
        this.f12131d = n0Var;
    }

    @Override // b.s
    public final void b() {
        int i14 = n0.f12063j;
        n0 n0Var = this.f12131d;
        if (n0Var.u6().B4() != 0) {
            ge1.b.T(g22.f.b(n0Var), null, null, new a(n0Var, null), 3);
            return;
        }
        if (!n0Var.u6().f29796h) {
            n0Var.requireActivity().finish();
            return;
        }
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(n0Var.requireContext());
        aVar.setTitle(n0Var.getString(R.string.save_strategy_details_confirmation_title));
        aVar.setMessage(n0Var.getString(R.string.discard_unsaved_changes));
        aVar.setCancelable(true);
        aVar.setPositiveButton(n0Var.getString(R.string.lbl_common_continue), new ai1.a(n0Var, 1));
        aVar.setNegativeButton(n0Var.getString(R.string.lbl_cancel), new ag0.e(9));
        androidx.appcompat.app.e eVarCreate = aVar.create();
        eVarCreate.getClass();
        eVarCreate.show();
    }
}
