package re2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$safeGetOAuth2ITToken$3", f = "AuthenticationHelper.kt", l = {1062}, m = "invokeSuspend")
public final class y extends v13.i implements e23.l<t13.d<? super Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ve2.d f152357b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ve2.d dVar, t13.d<? super y> dVar2) {
        super(1, dVar2);
        this.f152357b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y(this.f152357b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Object> dVar) {
        return ((y) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152356a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b bVar = b.f152215a;
        this.f152356a = 1;
        Object objD = bVar.D("safeGetOAuth2ITToken", false, this.f152357b, this);
        return objD == aVar ? aVar : objD;
    }
}
