package xe2;

import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.AuthenticationActivity$finishWithResultRateLimited$1", f = "AuthenticationActivity.kt", l = {}, m = "invokeSuspend")
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AuthenticationActivity f190503a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AuthenticationActivity authenticationActivity, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f190503a = authenticationActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f190503a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        AuthenticationActivity.a aVar2 = AuthenticationActivity.f50343v;
        AuthenticationActivity authenticationActivity = this.f190503a;
        authenticationActivity.Y9();
        authenticationActivity.setResult(2);
        authenticationActivity.finish();
        return Unit.INSTANCE;
    }
}
