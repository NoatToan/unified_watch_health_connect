package gb1;

import androidx.lifecycle.y0;
import c22.t3;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import o53.b0;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsViewModel$postPregnantCycleType$1", f = "PregnancyDetailsViewModel.kt", l = {228}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserSettingsDTO f76701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f76702c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(UserSettingsDTO userSettingsDTO, l lVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f76701b = userSettingsDTO;
        this.f76702c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f76701b, this.f76702c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f76700a;
        l lVar = this.f76702c;
        if (i14 == 0) {
            o13.r.b(obj);
            UserSettingsDTO userSettingsDTO = this.f76701b;
            UserSettingsDTO userSettingsDTOC = userSettingsDTO != null ? userSettingsDTO.C() : null;
            if (userSettingsDTOC != null) {
                userSettingsDTOC.g0(ww0.a.PREGNANT);
            }
            JSONObject jSONObjectB = t3.b(userSettingsDTOC != null ? userSettingsDTOC.t1() : null, userSettingsDTO != null ? userSettingsDTO.t1() : null);
            this.f76700a = 1;
            obj = l.x4(lVar, userSettingsDTOC, jSONObjectB, this);
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
        ((y0) lVar.f76687e.getValue()).j(tb1.d.b(pVar != null ? (Boolean) pVar.f128594a : null, null, pVar != null ? (Throwable) pVar.f128595b : null, null, 10));
        return Unit.INSTANCE;
    }
}
