package rc2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lwc2/a;", "Lve2/i;", "<anonymous>", "(Lo53/b0;)Lwc2/a;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.lib.networking.authentication.itapi.ITMFALoginInfoRequest$run$2", f = "ITMFALoginInfoRequest.kt", l = {99}, m = "invokeSuspend")
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super wc2.a<? extends ve2.i>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f151897b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(d0 d0Var, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f151897b = d0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f151897b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super wc2.a<? extends ve2.i>> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151896a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        this.f151896a = 1;
        int i15 = d0.f151887h;
        Object objB = this.f151897b.b(this);
        return objB == aVar ? aVar : objB;
    }
}
