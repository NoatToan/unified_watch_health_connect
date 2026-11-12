package rb1;

import androidx.lifecycle.y0;
import c22.t3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import e23.p;
import o13.r;
import o53.b0;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ww0.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.stoptracking.PregnancyStopTrackingViewModel$postInactiveCycleType$1", f = "PregnancyStopTrackingViewModel.kt", l = {242}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f151648b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f151648b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f151648b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151647a;
        g gVar = this.f151648b;
        if (i14 == 0) {
            r.b(obj);
            UserSettingsDTO userSettingsDTOS = GCMSettingManager.s();
            UserSettingsDTO userSettingsDTOC = userSettingsDTOS.C();
            userSettingsDTOC.g0(ww0.a.INACTIVE);
            u uVar = userSettingsDTOC.f43527e;
            if (uVar != null) {
                tb1.e.f163745a.getClass();
                uVar.y(tb1.e.a.c());
            }
            JSONObject jSONObjectB = t3.b(userSettingsDTOC.t1(), userSettingsDTOS.t1());
            this.f151647a = 1;
            obj = g.y4(gVar, userSettingsDTOC, jSONObjectB, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        o13.p pVar = (o13.p) obj;
        int i15 = g.f151619k;
        ((y0) gVar.f151629j.getValue()).j(tb1.d.b(pVar != null ? (Boolean) pVar.f128594a : null, null, pVar != null ? (Throwable) pVar.f128595b : null, null, 10));
        i52.a.f91796a.getClass();
        i52.a.f91797b.edit().putInt(i52.a.c(R.string.key_has_user_seen_baby_size_dialog), -1).apply();
        return Unit.INSTANCE;
    }
}
