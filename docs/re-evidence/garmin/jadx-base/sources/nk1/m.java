package nk1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.Office365SettingDTO;
import com.garmin.android.library.backgroundtaskmanagement.BizOperationException;
import o13.r;
import o53.b0;
import o53.s;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/settings/model/Office365SettingDTO;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/settings/model/Office365SettingDTO;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.repo.ThirdPartyRepo$getOffice365ConnectStatus$2", f = "ThirdPartyRepo.kt", l = {69}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Office365SettingDTO>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f126439b;

    public m(t13.d<? super m> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(dVar);
        mVar.f126439b = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Office365SettingDTO> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f126439b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126438a;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            o53.r<Office365SettingDTO> rVarK = new gw.b0(null).k();
            this.f126439b = b0Var;
            this.f126438a = 1;
            Object objC = ((s) rVarK).C(this);
            return objC == aVar ? aVar : objC;
        } catch (BizOperationException e4) {
            String str = "GET Office 365 Status -> server call failed with status=[" + e4.getStatus() + "]";
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "ThirdPartyRepo", str);
            return null;
        }
    }
}
