package ey1;

import com.google.mlkit.common.MlKitException;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.SetupStrengthTrainingPlanViewModel$clearSnackbar$1", f = "SetupStrengthTrainingPlanViewModel.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f67301b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f67301b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f67301b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67300a;
        if (i14 == 0) {
            o13.r.b(obj);
            nx1.p pVar = this.f67301b.f67284p;
            this.f67300a = 1;
            Object objEmit = pVar.f128251a.emit(null, this);
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
