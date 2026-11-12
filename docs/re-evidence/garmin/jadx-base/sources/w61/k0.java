package w61;

import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$getUserSettings$2", f = "TrainingStatusViewModel.kt", l = {971}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.p<o53.b0, t13.d<? super UserSettingsDTO>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f183207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f183208b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(x xVar, t13.d<? super k0> dVar) {
        super(2, dVar);
        this.f183208b = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k0(this.f183208b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super UserSettingsDTO> dVar) {
        return ((k0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f183207a;
        if (i14 == 0) {
            o13.r.b(obj);
            oj1.c cVarA = oj1.c.a.a(oj1.c.f132368d);
            this.f183207a = 1;
            obj = cVarA.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        UserSettingsDTO userSettingsDTOS = v2Var instanceof v2.b ? (UserSettingsDTO) ((v2.b) v2Var).f47386a : GCMSettingManager.s();
        this.f183208b.f183277l = userSettingsDTOS;
        return userSettingsDTOS;
    }
}
