package xe2;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$informUserContinueAsFailed$1", f = "AuthenticationActivity.kt", l = {}, m = "invokeSuspend")
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AuthenticationActivity f190513a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AuthenticationActivity authenticationActivity, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f190513a = authenticationActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f190513a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        AuthenticationActivity.a aVar2 = AuthenticationActivity.f50343v;
        AuthenticationActivity authenticationActivity = this.f190513a;
        authenticationActivity.Z9().debug("informUserContinueAsFailed");
        Context applicationContext = authenticationActivity.getApplicationContext();
        authenticationActivity.Y9();
        String string = authenticationActivity.getString(R.string.mobile_auth_title_unable_to_continue);
        String string2 = authenticationActivity.getString(R.string.mobile_auth_msg_unable_to_continue);
        string2.getClass();
        authenticationActivity.f50346o = n0.a(authenticationActivity, string, string2, new af2.b(applicationContext, 4), null, null, null, 112);
        return Unit.INSTANCE;
    }
}
