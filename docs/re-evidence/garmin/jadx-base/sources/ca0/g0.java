package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceCustomizationNavKt$deviceCustomizationGraph$1$5$1$1", f = "DeviceCustomizationNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ga0.a f26223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.x3<Boolean> f26224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(lc.m0 m0Var, ga0.a aVar, p3.x3<Boolean> x3Var, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f26222a = m0Var;
        this.f26223b = aVar;
        this.f26224c = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g0(this.f26222a, this.f26223b, this.f26224c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f26224c.getF182175a().booleanValue()) {
            i0 i0VarZ4 = this.f26223b.z4(null);
            this.f26222a.h(new k(15), i0VarZ4);
        }
        return Unit.INSTANCE;
    }
}
