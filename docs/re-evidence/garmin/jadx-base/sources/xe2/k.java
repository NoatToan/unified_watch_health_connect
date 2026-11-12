package xe2;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$handleInoperableWebView$1", f = "AuthenticationActivity.kt", l = {}, m = "invokeSuspend")
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AuthenticationActivity f190506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f190507b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xe2/k$a", "Lxe2/l0;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AuthenticationActivity f190508a;

        public a(AuthenticationActivity authenticationActivity) {
            this.f190508a = authenticationActivity;
        }

        @Override // xe2.l0
        public final void a() {
            AuthenticationActivity.a aVar = AuthenticationActivity.f50343v;
            AuthenticationActivity authenticationActivity = this.f190508a;
            authenticationActivity.Z9().debug("handleInoperableWebView: user action 'Cancel'");
            authenticationActivity.ca(i0.WELCOME, null);
        }

        @Override // xe2.l0
        public final void b() {
            AuthenticationActivity.a aVar = AuthenticationActivity.f50343v;
            AuthenticationActivity authenticationActivity = this.f190508a;
            authenticationActivity.Z9().debug("handleInoperableWebView: user action 'Exit App'");
            authenticationActivity.setResult(32025);
            authenticationActivity.finish();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AuthenticationActivity authenticationActivity, i0 i0Var, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f190506a = authenticationActivity;
        this.f190507b = i0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f190506a, this.f190507b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        AuthenticationActivity.a aVar2 = AuthenticationActivity.f50343v;
        AuthenticationActivity authenticationActivity = this.f190506a;
        authenticationActivity.Z9().warn("handleInoperableWebView: " + this.f190507b.name());
        authenticationActivity.Y9();
        re2.l0.f152316a.getClass();
        authenticationActivity.getClass();
        String string = authenticationActivity.getString(R.string.mobile_auth_title_unable_to_continue);
        string.getClass();
        String string2 = authenticationActivity.getString(R.string.msg_inoperable_webview);
        string2.getClass();
        String string3 = authenticationActivity.getString(R.string.lbl_cancel);
        string3.getClass();
        String string4 = authenticationActivity.getString(R.string.lbl_exit_app);
        string4.getClass();
        authenticationActivity.f50346o = n0.a(authenticationActivity, string, string2, null, new a(authenticationActivity), string3, string4, 8);
        return Unit.INSTANCE;
    }
}
