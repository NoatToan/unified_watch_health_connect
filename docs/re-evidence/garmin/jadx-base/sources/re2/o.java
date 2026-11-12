package re2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import te2.j2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$isUserSignedIn$2", f = "AuthenticationHelper.kt", l = {}, m = "invokeSuspend")
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f152321a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z14, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f152321a = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f152321a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        b bVar = b.f152215a;
        b.c cVar = b.c.DEFAULT;
        bVar.getClass();
        b.K("isUserSignedIn", cVar, null);
        return Boolean.valueOf(b.w() ? false : j2.f164115a.o(bVar.b(), b.m(), this.f152321a));
    }
}
