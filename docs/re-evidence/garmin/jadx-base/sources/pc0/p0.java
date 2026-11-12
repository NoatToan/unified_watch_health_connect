package pc0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.InReachSubscriptionSharedPreferences$shouldShowFinishInReachSetupBannerFlow$1", f = "InReachSubscriptionSharedPreferences.kt", l = {137}, m = "invokeSuspend", v = 2)
public final class p0 extends v13.i implements e23.p<q53.t<? super Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f137280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f137281c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(o0 o0Var, t13.d<? super p0> dVar) {
        super(2, dVar);
        this.f137281c = o0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p0 p0Var = new p0(this.f137281c, dVar);
        p0Var.f137280b = obj;
        return p0Var;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super Boolean> tVar, t13.d<? super Unit> dVar) {
        return ((p0) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f137280b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137279a;
        if (i14 == 0) {
            o13.r.b(obj);
            o0 o0Var = this.f137281c;
            tVar.i(Boolean.valueOf(o0.p(o0Var)));
            lp.k kVar = new lp.k(tVar, o0Var, 5);
            o0Var.f137274a.u3(kVar);
            p40.o0 o0Var2 = new p40.o0(4, o0Var, kVar);
            this.f137280b = null;
            this.f137279a = 1;
            if (q53.r.a(tVar, o0Var2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
