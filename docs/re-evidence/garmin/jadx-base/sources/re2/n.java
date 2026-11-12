package re2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Luc2/b;", "<anonymous>", "(Lo53/b0;)Luc2/b;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$isRateLimitInEffect$2", f = "AuthenticationHelper.kt", l = {}, m = "invokeSuspend")
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super uc2.b>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.a f152320a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(sc2.a aVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f152320a = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f152320a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super uc2.b> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        uc2.a.f169996a.getClass();
        return uc2.a.d(this.f152320a);
    }
}
