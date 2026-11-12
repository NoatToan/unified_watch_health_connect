package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSyncNavKt$syncGraph$1$1$1$1", f = "DeviceSyncNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qb0.b f26226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26227b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(qb0.b bVar, lc.m0 m0Var, t13.d<? super g2> dVar) {
        super(2, dVar);
        this.f26226a = bVar;
        this.f26227b = m0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g2(this.f26226a, this.f26227b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        int i14 = qb0.b.f143957q;
        qb0.b bVar = this.f26226a;
        bVar.getClass();
        ge1.b.T(androidx.lifecycle.v1.a(bVar), null, null, new qb0.e(bVar, false, null), 3);
        k2.e eVar = k2.e.INSTANCE;
        this.f26227b.h(new d2(0), eVar);
        return Unit.INSTANCE;
    }
}
