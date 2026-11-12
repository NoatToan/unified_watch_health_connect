package xe2;

import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$evaluatePlayStoreAgeSignals$fetchAccessStatus$3$1", f = "AuthenticationActivity.kt", l = {}, m = "invokeSuspend")
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AuthenticationActivity f190487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f190488b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AuthenticationActivity authenticationActivity, Throwable th3, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f190487a = authenticationActivity;
        this.f190488b = th3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f190487a, this.f190488b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Fragment fragmentG;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        i0 i0Var = i0.TERMS_OF_USE;
        AuthenticationActivity authenticationActivity = this.f190487a;
        int i14 = 2;
        if (i0Var == authenticationActivity.f50417f && (fragmentG = authenticationActivity.getSupportFragmentManager().G("TERMS_OF_USE")) != null) {
            com.garmin.android.library.mobileauth.ui.e eVar = (com.garmin.android.library.mobileauth.ui.e) fragmentG;
            androidx.lifecycle.n0 viewLifecycleOwner = eVar.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            androidx.lifecycle.i0 i0VarW = o53.f0.w(viewLifecycleOwner);
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(i0VarW, u53.o.f168762a, null, new s0(eVar, null), 2);
        }
        AuthenticationActivity.a aVar2 = AuthenticationActivity.f50343v;
        authenticationActivity.Y9();
        String string = authenticationActivity.getString(R.string.mobile_auth_title_unable_to_continue);
        String message = this.f190488b.getMessage();
        if (message == null) {
            message = "";
        }
        authenticationActivity.f50346o = n0.a(authenticationActivity, string, message, new f(authenticationActivity, i14), null, null, null, 112);
        return Unit.INSTANCE;
    }
}
