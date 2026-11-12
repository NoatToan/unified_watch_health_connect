package rc2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lwc2/a;", "Lsc2/e;", "<anonymous>", "(Lo53/b0;)Lwc2/a;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.lib.networking.authentication.itapi.ITBasicCustomerInfoRequest$run$2", f = "ITBasicCustomerInfoRequest.kt", l = {79}, m = "invokeSuspend")
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super wc2.a<? extends sc2.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f151935b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f151935b = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f151935b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super wc2.a<? extends sc2.e>> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151934a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        this.f151934a = 1;
        int i15 = n.f151930h;
        Object objB = this.f151935b.b(this);
        return objB == aVar ? aVar : objB;
    }
}
