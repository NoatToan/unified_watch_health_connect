package c42;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.vo2.reports.presentation.onboarding.VO2MaxOnboardingInitialStateViewModel$checkInitialState$1", f = "VO2MaxOnboardingInitialStateViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f24415b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f24415b = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f24415b, dVar);
        mVar.f24414a = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        a2 a2Var = a2.TRAINING_INITIATIVE;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "VO2MaxOnboardingInitialStateViewModel", "Checking initial state for VO2 Max onboarding");
        l lVar = this.f24415b;
        p2 p2Var = lVar.f24411b;
        List<sd2.f> list = lVar.f24410a;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, new k(true, ((k) value).f24408b)));
        p2 p2Var2 = lVar.f24411b;
        do {
            value2 = p2Var2.getValue();
            ((k) value2).getClass();
        } while (!p2Var2.b(value2, new k(false, list)));
        a2 a2Var2 = a2.TRAINING_INITIATIVE;
        String strG = androidx.room.a0.g(list != null ? new Integer(list.size()) : null, "Initial state check complete: screenlessDevices=");
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "VO2MaxOnboardingInitialStateViewModel", strG);
        return Unit.INSTANCE;
    }
}
