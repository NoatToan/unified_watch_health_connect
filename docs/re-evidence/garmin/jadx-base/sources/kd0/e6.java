package kd0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.ThirdPartyDelegateImpl$getMFPConnectStatus$2", f = "ThirdPartyDelegateImpl.kt", l = {27}, m = "invokeSuspend", v = 2)
public final class e6 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d6 f104053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(d6 d6Var, t13.d<? super e6> dVar) {
        super(2, dVar);
        this.f104053c = d6Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e6 e6Var = new e6(this.f104053c, dVar);
        e6Var.f104052b = obj;
        return e6Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e6) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f104052b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f104051a;
        if (i14 == 0) {
            o13.r.b(obj);
            m01.a aVar2 = this.f104053c.f104030a;
            this.f104052b = b0Var;
            this.f104051a = 1;
            obj = aVar2.c(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            String strM = am.j.m("GET My Fitness Pal Status -> failed with error=[", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c, "]");
            com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar3.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ThirdPartyDelegateImpl", strM);
        }
        return Unit.INSTANCE;
    }
}
