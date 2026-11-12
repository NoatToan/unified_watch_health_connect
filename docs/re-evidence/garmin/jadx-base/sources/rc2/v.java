package rc2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lwc2/a;", "", "<anonymous>", "(Lo53/b0;)Lwc2/a;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.lib.networking.authentication.itapi.ITGetTokenForLockToEmailAddressRequest$run$2", f = "ITGetTokenForLockToEmailAddressRequest.kt", l = {107}, m = "invokeSuspend")
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super wc2.a<? extends String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f151953b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f151953b = wVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f151953b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super wc2.a<? extends String>> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151952a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        this.f151952a = 1;
        int i15 = w.f151954i;
        Object objB = this.f151953b.b(this);
        return objB == aVar ? aVar : objB;
    }
}
