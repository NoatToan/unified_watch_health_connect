package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryNavKt$deviceDiscoveryGraph$1$1$1$1", f = "DeviceDiscoveryNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f26549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.x3<Boolean> f26551c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(e23.a<Unit> aVar, lc.m0 m0Var, p3.x3<Boolean> x3Var, t13.d<? super z0> dVar) {
        super(2, dVar);
        this.f26549a = aVar;
        this.f26550b = m0Var;
        this.f26551c = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z0(this.f26549a, this.f26550b, this.f26551c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p3.x3<Boolean> x3Var = this.f26551c;
        if (p005kotlin.jvm.internal.s.g(x3Var.getF182175a(), Boolean.TRUE)) {
            this.f26549a.invoke();
        } else if (p005kotlin.jvm.internal.s.g(x3Var.getF182175a(), Boolean.FALSE)) {
            b1.c cVar = b1.c.INSTANCE;
            this.f26550b.h(new k(16), cVar);
        }
        return Unit.INSTANCE;
    }
}
