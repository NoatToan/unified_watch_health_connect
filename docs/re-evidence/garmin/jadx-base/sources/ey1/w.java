package ey1;

import com.garmin.android.apps.connectmobile.R;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$showGenericErrorSnackbar$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {280}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f67441b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(j jVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f67441b = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f67441b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67440a;
        if (i14 == 0) {
            o13.r.b(obj);
            j jVar = this.f67441b;
            nx1.p pVar = jVar.f67344k;
            dy1.o oVar = new dy1.o(jVar.f67346m.f134334a.getString(R.string.txt_error_occurred), null, null, 6, null);
            this.f67440a = 1;
            Object objEmit = pVar.f128251a.emit(oVar, this);
            if (objEmit != aVar) {
                objEmit = Unit.INSTANCE;
            }
            if (objEmit == aVar) {
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
