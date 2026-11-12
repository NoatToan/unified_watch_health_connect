package pu;

import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationCaller$execute$fetchUserSettings$1", f = "PostUserAuthenticationCaller.kt", l = {74}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super UserSettingsDTO>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f141175b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(n nVar, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f141175b = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f141175b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super UserSettingsDTO> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141174a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        this.f141174a = 1;
        int i15 = n.f141134l;
        Object objI = this.f141175b.i(0, this);
        return objI == aVar ? aVar : objI;
    }
}
