package hx0;

import androidx.lifecycle.y0;
import c22.t3;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.PregnancyDetailsViewModel$postPregnantCycleType$1", f = "PregnancyDetailsViewModel.kt", l = {162}, m = "invokeSuspend", v = 2)
public final class r0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserSettingsDTO f86134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f86135c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(UserSettingsDTO userSettingsDTO, o0 o0Var, t13.d<? super r0> dVar) {
        super(2, dVar);
        this.f86134b = userSettingsDTO;
        this.f86135c = o0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r0(this.f86134b, this.f86135c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86133a;
        o0 o0Var = this.f86135c;
        if (i14 == 0) {
            o13.r.b(obj);
            UserSettingsDTO userSettingsDTO = this.f86134b;
            UserSettingsDTO userSettingsDTOC = userSettingsDTO != null ? userSettingsDTO.C() : null;
            if (userSettingsDTOC != null) {
                userSettingsDTOC.g0(ww0.a.PREGNANT);
            }
            JSONObject jSONObjectB = t3.b(userSettingsDTOC != null ? userSettingsDTOC.t1() : null, userSettingsDTO != null ? userSettingsDTO.t1() : null);
            this.f86133a = 1;
            obj = o0.x4(o0Var, userSettingsDTOC, jSONObjectB, this);
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
        o13.p pVar = (o13.p) obj;
        ((y0) o0Var.f86115e.getValue()).j(tb1.d.b(pVar != null ? (Boolean) pVar.f128594a : null, null, pVar != null ? (Throwable) pVar.f128595b : null, null, 10));
        return Unit.INSTANCE;
    }
}
