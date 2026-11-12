package w61;

import androidx.lifecycle.t0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lfw/m;", "Lcom/garmin/android/apps/connectmobile/performance/model/a;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$getTrainingStatusSummary$1", f = "TrainingStatusViewModel.kt", l = {314}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<t0<fw.m<? extends com.garmin.android.apps.connectmobile.performance.model.a>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f183195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f183196b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(x xVar, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f183196b = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i0(this.f183196b, dVar);
    }

    @Override // e23.p
    public final Object invoke(t0<fw.m<? extends com.garmin.android.apps.connectmobile.performance.model.a>> t0Var, t13.d<? super Unit> dVar) {
        return ((i0) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f183195a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f183195a = 1;
            if (x.y4(this.f183196b, this) == aVar) {
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
