package z10;

import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.ConsentAppDelegateImpl$disableLivetrackAutoStart$2$1$1$1", f = "ConsentAppDelegateImpl.kt", l = {173}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wd2.m1 f201024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t13.d<Boolean> f201025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(wd2.m1 m1Var, t13.d<? super Boolean> dVar, t13.d<? super h0> dVar2) {
        super(2, dVar2);
        this.f201024b = m1Var;
        this.f201025c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f201024b, this.f201025c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201023a;
        wd2.m1 m1Var = this.f201024b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f201023a = 1;
            if (m1Var.a(false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        GarminConnectMobileApp.f28685g.getClass();
        m1Var.d(GarminConnectMobileApp.a.a());
        int i15 = o13.q.f128596b;
        this.f201025c.resumeWith(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
