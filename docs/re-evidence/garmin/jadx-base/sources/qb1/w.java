package qb1;

import androidx.lifecycle.y0;
import c22.t3;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel$postPregnantCycleType$1", f = "PregnancySetupViewModel.kt", l = {718}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserSettingsDTO f144188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f144189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(UserSettingsDTO userSettingsDTO, f fVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f144188b = userSettingsDTO;
        this.f144189c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f144188b, this.f144189c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144187a;
        f fVar = this.f144189c;
        if (i14 == 0) {
            o13.r.b(obj);
            UserSettingsDTO userSettingsDTO = this.f144188b;
            UserSettingsDTO userSettingsDTOC = userSettingsDTO != null ? userSettingsDTO.C() : null;
            if (userSettingsDTOC != null) {
                userSettingsDTOC.g0(ww0.a.PREGNANT);
            }
            JSONObject jSONObjectB = t3.b(userSettingsDTOC != null ? userSettingsDTOC.t1() : null, userSettingsDTO != null ? userSettingsDTO.t1() : null);
            this.f144187a = 1;
            int i15 = f.D;
            obj = fVar.L4(userSettingsDTOC, jSONObjectB, this);
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
        ((y0) fVar.f144062f.getValue()).j(tb1.d.b(pVar != null ? (Boolean) pVar.f128594a : null, null, pVar != null ? (Throwable) pVar.f128595b : null, null, 10));
        return Unit.INSTANCE;
    }
}
