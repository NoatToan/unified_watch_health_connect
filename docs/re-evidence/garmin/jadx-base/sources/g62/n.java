package g62;

import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportOverviewFragment$initViews$6$1", f = "MultiSportOverviewFragment.kt", l = {223}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b f76101b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f76101b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f76101b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f76100a;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar = this.f76101b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f76100a = 1;
            if (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.u6(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVarY6 = bVar.y6();
        WorkoutDetailsDTO workoutDetailsDTO = cVarY6.f49138r;
        workoutDetailsDTO.T = null;
        workoutDetailsDTO.C().G();
        cVarY6.f49138r.C().F();
        ComposeView composeView = bVar.f49111d;
        if (composeView == null) {
            p005kotlin.jvm.internal.s.m("audioNoteView");
            throw null;
        }
        composeView.setVisibility(8);
        bVar.z6();
        return Unit.INSTANCE;
    }
}
